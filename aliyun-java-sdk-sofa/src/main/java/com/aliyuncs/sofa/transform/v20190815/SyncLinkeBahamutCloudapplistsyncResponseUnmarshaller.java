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

import com.aliyuncs.sofa.model.v20190815.SyncLinkeBahamutCloudapplistsyncResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncLinkeBahamutCloudapplistsyncResponseUnmarshaller {

	public static SyncLinkeBahamutCloudapplistsyncResponse unmarshall(SyncLinkeBahamutCloudapplistsyncResponse syncLinkeBahamutCloudapplistsyncResponse, UnmarshallerContext _ctx) {
		
		syncLinkeBahamutCloudapplistsyncResponse.setRequestId(_ctx.stringValue("SyncLinkeBahamutCloudapplistsyncResponse.RequestId"));
		syncLinkeBahamutCloudapplistsyncResponse.setResultCode(_ctx.stringValue("SyncLinkeBahamutCloudapplistsyncResponse.ResultCode"));
		syncLinkeBahamutCloudapplistsyncResponse.setResultMessage(_ctx.stringValue("SyncLinkeBahamutCloudapplistsyncResponse.ResultMessage"));
		syncLinkeBahamutCloudapplistsyncResponse.setErrorMessage(_ctx.stringValue("SyncLinkeBahamutCloudapplistsyncResponse.ErrorMessage"));
		syncLinkeBahamutCloudapplistsyncResponse.setErrorMsgParamsMap(_ctx.stringValue("SyncLinkeBahamutCloudapplistsyncResponse.ErrorMsgParamsMap"));
		syncLinkeBahamutCloudapplistsyncResponse.setMessage(_ctx.stringValue("SyncLinkeBahamutCloudapplistsyncResponse.Message"));
		syncLinkeBahamutCloudapplistsyncResponse.setResponseStatusCode(_ctx.longValue("SyncLinkeBahamutCloudapplistsyncResponse.ResponseStatusCode"));
		syncLinkeBahamutCloudapplistsyncResponse.setResult(_ctx.stringValue("SyncLinkeBahamutCloudapplistsyncResponse.Result"));
		syncLinkeBahamutCloudapplistsyncResponse.setSuccess(_ctx.booleanValue("SyncLinkeBahamutCloudapplistsyncResponse.Success"));
	 
	 	return syncLinkeBahamutCloudapplistsyncResponse;
	}
}