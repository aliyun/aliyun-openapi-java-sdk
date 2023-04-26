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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsPathsResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkInsightsPathsResponseUnmarshaller {

	public static DescribeNetworkInsightsPathsResponse unmarshall(DescribeNetworkInsightsPathsResponse describeNetworkInsightsPathsResponse, UnmarshallerContext _ctx) {
		
		describeNetworkInsightsPathsResponse.setRequestId(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.RequestId"));
		describeNetworkInsightsPathsResponse.setNextToken(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NextToken"));
		describeNetworkInsightsPathsResponse.setMaxResults(_ctx.integerValue("DescribeNetworkInsightsPathsResponse.MaxResults"));

		List<NetworkInsightsPathSet> networkInsightsPathSets = new ArrayList<NetworkInsightsPathSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets.Length"); i++) {
			NetworkInsightsPathSet networkInsightsPathSet = new NetworkInsightsPathSet();
			networkInsightsPathSet.setNetworkInsightsPathId(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].NetworkInsightsPathId"));
			networkInsightsPathSet.setNetworkInsightsPathName(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].NetworkInsightsPathName"));
			networkInsightsPathSet.setCreationTime(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].CreationTime"));
			networkInsightsPathSet.setSource(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].Source"));
			networkInsightsPathSet.setSourceType(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].SourceType"));
			networkInsightsPathSet.setDestination(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].Destination"));
			networkInsightsPathSet.setDestinationType(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].DestinationType"));
			networkInsightsPathSet.setDestinationPort(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].DestinationPort"));
			networkInsightsPathSet.setBizProtocol(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].Protocol"));
			networkInsightsPathSet.setStatus(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].Status"));
			networkInsightsPathSet.setNetworkPathFound(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].NetworkPathFound"));
			networkInsightsPathSet.setSeverity(_ctx.stringValue("DescribeNetworkInsightsPathsResponse.NetworkInsightsPathSets["+ i +"].Severity"));

			networkInsightsPathSets.add(networkInsightsPathSet);
		}
		describeNetworkInsightsPathsResponse.setNetworkInsightsPathSets(networkInsightsPathSets);
	 
	 	return describeNetworkInsightsPathsResponse;
	}
}