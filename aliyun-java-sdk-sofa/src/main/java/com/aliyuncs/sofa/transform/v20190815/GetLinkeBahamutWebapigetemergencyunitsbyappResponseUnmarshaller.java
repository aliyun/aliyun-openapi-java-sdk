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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetemergencyunitsbyappResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutWebapigetemergencyunitsbyappResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutWebapigetemergencyunitsbyappResponseUnmarshaller {

	public static GetLinkeBahamutWebapigetemergencyunitsbyappResponse unmarshall(GetLinkeBahamutWebapigetemergencyunitsbyappResponse getLinkeBahamutWebapigetemergencyunitsbyappResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutWebapigetemergencyunitsbyappResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.RequestId"));
		getLinkeBahamutWebapigetemergencyunitsbyappResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.ResultCode"));
		getLinkeBahamutWebapigetemergencyunitsbyappResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.ResultMessage"));
		getLinkeBahamutWebapigetemergencyunitsbyappResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.ErrorMessage"));
		getLinkeBahamutWebapigetemergencyunitsbyappResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.ErrorMsgParamsMap"));
		getLinkeBahamutWebapigetemergencyunitsbyappResponse.setMessage(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Message"));
		getLinkeBahamutWebapigetemergencyunitsbyappResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.ResponseStatusCode"));
		getLinkeBahamutWebapigetemergencyunitsbyappResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutWebapigetemergencyunitsbyappResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		getLinkeBahamutWebapigetemergencyunitsbyappResponse.setResult(result);
	 
	 	return getLinkeBahamutWebapigetemergencyunitsbyappResponse;
	}
}