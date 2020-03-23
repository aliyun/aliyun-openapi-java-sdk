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

import com.aliyuncs.imagerecog.model.v20190930.RecognizeVehicleTypeResponse;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeVehicleTypeResponse.Data;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeVehicleTypeResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeVehicleTypeResponseUnmarshaller {

	public static RecognizeVehicleTypeResponse unmarshall(RecognizeVehicleTypeResponse recognizeVehicleTypeResponse, UnmarshallerContext _ctx) {
		
		recognizeVehicleTypeResponse.setRequestId(_ctx.stringValue("RecognizeVehicleTypeResponse.RequestId"));

		Data data = new Data();
		data.setThreshold(_ctx.floatValue("RecognizeVehicleTypeResponse.Data.Threshold"));

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVehicleTypeResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setName(_ctx.stringValue("RecognizeVehicleTypeResponse.Data.Elements["+ i +"].Name"));
			element.setScore(_ctx.floatValue("RecognizeVehicleTypeResponse.Data.Elements["+ i +"].Score"));

			elements.add(element);
		}
		data.setElements(elements);
		recognizeVehicleTypeResponse.setData(data);
	 
	 	return recognizeVehicleTypeResponse;
	}
}