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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAppupdatepullrequestsettingsResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAppupdatepullrequestsettingsResponseUnmarshaller {

	public static UpdateLinkeBahamutAppupdatepullrequestsettingsResponse unmarshall(UpdateLinkeBahamutAppupdatepullrequestsettingsResponse updateLinkeBahamutAppupdatepullrequestsettingsResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAppupdatepullrequestsettingsResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.RequestId"));
		updateLinkeBahamutAppupdatepullrequestsettingsResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.ResultCode"));
		updateLinkeBahamutAppupdatepullrequestsettingsResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.ResultMessage"));
		updateLinkeBahamutAppupdatepullrequestsettingsResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.ErrorMessage"));
		updateLinkeBahamutAppupdatepullrequestsettingsResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAppupdatepullrequestsettingsResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.Message"));
		updateLinkeBahamutAppupdatepullrequestsettingsResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.ResponseStatusCode"));
		updateLinkeBahamutAppupdatepullrequestsettingsResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.Success"));

		Result result = new Result();
		result.setReviewRequired(_ctx.booleanValue("UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.Result.ReviewRequired"));
		result.setShouldRemoveSourceBranch(_ctx.booleanValue("UpdateLinkeBahamutAppupdatepullrequestsettingsResponse.Result.ShouldRemoveSourceBranch"));
		updateLinkeBahamutAppupdatepullrequestsettingsResponse.setResult(result);
	 
	 	return updateLinkeBahamutAppupdatepullrequestsettingsResponse;
	}
}