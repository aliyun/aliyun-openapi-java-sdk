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

import com.aliyuncs.imagerecog.model.v20190930.RecognizeFoodResponse;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeFoodResponse.Data;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeFoodResponse.Data.TopFivesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeFoodResponseUnmarshaller {

	public static RecognizeFoodResponse unmarshall(RecognizeFoodResponse recognizeFoodResponse, UnmarshallerContext _ctx) {
		
		recognizeFoodResponse.setRequestId(_ctx.stringValue("RecognizeFoodResponse.RequestId"));
		recognizeFoodResponse.setCode(_ctx.stringValue("RecognizeFoodResponse.Code"));
		recognizeFoodResponse.setMessage(_ctx.stringValue("RecognizeFoodResponse.Message"));

		Data data = new Data();

		List<TopFivesItem> topFives = new ArrayList<TopFivesItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeFoodResponse.Data.TopFives.Length"); i++) {
			TopFivesItem topFivesItem = new TopFivesItem();
			topFivesItem.setCategory(_ctx.stringValue("RecognizeFoodResponse.Data.TopFives["+ i +"].Category"));
			topFivesItem.setScore(_ctx.floatValue("RecognizeFoodResponse.Data.TopFives["+ i +"].Score"));
			topFivesItem.setCalorie(_ctx.stringValue("RecognizeFoodResponse.Data.TopFives["+ i +"].Calorie"));

			topFives.add(topFivesItem);
		}
		data.setTopFives(topFives);
		recognizeFoodResponse.setData(data);
	 
	 	return recognizeFoodResponse;
	}
}