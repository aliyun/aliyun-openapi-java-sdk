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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutQualityupdatecoverageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutQualityupdatecoverageResponseUnmarshaller {

	public static UpdateLinkeBahamutQualityupdatecoverageResponse unmarshall(UpdateLinkeBahamutQualityupdatecoverageResponse updateLinkeBahamutQualityupdatecoverageResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutQualityupdatecoverageResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutQualityupdatecoverageResponse.RequestId"));
		updateLinkeBahamutQualityupdatecoverageResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutQualityupdatecoverageResponse.ResultCode"));
		updateLinkeBahamutQualityupdatecoverageResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutQualityupdatecoverageResponse.ResultMessage"));
		updateLinkeBahamutQualityupdatecoverageResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutQualityupdatecoverageResponse.ErrorMessage"));
		updateLinkeBahamutQualityupdatecoverageResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutQualityupdatecoverageResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutQualityupdatecoverageResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutQualityupdatecoverageResponse.Message"));
		updateLinkeBahamutQualityupdatecoverageResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutQualityupdatecoverageResponse.ResponseStatusCode"));
		updateLinkeBahamutQualityupdatecoverageResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutQualityupdatecoverageResponse.Success"));
	 
	 	return updateLinkeBahamutQualityupdatecoverageResponse;
	}
}