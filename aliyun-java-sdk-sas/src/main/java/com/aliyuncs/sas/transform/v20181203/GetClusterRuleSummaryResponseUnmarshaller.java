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

import com.aliyuncs.sas.model.v20181203.GetClusterRuleSummaryResponse;
import com.aliyuncs.sas.model.v20181203.GetClusterRuleSummaryResponse.ClusterRuleSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterRuleSummaryResponseUnmarshaller {

	public static GetClusterRuleSummaryResponse unmarshall(GetClusterRuleSummaryResponse getClusterRuleSummaryResponse, UnmarshallerContext _ctx) {
		
		getClusterRuleSummaryResponse.setRequestId(_ctx.stringValue("GetClusterRuleSummaryResponse.RequestId"));

		ClusterRuleSummary clusterRuleSummary = new ClusterRuleSummary();
		clusterRuleSummary.setInterceptionSwitch(_ctx.integerValue("GetClusterRuleSummaryResponse.ClusterRuleSummary.InterceptionSwitch"));
		clusterRuleSummary.setCloseRuleCount(_ctx.integerValue("GetClusterRuleSummaryResponse.ClusterRuleSummary.CloseRuleCount"));
		clusterRuleSummary.setInterceptionType(_ctx.integerValue("GetClusterRuleSummaryResponse.ClusterRuleSummary.InterceptionType"));
		clusterRuleSummary.setRuleCount(_ctx.integerValue("GetClusterRuleSummaryResponse.ClusterRuleSummary.RuleCount"));
		clusterRuleSummary.setOpenRuleCount(_ctx.integerValue("GetClusterRuleSummaryResponse.ClusterRuleSummary.OpenRuleCount"));
		clusterRuleSummary.setSuggestRuleCount(_ctx.integerValue("GetClusterRuleSummaryResponse.ClusterRuleSummary.SuggestRuleCount"));
		clusterRuleSummary.setInterceptionCount7Day(_ctx.longValue("GetClusterRuleSummaryResponse.ClusterRuleSummary.InterceptionCount7Day"));
		getClusterRuleSummaryResponse.setClusterRuleSummary(clusterRuleSummary);
	 
	 	return getClusterRuleSummaryResponse;
	}
}