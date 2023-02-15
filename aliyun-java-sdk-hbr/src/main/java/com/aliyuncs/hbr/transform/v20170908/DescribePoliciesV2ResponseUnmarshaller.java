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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribePoliciesV2Response;
import com.aliyuncs.hbr.model.v20170908.DescribePoliciesV2Response.Policy;
import com.aliyuncs.hbr.model.v20170908.DescribePoliciesV2Response.Policy.Rule;
import com.aliyuncs.hbr.model.v20170908.DescribePoliciesV2Response.Policy.Rule.RetentionRule;
import com.aliyuncs.hbr.model.v20170908.DescribePoliciesV2Response.Policy.Rule.Selector;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePoliciesV2ResponseUnmarshaller {

	public static DescribePoliciesV2Response unmarshall(DescribePoliciesV2Response describePoliciesV2Response, UnmarshallerContext _ctx) {
		
		describePoliciesV2Response.setRequestId(_ctx.stringValue("DescribePoliciesV2Response.RequestId"));
		describePoliciesV2Response.setNextToken(_ctx.stringValue("DescribePoliciesV2Response.NextToken"));
		describePoliciesV2Response.setMaxResults(_ctx.integerValue("DescribePoliciesV2Response.MaxResults"));
		describePoliciesV2Response.setTotalCount(_ctx.longValue("DescribePoliciesV2Response.TotalCount"));
		describePoliciesV2Response.setSuccess(_ctx.booleanValue("DescribePoliciesV2Response.Success"));
		describePoliciesV2Response.setCode(_ctx.stringValue("DescribePoliciesV2Response.Code"));
		describePoliciesV2Response.setMessage(_ctx.stringValue("DescribePoliciesV2Response.Message"));

		List<Policy> policies = new ArrayList<Policy>();
		for (int i = 0; i < _ctx.lengthValue("DescribePoliciesV2Response.Policies.Length"); i++) {
			Policy policy = new Policy();
			policy.setCreatedTime(_ctx.longValue("DescribePoliciesV2Response.Policies["+ i +"].CreatedTime"));
			policy.setUpdatedTime(_ctx.longValue("DescribePoliciesV2Response.Policies["+ i +"].UpdatedTime"));
			policy.setPolicyId(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].PolicyId"));
			policy.setPolicyName(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].PolicyName"));
			policy.setPolicyDescription(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].PolicyDescription"));
			policy.setPolicyBindingCount(_ctx.longValue("DescribePoliciesV2Response.Policies["+ i +"].PolicyBindingCount"));
			policy.setRecommendVersion(_ctx.integerValue("DescribePoliciesV2Response.Policies["+ i +"].RecommendVersion"));

			List<Rule> rules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribePoliciesV2Response.Policies["+ i +"].Rules.Length"); j++) {
				Rule rule = new Rule();
				rule.setRuleId(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].RuleId"));
				rule.setRuleType(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].RuleType"));
				rule.setSchedule(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].Schedule"));
				rule.setBackupType(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].BackupType"));
				rule.setContinuous(_ctx.booleanValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].Continuous"));
				rule.setVaultId(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].VaultId"));
				rule.setReplicationRegionId(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].ReplicationRegionId"));
				rule.setReplicationVaultId(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].ReplicationVaultId"));
				rule.setRetention(_ctx.longValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].Retention"));
				rule.setArchiveVaultId(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].ArchiveVaultId"));
				rule.setArchiveDays(_ctx.longValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].ArchiveDays"));
				rule.setColdArchiveDays(_ctx.longValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].ColdArchiveDays"));

				Selector selector = new Selector();
				selector.setKey(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].Selector.Key"));
				selector.setValue(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].Selector.Value"));
				rule.setSelector(selector);

				List<RetentionRule> retentionRules = new ArrayList<RetentionRule>();
				for (int k = 0; k < _ctx.lengthValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].RetentionRules.Length"); k++) {
					RetentionRule retentionRule = new RetentionRule();
					retentionRule.setAdvancedRetentionType(_ctx.stringValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].RetentionRules["+ k +"].AdvancedRetentionType"));
					retentionRule.setWhichSnapshot(_ctx.longValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].RetentionRules["+ k +"].WhichSnapshot"));
					retentionRule.setRetention(_ctx.longValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].RetentionRules["+ k +"].Retention"));
					retentionRule.setActiveTime(_ctx.longValue("DescribePoliciesV2Response.Policies["+ i +"].Rules["+ j +"].RetentionRules["+ k +"].ActiveTime"));

					retentionRules.add(retentionRule);
				}
				rule.setRetentionRules(retentionRules);

				rules.add(rule);
			}
			policy.setRules(rules);

			policies.add(policy);
		}
		describePoliciesV2Response.setPolicies(policies);
	 
	 	return describePoliciesV2Response;
	}
}