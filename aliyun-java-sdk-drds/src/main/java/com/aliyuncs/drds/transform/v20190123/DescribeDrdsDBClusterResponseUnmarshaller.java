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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeDrdsDBClusterResponse;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDBClusterResponse.DbInstance;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDBClusterResponse.DbInstance.DBNode;
import com.aliyuncs.drds.model.v20190123.DescribeDrdsDBClusterResponse.DbInstance.Endpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDrdsDBClusterResponseUnmarshaller {

	public static DescribeDrdsDBClusterResponse unmarshall(DescribeDrdsDBClusterResponse describeDrdsDBClusterResponse, UnmarshallerContext _ctx) {
		
		describeDrdsDBClusterResponse.setRequestId(_ctx.stringValue("DescribeDrdsDBClusterResponse.RequestId"));
		describeDrdsDBClusterResponse.setSuccess(_ctx.booleanValue("DescribeDrdsDBClusterResponse.Success"));

		DbInstance dbInstance = new DbInstance();
		dbInstance.setDBInstanceId(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.DBInstanceId"));
		dbInstance.setPort(_ctx.integerValue("DescribeDrdsDBClusterResponse.DbInstance.Port"));
		dbInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.DBInstanceStatus"));
		dbInstance.setDbInstType(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.DbInstType"));
		dbInstance.setEngine(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.Engine"));
		dbInstance.setEngineVersion(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.EngineVersion"));
		dbInstance.setRdsInstType(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.RdsInstType"));
		dbInstance.setPayType(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.PayType"));
		dbInstance.setExpireTime(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.ExpireTime"));
		dbInstance.setRemainDays(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.RemainDays"));
		dbInstance.setNetworkType(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.NetworkType"));

		List<Endpoint> endpoints = new ArrayList<Endpoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsDBClusterResponse.DbInstance.Endpoints.Length"); i++) {
			Endpoint endpoint = new Endpoint();
			endpoint.setNodeIds(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.Endpoints["+ i +"].NodeIds"));
			endpoint.setEndpointId(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.Endpoints["+ i +"].EndpointId"));
			endpoint.setReadWeight(_ctx.integerValue("DescribeDrdsDBClusterResponse.DbInstance.Endpoints["+ i +"].ReadWeight"));

			endpoints.add(endpoint);
		}
		dbInstance.setEndpoints(endpoints);

		List<DBNode> dBNodes = new ArrayList<DBNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDrdsDBClusterResponse.DbInstance.DBNodes.Length"); i++) {
			DBNode dBNode = new DBNode();
			dBNode.setDBNodeId(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.DBNodes["+ i +"].DBNodeId"));
			dBNode.setZoneId(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.DBNodes["+ i +"].ZoneId"));
			dBNode.setDBNodeStatus(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.DBNodes["+ i +"].DBNodeStatus"));
			dBNode.setDBNodeRole(_ctx.stringValue("DescribeDrdsDBClusterResponse.DbInstance.DBNodes["+ i +"].DBNodeRole"));

			dBNodes.add(dBNode);
		}
		dbInstance.setDBNodes(dBNodes);
		describeDrdsDBClusterResponse.setDbInstance(dbInstance);
	 
	 	return describeDrdsDBClusterResponse;
	}
}