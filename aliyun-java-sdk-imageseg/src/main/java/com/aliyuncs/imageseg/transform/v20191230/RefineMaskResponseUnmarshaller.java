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

package com.aliyuncs.imageseg.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageseg.model.v20191230.RefineMaskResponse;
import com.aliyuncs.imageseg.model.v20191230.RefineMaskResponse.Data;
import com.aliyuncs.imageseg.model.v20191230.RefineMaskResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefineMaskResponseUnmarshaller {

	public static RefineMaskResponse unmarshall(RefineMaskResponse refineMaskResponse, UnmarshallerContext _ctx) {
		
		refineMaskResponse.setRequestId(_ctx.stringValue("RefineMaskResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("RefineMaskResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setImageURL(_ctx.stringValue("RefineMaskResponse.Data.Elements["+ i +"].ImageURL"));

			elements.add(element);
		}
		data.setElements(elements);
		refineMaskResponse.setData(data);
	 
	 	return refineMaskResponse;
	}
}