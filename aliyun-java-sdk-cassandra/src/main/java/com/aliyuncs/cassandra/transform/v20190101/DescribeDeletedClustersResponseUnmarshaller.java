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

package com.aliyuncs.cassandra.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cassandra.model.v20190101.DescribeDeletedClustersResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeDeletedClustersResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDeletedClustersResponseUnmarshaller {

	public static DescribeDeletedClustersResponse unmarshall(DescribeDeletedClustersResponse describeDeletedClustersResponse, UnmarshallerContext _ctx) {
		
		describeDeletedClustersResponse.setRequestId(_ctx.stringValue("DescribeDeletedClustersResponse.RequestId"));
		describeDeletedClustersResponse.setTotalCount(_ctx.longValue("DescribeDeletedClustersResponse.TotalCount"));
		describeDeletedClustersResponse.setPageNumber(_ctx.integerValue("DescribeDeletedClustersResponse.PageNumber"));
		describeDeletedClustersResponse.setPageSize(_ctx.integerValue("DescribeDeletedClustersResponse.PageSize"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDeletedClustersResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(_ctx.stringValue("DescribeDeletedClustersResponse.Clusters["+ i +"].ClusterId"));
			cluster.setClusterName(_ctx.stringValue("DescribeDeletedClustersResponse.Clusters["+ i +"].ClusterName"));
			cluster.setStatus(_ctx.stringValue("DescribeDeletedClustersResponse.Clusters["+ i +"].Status"));
			cluster.setPayType(_ctx.stringValue("DescribeDeletedClustersResponse.Clusters["+ i +"].PayType"));
			cluster.setCreatedTime(_ctx.stringValue("DescribeDeletedClustersResponse.Clusters["+ i +"].CreatedTime"));
			cluster.setExpireTime(_ctx.stringValue("DescribeDeletedClustersResponse.Clusters["+ i +"].ExpireTime"));
			cluster.setMajorVersion(_ctx.stringValue("DescribeDeletedClustersResponse.Clusters["+ i +"].MajorVersion"));
			cluster.setMinorVersion(_ctx.stringValue("DescribeDeletedClustersResponse.Clusters["+ i +"].MinorVersion"));
			cluster.setDataCenterCount(_ctx.integerValue("DescribeDeletedClustersResponse.Clusters["+ i +"].DataCenterCount"));

			clusters.add(cluster);
		}
		describeDeletedClustersResponse.setClusters(clusters);
	 
	 	return describeDeletedClustersResponse;
	}
}