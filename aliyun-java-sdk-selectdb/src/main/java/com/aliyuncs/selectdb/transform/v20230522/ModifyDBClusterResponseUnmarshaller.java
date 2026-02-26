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

package com.aliyuncs.selectdb.transform.v20230522;

import com.aliyuncs.selectdb.model.v20230522.ModifyDBClusterResponse;
import com.aliyuncs.selectdb.model.v20230522.ModifyDBClusterResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDBClusterResponseUnmarshaller {

	public static ModifyDBClusterResponse unmarshall(ModifyDBClusterResponse modifyDBClusterResponse, UnmarshallerContext _ctx) {
		
		modifyDBClusterResponse.setRequestId(_ctx.stringValue("ModifyDBClusterResponse.RequestId"));
		modifyDBClusterResponse.setDBInstanceId(_ctx.stringValue("ModifyDBClusterResponse.DBInstanceId"));

		Data data = new Data();
		data.setDBInstanceId(_ctx.stringValue("ModifyDBClusterResponse.Data.DBInstanceId"));
		data.setDBClusterId(_ctx.stringValue("ModifyDBClusterResponse.Data.DBClusterId"));
		data.setOrderId(_ctx.longValue("ModifyDBClusterResponse.Data.OrderId"));
		modifyDBClusterResponse.setData(data);
	 
	 	return modifyDBClusterResponse;
	}
}