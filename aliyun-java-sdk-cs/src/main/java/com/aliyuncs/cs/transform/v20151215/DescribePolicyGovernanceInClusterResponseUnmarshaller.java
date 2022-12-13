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

package com.aliyuncs.cs.transform.v20151215;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cs.model.v20151215.DescribePolicyGovernanceInClusterResponse;
import com.aliyuncs.cs.model.v20151215.DescribePolicyGovernanceInClusterResponse.Admit_log;
import com.aliyuncs.cs.model.v20151215.DescribePolicyGovernanceInClusterResponse.Admit_log.Log;
import com.aliyuncs.cs.model.v20151215.DescribePolicyGovernanceInClusterResponse.On_stateItem;
import com.aliyuncs.cs.model.v20151215.DescribePolicyGovernanceInClusterResponse.TotalViolations;
import com.aliyuncs.cs.model.v20151215.DescribePolicyGovernanceInClusterResponse.TotalViolations.Deny;
import com.aliyuncs.cs.model.v20151215.DescribePolicyGovernanceInClusterResponse.TotalViolations.Warn;
import com.aliyuncs.cs.model.v20151215.DescribePolicyGovernanceInClusterResponse.Violations;
import com.aliyuncs.cs.model.v20151215.DescribePolicyGovernanceInClusterResponse.Violations.Deny1;
import com.aliyuncs.cs.model.v20151215.DescribePolicyGovernanceInClusterResponse.Violations.Warn2;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyGovernanceInClusterResponseUnmarshaller {

	public static DescribePolicyGovernanceInClusterResponse unmarshall(DescribePolicyGovernanceInClusterResponse describePolicyGovernanceInClusterResponse, UnmarshallerContext _ctx) {
		

		Admit_log admit_log = new Admit_log();
		admit_log.setProgress(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.admit_log.progress"));
		admit_log.setCount(_ctx.longValue("DescribePolicyGovernanceInClusterResponse.admit_log.count"));

		Log log = new Log();
		log.setMsg(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.admit_log.log.msg"));
		log.setCluster_id(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.admit_log.log.cluster_id"));
		log.setConstraint_kind(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.admit_log.log.constraint_kind"));
		log.setResource_name(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.admit_log.log.resource_name"));
		log.setResource_kind(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.admit_log.log.resource_kind"));
		log.setResource_namespace(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.admit_log.log.resource_namespace"));
		admit_log.setLog(log);
		describePolicyGovernanceInClusterResponse.setAdmit_log(admit_log);

		TotalViolations totalViolations = new TotalViolations();

		Deny deny = new Deny();
		deny.setSeverity(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.totalViolations.deny.severity"));
		deny.setViolations(_ctx.longValue("DescribePolicyGovernanceInClusterResponse.totalViolations.deny.violations"));
		totalViolations.setDeny(deny);

		Warn warn = new Warn();
		warn.setSeverity(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.totalViolations.warn.severity"));
		warn.setViolations(_ctx.longValue("DescribePolicyGovernanceInClusterResponse.totalViolations.warn.violations"));
		totalViolations.setWarn(warn);
		describePolicyGovernanceInClusterResponse.setTotalViolations(totalViolations);

		Violations violations = new Violations();

		Deny1 deny1 = new Deny1();
		deny1.setPolicyName(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.violations.deny.policyName"));
		deny1.setPolicyDescription(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.violations.deny.policyDescription"));
		deny1.setViolations(_ctx.longValue("DescribePolicyGovernanceInClusterResponse.violations.deny.violations"));
		deny1.setSeverity(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.violations.deny.severity"));
		violations.setDeny1(deny1);

		Warn2 warn2 = new Warn2();
		warn2.setPolicyName(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.violations.warn.policyName"));
		warn2.setPolicyDescription(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.violations.warn.policyDescription"));
		warn2.setViolations(_ctx.longValue("DescribePolicyGovernanceInClusterResponse.violations.warn.violations"));
		warn2.setSeverity(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.violations.warn.severity"));
		violations.setWarn2(warn2);
		describePolicyGovernanceInClusterResponse.setViolations(violations);

		List<On_stateItem> on_state = new ArrayList<On_stateItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyGovernanceInClusterResponse.on_state.Length"); i++) {
			On_stateItem on_stateItem = new On_stateItem();
			on_stateItem.setEnabled_count(_ctx.integerValue("DescribePolicyGovernanceInClusterResponse.on_state["+ i +"].enabled_count"));
			on_stateItem.setTotal(_ctx.integerValue("DescribePolicyGovernanceInClusterResponse.on_state["+ i +"].total"));
			on_stateItem.setSeverity(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.on_state["+ i +"].severity"));

			on_state.add(on_stateItem);
		}
		describePolicyGovernanceInClusterResponse.setOn_state(on_state);
	 
	 	return describePolicyGovernanceInClusterResponse;
	}
}