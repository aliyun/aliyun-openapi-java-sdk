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

import com.aliyuncs.sofa.model.v20190815.ListLinkeBahamutAppdatalistmetatenantidResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeBahamutAppdatalistmetatenantidResponseUnmarshaller {

	public static ListLinkeBahamutAppdatalistmetatenantidResponse unmarshall(ListLinkeBahamutAppdatalistmetatenantidResponse listLinkeBahamutAppdatalistmetatenantidResponse, UnmarshallerContext _ctx) {
		
		listLinkeBahamutAppdatalistmetatenantidResponse.setRequestId(_ctx.stringValue("ListLinkeBahamutAppdatalistmetatenantidResponse.RequestId"));
		listLinkeBahamutAppdatalistmetatenantidResponse.setResultCode(_ctx.stringValue("ListLinkeBahamutAppdatalistmetatenantidResponse.ResultCode"));
		listLinkeBahamutAppdatalistmetatenantidResponse.setResultMessage(_ctx.stringValue("ListLinkeBahamutAppdatalistmetatenantidResponse.ResultMessage"));
		listLinkeBahamutAppdatalistmetatenantidResponse.setErrorMessage(_ctx.stringValue("ListLinkeBahamutAppdatalistmetatenantidResponse.ErrorMessage"));
		listLinkeBahamutAppdatalistmetatenantidResponse.setErrorMsgParamsMap(_ctx.stringValue("ListLinkeBahamutAppdatalistmetatenantidResponse.ErrorMsgParamsMap"));
		listLinkeBahamutAppdatalistmetatenantidResponse.setMessage(_ctx.stringValue("ListLinkeBahamutAppdatalistmetatenantidResponse.Message"));
		listLinkeBahamutAppdatalistmetatenantidResponse.setResponseStatusCode(_ctx.longValue("ListLinkeBahamutAppdatalistmetatenantidResponse.ResponseStatusCode"));
		listLinkeBahamutAppdatalistmetatenantidResponse.setSuccess(_ctx.booleanValue("ListLinkeBahamutAppdatalistmetatenantidResponse.Success"));

		List<String> result = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeBahamutAppdatalistmetatenantidResponse.Result.Length"); i++) {
			result.add(_ctx.stringValue("ListLinkeBahamutAppdatalistmetatenantidResponse.Result["+ i +"]"));
		}
		listLinkeBahamutAppdatalistmetatenantidResponse.setResult(result);
	 
	 	return listLinkeBahamutAppdatalistmetatenantidResponse;
	}
}