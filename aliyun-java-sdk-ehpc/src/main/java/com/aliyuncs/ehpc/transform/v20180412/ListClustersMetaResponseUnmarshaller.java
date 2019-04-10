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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListClustersMetaResponse;
import com.aliyuncs.ehpc.model.v20180412.ListClustersMetaResponse.ClusterInfoSimple;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClustersMetaResponseUnmarshaller {

	public static ListClustersMetaResponse unmarshall(ListClustersMetaResponse listClustersMetaResponse, UnmarshallerContext context) {
		
		listClustersMetaResponse.setRequestId(context.stringValue("ListClustersMetaResponse.RequestId"));
		listClustersMetaResponse.setTotalCount(context.integerValue("ListClustersMetaResponse.TotalCount"));
		listClustersMetaResponse.setPageNumber(context.integerValue("ListClustersMetaResponse.PageNumber"));
		listClustersMetaResponse.setPageSize(context.integerValue("ListClustersMetaResponse.PageSize"));

		List<ClusterInfoSimple> clusters = new ArrayList<ClusterInfoSimple>();
		for (int i = 0; i < context.lengthValue("ListClustersMetaResponse.Clusters.Length"); i++) {
			ClusterInfoSimple clusterInfoSimple = new ClusterInfoSimple();
			clusterInfoSimple.setId(context.stringValue("ListClustersMetaResponse.Clusters["+ i +"].Id"));
			clusterInfoSimple.setName(context.stringValue("ListClustersMetaResponse.Clusters["+ i +"].Name"));
			clusterInfoSimple.setDescription(context.stringValue("ListClustersMetaResponse.Clusters["+ i +"].Description"));
			clusterInfoSimple.setStatus(context.stringValue("ListClustersMetaResponse.Clusters["+ i +"].Status"));

			clusters.add(clusterInfoSimple);
		}
		listClustersMetaResponse.setClusters(clusters);
	 
	 	return listClustersMetaResponse;
	}
}