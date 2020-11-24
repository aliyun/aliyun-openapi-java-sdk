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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebCCRulesResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebCCRulesResponse.WebCCRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebCCRulesResponseUnmarshaller {

	public static DescribeWebCCRulesResponse unmarshall(DescribeWebCCRulesResponse describeWebCCRulesResponse, UnmarshallerContext _ctx) {
		
		describeWebCCRulesResponse.setRequestId(_ctx.stringValue("DescribeWebCCRulesResponse.RequestId"));
		describeWebCCRulesResponse.setTotalCount(_ctx.longValue("DescribeWebCCRulesResponse.TotalCount"));

		List<WebCCRule> webCCRules = new ArrayList<WebCCRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebCCRulesResponse.WebCCRules.Length"); i++) {
			WebCCRule webCCRule = new WebCCRule();
			webCCRule.setName(_ctx.stringValue("DescribeWebCCRulesResponse.WebCCRules["+ i +"].Name"));
			webCCRule.setAct(_ctx.stringValue("DescribeWebCCRulesResponse.WebCCRules["+ i +"].Act"));
			webCCRule.setCount(_ctx.integerValue("DescribeWebCCRulesResponse.WebCCRules["+ i +"].Count"));
			webCCRule.setInterval(_ctx.integerValue("DescribeWebCCRulesResponse.WebCCRules["+ i +"].Interval"));
			webCCRule.setMode(_ctx.stringValue("DescribeWebCCRulesResponse.WebCCRules["+ i +"].Mode"));
			webCCRule.setTtl(_ctx.integerValue("DescribeWebCCRulesResponse.WebCCRules["+ i +"].Ttl"));
			webCCRule.setUri(_ctx.stringValue("DescribeWebCCRulesResponse.WebCCRules["+ i +"].Uri"));

			webCCRules.add(webCCRule);
		}
		describeWebCCRulesResponse.setWebCCRules(webCCRules);
	 
	 	return describeWebCCRulesResponse;
	}
}