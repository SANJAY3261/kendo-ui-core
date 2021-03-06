---
title: Update Map Shapes by ID
page_title: Update Map Shapes by ID | Kendo UI Map
description: "Learn how to update Kendo UI Map shapes by a specified ID."
slug: howto_updatemapshapesbyid_map
---

# Update Map Shapes by ID

The following example demonstrates how to update the Map shapes by a specified ID.

###### Example

```dojo
    <div id="map"></div>
    <script>
      function createMap() {
        $("#map").kendoMap({
          center: [30.2681, -97.7448],
          zoom: 3,
          layers: [{
            type: "shape",
            dataSource: {
              type: "geojson",
              transport: {
                read: "http://output.jsbin.com/zuguhajiye.js"
              }
            },
            style: {
              fill: {
                color: "white",
                opacity: 0.7
              }
            }
          }],
          shapeCreated: onShapeCreated,
          reset: onReset
        });
      }

      var shapesById = {};

      function onReset() {
        shapesById = {};
      }

      function onShapeCreated(e) {
        var id = e.shape.dataItem.id;
        shapesById[id] = shapesById[id] || [];        
        shapesById[id].push(e.shape);
      }

      setInterval(function() {
        var shapes = shapesById.USA;
        if (shapes) {
          for (var i = 0; i < shapes.length; i++) {
            var shape = shapes[i];
            if (shape.options.fill.color === "white") {
            	shape.fill("blue");
            } else {
              shape.fill("white");
            }
          }
        }
      }, 500);

      $(document).ready(createMap);
    </script>
```

## See Also

* [Map JavaScript API Reference](/api/javascript/dataviz/ui/map)
* [How to Customize Markers on Map]({% slug howto_customizemarkersonmap_map %})
* [How to Display Shape Tooltips]({% slug howto_displayshapetooltip_map %})
* [How to Link Marker to Location]({% slug howto_linkmarkertolocation_map %})
* [How to Render Custom Symbols for Bubble Layers]({% slug howto_rendercustomsymbols_forbubblelayers_map %})
* [How to Zoom on Double Click]({% slug howto_zoomondblclick_map %})

For more runnable examples on the Kendo UI Map, browse the [**How To** documentation folder]({% slug howto_addhspaetitles_map %}).
