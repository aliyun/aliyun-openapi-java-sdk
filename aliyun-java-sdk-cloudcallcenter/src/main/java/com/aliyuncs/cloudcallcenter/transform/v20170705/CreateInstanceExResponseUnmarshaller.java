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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.CreateInstanceExResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateInstanceExResponse.Instance;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateInstanceExResponse.Instance.PhoneNumber;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateInstanceExResponse.Instance.User;
import com.aliyuncs.cloudcallcenter.model.v20170705.CreateInstanceExResponse.Instance.User.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateInstanceExResponseUnmarshaller {

	public static CreateInstanceExResponse unmarshall(CreateInstanceExResponse createInstanceExResponse, UnmarshallerContext context) {
		
		createInstanceExResponse.setRequestId(context.stringValue("CreateInstanceExResponse.RequestId"));
		createInstanceExResponse.setSuccess(context.booleanValue("CreateInstanceExResponse.Success"));
		createInstanceExResponse.setCode(context.stringValue("CreateInstanceExResponse.Code"));
		createInstanceExResponse.setMessage(context.stringValue("CreateInstanceExResponse.Message"));
		createInstanceExResponse.setHttpStatusCode(context.integerValue("CreateInstanceExResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(context.stringValue("CreateInstanceExResponse.Instance.InstanceId"));
		instance.setInstanceName(context.stringValue("CreateInstanceExResponse.Instance.InstanceName"));
		instance.setInstanceDescription(context.stringValue("CreateInstanceExResponse.Instance.InstanceDescription"));
		instance.setDomainName(context.stringValue("CreateInstanceExResponse.Instance.DomainName"));
		instance.setConsoleUrl(context.stringValue("CreateInstanceExResponse.Instance.ConsoleUrl"));
		instance.setStorageBucket(context.stringValue("CreateInstanceExResponse.Instance.StorageBucket"));
		instance.setStorageMaxDays(context.integerValue("CreateInstanceExResponse.Instance.StorageMaxDays"));
		instance.setStorageMaxSize(context.integerValue("CreateInstanceExResponse.Instance.StorageMaxSize"));
		instance.setMaxOnlineAgents(context.integerValue("CreateInstanceExResponse.Instance.MaxOnlineAgents"));
		instance.setTenantId(context.stringValue("CreateInstanceExResponse.Instance.TenantId"));
		instance.setDirectoryId(context.stringValue("CreateInstanceExResponse.Instance.DirectoryId"));
		instance.setStatus(context.stringValue("CreateInstanceExResponse.Instance.Status"));
		instance.setCreatedTime(context.longValue("CreateInstanceExResponse.Instance.CreatedTime"));
		instance.setOwner(context.stringValue("CreateInstanceExResponse.Instance.Owner"));

		List<User> admin = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("CreateInstanceExResponse.Instance.Admin.Length"); i++) {
			User user = new User();
			user.setUserId(context.stringValue("CreateInstanceExResponse.Instance.Admin["+ i +"].UserId"));
			user.setRamId(context.stringValue("CreateInstanceExResponse.Instance.Admin["+ i +"].RamId"));
			user.setInstanceId(context.stringValue("CreateInstanceExResponse.Instance.Admin["+ i +"].InstanceId"));

			Detail detail = new Detail();
			detail.setLoginName(context.stringValue("CreateInstanceExResponse.Instance.Admin["+ i +"].Detail.LoginName"));
			detail.setDisplayName(context.stringValue("CreateInstanceExResponse.Instance.Admin["+ i +"].Detail.DisplayName"));
			detail.setPhone(context.stringValue("CreateInstanceExResponse.Instance.Admin["+ i +"].Detail.Phone"));
			detail.setEmail(context.stringValue("CreateInstanceExResponse.Instance.Admin["+ i +"].Detail.Email"));
			detail.setDepartment(context.stringValue("CreateInstanceExResponse.Instance.Admin["+ i +"].Detail.Department"));
			user.setDetail(detail);

			admin.add(user);
		}
		instance.setAdmin(admin);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("CreateInstanceExResponse.Instance.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("CreateInstanceExResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("CreateInstanceExResponse.Instance.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("CreateInstanceExResponse.Instance.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("CreateInstanceExResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("CreateInstanceExResponse.Instance.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("CreateInstanceExResponse.Instance.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("CreateInstanceExResponse.Instance.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("CreateInstanceExResponse.Instance.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("CreateInstanceExResponse.Instance.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		instance.setPhoneNumbers(phoneNumbers);
		createInstanceExResponse.setInstance(instance);
	 
	 	return createInstanceExResponse;
	}
}