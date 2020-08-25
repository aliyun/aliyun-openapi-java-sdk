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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutIterationunitaddmemberforunitResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutIterationunitaddmemberforunitResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutIterationunitaddmemberforunitResponseUnmarshaller {

	public static AddLinkeBahamutIterationunitaddmemberforunitResponse unmarshall(AddLinkeBahamutIterationunitaddmemberforunitResponse addLinkeBahamutIterationunitaddmemberforunitResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutIterationunitaddmemberforunitResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.RequestId"));
		addLinkeBahamutIterationunitaddmemberforunitResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.ResultCode"));
		addLinkeBahamutIterationunitaddmemberforunitResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.ResultMessage"));
		addLinkeBahamutIterationunitaddmemberforunitResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.ErrorMessage"));
		addLinkeBahamutIterationunitaddmemberforunitResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.ErrorMsgParamsMap"));
		addLinkeBahamutIterationunitaddmemberforunitResponse.setMessage(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Message"));
		addLinkeBahamutIterationunitaddmemberforunitResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.ResponseStatusCode"));
		addLinkeBahamutIterationunitaddmemberforunitResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Success"));

		Result result = new Result();
		result.setAppMeta(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.AppMeta"));
		result.setBatchIndex(_ctx.longValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.BatchIndex"));
		result.setBeforeSit(_ctx.booleanValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.BeforeSit"));
		result.setCompatible(_ctx.booleanValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Created"));
		result.setCreateAfterUseLinkQ(_ctx.booleanValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.CreateAfterUseLinkQ"));
		result.setCreatorSysName(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.CreatorSysName"));
		result.setCurrentStage(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.CurrentStage"));
		result.setCurrentStageStep(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.CurrentStageStep"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Deleted"));
		result.setDeletedByIteration(_ctx.booleanValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.DeletedByIteration"));
		result.setFinished(_ctx.booleanValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Finished"));
		result.setFrom(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.From"));
		result.setFromCommitId(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.FromCommitId"));
		result.setId(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Id"));
		result.setIteration(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Iteration"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.LastModified"));
		result.setLastStage(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.LastStage"));
		result.setNextStage(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.NextStage"));
		result.set_Private(_ctx.booleanValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Private"));
		result.setProdCode(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.ProdVersion"));
		result.setSkipReleaseCheck(_ctx.booleanValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.SkipReleaseCheck"));
		result.setTagName(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.TagName"));
		result.setTenant(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Tenant"));
		result.setVersion(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Version"));
		result.setYunyDaily(_ctx.booleanValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.YunyDaily"));

		List<String> createdBy = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.CreatedBy.Length"); i++) {
			createdBy.add(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.CreatedBy["+ i +"]"));
		}
		result.setCreatedBy(createdBy);

		List<String> jars = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Jars.Length"); i++) {
			jars.add(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Jars["+ i +"]"));
		}
		result.setJars(jars);

		List<String> jarHistrories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.JarHistrories.Length"); i++) {
			jarHistrories.add(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.JarHistrories["+ i +"]"));
		}
		result.setJarHistrories(jarHistrories);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("AddLinkeBahamutIterationunitaddmemberforunitResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		addLinkeBahamutIterationunitaddmemberforunitResponse.setResult(result);
	 
	 	return addLinkeBahamutIterationunitaddmemberforunitResponse;
	}
}