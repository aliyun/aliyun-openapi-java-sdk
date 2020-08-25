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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleaseexternalidcodediffsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutReleaseexternalidcodediffsResponseUnmarshaller {

	public static QueryLinkeBahamutReleaseexternalidcodediffsResponse unmarshall(QueryLinkeBahamutReleaseexternalidcodediffsResponse queryLinkeBahamutReleaseexternalidcodediffsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutReleaseexternalidcodediffsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidcodediffsResponse.RequestId"));
		queryLinkeBahamutReleaseexternalidcodediffsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidcodediffsResponse.ResultCode"));
		queryLinkeBahamutReleaseexternalidcodediffsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidcodediffsResponse.ResultMessage"));
		queryLinkeBahamutReleaseexternalidcodediffsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidcodediffsResponse.ErrorMessage"));
		queryLinkeBahamutReleaseexternalidcodediffsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidcodediffsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutReleaseexternalidcodediffsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidcodediffsResponse.Message"));
		queryLinkeBahamutReleaseexternalidcodediffsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutReleaseexternalidcodediffsResponse.ResponseStatusCode"));
		queryLinkeBahamutReleaseexternalidcodediffsResponse.setResult(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidcodediffsResponse.Result"));
		queryLinkeBahamutReleaseexternalidcodediffsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutReleaseexternalidcodediffsResponse.Success"));
	 
	 	return queryLinkeBahamutReleaseexternalidcodediffsResponse;
	}
}