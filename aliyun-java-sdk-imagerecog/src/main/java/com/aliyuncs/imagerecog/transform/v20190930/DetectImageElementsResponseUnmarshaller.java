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

package com.aliyuncs.imagerecog.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imagerecog.model.v20190930.DetectImageElementsResponse;
import com.aliyuncs.imagerecog.model.v20190930.DetectImageElementsResponse.Data;
import com.aliyuncs.imagerecog.model.v20190930.DetectImageElementsResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageElementsResponseUnmarshaller {

	public static DetectImageElementsResponse unmarshall(DetectImageElementsResponse detectImageElementsResponse, UnmarshallerContext _ctx) {
		
		detectImageElementsResponse.setRequestId(_ctx.stringValue("DetectImageElementsResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageElementsResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setType(_ctx.stringValue("DetectImageElementsResponse.Data.Elements["+ i +"].Type"));
			element.setX(_ctx.integerValue("DetectImageElementsResponse.Data.Elements["+ i +"].X"));
			element.setY(_ctx.integerValue("DetectImageElementsResponse.Data.Elements["+ i +"].Y"));
			element.setWidth(_ctx.integerValue("DetectImageElementsResponse.Data.Elements["+ i +"].Width"));
			element.setHeight(_ctx.integerValue("DetectImageElementsResponse.Data.Elements["+ i +"].Height"));
			element.setScore(_ctx.floatValue("DetectImageElementsResponse.Data.Elements["+ i +"].Score"));

			elements.add(element);
		}
		data.setElements(elements);
		detectImageElementsResponse.setData(data);
	 
	 	return detectImageElementsResponse;
	}
}