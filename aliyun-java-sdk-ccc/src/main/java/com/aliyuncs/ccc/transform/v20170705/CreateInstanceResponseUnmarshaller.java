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

	public static CreateInstanceResponse unmarshall(CreateInstanceResponse createInstanceResponse, UnmarshallerContext context) {
		
		createInstanceResponse.setRequestId(context.stringValue("CreateInstanceResponse.RequestId"));
		createInstanceResponse.setSuccess(context.booleanValue("CreateInstanceResponse.Success"));
		createInstanceResponse.setCode(context.stringValue("CreateInstanceResponse.Code"));
		createInstanceResponse.setMessage(context.stringValue("CreateInstanceResponse.Message"));
		createInstanceResponse.setHttpStatusCode(context.integerValue("CreateInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(context.stringValue("CreateInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(context.stringValue("CreateInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(context.stringValue("CreateInstanceResponse.Instance.InstanceDescription"));
		instance.setDomainName(context.stringValue("CreateInstanceResponse.Instance.DomainName"));
		instance.setConsoleUrl(context.stringValue("CreateInstanceResponse.Instance.ConsoleUrl"));
		instance.setStorageBucket(context.stringValue("CreateInstanceResponse.Instance.StorageBucket"));
		instance.setStorageMaxDays(context.integerValue("CreateInstanceResponse.Instance.StorageMaxDays"));
		instance.setStorageMaxSize(context.integerValue("CreateInstanceResponse.Instance.StorageMaxSize"));
		instance.setMaxOnlineAgents(context.integerValue("CreateInstanceResponse.Instance.MaxOnlineAgents"));
		instance.setTenantId(context.stringValue("CreateInstanceResponse.Instance.TenantId"));
		instance.setStatus(context.stringValue("CreateInstanceResponse.Instance.Status"));
		instance.setDirectoryId(context.stringValue("CreateInstanceResponse.Instance.DirectoryId"));
		instance.setCreatedTime(context.longValue("CreateInstanceResponse.Instance.CreatedTime"));
		instance.setOwner(context.stringValue("CreateInstanceResponse.Instance.Owner"));

		List<String> successPhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateInstanceResponse.Instance.SuccessPhoneNumbers.Length"); i++) {
			successPhoneNumbers.add(context.stringValue("CreateInstanceResponse.Instance.SuccessPhoneNumbers["+ i +"]"));
		}
		instance.setSuccessPhoneNumbers(successPhoneNumbers);

		List<String> failPhoneNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateInstanceResponse.Instance.FailPhoneNumbers.Length"); i++) {
			failPhoneNumbers.add(context.stringValue("CreateInstanceResponse.Instance.FailPhoneNumbers["+ i +"]"));
		}
		instance.setFailPhoneNumbers(failPhoneNumbers);

		List<String> successLoginNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateInstanceResponse.Instance.SuccessLoginNames.Length"); i++) {
			successLoginNames.add(context.stringValue("CreateInstanceResponse.Instance.SuccessLoginNames["+ i +"]"));
		}
		instance.setSuccessLoginNames(successLoginNames);

		List<String> failLoginNames = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("CreateInstanceResponse.Instance.FailLoginNames.Length"); i++) {
			failLoginNames.add(context.stringValue("CreateInstanceResponse.Instance.FailLoginNames["+ i +"]"));
		}
		instance.setFailLoginNames(failLoginNames);

		List<User> admin = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("CreateInstanceResponse.Instance.Admin.Length"); i++) {
			User user = new User();
			user.setUserId(context.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].UserId"));
			user.setRamId(context.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].RamId"));
			user.setInstanceId(context.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].InstanceId"));

			Detail detail = new Detail();
			detail.setLoginName(context.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].Detail.LoginName"));
			detail.setDisplayName(context.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].Detail.DisplayName"));
			detail.setPhone(context.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].Detail.Phone"));
			detail.setEmail(context.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].Detail.Email"));
			detail.setDepartment(context.stringValue("CreateInstanceResponse.Instance.Admin["+ i +"].Detail.Department"));
			user.setDetail(detail);

			admin.add(user);
		}
		instance.setAdmin(admin);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("CreateInstanceResponse.Instance.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("CreateInstanceResponse.Instance.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		instance.setPhoneNumbers(phoneNumbers);
		createInstanceResponse.setInstance(instance);
	 
	 	return createInstanceResponse;
	}
}