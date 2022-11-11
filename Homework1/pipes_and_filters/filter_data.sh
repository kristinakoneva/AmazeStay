#!/bin/bash

echo $(jq '{type: .type, features: [ .features[]| select( .properties.name != null) ] }' ./hotel_point.geojson) > ./hotels_filtered.geojson

echo $(jq '{type: .type, features: [ .features[]| select( .properties.website != null) ] }' ./hotels_filtered.geojson) > ./hotels_filtered.geojson

echo $(jq '{type: .type, features: [ .features[]| select( .properties.phone != null) ] }' ./hotels_filtered.geojson) > ./hotels_filtered.geojson

