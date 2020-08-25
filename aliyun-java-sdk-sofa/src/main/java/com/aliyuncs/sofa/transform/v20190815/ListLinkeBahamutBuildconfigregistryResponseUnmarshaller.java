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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutBuildconfigregistryResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutBuildconfigregistryResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutBuildconfigregistryResponseUnmarshaller {

	public static ListLinkeBahamutBuildconfigregistryResponse unmarshall(ListLinkeBahamutBuildconfigregistryResponse listLinkeBahamutBuildconfigregistryResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutBuildconfigregistryResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutBuildconfigregistryResponse.RequestId"));
		listLinkeBahamutBuildconfigregistryResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutBuildconfigregistryResponse.ResultCode"));
		listLinkeBahamutBuildconfigregistryResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutBuildconfigregistryResponse.ResultMessage"));
		listLinkeBahamutBuildconfigregistryResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutBuildconfigregistryResponse.ErrorMessage"));
		listLinkeBahamutBuildconfigregistryResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutBuildconfigregistryResponse.ErrorMsgParamsMap"));
		listLinkeBahamutBuildconfigregistryResponse.setMessage(_ctx.stringValue("ListLinkeBahamutBuildconfigregistryResponse.Message"));
		listLinkeBahamutBuildconfigregistryResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutBuildconfigregistryResponse.ResponseStatusCode"));
		listLinkeBahamutBuildconfigregistryResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutBuildconfigregistryResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutBuildconfigregistryResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setHost(_ctx.stringValue("ListLinkeBahamutBuildconfigregistryResponse.Result["+ i +"].Host"));
			resultItem.setToken(_ctx.stringValue("ListLinkeBahamutBuildconfigregistryResponse.Result["+ i +"].Token"));
			resultItem.setUser(_ctx.stringValue("ListLinkeBahamutBuildconfigregistryResponse.Result["+ i +"].User"));

			List<String> secretKeys = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListLinkeBahamutBuildconfigregistryResponse.Result["+ i +"].SecretKeys.Length"); j++) {
				secretKeys.add(_ctx.stringValue("ListLinkeBahamutBuildconfigregistryResponse.Result["+ i +"].SecretKeys["+ j +"]"));
			}
			resultItem.setSecretKeys(secretKeys);

			result.add(resultItem);
		}
		listLinkeBahamutBuildconfigregistryResponse.setResult(result);
	 
	 	return listLinkeBahamutBuildconfigregistryResponse;
	}
}