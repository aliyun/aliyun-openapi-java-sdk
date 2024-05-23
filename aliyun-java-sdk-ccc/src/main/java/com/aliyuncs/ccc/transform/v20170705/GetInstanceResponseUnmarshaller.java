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
		getInstanceResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceResponse.HttpStatusCode"));
		getInstanceResponse.setCode(_ctx.stringValue("GetInstanceResponse.Code"));
		getInstanceResponse.setMessage(_ctx.stringValue("GetInstanceResponse.Message"));
		getInstanceResponse.setSuccess(_ctx.booleanValue("GetInstanceResponse.Success"));

		Instance instance = new Instance();
		instance.setStatus(_ctx.stringValue("GetInstanceResponse.Instance.Status"));
		instance.setOwner(_ctx.stringValue("GetInstanceResponse.Instance.Owner"));
		instance.setStorageMaxDays(_ctx.integerValue("GetInstanceResponse.Instance.StorageMaxDays"));
		instance.setStorageMaxSize(_ctx.integerValue("GetInstanceResponse.Instance.StorageMaxSize"));
		instance.setMaxOnlineAgents(_ctx.integerValue("GetInstanceResponse.Instance.MaxOnlineAgents"));
		instance.setInstanceId(_ctx.stringValue("GetInstanceResponse.Instance.InstanceId"));
		instance.setInstanceDescription(_ctx.stringValue("GetInstanceResponse.Instance.InstanceDescription"));
		instance.setDomainName(_ctx.stringValue("GetInstanceResponse.Instance.DomainName"));
		instance.setConsoleUrl(_ctx.stringValue("GetInstanceResponse.Instance.ConsoleUrl"));
		instance.setInstanceName(_ctx.stringValue("GetInstanceResponse.Instance.InstanceName"));
		instance.setStorageBucket(_ctx.stringValue("GetInstanceResponse.Instance.StorageBucket"));
		instance.setCreatedTime(_ctx.longValue("GetInstanceResponse.Instance.CreatedTime"));
		instance.setDirectoryId(_ctx.stringValue("GetInstanceResponse.Instance.DirectoryId"));
		instance.setTenantId(_ctx.stringValue("GetInstanceResponse.Instance.TenantId"));

		List<User> admin = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Instance.Admin.Length"); i++) {
			User user = new User();
			user.setInstanceId(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].InstanceId"));
			user.setRamId(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].RamId"));
			user.setUserId(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].UserId"));

			Detail detail = new Detail();
			detail.setDisplayName(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.DisplayName"));
			detail.setEmail(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.Email"));
			detail.setLoginName(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.LoginName"));
			detail.setDepartment(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.Department"));
			detail.setPhone(_ctx.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.Phone"));
			user.setDetail(detail);

			admin.add(user);
		}
		instance.setAdmin(admin);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Instance.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setTestOnly(_ctx.booleanValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setTrunks(_ctx.integerValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].Trunks"));
			phoneNumber.setRemainingTime(_ctx.integerValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setNumber(_ctx.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setInstanceId(_ctx.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setUsage(_ctx.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setAllowOutbound(_ctx.booleanValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setPhoneNumberDescription(_ctx.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setPhoneNumberId(_ctx.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberId"));

			phoneNumbers.add(phoneNumber);
		}
		instance.setPhoneNumbers(phoneNumbers);
		getInstanceResponse.setInstance(instance);
	 
	 	return getInstanceResponse;
	}
}