const form = document.getElementById('form');
const email = document.getElementById('email');
const password = document.getElementById('pwd');

const emailOutput = document.getElementById('email_output');
const pwdOutput = document.getElementById('pwd_output');

const button = document.getElementById('button');
const counter = document.getElementById('counter');

let clicks = 0;

form.onsubmit = (event) => {
    event.preventDefault();

    emailOutput.innerText = 'Email: ' + email.value;
    pwdOutput.innerText = 'Password: ' + password.value;
}

button.onclick = () => {
    clicks++;
    counter.innerHTML = `Number of clicks: ${clicks}`;
}

