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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminupdateproductResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminupdateproductResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAdminupdateproductResponseUnmarshaller {

	public static UpdateLinkeBahamutAdminupdateproductResponse unmarshall(UpdateLinkeBahamutAdminupdateproductResponse updateLinkeBahamutAdminupdateproductResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAdminupdateproductResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.RequestId"));
		updateLinkeBahamutAdminupdateproductResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.ResultCode"));
		updateLinkeBahamutAdminupdateproductResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.ResultMessage"));
		updateLinkeBahamutAdminupdateproductResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.ErrorMessage"));
		updateLinkeBahamutAdminupdateproductResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAdminupdateproductResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.Message"));
		updateLinkeBahamutAdminupdateproductResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAdminupdateproductResponse.ResponseStatusCode"));
		updateLinkeBahamutAdminupdateproductResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAdminupdateproductResponse.Success"));

		Result result = new Result();
		result.setCat(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Cat"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Deleted"));
		result.setDisplayName(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.DisplayName"));
		result.setFixed(_ctx.booleanValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Fixed"));
		result.setIcon(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Icon"));
		result.setIconTheme(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.IconTheme"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Name"));
		result.setOpenBlank(_ctx.booleanValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.OpenBlank"));
		result.setShow(_ctx.booleanValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Show"));
		result.setSort(_ctx.longValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Sort"));
		result.setUrl(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Url"));

		List<String> menus = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Menus.Length"); i++) {
			menus.add(_ctx.stringValue("UpdateLinkeBahamutAdminupdateproductResponse.Result.Menus["+ i +"]"));
		}
		result.setMenus(menus);
		updateLinkeBahamutAdminupdateproductResponse.setResult(result);
	 
	 	return updateLinkeBahamutAdminupdateproductResponse;
	}
}