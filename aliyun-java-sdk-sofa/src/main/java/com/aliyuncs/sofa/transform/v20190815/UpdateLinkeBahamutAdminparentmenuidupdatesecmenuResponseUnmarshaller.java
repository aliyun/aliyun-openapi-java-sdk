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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponseUnmarshaller {

	public static UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse unmarshall(UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.RequestId"));
		updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.ResultCode"));
		updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.ResultMessage"));
		updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.ErrorMessage"));
		updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Message"));
		updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.ResponseStatusCode"));
		updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Success"));

		Result result = new Result();
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.Deleted"));
		result.setIcon(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.Icon"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.LastModified"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.Name"));
		result.setNameEn(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.NameEn"));
		result.setParentMenuId(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.ParentMenuId"));
		result.setUrl(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.Url"));

		List<String> children = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.Children.Length"); i++) {
			children.add(_ctx.stringValue("UpdateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.Result.Children["+ i +"]"));
		}
		result.setChildren(children);
		updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse.setResult(result);
	 
	 	return updateLinkeBahamutAdminparentmenuidupdatesecmenuResponse;
	}
}