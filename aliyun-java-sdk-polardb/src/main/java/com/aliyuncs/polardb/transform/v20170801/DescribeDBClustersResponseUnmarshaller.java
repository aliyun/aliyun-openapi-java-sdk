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
		describeDBClustersResponse.setPageNumber(_ctx.integerValue("DescribeDBClustersResponse.PageNumber"));
		describeDBClustersResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBClustersResponse.TotalRecordCount"));
		describeDBClustersResponse.setPageRecordCount(_ctx.integerValue("DescribeDBClustersResponse.PageRecordCount"));

		List<DBCluster> items = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClustersResponse.Items.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterId"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterDescription"));
			dBCluster.setPayType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].PayType"));
			dBCluster.setDBClusterNetworkType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterNetworkType"));
			dBCluster.setRegionId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].RegionId"));
			dBCluster.setZoneId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ZoneId"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].ExpireTime"));
			dBCluster.setExpired(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Expired"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterStatus"));
			dBCluster.setEngine(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Engine"));
			dBCluster.setDBType(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBType"));
			dBCluster.setDBVersion(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBVersion"));
			dBCluster.setLockMode(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].LockMode"));
			dBCluster.setDeletionLock(_ctx.integerValue("DescribeDBClustersResponse.Items["+ i +"].DeletionLock"));
			dBCluster.setCreateTime(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].CreateTime"));
			dBCluster.setVpcId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].VpcId"));
			dBCluster.setDBNodeNumber(_ctx.integerValue("DescribeDBClustersResponse.Items["+ i +"].DBNodeNumber"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodeClass"));
			dBCluster.setStorageUsed(_ctx.longValue("DescribeDBClustersResponse.Items["+ i +"].StorageUsed"));

			List<DBNode> dBNodes = new ArrayList<DBNode>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes.Length"); j++) {
				DBNode dBNode = new DBNode();
				dBNode.setDBNodeId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].DBNodeId"));
				dBNode.setDBNodeClass(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].DBNodeClass"));
				dBNode.setDBNodeRole(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].DBNodeRole"));
				dBNode.setRegionId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].RegionId"));
				dBNode.setZoneId(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBNodes["+ j +"].ZoneId"));

				dBNodes.add(dBNode);
			}
			dBCluster.setDBNodes(dBNodes);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClustersResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBClustersResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBCluster.setTags(tags);

			items.add(dBCluster);
		}
		describeDBClustersResponse.setItems(items);
	 
	 	return describeDBClustersResponse;
	}
}