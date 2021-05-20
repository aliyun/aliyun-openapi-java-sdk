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

import com.aliyuncs.facebody.model.v20191230.DetectChefCapResponse;
import com.aliyuncs.facebody.model.v20191230.DetectChefCapResponse.Data;
import com.aliyuncs.facebody.model.v20191230.DetectChefCapResponse.Data.ElementsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectChefCapResponseUnmarshaller {

	public static DetectChefCapResponse unmarshall(DetectChefCapResponse detectChefCapResponse, UnmarshallerContext _ctx) {
		
		detectChefCapResponse.setRequestId(_ctx.stringValue("DetectChefCapResponse.RequestId"));

		Data data = new Data();

		List<ElementsItem> elements = new ArrayList<ElementsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectChefCapResponse.Data.Elements.Length"); i++) {
			ElementsItem elementsItem = new ElementsItem();
			elementsItem.setConfidence(_ctx.floatValue("DetectChefCapResponse.Data.Elements["+ i +"].Confidence"));
			elementsItem.setCategory(_ctx.stringValue("DetectChefCapResponse.Data.Elements["+ i +"].Category"));

			List<Float> box = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DetectChefCapResponse.Data.Elements["+ i +"].Box.Length"); j++) {
				box.add(_ctx.floatValue("DetectChefCapResponse.Data.Elements["+ i +"].Box["+ j +"]"));
			}
			elementsItem.setBox(box);

			elements.add(elementsItem);
		}
		data.setElements(elements);
		detectChefCapResponse.setData(data);
	 
	 	return detectChefCapResponse;
	}
}