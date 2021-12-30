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

import com.aliyuncs.ccc.model.v20170705.CreateInstanceResponse;
import com.aliyuncs.ccc.model.v20170705.CreateInstanceResponse.Instance;
import com.aliyuncs.ccc.model.v20170705.CreateInstanceResponse.Instance.PhoneNumber;
import com.aliyuncs.ccc.model.v20170705.CreateInstanceResponse.Instance.User;
import com.aliyuncs.ccc.model.v20170705.CreateInstanceResponse.Instance.User.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceResponseUnmarshaller {

	public static CreateInstanceResponse unmarshall(CreateInstanceResponse createInstanceResponse, UnmarshallerContext _ctx) {
		
		createInstanceResponse.setRequestId(_ctx.stringValue("CreateInstanceResponse.RequestId"));
		createInstanceResponse.setSuccess(_ctx.booleanValue("CreateInstanceResponse.Success"));
		createInstanceResponse.setCode(_ctx.stringValue("CreateInstanceResponse.Code"));
		createInstanceResponse.setMessage(_ctx.stringValue("CreateInstanceResponse.Message"));
		createInstanceResponse.setHttpStatusCode(_ctx.integerValue("CreateInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(_ctx.stringValue("CreateInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(_ctx.stringValue("CreateInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(_ctx.stringValue("CreateInstanceResponse.Instance.InstanceDescription"));
		instance.setDomainName(_ctx.stringValue("CreateInstanceResponse.Instance.DomainName"));
		instance.setConsoleUrl(_ctx.stringValue("CreateInstanceResponse.Instance.ConsoleUrl"));
		instance.setStorageBucket(_ctx.stringValue("CreateInstanceResponse.Instance.StorageBucket"));
		instance.setStorageMaxDays(_ctx.integerValue("CreateInstanceResponse.Instance.StorageMaxDays"));
		instance.setStorageMaxSize(_ctx.integerValue("CreateInstanceResponse.Instance.StorageMaxSize"));
		instance.setMaxOnlineAgents(_ctx.integerValue("CreateInstanceResponse.Instance.MaxOnlineAgents"));
		instance.setTenantId(_ctx.stringValue("CreateInstanceResponse.Instance.TenantId"));
		instance.setStatus(_ctx.stringValue("CreateInstanceResponse.Instance.Status"));
		instance.setDirectoryId(_ctx.stringValue("CreateInstanceResponse.Instance.DirectoryId"));
		instance.setCreatedTime(_ctx.longValue("CreateInstanceResponse.Instance.CreatedTime"));
		instance.setOwner(_ctx.stringValue("CreateInstanceResponse.Instance.Owner"));

		List<String> successPhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateInstanceResponse.Instance.SuccessPhoneNumbers.Length"); i++) {
			successPhoneNumbers.add(_ctx.stringValue("CreateInstanceResponse.Instance.SuccessPhoneNumbers["+ i +"]"));
		}
		instance.setSuccessPhoneNumbers(successPhoneNumbers);

		List<String> failPhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateInstanceResponse.Instance.FailPhoneNumbers.Length"); i++) {
			failPhoneNumbers.add(_ctx.stringValue("CreateInstanceResponse.Instance.FailPhoneNumbers["+ i +"]"));
		}
		instance.setFailPhoneNumbers(failPhoneNumbers);

		List<String> successLoginNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateInstanceResponse.Instance.SuccessLoginNames.Length"); i++) {
			successLoginNames.add(_ctx.stringValue("CreateInstanceResponse.Instance.SuccessLoginNames["+ i +"]"));
		}
		instance.setSuccessLoginNames(successLoginNames);

		List<String> failLoginNames = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CreateInstanceResponse.Instance.FailLoginNames.Length"); i++) {
			failLoginNames.add(_ctx.stringValue("CreateInstanceResponse.Instance.FailLoginNames["+ i +"]"));
		}
		instance.setFailLoginNames(failLoginNames);

		List<User> admin = new ArrayList<User>();
		for (int i = 0; i < _ctx.lengthValue("CreateInstanceResponse.Instance.Admin.Length"); i++) {
			User user = new User();
			user.setUserId(_ctx.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].UserId"));
			user.setRamId(_ctx.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].RamId"));
			user.setInstanceId(_ctx.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].InstanceId"));

			Detail detail = new Detail();
			detail.setLoginName(_ctx.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].Detail.LoginName"));
			detail.setDisplayName(_ctx.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].Detail.DisplayName"));
			detail.setPhone(_ctx.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].Detail.Phone"));
			detail.setEmail(_ctx.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].Detail.Email"));
			detail.setDepartment(_ctx.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].Detail.Department"));
			user.setDetail(detail);

			admin.add(user);
		}
		instance.setAdmin(admin);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("CreateInstanceResponse.Instance.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(_ctx.stringValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(_ctx.stringValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(_ctx.stringValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(_ctx.stringValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(_ctx.booleanValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(_ctx.integerValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(_ctx.booleanValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(_ctx.stringValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(_ctx.integerValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		instance.setPhoneNumbers(phoneNumbers);
		createInstanceResponse.setInstance(instance);
	 
	 	return createInstanceResponse;
	}
}