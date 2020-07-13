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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.AccessHDMInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AccessHDMInstanceResponseUnmarshaller {

	public static AccessHDMInstanceResponse unmarshall(AccessHDMInstanceResponse accessHDMInstanceResponse, UnmarshallerContext _ctx) {
		
		accessHDMInstanceResponse.setRequestId(_ctx.stringValue("AccessHDMInstanceResponse.RequestId"));
		accessHDMInstanceResponse.setCode(_ctx.stringValue("AccessHDMInstanceResponse.Code"));
		accessHDMInstanceResponse.setData(_ctx.stringValue("AccessHDMInstanceResponse.Data"));
		accessHDMInstanceResponse.setMessage(_ctx.stringValue("AccessHDMInstanceResponse.Message"));
		accessHDMInstanceResponse.setSuccess(_ctx.stringValue("AccessHDMInstanceResponse.Success"));
		accessHDMInstanceResponse.setSynchro(_ctx.stringValue("AccessHDMInstanceResponse.Synchro"));
	 
	 	return accessHDMInstanceResponse;
	}
}