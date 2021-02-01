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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.DetectPedestrianIntrusionResponse;
import com.aliyuncs.facebody.model.v20191230.DetectPedestrianIntrusionResponse.Data;
import com.aliyuncs.facebody.model.v20191230.DetectPedestrianIntrusionResponse.Data.ElementsItem;
import com.aliyuncs.facebody.model.v20191230.DetectPedestrianIntrusionResponse.Data.ElementsItem.Box;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectPedestrianIntrusionResponseUnmarshaller {

	public static DetectPedestrianIntrusionResponse unmarshall(DetectPedestrianIntrusionResponse detectPedestrianIntrusionResponse, UnmarshallerContext _ctx) {
		
		detectPedestrianIntrusionResponse.setRequestId(_ctx.stringValue("DetectPedestrianIntrusionResponse.RequestId"));
		detectPedestrianIntrusionResponse.setMessage(_ctx.stringValue("DetectPedestrianIntrusionResponse.Message"));
		detectPedestrianIntrusionResponse.setCode(_ctx.stringValue("DetectPedestrianIntrusionResponse.Code"));

		Data data = new Data();
		data.setImageHeight(_ctx.longValue("DetectPedestrianIntrusionResponse.Data.ImageHeight"));
		data.setImageWidth(_ctx.longValue("DetectPedestrianIntrusionResponse.Data.ImageWidth"));

		List<ElementsItem> elements = new ArrayList<ElementsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectPedestrianIntrusionResponse.Data.Elements.Length"); i++) {
			ElementsItem elementsItem = new ElementsItem();
			elementsItem.setBoxId(_ctx.longValue("DetectPedestrianIntrusionResponse.Data.Elements["+ i +"].BoxId"));
			elementsItem.setType(_ctx.stringValue("DetectPedestrianIntrusionResponse.Data.Elements["+ i +"].Type"));
			elementsItem.setScore(_ctx.longValue("DetectPedestrianIntrusionResponse.Data.Elements["+ i +"].Score"));
			elementsItem.setIsIntrude(_ctx.booleanValue("DetectPedestrianIntrusionResponse.Data.Elements["+ i +"].IsIntrude"));

			Box box = new Box();
			box.setLeft(_ctx.longValue("DetectPedestrianIntrusionResponse.Data.Elements["+ i +"].Box.Left"));
			box.setTop(_ctx.longValue("DetectPedestrianIntrusionResponse.Data.Elements["+ i +"].Box.Top"));
			box.setRight(_ctx.longValue("DetectPedestrianIntrusionResponse.Data.Elements["+ i +"].Box.Right"));
			box.setBottom(_ctx.longValue("DetectPedestrianIntrusionResponse.Data.Elements["+ i +"].Box.Bottom"));
			elementsItem.setBox(box);

			elements.add(elementsItem);
		}
		data.setElements(elements);
		detectPedestrianIntrusionResponse.setData(data);
	 
	 	return detectPedestrianIntrusionResponse;
	}
}