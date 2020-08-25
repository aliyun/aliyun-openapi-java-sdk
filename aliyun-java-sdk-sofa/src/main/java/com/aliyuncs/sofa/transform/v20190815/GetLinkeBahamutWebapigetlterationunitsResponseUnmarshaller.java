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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetlterationunitsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetlterationunitsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutWebapigetlterationunitsResponseUnmarshaller {

	public static GetLinkeBahamutWebapigetlterationunitsResponse unmarshall(GetLinkeBahamutWebapigetlterationunitsResponse getLinkeBahamutWebapigetlterationunitsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutWebapigetlterationunitsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.RequestId"));
		getLinkeBahamutWebapigetlterationunitsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.ResultCode"));
		getLinkeBahamutWebapigetlterationunitsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.ResultMessage"));
		getLinkeBahamutWebapigetlterationunitsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.ErrorMessage"));
		getLinkeBahamutWebapigetlterationunitsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutWebapigetlterationunitsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Message"));
		getLinkeBahamutWebapigetlterationunitsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutWebapigetlterationunitsResponse.ResponseStatusCode"));
		getLinkeBahamutWebapigetlterationunitsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutWebapigetlterationunitsResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		getLinkeBahamutWebapigetlterationunitsResponse.setResult(result);
	 
	 	return getLinkeBahamutWebapigetlterationunitsResponse;
	}
}