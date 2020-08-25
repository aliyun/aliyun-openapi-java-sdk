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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutReleaseexternalidjarsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutReleaseexternalidjarsResponseUnmarshaller {

	public static QueryLinkeBahamutReleaseexternalidjarsResponse unmarshall(QueryLinkeBahamutReleaseexternalidjarsResponse queryLinkeBahamutReleaseexternalidjarsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutReleaseexternalidjarsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidjarsResponse.RequestId"));
		queryLinkeBahamutReleaseexternalidjarsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidjarsResponse.ResultCode"));
		queryLinkeBahamutReleaseexternalidjarsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidjarsResponse.ResultMessage"));
		queryLinkeBahamutReleaseexternalidjarsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidjarsResponse.ErrorMessage"));
		queryLinkeBahamutReleaseexternalidjarsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidjarsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutReleaseexternalidjarsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidjarsResponse.Message"));
		queryLinkeBahamutReleaseexternalidjarsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutReleaseexternalidjarsResponse.ResponseStatusCode"));
		queryLinkeBahamutReleaseexternalidjarsResponse.setResult(_ctx.stringValue("QueryLinkeBahamutReleaseexternalidjarsResponse.Result"));
		queryLinkeBahamutReleaseexternalidjarsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutReleaseexternalidjarsResponse.Success"));
	 
	 	return queryLinkeBahamutReleaseexternalidjarsResponse;
	}
}