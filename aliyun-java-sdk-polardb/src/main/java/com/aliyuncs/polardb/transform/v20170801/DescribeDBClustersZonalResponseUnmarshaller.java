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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersZonalResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersZonalResponse.DBCluster;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersZonalResponse.DBCluster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClustersZonalResponseUnmarshaller {

	public static DescribeDBClustersZonalResponse unmarshall(DescribeDBClustersZonalResponse describeDBClustersZonalResponse, UnmarshallerContext _ctx) {
		
		describeDBClustersZonalResponse.setRequestId(_ctx.stringValue("DescribeDBClustersZonalResponse.RequestId"));
		describeDBClustersZonalResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBClustersZonalResponse.TotalRecordCount"));
		describeDBClustersZonalResponse.setPageRecordCount(_ctx.integerValue("DescribeDBClustersZonalResponse.PageRecordCount"));
		describeDBClustersZonalResponse.setPageNumber(_ctx.integerValue("DescribeDBClustersZonalResponse.PageNumber"));
		describeDBClustersZonalResponse.setMaxResults(_ctx.integerValue("DescribeDBClustersZonalResponse.MaxResults"));
		describeDBClustersZonalResponse.setNextToken(_ctx.stringValue("DescribeDBClustersZonalResponse.NextToken"));

		List<DBCluster> items = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClustersZonalResponse.Items.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setCategory(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].Category"));
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].DBClusterId"));
			dBCluster.setDBType(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].DBType"));
			dBCluster.setCentralControlRegionId(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].CentralControlRegionId"));
			dBCluster.setDBVersion(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].DBVersion"));
			dBCluster.setCloudProvider(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].CloudProvider"));
			dBCluster.setStorageType(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].StorageType"));
			dBCluster.setZoneId(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].ZoneId"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].DBClusterStatus"));
			dBCluster.setCreateTime(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].CreateTime"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].DBClusterDescription"));
			dBCluster.setExpired(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].Expired"));
			dBCluster.setPayType(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].PayType"));
			dBCluster.setLockMode(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].LockMode"));
			dBCluster.setVswitchId(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].VswitchId"));
			dBCluster.setStrictConsistency(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].StrictConsistency"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].DBNodeClass"));
			dBCluster.setStorageUsed(_ctx.longValue("DescribeDBClustersZonalResponse.Items["+ i +"].StorageUsed"));
			dBCluster.setENSRegionId(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].ENSRegionId"));
			dBCluster.setCnNodeCount(_ctx.integerValue("DescribeDBClustersZonalResponse.Items["+ i +"].CnNodeCount"));
			dBCluster.setDBNodeNumber(_ctx.integerValue("DescribeDBClustersZonalResponse.Items["+ i +"].DBNodeNumber"));
			dBCluster.setVpcId(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].VpcId"));
			dBCluster.setCnClass(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].CnClass"));
			dBCluster.setStorageSpace(_ctx.longValue("DescribeDBClustersZonalResponse.Items["+ i +"].StorageSpace"));
			dBCluster.setServerlessType(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].ServerlessType"));
			dBCluster.setAiType(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].AiType"));
			dBCluster.setCpuCores(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].CpuCores"));
			dBCluster.setCloudInstanceIp(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].CloudInstanceIp"));
			dBCluster.setSubCategory(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].SubCategory"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].ExpireTime"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClustersZonalResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("DescribeDBClustersZonalResponse.Items["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			dBCluster.setTags(tags);

			items.add(dBCluster);
		}
		describeDBClustersZonalResponse.setItems(items);
	 
	 	return describeDBClustersZonalResponse;
	}
}