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

import com.aliyuncs.sofa.model.v20190815.RemoveLinkeBahamutIterationunitremovememberforunitResponse;
import com.aliyuncs.sofa.model.v20190815.RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveLinkeBahamutIterationunitremovememberforunitResponseUnmarshaller {

	public static RemoveLinkeBahamutIterationunitremovememberforunitResponse unmarshall(RemoveLinkeBahamutIterationunitremovememberforunitResponse removeLinkeBahamutIterationunitremovememberforunitResponse, UnmarshallerContext _ctx) {
		
		removeLinkeBahamutIterationunitremovememberforunitResponse.setRequestId(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.RequestId"));
		removeLinkeBahamutIterationunitremovememberforunitResponse.setResultCode(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.ResultCode"));
		removeLinkeBahamutIterationunitremovememberforunitResponse.setResultMessage(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.ResultMessage"));
		removeLinkeBahamutIterationunitremovememberforunitResponse.setErrorMessage(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.ErrorMessage"));
		removeLinkeBahamutIterationunitremovememberforunitResponse.setErrorMsgParamsMap(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.ErrorMsgParamsMap"));
		removeLinkeBahamutIterationunitremovememberforunitResponse.setMessage(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Message"));
		removeLinkeBahamutIterationunitremovememberforunitResponse.setResponseStatusCode(_ctx.longValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.ResponseStatusCode"));
		removeLinkeBahamutIterationunitremovememberforunitResponse.setSuccess(_ctx.booleanValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Success"));

		Result result = new Result();
		result.setAppMeta(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.AppMeta"));
		result.setBatchIndex(_ctx.longValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.BatchIndex"));
		result.setBeforeSit(_ctx.booleanValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.BeforeSit"));
		result.setCompatible(_ctx.booleanValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Created"));
		result.setCreateAfterUseLinkQ(_ctx.booleanValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.CreateAfterUseLinkQ"));
		result.setCreatorSysName(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.CreatorSysName"));
		result.setCurrentStage(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.CurrentStage"));
		result.setCurrentStageStep(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.CurrentStageStep"));
		result.setDeleted(_ctx.booleanValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Deleted"));
		result.setDeletedByIteration(_ctx.booleanValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.DeletedByIteration"));
		result.setFinished(_ctx.booleanValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Finished"));
		result.setFrom(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.From"));
		result.setFromCommitId(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.FromCommitId"));
		result.setId(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Id"));
		result.setIteration(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Iteration"));
		result.setLastModified(_ctx.longValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.LastModified"));
		result.setLastStage(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.LastStage"));
		result.setNextStage(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.NextStage"));
		result.set_Private(_ctx.booleanValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Private"));
		result.setProdCode(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.ProdVersion"));
		result.setSkipReleaseCheck(_ctx.booleanValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.SkipReleaseCheck"));
		result.setTagName(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.TagName"));
		result.setTenant(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Tenant"));
		result.setVersion(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Version"));
		result.setYunyDaily(_ctx.booleanValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.YunyDaily"));

		List<String> createdBy = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.CreatedBy.Length"); i++) {
			createdBy.add(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.CreatedBy["+ i +"]"));
		}
		result.setCreatedBy(createdBy);

		List<String> jars = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Jars.Length"); i++) {
			jars.add(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Jars["+ i +"]"));
		}
		result.setJars(jars);

		List<String> jarHistrories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.JarHistrories.Length"); i++) {
			jarHistrories.add(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.JarHistrories["+ i +"]"));
		}
		result.setJarHistrories(jarHistrories);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("RemoveLinkeBahamutIterationunitremovememberforunitResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		removeLinkeBahamutIterationunitremovememberforunitResponse.setResult(result);
	 
	 	return removeLinkeBahamutIterationunitremovememberforunitResponse;
	}
}