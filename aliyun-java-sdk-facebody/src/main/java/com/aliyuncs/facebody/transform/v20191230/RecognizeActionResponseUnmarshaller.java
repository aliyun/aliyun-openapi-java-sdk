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

import com.aliyuncs.facebody.model.v20191230.RecognizeActionResponse;
import com.aliyuncs.facebody.model.v20191230.RecognizeActionResponse.Data;
import com.aliyuncs.facebody.model.v20191230.RecognizeActionResponse.Data.Element;
import com.aliyuncs.facebody.model.v20191230.RecognizeActionResponse.Data.Element.BoxesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeActionResponseUnmarshaller {

	public static RecognizeActionResponse unmarshall(RecognizeActionResponse recognizeActionResponse, UnmarshallerContext _ctx) {
		
		recognizeActionResponse.setRequestId(_ctx.stringValue("RecognizeActionResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeActionResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setTimestamp(_ctx.integerValue("RecognizeActionResponse.Data.Elements["+ i +"].Timestamp"));

			List<Float> scores = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeActionResponse.Data.Elements["+ i +"].Scores.Length"); j++) {
				scores.add(_ctx.floatValue("RecognizeActionResponse.Data.Elements["+ i +"].Scores["+ j +"]"));
			}
			element.setScores(scores);

			List<String> labels = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeActionResponse.Data.Elements["+ i +"].Labels.Length"); j++) {
				labels.add(_ctx.stringValue("RecognizeActionResponse.Data.Elements["+ i +"].Labels["+ j +"]"));
			}
			element.setLabels(labels);

			List<BoxesItem> boxes = new ArrayList<BoxesItem>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeActionResponse.Data.Elements["+ i +"].Boxes.Length"); j++) {
				BoxesItem boxesItem = new BoxesItem();

				List<Integer> box = new ArrayList<Integer>();
				for (int k = 0; k < _ctx.lengthValue("RecognizeActionResponse.Data.Elements["+ i +"].Boxes["+ j +"].Box.Length"); k++) {
					box.add(_ctx.integerValue("RecognizeActionResponse.Data.Elements["+ i +"].Boxes["+ j +"].Box["+ k +"]"));
				}
				boxesItem.setBox(box);

				boxes.add(boxesItem);
			}
			element.setBoxes(boxes);

			elements.add(element);
		}
		data.setElements(elements);
		recognizeActionResponse.setData(data);
	 
	 	return recognizeActionResponse;
	}
}