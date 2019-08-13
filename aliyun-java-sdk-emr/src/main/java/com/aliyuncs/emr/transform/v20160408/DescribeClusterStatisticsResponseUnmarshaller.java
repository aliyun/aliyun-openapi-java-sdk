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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeClusterStatisticsResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterStatisticsResponse.ClusterStatistics;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterStatisticsResponseUnmarshaller {

	public static DescribeClusterStatisticsResponse unmarshall(DescribeClusterStatisticsResponse describeClusterStatisticsResponse, UnmarshallerContext _ctx) {
		
		describeClusterStatisticsResponse.setRequestId(_ctx.stringValue("DescribeClusterStatisticsResponse.RequestId"));
		describeClusterStatisticsResponse.setTotalCount(_ctx.integerValue("DescribeClusterStatisticsResponse.TotalCount"));

		List<ClusterStatistics> clusterStatisticsList = new ArrayList<ClusterStatistics>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterStatisticsResponse.ClusterStatisticsList.Length"); i++) {
			ClusterStatistics clusterStatistics = new ClusterStatistics();
			clusterStatistics.setClusterType(_ctx.stringValue("DescribeClusterStatisticsResponse.ClusterStatisticsList["+ i +"].ClusterType"));
			clusterStatistics.setCount(_ctx.integerValue("DescribeClusterStatisticsResponse.ClusterStatisticsList["+ i +"].Count"));
			clusterStatistics.setClusterStatus(_ctx.stringValue("DescribeClusterStatisticsResponse.ClusterStatisticsList["+ i +"].ClusterStatus"));

			clusterStatisticsList.add(clusterStatistics);
		}
		describeClusterStatisticsResponse.setClusterStatisticsList(clusterStatisticsList);
	 
	 	return describeClusterStatisticsResponse;
	}
}