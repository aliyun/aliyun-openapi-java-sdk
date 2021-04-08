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

import com.aliyuncs.objectdet.model.v20191230.DetectObjectResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectObjectResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectObjectResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectObjectResponseUnmarshaller {

	public static DetectObjectResponse unmarshall(DetectObjectResponse detectObjectResponse, UnmarshallerContext _ctx) {
		
		detectObjectResponse.setRequestId(_ctx.stringValue("DetectObjectResponse.RequestId"));

		Data data = new Data();
		data.setWidth(_ctx.integerValue("DetectObjectResponse.Data.Width"));
		data.setHeight(_ctx.integerValue("DetectObjectResponse.Data.Height"));

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectObjectResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setScore(_ctx.floatValue("DetectObjectResponse.Data.Elements["+ i +"].Score"));
			element.setType(_ctx.stringValue("DetectObjectResponse.Data.Elements["+ i +"].Type"));

			List<Integer> boxes = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DetectObjectResponse.Data.Elements["+ i +"].Boxes.Length"); j++) {
				boxes.add(_ctx.integerValue("DetectObjectResponse.Data.Elements["+ i +"].Boxes["+ j +"]"));
			}
			element.setBoxes(boxes);

			elements.add(element);
		}
		data.setElements(elements);
		detectObjectResponse.setData(data);
	 
	 	return detectObjectResponse;
	}
}