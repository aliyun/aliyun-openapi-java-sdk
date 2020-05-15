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

package com.aliyuncs.ocr.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocr.model.v20191230.RecognizeTakeoutOrderResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeTakeoutOrderResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeTakeoutOrderResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeTakeoutOrderResponseUnmarshaller {

	public static RecognizeTakeoutOrderResponse unmarshall(RecognizeTakeoutOrderResponse recognizeTakeoutOrderResponse, UnmarshallerContext _ctx) {
		
		recognizeTakeoutOrderResponse.setRequestId(_ctx.stringValue("RecognizeTakeoutOrderResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeTakeoutOrderResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setScore(_ctx.floatValue("RecognizeTakeoutOrderResponse.Data.Elements["+ i +"].Score"));
			element.setName(_ctx.stringValue("RecognizeTakeoutOrderResponse.Data.Elements["+ i +"].Name"));
			element.setValue(_ctx.stringValue("RecognizeTakeoutOrderResponse.Data.Elements["+ i +"].Value"));

			List<Integer> boxes = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeTakeoutOrderResponse.Data.Elements["+ i +"].Boxes.Length"); j++) {
				boxes.add(_ctx.integerValue("RecognizeTakeoutOrderResponse.Data.Elements["+ i +"].Boxes["+ j +"]"));
			}
			element.setBoxes(boxes);

			elements.add(element);
		}
		data.setElements(elements);
		recognizeTakeoutOrderResponse.setData(data);
	 
	 	return recognizeTakeoutOrderResponse;
	}
}