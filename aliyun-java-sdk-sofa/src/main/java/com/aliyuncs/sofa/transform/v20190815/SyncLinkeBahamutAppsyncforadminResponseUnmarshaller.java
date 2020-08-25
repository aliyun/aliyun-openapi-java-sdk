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

import com.aliyuncs.sofa.model.v20190815.SyncLinkeBahamutAppsyncforadminResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncLinkeBahamutAppsyncforadminResponseUnmarshaller {

	public static SyncLinkeBahamutAppsyncforadminResponse unmarshall(SyncLinkeBahamutAppsyncforadminResponse syncLinkeBahamutAppsyncforadminResponse, UnmarshallerContext _ctx) {
		
		syncLinkeBahamutAppsyncforadminResponse.setRequestId(_ctx.stringValue("SyncLinkeBahamutAppsyncforadminResponse.RequestId"));
		syncLinkeBahamutAppsyncforadminResponse.setResultCode(_ctx.stringValue("SyncLinkeBahamutAppsyncforadminResponse.ResultCode"));
		syncLinkeBahamutAppsyncforadminResponse.setResultMessage(_ctx.stringValue("SyncLinkeBahamutAppsyncforadminResponse.ResultMessage"));
		syncLinkeBahamutAppsyncforadminResponse.setErrorMessage(_ctx.stringValue("SyncLinkeBahamutAppsyncforadminResponse.ErrorMessage"));
		syncLinkeBahamutAppsyncforadminResponse.setErrorMsgParamsMap(_ctx.stringValue("SyncLinkeBahamutAppsyncforadminResponse.ErrorMsgParamsMap"));
		syncLinkeBahamutAppsyncforadminResponse.setMessage(_ctx.stringValue("SyncLinkeBahamutAppsyncforadminResponse.Message"));
		syncLinkeBahamutAppsyncforadminResponse.setResponseStatusCode(_ctx.longValue("SyncLinkeBahamutAppsyncforadminResponse.ResponseStatusCode"));
		syncLinkeBahamutAppsyncforadminResponse.setSuccess(_ctx.booleanValue("SyncLinkeBahamutAppsyncforadminResponse.Success"));
	 
	 	return syncLinkeBahamutAppsyncforadminResponse;
	}
}