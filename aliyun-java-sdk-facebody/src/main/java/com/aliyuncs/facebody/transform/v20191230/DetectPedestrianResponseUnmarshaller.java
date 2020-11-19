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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.DetectPedestrianResponse;
import com.aliyuncs.facebody.model.v20191230.DetectPedestrianResponse.Data;
import com.aliyuncs.facebody.model.v20191230.DetectPedestrianResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectPedestrianResponseUnmarshaller {

	public static DetectPedestrianResponse unmarshall(DetectPedestrianResponse detectPedestrianResponse, UnmarshallerContext _ctx) {
		
		detectPedestrianResponse.setRequestId(_ctx.stringValue("DetectPedestrianResponse.RequestId"));

		Data data = new Data();
		data.setHeight(_ctx.integerValue("DetectPedestrianResponse.Data.Height"));
		data.setWidth(_ctx.integerValue("DetectPedestrianResponse.Data.Width"));

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectPedestrianResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setScore(_ctx.floatValue("DetectPedestrianResponse.Data.Elements["+ i +"].Score"));
			element.setType(_ctx.stringValue("DetectPedestrianResponse.Data.Elements["+ i +"].Type"));

			List<Integer> boxes = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DetectPedestrianResponse.Data.Elements["+ i +"].Boxes.Length"); j++) {
				boxes.add(_ctx.integerValue("DetectPedestrianResponse.Data.Elements["+ i +"].Boxes["+ j +"]"));
			}
			element.setBoxes(boxes);

			elements.add(element);
		}
		data.setElements(elements);
		detectPedestrianResponse.setData(data);
	 
	 	return detectPedestrianResponse;
	}
}