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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaOutdatedtaskResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeLinkaOutdatedtaskResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeLinkaOutdatedtaskResponseUnmarshaller {

	public static QueryLinkeLinkaOutdatedtaskResponse unmarshall(QueryLinkeLinkaOutdatedtaskResponse queryLinkeLinkaOutdatedtaskResponse, UnmarshallerContext _ctx) {
		
		queryLinkeLinkaOutdatedtaskResponse.setRequestId(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.RequestId"));
		queryLinkeLinkaOutdatedtaskResponse.setResultCode(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.ResultCode"));
		queryLinkeLinkaOutdatedtaskResponse.setResultMessage(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.ResultMessage"));
		queryLinkeLinkaOutdatedtaskResponse.setErrorCode(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.ErrorCode"));
		queryLinkeLinkaOutdatedtaskResponse.setErrorMsg(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.ErrorMsg"));
		queryLinkeLinkaOutdatedtaskResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeLinkaOutdatedtaskResponse.ResponseStatusCode"));
		queryLinkeLinkaOutdatedtaskResponse.setSuccess(_ctx.booleanValue("QueryLinkeLinkaOutdatedtaskResponse.Success"));

		Result result = new Result();
		result.setAciConsoleUrl(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.AciConsoleUrl"));
		result.setAciMode(_ctx.booleanValue("QueryLinkeLinkaOutdatedtaskResponse.Result.AciMode"));
		result.setAciTenant(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.AciTenant"));
		result.setBranch(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.Branch"));
		result.setCallbackUrl(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.CallbackUrl"));
		result.setCommitId(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.CommitId"));
		result.setCreatedAt(_ctx.longValue("QueryLinkeLinkaOutdatedtaskResponse.Result.CreatedAt"));
		result.setCustomToken(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.CustomToken"));
		result.setCustomUser(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.CustomUser"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeLinkaOutdatedtaskResponse.Result.Deleted"));
		result.setDiffOverflow(_ctx.booleanValue("QueryLinkeLinkaOutdatedtaskResponse.Result.DiffOverflow"));
		result.setDiffToolarge(_ctx.booleanValue("QueryLinkeLinkaOutdatedtaskResponse.Result.DiffToolarge"));
		result.setEncode(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.Encode"));
		result.setEndAt(_ctx.longValue("QueryLinkeLinkaOutdatedtaskResponse.Result.EndAt"));
		result.setExecutorId(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.ExecutorId"));
		result.setExtra(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.Extra"));
		result.setGitUrl(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.GitUrl"));
		result.setId(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.Id"));
		result.setKind(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.Kind"));
		result.setLocalPath(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.LocalPath"));
		result.setMessage(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.Message"));
		result.setParentTaskId(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.ParentTaskId"));
		result.setRuleSetName(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.RuleSetName"));
		result.setScanKind(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.ScanKind"));
		result.setStartedAt(_ctx.longValue("QueryLinkeLinkaOutdatedtaskResponse.Result.StartedAt"));
		result.setStartCommitId(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.StartCommitId"));
		result.setStatus(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.Status"));
		result.setUpdatedAt(_ctx.longValue("QueryLinkeLinkaOutdatedtaskResponse.Result.UpdatedAt"));

		List<String> excludes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaOutdatedtaskResponse.Result.Excludes.Length"); i++) {
			excludes.add(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.Excludes["+ i +"]"));
		}
		result.setExcludes(excludes);

		List<String> ruleSets = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaOutdatedtaskResponse.Result.RuleSets.Length"); i++) {
			ruleSets.add(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.RuleSets["+ i +"]"));
		}
		result.setRuleSets(ruleSets);

		List<String> subTasks = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeLinkaOutdatedtaskResponse.Result.SubTasks.Length"); i++) {
			subTasks.add(_ctx.stringValue("QueryLinkeLinkaOutdatedtaskResponse.Result.SubTasks["+ i +"]"));
		}
		result.setSubTasks(subTasks);
		queryLinkeLinkaOutdatedtaskResponse.setResult(result);
	 
	 	return queryLinkeLinkaOutdatedtaskResponse;
	}
}