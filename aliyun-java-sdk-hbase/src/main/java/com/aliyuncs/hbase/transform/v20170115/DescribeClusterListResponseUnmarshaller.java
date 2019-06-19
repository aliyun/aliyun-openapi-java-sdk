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

package com.aliyuncs.hbase.transform.v20170115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20170115.DescribeClusterListResponse;
import com.aliyuncs.hbase.model.v20170115.DescribeClusterListResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterListResponseUnmarshaller {

	public static DescribeClusterListResponse unmarshall(DescribeClusterListResponse describeClusterListResponse, UnmarshallerContext context) {
		
		describeClusterListResponse.setRequestId(context.stringValue("DescribeClusterListResponse.RequestId"));
		describeClusterListResponse.setPageNumber(context.integerValue("DescribeClusterListResponse.PageNumber"));
		describeClusterListResponse.setTotalRecordCount(context.integerValue("DescribeClusterListResponse.TotalRecordCount"));
		describeClusterListResponse.setPageRecordCount(context.integerValue("DescribeClusterListResponse.PageRecordCount"));

		List<Cluster> clusterList = new ArrayList<Cluster>();
		for (int i = 0; i < context.lengthValue("DescribeClusterListResponse.ClusterList.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setCoreDiskSize(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].CoreDiskSize"));
			cluster.setCoreDiskType(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].CoreDiskType"));
			cluster.setClusterId(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].ClusterId"));
			cluster.setClusterName(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].ClusterName"));
			cluster.setMainVersion(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].MainVersion"));
			cluster.setExpireTime(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].ExpireTime"));
			cluster.setPayType(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].PayType"));
			cluster.setNetType(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].NetType"));
			cluster.setCreateTime(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].CreateTime"));
			cluster.setStatus(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].Status"));
			cluster.setUserId(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].UserId"));
			cluster.setRegionId(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].RegionId"));
			cluster.setZoneId(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].ZoneId"));
			cluster.setReason(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].Reason"));
			cluster.setLockMode(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].LockMode"));
			cluster.setCoreInstanceQuantity(context.integerValue("DescribeClusterListResponse.ClusterList["+ i +"].CoreInstanceQuantity"));
			cluster.setClusterType(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].ClusterType"));
			cluster.setDbType(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].DbType"));
			cluster.setVpcId(context.stringValue("DescribeClusterListResponse.ClusterList["+ i +"].VpcId"));

			clusterList.add(cluster);
		}
		describeClusterListResponse.setClusterList(clusterList);
	 
	 	return describeClusterListResponse;
	}
}