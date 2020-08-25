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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminproductidaddmenuResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminproductidaddmenuResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdminproductidaddmenuResponseUnmarshaller {

	public static AddLinkeBahamutAdminproductidaddmenuResponse unmarshall(AddLinkeBahamutAdminproductidaddmenuResponse addLinkeBahamutAdminproductidaddmenuResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdminproductidaddmenuResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.RequestId"));
		addLinkeBahamutAdminproductidaddmenuResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.ResultCode"));
		addLinkeBahamutAdminproductidaddmenuResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.ResultMessage"));
		addLinkeBahamutAdminproductidaddmenuResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.ErrorMessage"));
		addLinkeBahamutAdminproductidaddmenuResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdminproductidaddmenuResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.Message"));
		addLinkeBahamutAdminproductidaddmenuResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdminproductidaddmenuResponse.ResponseStatusCode"));
		addLinkeBahamutAdminproductidaddmenuResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdminproductidaddmenuResponse.Success"));

		Result result = new Result();
		result.setCat(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Cat"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Deleted"));
		result.setDisplayName(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.DisplayName"));
		result.setFixed(_ctx.booleanValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Fixed"));
		result.setIcon(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Icon"));
		result.setIconTheme(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.IconTheme"));
		result.setId(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Name"));
		result.setOpenBlank(_ctx.booleanValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.OpenBlank"));
		result.setShow(_ctx.booleanValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Show"));
		result.setSort(_ctx.longValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Sort"));
		result.setUrl(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Url"));

		List<String> menus = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Menus.Length"); i++) {
			menus.add(_ctx.stringValue("AddLinkeBahamutAdminproductidaddmenuResponse.Result.Menus["+ i +"]"));
		}
		result.setMenus(menus);
		addLinkeBahamutAdminproductidaddmenuResponse.setResult(result);
	 
	 	return addLinkeBahamutAdminproductidaddmenuResponse;
	}
}