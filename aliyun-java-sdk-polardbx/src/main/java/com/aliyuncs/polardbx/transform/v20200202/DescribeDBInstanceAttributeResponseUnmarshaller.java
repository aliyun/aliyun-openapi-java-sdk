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
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstanceAttributeResponse.DBInstance.TagSetItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		DBInstance dBInstance = new DBInstance();
		dBInstance.setType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Type"));
		dBInstance.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Status"));
		dBInstance.setRightsSeparationStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.RightsSeparationStatus"));
		dBInstance.setDBNodeCount(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodeCount"));
		dBInstance.setExpired(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Expired"));
		dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.CreateTime"));
		dBInstance.setPayType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.PayType"));
		dBInstance.setPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Port"));
		dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.LockMode"));
		dBInstance.setDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Description"));
		dBInstance.setConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnectionString"));
		dBInstance.setStorageUsed(_ctx.longValue("DescribeDBInstanceAttributeResponse.DBInstance.StorageUsed"));
		dBInstance.setExpireDate(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ExpireDate"));
		dBInstance.setCommodityCode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.CommodityCode"));
		dBInstance.setMaintainStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.MaintainStartTime"));
		dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBInstanceType"));
		dBInstance.setDBNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodeClass"));
		dBInstance.setLatestMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.LatestMinorVersion"));
		dBInstance.setMaintainEndTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.MaintainEndTime"));
		dBInstance.setDBType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBType"));
		dBInstance.setRightsSeparationEnabled(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.DBInstance.RightsSeparationEnabled"));
		dBInstance.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.VPCId"));
		dBInstance.setMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.MinorVersion"));
		dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.RegionId"));
		dBInstance.setNetwork(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Network"));
		dBInstance.setDBVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBVersion"));
		dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.VSwitchId"));
		dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ZoneId"));
		dBInstance.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Engine"));
		dBInstance.setKindCode(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstance.KindCode"));
		dBInstance.setId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Id"));
		dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ResourceGroupId"));
		dBInstance.setCnNodeCount(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstance.CnNodeCount"));
		dBInstance.setDnNodeCount(_ctx.integerValue("DescribeDBInstanceAttributeResponse.DBInstance.DnNodeCount"));
		dBInstance.setCnNodeClassCode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.CnNodeClassCode"));
		dBInstance.setDnNodeClassCode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DnNodeClassCode"));
		dBInstance.setSeries(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.Series"));
		dBInstance.setTopologyType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.TopologyType"));
		dBInstance.setPrimaryZone(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.PrimaryZone"));
		dBInstance.setSecondaryZone(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.SecondaryZone"));
		dBInstance.setTertiaryZone(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.TertiaryZone"));
		dBInstance.setDifferentDNSpec(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.DBInstance.DifferentDNSpec"));
		dBInstance.setColumnarInstanceName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ColumnarInstanceName"));
		dBInstance.setCanNotCreateColumnar(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.DBInstance.CanNotCreateColumnar"));

		List<String> readDBInstances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstance.ReadDBInstances.Length"); i++) {
			readDBInstances.add(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ReadDBInstances["+ i +"]"));
		}
		dBInstance.setReadDBInstances(readDBInstances);

		List<String> columnarReadDBInstances = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstance.ColumnarReadDBInstances.Length"); i++) {
			columnarReadDBInstances.add(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ColumnarReadDBInstances["+ i +"]"));
		}
		dBInstance.setColumnarReadDBInstances(columnarReadDBInstances);

		List<String> lTSVersions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstance.LTSVersions.Length"); i++) {
			lTSVersions.add(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.LTSVersions["+ i +"]"));
		}
		dBInstance.setLTSVersions(lTSVersions);

		List<DBNode> dBNodes = new ArrayList<DBNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes.Length"); i++) {
			DBNode dBNode = new DBNode();
			dBNode.setComputeNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes["+ i +"].ComputeNodeId"));
			dBNode.setNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes["+ i +"].NodeClass"));
			dBNode.setDataNodeId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes["+ i +"].DataNodeId"));
			dBNode.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes["+ i +"].ZoneId"));
			dBNode.setId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes["+ i +"].Id"));
			dBNode.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.DBNodes["+ i +"].RegionId"));

			dBNodes.add(dBNode);
		}
		dBInstance.setDBNodes(dBNodes);

		List<ConnAddr> connAddrs = new ArrayList<ConnAddr>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs.Length"); i++) {
			ConnAddr connAddr = new ConnAddr();
			connAddr.setType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].Type"));
			connAddr.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].VSwitchId"));
			connAddr.setPort(_ctx.longValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].Port"));
			connAddr.setVPCId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].VPCId"));
			connAddr.setConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].ConnectionString"));
			connAddr.setVpcInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.ConnAddrs["+ i +"].VpcInstanceId"));

			connAddrs.add(connAddr);
		}
		dBInstance.setConnAddrs(connAddrs);

		List<TagSetItem> tagSet = new ArrayList<TagSetItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBInstance.TagSet.Length"); i++) {
			TagSetItem tagSetItem = new TagSetItem();
			tagSetItem.setKey(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.TagSet["+ i +"].Key"));
			tagSetItem.setValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstance.TagSet["+ i +"].Value"));

			tagSet.add(tagSetItem);
		}
		dBInstance.setTagSet(tagSet);
		describeDBInstanceAttributeResponse.setDBInstance(dBInstance);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}