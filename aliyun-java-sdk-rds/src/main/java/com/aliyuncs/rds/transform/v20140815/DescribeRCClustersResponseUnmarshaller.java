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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeRCClustersResponse;
import com.aliyuncs.rds.model.v20140815.DescribeRCClustersResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRCClustersResponseUnmarshaller {

	public static DescribeRCClustersResponse unmarshall(DescribeRCClustersResponse describeRCClustersResponse, UnmarshallerContext _ctx) {
		
		describeRCClustersResponse.setRequestId(_ctx.stringValue("DescribeRCClustersResponse.RequestId"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRCClustersResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(_ctx.stringValue("DescribeRCClustersResponse.Clusters["+ i +"].ClusterId"));
			cluster.setClusterName(_ctx.stringValue("DescribeRCClustersResponse.Clusters["+ i +"].ClusterName"));
			cluster.setStatus(_ctx.stringValue("DescribeRCClustersResponse.Clusters["+ i +"].Status"));
			cluster.setVpcId(_ctx.stringValue("DescribeRCClustersResponse.Clusters["+ i +"].VpcId"));
			cluster.setCreateTime(_ctx.stringValue("DescribeRCClustersResponse.Clusters["+ i +"].CreateTime"));
			cluster.setProfile(_ctx.stringValue("DescribeRCClustersResponse.Clusters["+ i +"].Profile"));

			clusters.add(cluster);
		}
		describeRCClustersResponse.setClusters(clusters);
	 
	 	return describeRCClustersResponse;
	}
}