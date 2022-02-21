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

	public static DescribeDBClusterAttributeResponse unmarshall(DescribeDBClusterAttributeResponse describeDBClusterAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBClusterAttributeResponse.RequestId"));
		describeDBClusterAttributeResponse.setDeletionLock(_ctx.integerValue("DescribeDBClusterAttributeResponse.DeletionLock"));
		describeDBClusterAttributeResponse.setCategory(_ctx.stringValue("DescribeDBClusterAttributeResponse.Category"));
		describeDBClusterAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeDBClusterAttributeResponse.ResourceGroupId"));
		describeDBClusterAttributeResponse.setDataLevel1BackupChainSize(_ctx.longValue("DescribeDBClusterAttributeResponse.DataLevel1BackupChainSize"));
		describeDBClusterAttributeResponse.setDBClusterId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBClusterId"));
		describeDBClusterAttributeResponse.setDBType(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBType"));
		describeDBClusterAttributeResponse.setDBClusterNetworkType(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBClusterNetworkType"));
		describeDBClusterAttributeResponse.setIsLatestVersion(_ctx.booleanValue("DescribeDBClusterAttributeResponse.IsLatestVersion"));
		describeDBClusterAttributeResponse.setStorageMax(_ctx.longValue("DescribeDBClusterAttributeResponse.StorageMax"));
		describeDBClusterAttributeResponse.setDBVersion(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBVersion"));
		describeDBClusterAttributeResponse.setZoneIds(_ctx.stringValue("DescribeDBClusterAttributeResponse.ZoneIds"));
		describeDBClusterAttributeResponse.setMaintainTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.MaintainTime"));
		describeDBClusterAttributeResponse.setEngine(_ctx.stringValue("DescribeDBClusterAttributeResponse.Engine"));
		describeDBClusterAttributeResponse.setVPCId(_ctx.stringValue("DescribeDBClusterAttributeResponse.VPCId"));
		describeDBClusterAttributeResponse.setDBClusterStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBClusterStatus"));
		describeDBClusterAttributeResponse.setVSwitchId(_ctx.stringValue("DescribeDBClusterAttributeResponse.VSwitchId"));
		describeDBClusterAttributeResponse.setDBClusterDescription(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBClusterDescription"));
		describeDBClusterAttributeResponse.setExpired(_ctx.stringValue("DescribeDBClusterAttributeResponse.Expired"));
		describeDBClusterAttributeResponse.setPayType(_ctx.stringValue("DescribeDBClusterAttributeResponse.PayType"));
		describeDBClusterAttributeResponse.setLockMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.LockMode"));
		describeDBClusterAttributeResponse.setStorageUsed(_ctx.longValue("DescribeDBClusterAttributeResponse.StorageUsed"));
		describeDBClusterAttributeResponse.setDBVersionStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBVersionStatus"));
		describeDBClusterAttributeResponse.setCreationTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.CreationTime"));
		describeDBClusterAttributeResponse.setSQLSize(_ctx.longValue("DescribeDBClusterAttributeResponse.SQLSize"));
		describeDBClusterAttributeResponse.setRegionId(_ctx.stringValue("DescribeDBClusterAttributeResponse.RegionId"));
		describeDBClusterAttributeResponse.setExpireTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.ExpireTime"));
		describeDBClusterAttributeResponse.setSubCategory(_ctx.stringValue("DescribeDBClusterAttributeResponse.SubCategory"));
		describeDBClusterAttributeResponse.setIsProxyLatestVersion(_ctx.booleanValue("DescribeDBClusterAttributeResponse.IsProxyLatestVersion"));
		describeDBClusterAttributeResponse.setStorageType(_ctx.stringValue("DescribeDBClusterAttributeResponse.StorageType"));
		describeDBClusterAttributeResponse.setProxyCpuCores(_ctx.stringValue("DescribeDBClusterAttributeResponse.ProxyCpuCores"));
		describeDBClusterAttributeResponse.setProxyType(_ctx.stringValue("DescribeDBClusterAttributeResponse.ProxyType"));
		describeDBClusterAttributeResponse.setProxyStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.ProxyStatus"));

		List<DBNode> dBNodes = new ArrayList<DBNode>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterAttributeResponse.DBNodes.Length"); i++) {
			DBNode dBNode = new DBNode();
			dBNode.setCreationTime(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].CreationTime"));
			dBNode.setFailoverPriority(_ctx.integerValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].FailoverPriority"));
			dBNode.setMaxIOPS(_ctx.integerValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MaxIOPS"));
			dBNode.setDBNodeClass(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeClass"));
			dBNode.setDBNodeRole(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeRole"));
			dBNode.setZoneId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].ZoneId"));
			dBNode.setMaxConnections(_ctx.integerValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].MaxConnections"));
			dBNode.setDBNodeStatus(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeStatus"));
			dBNode.setDBNodeId(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].DBNodeId"));
			dBNode.setImciSwitch(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].ImciSwitch"));
			dBNode.setHotReplicaMode(_ctx.stringValue("DescribeDBClusterAttributeResponse.DBNodes["+ i +"].HotReplicaMode"));

			dBNodes.add(dBNode);
		}
		describeDBClusterAttributeResponse.setDBNodes(dBNodes);

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClusterAttributeResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeDBClusterAttributeResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeDBClusterAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeDBClusterAttributeResponse.setTags(tags);
	 
	 	return describeDBClusterAttributeResponse;
	}
}