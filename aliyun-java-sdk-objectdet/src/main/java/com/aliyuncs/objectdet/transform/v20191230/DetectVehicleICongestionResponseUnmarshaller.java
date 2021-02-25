/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.objectdet.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.objectdet.model.v20191230.DetectVehicleICongestionResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleICongestionResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleICongestionResponse.Data.Element;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleICongestionResponse.Data.Element.BoxesItem;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleICongestionResponse.Data.RegionIntersectFeaturesItem;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleICongestionResponse.Data.RegionIntersectMatchedItem;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleICongestionResponse.Data.RegionIntersectsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectVehicleICongestionResponseUnmarshaller {

	public static DetectVehicleICongestionResponse unmarshall(DetectVehicleICongestionResponse detectVehicleICongestionResponse, UnmarshallerContext _ctx) {
		
		detectVehicleICongestionResponse.setRequestId(_ctx.stringValue("DetectVehicleICongestionResponse.RequestId"));
		detectVehicleICongestionResponse.setMessage(_ctx.stringValue("DetectVehicleICongestionResponse.Message"));
		detectVehicleICongestionResponse.setCode(_ctx.stringValue("DetectVehicleICongestionResponse.Code"));

		Data data = new Data();

		List<RegionIntersectFeaturesItem> regionIntersectFeatures = new ArrayList<RegionIntersectFeaturesItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectVehicleICongestionResponse.Data.RegionIntersectFeatures.Length"); i++) {
			RegionIntersectFeaturesItem regionIntersectFeaturesItem = new RegionIntersectFeaturesItem();

			List<String> features = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DetectVehicleICongestionResponse.Data.RegionIntersectFeatures["+ i +"].Features.Length"); j++) {
				features.add(_ctx.stringValue("DetectVehicleICongestionResponse.Data.RegionIntersectFeatures["+ i +"].Features["+ j +"]"));
			}
			regionIntersectFeaturesItem.setFeatures(features);

			regionIntersectFeatures.add(regionIntersectFeaturesItem);
		}
		data.setRegionIntersectFeatures(regionIntersectFeatures);

		List<RegionIntersectsItem> regionIntersects = new ArrayList<RegionIntersectsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectVehicleICongestionResponse.Data.RegionIntersects.Length"); i++) {
			RegionIntersectsItem regionIntersectsItem = new RegionIntersectsItem();

			List<Long> ids = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DetectVehicleICongestionResponse.Data.RegionIntersects["+ i +"].Ids.Length"); j++) {
				ids.add(_ctx.longValue("DetectVehicleICongestionResponse.Data.RegionIntersects["+ i +"].Ids["+ j +"]"));
			}
			regionIntersectsItem.setIds(ids);

			regionIntersects.add(regionIntersectsItem);
		}
		data.setRegionIntersects(regionIntersects);

		List<RegionIntersectMatchedItem> regionIntersectMatched = new ArrayList<RegionIntersectMatchedItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectVehicleICongestionResponse.Data.RegionIntersectMatched.Length"); i++) {
			RegionIntersectMatchedItem regionIntersectMatchedItem = new RegionIntersectMatchedItem();

			List<Long> ids1 = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DetectVehicleICongestionResponse.Data.RegionIntersectMatched["+ i +"].Ids.Length"); j++) {
				ids1.add(_ctx.longValue("DetectVehicleICongestionResponse.Data.RegionIntersectMatched["+ i +"].Ids["+ j +"]"));
			}
			regionIntersectMatchedItem.setIds1(ids1);

			regionIntersectMatched.add(regionIntersectMatchedItem);
		}
		data.setRegionIntersectMatched(regionIntersectMatched);

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectVehicleICongestionResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setTypeName(_ctx.stringValue("DetectVehicleICongestionResponse.Data.Elements["+ i +"].TypeName"));
			element.setScore(_ctx.floatValue("DetectVehicleICongestionResponse.Data.Elements["+ i +"].Score"));

			List<BoxesItem> boxes = new ArrayList<BoxesItem>();
			for (int j = 0; j < _ctx.lengthValue("DetectVehicleICongestionResponse.Data.Elements["+ i +"].Boxes.Length"); j++) {
				BoxesItem boxesItem = new BoxesItem();
				boxesItem.setLeft(_ctx.longValue("DetectVehicleICongestionResponse.Data.Elements["+ i +"].Boxes["+ j +"].Left"));
				boxesItem.setTop(_ctx.longValue("DetectVehicleICongestionResponse.Data.Elements["+ i +"].Boxes["+ j +"].Top"));
				boxesItem.setRight(_ctx.longValue("DetectVehicleICongestionResponse.Data.Elements["+ i +"].Boxes["+ j +"].Right"));
				boxesItem.setBottom(_ctx.longValue("DetectVehicleICongestionResponse.Data.Elements["+ i +"].Boxes["+ j +"].Bottom"));

				boxes.add(boxesItem);
			}
			element.setBoxes(boxes);

			elements.add(element);
		}
		data.setElements(elements);
		detectVehicleICongestionResponse.setData(data);
	 
	 	return detectVehicleICongestionResponse;
	}
}