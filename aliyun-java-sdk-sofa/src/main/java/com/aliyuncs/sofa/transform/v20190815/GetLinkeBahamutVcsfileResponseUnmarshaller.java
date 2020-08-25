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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsfileResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsfileResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsfileResponseUnmarshaller {

	public static GetLinkeBahamutVcsfileResponse unmarshall(GetLinkeBahamutVcsfileResponse getLinkeBahamutVcsfileResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsfileResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.RequestId"));
		getLinkeBahamutVcsfileResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.ResultCode"));
		getLinkeBahamutVcsfileResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.ResultMessage"));
		getLinkeBahamutVcsfileResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.ErrorMessage"));
		getLinkeBahamutVcsfileResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsfileResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.Message"));
		getLinkeBahamutVcsfileResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsfileResponse.ResponseStatusCode"));
		getLinkeBahamutVcsfileResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsfileResponse.Success"));

		Result result = new Result();
		result.setBlobId(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.Result.BlobId"));
		result.setCommitId(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.Result.CommitId"));
		result.setContent(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.Result.Content"));
		result.setEncoding(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.Result.Encoding"));
		result.setFileName(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.Result.FileName"));
		result.setFilePath(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.Result.FilePath"));
		result.setLastCommitId(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.Result.LastCommitId"));
		result.setRef(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.Result.Ref"));
		result.setSize(_ctx.stringValue("GetLinkeBahamutVcsfileResponse.Result.Size"));
		getLinkeBahamutVcsfileResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsfileResponse;
	}
}