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

import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationunitsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryLinkeBahamutIterationunitsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryLinkeBahamutIterationunitsResponseUnmarshaller {

	public static QueryLinkeBahamutIterationunitsResponse unmarshall(QueryLinkeBahamutIterationunitsResponse queryLinkeBahamutIterationunitsResponse, UnmarshallerContext _ctx) {
		
		queryLinkeBahamutIterationunitsResponse.setRequestId(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.RequestId"));
		queryLinkeBahamutIterationunitsResponse.setResultCode(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.ResultCode"));
		queryLinkeBahamutIterationunitsResponse.setResultMessage(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.ResultMessage"));
		queryLinkeBahamutIterationunitsResponse.setErrorMessage(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.ErrorMessage"));
		queryLinkeBahamutIterationunitsResponse.setErrorMsgParamsMap(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.ErrorMsgParamsMap"));
		queryLinkeBahamutIterationunitsResponse.setMessage(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Message"));
		queryLinkeBahamutIterationunitsResponse.setResponseStatusCode(_ctx.longValue("QueryLinkeBahamutIterationunitsResponse.ResponseStatusCode"));
		queryLinkeBahamutIterationunitsResponse.setSuccess(_ctx.booleanValue("QueryLinkeBahamutIterationunitsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryLinkeBahamutIterationunitsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppMeta(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].AppMeta"));
			resultItem.setBatchIndex(_ctx.longValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].BatchIndex"));
			resultItem.setBeforeSit(_ctx.booleanValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].BeforeSit"));
			resultItem.setCompatible(_ctx.booleanValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Compatible"));
			resultItem.setCreated(_ctx.longValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Created"));
			resultItem.setCreateAfterUseLinkQ(_ctx.booleanValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].CreateAfterUseLinkQ"));
			resultItem.setCreatorSysName(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].CreatorSysName"));
			resultItem.setCurrentStage(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].CurrentStage"));
			resultItem.setCurrentStageStep(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].CurrentStageStep"));
			resultItem.setDeleted(_ctx.booleanValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Deleted"));
			resultItem.setDeletedByIteration(_ctx.booleanValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].DeletedByIteration"));
			resultItem.setFinished(_ctx.booleanValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Finished"));
			resultItem.setFrom(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].From"));
			resultItem.setFromCommitId(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].FromCommitId"));
			resultItem.setId(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Id"));
			resultItem.setIteration(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Iteration"));
			resultItem.setLastModified(_ctx.longValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].LastModified"));
			resultItem.setLastStage(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].LastStage"));
			resultItem.setNextStage(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].NextStage"));
			resultItem.set_Private(_ctx.booleanValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Private"));
			resultItem.setProdCode(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].ProdCode"));
			resultItem.setProdVersion(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].ProdVersion"));
			resultItem.setSkipReleaseCheck(_ctx.booleanValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].SkipReleaseCheck"));
			resultItem.setTagName(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].TagName"));
			resultItem.setTenant(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Tenant"));
			resultItem.setVersion(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Version"));
			resultItem.setYunyDaily(_ctx.booleanValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].YunyDaily"));

			List<String> createdBy = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].CreatedBy.Length"); j++) {
				createdBy.add(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].CreatedBy["+ j +"]"));
			}
			resultItem.setCreatedBy(createdBy);

			List<String> jars = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Jars.Length"); j++) {
				jars.add(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Jars["+ j +"]"));
			}
			resultItem.setJars(jars);

			List<String> jarHistrories = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].JarHistrories.Length"); j++) {
				jarHistrories.add(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].JarHistrories["+ j +"]"));
			}
			resultItem.setJarHistrories(jarHistrories);

			List<String> members = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Members.Length"); j++) {
				members.add(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Members["+ j +"]"));
			}
			resultItem.setMembers(members);

			List<String> stages = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Stages.Length"); j++) {
				stages.add(_ctx.stringValue("QueryLinkeBahamutIterationunitsResponse.Result["+ i +"].Stages["+ j +"]"));
			}
			resultItem.setStages(stages);

			result.add(resultItem);
		}
		queryLinkeBahamutIterationunitsResponse.setResult(result);
	 
	 	return queryLinkeBahamutIterationunitsResponse;
	}
}