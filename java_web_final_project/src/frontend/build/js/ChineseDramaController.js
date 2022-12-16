class ChineseDramaController {
    dramas = [];
    Constructor() {

    }

    addChineseDrama(dramaName, directorName, actorName, actressName, imageUrl, year) {
        const drama = {
            dramaName: dramaName,
            directorName: directorName,
            actorName: actorName,
            actressName: actressName,
            year: year,
            imageUrl: imageUrl,
        };

        this.dramas.push(drama);
        save(dramaName, directorName, actorName, actressName, imageUrl, year);
    }

    
}

async function getChineseDrama()  {
        const dramaName = document.getElementById("dramaName");
        const director = document.getElementById("director");
        const actor = document.getElementById("actor");
        const actress = document.getElementById("actress");
        const imageUrl = document.getElementById("imageUrl");
        const year = document.getElementById("year");
        const dramaID = document.getElementById("dramaID");
        try {
            const response = await fetch('http://localhost:8080/api/chineseDrama/all');
            const responseJSO = await response.json();
            imageUrl.src = responseJSO[0].imageUrl;
            dramaID.innerHTML = responseJSO[0].id;
            dramaName.innerHTML = responseJSO[0].dramaName;
            director.innerHTML = responseJSO[0].directorName;
            actor.innerHTML = responseJSO[0].actorName;
            actress.innerHTML = responseJSO[0].actressName;
            year.innerHTML = responseJSO[0].year;

        } catch (e) {
            console.log(e);
        }
    }

getChineseDrama();

async function save(dramaName, directorName, actorName, actressName, imageUrl, year) {
    try{
      const data = { dramaName, directorName, actorName, actressName, imageUrl, year};
  
      const response = await fetch('http://localhost:8080/api/chineseDrama', {
        method: "POST", // or 'PUT'
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
      });
      const responseJSO = await response.json();
    } catch(e)
   {
    console.log(e);
   }    
}

