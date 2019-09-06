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

	public static DescribeGrantRulesToCenResponse unmarshall(DescribeGrantRulesToCenResponse describeGrantRulesToCenResponse, UnmarshallerContext _ctx) {
		
		describeGrantRulesToCenResponse.setRequestId(_ctx.stringValue("DescribeGrantRulesToCenResponse.RequestId"));
		describeGrantRulesToCenResponse.setTotalCount(_ctx.integerValue("DescribeGrantRulesToCenResponse.TotalCount"));
		describeGrantRulesToCenResponse.setPageNumber(_ctx.integerValue("DescribeGrantRulesToCenResponse.PageNumber"));
		describeGrantRulesToCenResponse.setPageSize(_ctx.integerValue("DescribeGrantRulesToCenResponse.PageSize"));

		List<CbnGrantRule> cenGrantRules = new ArrayList<CbnGrantRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGrantRulesToCenResponse.CenGrantRules.Length"); i++) {
			CbnGrantRule cbnGrantRule = new CbnGrantRule();
			cbnGrantRule.setCenInstanceId(_ctx.stringValue("DescribeGrantRulesToCenResponse.CenGrantRules["+ i +"].CenInstanceId"));
			cbnGrantRule.setCenOwnerId(_ctx.longValue("DescribeGrantRulesToCenResponse.CenGrantRules["+ i +"].CenOwnerId"));
			cbnGrantRule.setCreationTime(_ctx.stringValue("DescribeGrantRulesToCenResponse.CenGrantRules["+ i +"].CreationTime"));

			cenGrantRules.add(cbnGrantRule);
		}
		describeGrantRulesToCenResponse.setCenGrantRules(cenGrantRules);
	 
	 	return describeGrantRulesToCenResponse;
	}
}