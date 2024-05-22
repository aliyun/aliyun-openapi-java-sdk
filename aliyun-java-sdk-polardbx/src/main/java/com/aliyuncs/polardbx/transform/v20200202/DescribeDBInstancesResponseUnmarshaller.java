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

import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstancesResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstancesResponse.DBInstance;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstancesResponse.DBInstance.PolarDBXNode;
import com.aliyuncs.polardbx.model.v20200202.DescribeDBInstancesResponse.DBInstance.TagSetItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesResponseUnmarshaller {

	public static DescribeDBInstancesResponse unmarshall(DescribeDBInstancesResponse describeDBInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancesResponse.setRequestId(_ctx.stringValue("DescribeDBInstancesResponse.RequestId"));
		describeDBInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDBInstancesResponse.PageNumber"));
		describeDBInstancesResponse.setPageSize(_ctx.integerValue("DescribeDBInstancesResponse.PageSize"));
		describeDBInstancesResponse.setTotalNumber(_ctx.integerValue("DescribeDBInstancesResponse.TotalNumber"));

		List<DBInstance> dBInstances = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Type"));
			dBInstance.setStatus(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Status"));
			dBInstance.setCommodityCode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].CommodityCode"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ExpireTime"));
			dBInstance.setExpired(_ctx.booleanValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Expired"));
			dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].CreateTime"));
			dBInstance.setPayType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].PayType"));
			dBInstance.setLockReason(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].LockReason"));
			dBInstance.setDBType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBType"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setVPCId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].VPCId"));
			dBInstance.setMinorVersion(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].MinorVersion"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setNetwork(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Network"));
			dBInstance.setDBVersion(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBVersion"));
			dBInstance.setDescription(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Description"));
			dBInstance.setNodeClass(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].NodeClass"));
			dBInstance.setStorageUsed(_ctx.longValue("DescribeDBInstancesResponse.DBInstances["+ i +"].StorageUsed"));
			dBInstance.setNodeCount(_ctx.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].NodeCount"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Engine"));
			dBInstance.setId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Id"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ResourceGroupId"));
			dBInstance.setDBInstanceName(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBInstanceName"));
			dBInstance.setDnNodeCount(_ctx.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DnNodeCount"));
			dBInstance.setCnNodeCount(_ctx.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].CnNodeCount"));
			dBInstance.setCnNodeClassCode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].CnNodeClassCode"));
			dBInstance.setDnNodeClassCode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DnNodeClassCode"));
			dBInstance.setSeries(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Series"));
			dBInstance.setContainBinlogX(_ctx.booleanValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ContainBinlogX"));
			dBInstance.setSupportBinlogX(_ctx.booleanValue("DescribeDBInstancesResponse.DBInstances["+ i +"].SupportBinlogX"));
			dBInstance.setCdcInstanceName(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].CdcInstanceName"));
			dBInstance.setTopologyType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].TopologyType"));
			dBInstance.setTertiaryZone(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].TertiaryZone"));
			dBInstance.setPrimaryZone(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].PrimaryZone"));
			dBInstance.setSecondaryZone(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].SecondaryZone"));
			dBInstance.setColumnarInstanceName(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ColumnarInstanceName"));
			dBInstance.setIsInGdn(_ctx.booleanValue("DescribeDBInstancesResponse.DBInstances["+ i +"].isInGdn"));
			dBInstance.setGdnRole(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].gdnRole"));
			dBInstance.setCpuType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].CpuType"));

			List<String> readDBInstances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ReadDBInstances.Length"); j++) {
				readDBInstances.add(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ReadDBInstances["+ j +"]"));
			}
			dBInstance.setReadDBInstances(readDBInstances);

			List<String> columnarReadDBInstances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ColumnarReadDBInstances.Length"); j++) {
				columnarReadDBInstances.add(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ColumnarReadDBInstances["+ j +"]"));
			}
			dBInstance.setColumnarReadDBInstances(columnarReadDBInstances);

			List<PolarDBXNode> nodes = new ArrayList<PolarDBXNode>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Nodes.Length"); j++) {
				PolarDBXNode polarDBXNode = new PolarDBXNode();
				polarDBXNode.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Nodes["+ j +"].ZoneId"));
				polarDBXNode.setId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Nodes["+ j +"].Id"));
				polarDBXNode.setClassCode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Nodes["+ j +"].ClassCode"));
				polarDBXNode.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Nodes["+ j +"].RegionId"));

				nodes.add(polarDBXNode);
			}
			dBInstance.setNodes(nodes);

			List<TagSetItem> tagSet = new ArrayList<TagSetItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].TagSet.Length"); j++) {
				TagSetItem tagSetItem = new TagSetItem();
				tagSetItem.setKey(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].TagSet["+ j +"].Key"));
				tagSetItem.setValue(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].TagSet["+ j +"].Value"));

				tagSet.add(tagSetItem);
			}
			dBInstance.setTagSet(tagSet);

			dBInstances.add(dBInstance);
		}
		describeDBInstancesResponse.setDBInstances(dBInstances);
	 
	 	return describeDBInstancesResponse;
	}
}