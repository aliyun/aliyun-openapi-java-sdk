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

package com.aliyuncs.marketing_event.transform.v20210101;

import com.aliyuncs.marketing_event.model.v20210101.SyncSignInInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncSignInInfoResponseUnmarshaller {

	public static SyncSignInInfoResponse unmarshall(SyncSignInInfoResponse syncSignInInfoResponse, UnmarshallerContext _ctx) {
		
		syncSignInInfoResponse.setRequestId(_ctx.stringValue("SyncSignInInfoResponse.RequestId"));
		syncSignInInfoResponse.setCode(_ctx.stringValue("SyncSignInInfoResponse.Code"));
		syncSignInInfoResponse.setSuccess(_ctx.booleanValue("SyncSignInInfoResponse.Success"));
		syncSignInInfoResponse.setMessage(_ctx.stringValue("SyncSignInInfoResponse.Message"));
		syncSignInInfoResponse.setData(_ctx.integerValue("SyncSignInInfoResponse.Data"));
	 
	 	return syncSignInInfoResponse;
	}
}