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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceAttributeResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceAttributeResponse.DBInstance;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceAttributeResponse.DBInstance.ConnAddr;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceAttributeResponse.DBInstance.DBNode;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		DBInstance dBInstance = new DBInstance();
		dBInstance.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Status"));
		dBInstance.setDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Description"));
		dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ZoneId"));
		dBInstance.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.VPCId"));
		dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.CreateTime"));
		dBInstance.setExpired(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Expired"));
		dBInstance.setPayType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.PayType"));
		dBInstance.setDBType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBType"));
		dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.LockMode"));
		dBInstance.setStorageUsed(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.StorageUsed"));
		dBInstance.setDBVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBVersion"));
		dBInstance.setNetwork(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Network"));
		dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.RegionId"));
		dBInstance.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Engine"));
		dBInstance.setId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Id"));
		dBInstance.setConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnectionString"));
		dBInstance.setPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Port"));
		dBInstance.setMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.MinorVersion"));
		dBInstance.setLatestMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.LatestMinorVersion"));
		dBInstance.setDBNodeCount(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodeCount"));
		dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBInstanceType"));
		dBInstance.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.MaintainStartTime"));
		dBInstance.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.MaintainEndTime"));
		dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.VSwitchId"));
		dBInstance.setCommodityCode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.CommodityCode"));
		dBInstance.setExpireDate(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ExpireDate"));
		dBInstance.setType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Type"));
		dBInstance.setDBNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodeClass"));

		List<String> readDBInstances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstance.ReadDBInstances.Length"); i++) {
			readDBInstances.add(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ReadDBInstances["+ i +"]"));
		}
		dBInstance.setReadDBInstances(readDBInstances);

		List<DBNode> dBNodes = new ArrayList<DBNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes.Length"); i++) {
			DBNode dBNode = new DBNode();
			dBNode.setId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes["+ i +"].Id"));
			dBNode.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes["+ i +"].NodeClass"));
			dBNode.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes["+ i +"].RegionId"));
			dBNode.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes["+ i +"].ZoneId"));

			dBNodes.add(dBNode);
		}
		dBInstance.setDBNodes(dBNodes);

		List<ConnAddr> connAddrs = new ArrayList<ConnAddr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs.Length"); i++) {
			ConnAddr connAddr = new ConnAddr();
			connAddr.setConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].ConnectionString"));
			connAddr.setPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].Port"));
			connAddr.setType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].Type"));
			connAddr.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].VPCId"));
			connAddr.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].VSwitchId"));

			connAddrs.add(connAddr);
		}
		dBInstance.setConnAddrs(connAddrs);
		describeDBInstanceAttributeResponse.setDBInstance(dBInstance);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}