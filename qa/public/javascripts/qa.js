function goto(url) {
top.location = url;
}

$(function () {

	
	loadGraph();

});

function loadGraph() {
	
	jQuery.getJSON( "/home/juerg/workspaces/ese2010-team4/qa/app/views/Users/myProfile.json" , displayGraph);
}


function displayGraph(data, status) {
	var points = [];
		
	for(i in data) {
		
		points.push([data[i].time, data[i].value]);
	}

    $.plot($("#graphcanvas"), [
        {
            data: points,
            lines: { show: true, steps: true },
            points: { show: false }
        }
    ], {
     xaxis: {
    		 mode: "time"
     }
    } );
 }



