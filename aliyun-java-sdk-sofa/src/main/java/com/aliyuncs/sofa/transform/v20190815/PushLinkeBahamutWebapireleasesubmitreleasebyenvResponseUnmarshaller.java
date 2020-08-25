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

import com.aliyuncs.sofa.model.v20190815.PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse;
import com.aliyuncs.sofa.model.v20190815.PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PushLinkeBahamutWebapireleasesubmitreleasebyenvResponseUnmarshaller {

	public static PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse unmarshall(PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse, UnmarshallerContext _ctx) {
		
		pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.setRequestId(_ctx.stringValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.RequestId"));
		pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.setResultCode(_ctx.stringValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.ResultCode"));
		pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.setResultMessage(_ctx.stringValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.ResultMessage"));
		pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.setErrorMessage(_ctx.stringValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.ErrorMessage"));
		pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.setErrorMsgParamsMap(_ctx.stringValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.ErrorMsgParamsMap"));
		pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.setMessage(_ctx.stringValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.Message"));
		pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.setResponseStatusCode(_ctx.longValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.ResponseStatusCode"));
		pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.setSuccess(_ctx.booleanValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCloudTenantId(_ctx.stringValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.Result["+ i +"].CloudTenantId"));
			resultItem.setCloudTenantName(_ctx.stringValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.Result["+ i +"].CloudTenantName"));
			resultItem.setPreEnvReleaseInfo(_ctx.stringValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.Result["+ i +"].PreEnvReleaseInfo"));
			resultItem.setProdEnvReleaseInfo(_ctx.stringValue("PushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.Result["+ i +"].ProdEnvReleaseInfo"));

			result.add(resultItem);
		}
		pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse.setResult(result);
	 
	 	return pushLinkeBahamutWebapireleasesubmitreleasebyenvResponse;
	}
}