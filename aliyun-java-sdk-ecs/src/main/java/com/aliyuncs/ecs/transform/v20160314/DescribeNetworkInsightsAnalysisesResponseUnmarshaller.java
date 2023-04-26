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

import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisesResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeNetworkInsightsAnalysisesResponse.NetworkInsightsAnalysisSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeNetworkInsightsAnalysisesResponseUnmarshaller {

	public static DescribeNetworkInsightsAnalysisesResponse unmarshall(DescribeNetworkInsightsAnalysisesResponse describeNetworkInsightsAnalysisesResponse, UnmarshallerContext _ctx) {
		
		describeNetworkInsightsAnalysisesResponse.setRequestId(_ctx.stringValue("DescribeNetworkInsightsAnalysisesResponse.RequestId"));
		describeNetworkInsightsAnalysisesResponse.setNextToken(_ctx.stringValue("DescribeNetworkInsightsAnalysisesResponse.NextToken"));
		describeNetworkInsightsAnalysisesResponse.setMaxResults(_ctx.integerValue("DescribeNetworkInsightsAnalysisesResponse.MaxResults"));

		List<NetworkInsightsAnalysisSet> networkInsightsAnalysisSets = new ArrayList<NetworkInsightsAnalysisSet>();
		for (int i = 0; i < _ctx.lengthValue("DescribeNetworkInsightsAnalysisesResponse.NetworkInsightsAnalysisSets.Length"); i++) {
			NetworkInsightsAnalysisSet networkInsightsAnalysisSet = new NetworkInsightsAnalysisSet();
			networkInsightsAnalysisSet.setNetworkInsightsPathId(_ctx.stringValue("DescribeNetworkInsightsAnalysisesResponse.NetworkInsightsAnalysisSets["+ i +"].NetworkInsightsPathId"));
			networkInsightsAnalysisSet.setNetworkInsightsAnalysisId(_ctx.stringValue("DescribeNetworkInsightsAnalysisesResponse.NetworkInsightsAnalysisSets["+ i +"].NetworkInsightsAnalysisId"));
			networkInsightsAnalysisSet.setNetworkPathFound(_ctx.stringValue("DescribeNetworkInsightsAnalysisesResponse.NetworkInsightsAnalysisSets["+ i +"].NetworkPathFound"));
			networkInsightsAnalysisSet.setStatus(_ctx.stringValue("DescribeNetworkInsightsAnalysisesResponse.NetworkInsightsAnalysisSets["+ i +"].Status"));
			networkInsightsAnalysisSet.setCreationTime(_ctx.stringValue("DescribeNetworkInsightsAnalysisesResponse.NetworkInsightsAnalysisSets["+ i +"].CreationTime"));
			networkInsightsAnalysisSet.setSeverity(_ctx.stringValue("DescribeNetworkInsightsAnalysisesResponse.NetworkInsightsAnalysisSets["+ i +"].Severity"));

			networkInsightsAnalysisSets.add(networkInsightsAnalysisSet);
		}
		describeNetworkInsightsAnalysisesResponse.setNetworkInsightsAnalysisSets(networkInsightsAnalysisSets);
	 
	 	return describeNetworkInsightsAnalysisesResponse;
	}
}