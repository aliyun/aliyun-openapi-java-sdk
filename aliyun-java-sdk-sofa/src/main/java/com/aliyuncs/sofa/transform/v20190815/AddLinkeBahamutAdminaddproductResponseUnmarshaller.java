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

import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminaddproductResponse;
import com.aliyuncs.sofa.model.v20190815.AddLinkeBahamutAdminaddproductResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddLinkeBahamutAdminaddproductResponseUnmarshaller {

	public static AddLinkeBahamutAdminaddproductResponse unmarshall(AddLinkeBahamutAdminaddproductResponse addLinkeBahamutAdminaddproductResponse, UnmarshallerContext _ctx) {
		
		addLinkeBahamutAdminaddproductResponse.setRequestId(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.RequestId"));
		addLinkeBahamutAdminaddproductResponse.setResultCode(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.ResultCode"));
		addLinkeBahamutAdminaddproductResponse.setResultMessage(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.ResultMessage"));
		addLinkeBahamutAdminaddproductResponse.setErrorMessage(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.ErrorMessage"));
		addLinkeBahamutAdminaddproductResponse.setErrorMsgParamsMap(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.ErrorMsgParamsMap"));
		addLinkeBahamutAdminaddproductResponse.setMessage(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.Message"));
		addLinkeBahamutAdminaddproductResponse.setResponseStatusCode(_ctx.longValue("AddLinkeBahamutAdminaddproductResponse.ResponseStatusCode"));
		addLinkeBahamutAdminaddproductResponse.setSuccess(_ctx.booleanValue("AddLinkeBahamutAdminaddproductResponse.Success"));

		Result result = new Result();
		result.setCat(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.Result.Cat"));
		result.setCreated(_ctx.longValue("AddLinkeBahamutAdminaddproductResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("AddLinkeBahamutAdminaddproductResponse.Result.Deleted"));
		result.setDisplayName(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.Result.DisplayName"));
		result.setFixed(_ctx.booleanValue("AddLinkeBahamutAdminaddproductResponse.Result.Fixed"));
		result.setIcon(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.Result.Icon"));
		result.setIconTheme(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.Result.IconTheme"));
		result.setId(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("AddLinkeBahamutAdminaddproductResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.Result.Name"));
		result.setOpenBlank(_ctx.booleanValue("AddLinkeBahamutAdminaddproductResponse.Result.OpenBlank"));
		result.setShow(_ctx.booleanValue("AddLinkeBahamutAdminaddproductResponse.Result.Show"));
		result.setSort(_ctx.longValue("AddLinkeBahamutAdminaddproductResponse.Result.Sort"));
		result.setUrl(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.Result.Url"));

		List<String> menus = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("AddLinkeBahamutAdminaddproductResponse.Result.Menus.Length"); i++) {
			menus.add(_ctx.stringValue("AddLinkeBahamutAdminaddproductResponse.Result.Menus["+ i +"]"));
		}
		result.setMenus(menus);
		addLinkeBahamutAdminaddproductResponse.setResult(result);
	 
	 	return addLinkeBahamutAdminaddproductResponse;
	}
}