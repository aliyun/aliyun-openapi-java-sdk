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

import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyInstanceResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyInstanceResponse.Instance;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyInstanceResponse.Instance.PhoneNumber;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyInstanceResponse.Instance.User;
import com.aliyuncs.cloudcallcenter.model.v20170705.ModifyInstanceResponse.Instance.User.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceResponseUnmarshaller {

	public static ModifyInstanceResponse unmarshall(ModifyInstanceResponse modifyInstanceResponse, UnmarshallerContext context) {
		
		modifyInstanceResponse.setRequestId(context.stringValue("ModifyInstanceResponse.RequestId"));
		modifyInstanceResponse.setSuccess(context.booleanValue("ModifyInstanceResponse.Success"));
		modifyInstanceResponse.setCode(context.stringValue("ModifyInstanceResponse.Code"));
		modifyInstanceResponse.setMessage(context.stringValue("ModifyInstanceResponse.Message"));
		modifyInstanceResponse.setHttpStatusCode(context.integerValue("ModifyInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(context.stringValue("ModifyInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(context.stringValue("ModifyInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(context.stringValue("ModifyInstanceResponse.Instance.InstanceDescription"));
		instance.setDomainName(context.stringValue("ModifyInstanceResponse.Instance.DomainName"));
		instance.setConsoleUrl(context.stringValue("ModifyInstanceResponse.Instance.ConsoleUrl"));
		instance.setStorageBucket(context.stringValue("ModifyInstanceResponse.Instance.StorageBucket"));
		instance.setStorageMaxDays(context.integerValue("ModifyInstanceResponse.Instance.StorageMaxDays"));
		instance.setStorageMaxSize(context.integerValue("ModifyInstanceResponse.Instance.StorageMaxSize"));
		instance.setMaxOnlineAgents(context.integerValue("ModifyInstanceResponse.Instance.MaxOnlineAgents"));
		instance.setTenantId(context.stringValue("ModifyInstanceResponse.Instance.TenantId"));
		instance.setDirectoryId(context.stringValue("ModifyInstanceResponse.Instance.DirectoryId"));
		instance.setStatus(context.stringValue("ModifyInstanceResponse.Instance.Status"));
		instance.setCreatedTime(context.longValue("ModifyInstanceResponse.Instance.CreatedTime"));
		instance.setOwner(context.stringValue("ModifyInstanceResponse.Instance.Owner"));

		List<User> admin = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("ModifyInstanceResponse.Instance.Admin.Length"); i++) {
			User user = new User();
			user.setUserId(context.stringValue("ModifyInstanceResponse.Instance.Admin["+ i +"].UserId"));
			user.setRamId(context.stringValue("ModifyInstanceResponse.Instance.Admin["+ i +"].RamId"));
			user.setInstanceId(context.stringValue("ModifyInstanceResponse.Instance.Admin["+ i +"].InstanceId"));

			Detail detail = new Detail();
			detail.setLoginName(context.stringValue("ModifyInstanceResponse.Instance.Admin["+ i +"].Detail.LoginName"));
			detail.setDisplayName(context.stringValue("ModifyInstanceResponse.Instance.Admin["+ i +"].Detail.DisplayName"));
			detail.setPhone(context.stringValue("ModifyInstanceResponse.Instance.Admin["+ i +"].Detail.Phone"));
			detail.setEmail(context.stringValue("ModifyInstanceResponse.Instance.Admin["+ i +"].Detail.Email"));
			detail.setDepartment(context.stringValue("ModifyInstanceResponse.Instance.Admin["+ i +"].Detail.Department"));
			user.setDetail(detail);

			admin.add(user);
		}
		instance.setAdmin(admin);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("ModifyInstanceResponse.Instance.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("ModifyInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("ModifyInstanceResponse.Instance.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("ModifyInstanceResponse.Instance.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("ModifyInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("ModifyInstanceResponse.Instance.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("ModifyInstanceResponse.Instance.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("ModifyInstanceResponse.Instance.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("ModifyInstanceResponse.Instance.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("ModifyInstanceResponse.Instance.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		instance.setPhoneNumbers(phoneNumbers);
		modifyInstanceResponse.setInstance(instance);
	 
	 	return modifyInstanceResponse;
	}
}