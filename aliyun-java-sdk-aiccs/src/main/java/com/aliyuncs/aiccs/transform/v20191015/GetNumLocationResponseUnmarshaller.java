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

import com.aliyuncs.aiccs.model.v20191015.GetNumLocationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNumLocationResponseUnmarshaller {

	public static GetNumLocationResponse unmarshall(GetNumLocationResponse getNumLocationResponse, UnmarshallerContext _ctx) {
		
		getNumLocationResponse.setRequestId(_ctx.stringValue("GetNumLocationResponse.RequestId"));
		getNumLocationResponse.setMessage(_ctx.stringValue("GetNumLocationResponse.Message"));
		getNumLocationResponse.setData(_ctx.stringValue("GetNumLocationResponse.Data"));
		getNumLocationResponse.setCode(_ctx.stringValue("GetNumLocationResponse.Code"));
		getNumLocationResponse.setSuccess(_ctx.booleanValue("GetNumLocationResponse.Success"));
	 
	 	return getNumLocationResponse;
	}
}