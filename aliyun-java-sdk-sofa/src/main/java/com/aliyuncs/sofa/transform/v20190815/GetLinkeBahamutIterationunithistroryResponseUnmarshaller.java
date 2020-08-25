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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationunithistroryResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutIterationunithistroryResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutIterationunithistroryResponseUnmarshaller {

	public static GetLinkeBahamutIterationunithistroryResponse unmarshall(GetLinkeBahamutIterationunithistroryResponse getLinkeBahamutIterationunithistroryResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutIterationunithistroryResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.RequestId"));
		getLinkeBahamutIterationunithistroryResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.ResultCode"));
		getLinkeBahamutIterationunithistroryResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.ResultMessage"));
		getLinkeBahamutIterationunithistroryResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.ErrorMessage"));
		getLinkeBahamutIterationunithistroryResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.ErrorMsgParamsMap"));
		getLinkeBahamutIterationunithistroryResponse.setMessage(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Message"));
		getLinkeBahamutIterationunithistroryResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutIterationunithistroryResponse.ResponseStatusCode"));
		getLinkeBahamutIterationunithistroryResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutIterationunithistroryResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutIterationunithistroryResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setApplicant(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Applicant"));
			resultItem.setArtifactId(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].ArtifactId"));
			resultItem.setBranch(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Branch"));
			resultItem.setCommit(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Commit"));
			resultItem.setComponentExecutionId(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].ComponentExecutionId"));
			resultItem.setCreated(_ctx.longValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Created"));
			resultItem.setDeleted(_ctx.booleanValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Deleted"));
			resultItem.setGroupId(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].GroupId"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Id"));
			resultItem.setIncompatible(_ctx.booleanValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Incompatible"));
			resultItem.setIterationUnitHistoryTypeEnum(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].IterationUnitHistoryTypeEnum"));
			resultItem.setKey(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Key"));
			resultItem.setLastModified(_ctx.longValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].LastModified"));
			resultItem.setPipelineExecutionId(_ctx.longValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].PipelineExecutionId"));
			resultItem.setPipelineInstanceId(_ctx.longValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].PipelineInstanceId"));
			resultItem.setPublishJarEnv(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].PublishJarEnv"));
			resultItem.setReleaseTime(_ctx.longValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].ReleaseTime"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Status"));
			resultItem.setUnitId(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].UnitId"));
			resultItem.setUnitStageId(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].UnitStageId"));
			resultItem.setValue(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Value"));
			resultItem.setVersion(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].Version"));

			List<String> mvnRepo = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].MvnRepo.Length"); j++) {
				mvnRepo.add(_ctx.stringValue("GetLinkeBahamutIterationunithistroryResponse.Result["+ i +"].MvnRepo["+ j +"]"));
			}
			resultItem.setMvnRepo(mvnRepo);

			result.add(resultItem);
		}
		getLinkeBahamutIterationunithistroryResponse.setResult(result);
	 
	 	return getLinkeBahamutIterationunithistroryResponse;
	}
}