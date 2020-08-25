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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsmrcommentResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsmrcommentResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsmrcommentResponseUnmarshaller {

	public static GetLinkeBahamutVcsmrcommentResponse unmarshall(GetLinkeBahamutVcsmrcommentResponse getLinkeBahamutVcsmrcommentResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsmrcommentResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.RequestId"));
		getLinkeBahamutVcsmrcommentResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.ResultCode"));
		getLinkeBahamutVcsmrcommentResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.ResultMessage"));
		getLinkeBahamutVcsmrcommentResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.ErrorMessage"));
		getLinkeBahamutVcsmrcommentResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsmrcommentResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.Message"));
		getLinkeBahamutVcsmrcommentResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsmrcommentResponse.ResponseStatusCode"));
		getLinkeBahamutVcsmrcommentResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsmrcommentResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcsmrcommentResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAuthor(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].Author"));
			resultItem.setAward(_ctx.booleanValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].Award"));
			resultItem.setCommitId(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].CommitId"));
			resultItem.setCreatedAt(_ctx.longValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].CreatedAt"));
			resultItem.setDiff(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].Diff"));
			resultItem.setId(_ctx.longValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].Id"));
			resultItem.setLineCode(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].LineCode"));
			resultItem.setNote(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].Note"));
			resultItem.setSystem(_ctx.booleanValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].System"));
			resultItem.setUpdatedAt(_ctx.longValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].UpdatedAt"));
			resultItem.setUpdatedBy(_ctx.stringValue("GetLinkeBahamutVcsmrcommentResponse.Result["+ i +"].UpdatedBy"));

			result.add(resultItem);
		}
		getLinkeBahamutVcsmrcommentResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsmrcommentResponse;
	}
}