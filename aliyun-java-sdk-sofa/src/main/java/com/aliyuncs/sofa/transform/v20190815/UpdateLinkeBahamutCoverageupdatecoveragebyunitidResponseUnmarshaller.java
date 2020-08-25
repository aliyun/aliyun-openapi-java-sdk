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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponseUnmarshaller {

	public static UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse unmarshall(UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse updateLinkeBahamutCoverageupdatecoveragebyunitidResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutCoverageupdatecoveragebyunitidResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse.RequestId"));
		updateLinkeBahamutCoverageupdatecoveragebyunitidResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse.ResultCode"));
		updateLinkeBahamutCoverageupdatecoveragebyunitidResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse.ResultMessage"));
		updateLinkeBahamutCoverageupdatecoveragebyunitidResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse.ErrorMessage"));
		updateLinkeBahamutCoverageupdatecoveragebyunitidResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutCoverageupdatecoveragebyunitidResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse.Message"));
		updateLinkeBahamutCoverageupdatecoveragebyunitidResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse.ResponseStatusCode"));
		updateLinkeBahamutCoverageupdatecoveragebyunitidResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutCoverageupdatecoveragebyunitidResponse.Success"));
	 
	 	return updateLinkeBahamutCoverageupdatecoveragebyunitidResponse;
	}
}