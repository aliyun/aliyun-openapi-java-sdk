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
			dBInstance.setId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Id"));
			dBInstance.setDescription(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Description"));
			dBInstance.setPayType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].PayType"));
			dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].CreateTime"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ExpireTime"));
			dBInstance.setExpired(_ctx.booleanValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Expired"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setNetwork(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Network"));
			dBInstance.setVPCId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].VPCId"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Engine"));
			dBInstance.setDBType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBType"));
			dBInstance.setDBVersion(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].DBVersion"));
			dBInstance.setStatus(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Status"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setLockReason(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].LockReason"));
			dBInstance.setNodeCount(_ctx.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].NodeCount"));
			dBInstance.setNodeClass(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].NodeClass"));
			dBInstance.setStorageUsed(_ctx.integerValue("DescribeDBInstancesResponse.DBInstances["+ i +"].StorageUsed"));
			dBInstance.setCommodityCode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].CommodityCode"));
			dBInstance.setType(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Type"));

			List<String> readDBInstances = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ReadDBInstances.Length"); j++) {
				readDBInstances.add(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].ReadDBInstances["+ j +"]"));
			}
			dBInstance.setReadDBInstances(readDBInstances);

			List<PolarDBXNode> nodes = new ArrayList<PolarDBXNode>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Nodes.Length"); j++) {
				PolarDBXNode polarDBXNode = new PolarDBXNode();
				polarDBXNode.setId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Nodes["+ j +"].Id"));
				polarDBXNode.setClassCode(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Nodes["+ j +"].ClassCode"));
				polarDBXNode.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Nodes["+ j +"].RegionId"));
				polarDBXNode.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.DBInstances["+ i +"].Nodes["+ j +"].ZoneId"));

				nodes.add(polarDBXNode);
			}
			dBInstance.setNodes(nodes);

			dBInstances.add(dBInstance);
		}
		describeDBInstancesResponse.setDBInstances(dBInstances);
	 
	 	return describeDBInstancesResponse;
	}
}