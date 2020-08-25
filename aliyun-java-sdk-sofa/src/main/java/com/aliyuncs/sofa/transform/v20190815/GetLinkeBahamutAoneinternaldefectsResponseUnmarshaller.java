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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternaldefectsResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutAoneinternaldefectsResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutAoneinternaldefectsResponseUnmarshaller {

	public static GetLinkeBahamutAoneinternaldefectsResponse unmarshall(GetLinkeBahamutAoneinternaldefectsResponse getLinkeBahamutAoneinternaldefectsResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutAoneinternaldefectsResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.RequestId"));
		getLinkeBahamutAoneinternaldefectsResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.ResultCode"));
		getLinkeBahamutAoneinternaldefectsResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.ResultMessage"));
		getLinkeBahamutAoneinternaldefectsResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.ErrorMessage"));
		getLinkeBahamutAoneinternaldefectsResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.ErrorMsgParamsMap"));
		getLinkeBahamutAoneinternaldefectsResponse.setMessage(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.Message"));
		getLinkeBahamutAoneinternaldefectsResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutAoneinternaldefectsResponse.ResponseStatusCode"));
		getLinkeBahamutAoneinternaldefectsResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutAoneinternaldefectsResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutAoneinternaldefectsResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAssignedTo(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.Result["+ i +"].AssignedTo"));
			resultItem.setCreatedAt(_ctx.longValue("GetLinkeBahamutAoneinternaldefectsResponse.Result["+ i +"].CreatedAt"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.Result["+ i +"].Id"));
			resultItem.setLink(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.Result["+ i +"].Link"));
			resultItem.setPriority(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.Result["+ i +"].Priority"));
			resultItem.setProjectId(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.Result["+ i +"].ProjectId"));
			resultItem.setSeriousLevel(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.Result["+ i +"].SeriousLevel"));
			resultItem.setStatus(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.Result["+ i +"].Status"));
			resultItem.setSubject(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.Result["+ i +"].Subject"));
			resultItem.setUser(_ctx.stringValue("GetLinkeBahamutAoneinternaldefectsResponse.Result["+ i +"].User"));

			result.add(resultItem);
		}
		getLinkeBahamutAoneinternaldefectsResponse.setResult(result);
	 
	 	return getLinkeBahamutAoneinternaldefectsResponse;
	}
}