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

import com.aliyuncs.hbr.model.v20170908.CreateVaultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateVaultResponseUnmarshaller {

	public static CreateVaultResponse unmarshall(CreateVaultResponse createVaultResponse, UnmarshallerContext _ctx) {
		
		createVaultResponse.setRequestId(_ctx.stringValue("CreateVaultResponse.RequestId"));
		createVaultResponse.setSuccess(_ctx.booleanValue("CreateVaultResponse.Success"));
		createVaultResponse.setCode(_ctx.stringValue("CreateVaultResponse.Code"));
		createVaultResponse.setMessage(_ctx.stringValue("CreateVaultResponse.Message"));
		createVaultResponse.setVaultId(_ctx.stringValue("CreateVaultResponse.VaultId"));
		createVaultResponse.setTaskId(_ctx.stringValue("CreateVaultResponse.TaskId"));
	 
	 	return createVaultResponse;
	}
}