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

import com.aliyuncs.cbn.model.v20170912.DescribeGrantRulesToCenResponse;
import com.aliyuncs.cbn.model.v20170912.DescribeGrantRulesToCenResponse.GrantRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGrantRulesToCenResponseUnmarshaller {

	public static DescribeGrantRulesToCenResponse unmarshall(DescribeGrantRulesToCenResponse describeGrantRulesToCenResponse, UnmarshallerContext _ctx) {
		
		describeGrantRulesToCenResponse.setRequestId(_ctx.stringValue("DescribeGrantRulesToCenResponse.RequestId"));

		List<GrantRule> grantRules = new ArrayList<GrantRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGrantRulesToCenResponse.GrantRules.Length"); i++) {
			GrantRule grantRule = new GrantRule();
			grantRule.setCenId(_ctx.stringValue("DescribeGrantRulesToCenResponse.GrantRules["+ i +"].CenId"));
			grantRule.setChildInstanceRegionId(_ctx.stringValue("DescribeGrantRulesToCenResponse.GrantRules["+ i +"].ChildInstanceRegionId"));
			grantRule.setChildInstanceType(_ctx.stringValue("DescribeGrantRulesToCenResponse.GrantRules["+ i +"].ChildInstanceType"));
			grantRule.setChildInstanceId(_ctx.stringValue("DescribeGrantRulesToCenResponse.GrantRules["+ i +"].ChildInstanceId"));
			grantRule.setChildInstanceOwnerId(_ctx.longValue("DescribeGrantRulesToCenResponse.GrantRules["+ i +"].ChildInstanceOwnerId"));

			grantRules.add(grantRule);
		}
		describeGrantRulesToCenResponse.setGrantRules(grantRules);
	 
	 	return describeGrantRulesToCenResponse;
	}
}