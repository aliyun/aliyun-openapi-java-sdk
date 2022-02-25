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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.ListSilencePoliciesResponse;
import com.aliyuncs.arms.model.v20190808.ListSilencePoliciesResponse.PageBean;
import com.aliyuncs.arms.model.v20190808.ListSilencePoliciesResponse.PageBean.Policies;
import com.aliyuncs.arms.model.v20190808.ListSilencePoliciesResponse.PageBean.Policies.MatchingRulesItem;
import com.aliyuncs.arms.model.v20190808.ListSilencePoliciesResponse.PageBean.Policies.MatchingRulesItem.MatchingConditionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSilencePoliciesResponseUnmarshaller {

	public static ListSilencePoliciesResponse unmarshall(ListSilencePoliciesResponse listSilencePoliciesResponse, UnmarshallerContext _ctx) {
		
		listSilencePoliciesResponse.setRequestId(_ctx.stringValue("ListSilencePoliciesResponse.RequestId"));

		PageBean pageBean = new PageBean();
		pageBean.setTotal(_ctx.longValue("ListSilencePoliciesResponse.PageBean.Total"));
		pageBean.setPage(_ctx.longValue("ListSilencePoliciesResponse.PageBean.Page"));
		pageBean.setSize(_ctx.longValue("ListSilencePoliciesResponse.PageBean.Size"));

		List<Policies> silencePolicies = new ArrayList<Policies>();
		for (int i = 0; i < _ctx.lengthValue("ListSilencePoliciesResponse.PageBean.SilencePolicies.Length"); i++) {
			Policies policies = new Policies();
			policies.setId(_ctx.longValue("ListSilencePoliciesResponse.PageBean.SilencePolicies["+ i +"].Id"));
			policies.setName(_ctx.stringValue("ListSilencePoliciesResponse.PageBean.SilencePolicies["+ i +"].Name"));

			List<MatchingRulesItem> matchingRules = new ArrayList<MatchingRulesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSilencePoliciesResponse.PageBean.SilencePolicies["+ i +"].MatchingRules.Length"); j++) {
				MatchingRulesItem matchingRulesItem = new MatchingRulesItem();

				List<MatchingConditionsItem> matchingConditions = new ArrayList<MatchingConditionsItem>();
				for (int k = 0; k < _ctx.lengthValue("ListSilencePoliciesResponse.PageBean.SilencePolicies["+ i +"].MatchingRules["+ j +"].MatchingConditions.Length"); k++) {
					MatchingConditionsItem matchingConditionsItem = new MatchingConditionsItem();
					matchingConditionsItem.setKey(_ctx.stringValue("ListSilencePoliciesResponse.PageBean.SilencePolicies["+ i +"].MatchingRules["+ j +"].MatchingConditions["+ k +"].Key"));
					matchingConditionsItem.setValue(_ctx.stringValue("ListSilencePoliciesResponse.PageBean.SilencePolicies["+ i +"].MatchingRules["+ j +"].MatchingConditions["+ k +"].Value"));
					matchingConditionsItem.setOperator(_ctx.stringValue("ListSilencePoliciesResponse.PageBean.SilencePolicies["+ i +"].MatchingRules["+ j +"].MatchingConditions["+ k +"].Operator"));

					matchingConditions.add(matchingConditionsItem);
				}
				matchingRulesItem.setMatchingConditions(matchingConditions);

				matchingRules.add(matchingRulesItem);
			}
			policies.setMatchingRules(matchingRules);

			silencePolicies.add(policies);
		}
		pageBean.setSilencePolicies(silencePolicies);
		listSilencePoliciesResponse.setPageBean(pageBean);
	 
	 	return listSilencePoliciesResponse;
	}
}