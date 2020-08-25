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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.PushLinkeBahamutSubmitreleasebyenvResponse;
import com.aliyuncs.sofa.model.v20190815.PushLinkeBahamutSubmitreleasebyenvResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushLinkeBahamutSubmitreleasebyenvResponseUnmarshaller {

	public static PushLinkeBahamutSubmitreleasebyenvResponse unmarshall(PushLinkeBahamutSubmitreleasebyenvResponse pushLinkeBahamutSubmitreleasebyenvResponse, UnmarshallerContext _ctx) {
		
		pushLinkeBahamutSubmitreleasebyenvResponse.setRequestId(_ctx.stringValue("PushLinkeBahamutSubmitreleasebyenvResponse.RequestId"));
		pushLinkeBahamutSubmitreleasebyenvResponse.setResultCode(_ctx.stringValue("PushLinkeBahamutSubmitreleasebyenvResponse.ResultCode"));
		pushLinkeBahamutSubmitreleasebyenvResponse.setResultMessage(_ctx.stringValue("PushLinkeBahamutSubmitreleasebyenvResponse.ResultMessage"));
		pushLinkeBahamutSubmitreleasebyenvResponse.setErrorMessage(_ctx.stringValue("PushLinkeBahamutSubmitreleasebyenvResponse.ErrorMessage"));
		pushLinkeBahamutSubmitreleasebyenvResponse.setErrorMsgParamsMap(_ctx.stringValue("PushLinkeBahamutSubmitreleasebyenvResponse.ErrorMsgParamsMap"));
		pushLinkeBahamutSubmitreleasebyenvResponse.setMessage(_ctx.stringValue("PushLinkeBahamutSubmitreleasebyenvResponse.Message"));
		pushLinkeBahamutSubmitreleasebyenvResponse.setResponseStatusCode(_ctx.longValue("PushLinkeBahamutSubmitreleasebyenvResponse.ResponseStatusCode"));
		pushLinkeBahamutSubmitreleasebyenvResponse.setSuccess(_ctx.booleanValue("PushLinkeBahamutSubmitreleasebyenvResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("PushLinkeBahamutSubmitreleasebyenvResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCloudTenantId(_ctx.stringValue("PushLinkeBahamutSubmitreleasebyenvResponse.Result["+ i +"].CloudTenantId"));
			resultItem.setCloudTenantName(_ctx.stringValue("PushLinkeBahamutSubmitreleasebyenvResponse.Result["+ i +"].CloudTenantName"));
			resultItem.setPreEnvReleaseInfo(_ctx.stringValue("PushLinkeBahamutSubmitreleasebyenvResponse.Result["+ i +"].PreEnvReleaseInfo"));
			resultItem.setProdEnvReleaseInfo(_ctx.stringValue("PushLinkeBahamutSubmitreleasebyenvResponse.Result["+ i +"].ProdEnvReleaseInfo"));

			result.add(resultItem);
		}
		pushLinkeBahamutSubmitreleasebyenvResponse.setResult(result);
	 
	 	return pushLinkeBahamutSubmitreleasebyenvResponse;
	}
}