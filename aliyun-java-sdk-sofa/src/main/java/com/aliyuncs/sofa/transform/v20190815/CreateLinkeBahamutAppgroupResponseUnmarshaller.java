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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutAppgroupResponse;
import com.aliyuncs.sofa.model.v20190815.CreateLinkeBahamutAppgroupResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeBahamutAppgroupResponseUnmarshaller {

	public static CreateLinkeBahamutAppgroupResponse unmarshall(CreateLinkeBahamutAppgroupResponse createLinkeBahamutAppgroupResponse, UnmarshallerContext _ctx) {
		
		createLinkeBahamutAppgroupResponse.setRequestId(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.RequestId"));
		createLinkeBahamutAppgroupResponse.setResultCode(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.ResultCode"));
		createLinkeBahamutAppgroupResponse.setResultMessage(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.ResultMessage"));
		createLinkeBahamutAppgroupResponse.setErrorMessage(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.ErrorMessage"));
		createLinkeBahamutAppgroupResponse.setErrorMsgParamsMap(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.ErrorMsgParamsMap"));
		createLinkeBahamutAppgroupResponse.setMessage(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.Message"));
		createLinkeBahamutAppgroupResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeBahamutAppgroupResponse.ResponseStatusCode"));
		createLinkeBahamutAppgroupResponse.setSuccess(_ctx.booleanValue("CreateLinkeBahamutAppgroupResponse.Success"));

		Result result = new Result();
		result.setCreated(_ctx.longValue("CreateLinkeBahamutAppgroupResponse.Result.Created"));
		result.setCreator(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.Result.Creator"));
		result.setDeleted(_ctx.booleanValue("CreateLinkeBahamutAppgroupResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("CreateLinkeBahamutAppgroupResponse.Result.LastModified"));
		result.setModifiyUser(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.Result.ModifiyUser"));
		result.setName(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.Result.Name"));
		result.setRemark(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.Result.Remark"));
		result.setTenant(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.Result.Tenant"));
		result.setType(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.Result.Type"));

		List<String> admins = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppgroupResponse.Result.Admins.Length"); i++) {
			admins.add(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.Result.Admins["+ i +"]"));
		}
		result.setAdmins(admins);

		List<String> appList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateLinkeBahamutAppgroupResponse.Result.AppList.Length"); i++) {
			appList.add(_ctx.stringValue("CreateLinkeBahamutAppgroupResponse.Result.AppList["+ i +"]"));
		}
		result.setAppList(appList);
		createLinkeBahamutAppgroupResponse.setResult(result);
	 
	 	return createLinkeBahamutAppgroupResponse;
	}
}