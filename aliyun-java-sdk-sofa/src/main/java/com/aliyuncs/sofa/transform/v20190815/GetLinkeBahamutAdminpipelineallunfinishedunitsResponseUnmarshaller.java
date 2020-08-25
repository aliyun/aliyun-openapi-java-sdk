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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAdminpipelineallunfinishedunitsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAdminpipelineallunfinishedunitsResponseUnmarshaller {

	public static GetLinkeBahamutAdminpipelineallunfinishedunitsResponse unmarshall(GetLinkeBahamutAdminpipelineallunfinishedunitsResponse getLinkeBahamutAdminpipelineallunfinishedunitsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAdminpipelineallunfinishedunitsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.RequestId"));
		getLinkeBahamutAdminpipelineallunfinishedunitsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.ResultCode"));
		getLinkeBahamutAdminpipelineallunfinishedunitsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.ResultMessage"));
		getLinkeBahamutAdminpipelineallunfinishedunitsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.ErrorMessage"));
		getLinkeBahamutAdminpipelineallunfinishedunitsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAdminpipelineallunfinishedunitsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Message"));
		getLinkeBahamutAdminpipelineallunfinishedunitsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.ResponseStatusCode"));
		getLinkeBahamutAdminpipelineallunfinishedunitsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutAdminpipelineallunfinishedunitsResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		getLinkeBahamutAdminpipelineallunfinishedunitsResponse.setResult(result);
	 
	 	return getLinkeBahamutAdminpipelineallunfinishedunitsResponse;
	}
}