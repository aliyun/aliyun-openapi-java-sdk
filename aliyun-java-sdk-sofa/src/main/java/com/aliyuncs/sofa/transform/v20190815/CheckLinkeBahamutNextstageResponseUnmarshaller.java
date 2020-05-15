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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutNextstageResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutNextstageResponse.Result;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultListItem;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultListItem.CheckResultsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutNextstageResponseUnmarshaller {

	public static CheckLinkeBahamutNextstageResponse unmarshall(CheckLinkeBahamutNextstageResponse checkLinkeBahamutNextstageResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutNextstageResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.RequestId"));
		checkLinkeBahamutNextstageResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.ResultCode"));
		checkLinkeBahamutNextstageResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.ResultMessage"));
		checkLinkeBahamutNextstageResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.ErrorMessage"));
		checkLinkeBahamutNextstageResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.Message"));
		checkLinkeBahamutNextstageResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutNextstageResponse.Success"));

		Result result = new Result();
		result.setPassed(_ctx.booleanValue("CheckLinkeBahamutNextstageResponse.Result.Passed"));

		List<String> content = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutNextstageResponse.Result.Content.Length"); i++) {
			content.add(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.Result.Content["+ i +"]"));
		}
		result.setContent(content);

		List<String> warnContent = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutNextstageResponse.Result.WarnContent.Length"); i++) {
			warnContent.add(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.Result.WarnContent["+ i +"]"));
		}
		result.setWarnContent(warnContent);

		BatchGuardCheckResult batchGuardCheckResult = new BatchGuardCheckResult();
		batchGuardCheckResult.setFailCount(_ctx.longValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.FailCount"));
		batchGuardCheckResult.setPassCount(_ctx.longValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.PassCount"));
		batchGuardCheckResult.setTotal(_ctx.longValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.Total"));

		List<GuardCheckResultListItem> guardCheckResultList = new ArrayList<GuardCheckResultListItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultList.Length"); i++) {
			GuardCheckResultListItem guardCheckResultListItem = new GuardCheckResultListItem();
			guardCheckResultListItem.setDescription(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultList["+ i +"].Description"));
			guardCheckResultListItem.setName(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultList["+ i +"].Name"));
			guardCheckResultListItem.setPass(_ctx.booleanValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultList["+ i +"].Pass"));

			List<CheckResultsItem> checkResults = new ArrayList<CheckResultsItem>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultList["+ i +"].CheckResults.Length"); j++) {
				CheckResultsItem checkResultsItem = new CheckResultsItem();
				checkResultsItem.setPass(_ctx.booleanValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultList["+ i +"].CheckResults["+ j +"].Pass"));
				checkResultsItem.setType(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultList["+ i +"].CheckResults["+ j +"].Type"));
				checkResultsItem.setRuleKey(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultList["+ i +"].CheckResults["+ j +"].RuleKey"));
				checkResultsItem.setRuleName(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultList["+ i +"].CheckResults["+ j +"].RuleName"));
				checkResultsItem.setSolution(_ctx.stringValue("CheckLinkeBahamutNextstageResponse.Result.BatchGuardCheckResult.GuardCheckResultList["+ i +"].CheckResults["+ j +"].Solution"));

				checkResults.add(checkResultsItem);
			}
			guardCheckResultListItem.setCheckResults(checkResults);

			guardCheckResultList.add(guardCheckResultListItem);
		}
		batchGuardCheckResult.setGuardCheckResultList(guardCheckResultList);
		result.setBatchGuardCheckResult(batchGuardCheckResult);
		checkLinkeBahamutNextstageResponse.setResult(result);
	 
	 	return checkLinkeBahamutNextstageResponse;
	}
}