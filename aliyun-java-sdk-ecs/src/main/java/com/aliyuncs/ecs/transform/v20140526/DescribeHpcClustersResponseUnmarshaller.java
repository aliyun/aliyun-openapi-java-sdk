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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeHpcClustersResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeHpcClustersResponse.HpcCluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHpcClustersResponseUnmarshaller {

	public static DescribeHpcClustersResponse unmarshall(DescribeHpcClustersResponse describeHpcClustersResponse, UnmarshallerContext _ctx) {
		
		describeHpcClustersResponse.setRequestId(_ctx.stringValue("DescribeHpcClustersResponse.RequestId"));
		describeHpcClustersResponse.setTotalCount(_ctx.integerValue("DescribeHpcClustersResponse.TotalCount"));
		describeHpcClustersResponse.setPageNumber(_ctx.integerValue("DescribeHpcClustersResponse.PageNumber"));
		describeHpcClustersResponse.setPageSize(_ctx.integerValue("DescribeHpcClustersResponse.PageSize"));

		List<HpcCluster> hpcClusters = new ArrayList<HpcCluster>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHpcClustersResponse.HpcClusters.Length"); i++) {
			HpcCluster hpcCluster = new HpcCluster();
			hpcCluster.setHpcClusterId(_ctx.stringValue("DescribeHpcClustersResponse.HpcClusters["+ i +"].HpcClusterId"));
			hpcCluster.setName(_ctx.stringValue("DescribeHpcClustersResponse.HpcClusters["+ i +"].Name"));
			hpcCluster.setDescription(_ctx.stringValue("DescribeHpcClustersResponse.HpcClusters["+ i +"].Description"));

			hpcClusters.add(hpcCluster);
		}
		describeHpcClustersResponse.setHpcClusters(hpcClusters);
	 
	 	return describeHpcClustersResponse;
	}
}