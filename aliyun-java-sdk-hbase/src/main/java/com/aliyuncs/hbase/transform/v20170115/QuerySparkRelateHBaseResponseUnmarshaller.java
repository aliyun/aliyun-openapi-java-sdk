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

import com.aliyuncs.hbase.model.v20170115.QuerySparkRelateHBaseResponse;
import com.aliyuncs.hbase.model.v20170115.QuerySparkRelateHBaseResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySparkRelateHBaseResponseUnmarshaller {

	public static QuerySparkRelateHBaseResponse unmarshall(QuerySparkRelateHBaseResponse querySparkRelateHBaseResponse, UnmarshallerContext context) {
		
		querySparkRelateHBaseResponse.setRequestId(context.stringValue("QuerySparkRelateHBaseResponse.RequestId"));

		List<Cluster> clusterList = new ArrayList<Cluster>();
		for (int i = 0; i < context.lengthValue("QuerySparkRelateHBaseResponse.ClusterList.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setRegionId(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].RegionId"));
			cluster.setZoneId(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].ZoneId"));
			cluster.setClusterId(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].ClusterId"));
			cluster.setClusterName(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].ClusterName"));
			cluster.setMainVersion(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].MainVersion"));
			cluster.setPayType(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].PayType"));
			cluster.setNetType(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].NetType"));
			cluster.setStatus(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].Status"));
			cluster.setCreateTime(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].CreateTime"));
			cluster.setExpireTime(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].ExpireTime"));
			cluster.setUserId(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].UserId"));
			cluster.setLockMode(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].LockMode"));
			cluster.setReason(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].Reason"));
			cluster.setCoreDiskType(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].CoreDiskType"));
			cluster.setCoreInstanceQuantity(context.integerValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].CoreInstanceQuantity"));
			cluster.setDbType(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].DbType"));
			cluster.setClusterType(context.stringValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].ClusterType"));
			cluster.setIsRelated(context.booleanValue("QuerySparkRelateHBaseResponse.ClusterList["+ i +"].IsRelated"));

			clusterList.add(cluster);
		}
		querySparkRelateHBaseResponse.setClusterList(clusterList);
	 
	 	return querySparkRelateHBaseResponse;
	}
}