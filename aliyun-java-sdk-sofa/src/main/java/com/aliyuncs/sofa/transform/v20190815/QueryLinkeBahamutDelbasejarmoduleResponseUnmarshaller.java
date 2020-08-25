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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutDelbasejarmoduleResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutDelbasejarmoduleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutDelbasejarmoduleResponseUnmarshaller {

	public static QueryLinkeBahamutDelbasejarmoduleResponse unmarshall(QueryLinkeBahamutDelbasejarmoduleResponse queryLinkeBahamutDelbasejarmoduleResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutDelbasejarmoduleResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.RequestId"));
		queryLinkeBahamutDelbasejarmoduleResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.ResultCode"));
		queryLinkeBahamutDelbasejarmoduleResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.ResultMessage"));
		queryLinkeBahamutDelbasejarmoduleResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.ErrorMessage"));
		queryLinkeBahamutDelbasejarmoduleResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutDelbasejarmoduleResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Message"));
		queryLinkeBahamutDelbasejarmoduleResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutDelbasejarmoduleResponse.ResponseStatusCode"));
		queryLinkeBahamutDelbasejarmoduleResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutDelbasejarmoduleResponse.Success"));

		Result result = new Result();
		result.setAppMeta(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.AppMeta"));
		result.setBatchIndex(_ctx.longValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.BatchIndex"));
		result.setBeforeSit(_ctx.booleanValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.BeforeSit"));
		result.setCompatible(_ctx.booleanValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Created"));
		result.setCreateAfterUseLinkQ(_ctx.booleanValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.CreateAfterUseLinkQ"));
		result.setCreatorSysName(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.CreatorSysName"));
		result.setCurrentStage(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.CurrentStage"));
		result.setCurrentStageStep(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.CurrentStageStep"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Deleted"));
		result.setDeletedByIteration(_ctx.booleanValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.DeletedByIteration"));
		result.setFinished(_ctx.booleanValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Finished"));
		result.setFrom(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.From"));
		result.setFromCommitId(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.FromCommitId"));
		result.setId(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Id"));
		result.setIteration(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Iteration"));
		result.setLastModified(_ctx.longValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.LastModified"));
		result.setLastStage(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.LastStage"));
		result.setNextStage(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.NextStage"));
		result.set_Private(_ctx.booleanValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Private"));
		result.setProdCode(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.ProdVersion"));
		result.setSkipReleaseCheck(_ctx.booleanValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.SkipReleaseCheck"));
		result.setTagName(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.TagName"));
		result.setTenant(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Tenant"));
		result.setVersion(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Version"));
		result.setYunyDaily(_ctx.booleanValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.YunyDaily"));

		List<String> createdBy = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.CreatedBy.Length"); i++) {
			createdBy.add(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.CreatedBy["+ i +"]"));
		}
		result.setCreatedBy(createdBy);

		List<String> jars = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Jars.Length"); i++) {
			jars.add(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Jars["+ i +"]"));
		}
		result.setJars(jars);

		List<String> jarHistrories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.JarHistrories.Length"); i++) {
			jarHistrories.add(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.JarHistrories["+ i +"]"));
		}
		result.setJarHistrories(jarHistrories);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("QueryLinkeBahamutDelbasejarmoduleResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		queryLinkeBahamutDelbasejarmoduleResponse.setResult(result);
	 
	 	return queryLinkeBahamutDelbasejarmoduleResponse;
	}
}