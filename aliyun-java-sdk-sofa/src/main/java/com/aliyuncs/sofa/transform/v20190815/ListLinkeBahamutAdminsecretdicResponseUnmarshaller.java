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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAdminsecretdicResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAdminsecretdicResponse.ResultItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutAdminsecretdicResponseUnmarshaller {

	public static ListLinkeBahamutAdminsecretdicResponse unmarshall(ListLinkeBahamutAdminsecretdicResponse listLinkeBahamutAdminsecretdicResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutAdminsecretdicResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.RequestId"));
		listLinkeBahamutAdminsecretdicResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.ResultCode"));
		listLinkeBahamutAdminsecretdicResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.ResultMessage"));
		listLinkeBahamutAdminsecretdicResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.ErrorMessage"));
		listLinkeBahamutAdminsecretdicResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.ErrorMsgParamsMap"));
		listLinkeBahamutAdminsecretdicResponse.setMessage(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.Message"));
		listLinkeBahamutAdminsecretdicResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutAdminsecretdicResponse.ResponseStatusCode"));
		listLinkeBahamutAdminsecretdicResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutAdminsecretdicResponse.Success"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutAdminsecretdicResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setDescription(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.Result["+ i +"].Description"));
			resultItem.setId(_ctx.longValue("ListLinkeBahamutAdminsecretdicResponse.Result["+ i +"].Id"));
			resultItem.setName(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.Result["+ i +"].Name"));
			resultItem.setNamespace(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.Result["+ i +"].Namespace"));
			resultItem.setType(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.Result["+ i +"].Type"));
			resultItem.setUniqueKey(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.Result["+ i +"].UniqueKey"));
			resultItem.setValue(_ctx.stringValue("ListLinkeBahamutAdminsecretdicResponse.Result["+ i +"].Value"));

			result.add(resultItem);
		}
		listLinkeBahamutAdminsecretdicResponse.setResult(result);
	 
	 	return listLinkeBahamutAdminsecretdicResponse;
	}
}