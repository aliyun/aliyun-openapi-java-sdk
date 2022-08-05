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

import com.aliyuncs.viapi_regen.model.v20211119.CustomizeInstanceSegmentImageResponse;
import com.aliyuncs.viapi_regen.model.v20211119.CustomizeInstanceSegmentImageResponse.Data;
import com.aliyuncs.viapi_regen.model.v20211119.CustomizeInstanceSegmentImageResponse.Data.ElementsItem;
import com.aliyuncs.viapi_regen.model.v20211119.CustomizeInstanceSegmentImageResponse.Data.ElementsItem.Boxes;
import com.aliyuncs.viapi_regen.model.v20211119.CustomizeInstanceSegmentImageResponse.Data.ElementsItem.ContoursItem;
import com.aliyuncs.viapi_regen.model.v20211119.CustomizeInstanceSegmentImageResponse.Data.ElementsItem.Mask;
import com.aliyuncs.transform.UnmarshallerContext;


public class CustomizeInstanceSegmentImageResponseUnmarshaller {

	public static CustomizeInstanceSegmentImageResponse unmarshall(CustomizeInstanceSegmentImageResponse customizeInstanceSegmentImageResponse, UnmarshallerContext _ctx) {
		
		customizeInstanceSegmentImageResponse.setRequestId(_ctx.stringValue("CustomizeInstanceSegmentImageResponse.RequestId"));
		customizeInstanceSegmentImageResponse.setCode(_ctx.stringValue("CustomizeInstanceSegmentImageResponse.Code"));
		customizeInstanceSegmentImageResponse.setMessage(_ctx.stringValue("CustomizeInstanceSegmentImageResponse.Message"));

		Data data = new Data();

		List<ElementsItem> elements = new ArrayList<ElementsItem>();
		for (int i = 0; i < _ctx.lengthValue("CustomizeInstanceSegmentImageResponse.Data.Elements.Length"); i++) {
			ElementsItem elementsItem = new ElementsItem();
			elementsItem.setScore(_ctx.floatValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Score"));
			elementsItem.setCategory(_ctx.stringValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Category"));

			Boxes boxes = new Boxes();
			boxes.setX(_ctx.integerValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Boxes.X"));
			boxes.setY(_ctx.integerValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Boxes.Y"));
			boxes.setWidth(_ctx.integerValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Boxes.Width"));
			boxes.setHeight(_ctx.integerValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Boxes.Height"));
			elementsItem.setBoxes(boxes);

			Mask mask = new Mask();
			mask.setCounts(_ctx.stringValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Mask.Counts"));

			List<Integer> sizes = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Mask.Sizes.Length"); j++) {
				sizes.add(_ctx.integerValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Mask.Sizes["+ j +"]"));
			}
			mask.setSizes(sizes);
			elementsItem.setMask(mask);

			List<ContoursItem> contours = new ArrayList<ContoursItem>();
			for (int j = 0; j < _ctx.lengthValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Contours.Length"); j++) {
				ContoursItem contoursItem = new ContoursItem();
				contoursItem.setX(_ctx.integerValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Contours["+ j +"].X"));
				contoursItem.setY(_ctx.integerValue("CustomizeInstanceSegmentImageResponse.Data.Elements["+ i +"].Contours["+ j +"].Y"));

				contours.add(contoursItem);
			}
			elementsItem.setContours(contours);

			elements.add(elementsItem);
		}
		data.setElements(elements);
		customizeInstanceSegmentImageResponse.setData(data);
	 
	 	return customizeInstanceSegmentImageResponse;
	}
}