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

package com.aliyuncs.gdb.transform.v20181129;

import com.aliyuncs.gdb.model.v20181129.ModifyDBInstanceMaintainTimeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDBInstanceMaintainTimeResponseUnmarshaller {

	public static ModifyDBInstanceMaintainTimeResponse unmarshall(ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTimeResponse, UnmarshallerContext context) {
		
		modifyDBInstanceMaintainTimeResponse.setRequestId(context.stringValue("ModifyDBInstanceMaintainTimeResponse.RequestId"));
		modifyDBInstanceMaintainTimeResponse.setCode(context.stringValue("ModifyDBInstanceMaintainTimeResponse.Code"));
		modifyDBInstanceMaintainTimeResponse.setData(context.stringValue("ModifyDBInstanceMaintainTimeResponse.Data"));
		modifyDBInstanceMaintainTimeResponse.setMessage(context.stringValue("ModifyDBInstanceMaintainTimeResponse.Message"));
		modifyDBInstanceMaintainTimeResponse.setSuccess(context.stringValue("ModifyDBInstanceMaintainTimeResponse.Success"));
		modifyDBInstanceMaintainTimeResponse.setSynchro(context.stringValue("ModifyDBInstanceMaintainTimeResponse.Synchro"));
	 
	 	return modifyDBInstanceMaintainTimeResponse;
	}
}