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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutWebapigetlterationunitsbyreleaseResponseUnmarshaller {

	public static GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse unmarshall(GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse getLinkeBahamutWebapigetlterationunitsbyreleaseResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutWebapigetlterationunitsbyreleaseResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.RequestId"));
		getLinkeBahamutWebapigetlterationunitsbyreleaseResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.ResultCode"));
		getLinkeBahamutWebapigetlterationunitsbyreleaseResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.ResultMessage"));
		getLinkeBahamutWebapigetlterationunitsbyreleaseResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.ErrorMessage"));
		getLinkeBahamutWebapigetlterationunitsbyreleaseResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.ErrorMsgParamsMap"));
		getLinkeBahamutWebapigetlterationunitsbyreleaseResponse.setMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Message"));
		getLinkeBahamutWebapigetlterationunitsbyreleaseResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.ResponseStatusCode"));
		getLinkeBahamutWebapigetlterationunitsbyreleaseResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsbyreleaseResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		getLinkeBahamutWebapigetlterationunitsbyreleaseResponse.setResult(result);
	 
	 	return getLinkeBahamutWebapigetlterationunitsbyreleaseResponse;
	}
}