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

package com.aliyuncs.adcp.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adcp.model.v20220101.DescribeManagedClustersResponse;
import com.aliyuncs.adcp.model.v20220101.DescribeManagedClustersResponse.Cluster;
import com.aliyuncs.adcp.model.v20220101.DescribeManagedClustersResponse.Cluster.Cluster1;
import com.aliyuncs.adcp.model.v20220101.DescribeManagedClustersResponse.Cluster.MeshStatus;
import com.aliyuncs.adcp.model.v20220101.DescribeManagedClustersResponse.Cluster.Status;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeManagedClustersResponseUnmarshaller {

	public static DescribeManagedClustersResponse unmarshall(DescribeManagedClustersResponse describeManagedClustersResponse, UnmarshallerContext _ctx) {
		
		describeManagedClustersResponse.setRequestId(_ctx.stringValue("DescribeManagedClustersResponse.RequestId"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeManagedClustersResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();

			Cluster1 cluster1 = new Cluster1();
			cluster1.setName(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.Name"));
			cluster1.setClusterID(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.ClusterID"));
			cluster1.setRegion(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.Region"));
			cluster1.setState(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.State"));
			cluster1.setClusterType(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.ClusterType"));
			cluster1.setCreated(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.Created"));
			cluster1.setUpdated(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.Updated"));
			cluster1.setInitVersion(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.InitVersion"));
			cluster1.setCurrentVersion(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.CurrentVersion"));
			cluster1.setResourceGroupId(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.ResourceGroupId"));
			cluster1.setVpcID(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.VpcID"));
			cluster1.setVSwitchID(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.VSwitchID"));
			cluster1.setProfile(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.Profile"));
			cluster1.setClusterSpec(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Cluster.ClusterSpec"));
			cluster.setCluster1(cluster1);

			Status status = new Status();
			status.setState(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Status.State"));
			status.setMessage(_ctx.stringValue("DescribeManagedClustersResponse.Clusters["+ i +"].Status.Message"));
			cluster.setStatus(status);

			MeshStatus meshStatus = new MeshStatus();
			meshStatus.setInMesh(_ctx.booleanValue("DescribeManagedClustersResponse.Clusters["+ i +"].MeshStatus.InMesh"));
			cluster.setMeshStatus(meshStatus);

			clusters.add(cluster);
		}
		describeManagedClustersResponse.setClusters(clusters);
	 
	 	return describeManagedClustersResponse;
	}
}