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

import com.aliyuncs.objectdet.model.v20191230.DetectVehicleIllegalParkingResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleIllegalParkingResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleIllegalParkingResponse.Data.Element;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleIllegalParkingResponse.Data.Element.BoxesItem;
import com.aliyuncs.objectdet.model.v20191230.DetectVehicleIllegalParkingResponse.Data.RegionIntersect;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectVehicleIllegalParkingResponseUnmarshaller {

	public static DetectVehicleIllegalParkingResponse unmarshall(DetectVehicleIllegalParkingResponse detectVehicleIllegalParkingResponse, UnmarshallerContext _ctx) {
		
		detectVehicleIllegalParkingResponse.setRequestId(_ctx.stringValue("DetectVehicleIllegalParkingResponse.RequestId"));
		detectVehicleIllegalParkingResponse.setMessage(_ctx.stringValue("DetectVehicleIllegalParkingResponse.Message"));
		detectVehicleIllegalParkingResponse.setCode(_ctx.stringValue("DetectVehicleIllegalParkingResponse.Code"));

		Data data = new Data();

		List<RegionIntersect> regionIntersects = new ArrayList<RegionIntersect>();
		for (int i = 0; i < _ctx.lengthValue("DetectVehicleIllegalParkingResponse.Data.RegionIntersects.Length"); i++) {
			RegionIntersect regionIntersect = new RegionIntersect();

			List<Long> ids = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DetectVehicleIllegalParkingResponse.Data.RegionIntersects["+ i +"].Ids.Length"); j++) {
				ids.add(_ctx.longValue("DetectVehicleIllegalParkingResponse.Data.RegionIntersects["+ i +"].Ids["+ j +"]"));
			}
			regionIntersect.setIds(ids);

			regionIntersects.add(regionIntersect);
		}
		data.setRegionIntersects(regionIntersects);

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectVehicleIllegalParkingResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setTypeName(_ctx.stringValue("DetectVehicleIllegalParkingResponse.Data.Elements["+ i +"].TypeName"));
			element.setScore(_ctx.floatValue("DetectVehicleIllegalParkingResponse.Data.Elements["+ i +"].Score"));

			List<BoxesItem> boxes = new ArrayList<BoxesItem>();
			for (int j = 0; j < _ctx.lengthValue("DetectVehicleIllegalParkingResponse.Data.Elements["+ i +"].Boxes.Length"); j++) {
				BoxesItem boxesItem = new BoxesItem();
				boxesItem.setLeft(_ctx.longValue("DetectVehicleIllegalParkingResponse.Data.Elements["+ i +"].Boxes["+ j +"].Left"));
				boxesItem.setTop(_ctx.longValue("DetectVehicleIllegalParkingResponse.Data.Elements["+ i +"].Boxes["+ j +"].Top"));
				boxesItem.setRight(_ctx.longValue("DetectVehicleIllegalParkingResponse.Data.Elements["+ i +"].Boxes["+ j +"].Right"));
				boxesItem.setBottom(_ctx.longValue("DetectVehicleIllegalParkingResponse.Data.Elements["+ i +"].Boxes["+ j +"].Bottom"));

				boxes.add(boxesItem);
			}
			element.setBoxes(boxes);

			elements.add(element);
		}
		data.setElements(elements);
		detectVehicleIllegalParkingResponse.setData(data);
	 
	 	return detectVehicleIllegalParkingResponse;
	}
}