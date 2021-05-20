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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetMcuLvsIpResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMcuLvsIpResponseUnmarshaller {

	public static GetMcuLvsIpResponse unmarshall(GetMcuLvsIpResponse getMcuLvsIpResponse, UnmarshallerContext _ctx) {
		
		getMcuLvsIpResponse.setRequestId(_ctx.stringValue("GetMcuLvsIpResponse.RequestId"));
		getMcuLvsIpResponse.setMessage(_ctx.stringValue("GetMcuLvsIpResponse.Message"));
		getMcuLvsIpResponse.setData(_ctx.stringValue("GetMcuLvsIpResponse.Data"));
		getMcuLvsIpResponse.setCode(_ctx.stringValue("GetMcuLvsIpResponse.Code"));
		getMcuLvsIpResponse.setSuccess(_ctx.booleanValue("GetMcuLvsIpResponse.Success"));
	 
	 	return getMcuLvsIpResponse;
	}
}