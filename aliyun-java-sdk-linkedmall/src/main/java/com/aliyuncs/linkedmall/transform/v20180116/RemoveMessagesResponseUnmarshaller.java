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

package com.aliyuncs.linkedmall.transform.v20180116;

import com.aliyuncs.linkedmall.model.v20180116.RemoveMessagesResponse;
import com.aliyuncs.linkedmall.model.v20180116.RemoveMessagesResponse.ActionResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveMessagesResponseUnmarshaller {

	public static RemoveMessagesResponse unmarshall(RemoveMessagesResponse removeMessagesResponse, UnmarshallerContext context) {
		
		removeMessagesResponse.setRequestId(context.stringValue("RemoveMessagesResponse.RequestId"));
		removeMessagesResponse.setLogsId(context.stringValue("RemoveMessagesResponse.LogsId"));
		removeMessagesResponse.setSubCode(context.stringValue("RemoveMessagesResponse.SubCode"));
		removeMessagesResponse.setSubMessage(context.stringValue("RemoveMessagesResponse.SubMessage"));
		removeMessagesResponse.setCode(context.stringValue("RemoveMessagesResponse.Code"));
		removeMessagesResponse.setMessage(context.stringValue("RemoveMessagesResponse.Message"));
		removeMessagesResponse.setSuccess(context.booleanValue("RemoveMessagesResponse.Success"));

		ActionResult actionResult = new ActionResult();
		actionResult.setReturnCode(context.stringValue("RemoveMessagesResponse.ActionResult.ReturnCode"));
		actionResult.setReturnValue(context.stringValue("RemoveMessagesResponse.ActionResult.ReturnValue"));
		actionResult.setReturnMessage(context.stringValue("RemoveMessagesResponse.ActionResult.ReturnMessage"));
		removeMessagesResponse.setActionResult(actionResult);
	 
	 	return removeMessagesResponse;
	}
}