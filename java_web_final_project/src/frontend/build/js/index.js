
 async function getChineseDrama(){
    const dramaName = document.getElementById("dramaName");
    const director = document.getElementById("director");
    const actor = document.getElementById("actor");
    const actress = document.getElementById("actress");
    const imageUrl = document.getElementById("imageUrl");
    const year = document.getElementById("year");
    try {
        const response = await fetch('http://localhost:8080/api/chineseDrama');
        const responseJSO = await response.json();
        imageUrl.src = responseJSO[0].imageUrl;
        dramaName.innerHTML = responseJSO[0].id;
        director.innerHTML = responseJSO[0].directorName;
        actor.innerHTML = responseJSO[0].actorName;
        actress.innerHTML = responseJSO[0].actressName;
        year.innerHTML = responseJSO[0].year;

    } catch (e) {
        console.log(e);
    }
}

getChineseDrama();

