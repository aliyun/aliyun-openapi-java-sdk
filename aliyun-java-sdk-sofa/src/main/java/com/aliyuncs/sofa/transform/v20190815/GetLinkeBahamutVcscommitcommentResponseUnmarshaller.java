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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcscommitcommentResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcscommitcommentResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcscommitcommentResponseUnmarshaller {

	public static GetLinkeBahamutVcscommitcommentResponse unmarshall(GetLinkeBahamutVcscommitcommentResponse getLinkeBahamutVcscommitcommentResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcscommitcommentResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.RequestId"));
		getLinkeBahamutVcscommitcommentResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.ResultCode"));
		getLinkeBahamutVcscommitcommentResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.ResultMessage"));
		getLinkeBahamutVcscommitcommentResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.ErrorMessage"));
		getLinkeBahamutVcscommitcommentResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcscommitcommentResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.Message"));
		getLinkeBahamutVcscommitcommentResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcscommitcommentResponse.ResponseStatusCode"));
		getLinkeBahamutVcscommitcommentResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcscommitcommentResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcscommitcommentResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAuthor(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].Author"));
			resultItem.setAward(_ctx.booleanValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].Award"));
			resultItem.setCommitId(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].CommitId"));
			resultItem.setCreatedAt(_ctx.longValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].CreatedAt"));
			resultItem.setDiff(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].Diff"));
			resultItem.setId(_ctx.longValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].Id"));
			resultItem.setLineCode(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].LineCode"));
			resultItem.setNote(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].Note"));
			resultItem.setSystem(_ctx.booleanValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].System"));
			resultItem.setUpdatedAt(_ctx.longValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].UpdatedAt"));
			resultItem.setUpdatedBy(_ctx.stringValue("GetLinkeBahamutVcscommitcommentResponse.Result["+ i +"].UpdatedBy"));

			result.add(resultItem);
		}
		getLinkeBahamutVcscommitcommentResponse.setResult(result);
	 
	 	return getLinkeBahamutVcscommitcommentResponse;
	}
}