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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.SyncMessageResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncMessageResponseUnmarshaller {

	public static SyncMessageResponse unmarshall(SyncMessageResponse syncMessageResponse, UnmarshallerContext _ctx) {
		
		syncMessageResponse.setRequestId(_ctx.stringValue("SyncMessageResponse.RequestId"));
		syncMessageResponse.setSuccess(_ctx.booleanValue("SyncMessageResponse.Success"));
		syncMessageResponse.setCode(_ctx.stringValue("SyncMessageResponse.Code"));
		syncMessageResponse.setMessage(_ctx.stringValue("SyncMessageResponse.Message"));
	 
	 	return syncMessageResponse;
	}
}