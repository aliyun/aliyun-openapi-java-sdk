/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse;
import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse.Component;
import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse.Component.ComponentLayer;
import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse.Component.ImageLayerContent;
import com.aliyuncs.live.model.v20161101.DescribeCasterComponentsResponse.Component.TextLayerContent;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCasterComponentsResponseUnmarshaller {

	public static DescribeCasterComponentsResponse unmarshall(DescribeCasterComponentsResponse describeCasterComponentsResponse, UnmarshallerContext context) {
		
		describeCasterComponentsResponse.setRequestId(context.stringValue("DescribeCasterComponentsResponse.RequestId"));
		describeCasterComponentsResponse.setTotal(context.integerValue("DescribeCasterComponentsResponse.Total"));

		List<Component> components = new ArrayList<Component>();
		for (int i = 0; i < context.lengthValue("DescribeCasterComponentsResponse.Components.Length"); i++) {
			Component component = new Component();
			component.setComponentId(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentId"));
			component.setComponentName(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentName"));
			component.setLocationId(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].LocationId"));
			component.setComponentType(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentType"));
			component.setEffect(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].Effect"));

			ComponentLayer componentLayer = new ComponentLayer();
			componentLayer.setHeightNormalized(context.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.HeightNormalized"));
			componentLayer.setWidthNormalized(context.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.WidthNormalized"));
			componentLayer.setPositionRefer(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.PositionRefer"));

			List<String> positionNormalizeds = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.PositionNormalizeds.Length"); j++) {
				positionNormalizeds.add(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ComponentLayer.PositionNormalizeds["+ j +"]"));
			}
			componentLayer.setPositionNormalizeds(positionNormalizeds);
			component.setComponentLayer(componentLayer);

			TextLayerContent textLayerContent = new TextLayerContent();
			textLayerContent.setText(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.Text"));
			textLayerContent.setColor(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.Color"));
			textLayerContent.setFontName(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.FontName"));
			textLayerContent.setSizeNormalized(context.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.SizeNormalized"));
			textLayerContent.setBorderWidthNormalized(context.floatValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.BorderWidthNormalized"));
			textLayerContent.setBorderColor(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].TextLayerContent.BorderColor"));
			component.setTextLayerContent(textLayerContent);

			ImageLayerContent imageLayerContent = new ImageLayerContent();
			imageLayerContent.setMaterialId(context.stringValue("DescribeCasterComponentsResponse.Components["+ i +"].ImageLayerContent.MaterialId"));
			component.setImageLayerContent(imageLayerContent);

			components.add(component);
		}
		describeCasterComponentsResponse.setComponents(components);
	 
	 	return describeCasterComponentsResponse;
	}
}