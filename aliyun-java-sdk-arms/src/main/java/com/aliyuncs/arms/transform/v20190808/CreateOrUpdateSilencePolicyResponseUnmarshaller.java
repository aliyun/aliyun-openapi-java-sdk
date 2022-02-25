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

import com.aliyuncs.arms.model.v20190808.CreateOrUpdateSilencePolicyResponse;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateSilencePolicyResponse.SilencePolicy;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateSilencePolicyResponse.SilencePolicy.MatchingRulesItem;
import com.aliyuncs.arms.model.v20190808.CreateOrUpdateSilencePolicyResponse.SilencePolicy.MatchingRulesItem.MatchingConditionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateOrUpdateSilencePolicyResponseUnmarshaller {

	public static CreateOrUpdateSilencePolicyResponse unmarshall(CreateOrUpdateSilencePolicyResponse createOrUpdateSilencePolicyResponse, UnmarshallerContext _ctx) {
		
		createOrUpdateSilencePolicyResponse.setRequestId(_ctx.stringValue("CreateOrUpdateSilencePolicyResponse.RequestId"));

		SilencePolicy silencePolicy = new SilencePolicy();
		silencePolicy.setId(_ctx.longValue("CreateOrUpdateSilencePolicyResponse.SilencePolicy.Id"));
		silencePolicy.setName(_ctx.stringValue("CreateOrUpdateSilencePolicyResponse.SilencePolicy.Name"));

		List<MatchingRulesItem> matchingRules = new ArrayList<MatchingRulesItem>();
		for (int i = 0; i < _ctx.lengthValue("CreateOrUpdateSilencePolicyResponse.SilencePolicy.MatchingRules.Length"); i++) {
			MatchingRulesItem matchingRulesItem = new MatchingRulesItem();

			List<MatchingConditionsItem> matchingConditions = new ArrayList<MatchingConditionsItem>();
			for (int j = 0; j < _ctx.lengthValue("CreateOrUpdateSilencePolicyResponse.SilencePolicy.MatchingRules["+ i +"].MatchingConditions.Length"); j++) {
				MatchingConditionsItem matchingConditionsItem = new MatchingConditionsItem();
				matchingConditionsItem.setKey(_ctx.stringValue("CreateOrUpdateSilencePolicyResponse.SilencePolicy.MatchingRules["+ i +"].MatchingConditions["+ j +"].Key"));
				matchingConditionsItem.setValue(_ctx.stringValue("CreateOrUpdateSilencePolicyResponse.SilencePolicy.MatchingRules["+ i +"].MatchingConditions["+ j +"].Value"));
				matchingConditionsItem.setOperator(_ctx.stringValue("CreateOrUpdateSilencePolicyResponse.SilencePolicy.MatchingRules["+ i +"].MatchingConditions["+ j +"].Operator"));

				matchingConditions.add(matchingConditionsItem);
			}
			matchingRulesItem.setMatchingConditions(matchingConditions);

			matchingRules.add(matchingRulesItem);
		}
		silencePolicy.setMatchingRules(matchingRules);
		createOrUpdateSilencePolicyResponse.setSilencePolicy(silencePolicy);
	 
	 	return createOrUpdateSilencePolicyResponse;
	}
}