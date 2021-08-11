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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListInstancesResponse;
import com.aliyuncs.ccc.model.v20200701.ListInstancesResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListInstancesResponse.Data.CallCenterInstance;
import com.aliyuncs.ccc.model.v20200701.ListInstancesResponse.Data.CallCenterInstance.PhoneNumber;
import com.aliyuncs.ccc.model.v20200701.ListInstancesResponse.Data.CallCenterInstance.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setCode(_ctx.stringValue("ListInstancesResponse.Code"));
		listInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListInstancesResponse.HttpStatusCode"));
		listInstancesResponse.setMessage(_ctx.stringValue("ListInstancesResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListInstancesResponse.Params["+ i +"]"));
		}
		listInstancesResponse.setParams(params);

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListInstancesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListInstancesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListInstancesResponse.Data.TotalCount"));

		List<CallCenterInstance> list = new ArrayList<CallCenterInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Data.List.Length"); i++) {
			CallCenterInstance callCenterInstance = new CallCenterInstance();
			callCenterInstance.setAliyunUid(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AliyunUid"));
			callCenterInstance.setConsoleUrl(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].ConsoleUrl"));
			callCenterInstance.setCreateTime(_ctx.longValue("ListInstancesResponse.Data.List["+ i +"].CreateTime"));
			callCenterInstance.setDescription(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].Description"));
			callCenterInstance.setDomainName(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].DomainName"));
			callCenterInstance.setId(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].Id"));
			callCenterInstance.setName(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].Name"));
			callCenterInstance.setStatus(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].Status"));

			List<User> adminList = new ArrayList<User>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Data.List["+ i +"].AdminList.Length"); j++) {
				User user = new User();
				user.setDisplayName(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AdminList["+ j +"].DisplayName"));
				user.setEmail(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AdminList["+ j +"].Email"));
				user.setExtension(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AdminList["+ j +"].Extension"));
				user.setInstanceId(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AdminList["+ j +"].InstanceId"));
				user.setLoginName(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AdminList["+ j +"].LoginName"));
				user.setMobile(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AdminList["+ j +"].Mobile"));
				user.setRoleId(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AdminList["+ j +"].RoleId"));
				user.setRoleName(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AdminList["+ j +"].RoleName"));
				user.setUserId(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AdminList["+ j +"].UserId"));
				user.setWorkMode(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].AdminList["+ j +"].WorkMode"));

				adminList.add(user);
			}
			callCenterInstance.setAdminList(adminList);

			List<PhoneNumber> numberList = new ArrayList<PhoneNumber>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Data.List["+ i +"].NumberList.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setNumber(_ctx.stringValue("ListInstancesResponse.Data.List["+ i +"].NumberList["+ j +"].Number"));

				numberList.add(phoneNumber);
			}
			callCenterInstance.setNumberList(numberList);

			list.add(callCenterInstance);
		}
		data.setList(list);
		listInstancesResponse.setData(data);
	 
	 	return listInstancesResponse;
	}
}