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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminproductidupdatemenuResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAdminproductidupdatemenuResponseUnmarshaller {

	public static UpdateLinkeBahamutAdminproductidupdatemenuResponse unmarshall(UpdateLinkeBahamutAdminproductidupdatemenuResponse updateLinkeBahamutAdminproductidupdatemenuResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAdminproductidupdatemenuResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.RequestId"));
		updateLinkeBahamutAdminproductidupdatemenuResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.ResultCode"));
		updateLinkeBahamutAdminproductidupdatemenuResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.ResultMessage"));
		updateLinkeBahamutAdminproductidupdatemenuResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.ErrorMessage"));
		updateLinkeBahamutAdminproductidupdatemenuResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAdminproductidupdatemenuResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Message"));
		updateLinkeBahamutAdminproductidupdatemenuResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.ResponseStatusCode"));
		updateLinkeBahamutAdminproductidupdatemenuResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Success"));

		Result result = new Result();
		result.setCat(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Cat"));
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Deleted"));
		result.setDisplayName(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.DisplayName"));
		result.setFixed(_ctx.booleanValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Fixed"));
		result.setIcon(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Icon"));
		result.setIconTheme(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.IconTheme"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Name"));
		result.setOpenBlank(_ctx.booleanValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.OpenBlank"));
		result.setShow(_ctx.booleanValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Show"));
		result.setSort(_ctx.longValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Sort"));
		result.setUrl(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Url"));

		List<String> menus = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Menus.Length"); i++) {
			menus.add(_ctx.stringValue("UpdateLinkeBahamutAdminproductidupdatemenuResponse.Result.Menus["+ i +"]"));
		}
		result.setMenus(menus);
		updateLinkeBahamutAdminproductidupdatemenuResponse.setResult(result);
	 
	 	return updateLinkeBahamutAdminproductidupdatemenuResponse;
	}
}