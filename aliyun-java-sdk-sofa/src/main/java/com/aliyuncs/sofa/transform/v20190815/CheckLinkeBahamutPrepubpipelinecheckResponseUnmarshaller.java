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

import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutPrepubpipelinecheckResponse;
import com.aliyuncs.sofa.model.v20190815.CheckLinkeBahamutPrepubpipelinecheckResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLinkeBahamutPrepubpipelinecheckResponseUnmarshaller {

	public static CheckLinkeBahamutPrepubpipelinecheckResponse unmarshall(CheckLinkeBahamutPrepubpipelinecheckResponse checkLinkeBahamutPrepubpipelinecheckResponse, UnmarshallerContext _ctx) {
		
		checkLinkeBahamutPrepubpipelinecheckResponse.setRequestId(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.RequestId"));
		checkLinkeBahamutPrepubpipelinecheckResponse.setResultCode(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.ResultCode"));
		checkLinkeBahamutPrepubpipelinecheckResponse.setResultMessage(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.ResultMessage"));
		checkLinkeBahamutPrepubpipelinecheckResponse.setErrorMessage(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.ErrorMessage"));
		checkLinkeBahamutPrepubpipelinecheckResponse.setErrorMsgParamsMap(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.ErrorMsgParamsMap"));
		checkLinkeBahamutPrepubpipelinecheckResponse.setMessage(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Message"));
		checkLinkeBahamutPrepubpipelinecheckResponse.setResponseStatusCode(_ctx.longValue("CheckLinkeBahamutPrepubpipelinecheckResponse.ResponseStatusCode"));
		checkLinkeBahamutPrepubpipelinecheckResponse.setSuccess(_ctx.booleanValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("CheckLinkeBahamutPrepubpipelinecheckResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		checkLinkeBahamutPrepubpipelinecheckResponse.setResult(result);
	 
	 	return checkLinkeBahamutPrepubpipelinecheckResponse;
	}
}