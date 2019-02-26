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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAttributeResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAttributeResponse.DBNode;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClusterAttributeResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterAttributeResponseUnmarshaller {

	public static DescribeDBClusterAttributeResponse unmarshall(DescribeDBClusterAttributeResponse describeDBClusterAttributeResponse, UnmarshallerContext context) {
		
		describeDBClusterAttributeResponse.setRequestId(context.stringValue("DescribeDBClusterAttributeResponse.RequestId"));
		describeDBClusterAttributeResponse.setRegionId(context.stringValue("DescribeDBClusterAttributeResponse.RegionId"));
		describeDBClusterAttributeResponse.setDBClusterNetworkType(context.stringValue("DescribeDBClusterAttributeResponse.DBClusterNetworkType"));
		describeDBClusterAttributeResponse.setVPCId(context.stringValue("DescribeDBClusterAttributeResponse.VPCId"));
		describeDBClusterAttributeResponse.setVSwitchId(context.stringValue("DescribeDBClusterAttributeResponse.VSwitchId"));
		describeDBClusterAttributeResponse.setPayType(context.stringValue("DescribeDBClusterAttributeResponse.PayType"));
		describeDBClusterAttributeResponse.setDBClusterId(context.stringValue("DescribeDBClusterAttributeResponse.DBClusterId"));
		describeDBClusterAttributeResponse.setDBClusterStatus(context.stringValue("DescribeDBClusterAttributeResponse.DBClusterStatus"));
		describeDBClusterAttributeResponse.setDBClusterDescription(context.stringValue("DescribeDBClusterAttributeResponse.DBClusterDescription"));
		describeDBClusterAttributeResponse.setEngine(context.stringValue("DescribeDBClusterAttributeResponse.Engine"));
		describeDBClusterAttributeResponse.setDBType(context.stringValue("DescribeDBClusterAttributeResponse.DBType"));
		describeDBClusterAttributeResponse.setDBVersion(context.stringValue("DescribeDBClusterAttributeResponse.DBVersion"));
		describeDBClusterAttributeResponse.setLockMode(context.stringValue("DescribeDBClusterAttributeResponse.LockMode"));
		describeDBClusterAttributeResponse.setCreationTime(context.stringValue("DescribeDBClusterAttributeResponse.CreationTime"));
		describeDBClusterAttributeResponse.setExpireTime(context.stringValue("DescribeDBClusterAttributeResponse.ExpireTime"));
		describeDBClusterAttributeResponse.setExpired(context.stringValue("DescribeDBClusterAttributeResponse.Expired"));
		describeDBClusterAttributeResponse.setMaintainTime(context.stringValue("DescribeDBClusterAttributeResponse.MaintainTime"));
		describeDBClusterAttributeResponse.setStorageUsed(context.longValue("DescribeDBClusterAttributeResponse.StorageUsed"));
		describeDBClusterAttributeResponse.setSQLSize(context.longValue("DescribeDBClusterAttributeResponse.SQLSize"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < context.lengthValue("DescribeDBClusterAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(context.stringValue("DescribeDBClusterAttributeResponse.Tags["+ i +"].Key"));
			tag.setValue(context.stringValue("DescribeDBClusterAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeDBClusterAttributeResponse.setTags(tags);

		List<DBNode> dBNodes = new ArrayList<DBNode>();
		for (int i = 0; i < context.lengthValue("DescribeDBClusterAttributeResponse.DBNodes.Length"); i++) {
			DBNode dBNode = new DBNode();
			dBNode.setDBNodeId(context.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeId"));
			dBNode.setZoneId(context.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].ZoneId"));
			dBNode.setDBNodeStatus(context.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeStatus"));
			dBNode.setCreationTime(context.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].CreationTime"));
			dBNode.setDBNodeClass(context.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeClass"));
			dBNode.setDBNodeRole(context.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeRole"));
			dBNode.setMaxIOPS(context.integerValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MaxIOPS"));
			dBNode.setMaxConnections(context.integerValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MaxConnections"));

			dBNodes.add(dBNode);
		}
		describeDBClusterAttributeResponse.setDBNodes(dBNodes);
	 
	 	return describeDBClusterAttributeResponse;
	}
}