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

package com.aliyuncs.yundun_ds.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.yundun_ds.model.v20190103.DescribeRuleTotalCountResponse;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeRuleTotalCountResponse.RuleCount;
import com.aliyuncs.yundun_ds.model.v20190103.DescribeRuleTotalCountResponse.RuleCount.CategoryCount;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRuleTotalCountResponseUnmarshaller {

	public static DescribeRuleTotalCountResponse unmarshall(DescribeRuleTotalCountResponse describeRuleTotalCountResponse, UnmarshallerContext context) {
		
		describeRuleTotalCountResponse.setRequestId(context.stringValue("DescribeRuleTotalCountResponse.RequestId"));

		RuleCount ruleCount = new RuleCount();
		ruleCount.setTotalCount(context.longValue("DescribeRuleTotalCountResponse.RuleCount.TotalCount"));

		List<CategoryCount> categoryCountList = new ArrayList<CategoryCount>();
		for (int i = 0; i < context.lengthValue("DescribeRuleTotalCountResponse.RuleCount.CategoryCountList.Length"); i++) {
			CategoryCount categoryCount = new CategoryCount();
			categoryCount.setName(context.stringValue("DescribeRuleTotalCountResponse.RuleCount.CategoryCountList["+ i +"].Name"));
			categoryCount.setCount(context.stringValue("DescribeRuleTotalCountResponse.RuleCount.CategoryCountList["+ i +"].Count"));

			categoryCountList.add(categoryCount);
		}
		ruleCount.setCategoryCountList(categoryCountList);
		describeRuleTotalCountResponse.setRuleCount(ruleCount);
	 
	 	return describeRuleTotalCountResponse;
	}
}