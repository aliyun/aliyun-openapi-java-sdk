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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.ModifyDBInstanceEndpointAddressResponse;
import com.aliyuncs.rds.model.v20140815.ModifyDBInstanceEndpointAddressResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDBInstanceEndpointAddressResponseUnmarshaller {

	public static ModifyDBInstanceEndpointAddressResponse unmarshall(ModifyDBInstanceEndpointAddressResponse modifyDBInstanceEndpointAddressResponse, UnmarshallerContext _ctx) {
		
		modifyDBInstanceEndpointAddressResponse.setRequestId(_ctx.stringValue("ModifyDBInstanceEndpointAddressResponse.RequestId"));

		Data data = new Data();
		data.setDBInstanceName(_ctx.stringValue("ModifyDBInstanceEndpointAddressResponse.Data.DBInstanceName"));
		data.setDBInstanceEndpointId(_ctx.stringValue("ModifyDBInstanceEndpointAddressResponse.Data.DBInstanceEndpointId"));
		modifyDBInstanceEndpointAddressResponse.setData(data);
	 
	 	return modifyDBInstanceEndpointAddressResponse;
	}
}