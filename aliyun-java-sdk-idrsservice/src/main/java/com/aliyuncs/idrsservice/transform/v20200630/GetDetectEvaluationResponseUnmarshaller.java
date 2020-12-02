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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.GetDetectEvaluationResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetDetectEvaluationResponse.DataItem;
import com.aliyuncs.idrsservice.model.v20200630.GetDetectEvaluationResponse.DataItem.EvaluationItemListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDetectEvaluationResponseUnmarshaller {

	public static GetDetectEvaluationResponse unmarshall(GetDetectEvaluationResponse getDetectEvaluationResponse, UnmarshallerContext _ctx) {
		
		getDetectEvaluationResponse.setRequestId(_ctx.stringValue("GetDetectEvaluationResponse.RequestId"));
		getDetectEvaluationResponse.setCode(_ctx.stringValue("GetDetectEvaluationResponse.Code"));
		getDetectEvaluationResponse.setMessage(_ctx.stringValue("GetDetectEvaluationResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDetectEvaluationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDay(_ctx.stringValue("GetDetectEvaluationResponse.Data["+ i +"].Day"));

			List<EvaluationItemListItem> evaluationItemList = new ArrayList<EvaluationItemListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetDetectEvaluationResponse.Data["+ i +"].EvaluationItemList.Length"); j++) {
				EvaluationItemListItem evaluationItemListItem = new EvaluationItemListItem();
				evaluationItemListItem.setName(_ctx.stringValue("GetDetectEvaluationResponse.Data["+ i +"].EvaluationItemList["+ j +"].Name"));
				evaluationItemListItem.setHandleCount(_ctx.integerValue("GetDetectEvaluationResponse.Data["+ i +"].EvaluationItemList["+ j +"].HandleCount"));
				evaluationItemListItem.setSuccessCount(_ctx.integerValue("GetDetectEvaluationResponse.Data["+ i +"].EvaluationItemList["+ j +"].SuccessCount"));
				evaluationItemListItem.setSuccessRate(_ctx.stringValue("GetDetectEvaluationResponse.Data["+ i +"].EvaluationItemList["+ j +"].SuccessRate"));

				evaluationItemList.add(evaluationItemListItem);
			}
			dataItem.setEvaluationItemList(evaluationItemList);

			data.add(dataItem);
		}
		getDetectEvaluationResponse.setData(data);
	 
	 	return getDetectEvaluationResponse;
	}
}