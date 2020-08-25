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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppquerypullrequestsettingsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutAppquerypullrequestsettingsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutAppquerypullrequestsettingsResponseUnmarshaller {

	public static QueryLinkeBahamutAppquerypullrequestsettingsResponse unmarshall(QueryLinkeBahamutAppquerypullrequestsettingsResponse queryLinkeBahamutAppquerypullrequestsettingsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutAppquerypullrequestsettingsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutAppquerypullrequestsettingsResponse.RequestId"));
		queryLinkeBahamutAppquerypullrequestsettingsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutAppquerypullrequestsettingsResponse.ResultCode"));
		queryLinkeBahamutAppquerypullrequestsettingsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutAppquerypullrequestsettingsResponse.ResultMessage"));
		queryLinkeBahamutAppquerypullrequestsettingsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutAppquerypullrequestsettingsResponse.ErrorMessage"));
		queryLinkeBahamutAppquerypullrequestsettingsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutAppquerypullrequestsettingsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutAppquerypullrequestsettingsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutAppquerypullrequestsettingsResponse.Message"));
		queryLinkeBahamutAppquerypullrequestsettingsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutAppquerypullrequestsettingsResponse.ResponseStatusCode"));
		queryLinkeBahamutAppquerypullrequestsettingsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutAppquerypullrequestsettingsResponse.Success"));

		Result result = new Result();
		result.setReviewRequired(_ctx.booleanValue("QueryLinkeBahamutAppquerypullrequestsettingsResponse.Result.ReviewRequired"));
		result.setShouldRemoveSourceBranch(_ctx.booleanValue("QueryLinkeBahamutAppquerypullrequestsettingsResponse.Result.ShouldRemoveSourceBranch"));
		queryLinkeBahamutAppquerypullrequestsettingsResponse.setResult(result);
	 
	 	return queryLinkeBahamutAppquerypullrequestsettingsResponse;
	}
}