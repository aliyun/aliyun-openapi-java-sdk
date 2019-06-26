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

package com.aliyuncs.gpdb.transform.v20190620;

import com.aliyuncs.gpdb.model.v20190620.ModifyDBInstanceSecurityIpsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDBInstanceSecurityIpsResponseUnmarshaller {

	public static ModifyDBInstanceSecurityIpsResponse unmarshall(ModifyDBInstanceSecurityIpsResponse modifyDBInstanceSecurityIpsResponse, UnmarshallerContext context) {
		
		modifyDBInstanceSecurityIpsResponse.setRequestId(context.stringValue("ModifyDBInstanceSecurityIpsResponse.RequestId"));
		modifyDBInstanceSecurityIpsResponse.setSuccess(context.booleanValue("ModifyDBInstanceSecurityIpsResponse.Success"));
		modifyDBInstanceSecurityIpsResponse.setHttpStatusCode(context.integerValue("ModifyDBInstanceSecurityIpsResponse.HttpStatusCode"));
		modifyDBInstanceSecurityIpsResponse.setCode(context.stringValue("ModifyDBInstanceSecurityIpsResponse.Code"));
		modifyDBInstanceSecurityIpsResponse.setMessage(context.stringValue("ModifyDBInstanceSecurityIpsResponse.Message"));
	 
	 	return modifyDBInstanceSecurityIpsResponse;
	}
}