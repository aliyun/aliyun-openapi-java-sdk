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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_dg.model.v20230914.GetUserDatabasesResponse;
import com.aliyuncs.dms_dg.model.v20230914.GetUserDatabasesResponse.DbInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserDatabasesResponseUnmarshaller {

	public static GetUserDatabasesResponse unmarshall(GetUserDatabasesResponse getUserDatabasesResponse, UnmarshallerContext _ctx) {
		
		getUserDatabasesResponse.setRequestId(_ctx.stringValue("GetUserDatabasesResponse.RequestId"));
		getUserDatabasesResponse.setSuccess(_ctx.stringValue("GetUserDatabasesResponse.Success"));
		getUserDatabasesResponse.setCode(_ctx.stringValue("GetUserDatabasesResponse.Code"));
		getUserDatabasesResponse.setErrorMsg(_ctx.stringValue("GetUserDatabasesResponse.ErrorMsg"));
		getUserDatabasesResponse.setCount(_ctx.integerValue("GetUserDatabasesResponse.Count"));

		List<DbInstance> dbInstanceList = new ArrayList<DbInstance>();
		for (int i = 0; i < _ctx.lengthValue("GetUserDatabasesResponse.DbInstanceList.Length"); i++) {
			DbInstance dbInstance = new DbInstance();
			dbInstance.setPort(_ctx.integerValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].Port"));
			dbInstance.setHost(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].Host"));
			dbInstance.setGatewayId(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].GatewayId"));
			dbInstance.setDbType(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].DbType"));
			dbInstance.setRegionId(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].RegionId"));
			dbInstance.setConnectHost(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].ConnectHost"));
			dbInstance.setConnectPort(_ctx.integerValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].ConnectPort"));
			dbInstance.setServiceType(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].ServiceType"));
			dbInstance.setNetworkType(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].NetworkType"));
			dbInstance.setNodeId(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].NodeId"));
			dbInstance.setInstanceStatus(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].InstanceStatus"));
			dbInstance.setDbDescription(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].DbDescription"));
			dbInstance.setInstanceId(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].InstanceId"));
			dbInstance.setGatewayName(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].GatewayName"));
			dbInstance.setGmtCreate(_ctx.longValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].GmtCreate"));
			dbInstance.setUserId(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].UserId"));
			dbInstance.setParentId(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].ParentId"));
			dbInstance.setVpcId(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].VpcId"));
			dbInstance.setVpcInstanceId(_ctx.stringValue("GetUserDatabasesResponse.DbInstanceList["+ i +"].VpcInstanceId"));

			dbInstanceList.add(dbInstance);
		}
		getUserDatabasesResponse.setDbInstanceList(dbInstanceList);
	 
	 	return getUserDatabasesResponse;
	}
}