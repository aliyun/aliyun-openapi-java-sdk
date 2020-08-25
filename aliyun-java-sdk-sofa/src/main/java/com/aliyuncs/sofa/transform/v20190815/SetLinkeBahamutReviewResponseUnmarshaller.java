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

import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutReviewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLinkeBahamutReviewResponseUnmarshaller {

	public static SetLinkeBahamutReviewResponse unmarshall(SetLinkeBahamutReviewResponse setLinkeBahamutReviewResponse, UnmarshallerContext _ctx) {
		
		setLinkeBahamutReviewResponse.setRequestId(_ctx.stringValue("SetLinkeBahamutReviewResponse.RequestId"));
		setLinkeBahamutReviewResponse.setResultCode(_ctx.stringValue("SetLinkeBahamutReviewResponse.ResultCode"));
		setLinkeBahamutReviewResponse.setResultMessage(_ctx.stringValue("SetLinkeBahamutReviewResponse.ResultMessage"));
		setLinkeBahamutReviewResponse.setErrorMessage(_ctx.stringValue("SetLinkeBahamutReviewResponse.ErrorMessage"));
		setLinkeBahamutReviewResponse.setErrorMsgParamsMap(_ctx.stringValue("SetLinkeBahamutReviewResponse.ErrorMsgParamsMap"));
		setLinkeBahamutReviewResponse.setMessage(_ctx.stringValue("SetLinkeBahamutReviewResponse.Message"));
		setLinkeBahamutReviewResponse.setResponseStatusCode(_ctx.longValue("SetLinkeBahamutReviewResponse.ResponseStatusCode"));
		setLinkeBahamutReviewResponse.setResult(_ctx.stringValue("SetLinkeBahamutReviewResponse.Result"));
		setLinkeBahamutReviewResponse.setSuccess(_ctx.booleanValue("SetLinkeBahamutReviewResponse.Success"));
	 
	 	return setLinkeBahamutReviewResponse;
	}
}