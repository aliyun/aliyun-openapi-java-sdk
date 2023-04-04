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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.SearchImageFigureClusterResponse;
import com.aliyuncs.imm.model.v20200930.SearchImageFigureClusterResponse.ClustersItem;
import com.aliyuncs.imm.model.v20200930.SearchImageFigureClusterResponse.ClustersItem.Boundary;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchImageFigureClusterResponseUnmarshaller {

	public static SearchImageFigureClusterResponse unmarshall(SearchImageFigureClusterResponse searchImageFigureClusterResponse, UnmarshallerContext _ctx) {
		
		searchImageFigureClusterResponse.setRequestId(_ctx.stringValue("SearchImageFigureClusterResponse.RequestId"));

		List<ClustersItem> clusters = new ArrayList<ClustersItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchImageFigureClusterResponse.Clusters.Length"); i++) {
			ClustersItem clustersItem = new ClustersItem();
			clustersItem.setClusterId(_ctx.stringValue("SearchImageFigureClusterResponse.Clusters["+ i +"].ClusterId"));
			clustersItem.setSimilarity(_ctx.floatValue("SearchImageFigureClusterResponse.Clusters["+ i +"].Similarity"));

			Boundary boundary = new Boundary();
			boundary.setWidth(_ctx.longValue("SearchImageFigureClusterResponse.Clusters["+ i +"].Boundary.Width"));
			boundary.setHeight(_ctx.longValue("SearchImageFigureClusterResponse.Clusters["+ i +"].Boundary.Height"));
			boundary.setLeft(_ctx.longValue("SearchImageFigureClusterResponse.Clusters["+ i +"].Boundary.Left"));
			boundary.setTop(_ctx.longValue("SearchImageFigureClusterResponse.Clusters["+ i +"].Boundary.Top"));
			clustersItem.setBoundary(boundary);

			clusters.add(clustersItem);
		}
		searchImageFigureClusterResponse.setClusters(clusters);
	 
	 	return searchImageFigureClusterResponse;
	}
}