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

package com.aliyuncs.selectdb.transform.v20230522;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.selectdb.model.v20230522.DescribeElasticRulesResponse;
import com.aliyuncs.selectdb.model.v20230522.DescribeElasticRulesResponse.Data;
import com.aliyuncs.selectdb.model.v20230522.DescribeElasticRulesResponse.Data.RulesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeElasticRulesResponseUnmarshaller {

	public static DescribeElasticRulesResponse unmarshall(DescribeElasticRulesResponse describeElasticRulesResponse, UnmarshallerContext _ctx) {
		
		describeElasticRulesResponse.setRequestId(_ctx.stringValue("DescribeElasticRulesResponse.RequestId"));

		Data data = new Data();
		data.setDbInstanceId(_ctx.stringValue("DescribeElasticRulesResponse.Data.DbInstanceId"));
		data.setClusterId(_ctx.stringValue("DescribeElasticRulesResponse.Data.ClusterId"));

		List<RulesItem> rules = new ArrayList<RulesItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeElasticRulesResponse.Data.Rules.Length"); i++) {
			RulesItem rulesItem = new RulesItem();
			rulesItem.setRuleId(_ctx.longValue("DescribeElasticRulesResponse.Data.Rules["+ i +"].RuleId"));
			rulesItem.setExecutionPeriod(_ctx.stringValue("DescribeElasticRulesResponse.Data.Rules["+ i +"].ExecutionPeriod"));
			rulesItem.setElasticRuleStartTime(_ctx.stringValue("DescribeElasticRulesResponse.Data.Rules["+ i +"].ElasticRuleStartTime"));
			rulesItem.setClusterClass(_ctx.stringValue("DescribeElasticRulesResponse.Data.Rules["+ i +"].ClusterClass"));

			rules.add(rulesItem);
		}
		data.setRules(rules);
		describeElasticRulesResponse.setData(data);
	 
	 	return describeElasticRulesResponse;
	}
}