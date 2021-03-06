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

import com.aliyuncs.datalake.model.v20200710.UnLockResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UnLockResponseUnmarshaller {

	public static UnLockResponse unmarshall(UnLockResponse unLockResponse, UnmarshallerContext _ctx) {
		
		unLockResponse.setRequestId(_ctx.stringValue("UnLockResponse.RequestId"));
		unLockResponse.setMessage(_ctx.stringValue("UnLockResponse.Message"));
		unLockResponse.setCode(_ctx.stringValue("UnLockResponse.Code"));
		unLockResponse.setSuccess(_ctx.booleanValue("UnLockResponse.Success"));
	 
	 	return unLockResponse;
	}
}