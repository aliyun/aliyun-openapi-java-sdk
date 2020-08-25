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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAppgroupResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAppgroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAppgroupResponseUnmarshaller {

	public static UpdateLinkeBahamutAppgroupResponse unmarshall(UpdateLinkeBahamutAppgroupResponse updateLinkeBahamutAppgroupResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAppgroupResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.RequestId"));
		updateLinkeBahamutAppgroupResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.ResultCode"));
		updateLinkeBahamutAppgroupResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.ResultMessage"));
		updateLinkeBahamutAppgroupResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.ErrorMessage"));
		updateLinkeBahamutAppgroupResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAppgroupResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.Message"));
		updateLinkeBahamutAppgroupResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAppgroupResponse.ResponseStatusCode"));
		updateLinkeBahamutAppgroupResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAppgroupResponse.Success"));

		Result result = new Result();
		result.setCreated(_ctx.longValue("UpdateLinkeBahamutAppgroupResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.Result.Creator"));
		result.setDeleted(_ctx.booleanValue("UpdateLinkeBahamutAppgroupResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("UpdateLinkeBahamutAppgroupResponse.Result.LastModified"));
		result.setModifiyUser(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.Result.ModifiyUser"));
		result.setName(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.Result.Name"));
		result.setRemark(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.Result.Remark"));
		result.setTenant(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.Result.Tenant"));
		result.setType(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.Result.Type"));

		List<String> admins = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppgroupResponse.Result.Admins.Length"); i++) {
			admins.add(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.Result.Admins["+ i +"]"));
		}
		result.setAdmins(admins);

		List<String> appList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAppgroupResponse.Result.AppList.Length"); i++) {
			appList.add(_ctx.stringValue("UpdateLinkeBahamutAppgroupResponse.Result.AppList["+ i +"]"));
		}
		result.setAppList(appList);
		updateLinkeBahamutAppgroupResponse.setResult(result);
	 
	 	return updateLinkeBahamutAppgroupResponse;
	}
}