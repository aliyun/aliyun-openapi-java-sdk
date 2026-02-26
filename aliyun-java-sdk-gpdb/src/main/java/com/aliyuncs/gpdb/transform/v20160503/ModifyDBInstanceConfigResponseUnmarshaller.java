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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.ModifyDBInstanceConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDBInstanceConfigResponseUnmarshaller {

	public static ModifyDBInstanceConfigResponse unmarshall(ModifyDBInstanceConfigResponse modifyDBInstanceConfigResponse, UnmarshallerContext _ctx) {
		
		modifyDBInstanceConfigResponse.setRequestId(_ctx.stringValue("ModifyDBInstanceConfigResponse.RequestId"));
		modifyDBInstanceConfigResponse.setErrorMessage(_ctx.stringValue("ModifyDBInstanceConfigResponse.ErrorMessage"));
		modifyDBInstanceConfigResponse.setDbInstanceId(_ctx.stringValue("ModifyDBInstanceConfigResponse.DbInstanceId"));
		modifyDBInstanceConfigResponse.setStatus(_ctx.booleanValue("ModifyDBInstanceConfigResponse.Status"));
	 
	 	return modifyDBInstanceConfigResponse;
	}
}