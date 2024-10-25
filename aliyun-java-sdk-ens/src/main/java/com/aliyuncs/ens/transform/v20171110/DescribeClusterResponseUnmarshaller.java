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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeClusterResponse;
import com.aliyuncs.ens.model.v20171110.DescribeClusterResponse.ClustersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterResponseUnmarshaller {

	public static DescribeClusterResponse unmarshall(DescribeClusterResponse describeClusterResponse, UnmarshallerContext _ctx) {
		
		describeClusterResponse.setRequestId(_ctx.stringValue("DescribeClusterResponse.RequestId"));

		List<ClustersItem> clusters = new ArrayList<ClustersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResponse.Clusters.Length"); i++) {
			ClustersItem clustersItem = new ClustersItem();
			clustersItem.setName(_ctx.stringValue("DescribeClusterResponse.Clusters["+ i +"].Name"));
			clustersItem.setClusterId(_ctx.stringValue("DescribeClusterResponse.Clusters["+ i +"].ClusterId"));
			clustersItem.setCurrentVersion(_ctx.stringValue("DescribeClusterResponse.Clusters["+ i +"].CurrentVersion"));
			clustersItem.setNextVersion(_ctx.stringValue("DescribeClusterResponse.Clusters["+ i +"].NextVersion"));
			clustersItem.setStatus(_ctx.stringValue("DescribeClusterResponse.Clusters["+ i +"].Status"));

			clusters.add(clustersItem);
		}
		describeClusterResponse.setClusters(clusters);
	 
	 	return describeClusterResponse;
	}
}