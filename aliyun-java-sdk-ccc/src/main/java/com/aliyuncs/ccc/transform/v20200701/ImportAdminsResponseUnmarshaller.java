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

import com.aliyuncs.ccc.model.v20200701.ImportAdminsResponse;
import com.aliyuncs.ccc.model.v20200701.ImportAdminsResponse.User;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportAdminsResponseUnmarshaller {

	public static ImportAdminsResponse unmarshall(ImportAdminsResponse importAdminsResponse, UnmarshallerContext _ctx) {
		
		importAdminsResponse.setRequestId(_ctx.stringValue("ImportAdminsResponse.RequestId"));
		importAdminsResponse.setHttpStatusCode(_ctx.integerValue("ImportAdminsResponse.HttpStatusCode"));
		importAdminsResponse.setCode(_ctx.stringValue("ImportAdminsResponse.Code"));
		importAdminsResponse.setMessage(_ctx.stringValue("ImportAdminsResponse.Message"));

		List<User> data = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("ImportAdminsResponse.Data.Length"); i++) {
			User user = new User();
			user.setInstanceId(_ctx.stringValue("ImportAdminsResponse.Data["+ i +"].InstanceId"));
			user.setUserId(_ctx.stringValue("ImportAdminsResponse.Data["+ i +"].UserId"));
			user.setRoleId(_ctx.stringValue("ImportAdminsResponse.Data["+ i +"].RoleId"));
			user.setExtension(_ctx.stringValue("ImportAdminsResponse.Data["+ i +"].Extension"));
			user.setRamId(_ctx.stringValue("ImportAdminsResponse.Data["+ i +"].RamId"));

			data.add(user);
		}
		importAdminsResponse.setData(data);
	 
	 	return importAdminsResponse;
	}
}