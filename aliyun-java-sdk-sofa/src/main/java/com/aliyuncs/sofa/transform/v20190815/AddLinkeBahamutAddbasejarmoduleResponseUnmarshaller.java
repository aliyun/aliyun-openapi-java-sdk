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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAddbasejarmoduleResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAddbasejarmoduleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAddbasejarmoduleResponseUnmarshaller {

	public static AddLinkeBahamutAddbasejarmoduleResponse unmarshall(AddLinkeBahamutAddbasejarmoduleResponse addLinkeBahamutAddbasejarmoduleResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAddbasejarmoduleResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.RequestId"));
		addLinkeBahamutAddbasejarmoduleResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.ResultCode"));
		addLinkeBahamutAddbasejarmoduleResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.ResultMessage"));
		addLinkeBahamutAddbasejarmoduleResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.ErrorMessage"));
		addLinkeBahamutAddbasejarmoduleResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAddbasejarmoduleResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Message"));
		addLinkeBahamutAddbasejarmoduleResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAddbasejarmoduleResponse.ResponseStatusCode"));
		addLinkeBahamutAddbasejarmoduleResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAddbasejarmoduleResponse.Success"));

		Result result = new Result();
		result.setAppMeta(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.AppMeta"));
		result.setBatchIndex(_ctx.longValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.BatchIndex"));
		result.setBeforeSit(_ctx.booleanValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.BeforeSit"));
		result.setCompatible(_ctx.booleanValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Created"));
		result.setCreateAfterUseLinkQ(_ctx.booleanValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.CreateAfterUseLinkQ"));
		result.setCreatorSysName(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.CreatorSysName"));
		result.setCurrentStage(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.CurrentStage"));
		result.setCurrentStageStep(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.CurrentStageStep"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Deleted"));
		result.setDeletedByIteration(_ctx.booleanValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.DeletedByIteration"));
		result.setFinished(_ctx.booleanValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Finished"));
		result.setFrom(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.From"));
		result.setFromCommitId(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.FromCommitId"));
		result.setId(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Id"));
		result.setIteration(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Iteration"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.LastModified"));
		result.setLastStage(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.LastStage"));
		result.setNextStage(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.NextStage"));
		result.set_Private(_ctx.booleanValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Private"));
		result.setProdCode(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.ProdVersion"));
		result.setSkipReleaseCheck(_ctx.booleanValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.SkipReleaseCheck"));
		result.setTagName(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.TagName"));
		result.setTenant(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Tenant"));
		result.setVersion(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Version"));
		result.setYunyDaily(_ctx.booleanValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.YunyDaily"));

		List<String> createdBy = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.CreatedBy.Length"); i++) {
			createdBy.add(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.CreatedBy["+ i +"]"));
		}
		result.setCreatedBy(createdBy);

		List<String> jars = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Jars.Length"); i++) {
			jars.add(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Jars["+ i +"]"));
		}
		result.setJars(jars);

		List<String> jarHistrories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.JarHistrories.Length"); i++) {
			jarHistrories.add(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.JarHistrories["+ i +"]"));
		}
		result.setJarHistrories(jarHistrories);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("AddLinkeBahamutAddbasejarmoduleResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		addLinkeBahamutAddbasejarmoduleResponse.setResult(result);
	 
	 	return addLinkeBahamutAddbasejarmoduleResponse;
	}
}