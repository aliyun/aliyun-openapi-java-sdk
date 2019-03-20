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

package com.aliyuncs.alidns.transform.v20150109;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alidns.model.v20150109.QueryCreateInstancePriceResponse;
import com.aliyuncs.alidns.model.v20150109.QueryCreateInstancePriceResponse.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCreateInstancePriceResponseUnmarshaller {

	public static QueryCreateInstancePriceResponse unmarshall(QueryCreateInstancePriceResponse queryCreateInstancePriceResponse, UnmarshallerContext context) {
		
		queryCreateInstancePriceResponse.setRequestId(context.stringValue("QueryCreateInstancePriceResponse.RequestId"));
		queryCreateInstancePriceResponse.setOrigin(context.stringValue("QueryCreateInstancePriceResponse.Origin"));
		queryCreateInstancePriceResponse.setDiscount(context.stringValue("QueryCreateInstancePriceResponse.Discount"));
		queryCreateInstancePriceResponse.setAmount(context.stringValue("QueryCreateInstancePriceResponse.Amount"));
		queryCreateInstancePriceResponse.setCurrency(context.stringValue("QueryCreateInstancePriceResponse.Currency"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < context.lengthValue("QueryCreateInstancePriceResponse.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setRuleId(context.longValue("QueryCreateInstancePriceResponse.Rules["+ i +"].RuleId"));
			rule.setName(context.stringValue("QueryCreateInstancePriceResponse.Rules["+ i +"].Name"));
			rule.setTitle(context.stringValue("QueryCreateInstancePriceResponse.Rules["+ i +"].Title"));

			rules.add(rule);
		}
		queryCreateInstancePriceResponse.setRules(rules);
	 
	 	return queryCreateInstancePriceResponse;
	}
}