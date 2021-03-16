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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryFeedbacksResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryFeedbacksResponse.Feedback;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryFeedbacksResponseUnmarshaller {

	public static OpsQueryFeedbacksResponse unmarshall(OpsQueryFeedbacksResponse opsQueryFeedbacksResponse, UnmarshallerContext _ctx) {
		
		opsQueryFeedbacksResponse.setRequestId(_ctx.stringValue("OpsQueryFeedbacksResponse.RequestId"));

		List<Feedback> data = new ArrayList<Feedback>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryFeedbacksResponse.Data.Length"); i++) {
			Feedback feedback = new Feedback();
			feedback.setAliUid(_ctx.longValue("OpsQueryFeedbacksResponse.Data["+ i +"].AliUid"));
			feedback.setCreateTime(_ctx.stringValue("OpsQueryFeedbacksResponse.Data["+ i +"].CreateTime"));
			feedback.setModifyTime(_ctx.stringValue("OpsQueryFeedbacksResponse.Data["+ i +"].ModifyTime"));
			feedback.setFunctionName(_ctx.stringValue("OpsQueryFeedbacksResponse.Data["+ i +"].FunctionName"));
			feedback.setCategory(_ctx.stringValue("OpsQueryFeedbacksResponse.Data["+ i +"].Category"));
			feedback.setFeedback(_ctx.stringValue("OpsQueryFeedbacksResponse.Data["+ i +"].Feedback"));
			feedback.setSuggestion(_ctx.stringValue("OpsQueryFeedbacksResponse.Data["+ i +"].Suggestion"));

			data.add(feedback);
		}
		opsQueryFeedbacksResponse.setData(data);
	 
	 	return opsQueryFeedbacksResponse;
	}
}