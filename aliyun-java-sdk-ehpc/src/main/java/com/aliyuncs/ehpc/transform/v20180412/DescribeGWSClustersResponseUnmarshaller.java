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

import com.aliyuncs.ehpc.model.v20180412.DescribeGWSClustersResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeGWSClustersResponse.ClusterInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGWSClustersResponseUnmarshaller {

	public static DescribeGWSClustersResponse unmarshall(DescribeGWSClustersResponse describeGWSClustersResponse, UnmarshallerContext _ctx) {
		
		describeGWSClustersResponse.setRequestId(_ctx.stringValue("DescribeGWSClustersResponse.RequestId"));
		describeGWSClustersResponse.setPageSize(_ctx.integerValue("DescribeGWSClustersResponse.PageSize"));
		describeGWSClustersResponse.setPageNumber(_ctx.integerValue("DescribeGWSClustersResponse.PageNumber"));
		describeGWSClustersResponse.setCallerType(_ctx.stringValue("DescribeGWSClustersResponse.CallerType"));
		describeGWSClustersResponse.setTotalCount(_ctx.integerValue("DescribeGWSClustersResponse.TotalCount"));

		List<ClusterInfo> clusters = new ArrayList<ClusterInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGWSClustersResponse.Clusters.Length"); i++) {
			ClusterInfo clusterInfo = new ClusterInfo();
			clusterInfo.setVpcId(_ctx.stringValue("DescribeGWSClustersResponse.Clusters["+ i +"].VpcId"));
			clusterInfo.setStatus(_ctx.stringValue("DescribeGWSClustersResponse.Clusters["+ i +"].Status"));
			clusterInfo.setInstanceCount(_ctx.integerValue("DescribeGWSClustersResponse.Clusters["+ i +"].InstanceCount"));
			clusterInfo.setCreateTime(_ctx.stringValue("DescribeGWSClustersResponse.Clusters["+ i +"].CreateTime"));
			clusterInfo.setClusterId(_ctx.stringValue("DescribeGWSClustersResponse.Clusters["+ i +"].ClusterId"));

			clusters.add(clusterInfo);
		}
		describeGWSClustersResponse.setClusters(clusters);
	 
	 	return describeGWSClustersResponse;
	}
}