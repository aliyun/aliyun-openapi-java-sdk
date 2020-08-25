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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcscanremovesourcebranchResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcscanremovesourcebranchResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcscanremovesourcebranchResponseUnmarshaller {

	public static GetLinkeBahamutVcscanremovesourcebranchResponse unmarshall(GetLinkeBahamutVcscanremovesourcebranchResponse getLinkeBahamutVcscanremovesourcebranchResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcscanremovesourcebranchResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcscanremovesourcebranchResponse.RequestId"));
		getLinkeBahamutVcscanremovesourcebranchResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcscanremovesourcebranchResponse.ResultCode"));
		getLinkeBahamutVcscanremovesourcebranchResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcscanremovesourcebranchResponse.ResultMessage"));
		getLinkeBahamutVcscanremovesourcebranchResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcscanremovesourcebranchResponse.ErrorMessage"));
		getLinkeBahamutVcscanremovesourcebranchResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcscanremovesourcebranchResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcscanremovesourcebranchResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcscanremovesourcebranchResponse.Message"));
		getLinkeBahamutVcscanremovesourcebranchResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcscanremovesourcebranchResponse.ResponseStatusCode"));
		getLinkeBahamutVcscanremovesourcebranchResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcscanremovesourcebranchResponse.Success"));

		Result result = new Result();
		result.setCanRemoveSourceBranch(_ctx.booleanValue("GetLinkeBahamutVcscanremovesourcebranchResponse.Result.CanRemoveSourceBranch"));
		result.setReason(_ctx.stringValue("GetLinkeBahamutVcscanremovesourcebranchResponse.Result.Reason"));
		result.setSourceBranchExist(_ctx.booleanValue("GetLinkeBahamutVcscanremovesourcebranchResponse.Result.SourceBranchExist"));
		getLinkeBahamutVcscanremovesourcebranchResponse.setResult(result);
	 
	 	return getLinkeBahamutVcscanremovesourcebranchResponse;
	}
}