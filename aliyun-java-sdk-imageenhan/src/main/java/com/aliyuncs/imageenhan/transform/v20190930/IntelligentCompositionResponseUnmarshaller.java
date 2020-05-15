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

package com.aliyuncs.imageenhan.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageenhan.model.v20190930.IntelligentCompositionResponse;
import com.aliyuncs.imageenhan.model.v20190930.IntelligentCompositionResponse.Data;
import com.aliyuncs.imageenhan.model.v20190930.IntelligentCompositionResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class IntelligentCompositionResponseUnmarshaller {

	public static IntelligentCompositionResponse unmarshall(IntelligentCompositionResponse intelligentCompositionResponse, UnmarshallerContext _ctx) {
		
		intelligentCompositionResponse.setRequestId(_ctx.stringValue("IntelligentCompositionResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("IntelligentCompositionResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setMinX(_ctx.integerValue("IntelligentCompositionResponse.Data.Elements["+ i +"].MinX"));
			element.setMinY(_ctx.integerValue("IntelligentCompositionResponse.Data.Elements["+ i +"].MinY"));
			element.setMaxX(_ctx.integerValue("IntelligentCompositionResponse.Data.Elements["+ i +"].MaxX"));
			element.setMaxY(_ctx.integerValue("IntelligentCompositionResponse.Data.Elements["+ i +"].MaxY"));
			element.setScore(_ctx.floatValue("IntelligentCompositionResponse.Data.Elements["+ i +"].Score"));

			elements.add(element);
		}
		data.setElements(elements);
		intelligentCompositionResponse.setData(data);
	 
	 	return intelligentCompositionResponse;
	}
}