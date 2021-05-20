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

import com.aliyuncs.objectdet.model.v20191230.DetectIPCObjectResponse;
import com.aliyuncs.objectdet.model.v20191230.DetectIPCObjectResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.DetectIPCObjectResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectIPCObjectResponseUnmarshaller {

	public static DetectIPCObjectResponse unmarshall(DetectIPCObjectResponse detectIPCObjectResponse, UnmarshallerContext _ctx) {
		
		detectIPCObjectResponse.setRequestId(_ctx.stringValue("DetectIPCObjectResponse.RequestId"));
		detectIPCObjectResponse.setMessage(_ctx.stringValue("DetectIPCObjectResponse.Message"));
		detectIPCObjectResponse.setCode(_ctx.stringValue("DetectIPCObjectResponse.Code"));

		Data data = new Data();
		data.setHeight(_ctx.longValue("DetectIPCObjectResponse.Data.Height"));
		data.setWidth(_ctx.longValue("DetectIPCObjectResponse.Data.Width"));

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectIPCObjectResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setTargetRate(_ctx.floatValue("DetectIPCObjectResponse.Data.Elements["+ i +"].TargetRate"));
			element.setScore(_ctx.floatValue("DetectIPCObjectResponse.Data.Elements["+ i +"].Score"));
			element.setType(_ctx.stringValue("DetectIPCObjectResponse.Data.Elements["+ i +"].Type"));

			List<Long> box = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("DetectIPCObjectResponse.Data.Elements["+ i +"].Box.Length"); j++) {
				box.add(_ctx.longValue("DetectIPCObjectResponse.Data.Elements["+ i +"].Box["+ j +"]"));
			}
			element.setBox(box);

			elements.add(element);
		}
		data.setElements(elements);
		detectIPCObjectResponse.setData(data);
	 
	 	return detectIPCObjectResponse;
	}
}