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

package com.aliyuncs.unimkt.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.ListUserResponse;
import com.aliyuncs.unimkt.model.v20181212.ListUserResponse.SspUserDTOModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserResponseUnmarshaller {

	public static ListUserResponse unmarshall(ListUserResponse listUserResponse, UnmarshallerContext _ctx) {
		
		listUserResponse.setRequestId(_ctx.stringValue("ListUserResponse.RequestId"));
		listUserResponse.setCode(_ctx.stringValue("ListUserResponse.Code"));
		listUserResponse.setSuccess(_ctx.booleanValue("ListUserResponse.Success"));
		listUserResponse.setMessage(_ctx.stringValue("ListUserResponse.Message"));
		listUserResponse.setTotal(_ctx.longValue("ListUserResponse.Total"));
		listUserResponse.setPageNumber(_ctx.integerValue("ListUserResponse.PageNumber"));
		listUserResponse.setPageSize(_ctx.integerValue("ListUserResponse.PageSize"));

		List<SspUserDTOModel> model = new ArrayList<SspUserDTOModel>();
		for (int i = 0; i < _ctx.lengthValue("ListUserResponse.Model.Length"); i++) {
			SspUserDTOModel sspUserDTOModel = new SspUserDTOModel();
			sspUserDTOModel.setSspUserId(_ctx.stringValue("ListUserResponse.Model["+ i +"].SspUserId"));
			sspUserDTOModel.setGmtCreateTime(_ctx.longValue("ListUserResponse.Model["+ i +"].GmtCreateTime"));
			sspUserDTOModel.setGmtModifiedTime(_ctx.longValue("ListUserResponse.Model["+ i +"].GmtModifiedTime"));
			sspUserDTOModel.setIsDeleteTag(_ctx.stringValue("ListUserResponse.Model["+ i +"].IsDeleteTag"));
			sspUserDTOModel.setUserName(_ctx.stringValue("ListUserResponse.Model["+ i +"].UserName"));
			sspUserDTOModel.setYunUid(_ctx.stringValue("ListUserResponse.Model["+ i +"].YunUid"));
			sspUserDTOModel.setYunPersonsId(_ctx.stringValue("ListUserResponse.Model["+ i +"].YunPersonsId"));
			sspUserDTOModel.setMobilePhone(_ctx.stringValue("ListUserResponse.Model["+ i +"].MobilePhone"));
			sspUserDTOModel.setEmail(_ctx.stringValue("ListUserResponse.Model["+ i +"].Email"));
			sspUserDTOModel.setStatus(_ctx.stringValue("ListUserResponse.Model["+ i +"].Status"));
			sspUserDTOModel.setTenantId(_ctx.stringValue("ListUserResponse.Model["+ i +"].TenantId"));
			sspUserDTOModel.setTenantUserId(_ctx.stringValue("ListUserResponse.Model["+ i +"].TenantUserId"));
			sspUserDTOModel.setRoleCode(_ctx.stringValue("ListUserResponse.Model["+ i +"].RoleCode"));

			model.add(sspUserDTOModel);
		}
		listUserResponse.setModel(model);
	 
	 	return listUserResponse;
	}
}