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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.UpdateClientResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateClientResponseUnmarshaller {

	public static UpdateClientResponse unmarshall(UpdateClientResponse updateClientResponse, UnmarshallerContext _ctx) {
		
		updateClientResponse.setRequestId(_ctx.stringValue("UpdateClientResponse.RequestId"));
		updateClientResponse.setSuccess(_ctx.booleanValue("UpdateClientResponse.Success"));
		updateClientResponse.setCode(_ctx.stringValue("UpdateClientResponse.Code"));
		updateClientResponse.setMessage(_ctx.stringValue("UpdateClientResponse.Message"));
	 
	 	return updateClientResponse;
	}
}