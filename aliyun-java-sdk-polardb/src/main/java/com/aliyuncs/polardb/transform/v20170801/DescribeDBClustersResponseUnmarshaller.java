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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersResponse.DBCluster;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersResponse.DBCluster.DBNode;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersResponse.DBCluster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClustersResponseUnmarshaller {

	public static DescribeDBClustersResponse unmarshall(DescribeDBClustersResponse describeDBClustersResponse, UnmarshallerContext _ctx) {
		
		describeDBClustersResponse.setRequestId(_ctx.stringValue("DescribeDBClustersResponse.RequestId"));
		describeDBClustersResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBClustersResponse.TotalRecordCount"));
		describeDBClustersResponse.setPageRecordCount(_ctx.integerValue("DescribeDBClustersResponse.PageRecordCount"));
		describeDBClustersResponse.setPageNumber(_ctx.integerValue("DescribeDBClustersResponse.PageNumber"));

		List<DBCluster> items = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClustersResponse.Items.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setVpcId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].VpcId"));
			dBCluster.setVswitchId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].VswitchId"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ExpireTime"));
			dBCluster.setExpired(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Expired"));
			dBCluster.setDBNodeNumber(_ctx.integerValue("DescribeDBClustersResponse.Items["+ i +"].DBNodeNumber"));
			dBCluster.setCreateTime(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].CreateTime"));
			dBCluster.setPayType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].PayType"));
			dBCluster.setStoragePayType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].StoragePayType"));
			dBCluster.setServerlessType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ServerlessType"));
			dBCluster.setStrictConsistency(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].StrictConsistency"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodeClass"));
			dBCluster.setDBType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBType"));
			dBCluster.setLockMode(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].LockMode"));
			dBCluster.setRegionId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].RegionId"));
			dBCluster.setDeletionLock(_ctx.integerValue("DescribeDBClustersResponse.Items["+ i +"].DeletionLock"));
			dBCluster.setDBVersion(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBVersion"));
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterId"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterStatus"));
			dBCluster.setResourceGroupId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ResourceGroupId"));
			dBCluster.setStorageUsed(_ctx.longValue("DescribeDBClustersResponse.Items["+ i +"].StorageUsed"));
			dBCluster.setCompressStorageUsed(_ctx.longValue("DescribeDBClustersResponse.Items["+ i +"].CompressStorageUsed"));
			dBCluster.setStorageSpace(_ctx.longValue("DescribeDBClustersResponse.Items["+ i +"].StorageSpace"));
			dBCluster.setDBClusterNetworkType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterNetworkType"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterDescription"));
			dBCluster.setZoneId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ZoneId"));
			dBCluster.setEngine(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Engine"));
			dBCluster.setCategory(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Category"));
			dBCluster.setAiType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].AiType"));
			dBCluster.setCpuCores(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].CpuCores"));
			dBCluster.setMemorySize(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].MemorySize"));
			dBCluster.setRemoteMemorySize(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].RemoteMemorySize"));
			dBCluster.setCpuArch(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].CpuArch"));
			dBCluster.setDeployUnit(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DeployUnit"));
			dBCluster.setStorageType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].StorageType"));
			dBCluster.setHotStandbyCluster(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].HotStandbyCluster"));
			dBCluster.setEngineMigrationStatus(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].EngineMigrationStatus"));
			dBCluster.setCnNodeCount(_ctx.integerValue("DescribeDBClustersResponse.Items["+ i +"].CnNodeCount"));
			dBCluster.setDnNodeCount(_ctx.integerValue("DescribeDBClustersResponse.Items["+ i +"].DnNodeCount"));
			dBCluster.setCnClass(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].CnClass"));
			dBCluster.setDnClass(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DnClass"));
			dBCluster.setCloudInstanceIp(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].CloudInstanceIp"));
			dBCluster.setSubCategory(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].SubCategory"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClustersResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBCluster.setTags(tags);

			List<DBNode> dBNodes = new ArrayList<DBNode>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes.Length"); j++) {
				DBNode dBNode = new DBNode();
				dBNode.setDBNodeClass(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].DBNodeClass"));
				dBNode.setZoneId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].ZoneId"));
				dBNode.setDBNodeRole(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].DBNodeRole"));
				dBNode.setDBNodeId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].DBNodeId"));
				dBNode.setRegionId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].RegionId"));
				dBNode.setServerless(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].Serverless"));
				dBNode.setImciSwitch(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].ImciSwitch"));
				dBNode.setHotReplicaMode(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].HotReplicaMode"));

				dBNodes.add(dBNode);
			}
			dBCluster.setDBNodes(dBNodes);

			items.add(dBCluster);
		}
		describeDBClustersResponse.setItems(items);
	 
	 	return describeDBClustersResponse;
	}
}