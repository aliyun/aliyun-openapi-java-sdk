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

import com.aliyuncs.objectdet.model.v20191230.DetectWhiteBaseImageResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectWhiteBaseImageResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectWhiteBaseImageResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectWhiteBaseImageResponseUnmarshaller {

	public static DetectWhiteBaseImageResponse unmarshall(DetectWhiteBaseImageResponse detectWhiteBaseImageResponse, UnmarshallerContext _ctx) {
		
		detectWhiteBaseImageResponse.setRequestId(_ctx.stringValue("DetectWhiteBaseImageResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectWhiteBaseImageResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setWhiteBase(_ctx.integerValue("DetectWhiteBaseImageResponse.Data.Elements["+ i +"].WhiteBase"));

			elements.add(element);
		}
		data.setElements(elements);
		detectWhiteBaseImageResponse.setData(data);
	 
	 	return detectWhiteBaseImageResponse;
	}
}