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

package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.PredictiveRecordSuccessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PredictiveRecordSuccessResponseUnmarshaller {

	public static PredictiveRecordSuccessResponse unmarshall(PredictiveRecordSuccessResponse predictiveRecordSuccessResponse, UnmarshallerContext _ctx) {
		
		predictiveRecordSuccessResponse.setRequestId(_ctx.stringValue("PredictiveRecordSuccessResponse.RequestId"));
		predictiveRecordSuccessResponse.setSuccess(_ctx.booleanValue("PredictiveRecordSuccessResponse.Success"));
		predictiveRecordSuccessResponse.setCode(_ctx.stringValue("PredictiveRecordSuccessResponse.Code"));
		predictiveRecordSuccessResponse.setMessage(_ctx.stringValue("PredictiveRecordSuccessResponse.Message"));
		predictiveRecordSuccessResponse.setHttpStatusCode(_ctx.integerValue("PredictiveRecordSuccessResponse.HttpStatusCode"));
	 
	 	return predictiveRecordSuccessResponse;
	}
}