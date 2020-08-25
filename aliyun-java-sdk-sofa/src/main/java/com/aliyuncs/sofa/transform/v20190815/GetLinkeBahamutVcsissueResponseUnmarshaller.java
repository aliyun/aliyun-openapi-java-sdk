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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsissueResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsissueResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsissueResponseUnmarshaller {

	public static GetLinkeBahamutVcsissueResponse unmarshall(GetLinkeBahamutVcsissueResponse getLinkeBahamutVcsissueResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsissueResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.RequestId"));
		getLinkeBahamutVcsissueResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.ResultCode"));
		getLinkeBahamutVcsissueResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.ResultMessage"));
		getLinkeBahamutVcsissueResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.ErrorMessage"));
		getLinkeBahamutVcsissueResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsissueResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.Message"));
		getLinkeBahamutVcsissueResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsissueResponse.ResponseStatusCode"));
		getLinkeBahamutVcsissueResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsissueResponse.Success"));

		Result result = new Result();
		result.setAssignee(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.Result.Assignee"));
		result.setCreatedAt(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.Result.CreatedAt"));
		result.setDescription(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.Result.Description"));
		result.setId(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.Result.Id"));
		result.setIid(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.Result.Iid"));
		result.setState(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.Result.State"));
		result.setTitle(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.Result.Title"));
		result.setUpdatedAt(_ctx.stringValue("GetLinkeBahamutVcsissueResponse.Result.UpdatedAt"));
		getLinkeBahamutVcsissueResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsissueResponse;
	}
}