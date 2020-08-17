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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClustersResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClustersResponse.DBCluster;
import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClustersResponse.DBCluster.ScaleOutStatus;
import com.aliyuncs.clickhouse.model.v20191111.DescribeDBClustersResponse.DBCluster.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClustersResponseUnmarshaller {

	public static DescribeDBClustersResponse unmarshall(DescribeDBClustersResponse describeDBClustersResponse, UnmarshallerContext _ctx) {
		
		describeDBClustersResponse.setRequestId(_ctx.stringValue("DescribeDBClustersResponse.RequestId"));
		describeDBClustersResponse.setPageNumber(_ctx.integerValue("DescribeDBClustersResponse.PageNumber"));
		describeDBClustersResponse.setTotalCount(_ctx.integerValue("DescribeDBClustersResponse.TotalCount"));
		describeDBClustersResponse.setPageSize(_ctx.integerValue("DescribeDBClustersResponse.PageSize"));

		List<DBCluster> dBClusters = new ArrayList<DBCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBClustersResponse.DBClusters.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setDBClusterId(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].DBClusterId"));
			dBCluster.setCategory(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].Category"));
			dBCluster.setDBClusterDescription(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].DBClusterDescription"));
			dBCluster.setPayType(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].PayType"));
			dBCluster.setRegionId(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].RegionId"));
			dBCluster.setZoneId(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].ZoneId"));
			dBCluster.setExpireTime(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].ExpireTime"));
			dBCluster.setIsExpired(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].IsExpired"));
			dBCluster.setDBClusterStatus(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].DBClusterStatus"));
			dBCluster.setLockMode(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].LockMode"));
			dBCluster.setLockReason(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].LockReason"));
			dBCluster.setCreateTime(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].CreateTime"));
			dBCluster.setDBNodeStorage(_ctx.longValue("DescribeDBClustersResponse.DBClusters["+ i +"].DBNodeStorage"));
			dBCluster.setDBNodeClass(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].DBNodeClass"));
			dBCluster.setDBNodeCount(_ctx.longValue("DescribeDBClustersResponse.DBClusters["+ i +"].DBNodeCount"));
			dBCluster.setExpireTime1(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].ExpireTime"));
			dBCluster.setIsExpired2(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].IsExpired"));
			dBCluster.setStorageType(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].StorageType"));
			dBCluster.setConnectionString(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].ConnectionString"));
			dBCluster.setPort(_ctx.integerValue("DescribeDBClustersResponse.DBClusters["+ i +"].Port"));
			dBCluster.setAliUid(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].AliUid"));
			dBCluster.setBid(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].Bid"));
			dBCluster.setDBClusterNetworkType(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].DBClusterNetworkType"));
			dBCluster.setVpcId(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].VpcId"));
			dBCluster.setVSwitchId(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].VSwitchId"));
			dBCluster.setVpcCloudInstanceId(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].VpcCloudInstanceId"));
			dBCluster.setCommodityCode(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].CommodityCode"));

			ScaleOutStatus scaleOutStatus = new ScaleOutStatus();
			scaleOutStatus.setProgress(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].ScaleOutStatus.Progress"));
			scaleOutStatus.setRatio(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].ScaleOutStatus.Ratio"));
			dBCluster.setScaleOutStatus(scaleOutStatus);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBClustersResponse.DBClusters["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBClustersResponse.DBClusters["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBCluster.setTags(tags);

			dBClusters.add(dBCluster);
		}
		describeDBClustersResponse.setDBClusters(dBClusters);
	 
	 	return describeDBClustersResponse;
	}
}