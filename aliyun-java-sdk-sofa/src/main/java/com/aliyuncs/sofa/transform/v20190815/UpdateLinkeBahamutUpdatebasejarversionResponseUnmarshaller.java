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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutUpdatebasejarversionResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutUpdatebasejarversionResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutUpdatebasejarversionResponseUnmarshaller {

	public static UpdateLinkeBahamutUpdatebasejarversionResponse unmarshall(UpdateLinkeBahamutUpdatebasejarversionResponse updateLinkeBahamutUpdatebasejarversionResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutUpdatebasejarversionResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.RequestId"));
		updateLinkeBahamutUpdatebasejarversionResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.ResultCode"));
		updateLinkeBahamutUpdatebasejarversionResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.ResultMessage"));
		updateLinkeBahamutUpdatebasejarversionResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.ErrorMessage"));
		updateLinkeBahamutUpdatebasejarversionResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutUpdatebasejarversionResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Message"));
		updateLinkeBahamutUpdatebasejarversionResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutUpdatebasejarversionResponse.ResponseStatusCode"));
		updateLinkeBahamutUpdatebasejarversionResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Success"));

		Result result = new Result();
		result.setAppMeta(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.AppMeta"));
		result.setBatchIndex(_ctx.longValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.BatchIndex"));
		result.setBeforeSit(_ctx.booleanValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.BeforeSit"));
		result.setCompatible(_ctx.booleanValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Created"));
		result.setCreateAfterUseLinkQ(_ctx.booleanValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.CreateAfterUseLinkQ"));
		result.setCreatorSysName(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.CreatorSysName"));
		result.setCurrentStage(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.CurrentStage"));
		result.setCurrentStageStep(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.CurrentStageStep"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Deleted"));
		result.setDeletedByIteration(_ctx.booleanValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.DeletedByIteration"));
		result.setFinished(_ctx.booleanValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Finished"));
		result.setFrom(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.From"));
		result.setFromCommitId(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.FromCommitId"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Id"));
		result.setIteration(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Iteration"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.LastModified"));
		result.setLastStage(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.LastStage"));
		result.setNextStage(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.NextStage"));
		result.set_Private(_ctx.booleanValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Private"));
		result.setProdCode(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.ProdVersion"));
		result.setSkipReleaseCheck(_ctx.booleanValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.SkipReleaseCheck"));
		result.setTagName(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.TagName"));
		result.setTenant(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Tenant"));
		result.setVersion(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Version"));
		result.setYunyDaily(_ctx.booleanValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.YunyDaily"));

		List<String> createdBy = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.CreatedBy.Length"); i++) {
			createdBy.add(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.CreatedBy["+ i +"]"));
		}
		result.setCreatedBy(createdBy);

		List<String> jars = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Jars.Length"); i++) {
			jars.add(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Jars["+ i +"]"));
		}
		result.setJars(jars);

		List<String> jarHistrories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.JarHistrories.Length"); i++) {
			jarHistrories.add(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.JarHistrories["+ i +"]"));
		}
		result.setJarHistrories(jarHistrories);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("UpdateLinkeBahamutUpdatebasejarversionResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		updateLinkeBahamutUpdatebasejarversionResponse.setResult(result);
	 
	 	return updateLinkeBahamutUpdatebasejarversionResponse;
	}
}