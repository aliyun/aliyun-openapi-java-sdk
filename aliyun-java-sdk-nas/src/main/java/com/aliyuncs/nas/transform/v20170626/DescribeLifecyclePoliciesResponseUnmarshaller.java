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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeLifecyclePoliciesResponse;
import com.aliyuncs.nas.model.v20170626.DescribeLifecyclePoliciesResponse.LifecyclePolicy;
import com.aliyuncs.nas.model.v20170626.DescribeLifecyclePoliciesResponse.LifecyclePolicy.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLifecyclePoliciesResponseUnmarshaller {

	public static DescribeLifecyclePoliciesResponse unmarshall(DescribeLifecyclePoliciesResponse describeLifecyclePoliciesResponse, UnmarshallerContext _ctx) {
		
		describeLifecyclePoliciesResponse.setRequestId(_ctx.stringValue("DescribeLifecyclePoliciesResponse.RequestId"));
		describeLifecyclePoliciesResponse.setTotalCount(_ctx.integerValue("DescribeLifecyclePoliciesResponse.TotalCount"));
		describeLifecyclePoliciesResponse.setPageSize(_ctx.integerValue("DescribeLifecyclePoliciesResponse.PageSize"));
		describeLifecyclePoliciesResponse.setPageNumber(_ctx.integerValue("DescribeLifecyclePoliciesResponse.PageNumber"));

		List<LifecyclePolicy> lifecyclePolicies = new ArrayList<LifecyclePolicy>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies.Length"); i++) {
			LifecyclePolicy lifecyclePolicy = new LifecyclePolicy();
			lifecyclePolicy.setPath(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].Path"));
			lifecyclePolicy.setStatus(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].Status"));
			lifecyclePolicy.setStorageType(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].StorageType"));
			lifecyclePolicy.setDescription(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].Description"));
			lifecyclePolicy.setLifecycleRuleName(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].LifecycleRuleName"));
			lifecyclePolicy.setLifecyclePolicyId(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].LifecyclePolicyId"));
			lifecyclePolicy.setCreateTime(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].CreateTime"));
			lifecyclePolicy.setLifecyclePolicyType(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].LifecyclePolicyType"));
			lifecyclePolicy.setLifecyclePolicyName(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].LifecyclePolicyName"));
			lifecyclePolicy.setFileSystemId(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].FileSystemId"));
			lifecyclePolicy.setLifecycleRuleType(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].LifecycleRuleType"));
			lifecyclePolicy.setEnableLifecycle(_ctx.booleanValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].EnableLifecycle"));

			List<String> fsetIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].FsetIds.Length"); j++) {
				fsetIds.add(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].FsetIds["+ j +"]"));
			}
			lifecyclePolicy.setFsetIds(fsetIds);

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].Paths["+ j +"]"));
			}
			lifecyclePolicy.setPaths(paths);

			List<Rule> retrieveRules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].RetrieveRules.Length"); j++) {
				Rule rule = new Rule();
				rule.setAttribute(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].RetrieveRules["+ j +"].Attribute"));
				rule.setThreshold(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].RetrieveRules["+ j +"].Threshold"));

				retrieveRules.add(rule);
			}
			lifecyclePolicy.setRetrieveRules(retrieveRules);

			List<Rule> deleteRules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].DeleteRules.Length"); j++) {
				Rule rule1 = new Rule();
				rule1.setAttribute(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].DeleteRules["+ j +"].Attribute"));
				rule1.setThreshold(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].DeleteRules["+ j +"].Threshold"));

				deleteRules.add(rule1);
			}
			lifecyclePolicy.setDeleteRules(deleteRules);

			List<Rule> transitRules = new ArrayList<Rule>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].TransitRules.Length"); j++) {
				Rule rule2 = new Rule();
				rule2.setAttribute(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].TransitRules["+ j +"].Attribute"));
				rule2.setThreshold(_ctx.stringValue("DescribeLifecyclePoliciesResponse.LifecyclePolicies["+ i +"].TransitRules["+ j +"].Threshold"));

				transitRules.add(rule2);
			}
			lifecyclePolicy.setTransitRules(transitRules);

			lifecyclePolicies.add(lifecyclePolicy);
		}
		describeLifecyclePoliciesResponse.setLifecyclePolicies(lifecyclePolicies);
	 
	 	return describeLifecyclePoliciesResponse;
	}
}