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

package com.aliyuncs.viapi_regen.transform.v20211119;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.viapi_regen.model.v20211119.CustomizeDetectImageResponse;
import com.aliyuncs.viapi_regen.model.v20211119.CustomizeDetectImageResponse.Data;
import com.aliyuncs.viapi_regen.model.v20211119.CustomizeDetectImageResponse.Data.ElementsItem;
import com.aliyuncs.viapi_regen.model.v20211119.CustomizeDetectImageResponse.Data.ElementsItem.Boxes;
import com.aliyuncs.transform.UnmarshallerContext;


public class CustomizeDetectImageResponseUnmarshaller {

	public static CustomizeDetectImageResponse unmarshall(CustomizeDetectImageResponse customizeDetectImageResponse, UnmarshallerContext _ctx) {
		
		customizeDetectImageResponse.setRequestId(_ctx.stringValue("CustomizeDetectImageResponse.RequestId"));
		customizeDetectImageResponse.setCode(_ctx.stringValue("CustomizeDetectImageResponse.Code"));
		customizeDetectImageResponse.setMessage(_ctx.stringValue("CustomizeDetectImageResponse.Message"));

		Data data = new Data();

		List<ElementsItem> elements = new ArrayList<ElementsItem>();
		for (int i = 0; i < _ctx.lengthValue("CustomizeDetectImageResponse.Data.Elements.Length"); i++) {
			ElementsItem elementsItem = new ElementsItem();
			elementsItem.setScore(_ctx.floatValue("CustomizeDetectImageResponse.Data.Elements["+ i +"].Score"));
			elementsItem.setCategory(_ctx.stringValue("CustomizeDetectImageResponse.Data.Elements["+ i +"].Category"));

			Boxes boxes = new Boxes();
			boxes.setX(_ctx.floatValue("CustomizeDetectImageResponse.Data.Elements["+ i +"].Boxes.X"));
			boxes.setY(_ctx.floatValue("CustomizeDetectImageResponse.Data.Elements["+ i +"].Boxes.Y"));
			boxes.setWidth(_ctx.floatValue("CustomizeDetectImageResponse.Data.Elements["+ i +"].Boxes.Width"));
			boxes.setHeight(_ctx.floatValue("CustomizeDetectImageResponse.Data.Elements["+ i +"].Boxes.Height"));
			elementsItem.setBoxes(boxes);

			elements.add(elementsItem);
		}
		data.setElements(elements);
		customizeDetectImageResponse.setData(data);
	 
	 	return customizeDetectImageResponse;
	}
}