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

package com.aliyuncs.servicemesh.transform.v20200111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.servicemesh.model.v20200111.DescribeClustersInServiceMeshResponse;
import com.aliyuncs.servicemesh.model.v20200111.DescribeClustersInServiceMeshResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClustersInServiceMeshResponseUnmarshaller {

	public static DescribeClustersInServiceMeshResponse unmarshall(DescribeClustersInServiceMeshResponse describeClustersInServiceMeshResponse, UnmarshallerContext _ctx) {
		
		describeClustersInServiceMeshResponse.setRequestId(_ctx.stringValue("DescribeClustersInServiceMeshResponse.RequestId"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClustersInServiceMeshResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].ClusterId"));
			cluster.setClusterType(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].ClusterType"));
			cluster.setCreationTime(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].CreationTime"));
			cluster.setErrorMessage(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].ErrorMessage"));
			cluster.setName(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].Name"));
			cluster.setRegionId(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].RegionId"));
			cluster.setState(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].State"));
			cluster.setUpdateTime(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].UpdateTime"));
			cluster.setVersion(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].Version"));
			cluster.setVpcId(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].VpcId"));
			cluster.setSgId(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].SgId"));
			cluster.setClusterDomain(_ctx.stringValue("DescribeClustersInServiceMeshResponse.Clusters["+ i +"].ClusterDomain"));

			clusters.add(cluster);
		}
		describeClustersInServiceMeshResponse.setClusters(clusters);
	 
	 	return describeClustersInServiceMeshResponse;
	}
}