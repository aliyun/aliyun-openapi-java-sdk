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

package com.aliyuncs.eflo_controller.transform.v20221215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo_controller.model.v20221215.ListClustersResponse;
import com.aliyuncs.eflo_controller.model.v20221215.ListClustersResponse.ClustersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClustersResponseUnmarshaller {

	public static ListClustersResponse unmarshall(ListClustersResponse listClustersResponse, UnmarshallerContext _ctx) {
		
		listClustersResponse.setRequestId(_ctx.stringValue("ListClustersResponse.RequestId"));
		listClustersResponse.setNextToken(_ctx.stringValue("ListClustersResponse.NextToken"));

		List<ClustersItem> clusters = new ArrayList<ClustersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListClustersResponse.Clusters.Length"); i++) {
			ClustersItem clustersItem = new ClustersItem();
			clustersItem.setClusterId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ClusterId"));
			clustersItem.setClusterName(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ClusterName"));
			clustersItem.setOperatingState(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].OperatingState"));
			clustersItem.setTaskId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].TaskId"));
			clustersItem.setClusterType(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ClusterType"));
			clustersItem.setNodeCount(_ctx.longValue("ListClustersResponse.Clusters["+ i +"].NodeCount"));
			clustersItem.setNodeGroupCount(_ctx.longValue("ListClustersResponse.Clusters["+ i +"].NodeGroupCount"));
			clustersItem.setCreateTime(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].CreateTime"));
			clustersItem.setUpdateTime(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].UpdateTime"));
			clustersItem.setClusterDescription(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ClusterDescription"));
			clustersItem.setResourceGroupId(_ctx.stringValue("ListClustersResponse.Clusters["+ i +"].ResourceGroupId"));

			clusters.add(clustersItem);
		}
		listClustersResponse.setClusters(clusters);
	 
	 	return listClustersResponse;
	}
}