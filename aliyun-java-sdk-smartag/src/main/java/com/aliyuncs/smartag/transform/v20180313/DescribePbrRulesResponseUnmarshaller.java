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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribePbrRulesResponse;
import com.aliyuncs.smartag.model.v20180313.DescribePbrRulesResponse.PbrRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePbrRulesResponseUnmarshaller {

	public static DescribePbrRulesResponse unmarshall(DescribePbrRulesResponse describePbrRulesResponse, UnmarshallerContext _ctx) {
		
		describePbrRulesResponse.setRequestId(_ctx.stringValue("DescribePbrRulesResponse.RequestId"));
		describePbrRulesResponse.setTotalCount(_ctx.integerValue("DescribePbrRulesResponse.TotalCount"));
		describePbrRulesResponse.setPageSize(_ctx.integerValue("DescribePbrRulesResponse.PageSize"));
		describePbrRulesResponse.setPageNumber(_ctx.integerValue("DescribePbrRulesResponse.PageNumber"));

		List<PbrRule> pbrRules = new ArrayList<PbrRule>();
		for (int i = 0; i < _ctx.lengthValue("DescribePbrRulesResponse.PbrRules.Length"); i++) {
			PbrRule pbrRule = new PbrRule();
			pbrRule.setSrcPort(_ctx.stringValue("DescribePbrRulesResponse.PbrRules["+ i +"].SrcPort"));
			pbrRule.setDescription(_ctx.stringValue("DescribePbrRulesResponse.PbrRules["+ i +"].Description"));
			pbrRule.setSrcCidr(_ctx.stringValue("DescribePbrRulesResponse.PbrRules["+ i +"].SrcCidr"));
			pbrRule.setDstPort(_ctx.stringValue("DescribePbrRulesResponse.PbrRules["+ i +"].DstPort"));
			pbrRule.setPbrRuleId(_ctx.stringValue("DescribePbrRulesResponse.PbrRules["+ i +"].PbrRuleId"));
			pbrRule.setBizProtocol(_ctx.stringValue("DescribePbrRulesResponse.PbrRules["+ i +"].Protocol"));
			pbrRule.setDstCidr(_ctx.stringValue("DescribePbrRulesResponse.PbrRules["+ i +"].DstCidr"));
			pbrRule.setName(_ctx.stringValue("DescribePbrRulesResponse.PbrRules["+ i +"].Name"));

			pbrRules.add(pbrRule);
		}
		describePbrRulesResponse.setPbrRules(pbrRules);
	 
	 	return describePbrRulesResponse;
	}
}