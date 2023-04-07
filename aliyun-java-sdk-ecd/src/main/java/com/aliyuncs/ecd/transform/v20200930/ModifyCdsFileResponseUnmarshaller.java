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

package com.aliyuncs.ecd.transform.v20200930;

import com.aliyuncs.ecd.model.v20200930.ModifyCdsFileResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyCdsFileResponseUnmarshaller {

	public static ModifyCdsFileResponse unmarshall(ModifyCdsFileResponse modifyCdsFileResponse, UnmarshallerContext _ctx) {
		
		modifyCdsFileResponse.setRequestId(_ctx.stringValue("ModifyCdsFileResponse.RequestId"));
		modifyCdsFileResponse.setCode(_ctx.stringValue("ModifyCdsFileResponse.Code"));
		modifyCdsFileResponse.setSuccess(_ctx.booleanValue("ModifyCdsFileResponse.Success"));
		modifyCdsFileResponse.setData(_ctx.stringValue("ModifyCdsFileResponse.Data"));
		modifyCdsFileResponse.setMessage(_ctx.stringValue("ModifyCdsFileResponse.Message"));
	 
	 	return modifyCdsFileResponse;
	}
}