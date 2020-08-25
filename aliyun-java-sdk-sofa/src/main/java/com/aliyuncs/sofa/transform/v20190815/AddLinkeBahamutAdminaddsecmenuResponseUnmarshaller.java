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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminaddsecmenuResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminaddsecmenuResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdminaddsecmenuResponseUnmarshaller {

	public static AddLinkeBahamutAdminaddsecmenuResponse unmarshall(AddLinkeBahamutAdminaddsecmenuResponse addLinkeBahamutAdminaddsecmenuResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdminaddsecmenuResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.RequestId"));
		addLinkeBahamutAdminaddsecmenuResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.ResultCode"));
		addLinkeBahamutAdminaddsecmenuResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.ResultMessage"));
		addLinkeBahamutAdminaddsecmenuResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.ErrorMessage"));
		addLinkeBahamutAdminaddsecmenuResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdminaddsecmenuResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.Message"));
		addLinkeBahamutAdminaddsecmenuResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdminaddsecmenuResponse.ResponseStatusCode"));
		addLinkeBahamutAdminaddsecmenuResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdminaddsecmenuResponse.Success"));

		Result result = new Result();
		result.setCreated(_ctx.longValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.Deleted"));
		result.setIcon(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.Icon"));
		result.setId(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.Name"));
		result.setNameEn(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.NameEn"));
		result.setParentMenuId(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.ParentMenuId"));
		result.setUrl(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.Url"));

		List<String> children = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.Children.Length"); i++) {
			children.add(_ctx.stringValue("AddLinkeBahamutAdminaddsecmenuResponse.Result.Children["+ i +"]"));
		}
		result.setChildren(children);
		addLinkeBahamutAdminaddsecmenuResponse.setResult(result);
	 
	 	return addLinkeBahamutAdminaddsecmenuResponse;
	}
}