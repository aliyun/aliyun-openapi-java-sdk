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

import com.aliyuncs.devops.model.v20210625.CreatePushRuleResponse;
import com.aliyuncs.devops.model.v20210625.CreatePushRuleResponse.Result;
import com.aliyuncs.devops.model.v20210625.CreatePushRuleResponse.Result.Rule_infos;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreatePushRuleResponseUnmarshaller {

	public static CreatePushRuleResponse unmarshall(CreatePushRuleResponse createPushRuleResponse, UnmarshallerContext _ctx) {
		
		createPushRuleResponse.setRequestId(_ctx.stringValue("CreatePushRuleResponse.requestId"));
		createPushRuleResponse.setErrorCode(_ctx.stringValue("CreatePushRuleResponse.errorCode"));
		createPushRuleResponse.setErrorMessage(_ctx.stringValue("CreatePushRuleResponse.errorMessage"));
		createPushRuleResponse.setSuccess(_ctx.booleanValue("CreatePushRuleResponse.success"));

		Result result = new Result();
		result.setId(_ctx.longValue("CreatePushRuleResponse.result.id"));
		result.setGmtCreate(_ctx.stringValue("CreatePushRuleResponse.result.gmtCreate"));
		result.setGmtModified(_ctx.stringValue("CreatePushRuleResponse.result.gmtModified"));

		List<Rule_infos> ruleInfos = new ArrayList<Rule_infos>();
		for (int i = 0; i < _ctx.lengthValue("CreatePushRuleResponse.result.ruleInfos.Length"); i++) {
			Rule_infos rule_infos = new Rule_infos();
			rule_infos.setCheckerName(_ctx.stringValue("CreatePushRuleResponse.result.ruleInfos["+ i +"].checkerName"));
			rule_infos.setCheckerType(_ctx.stringValue("CreatePushRuleResponse.result.ruleInfos["+ i +"].checkerType"));
			rule_infos.setExtraMessage(_ctx.stringValue("CreatePushRuleResponse.result.ruleInfos["+ i +"].extraMessage"));

			List<String> fileRuleRegexes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CreatePushRuleResponse.result.ruleInfos["+ i +"].fileRuleRegexes.Length"); j++) {
				fileRuleRegexes.add(_ctx.stringValue("CreatePushRuleResponse.result.ruleInfos["+ i +"].fileRuleRegexes["+ j +"]"));
			}
			rule_infos.setFileRuleRegexes(fileRuleRegexes);

			ruleInfos.add(rule_infos);
		}
		result.setRuleInfos(ruleInfos);
		createPushRuleResponse.setResult(result);
	 
	 	return createPushRuleResponse;
	}
}