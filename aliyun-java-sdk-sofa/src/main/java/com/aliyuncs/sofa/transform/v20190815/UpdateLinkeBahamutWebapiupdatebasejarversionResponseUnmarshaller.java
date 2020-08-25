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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutWebapiupdatebasejarversionResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutWebapiupdatebasejarversionResponseUnmarshaller {

	public static UpdateLinkeBahamutWebapiupdatebasejarversionResponse unmarshall(UpdateLinkeBahamutWebapiupdatebasejarversionResponse updateLinkeBahamutWebapiupdatebasejarversionResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutWebapiupdatebasejarversionResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.RequestId"));
		updateLinkeBahamutWebapiupdatebasejarversionResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.ResultCode"));
		updateLinkeBahamutWebapiupdatebasejarversionResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.ResultMessage"));
		updateLinkeBahamutWebapiupdatebasejarversionResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.ErrorMessage"));
		updateLinkeBahamutWebapiupdatebasejarversionResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutWebapiupdatebasejarversionResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Message"));
		updateLinkeBahamutWebapiupdatebasejarversionResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.ResponseStatusCode"));
		updateLinkeBahamutWebapiupdatebasejarversionResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Success"));

		Result result = new Result();
		result.setAppMeta(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.AppMeta"));
		result.setBatchIndex(_ctx.longValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.BatchIndex"));
		result.setBeforeSit(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.BeforeSit"));
		result.setCompatible(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Created"));
		result.setCreateAfterUseLinkQ(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.CreateAfterUseLinkQ"));
		result.setCreatorSysName(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.CreatorSysName"));
		result.setCurrentStage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.CurrentStage"));
		result.setCurrentStageStep(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.CurrentStageStep"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Deleted"));
		result.setDeletedByIteration(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.DeletedByIteration"));
		result.setFinished(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Finished"));
		result.setFrom(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.From"));
		result.setFromCommitId(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.FromCommitId"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Id"));
		result.setIteration(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Iteration"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.LastModified"));
		result.setLastStage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.LastStage"));
		result.setNextStage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.NextStage"));
		result.set_Private(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Private"));
		result.setProdCode(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.ProdVersion"));
		result.setSkipReleaseCheck(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.SkipReleaseCheck"));
		result.setTagName(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.TagName"));
		result.setTenant(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Tenant"));
		result.setVersion(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Version"));
		result.setYunyDaily(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.YunyDaily"));

		List<String> createdBy = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.CreatedBy.Length"); i++) {
			createdBy.add(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.CreatedBy["+ i +"]"));
		}
		result.setCreatedBy(createdBy);

		List<String> jars = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Jars.Length"); i++) {
			jars.add(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Jars["+ i +"]"));
		}
		result.setJars(jars);

		List<String> jarHistrories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.JarHistrories.Length"); i++) {
			jarHistrories.add(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.JarHistrories["+ i +"]"));
		}
		result.setJarHistrories(jarHistrories);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatebasejarversionResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		updateLinkeBahamutWebapiupdatebasejarversionResponse.setResult(result);
	 
	 	return updateLinkeBahamutWebapiupdatebasejarversionResponse;
	}
}