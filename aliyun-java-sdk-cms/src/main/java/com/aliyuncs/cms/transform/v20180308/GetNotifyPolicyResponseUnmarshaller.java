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

package com.aliyuncs.cms.transform.v20180308;

import com.aliyuncs.cms.model.v20180308.GetNotifyPolicyResponse;
import com.aliyuncs.cms.model.v20180308.GetNotifyPolicyResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNotifyPolicyResponseUnmarshaller {

	public static GetNotifyPolicyResponse unmarshall(GetNotifyPolicyResponse getNotifyPolicyResponse, UnmarshallerContext context) {
		
		getNotifyPolicyResponse.setRequestId(context.stringValue("GetNotifyPolicyResponse.RequestId"));
		getNotifyPolicyResponse.setCode(context.stringValue("GetNotifyPolicyResponse.Code"));
		getNotifyPolicyResponse.setMessage(context.stringValue("GetNotifyPolicyResponse.Message"));
		getNotifyPolicyResponse.setSuccess(context.stringValue("GetNotifyPolicyResponse.Success"));

		Result result = new Result();
		result.setAlertName(context.stringValue("GetNotifyPolicyResponse.Result.AlertName"));
		result.setDimensions(context.stringValue("GetNotifyPolicyResponse.Result.Dimensions"));
		result.setType(context.stringValue("GetNotifyPolicyResponse.Result.Type"));
		result.setId(context.stringValue("GetNotifyPolicyResponse.Result.Id"));
		result.setStartTime(context.longValue("GetNotifyPolicyResponse.Result.StartTime"));
		result.setEndTime(context.longValue("GetNotifyPolicyResponse.Result.EndTime"));
		result.setGroupId(context.stringValue("GetNotifyPolicyResponse.Result.GroupId"));
		getNotifyPolicyResponse.setResult(result);
	 
	 	return getNotifyPolicyResponse;
	}
}