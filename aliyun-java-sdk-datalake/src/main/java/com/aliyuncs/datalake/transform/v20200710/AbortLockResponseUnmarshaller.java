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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.AbortLockResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AbortLockResponseUnmarshaller {

	public static AbortLockResponse unmarshall(AbortLockResponse abortLockResponse, UnmarshallerContext _ctx) {
		
		abortLockResponse.setRequestId(_ctx.stringValue("AbortLockResponse.RequestId"));
		abortLockResponse.setMessage(_ctx.stringValue("AbortLockResponse.Message"));
		abortLockResponse.setCode(_ctx.stringValue("AbortLockResponse.Code"));
		abortLockResponse.setSuccess(_ctx.booleanValue("AbortLockResponse.Success"));
	 
	 	return abortLockResponse;
	}
}