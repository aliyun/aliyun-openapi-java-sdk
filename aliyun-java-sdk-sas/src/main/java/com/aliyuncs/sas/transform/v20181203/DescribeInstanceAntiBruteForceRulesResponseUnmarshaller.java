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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeInstanceAntiBruteForceRulesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeInstanceAntiBruteForceRulesResponse.InstanceAntiBruteForceRule;
import com.aliyuncs.sas.model.v20181203.DescribeInstanceAntiBruteForceRulesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceAntiBruteForceRulesResponseUnmarshaller {

	public static DescribeInstanceAntiBruteForceRulesResponse unmarshall(DescribeInstanceAntiBruteForceRulesResponse describeInstanceAntiBruteForceRulesResponse, UnmarshallerContext _ctx) {
		
		describeInstanceAntiBruteForceRulesResponse.setRequestId(_ctx.stringValue("DescribeInstanceAntiBruteForceRulesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeInstanceAntiBruteForceRulesResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeInstanceAntiBruteForceRulesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeInstanceAntiBruteForceRulesResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeInstanceAntiBruteForceRulesResponse.PageInfo.CurrentPage"));
		describeInstanceAntiBruteForceRulesResponse.setPageInfo(pageInfo);

		List<InstanceAntiBruteForceRule> rules = new ArrayList<InstanceAntiBruteForceRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceAntiBruteForceRulesResponse.Rules.Length"); i++) {
			InstanceAntiBruteForceRule instanceAntiBruteForceRule = new InstanceAntiBruteForceRule();
			instanceAntiBruteForceRule.setId(_ctx.longValue("DescribeInstanceAntiBruteForceRulesResponse.Rules["+ i +"].Id"));
			instanceAntiBruteForceRule.setName(_ctx.stringValue("DescribeInstanceAntiBruteForceRulesResponse.Rules["+ i +"].Name"));
			instanceAntiBruteForceRule.setUuid(_ctx.stringValue("DescribeInstanceAntiBruteForceRulesResponse.Rules["+ i +"].Uuid"));

			rules.add(instanceAntiBruteForceRule);
		}
		describeInstanceAntiBruteForceRulesResponse.setRules(rules);
	 
	 	return describeInstanceAntiBruteForceRulesResponse;
	}
}