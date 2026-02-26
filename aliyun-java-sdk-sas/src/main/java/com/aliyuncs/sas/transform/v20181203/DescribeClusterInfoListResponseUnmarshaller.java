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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeClusterInfoListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeClusterInfoListResponse.ClusterInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterInfoListResponseUnmarshaller {

	public static DescribeClusterInfoListResponse unmarshall(DescribeClusterInfoListResponse describeClusterInfoListResponse, UnmarshallerContext _ctx) {
		
		describeClusterInfoListResponse.setRequestId(_ctx.stringValue("DescribeClusterInfoListResponse.RequestId"));

		List<ClusterInfo> clusterList = new ArrayList<ClusterInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterInfoListResponse.ClusterList.Length"); i++) {
			ClusterInfo clusterInfo = new ClusterInfo();
			clusterInfo.setState(_ctx.stringValue("DescribeClusterInfoListResponse.ClusterList["+ i +"].State"));
			clusterInfo.setClusterType(_ctx.stringValue("DescribeClusterInfoListResponse.ClusterList["+ i +"].ClusterType"));
			clusterInfo.setClusterName(_ctx.stringValue("DescribeClusterInfoListResponse.ClusterList["+ i +"].ClusterName"));
			clusterInfo.setClusterId(_ctx.stringValue("DescribeClusterInfoListResponse.ClusterList["+ i +"].ClusterId"));
			clusterInfo.setRegionId(_ctx.stringValue("DescribeClusterInfoListResponse.ClusterList["+ i +"].RegionId"));
			clusterInfo.setTargetResult(_ctx.booleanValue("DescribeClusterInfoListResponse.ClusterList["+ i +"].TargetResult"));

			clusterList.add(clusterInfo);
		}
		describeClusterInfoListResponse.setClusterList(clusterList);
	 
	 	return describeClusterInfoListResponse;
	}
}