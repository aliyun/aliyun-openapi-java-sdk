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

import com.aliyuncs.rds.model.v20140815.CreateDBInstanceEndpointAddressResponse;
import com.aliyuncs.rds.model.v20140815.CreateDBInstanceEndpointAddressResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDBInstanceEndpointAddressResponseUnmarshaller {

	public static CreateDBInstanceEndpointAddressResponse unmarshall(CreateDBInstanceEndpointAddressResponse createDBInstanceEndpointAddressResponse, UnmarshallerContext _ctx) {
		
		createDBInstanceEndpointAddressResponse.setRequestId(_ctx.stringValue("CreateDBInstanceEndpointAddressResponse.RequestId"));

		Data data = new Data();
		data.setConnectionString(_ctx.stringValue("CreateDBInstanceEndpointAddressResponse.Data.ConnectionString"));
		data.setDBInstanceEndpointId(_ctx.stringValue("CreateDBInstanceEndpointAddressResponse.Data.DBInstanceEndpointId"));
		data.setDBInstanceName(_ctx.stringValue("CreateDBInstanceEndpointAddressResponse.Data.DBInstanceName"));
		createDBInstanceEndpointAddressResponse.setData(data);
	 
	 	return createDBInstanceEndpointAddressResponse;
	}
}