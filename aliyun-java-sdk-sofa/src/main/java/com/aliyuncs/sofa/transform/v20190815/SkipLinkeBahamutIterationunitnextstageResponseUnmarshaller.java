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

import com.aliyuncs.sofa.model.v20190815.SkipLinkeBahamutIterationunitnextstageResponse;
import com.aliyuncs.sofa.model.v20190815.SkipLinkeBahamutIterationunitnextstageResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class SkipLinkeBahamutIterationunitnextstageResponseUnmarshaller {

	public static SkipLinkeBahamutIterationunitnextstageResponse unmarshall(SkipLinkeBahamutIterationunitnextstageResponse skipLinkeBahamutIterationunitnextstageResponse, UnmarshallerContext _ctx) {
		
		skipLinkeBahamutIterationunitnextstageResponse.setRequestId(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.RequestId"));
		skipLinkeBahamutIterationunitnextstageResponse.setResultCode(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.ResultCode"));
		skipLinkeBahamutIterationunitnextstageResponse.setResultMessage(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.ResultMessage"));
		skipLinkeBahamutIterationunitnextstageResponse.setErrorMessage(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.ErrorMessage"));
		skipLinkeBahamutIterationunitnextstageResponse.setErrorMsgParamsMap(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.ErrorMsgParamsMap"));
		skipLinkeBahamutIterationunitnextstageResponse.setMessage(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Message"));
		skipLinkeBahamutIterationunitnextstageResponse.setResponseStatusCode(_ctx.longValue("SkipLinkeBahamutIterationunitnextstageResponse.ResponseStatusCode"));
		skipLinkeBahamutIterationunitnextstageResponse.setSuccess(_ctx.booleanValue("SkipLinkeBahamutIterationunitnextstageResponse.Success"));

		Result result = new Result();
		result.setAppMeta(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.AppMeta"));
		result.setBatchIndex(_ctx.longValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.BatchIndex"));
		result.setBeforeSit(_ctx.booleanValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.BeforeSit"));
		result.setCompatible(_ctx.booleanValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Compatible"));
		result.setCreated(_ctx.longValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Created"));
		result.setCreateAfterUseLinkQ(_ctx.booleanValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.CreateAfterUseLinkQ"));
		result.setCreatorSysName(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.CreatorSysName"));
		result.setCurrentStage(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.CurrentStage"));
		result.setCurrentStageStep(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.CurrentStageStep"));
		result.setDeleted(_ctx.booleanValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Deleted"));
		result.setDeletedByIteration(_ctx.booleanValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.DeletedByIteration"));
		result.setFinished(_ctx.booleanValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Finished"));
		result.setFrom(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.From"));
		result.setFromCommitId(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.FromCommitId"));
		result.setId(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Id"));
		result.setIteration(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Iteration"));
		result.setLastModified(_ctx.longValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.LastModified"));
		result.setLastStage(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.LastStage"));
		result.setNextStage(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.NextStage"));
		result.set_Private(_ctx.booleanValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Private"));
		result.setProdCode(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.ProdCode"));
		result.setProdVersion(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.ProdVersion"));
		result.setSkipReleaseCheck(_ctx.booleanValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.SkipReleaseCheck"));
		result.setTagName(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.TagName"));
		result.setTenant(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Tenant"));
		result.setVersion(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Version"));
		result.setYunyDaily(_ctx.booleanValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.YunyDaily"));

		List<String> createdBy = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.CreatedBy.Length"); i++) {
			createdBy.add(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.CreatedBy["+ i +"]"));
		}
		result.setCreatedBy(createdBy);

		List<String> jars = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Jars.Length"); i++) {
			jars.add(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Jars["+ i +"]"));
		}
		result.setJars(jars);

		List<String> jarHistrories = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.JarHistrories.Length"); i++) {
			jarHistrories.add(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.JarHistrories["+ i +"]"));
		}
		result.setJarHistrories(jarHistrories);

		List<String> members = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Members.Length"); i++) {
			members.add(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Members["+ i +"]"));
		}
		result.setMembers(members);

		List<String> stages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Stages.Length"); i++) {
			stages.add(_ctx.stringValue("SkipLinkeBahamutIterationunitnextstageResponse.Result.Stages["+ i +"]"));
		}
		result.setStages(stages);
		skipLinkeBahamutIterationunitnextstageResponse.setResult(result);
	 
	 	return skipLinkeBahamutIterationunitnextstageResponse;
	}
}