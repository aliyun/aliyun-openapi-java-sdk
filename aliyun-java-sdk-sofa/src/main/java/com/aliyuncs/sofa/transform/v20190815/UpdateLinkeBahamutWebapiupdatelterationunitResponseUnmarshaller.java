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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutWebapiupdatelterationunitResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutWebapiupdatelterationunitResponseUnmarshaller {

	public static UpdateLinkeBahamutWebapiupdatelterationunitResponse unmarshall(UpdateLinkeBahamutWebapiupdatelterationunitResponse updateLinkeBahamutWebapiupdatelterationunitResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutWebapiupdatelterationunitResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.RequestId"));
		updateLinkeBahamutWebapiupdatelterationunitResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.ResultCode"));
		updateLinkeBahamutWebapiupdatelterationunitResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.ResultMessage"));
		updateLinkeBahamutWebapiupdatelterationunitResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.ErrorMessage"));
		updateLinkeBahamutWebapiupdatelterationunitResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutWebapiupdatelterationunitResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Message"));
		updateLinkeBahamutWebapiupdatelterationunitResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.ResponseStatusCode"));
		updateLinkeBahamutWebapiupdatelterationunitResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Success"));

		Result result = new Result();
		result.setAppMeta(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.AppMeta"));
		result.setBatchIndex(_ctx.longValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.BatchIndex"));
		result.setBeforeSit(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.BeforeSit"));
		result.setCompatible(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Created"));
		result.setCreateAfterUseLinkQ(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.CreateAfterUseLinkQ"));
		result.setCreatorSysName(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.CreatorSysName"));
		result.setCurrentStage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.CurrentStage"));
		result.setCurrentStageStep(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.CurrentStageStep"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Deleted"));
		result.setDeletedByIteration(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.DeletedByIteration"));
		result.setFinished(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Finished"));
		result.setFrom(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.From"));
		result.setFromCommitId(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.FromCommitId"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Id"));
		result.setIteration(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Iteration"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.LastModified"));
		result.setLastStage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.LastStage"));
		result.setNextStage(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.NextStage"));
		result.set_Private(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Private"));
		result.setProdCode(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.ProdVersion"));
		result.setSkipReleaseCheck(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.SkipReleaseCheck"));
		result.setTagName(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.TagName"));
		result.setTenant(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Tenant"));
		result.setVersion(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Version"));
		result.setYunyDaily(_ctx.booleanValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.YunyDaily"));

		List<String> createdBy = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.CreatedBy.Length"); i++) {
			createdBy.add(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.CreatedBy["+ i +"]"));
		}
		result.setCreatedBy(createdBy);

		List<String> jars = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Jars.Length"); i++) {
			jars.add(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Jars["+ i +"]"));
		}
		result.setJars(jars);

		List<String> jarHistrories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.JarHistrories.Length"); i++) {
			jarHistrories.add(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.JarHistrories["+ i +"]"));
		}
		result.setJarHistrories(jarHistrories);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("UpdateLinkeBahamutWebapiupdatelterationunitResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		updateLinkeBahamutWebapiupdatelterationunitResponse.setResult(result);
	 
	 	return updateLinkeBahamutWebapiupdatelterationunitResponse;
	}
}