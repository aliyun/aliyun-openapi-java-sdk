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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutAppgroupResponse;
import com.aliyuncs.sofa.model.v20190815.DeleteLinkeBahamutAppgroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeBahamutAppgroupResponseUnmarshaller {

	public static DeleteLinkeBahamutAppgroupResponse unmarshall(DeleteLinkeBahamutAppgroupResponse deleteLinkeBahamutAppgroupResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeBahamutAppgroupResponse.setRequestId(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.RequestId"));
		deleteLinkeBahamutAppgroupResponse.setResultCode(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.ResultCode"));
		deleteLinkeBahamutAppgroupResponse.setResultMessage(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.ResultMessage"));
		deleteLinkeBahamutAppgroupResponse.setErrorMessage(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.ErrorMessage"));
		deleteLinkeBahamutAppgroupResponse.setErrorMsgParamsMap(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.ErrorMsgParamsMap"));
		deleteLinkeBahamutAppgroupResponse.setMessage(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.Message"));
		deleteLinkeBahamutAppgroupResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeBahamutAppgroupResponse.ResponseStatusCode"));
		deleteLinkeBahamutAppgroupResponse.setSuccess(_ctx.booleanValue("DeleteLinkeBahamutAppgroupResponse.Success"));

		Result result = new Result();
		result.setCreated(_ctx.longValue("DeleteLinkeBahamutAppgroupResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.Result.Creator"));
		result.setDeleted(_ctx.booleanValue("DeleteLinkeBahamutAppgroupResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("DeleteLinkeBahamutAppgroupResponse.Result.LastModified"));
		result.setModifiyUser(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.Result.ModifiyUser"));
		result.setName(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.Result.Name"));
		result.setRemark(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.Result.Remark"));
		result.setTenant(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.Result.Tenant"));
		result.setType(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.Result.Type"));

		List<String> admins = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppgroupResponse.Result.Admins.Length"); i++) {
			admins.add(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.Result.Admins["+ i +"]"));
		}
		result.setAdmins(admins);

		List<String> appList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DeleteLinkeBahamutAppgroupResponse.Result.AppList.Length"); i++) {
			appList.add(_ctx.stringValue("DeleteLinkeBahamutAppgroupResponse.Result.AppList["+ i +"]"));
		}
		result.setAppList(appList);
		deleteLinkeBahamutAppgroupResponse.setResult(result);
	 
	 	return deleteLinkeBahamutAppgroupResponse;
	}
}