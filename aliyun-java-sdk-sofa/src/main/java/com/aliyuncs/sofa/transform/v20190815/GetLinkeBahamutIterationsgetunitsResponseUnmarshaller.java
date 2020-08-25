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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationsgetunitsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationsgetunitsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationsgetunitsResponseUnmarshaller {

	public static GetLinkeBahamutIterationsgetunitsResponse unmarshall(GetLinkeBahamutIterationsgetunitsResponse getLinkeBahamutIterationsgetunitsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationsgetunitsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.RequestId"));
		getLinkeBahamutIterationsgetunitsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.ResultCode"));
		getLinkeBahamutIterationsgetunitsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.ResultMessage"));
		getLinkeBahamutIterationsgetunitsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.ErrorMessage"));
		getLinkeBahamutIterationsgetunitsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationsgetunitsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Message"));
		getLinkeBahamutIterationsgetunitsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationsgetunitsResponse.ResponseStatusCode"));
		getLinkeBahamutIterationsgetunitsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationsgetunitsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationsgetunitsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutIterationsgetunitsResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		getLinkeBahamutIterationsgetunitsResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationsgetunitsResponse;
	}
}