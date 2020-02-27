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

import com.aliyuncs.objectdet.model.v20191230.RecognizeVehicleDamageResponse;
import com.aliyuncs.objectdet.model.v20191230.RecognizeVehicleDamageResponse.Data;
import com.aliyuncs.objectdet.model.v20191230.RecognizeVehicleDamageResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeVehicleDamageResponseUnmarshaller {

	public static RecognizeVehicleDamageResponse unmarshall(RecognizeVehicleDamageResponse recognizeVehicleDamageResponse, UnmarshallerContext _ctx) {
		
		recognizeVehicleDamageResponse.setRequestId(_ctx.stringValue("RecognizeVehicleDamageResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeVehicleDamageResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setScore(_ctx.floatValue("RecognizeVehicleDamageResponse.Data.Elements["+ i +"].Score"));
			element.setType(_ctx.stringValue("RecognizeVehicleDamageResponse.Data.Elements["+ i +"].Type"));

			List<Float> scores = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeVehicleDamageResponse.Data.Elements["+ i +"].Scores.Length"); j++) {
				scores.add(_ctx.floatValue("RecognizeVehicleDamageResponse.Data.Elements["+ i +"].Scores["+ j +"]"));
			}
			element.setScores(scores);

			List<Integer> boxes = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeVehicleDamageResponse.Data.Elements["+ i +"].Boxes.Length"); j++) {
				boxes.add(_ctx.integerValue("RecognizeVehicleDamageResponse.Data.Elements["+ i +"].Boxes["+ j +"]"));
			}
			element.setBoxes(boxes);

			elements.add(element);
		}
		data.setElements(elements);
		recognizeVehicleDamageResponse.setData(data);
	 
	 	return recognizeVehicleDamageResponse;
	}
}