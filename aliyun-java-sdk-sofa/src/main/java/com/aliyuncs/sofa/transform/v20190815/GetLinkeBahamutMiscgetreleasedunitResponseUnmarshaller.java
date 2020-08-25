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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMiscgetreleasedunitResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutMiscgetreleasedunitResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutMiscgetreleasedunitResponseUnmarshaller {

	public static GetLinkeBahamutMiscgetreleasedunitResponse unmarshall(GetLinkeBahamutMiscgetreleasedunitResponse getLinkeBahamutMiscgetreleasedunitResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutMiscgetreleasedunitResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.RequestId"));
		getLinkeBahamutMiscgetreleasedunitResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.ResultCode"));
		getLinkeBahamutMiscgetreleasedunitResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.ResultMessage"));
		getLinkeBahamutMiscgetreleasedunitResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.ErrorMessage"));
		getLinkeBahamutMiscgetreleasedunitResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.ErrorMsgParamsMap"));
		getLinkeBahamutMiscgetreleasedunitResponse.setMessage(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Message"));
		getLinkeBahamutMiscgetreleasedunitResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutMiscgetreleasedunitResponse.ResponseStatusCode"));
		getLinkeBahamutMiscgetreleasedunitResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutMiscgetreleasedunitResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("GetLinkeBahamutMiscgetreleasedunitResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		getLinkeBahamutMiscgetreleasedunitResponse.setResult(result);
	 
	 	return getLinkeBahamutMiscgetreleasedunitResponse;
	}
}