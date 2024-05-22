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

import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceViaEndpointResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceViaEndpointResponse.DBInstance;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceViaEndpointResponse.DBInstance.ConnAddr;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceViaEndpointResponse.DBInstance.DBNode;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceViaEndpointResponse.DBInstance.TagSetItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceViaEndpointResponseUnmarshaller {

	public static DescribeDBInstanceViaEndpointResponse unmarshall(DescribeDBInstanceViaEndpointResponse describeDBInstanceViaEndpointResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceViaEndpointResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.RequestId"));

		DBInstance dBInstance = new DBInstance();
		dBInstance.setType(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.Type"));
		dBInstance.setStatus(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.Status"));
		dBInstance.setRightsSeparationStatus(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.RightsSeparationStatus"));
		dBInstance.setDBNodeCount(_ctx.integerValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBNodeCount"));
		dBInstance.setExpired(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.Expired"));
		dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.CreateTime"));
		dBInstance.setPayType(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.PayType"));
		dBInstance.setPort(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.Port"));
		dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.LockMode"));
		dBInstance.setDescription(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.Description"));
		dBInstance.setConnectionString(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ConnectionString"));
		dBInstance.setStorageUsed(_ctx.longValue("DescribeDBInstanceViaEndpointResponse.DBInstance.StorageUsed"));
		dBInstance.setExpireDate(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ExpireDate"));
		dBInstance.setCommodityCode(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.CommodityCode"));
		dBInstance.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.MaintainStartTime"));
		dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBInstanceType"));
		dBInstance.setDBNodeClass(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBNodeClass"));
		dBInstance.setLatestMinorVersion(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.LatestMinorVersion"));
		dBInstance.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.MaintainEndTime"));
		dBInstance.setDBType(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBType"));
		dBInstance.setRightsSeparationEnabled(_ctx.booleanValue("DescribeDBInstanceViaEndpointResponse.DBInstance.RightsSeparationEnabled"));
		dBInstance.setVPCId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.VPCId"));
		dBInstance.setMinorVersion(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.MinorVersion"));
		dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.RegionId"));
		dBInstance.setNetwork(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.Network"));
		dBInstance.setDBVersion(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBVersion"));
		dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.VSwitchId"));
		dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ZoneId"));
		dBInstance.setEngine(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.Engine"));
		dBInstance.setKindCode(_ctx.integerValue("DescribeDBInstanceViaEndpointResponse.DBInstance.KindCode"));
		dBInstance.setId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.Id"));
		dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ResourceGroupId"));
		dBInstance.setCnNodeCount(_ctx.integerValue("DescribeDBInstanceViaEndpointResponse.DBInstance.CnNodeCount"));
		dBInstance.setDnNodeCount(_ctx.integerValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DnNodeCount"));
		dBInstance.setCnNodeClassCode(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.CnNodeClassCode"));
		dBInstance.setDnNodeClassCode(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DnNodeClassCode"));
		dBInstance.setSeries(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.Series"));

		List<String> readDBInstances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ReadDBInstances.Length"); i++) {
			readDBInstances.add(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ReadDBInstances["+ i +"]"));
		}
		dBInstance.setReadDBInstances(readDBInstances);

		List<String> lTSVersions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceViaEndpointResponse.DBInstance.LTSVersions.Length"); i++) {
			lTSVersions.add(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.LTSVersions["+ i +"]"));
		}
		dBInstance.setLTSVersions(lTSVersions);

		List<DBNode> dBNodes = new ArrayList<DBNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBNodes.Length"); i++) {
			DBNode dBNode = new DBNode();
			dBNode.setComputeNodeId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBNodes["+ i +"].ComputeNodeId"));
			dBNode.setNodeClass(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBNodes["+ i +"].NodeClass"));
			dBNode.setDataNodeId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBNodes["+ i +"].DataNodeId"));
			dBNode.setZoneId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBNodes["+ i +"].ZoneId"));
			dBNode.setId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBNodes["+ i +"].Id"));
			dBNode.setRegionId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.DBNodes["+ i +"].RegionId"));

			dBNodes.add(dBNode);
		}
		dBInstance.setDBNodes(dBNodes);

		List<ConnAddr> connAddrs = new ArrayList<ConnAddr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ConnAddrs.Length"); i++) {
			ConnAddr connAddr = new ConnAddr();
			connAddr.setType(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ConnAddrs["+ i +"].Type"));
			connAddr.setVSwitchId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ConnAddrs["+ i +"].VSwitchId"));
			connAddr.setPort(_ctx.longValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ConnAddrs["+ i +"].Port"));
			connAddr.setVPCId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ConnAddrs["+ i +"].VPCId"));
			connAddr.setConnectionString(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ConnAddrs["+ i +"].ConnectionString"));
			connAddr.setVpcInstanceId(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.ConnAddrs["+ i +"].VpcInstanceId"));

			connAddrs.add(connAddr);
		}
		dBInstance.setConnAddrs(connAddrs);

		List<TagSetItem> tagSet = new ArrayList<TagSetItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceViaEndpointResponse.DBInstance.TagSet.Length"); i++) {
			TagSetItem tagSetItem = new TagSetItem();
			tagSetItem.setKey(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.TagSet["+ i +"].Key"));
			tagSetItem.setValue(_ctx.stringValue("DescribeDBInstanceViaEndpointResponse.DBInstance.TagSet["+ i +"].Value"));

			tagSet.add(tagSetItem);
		}
		dBInstance.setTagSet(tagSet);
		describeDBInstanceViaEndpointResponse.setDBInstance(dBInstance);
	 
	 	return describeDBInstanceViaEndpointResponse;
	}
}