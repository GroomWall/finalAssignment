let counter = document.getElementsByTagName("label");
function decrease(){
	let text = counter[0].innerText;
	if(parseInt(text,10) <= 0){
	}else{
	counter[0].innerText = text - 1;
	}
}
function increase(){
	counter[0].innerText = parseInt(counter[0].innerText,10) + 1;
}
console.log(counter);
