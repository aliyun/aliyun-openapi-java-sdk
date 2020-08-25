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

import com.aliyuncs.sofa.model.v20190815.SyncLinkeBahamutAdminsyncappResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncLinkeBahamutAdminsyncappResponseUnmarshaller {

	public static SyncLinkeBahamutAdminsyncappResponse unmarshall(SyncLinkeBahamutAdminsyncappResponse syncLinkeBahamutAdminsyncappResponse, UnmarshallerContext _ctx) {
		
		syncLinkeBahamutAdminsyncappResponse.setRequestId(_ctx.stringValue("SyncLinkeBahamutAdminsyncappResponse.RequestId"));
		syncLinkeBahamutAdminsyncappResponse.setResultCode(_ctx.stringValue("SyncLinkeBahamutAdminsyncappResponse.ResultCode"));
		syncLinkeBahamutAdminsyncappResponse.setResultMessage(_ctx.stringValue("SyncLinkeBahamutAdminsyncappResponse.ResultMessage"));
		syncLinkeBahamutAdminsyncappResponse.setErrorMessage(_ctx.stringValue("SyncLinkeBahamutAdminsyncappResponse.ErrorMessage"));
		syncLinkeBahamutAdminsyncappResponse.setErrorMsgParamsMap(_ctx.stringValue("SyncLinkeBahamutAdminsyncappResponse.ErrorMsgParamsMap"));
		syncLinkeBahamutAdminsyncappResponse.setMessage(_ctx.stringValue("SyncLinkeBahamutAdminsyncappResponse.Message"));
		syncLinkeBahamutAdminsyncappResponse.setResponseStatusCode(_ctx.longValue("SyncLinkeBahamutAdminsyncappResponse.ResponseStatusCode"));
		syncLinkeBahamutAdminsyncappResponse.setResult(_ctx.booleanValue("SyncLinkeBahamutAdminsyncappResponse.Result"));
		syncLinkeBahamutAdminsyncappResponse.setSuccess(_ctx.booleanValue("SyncLinkeBahamutAdminsyncappResponse.Success"));
	 
	 	return syncLinkeBahamutAdminsyncappResponse;
	}
}