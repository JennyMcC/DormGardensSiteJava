/**
 * 
 */
var initPage = function(jsonResponseUrl) {
	
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var allPlants = JSON.parse(xhttp.responseText);
			var galleryContent = [];
			var price;
			var picture;
			
			for (var i = 0; i < allPlants.length; i++) {
				plant = allPlants[i];
				
				galleryContent[i] = setGallery(plant);
				
				
				
				
			}
			
//			var gallery;
//			
//			function() {
//				gallery = new Gallery({
//					content : galleryContent[i]
//				});
//			}
			
			
			function setGallery(plant) {
				var tagNames = "";
				for (var j = 0; j < plant.tag.length; j++) {
					tagNames += '<li >' + plant.tag[j].displayName + '</li>';
				}
				
				var stringContent = //'.pic-container' + plant.picture + '.price' + plant.price
				
				document.querySelector('.pic-container')
				
				return stringContent;
			}
			
			
			
			
		}
	}
	
	console.log(jsonResponseUrl);
	xhttp.open("GET", jsonResponseUrl, true);
	xhttp.send();
}



$(document).ready(function() {
	
	$('button[name="generatePlantsByFilter"]')
	.on('click', function() {
		var selectedTags = [];
		$(".filter:checked").each(
				function() {
					selectedTags.push(this.name);
				});
		
		initPage("http://localhost:8080/DormGardens/byFilter/" + selectedTags);
	}
}