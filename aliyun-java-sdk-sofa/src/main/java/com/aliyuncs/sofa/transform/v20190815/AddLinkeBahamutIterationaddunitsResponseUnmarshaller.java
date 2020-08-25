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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutIterationaddunitsResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutIterationaddunitsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutIterationaddunitsResponseUnmarshaller {

	public static AddLinkeBahamutIterationaddunitsResponse unmarshall(AddLinkeBahamutIterationaddunitsResponse addLinkeBahamutIterationaddunitsResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutIterationaddunitsResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.RequestId"));
		addLinkeBahamutIterationaddunitsResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.ResultCode"));
		addLinkeBahamutIterationaddunitsResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.ResultMessage"));
		addLinkeBahamutIterationaddunitsResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.ErrorMessage"));
		addLinkeBahamutIterationaddunitsResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.ErrorMsgParamsMap"));
		addLinkeBahamutIterationaddunitsResponse.setMessage(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Message"));
		addLinkeBahamutIterationaddunitsResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutIterationaddunitsResponse.ResponseStatusCode"));
		addLinkeBahamutIterationaddunitsResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutIterationaddunitsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutIterationaddunitsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("AddLinkeBahamutIterationaddunitsResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		addLinkeBahamutIterationaddunitsResponse.setResult(result);
	 
	 	return addLinkeBahamutIterationaddunitsResponse;
	}
}