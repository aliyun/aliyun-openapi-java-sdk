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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutServernotificationResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutServernotificationResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutServernotificationResponseUnmarshaller {

	public static GetLinkeBahamutServernotificationResponse unmarshall(GetLinkeBahamutServernotificationResponse getLinkeBahamutServernotificationResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutServernotificationResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutServernotificationResponse.RequestId"));
		getLinkeBahamutServernotificationResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutServernotificationResponse.ResultCode"));
		getLinkeBahamutServernotificationResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutServernotificationResponse.ResultMessage"));
		getLinkeBahamutServernotificationResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutServernotificationResponse.ErrorMessage"));
		getLinkeBahamutServernotificationResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutServernotificationResponse.ErrorMsgParamsMap"));
		getLinkeBahamutServernotificationResponse.setMessage(_ctx.stringValue("GetLinkeBahamutServernotificationResponse.Message"));
		getLinkeBahamutServernotificationResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutServernotificationResponse.ResponseStatusCode"));
		getLinkeBahamutServernotificationResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutServernotificationResponse.Success"));

		Result result = new Result();
		result.setContent(_ctx.stringValue("GetLinkeBahamutServernotificationResponse.Result.Content"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutServernotificationResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutServernotificationResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("GetLinkeBahamutServernotificationResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutServernotificationResponse.Result.LastModified"));
		result.setOperator(_ctx.stringValue("GetLinkeBahamutServernotificationResponse.Result.Operator"));
		result.setShowNotification(_ctx.booleanValue("GetLinkeBahamutServernotificationResponse.Result.ShowNotification"));
		result.setTime(_ctx.longValue("GetLinkeBahamutServernotificationResponse.Result.Time"));
		getLinkeBahamutServernotificationResponse.setResult(result);
	 
	 	return getLinkeBahamutServernotificationResponse;
	}
}