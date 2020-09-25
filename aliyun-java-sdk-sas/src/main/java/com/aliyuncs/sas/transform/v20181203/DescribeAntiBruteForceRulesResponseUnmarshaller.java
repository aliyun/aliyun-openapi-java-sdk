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

import com.aliyuncs.sas.model.v20181203.DescribeAntiBruteForceRulesResponse;
import com.aliyuncs.sas.model.v20181203.DescribeAntiBruteForceRulesResponse.AntiBruteForceRule;
import com.aliyuncs.sas.model.v20181203.DescribeAntiBruteForceRulesResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAntiBruteForceRulesResponseUnmarshaller {

	public static DescribeAntiBruteForceRulesResponse unmarshall(DescribeAntiBruteForceRulesResponse describeAntiBruteForceRulesResponse, UnmarshallerContext _ctx) {
		
		describeAntiBruteForceRulesResponse.setRequestId(_ctx.stringValue("DescribeAntiBruteForceRulesResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCount(_ctx.integerValue("DescribeAntiBruteForceRulesResponse.PageInfo.Count"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeAntiBruteForceRulesResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeAntiBruteForceRulesResponse.PageInfo.TotalCount"));
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeAntiBruteForceRulesResponse.PageInfo.CurrentPage"));
		describeAntiBruteForceRulesResponse.setPageInfo(pageInfo);

		List<AntiBruteForceRule> rules = new ArrayList<AntiBruteForceRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAntiBruteForceRulesResponse.Rules.Length"); i++) {
			AntiBruteForceRule antiBruteForceRule = new AntiBruteForceRule();
			antiBruteForceRule.setId(_ctx.longValue("DescribeAntiBruteForceRulesResponse.Rules["+ i +"].Id"));
			antiBruteForceRule.setDefaultRule(_ctx.booleanValue("DescribeAntiBruteForceRulesResponse.Rules["+ i +"].DefaultRule"));
			antiBruteForceRule.setName(_ctx.stringValue("DescribeAntiBruteForceRulesResponse.Rules["+ i +"].Name"));
			antiBruteForceRule.setSpan(_ctx.integerValue("DescribeAntiBruteForceRulesResponse.Rules["+ i +"].Span"));
			antiBruteForceRule.setFailCount(_ctx.integerValue("DescribeAntiBruteForceRulesResponse.Rules["+ i +"].FailCount"));
			antiBruteForceRule.setForbiddenTime(_ctx.integerValue("DescribeAntiBruteForceRulesResponse.Rules["+ i +"].ForbiddenTime"));
			antiBruteForceRule.setEnableSmartRule(_ctx.booleanValue("DescribeAntiBruteForceRulesResponse.Rules["+ i +"].EnableSmartRule"));
			antiBruteForceRule.setMachineCount(_ctx.integerValue("DescribeAntiBruteForceRulesResponse.Rules["+ i +"].MachineCount"));

			List<String> uuidList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAntiBruteForceRulesResponse.Rules["+ i +"].UuidList.Length"); j++) {
				uuidList.add(_ctx.stringValue("DescribeAntiBruteForceRulesResponse.Rules["+ i +"].UuidList["+ j +"]"));
			}
			antiBruteForceRule.setUuidList(uuidList);

			rules.add(antiBruteForceRule);
		}
		describeAntiBruteForceRulesResponse.setRules(rules);
	 
	 	return describeAntiBruteForceRulesResponse;
	}
}