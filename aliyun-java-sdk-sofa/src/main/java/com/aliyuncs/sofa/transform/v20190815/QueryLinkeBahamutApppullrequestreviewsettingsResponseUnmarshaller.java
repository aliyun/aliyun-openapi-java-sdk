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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutApppullrequestreviewsettingsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutApppullrequestreviewsettingsResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutApppullrequestreviewsettingsResponseUnmarshaller {

	public static QueryLinkeBahamutApppullrequestreviewsettingsResponse unmarshall(QueryLinkeBahamutApppullrequestreviewsettingsResponse queryLinkeBahamutApppullrequestreviewsettingsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutApppullrequestreviewsettingsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.RequestId"));
		queryLinkeBahamutApppullrequestreviewsettingsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.ResultCode"));
		queryLinkeBahamutApppullrequestreviewsettingsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.ResultMessage"));
		queryLinkeBahamutApppullrequestreviewsettingsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.ErrorMessage"));
		queryLinkeBahamutApppullrequestreviewsettingsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutApppullrequestreviewsettingsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.Message"));
		queryLinkeBahamutApppullrequestreviewsettingsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.ResponseStatusCode"));
		queryLinkeBahamutApppullrequestreviewsettingsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.Success"));

		Result result = new Result();
		result.setReviewRequired(_ctx.booleanValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.Result.ReviewRequired"));
		result.setRulesType(_ctx.stringValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.Result.RulesType"));
		result.setShouldRemoveSourceBranch(_ctx.booleanValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.Result.ShouldRemoveSourceBranch"));
		result.setSubmitterCanReview(_ctx.booleanValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.Result.SubmitterCanReview"));
		result.setThreshold(_ctx.longValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.Result.Threshold"));
		result.setThresholdClear(_ctx.booleanValue("QueryLinkeBahamutApppullrequestreviewsettingsResponse.Result.ThresholdClear"));
		queryLinkeBahamutApppullrequestreviewsettingsResponse.setResult(result);
	 
	 	return queryLinkeBahamutApppullrequestreviewsettingsResponse;
	}
}