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
				for (var j = 0; j < plant.tags.length; j++) {
					tagNames += '<li >' + plant.tags[j].displayName + '</li>';
				}
				
				var stringContent = '.pic-container' + plant.picture + '.price' + plant.price
				
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
		var selectedFilters = [];
		$(".filter:checked").each(
				function() {
					selectedFilters.push(this.name);
				});
		
		initPage("http://localhost:8080/DormGardens/byFilter/" + selectedFilters);
	}
}