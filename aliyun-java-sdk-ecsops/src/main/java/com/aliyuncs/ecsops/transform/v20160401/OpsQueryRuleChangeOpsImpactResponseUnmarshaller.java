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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryRuleChangeOpsImpactResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryRuleChangeOpsImpactResponse.MatchedException;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryRuleChangeOpsImpactResponseUnmarshaller {

	public static OpsQueryRuleChangeOpsImpactResponse unmarshall(OpsQueryRuleChangeOpsImpactResponse opsQueryRuleChangeOpsImpactResponse, UnmarshallerContext _ctx) {
		
		opsQueryRuleChangeOpsImpactResponse.setRequestId(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.RequestId"));
		opsQueryRuleChangeOpsImpactResponse.setStatus(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.Status"));
		opsQueryRuleChangeOpsImpactResponse.setFinished(_ctx.booleanValue("OpsQueryRuleChangeOpsImpactResponse.Finished"));
		opsQueryRuleChangeOpsImpactResponse.setErrorInfo(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.ErrorInfo"));
		opsQueryRuleChangeOpsImpactResponse.setToken(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.Token"));
		opsQueryRuleChangeOpsImpactResponse.setIterationQuery(_ctx.booleanValue("OpsQueryRuleChangeOpsImpactResponse.IterationQuery"));

		List<String> iterationTokens = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryRuleChangeOpsImpactResponse.IterationTokens.Length"); i++) {
			iterationTokens.add(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.IterationTokens["+ i +"]"));
		}
		opsQueryRuleChangeOpsImpactResponse.setIterationTokens(iterationTokens);

		List<MatchedException> matchedExceptions = new ArrayList<MatchedException>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryRuleChangeOpsImpactResponse.MatchedExceptions.Length"); i++) {
			MatchedException matchedException = new MatchedException();
			matchedException.setFirstMatchedTime(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.MatchedExceptions["+ i +"].FirstMatchedTime"));
			matchedException.setMatchedFeatures(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.MatchedExceptions["+ i +"].MatchedFeatures"));
			matchedException.setProductName(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.MatchedExceptions["+ i +"].ProductName"));
			matchedException.setClusterName(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.MatchedExceptions["+ i +"].ClusterName"));
			matchedException.setNcIp(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.MatchedExceptions["+ i +"].NcIp"));
			matchedException.setAdditionalInfo(_ctx.stringValue("OpsQueryRuleChangeOpsImpactResponse.MatchedExceptions["+ i +"].AdditionalInfo"));

			matchedExceptions.add(matchedException);
		}
		opsQueryRuleChangeOpsImpactResponse.setMatchedExceptions(matchedExceptions);
	 
	 	return opsQueryRuleChangeOpsImpactResponse;
	}
}