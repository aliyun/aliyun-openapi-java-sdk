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

package com.aliyuncs.polardbx.transform.v20200202;

import com.aliyuncs.polardbx.model.v20200202.ModifyDBInstanceConnectionStringResponse;
import com.aliyuncs.polardbx.model.v20200202.ModifyDBInstanceConnectionStringResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDBInstanceConnectionStringResponseUnmarshaller {

	public static ModifyDBInstanceConnectionStringResponse unmarshall(ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionStringResponse, UnmarshallerContext _ctx) {
		
		modifyDBInstanceConnectionStringResponse.setRequestId(_ctx.stringValue("ModifyDBInstanceConnectionStringResponse.RequestId"));
		modifyDBInstanceConnectionStringResponse.setMessage(_ctx.stringValue("ModifyDBInstanceConnectionStringResponse.Message"));
		modifyDBInstanceConnectionStringResponse.setCode(_ctx.longValue("ModifyDBInstanceConnectionStringResponse.Code"));

		Data data = new Data();
		data.setConnectionString(_ctx.stringValue("ModifyDBInstanceConnectionStringResponse.Data.ConnectionString"));
		data.setDBInstanceName(_ctx.stringValue("ModifyDBInstanceConnectionStringResponse.Data.DBInstanceName"));
		data.setDBInstanceNetType(_ctx.stringValue("ModifyDBInstanceConnectionStringResponse.Data.DBInstanceNetType"));
		data.setPort(_ctx.stringValue("ModifyDBInstanceConnectionStringResponse.Data.Port"));
		modifyDBInstanceConnectionStringResponse.setData(data);
	 
	 	return modifyDBInstanceConnectionStringResponse;
	}
}