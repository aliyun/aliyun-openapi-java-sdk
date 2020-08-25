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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutCloudtenantresetcloudaccessResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutCloudtenantresetcloudaccessResponseUnmarshaller {

	public static QueryLinkeBahamutCloudtenantresetcloudaccessResponse unmarshall(QueryLinkeBahamutCloudtenantresetcloudaccessResponse queryLinkeBahamutCloudtenantresetcloudaccessResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutCloudtenantresetcloudaccessResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutCloudtenantresetcloudaccessResponse.RequestId"));
		queryLinkeBahamutCloudtenantresetcloudaccessResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutCloudtenantresetcloudaccessResponse.ResultCode"));
		queryLinkeBahamutCloudtenantresetcloudaccessResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutCloudtenantresetcloudaccessResponse.ResultMessage"));
		queryLinkeBahamutCloudtenantresetcloudaccessResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutCloudtenantresetcloudaccessResponse.ErrorMessage"));
		queryLinkeBahamutCloudtenantresetcloudaccessResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutCloudtenantresetcloudaccessResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutCloudtenantresetcloudaccessResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutCloudtenantresetcloudaccessResponse.Message"));
		queryLinkeBahamutCloudtenantresetcloudaccessResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutCloudtenantresetcloudaccessResponse.ResponseStatusCode"));
		queryLinkeBahamutCloudtenantresetcloudaccessResponse.setResult(_ctx.booleanValue("QueryLinkeBahamutCloudtenantresetcloudaccessResponse.Result"));
		queryLinkeBahamutCloudtenantresetcloudaccessResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutCloudtenantresetcloudaccessResponse.Success"));
	 
	 	return queryLinkeBahamutCloudtenantresetcloudaccessResponse;
	}
}