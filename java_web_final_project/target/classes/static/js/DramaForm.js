const chineseDramaController = new ChineseDramaController();

const newDramaForm = document.getElementById('newDramaForm');

newDramaForm.addEventListener('submit', (event) => {
    event.preventDefault();

    const dramaName = document.getElementById('dramaName').value;
    const directorName = document.getElementById('directorName').value;
    const actorName = document.getElementById('actorName').value;
    const actressName = document.getElementById('ActressName').value;
    const imageUrl = document.getElementById('imageUrl').value;
    const year= document.getElementById('year').value;

    chineseDramaController.addChineseDrama(dramaName, directorName, actorName, actressName, imageUrl, year);

    dramaName.value = '';
    directorName.value = '';
    actorName.value = '';
    actressName.value = '';
    imageUrl.value = '';
    year.value = '';

})