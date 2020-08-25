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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutSamecodereporecommendResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutSamecodereporecommendResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutSamecodereporecommendResponseUnmarshaller {

	public static GetLinkeBahamutSamecodereporecommendResponse unmarshall(GetLinkeBahamutSamecodereporecommendResponse getLinkeBahamutSamecodereporecommendResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutSamecodereporecommendResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.RequestId"));
		getLinkeBahamutSamecodereporecommendResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.ResultCode"));
		getLinkeBahamutSamecodereporecommendResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.ResultMessage"));
		getLinkeBahamutSamecodereporecommendResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.ErrorMessage"));
		getLinkeBahamutSamecodereporecommendResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.ErrorMsgParamsMap"));
		getLinkeBahamutSamecodereporecommendResponse.setMessage(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.Message"));
		getLinkeBahamutSamecodereporecommendResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutSamecodereporecommendResponse.ResponseStatusCode"));
		getLinkeBahamutSamecodereporecommendResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutSamecodereporecommendResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutSamecodereporecommendResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setAppName(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.Result["+ i +"].AppName"));
			resultItem.setCodeName(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.Result["+ i +"].CodeName"));
			resultItem.setCouldPushStage(_ctx.booleanValue("GetLinkeBahamutSamecodereporecommendResponse.Result["+ i +"].CouldPushStage"));
			resultItem.setCurrentStageName(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.Result["+ i +"].CurrentStageName"));
			resultItem.setUnit(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.Result["+ i +"].Unit"));

			List<String> reason = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetLinkeBahamutSamecodereporecommendResponse.Result["+ i +"].Reason.Length"); j++) {
				reason.add(_ctx.stringValue("GetLinkeBahamutSamecodereporecommendResponse.Result["+ i +"].Reason["+ j +"]"));
			}
			resultItem.setReason(reason);

			result.add(resultItem);
		}
		getLinkeBahamutSamecodereporecommendResponse.setResult(result);
	 
	 	return getLinkeBahamutSamecodereporecommendResponse;
	}
}