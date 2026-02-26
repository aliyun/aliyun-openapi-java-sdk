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

import com.aliyuncs.sas.model.v20181203.GetInterceptionSummaryResponse;
import com.aliyuncs.sas.model.v20181203.GetInterceptionSummaryResponse.InterceptionSummary;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInterceptionSummaryResponseUnmarshaller {

	public static GetInterceptionSummaryResponse unmarshall(GetInterceptionSummaryResponse getInterceptionSummaryResponse, UnmarshallerContext _ctx) {
		
		getInterceptionSummaryResponse.setRequestId(_ctx.stringValue("GetInterceptionSummaryResponse.RequestId"));

		InterceptionSummary interceptionSummary = new InterceptionSummary();
		interceptionSummary.setCloseClusterCount(_ctx.integerValue("GetInterceptionSummaryResponse.InterceptionSummary.CloseClusterCount"));
		interceptionSummary.setRiskCount30Day(_ctx.longValue("GetInterceptionSummaryResponse.InterceptionSummary.RiskCount30Day"));
		interceptionSummary.setRiskCount180Day(_ctx.longValue("GetInterceptionSummaryResponse.InterceptionSummary.RiskCount180Day"));
		interceptionSummary.setOpenClusterCount(_ctx.integerValue("GetInterceptionSummaryResponse.InterceptionSummary.OpenClusterCount"));
		interceptionSummary.setRiskCountToday(_ctx.longValue("GetInterceptionSummaryResponse.InterceptionSummary.RiskCountToday"));
		interceptionSummary.setCloseRuleCount(_ctx.integerValue("GetInterceptionSummaryResponse.InterceptionSummary.CloseRuleCount"));
		interceptionSummary.setRuleCount(_ctx.integerValue("GetInterceptionSummaryResponse.InterceptionSummary.RuleCount"));
		interceptionSummary.setClusterCount(_ctx.integerValue("GetInterceptionSummaryResponse.InterceptionSummary.ClusterCount"));
		interceptionSummary.setSuggestRuleCount(_ctx.integerValue("GetInterceptionSummaryResponse.InterceptionSummary.SuggestRuleCount"));
		interceptionSummary.setOpenRuleCount(_ctx.integerValue("GetInterceptionSummaryResponse.InterceptionSummary.OpenRuleCount"));
		interceptionSummary.setInterceptionCountInDays(_ctx.integerValue("GetInterceptionSummaryResponse.InterceptionSummary.InterceptionCountInDays"));
		getInterceptionSummaryResponse.setInterceptionSummary(interceptionSummary);
	 
	 	return getInterceptionSummaryResponse;
	}
}