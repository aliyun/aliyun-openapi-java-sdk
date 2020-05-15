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

package com.aliyuncs.waf_openapi.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.waf_openapi.model.v20190910.DescribeRuleSummaryResponse;
import com.aliyuncs.waf_openapi.model.v20190910.DescribeRuleSummaryResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRuleSummaryResponseUnmarshaller {

	public static DescribeRuleSummaryResponse unmarshall(DescribeRuleSummaryResponse describeRuleSummaryResponse, UnmarshallerContext _ctx) {
		
		describeRuleSummaryResponse.setRequestId(_ctx.stringValue("DescribeRuleSummaryResponse.RequestId"));

		List<Item> ruleSummarys = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRuleSummaryResponse.RuleSummarys.Length"); i++) {
			Item item = new Item();
			item.setTimeStamp(_ctx.longValue("DescribeRuleSummaryResponse.RuleSummarys["+ i +"].TimeStamp"));
			item.setPv(_ctx.longValue("DescribeRuleSummaryResponse.RuleSummarys["+ i +"].Pv"));

			ruleSummarys.add(item);
		}
		describeRuleSummaryResponse.setRuleSummarys(ruleSummarys);
	 
	 	return describeRuleSummaryResponse;
	}
}