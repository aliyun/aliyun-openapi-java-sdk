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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListPushRulesResponse;
import com.aliyuncs.devops.model.v20210625.ListPushRulesResponse.ResultItem;
import com.aliyuncs.devops.model.v20210625.ListPushRulesResponse.ResultItem.Rule_infos;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPushRulesResponseUnmarshaller {

	public static ListPushRulesResponse unmarshall(ListPushRulesResponse listPushRulesResponse, UnmarshallerContext _ctx) {
		
		listPushRulesResponse.setRequestId(_ctx.stringValue("ListPushRulesResponse.requestId"));
		listPushRulesResponse.setErrorCode(_ctx.stringValue("ListPushRulesResponse.errorCode"));
		listPushRulesResponse.setErrorMessage(_ctx.stringValue("ListPushRulesResponse.errorMessage"));
		listPushRulesResponse.setSuccess(_ctx.booleanValue("ListPushRulesResponse.success"));
		listPushRulesResponse.setTotal(_ctx.longValue("ListPushRulesResponse.total"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPushRulesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setId(_ctx.longValue("ListPushRulesResponse.result["+ i +"].id"));
			resultItem.setGmtCreate(_ctx.stringValue("ListPushRulesResponse.result["+ i +"].gmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListPushRulesResponse.result["+ i +"].gmtModified"));

			List<Rule_infos> ruleInfos = new ArrayList<Rule_infos>();
			for (int j = 0; j < _ctx.lengthValue("ListPushRulesResponse.result["+ i +"].ruleInfos.Length"); j++) {
				Rule_infos rule_infos = new Rule_infos();
				rule_infos.setCheckerName(_ctx.stringValue("ListPushRulesResponse.result["+ i +"].ruleInfos["+ j +"].checkerName"));
				rule_infos.setCheckerType(_ctx.stringValue("ListPushRulesResponse.result["+ i +"].ruleInfos["+ j +"].checkerType"));
				rule_infos.setExtraMessage(_ctx.stringValue("ListPushRulesResponse.result["+ i +"].ruleInfos["+ j +"].extraMessage"));

				List<String> fileRuleRegexes = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("ListPushRulesResponse.result["+ i +"].ruleInfos["+ j +"].fileRuleRegexes.Length"); k++) {
					fileRuleRegexes.add(_ctx.stringValue("ListPushRulesResponse.result["+ i +"].ruleInfos["+ j +"].fileRuleRegexes["+ k +"]"));
				}
				rule_infos.setFileRuleRegexes(fileRuleRegexes);

				ruleInfos.add(rule_infos);
			}
			resultItem.setRuleInfos(ruleInfos);

			result.add(resultItem);
		}
		listPushRulesResponse.setResult(result);
	 
	 	return listPushRulesResponse;
	}
}