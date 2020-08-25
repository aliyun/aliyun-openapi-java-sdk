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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutServernotificationResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutServernotificationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutServernotificationResponseUnmarshaller {

	public static AddLinkeBahamutServernotificationResponse unmarshall(AddLinkeBahamutServernotificationResponse addLinkeBahamutServernotificationResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutServernotificationResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutServernotificationResponse.RequestId"));
		addLinkeBahamutServernotificationResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutServernotificationResponse.ResultCode"));
		addLinkeBahamutServernotificationResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutServernotificationResponse.ResultMessage"));
		addLinkeBahamutServernotificationResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutServernotificationResponse.ErrorMessage"));
		addLinkeBahamutServernotificationResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutServernotificationResponse.ErrorMsgParamsMap"));
		addLinkeBahamutServernotificationResponse.setMessage(_ctx.stringValue("AddLinkeBahamutServernotificationResponse.Message"));
		addLinkeBahamutServernotificationResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutServernotificationResponse.ResponseStatusCode"));
		addLinkeBahamutServernotificationResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutServernotificationResponse.Success"));

		Result result = new Result();
		result.setContent(_ctx.stringValue("AddLinkeBahamutServernotificationResponse.Result.Content"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutServernotificationResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutServernotificationResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("AddLinkeBahamutServernotificationResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutServernotificationResponse.Result.LastModified"));
		result.setOperator(_ctx.stringValue("AddLinkeBahamutServernotificationResponse.Result.Operator"));
		result.setShowNotification(_ctx.booleanValue("AddLinkeBahamutServernotificationResponse.Result.ShowNotification"));
		result.setTime(_ctx.longValue("AddLinkeBahamutServernotificationResponse.Result.Time"));
		addLinkeBahamutServernotificationResponse.setResult(result);
	 
	 	return addLinkeBahamutServernotificationResponse;
	}
}