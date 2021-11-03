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

import com.aliyuncs.objectdet.model.v20191230.DetectKitchenAnimalsResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectKitchenAnimalsResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectKitchenAnimalsResponse.Data.ElementsItem;
import com.aliyuncs.objectdet.model.v20191230.DetectKitchenAnimalsResponse.Data.ElementsItem.Rectangles;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectKitchenAnimalsResponseUnmarshaller {

	public static DetectKitchenAnimalsResponse unmarshall(DetectKitchenAnimalsResponse detectKitchenAnimalsResponse, UnmarshallerContext _ctx) {
		
		detectKitchenAnimalsResponse.setRequestId(_ctx.stringValue("DetectKitchenAnimalsResponse.RequestId"));
		detectKitchenAnimalsResponse.setCode(_ctx.stringValue("DetectKitchenAnimalsResponse.Code"));
		detectKitchenAnimalsResponse.setMessage(_ctx.stringValue("DetectKitchenAnimalsResponse.Message"));

		Data data = new Data();

		List<ElementsItem> elements = new ArrayList<ElementsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectKitchenAnimalsResponse.Data.Elements.Length"); i++) {
			ElementsItem elementsItem = new ElementsItem();
			elementsItem.setType(_ctx.stringValue("DetectKitchenAnimalsResponse.Data.Elements["+ i +"].Type"));
			elementsItem.setScore(_ctx.floatValue("DetectKitchenAnimalsResponse.Data.Elements["+ i +"].Score"));

			Rectangles rectangles = new Rectangles();
			rectangles.setTop(_ctx.longValue("DetectKitchenAnimalsResponse.Data.Elements["+ i +"].Rectangles.Top"));
			rectangles.setLeft(_ctx.longValue("DetectKitchenAnimalsResponse.Data.Elements["+ i +"].Rectangles.Left"));
			rectangles.setHeight(_ctx.longValue("DetectKitchenAnimalsResponse.Data.Elements["+ i +"].Rectangles.Height"));
			rectangles.setWidth(_ctx.longValue("DetectKitchenAnimalsResponse.Data.Elements["+ i +"].Rectangles.Width"));
			elementsItem.setRectangles(rectangles);

			elements.add(elementsItem);
		}
		data.setElements(elements);
		detectKitchenAnimalsResponse.setData(data);
	 
	 	return detectKitchenAnimalsResponse;
	}
}