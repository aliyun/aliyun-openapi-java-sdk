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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import com.aliyuncs.cloudcallcenter.model.v20170705.GetCallDataByJobGroupIdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCallDataByJobGroupIdResponseUnmarshaller {

	public static GetCallDataByJobGroupIdResponse unmarshall(GetCallDataByJobGroupIdResponse getCallDataByJobGroupIdResponse, UnmarshallerContext context) {
		
		getCallDataByJobGroupIdResponse.setRequestId(context.stringValue("GetCallDataByJobGroupIdResponse.RequestId"));
		getCallDataByJobGroupIdResponse.setSuccess(context.booleanValue("GetCallDataByJobGroupIdResponse.Success"));
		getCallDataByJobGroupIdResponse.setCode(context.stringValue("GetCallDataByJobGroupIdResponse.Code"));
		getCallDataByJobGroupIdResponse.setMessage(context.stringValue("GetCallDataByJobGroupIdResponse.Message"));
		getCallDataByJobGroupIdResponse.setHttpStatusCode(context.integerValue("GetCallDataByJobGroupIdResponse.HttpStatusCode"));
		getCallDataByJobGroupIdResponse.setSuccessNumber(context.stringValue("GetCallDataByJobGroupIdResponse.SuccessNumber"));
		getCallDataByJobGroupIdResponse.setTotalNumber(context.stringValue("GetCallDataByJobGroupIdResponse.TotalNumber"));
		getCallDataByJobGroupIdResponse.setLossNumber(context.stringValue("GetCallDataByJobGroupIdResponse.LossNumber"));
	 
	 	return getCallDataByJobGroupIdResponse;
	}
}