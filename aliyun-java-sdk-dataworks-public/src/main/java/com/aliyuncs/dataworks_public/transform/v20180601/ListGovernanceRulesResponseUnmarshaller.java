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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceRulesResponse;
import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceRulesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20180601.ListGovernanceRulesResponse.Data.Rule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGovernanceRulesResponseUnmarshaller {

	public static ListGovernanceRulesResponse unmarshall(ListGovernanceRulesResponse listGovernanceRulesResponse, UnmarshallerContext _ctx) {
		
		listGovernanceRulesResponse.setRequestId(_ctx.stringValue("ListGovernanceRulesResponse.RequestId"));
		listGovernanceRulesResponse.setSuccess(_ctx.booleanValue("ListGovernanceRulesResponse.Success"));
		listGovernanceRulesResponse.setErrorCode(_ctx.stringValue("ListGovernanceRulesResponse.ErrorCode"));
		listGovernanceRulesResponse.setErrorMessage(_ctx.stringValue("ListGovernanceRulesResponse.ErrorMessage"));
		listGovernanceRulesResponse.setHttpStatusCode(_ctx.integerValue("ListGovernanceRulesResponse.HttpStatusCode"));
		listGovernanceRulesResponse.setDynamicErrorCode(_ctx.stringValue("ListGovernanceRulesResponse.DynamicErrorCode"));
		listGovernanceRulesResponse.setDynamicErrorMessage(_ctx.stringValue("ListGovernanceRulesResponse.DynamicErrorMessage"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListGovernanceRulesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListGovernanceRulesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListGovernanceRulesResponse.Data.TotalCount"));

		List<Rule> rules = new ArrayList<Rule>();
		for (int i = 0; i < _ctx.lengthValue("ListGovernanceRulesResponse.Data.Rules.Length"); i++) {
			Rule rule = new Rule();
			rule.setId(_ctx.stringValue("ListGovernanceRulesResponse.Data.Rules["+ i +"].Id"));
			rule.setCategory(_ctx.stringValue("ListGovernanceRulesResponse.Data.Rules["+ i +"].Category"));
			rule.setName(_ctx.stringValue("ListGovernanceRulesResponse.Data.Rules["+ i +"].Name"));
			rule.setDescription(_ctx.stringValue("ListGovernanceRulesResponse.Data.Rules["+ i +"].Description"));
			rule.setIssueType(_ctx.stringValue("ListGovernanceRulesResponse.Data.Rules["+ i +"].IssueType"));
			rule.setRule(_ctx.stringValue("ListGovernanceRulesResponse.Data.Rules["+ i +"].Rule"));
			rule.setGuide(_ctx.stringValue("ListGovernanceRulesResponse.Data.Rules["+ i +"].Guide"));
			rule.setNote(_ctx.stringValue("ListGovernanceRulesResponse.Data.Rules["+ i +"].Note"));

			rules.add(rule);
		}
		data.setRules(rules);
		listGovernanceRulesResponse.setData(data);
	 
	 	return listGovernanceRulesResponse;
	}
}