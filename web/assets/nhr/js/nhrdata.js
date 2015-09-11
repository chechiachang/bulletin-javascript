/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(function () {
    setInterval(getNhrData, 1000);
});

function getNhrData() {

    //cause screen flash, which is bad
    //$('div#floor1').empty();

    $('.nhr').remove();

    $.get("NhrDataJsonServlet", {cmd: "getdata"}, function (jsonResponse) {
        var data = $.parseJSON(jsonResponse);
        $.each(data, function (k, v) {
            var icon = "fa-cogs";
            switch (v.clusterId) {
                case "0405":    //0405 Zigbee Cluster Library relative humid measurement Cluster ID
                    break;
                case "0402":    //0405 Zigbee Cluster Library temperature measurement Cluster ID
                    break;
                case "0500":    //0405 Zigbee Cluster Library temperature measurement Cluster ID 
                    break;
                case "0500":    //0405 Zigbee Cluster Library temperature measurement Cluster ID
                    break;
                case "0500":    //0405 Zigbee Cluster Library temperature measurement Cluster ID Siren
                    break;
            }
            
            if (v.macClusterId.length > 0) {
                $('div#'+v.macClusterId).remove();
            }
            var html = '<div id=' + v.macClusterId +
                    '" shortmac="' + v.shortMac +
                    '" clusterid= "' + v.clusterId +
                    '" data="' + v.data + '">"' +
                    '"<div><i class="fa fa-fw ' + icon + '"></i></div>';
            html += '</br>' + v.data;
            html += '</div>';
            //append to div
            var position = v.position.split(",");
            $(html).addClass('ico-mode').addClass('nhr').css({position: "relative", left: position[0] + 'px', top: position[1] + 'px'}).appendTo('div#floor1');

        });
    });
}

function getNhrPosition() {
    //unsupported
}