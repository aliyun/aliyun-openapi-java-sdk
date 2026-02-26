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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.DescribeGrantRulesToResourceResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeGrantRulesToResourceResponse.GrantRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGrantRulesToResourceResponseUnmarshaller {

	public static DescribeGrantRulesToResourceResponse unmarshall(DescribeGrantRulesToResourceResponse describeGrantRulesToResourceResponse, UnmarshallerContext _ctx) {
		
		describeGrantRulesToResourceResponse.setRequestId(_ctx.stringValue("DescribeGrantRulesToResourceResponse.RequestId"));
		describeGrantRulesToResourceResponse.setNextToken(_ctx.stringValue("DescribeGrantRulesToResourceResponse.NextToken"));
		describeGrantRulesToResourceResponse.setTotalCount(_ctx.integerValue("DescribeGrantRulesToResourceResponse.TotalCount"));
		describeGrantRulesToResourceResponse.setMaxResults(_ctx.integerValue("DescribeGrantRulesToResourceResponse.MaxResults"));

		List<GrantRule> grantRules = new ArrayList<GrantRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGrantRulesToResourceResponse.GrantRules.Length"); i++) {
			GrantRule grantRule = new GrantRule();
			grantRule.setCenOwnerId(_ctx.longValue("DescribeGrantRulesToResourceResponse.GrantRules["+ i +"].CenOwnerId"));
			grantRule.setOrderType(_ctx.stringValue("DescribeGrantRulesToResourceResponse.GrantRules["+ i +"].OrderType"));
			grantRule.setCenId(_ctx.stringValue("DescribeGrantRulesToResourceResponse.GrantRules["+ i +"].CenId"));
			grantRule.setCreateTime(_ctx.stringValue("DescribeGrantRulesToResourceResponse.GrantRules["+ i +"].CreateTime"));

			grantRules.add(grantRule);
		}
		describeGrantRulesToResourceResponse.setGrantRules(grantRules);
	 
	 	return describeGrantRulesToResourceResponse;
	}
}