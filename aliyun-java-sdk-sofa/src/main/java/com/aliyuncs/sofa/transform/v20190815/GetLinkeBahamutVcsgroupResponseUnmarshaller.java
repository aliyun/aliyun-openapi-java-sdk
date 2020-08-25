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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsgroupResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutVcsgroupResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutVcsgroupResponseUnmarshaller {

	public static GetLinkeBahamutVcsgroupResponse unmarshall(GetLinkeBahamutVcsgroupResponse getLinkeBahamutVcsgroupResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutVcsgroupResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutVcsgroupResponse.RequestId"));
		getLinkeBahamutVcsgroupResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutVcsgroupResponse.ResultCode"));
		getLinkeBahamutVcsgroupResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutVcsgroupResponse.ResultMessage"));
		getLinkeBahamutVcsgroupResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutVcsgroupResponse.ErrorMessage"));
		getLinkeBahamutVcsgroupResponse.setErrorMsgParamsMap(_ctx.stringValue("GetLinkeBahamutVcsgroupResponse.ErrorMsgParamsMap"));
		getLinkeBahamutVcsgroupResponse.setMessage(_ctx.stringValue("GetLinkeBahamutVcsgroupResponse.Message"));
		getLinkeBahamutVcsgroupResponse.setResponseStatusCode(_ctx.longValue("GetLinkeBahamutVcsgroupResponse.ResponseStatusCode"));
		getLinkeBahamutVcsgroupResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutVcsgroupResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutVcsgroupResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("GetLinkeBahamutVcsgroupResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.stringValue("GetLinkeBahamutVcsgroupResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("GetLinkeBahamutVcsgroupResponse.Result["+ i +"].Name"));
			resultItem.setPath(_ctx.stringValue("GetLinkeBahamutVcsgroupResponse.Result["+ i +"].Path"));

			result.add(resultItem);
		}
		getLinkeBahamutVcsgroupResponse.setResult(result);
	 
	 	return getLinkeBahamutVcsgroupResponse;
	}
}