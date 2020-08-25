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

import com.aliyuncs.sofa.model.v20190815.SyncLinkeBahamutAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncLinkeBahamutAppResponseUnmarshaller {

	public static SyncLinkeBahamutAppResponse unmarshall(SyncLinkeBahamutAppResponse syncLinkeBahamutAppResponse, UnmarshallerContext _ctx) {
		
		syncLinkeBahamutAppResponse.setRequestId(_ctx.stringValue("SyncLinkeBahamutAppResponse.RequestId"));
		syncLinkeBahamutAppResponse.setResultCode(_ctx.stringValue("SyncLinkeBahamutAppResponse.ResultCode"));
		syncLinkeBahamutAppResponse.setResultMessage(_ctx.stringValue("SyncLinkeBahamutAppResponse.ResultMessage"));
		syncLinkeBahamutAppResponse.setErrorMessage(_ctx.stringValue("SyncLinkeBahamutAppResponse.ErrorMessage"));
		syncLinkeBahamutAppResponse.setErrorMsgParamsMap(_ctx.stringValue("SyncLinkeBahamutAppResponse.ErrorMsgParamsMap"));
		syncLinkeBahamutAppResponse.setMessage(_ctx.stringValue("SyncLinkeBahamutAppResponse.Message"));
		syncLinkeBahamutAppResponse.setResponseStatusCode(_ctx.longValue("SyncLinkeBahamutAppResponse.ResponseStatusCode"));
		syncLinkeBahamutAppResponse.setSuccess(_ctx.booleanValue("SyncLinkeBahamutAppResponse.Success"));
	 
	 	return syncLinkeBahamutAppResponse;
	}
}