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

package com.aliyuncs.waf_openapi.transform.v20180117;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20180117.DescribeAclRulesResponse;
import com.aliyuncs.waf_openapi.model.v20180117.DescribeAclRulesResponse.Result;
import com.aliyuncs.waf_openapi.model.v20180117.DescribeAclRulesResponse.Result.AclRule;
import com.aliyuncs.waf_openapi.model.v20180117.DescribeAclRulesResponse.Result.AclRule.Condition;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAclRulesResponseUnmarshaller {

	public static DescribeAclRulesResponse unmarshall(DescribeAclRulesResponse describeAclRulesResponse, UnmarshallerContext _ctx) {
		
		describeAclRulesResponse.setRequestId(_ctx.stringValue("DescribeAclRulesResponse.RequestId"));

		Result result = new Result();
		result.setTotal(_ctx.integerValue("DescribeAclRulesResponse.Result.Total"));

		List<AclRule> aclRules = new ArrayList<AclRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAclRulesResponse.Result.AclRules.Length"); i++) {
			AclRule aclRule = new AclRule();
			aclRule.setContinueWaf(_ctx.integerValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].ContinueWaf"));
			aclRule.setContinueBlockGeo(_ctx.integerValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].ContinueBlockGeo"));
			aclRule.setContinueSA(_ctx.integerValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].ContinueSA"));
			aclRule.setContinueSdk(_ctx.integerValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].ContinueSdk"));
			aclRule.setContinueDataRiskControl(_ctx.integerValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].ContinueDataRiskControl"));
			aclRule.setContinueCc(_ctx.integerValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].ContinueCc"));
			aclRule.setIsDefault(_ctx.integerValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].IsDefault"));
			aclRule.setName(_ctx.stringValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].Name"));
			aclRule.setAction(_ctx.integerValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].Action"));
			aclRule.setId(_ctx.longValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].Id"));
			aclRule.setOrder(_ctx.integerValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].Order"));

			List<Condition> conditions = new ArrayList<Condition>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].Conditions.Length"); j++) {
				Condition condition = new Condition();
				condition.setContain(_ctx.stringValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].Conditions["+ j +"].Contain"));
				condition.setValue(_ctx.stringValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].Conditions["+ j +"].Value"));
				condition.setKey(_ctx.stringValue("DescribeAclRulesResponse.Result.AclRules["+ i +"].Conditions["+ j +"].Key"));

				conditions.add(condition);
			}
			aclRule.setConditions(conditions);

			aclRules.add(aclRule);
		}
		result.setAclRules(aclRules);
		describeAclRulesResponse.setResult(result);
	 
	 	return describeAclRulesResponse;
	}
}