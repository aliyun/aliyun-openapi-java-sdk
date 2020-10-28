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

import com.aliyuncs.polardbx.model.v20200202.CreateDBInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDBInstanceResponseUnmarshaller {

	public static CreateDBInstanceResponse unmarshall(CreateDBInstanceResponse createDBInstanceResponse, UnmarshallerContext _ctx) {
		
		createDBInstanceResponse.setRequestId(_ctx.stringValue("CreateDBInstanceResponse.RequestId"));
		createDBInstanceResponse.setDBInstanceName(_ctx.stringValue("CreateDBInstanceResponse.DBInstanceName"));
		createDBInstanceResponse.setOrderId(_ctx.stringValue("CreateDBInstanceResponse.OrderId"));
		createDBInstanceResponse.setConnectionString(_ctx.stringValue("CreateDBInstanceResponse.ConnectionString"));
		createDBInstanceResponse.setPort(_ctx.integerValue("CreateDBInstanceResponse.Port"));
	 
	 	return createDBInstanceResponse;
	}
}