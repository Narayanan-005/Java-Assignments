
function inputField(source, heading, detail,flag){
    let icon = document.createElement("img");
    icon.setAttribute("src",source);
    icon.setAttribute("class","icons");

    let iconDiv = document.createElement("div");
    iconDiv.setAttribute("class","c-icon");
    iconDiv.appendChild(icon);

    let detailsDiv = document.createElement("div");
    detailsDiv.setAttribute("class","details");

    let parag = document.createElement("p");
    parag.innerText=heading;
    detailsDiv.appendChild(parag);

    if(flag){
        let text = document.createElement("p");
        text.setAttribute("class","text");
        text.innerText=detail;
        detailsDiv.appendChild(text);
    }

    let input = document.createElement("div");
    input.setAttribute("class","input");
    input.append(iconDiv,detailsDiv);

    return input;
}

let email = inputField("https://img.icons8.com/?size=100&id=2848&format=png&color=000000","Email","james012@gmail.com",true);
let mobile = inputField("https://img.icons8.com/?size=100&id=JiB2z9ULPxXW&format=png&color=000000","Mobile","1234567891",true);
let twitter = inputField("https://img.icons8.com/?size=100&id=PJhfS4EBMBY8&format=png&color=000000","Twitter","@james012",true);
let reference = inputField("https://img.icons8.com/?size=100&id=53419&format=png&color=000000","Reference","www.james.com",true);
let facebook = inputField("https://img.icons8.com/?size=100&id=60440&format=png&color=000000","@Facebook",null,false);

let section2 = document.createElement("div");
section2.classList.add("section2");
section2.append(email,mobile,twitter,reference,facebook);

// section1

let logo = document.createElement("img");
logo.setAttribute("src","https://cdn.pixabay.com/photo/2024/03/31/06/16/bird-8666099_1280.jpg");
let head3 = document.createElement("h3");
head3.innerText="James Mortin";
let head4 = document.createElement("h4");
head4.innerText="Senion Graphic Designer";

let span1 = document.createElement("span");
span1.innerText="1000 followers";
let span2 = document.createElement("span");
span2.innerText="1000 following";
let follow = document.createElement("div");
follow.classList.add("follow");
follow.append(span1,span2);

let section1 = document.createElement("div");
section1.classList.add("section1");
section1.append(logo,head3,head4,follow);

let container = document.createElement("div");
container.classList.add("container");
container.append(section1,section2);



document.body.appendChild(container);

