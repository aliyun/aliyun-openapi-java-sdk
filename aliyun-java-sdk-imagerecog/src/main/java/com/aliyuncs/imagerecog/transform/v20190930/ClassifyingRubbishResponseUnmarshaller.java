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

import com.aliyuncs.imagerecog.model.v20190930.ClassifyingRubbishResponse;
import com.aliyuncs.imagerecog.model.v20190930.ClassifyingRubbishResponse.Data;
import com.aliyuncs.imagerecog.model.v20190930.ClassifyingRubbishResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class ClassifyingRubbishResponseUnmarshaller {

	public static ClassifyingRubbishResponse unmarshall(ClassifyingRubbishResponse classifyingRubbishResponse, UnmarshallerContext _ctx) {
		
		classifyingRubbishResponse.setRequestId(_ctx.stringValue("ClassifyingRubbishResponse.RequestId"));

		Data data = new Data();
		data.setSensitive(_ctx.booleanValue("ClassifyingRubbishResponse.Data.Sensitive"));

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("ClassifyingRubbishResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setCategory(_ctx.stringValue("ClassifyingRubbishResponse.Data.Elements["+ i +"].Category"));
			element.setCategoryScore(_ctx.floatValue("ClassifyingRubbishResponse.Data.Elements["+ i +"].CategoryScore"));
			element.setRubbish(_ctx.stringValue("ClassifyingRubbishResponse.Data.Elements["+ i +"].Rubbish"));
			element.setRubbishScore(_ctx.floatValue("ClassifyingRubbishResponse.Data.Elements["+ i +"].RubbishScore"));

			elements.add(element);
		}
		data.setElements(elements);
		classifyingRubbishResponse.setData(data);
	 
	 	return classifyingRubbishResponse;
	}
}