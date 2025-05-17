const canvas = document.getElementById('canvas');
const ctx = canvas.getContext('2d');

canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

ctx.fillStyle = "rgb(56, 163, 46)";
ctx.fillRect(50, 50, 100, 100);

ctx.strokeStyle = "black"
ctx.strokeRect(200, 50, 100, 100);
