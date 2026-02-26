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

package com.aliyuncs.dms_dg.transform.v20230914;

import com.aliyuncs.dms_dg.model.v20230914.AddDatabaseResponse;
import com.aliyuncs.dms_dg.model.v20230914.AddDatabaseResponse.DbInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddDatabaseResponseUnmarshaller {

	public static AddDatabaseResponse unmarshall(AddDatabaseResponse addDatabaseResponse, UnmarshallerContext _ctx) {
		
		addDatabaseResponse.setRequestId(_ctx.stringValue("AddDatabaseResponse.RequestId"));
		addDatabaseResponse.setCode(_ctx.stringValue("AddDatabaseResponse.Code"));
		addDatabaseResponse.setErrorMsg(_ctx.stringValue("AddDatabaseResponse.ErrorMsg"));
		addDatabaseResponse.setSuccess(_ctx.booleanValue("AddDatabaseResponse.Success"));

		DbInstance dbInstance = new DbInstance();
		dbInstance.setPort(_ctx.integerValue("AddDatabaseResponse.DbInstance.Port"));
		dbInstance.setHost(_ctx.stringValue("AddDatabaseResponse.DbInstance.Host"));
		dbInstance.setGatewayId(_ctx.stringValue("AddDatabaseResponse.DbInstance.GatewayId"));
		dbInstance.setDbType(_ctx.stringValue("AddDatabaseResponse.DbInstance.DbType"));
		dbInstance.setRegionId(_ctx.stringValue("AddDatabaseResponse.DbInstance.RegionId"));
		dbInstance.setConnectHost(_ctx.stringValue("AddDatabaseResponse.DbInstance.ConnectHost"));
		dbInstance.setConnectPort(_ctx.integerValue("AddDatabaseResponse.DbInstance.ConnectPort"));
		dbInstance.setServiceType(_ctx.stringValue("AddDatabaseResponse.DbInstance.ServiceType"));
		dbInstance.setNetworkType(_ctx.stringValue("AddDatabaseResponse.DbInstance.NetworkType"));
		dbInstance.setNodeId(_ctx.stringValue("AddDatabaseResponse.DbInstance.NodeId"));
		dbInstance.setInstanceStatus(_ctx.stringValue("AddDatabaseResponse.DbInstance.InstanceStatus"));
		dbInstance.setDbDescription(_ctx.stringValue("AddDatabaseResponse.DbInstance.DbDescription"));
		dbInstance.setInstanceId(_ctx.stringValue("AddDatabaseResponse.DbInstance.InstanceId"));
		dbInstance.setGatewayName(_ctx.stringValue("AddDatabaseResponse.DbInstance.GatewayName"));
		dbInstance.setUserId(_ctx.stringValue("AddDatabaseResponse.DbInstance.UserId"));
		dbInstance.setParentId(_ctx.stringValue("AddDatabaseResponse.DbInstance.ParentId"));
		dbInstance.setVpcId(_ctx.stringValue("AddDatabaseResponse.DbInstance.VpcId"));
		dbInstance.setVpcInstanceId(_ctx.stringValue("AddDatabaseResponse.DbInstance.VpcInstanceId"));
		addDatabaseResponse.setDbInstance(dbInstance);
	 
	 	return addDatabaseResponse;
	}
}