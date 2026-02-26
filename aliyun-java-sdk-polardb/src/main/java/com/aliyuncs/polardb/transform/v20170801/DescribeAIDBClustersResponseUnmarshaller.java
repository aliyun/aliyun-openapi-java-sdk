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

import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClustersResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClustersResponse.DBCluster;
import com.aliyuncs.polardb.model.v20170801.DescribeAIDBClustersResponse.DBCluster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAIDBClustersResponseUnmarshaller {

	public static DescribeAIDBClustersResponse unmarshall(DescribeAIDBClustersResponse describeAIDBClustersResponse, UnmarshallerContext _ctx) {
		
		describeAIDBClustersResponse.setRequestId(_ctx.stringValue("DescribeAIDBClustersResponse.RequestId"));
		describeAIDBClustersResponse.setTotalRecordCount(_ctx.integerValue("DescribeAIDBClustersResponse.TotalRecordCount"));
		describeAIDBClustersResponse.setPageRecordCount(_ctx.integerValue("DescribeAIDBClustersResponse.PageRecordCount"));
		describeAIDBClustersResponse.setPageNumber(_ctx.integerValue("DescribeAIDBClustersResponse.PageNumber"));
		describeAIDBClustersResponse.setEngine(_ctx.stringValue("DescribeAIDBClustersResponse.Engine"));
		describeAIDBClustersResponse.setEngineVersion(_ctx.stringValue("DescribeAIDBClustersResponse.EngineVersion"));
		describeAIDBClustersResponse.setDBClusterId(_ctx.stringValue("DescribeAIDBClustersResponse.DBClusterId"));

		List<DBCluster> items = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAIDBClustersResponse.Items.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].DBClusterId"));
			dBCluster.setRegionId(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].RegionId"));
			dBCluster.setZoneId(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].ZoneId"));
			dBCluster.setPayType(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].PayType"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].DBClusterStatus"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].DBClusterDescription"));
			dBCluster.setVpcId(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].VpcId"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].DBNodeClass"));
			dBCluster.setStorageType(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].StorageType"));
			dBCluster.setStorageSpace(_ctx.integerValue("DescribeAIDBClustersResponse.Items["+ i +"].StorageSpace"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].ExpireTime"));
			dBCluster.setExpired(_ctx.booleanValue("DescribeAIDBClustersResponse.Items["+ i +"].Expired"));
			dBCluster.setLockMode(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].LockMode"));
			dBCluster.setCreateTime(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].CreateTime"));
			dBCluster.setMounted(_ctx.booleanValue("DescribeAIDBClustersResponse.Items["+ i +"].Mounted"));
			dBCluster.setMountDir(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].MountDir"));
			dBCluster.setCloudInstanceIp(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].CloudInstanceIp"));
			dBCluster.setKubeClusterId(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].KubeClusterId"));
			dBCluster.setRunType(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].RunType"));
			dBCluster.setDBType(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].DBType"));
			dBCluster.setDBNodeStatus(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].DBNodeStatus"));
			dBCluster.setEngineVersion(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].EngineVersion"));
			dBCluster.setModelName(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].ModelName"));
			dBCluster.setDBNodeStatusDesc(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].DBNodeStatusDesc"));
			dBCluster.setDataZoneId(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].DataZoneId"));
			dBCluster.setDBNodeId(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].DBNodeId"));
			dBCluster.setCreationTime(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].CreationTime"));
			dBCluster.setMaxQpm(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].MaxQpm"));
			dBCluster.setEngine(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].Engine"));
			dBCluster.setDBNodeDescription(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].DBNodeDescription"));
			dBCluster.setAiNodeType(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].AiNodeType"));
			dBCluster.setVswitchId(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].VswitchId"));
			dBCluster.setRelativeDBClusterId(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].RelativeDBClusterId"));

			List<String> connAddrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAIDBClustersResponse.Items["+ i +"].ConnAddrs.Length"); j++) {
				connAddrs.add(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].ConnAddrs["+ j +"]"));
			}
			dBCluster.setConnAddrs(connAddrs);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAIDBClustersResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeAIDBClustersResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBCluster.setTags(tags);

			items.add(dBCluster);
		}
		describeAIDBClustersResponse.setItems(items);
	 
	 	return describeAIDBClustersResponse;
	}
}