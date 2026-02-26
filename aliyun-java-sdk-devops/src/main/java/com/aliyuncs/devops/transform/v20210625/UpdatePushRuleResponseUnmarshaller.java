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

import com.aliyuncs.devops.model.v20210625.UpdatePushRuleResponse;
import com.aliyuncs.devops.model.v20210625.UpdatePushRuleResponse.Result;
import com.aliyuncs.devops.model.v20210625.UpdatePushRuleResponse.Result.Rule_infos;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePushRuleResponseUnmarshaller {

	public static UpdatePushRuleResponse unmarshall(UpdatePushRuleResponse updatePushRuleResponse, UnmarshallerContext _ctx) {
		
		updatePushRuleResponse.setRequestId(_ctx.stringValue("UpdatePushRuleResponse.requestId"));
		updatePushRuleResponse.setErrorCode(_ctx.stringValue("UpdatePushRuleResponse.errorCode"));
		updatePushRuleResponse.setErrorMessage(_ctx.stringValue("UpdatePushRuleResponse.errorMessage"));
		updatePushRuleResponse.setSuccess(_ctx.booleanValue("UpdatePushRuleResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("UpdatePushRuleResponse.result.id"));
		result.setGmtCreate(_ctx.stringValue("UpdatePushRuleResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("UpdatePushRuleResponse.result.gmtModified"));

		List<Rule_infos> ruleInfos = new ArrayList<Rule_infos>();
		for (int i = 0; i < _ctx.lengthValue("UpdatePushRuleResponse.result.ruleInfos.Length"); i++) {
			Rule_infos rule_infos = new Rule_infos();
			rule_infos.setCheckerName(_ctx.stringValue("UpdatePushRuleResponse.result.ruleInfos["+ i +"].checkerName"));
			rule_infos.setCheckerType(_ctx.stringValue("UpdatePushRuleResponse.result.ruleInfos["+ i +"].checkerType"));
			rule_infos.setExtraMessage(_ctx.stringValue("UpdatePushRuleResponse.result.ruleInfos["+ i +"].extraMessage"));

			List<String> fileRuleRegexes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("UpdatePushRuleResponse.result.ruleInfos["+ i +"].fileRuleRegexes.Length"); j++) {
				fileRuleRegexes.add(_ctx.stringValue("UpdatePushRuleResponse.result.ruleInfos["+ i +"].fileRuleRegexes["+ j +"]"));
			}
			rule_infos.setFileRuleRegexes(fileRuleRegexes);

			ruleInfos.add(rule_infos);
		}
		result.setRuleInfos(ruleInfos);
		updatePushRuleResponse.setResult(result);
	 
	 	return updatePushRuleResponse;
	}
}