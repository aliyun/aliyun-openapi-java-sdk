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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetK8sClusterResponse;
import com.aliyuncs.edas.model.v20170801.GetK8sClusterResponse.ClusterPage;
import com.aliyuncs.edas.model.v20170801.GetK8sClusterResponse.ClusterPage.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetK8sClusterResponseUnmarshaller {

	public static GetK8sClusterResponse unmarshall(GetK8sClusterResponse getK8sClusterResponse, UnmarshallerContext _ctx) {
		
		getK8sClusterResponse.setRequestId(_ctx.stringValue("GetK8sClusterResponse.RequestId"));
		getK8sClusterResponse.setCode(_ctx.integerValue("GetK8sClusterResponse.Code"));
		getK8sClusterResponse.setMessage(_ctx.stringValue("GetK8sClusterResponse.Message"));

		ClusterPage clusterPage = new ClusterPage();
		clusterPage.setCurrentPage(_ctx.integerValue("GetK8sClusterResponse.ClusterPage.CurrentPage"));
		clusterPage.setPageSize(_ctx.integerValue("GetK8sClusterResponse.ClusterPage.PageSize"));
		clusterPage.setTotalSize(_ctx.integerValue("GetK8sClusterResponse.ClusterPage.TotalSize"));

		List<Cluster> clusterList = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("GetK8sClusterResponse.ClusterPage.ClusterList.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(_ctx.stringValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].ClusterId"));
			cluster.setClusterImportStatus(_ctx.integerValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].ClusterImportStatus"));
			cluster.setClusterName(_ctx.stringValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].ClusterName"));
			cluster.setClusterStatus(_ctx.integerValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].ClusterStatus"));
			cluster.setClusterType(_ctx.integerValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].ClusterType"));
			cluster.setRegionId(_ctx.stringValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].RegionId"));
			cluster.setVpcId(_ctx.stringValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].VpcId"));
			cluster.setVswitchId(_ctx.stringValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].VswitchId"));
			cluster.setSubNetCidr(_ctx.stringValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].SubNetCidr"));
			cluster.setCsClusterStatus(_ctx.stringValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].CsClusterStatus"));
			cluster.setCsClusterId(_ctx.stringValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].CsClusterId"));
			cluster.setDescription(_ctx.stringValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].Description"));
			cluster.setNodeNum(_ctx.integerValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].NodeNum"));
			cluster.setCpu(_ctx.integerValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].Cpu"));
			cluster.setMem(_ctx.integerValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].Mem"));
			cluster.setNetworkMode(_ctx.integerValue("GetK8sClusterResponse.ClusterPage.ClusterList["+ i +"].NetworkMode"));

			clusterList.add(cluster);
		}
		clusterPage.setClusterList(clusterList);
		getK8sClusterResponse.setClusterPage(clusterPage);
	 
	 	return getK8sClusterResponse;
	}
}