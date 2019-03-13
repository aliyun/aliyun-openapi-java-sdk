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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeGrantRulesToCenResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeGrantRulesToCenResponse.CbnGrantRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGrantRulesToCenResponseUnmarshaller {

	public static DescribeGrantRulesToCenResponse unmarshall(DescribeGrantRulesToCenResponse describeGrantRulesToCenResponse, UnmarshallerContext context) {
		
		describeGrantRulesToCenResponse.setRequestId(context.stringValue("DescribeGrantRulesToCenResponse.RequestId"));
		describeGrantRulesToCenResponse.setTotalCount(context.integerValue("DescribeGrantRulesToCenResponse.TotalCount"));
		describeGrantRulesToCenResponse.setPageNumber(context.integerValue("DescribeGrantRulesToCenResponse.PageNumber"));
		describeGrantRulesToCenResponse.setPageSize(context.integerValue("DescribeGrantRulesToCenResponse.PageSize"));

		List<CbnGrantRule> cenGrantRules = new ArrayList<CbnGrantRule>();
		for (int i = 0; i < context.lengthValue("DescribeGrantRulesToCenResponse.CenGrantRules.Length"); i++) {
			CbnGrantRule cbnGrantRule = new CbnGrantRule();
			cbnGrantRule.setCenInstanceId(context.stringValue("DescribeGrantRulesToCenResponse.CenGrantRules["+ i +"].CenInstanceId"));
			cbnGrantRule.setCenOwnerId(context.longValue("DescribeGrantRulesToCenResponse.CenGrantRules["+ i +"].CenOwnerId"));
			cbnGrantRule.setCreationTime(context.stringValue("DescribeGrantRulesToCenResponse.CenGrantRules["+ i +"].CreationTime"));

			cenGrantRules.add(cbnGrantRule);
		}
		describeGrantRulesToCenResponse.setCenGrantRules(cenGrantRules);
	 
	 	return describeGrantRulesToCenResponse;
	}
}