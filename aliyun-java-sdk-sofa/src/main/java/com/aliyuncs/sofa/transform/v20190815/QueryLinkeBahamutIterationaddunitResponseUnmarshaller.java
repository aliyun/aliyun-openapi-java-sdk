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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationaddunitResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationaddunitResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutIterationaddunitResponseUnmarshaller {

	public static QueryLinkeBahamutIterationaddunitResponse unmarshall(QueryLinkeBahamutIterationaddunitResponse queryLinkeBahamutIterationaddunitResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutIterationaddunitResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.RequestId"));
		queryLinkeBahamutIterationaddunitResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.ResultCode"));
		queryLinkeBahamutIterationaddunitResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.ResultMessage"));
		queryLinkeBahamutIterationaddunitResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.ErrorMessage"));
		queryLinkeBahamutIterationaddunitResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutIterationaddunitResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Message"));
		queryLinkeBahamutIterationaddunitResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutIterationaddunitResponse.ResponseStatusCode"));
		queryLinkeBahamutIterationaddunitResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutIterationaddunitResponse.Success"));

		Result result = new Result();
		result.setAppMeta(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.AppMeta"));
		result.setBatchIndex(_ctx.longValue("QueryLinkeBahamutIterationaddunitResponse.Result.BatchIndex"));
		result.setBeforeSit(_ctx.booleanValue("QueryLinkeBahamutIterationaddunitResponse.Result.BeforeSit"));
		result.setCompatible(_ctx.booleanValue("QueryLinkeBahamutIterationaddunitResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("QueryLinkeBahamutIterationaddunitResponse.Result.Created"));
		result.setCreateAfterUseLinkQ(_ctx.booleanValue("QueryLinkeBahamutIterationaddunitResponse.Result.CreateAfterUseLinkQ"));
		result.setCreatorSysName(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.CreatorSysName"));
		result.setCurrentStage(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.CurrentStage"));
		result.setCurrentStageStep(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.CurrentStageStep"));
		result.setDeleted(_ctx.booleanValue("QueryLinkeBahamutIterationaddunitResponse.Result.Deleted"));
		result.setDeletedByIteration(_ctx.booleanValue("QueryLinkeBahamutIterationaddunitResponse.Result.DeletedByIteration"));
		result.setFinished(_ctx.booleanValue("QueryLinkeBahamutIterationaddunitResponse.Result.Finished"));
		result.setFrom(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.From"));
		result.setFromCommitId(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.FromCommitId"));
		result.setId(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.Id"));
		result.setIteration(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.Iteration"));
		result.setLastModified(_ctx.longValue("QueryLinkeBahamutIterationaddunitResponse.Result.LastModified"));
		result.setLastStage(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.LastStage"));
		result.setNextStage(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.NextStage"));
		result.set_Private(_ctx.booleanValue("QueryLinkeBahamutIterationaddunitResponse.Result.Private"));
		result.setProdCode(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.ProdVersion"));
		result.setSkipReleaseCheck(_ctx.booleanValue("QueryLinkeBahamutIterationaddunitResponse.Result.SkipReleaseCheck"));
		result.setTagName(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.TagName"));
		result.setTenant(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.Tenant"));
		result.setVersion(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.Version"));
		result.setYunyDaily(_ctx.booleanValue("QueryLinkeBahamutIterationaddunitResponse.Result.YunyDaily"));

		List<String> createdBy = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationaddunitResponse.Result.CreatedBy.Length"); i++) {
			createdBy.add(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.CreatedBy["+ i +"]"));
		}
		result.setCreatedBy(createdBy);

		List<String> jars = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationaddunitResponse.Result.Jars.Length"); i++) {
			jars.add(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.Jars["+ i +"]"));
		}
		result.setJars(jars);

		List<String> jarHistrories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationaddunitResponse.Result.JarHistrories.Length"); i++) {
			jarHistrories.add(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.JarHistrories["+ i +"]"));
		}
		result.setJarHistrories(jarHistrories);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationaddunitResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationaddunitResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("QueryLinkeBahamutIterationaddunitResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		queryLinkeBahamutIterationaddunitResponse.setResult(result);
	 
	 	return queryLinkeBahamutIterationaddunitResponse;
	}
}