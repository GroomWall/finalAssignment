let counter = document.getElementsByTagName("label");
function decrease(){
	counter[0].innerText = counter[0].innerText - 1;
}
function increase(){
	counter[0].innerText = parseInt(counter[0].innerText,10) + 1;
}
console.log(counter);
