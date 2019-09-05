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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.GetInstanceResponse;
import com.aliyuncs.ccc.model.v20170705.GetInstanceResponse.Instance;
import com.aliyuncs.ccc.model.v20170705.GetInstanceResponse.Instance.PhoneNumber;
import com.aliyuncs.ccc.model.v20170705.GetInstanceResponse.Instance.User;
import com.aliyuncs.ccc.model.v20170705.GetInstanceResponse.Instance.User.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));
		getInstanceResponse.setSuccess(_ctx.booleanValue("GetInstanceResponse.Success"));
		getInstanceResponse.setCode(_ctx.stringValue("GetInstanceResponse.Code"));
		getInstanceResponse.setMessage(_ctx.stringValue("GetInstanceResponse.Message"));
		getInstanceResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(_ctx.stringValue("GetInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(_ctx.stringValue("GetInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(_ctx.stringValue("GetInstanceResponse.Instance.InstanceDescription"));
		instance.setDomainName(_ctx.stringValue("GetInstanceResponse.Instance.DomainName"));
		instance.setConsoleUrl(_ctx.stringValue("GetInstanceResponse.Instance.ConsoleUrl"));
		instance.setStorageBucket(_ctx.stringValue("GetInstanceResponse.Instance.StorageBucket"));
		instance.setStorageMaxDays(_ctx.integerValue("GetInstanceResponse.Instance.StorageMaxDays"));
		instance.setStorageMaxSize(_ctx.integerValue("GetInstanceResponse.Instance.StorageMaxSize"));
		instance.setMaxOnlineAgents(_ctx.integerValue("GetInstanceResponse.Instance.MaxOnlineAgents"));
		instance.setTenantId(_ctx.stringValue("GetInstanceResponse.Instance.TenantId"));
		instance.setDirectoryId(_ctx.stringValue("GetInstanceResponse.Instance.DirectoryId"));
		instance.setStatus(_ctx.stringValue("GetInstanceResponse.Instance.Status"));
		instance.setCreatedTime(_ctx.longValue("GetInstanceResponse.Instance.CreatedTime"));
		instance.setOwner(_ctx.stringValue("GetInstanceResponse.Instance.Owner"));

		List<User> admin = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Instance.Admin.Length"); i++) {
			User user = new User();
			user.setUserId(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].UserId"));
			user.setRamId(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].RamId"));
			user.setInstanceId(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].InstanceId"));

			Detail detail = new Detail();
			detail.setLoginName(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.LoginName"));
			detail.setDisplayName(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.DisplayName"));
			detail.setPhone(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.Phone"));
			detail.setEmail(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.Email"));
			detail.setDepartment(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.Department"));
			user.setDetail(detail);

			admin.add(user);
		}
		instance.setAdmin(admin);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Instance.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(_ctx.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(_ctx.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(_ctx.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(_ctx.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(_ctx.booleanValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(_ctx.integerValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(_ctx.booleanValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(_ctx.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(_ctx.integerValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		instance.setPhoneNumbers(phoneNumbers);
		getInstanceResponse.setInstance(instance);
	 
	 	return getInstanceResponse;
	}
}