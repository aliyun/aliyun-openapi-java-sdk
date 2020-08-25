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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutSnapshotResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutSnapshotResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutSnapshotResponseUnmarshaller {

	public static GetLinkeBahamutSnapshotResponse unmarshall(GetLinkeBahamutSnapshotResponse getLinkeBahamutSnapshotResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutSnapshotResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.RequestId"));
		getLinkeBahamutSnapshotResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.ResultCode"));
		getLinkeBahamutSnapshotResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.ResultMessage"));
		getLinkeBahamutSnapshotResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.ErrorMessage"));
		getLinkeBahamutSnapshotResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.ErrorMsgParamsMap"));
		getLinkeBahamutSnapshotResponse.setMessage(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.Message"));
		getLinkeBahamutSnapshotResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutSnapshotResponse.ResponseStatusCode"));
		getLinkeBahamutSnapshotResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutSnapshotResponse.Success"));

		Result result = new Result();
		result.setComments(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.Result.Comments"));
		result.setContent(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.Result.Content"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutSnapshotResponse.Result.Created"));
		result.setCreateTime(_ctx.longValue("GetLinkeBahamutSnapshotResponse.Result.CreateTime"));
		result.setCreator(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.Result.Creator"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutSnapshotResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.Result.Id"));
		result.setIterationUnit(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.Result.IterationUnit"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutSnapshotResponse.Result.LastModified"));
		result.setStageId(_ctx.stringValue("GetLinkeBahamutSnapshotResponse.Result.StageId"));
		getLinkeBahamutSnapshotResponse.setResult(result);
	 
	 	return getLinkeBahamutSnapshotResponse;
	}
}