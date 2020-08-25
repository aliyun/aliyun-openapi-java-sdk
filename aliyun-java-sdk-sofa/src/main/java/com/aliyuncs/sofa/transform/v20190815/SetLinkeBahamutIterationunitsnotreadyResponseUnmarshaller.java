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

import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutIterationunitsnotreadyResponse;
import com.aliyuncs.sofa.model.v20190815.SetLinkeBahamutIterationunitsnotreadyResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLinkeBahamutIterationunitsnotreadyResponseUnmarshaller {

	public static SetLinkeBahamutIterationunitsnotreadyResponse unmarshall(SetLinkeBahamutIterationunitsnotreadyResponse setLinkeBahamutIterationunitsnotreadyResponse, UnmarshallerContext _ctx) {
		
		setLinkeBahamutIterationunitsnotreadyResponse.setRequestId(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.RequestId"));
		setLinkeBahamutIterationunitsnotreadyResponse.setResultCode(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.ResultCode"));
		setLinkeBahamutIterationunitsnotreadyResponse.setResultMessage(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.ResultMessage"));
		setLinkeBahamutIterationunitsnotreadyResponse.setErrorMessage(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.ErrorMessage"));
		setLinkeBahamutIterationunitsnotreadyResponse.setErrorMsgParamsMap(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.ErrorMsgParamsMap"));
		setLinkeBahamutIterationunitsnotreadyResponse.setMessage(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Message"));
		setLinkeBahamutIterationunitsnotreadyResponse.setResponseStatusCode(_ctx.longValue("SetLinkeBahamutIterationunitsnotreadyResponse.ResponseStatusCode"));
		setLinkeBahamutIterationunitsnotreadyResponse.setSuccess(_ctx.booleanValue("SetLinkeBahamutIterationunitsnotreadyResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("SetLinkeBahamutIterationunitsnotreadyResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		setLinkeBahamutIterationunitsnotreadyResponse.setResult(result);
	 
	 	return setLinkeBahamutIterationunitsnotreadyResponse;
	}
}