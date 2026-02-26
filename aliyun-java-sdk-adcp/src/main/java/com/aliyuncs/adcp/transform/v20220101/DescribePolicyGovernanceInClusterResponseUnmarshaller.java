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

package com.aliyuncs.adcp.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.Cluster;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.PolicyGovernance1;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.PolicyGovernance1.AdmitLog;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.PolicyGovernance1.State;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.PolicyGovernance1.Violation;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.PolicyGovernance1.Violation.TotalViolations;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.PolicyGovernance1.Violation.TotalViolations.DenySeverity;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.PolicyGovernance1.Violation.TotalViolations.WarnSeverity;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.PolicyGovernance1.Violation.Violations;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.PolicyGovernance1.Violation.Violations.DenyViolations;
import com.aliyuncs.adcp.model.v20220101.DescribePolicyGovernanceInClusterResponse.PolicyGovernance.PolicyGovernance1.Violation.Violations.WarnViolations;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePolicyGovernanceInClusterResponseUnmarshaller {

	public static DescribePolicyGovernanceInClusterResponse unmarshall(DescribePolicyGovernanceInClusterResponse describePolicyGovernanceInClusterResponse, UnmarshallerContext _ctx) {
		
		describePolicyGovernanceInClusterResponse.setRequestId(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.RequestId"));

		List<PolicyGovernance> policyGovernances = new ArrayList<PolicyGovernance>();
		for (int i = 0; i < _ctx.lengthValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances.Length"); i++) {
			PolicyGovernance policyGovernance = new PolicyGovernance();

			Cluster cluster = new Cluster();
			cluster.setClusterId(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].Cluster.ClusterId"));
			cluster.setName(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].Cluster.Name"));
			cluster.setRegionId(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].Cluster.RegionId"));
			cluster.setState(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].Cluster.State"));
			cluster.setClusterType(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].Cluster.ClusterType"));
			cluster.setClusterSpec(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].Cluster.ClusterSpec"));
			cluster.setProfile(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].Cluster.Profile"));
			policyGovernance.setCluster(cluster);

			PolicyGovernance1 policyGovernance1 = new PolicyGovernance1();

			AdmitLog admitLog = new AdmitLog();
			admitLog.setProgress(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.AdmitLog.Progress"));
			admitLog.setCount(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.AdmitLog.Count"));
			admitLog.setLogProject(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.AdmitLog.LogProject"));
			admitLog.setLogStore(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.AdmitLog.LogStore"));

			List<Map<Object, Object>> logs = _ctx.listMapValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.AdmitLog.Logs");
			admitLog.setLogs(logs);
			policyGovernance1.setAdmitLog(admitLog);

			Violation violation = new Violation();

			TotalViolations totalViolations = new TotalViolations();

			List<DenySeverity> deny = new ArrayList<DenySeverity>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.TotalViolations.Deny.Length"); j++) {
				DenySeverity denySeverity = new DenySeverity();
				denySeverity.setSeverity(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.TotalViolations.Deny["+ j +"].Severity"));
				denySeverity.setViolations(_ctx.longValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.TotalViolations.Deny["+ j +"].Violations"));

				deny.add(denySeverity);
			}
			totalViolations.setDeny(deny);

			List<WarnSeverity> warn = new ArrayList<WarnSeverity>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.TotalViolations.Warn.Length"); j++) {
				WarnSeverity warnSeverity = new WarnSeverity();
				warnSeverity.setSeverity(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.TotalViolations.Warn["+ j +"].Severity"));
				warnSeverity.setViolations(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.TotalViolations.Warn["+ j +"].Violations"));

				warn.add(warnSeverity);
			}
			totalViolations.setWarn(warn);
			violation.setTotalViolations(totalViolations);

			Violations violations = new Violations();

			List<DenyViolations> deny2 = new ArrayList<DenyViolations>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.Violations.Deny.Length"); j++) {
				DenyViolations denyViolations = new DenyViolations();
				denyViolations.setPolicyName(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.Violations.Deny["+ j +"].PolicyName"));
				denyViolations.setPolicyDescription(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.Violations.Deny["+ j +"].PolicyDescription"));
				denyViolations.setSeverity(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.Violations.Deny["+ j +"].Severity"));
				denyViolations.setViolations(_ctx.longValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.Violations.Deny["+ j +"].Violations"));

				deny2.add(denyViolations);
			}
			violations.setDeny2(deny2);

			List<WarnViolations> warn3 = new ArrayList<WarnViolations>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.Violations.Warn.Length"); j++) {
				WarnViolations warnViolations = new WarnViolations();
				warnViolations.setPolicyName(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.Violations.Warn["+ j +"].PolicyName"));
				warnViolations.setPolicyDescription(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.Violations.Warn["+ j +"].PolicyDescription"));
				warnViolations.setSeverity(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.Violations.Warn["+ j +"].Severity"));
				warnViolations.setViolations(_ctx.longValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.Violation.Violations.Warn["+ j +"].Violations"));

				warn3.add(warnViolations);
			}
			violations.setWarn3(warn3);
			violation.setViolations(violations);
			policyGovernance1.setViolation(violation);

			List<State> onState = new ArrayList<State>();
			for (int j = 0; j < _ctx.lengthValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.OnState.Length"); j++) {
				State state = new State();
				state.setEnabledCount(_ctx.longValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.OnState["+ j +"].EnabledCount"));
				state.setTotalCount(_ctx.longValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.OnState["+ j +"].TotalCount"));
				state.setSeverity(_ctx.stringValue("DescribePolicyGovernanceInClusterResponse.PolicyGovernances["+ i +"].PolicyGovernance.OnState["+ j +"].Severity"));

				onState.add(state);
			}
			policyGovernance1.setOnState(onState);
			policyGovernance.setPolicyGovernance1(policyGovernance1);

			policyGovernances.add(policyGovernance);
		}
		describePolicyGovernanceInClusterResponse.setPolicyGovernances(policyGovernances);
	 
	 	return describePolicyGovernanceInClusterResponse;
	}
}