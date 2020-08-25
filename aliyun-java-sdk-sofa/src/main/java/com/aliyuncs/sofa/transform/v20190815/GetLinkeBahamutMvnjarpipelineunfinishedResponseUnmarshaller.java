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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMvnjarpipelineunfinishedResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutMvnjarpipelineunfinishedResponseUnmarshaller {

	public static GetLinkeBahamutMvnjarpipelineunfinishedResponse unmarshall(GetLinkeBahamutMvnjarpipelineunfinishedResponse getLinkeBahamutMvnjarpipelineunfinishedResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutMvnjarpipelineunfinishedResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutMvnjarpipelineunfinishedResponse.RequestId"));
		getLinkeBahamutMvnjarpipelineunfinishedResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutMvnjarpipelineunfinishedResponse.ResultCode"));
		getLinkeBahamutMvnjarpipelineunfinishedResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutMvnjarpipelineunfinishedResponse.ResultMessage"));
		getLinkeBahamutMvnjarpipelineunfinishedResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutMvnjarpipelineunfinishedResponse.ErrorMessage"));
		getLinkeBahamutMvnjarpipelineunfinishedResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutMvnjarpipelineunfinishedResponse.ErrorMsgParamsMap"));
		getLinkeBahamutMvnjarpipelineunfinishedResponse.setMessage(_ctx.stringValue("GetLinkeBahamutMvnjarpipelineunfinishedResponse.Message"));
		getLinkeBahamutMvnjarpipelineunfinishedResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutMvnjarpipelineunfinishedResponse.ResponseStatusCode"));
		getLinkeBahamutMvnjarpipelineunfinishedResponse.setResult(_ctx.stringValue("GetLinkeBahamutMvnjarpipelineunfinishedResponse.Result"));
		getLinkeBahamutMvnjarpipelineunfinishedResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutMvnjarpipelineunfinishedResponse.Success"));
	 
	 	return getLinkeBahamutMvnjarpipelineunfinishedResponse;
	}
}