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

import com.aliyuncs.sofa.model.v20190815.SyncLinkeBahamutAppsynctocloudResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncLinkeBahamutAppsynctocloudResponseUnmarshaller {

	public static SyncLinkeBahamutAppsynctocloudResponse unmarshall(SyncLinkeBahamutAppsynctocloudResponse syncLinkeBahamutAppsynctocloudResponse, UnmarshallerContext _ctx) {
		
		syncLinkeBahamutAppsynctocloudResponse.setRequestId(_ctx.stringValue("SyncLinkeBahamutAppsynctocloudResponse.RequestId"));
		syncLinkeBahamutAppsynctocloudResponse.setResultCode(_ctx.stringValue("SyncLinkeBahamutAppsynctocloudResponse.ResultCode"));
		syncLinkeBahamutAppsynctocloudResponse.setResultMessage(_ctx.stringValue("SyncLinkeBahamutAppsynctocloudResponse.ResultMessage"));
		syncLinkeBahamutAppsynctocloudResponse.setErrorMessage(_ctx.stringValue("SyncLinkeBahamutAppsynctocloudResponse.ErrorMessage"));
		syncLinkeBahamutAppsynctocloudResponse.setErrorMsgParamsMap(_ctx.stringValue("SyncLinkeBahamutAppsynctocloudResponse.ErrorMsgParamsMap"));
		syncLinkeBahamutAppsynctocloudResponse.setMessage(_ctx.stringValue("SyncLinkeBahamutAppsynctocloudResponse.Message"));
		syncLinkeBahamutAppsynctocloudResponse.setResponseStatusCode(_ctx.longValue("SyncLinkeBahamutAppsynctocloudResponse.ResponseStatusCode"));
		syncLinkeBahamutAppsynctocloudResponse.setResult(_ctx.booleanValue("SyncLinkeBahamutAppsynctocloudResponse.Result"));
		syncLinkeBahamutAppsynctocloudResponse.setSuccess(_ctx.booleanValue("SyncLinkeBahamutAppsynctocloudResponse.Success"));
	 
	 	return syncLinkeBahamutAppsynctocloudResponse;
	}
}