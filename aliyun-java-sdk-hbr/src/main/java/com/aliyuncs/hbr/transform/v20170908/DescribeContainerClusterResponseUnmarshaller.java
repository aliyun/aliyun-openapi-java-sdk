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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeContainerClusterResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeContainerClusterResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContainerClusterResponseUnmarshaller {

	public static DescribeContainerClusterResponse unmarshall(DescribeContainerClusterResponse describeContainerClusterResponse, UnmarshallerContext _ctx) {
		
		describeContainerClusterResponse.setRequestId(_ctx.stringValue("DescribeContainerClusterResponse.RequestId"));
		describeContainerClusterResponse.setSuccess(_ctx.booleanValue("DescribeContainerClusterResponse.Success"));
		describeContainerClusterResponse.setCode(_ctx.stringValue("DescribeContainerClusterResponse.Code"));
		describeContainerClusterResponse.setMessage(_ctx.stringValue("DescribeContainerClusterResponse.Message"));
		describeContainerClusterResponse.setPageSize(_ctx.integerValue("DescribeContainerClusterResponse.PageSize"));
		describeContainerClusterResponse.setPageNumber(_ctx.integerValue("DescribeContainerClusterResponse.PageNumber"));
		describeContainerClusterResponse.setTotalCount(_ctx.longValue("DescribeContainerClusterResponse.TotalCount"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContainerClusterResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setToken(_ctx.stringValue("DescribeContainerClusterResponse.Clusters["+ i +"].Token"));
			cluster.setDescription(_ctx.stringValue("DescribeContainerClusterResponse.Clusters["+ i +"].Description"));
			cluster.setClusterType(_ctx.stringValue("DescribeContainerClusterResponse.Clusters["+ i +"].ClusterType"));
			cluster.setIdentifier(_ctx.stringValue("DescribeContainerClusterResponse.Clusters["+ i +"].Identifier"));
			cluster.setNetworkType(_ctx.stringValue("DescribeContainerClusterResponse.Clusters["+ i +"].NetworkType"));
			cluster.setName(_ctx.stringValue("DescribeContainerClusterResponse.Clusters["+ i +"].Name"));
			cluster.setAgentStatus(_ctx.stringValue("DescribeContainerClusterResponse.Clusters["+ i +"].AgentStatus"));
			cluster.setClusterId(_ctx.stringValue("DescribeContainerClusterResponse.Clusters["+ i +"].ClusterId"));

			clusters.add(cluster);
		}
		describeContainerClusterResponse.setClusters(clusters);
	 
	 	return describeContainerClusterResponse;
	}
}