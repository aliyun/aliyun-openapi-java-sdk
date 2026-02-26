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

package com.aliyuncs.polardb.transform.v20170801;

import com.aliyuncs.polardb.model.v20170801.ModifyEncryptionDBRolePrivilegeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyEncryptionDBRolePrivilegeResponseUnmarshaller {

	public static ModifyEncryptionDBRolePrivilegeResponse unmarshall(ModifyEncryptionDBRolePrivilegeResponse modifyEncryptionDBRolePrivilegeResponse, UnmarshallerContext _ctx) {
		
		modifyEncryptionDBRolePrivilegeResponse.setRequestId(_ctx.stringValue("ModifyEncryptionDBRolePrivilegeResponse.RequestId"));
		modifyEncryptionDBRolePrivilegeResponse.setDBClusterId(_ctx.stringValue("ModifyEncryptionDBRolePrivilegeResponse.DBClusterId"));
	 
	 	return modifyEncryptionDBRolePrivilegeResponse;
	}
}