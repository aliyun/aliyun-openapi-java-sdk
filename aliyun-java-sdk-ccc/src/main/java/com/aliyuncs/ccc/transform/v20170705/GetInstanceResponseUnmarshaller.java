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

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext context) {
		
		getInstanceResponse.setRequestId(context.stringValue("GetInstanceResponse.RequestId"));
		getInstanceResponse.setSuccess(context.booleanValue("GetInstanceResponse.Success"));
		getInstanceResponse.setCode(context.stringValue("GetInstanceResponse.Code"));
		getInstanceResponse.setMessage(context.stringValue("GetInstanceResponse.Message"));
		getInstanceResponse.setHttpStatusCode(context.integerValue("GetInstanceResponse.HttpStatusCode"));

		Instance instance = new Instance();
		instance.setInstanceId(context.stringValue("GetInstanceResponse.Instance.InstanceId"));
		instance.setInstanceName(context.stringValue("GetInstanceResponse.Instance.InstanceName"));
		instance.setInstanceDescription(context.stringValue("GetInstanceResponse.Instance.InstanceDescription"));
		instance.setDomainName(context.stringValue("GetInstanceResponse.Instance.DomainName"));
		instance.setConsoleUrl(context.stringValue("GetInstanceResponse.Instance.ConsoleUrl"));
		instance.setStorageBucket(context.stringValue("GetInstanceResponse.Instance.StorageBucket"));
		instance.setStorageMaxDays(context.integerValue("GetInstanceResponse.Instance.StorageMaxDays"));
		instance.setStorageMaxSize(context.integerValue("GetInstanceResponse.Instance.StorageMaxSize"));
		instance.setMaxOnlineAgents(context.integerValue("GetInstanceResponse.Instance.MaxOnlineAgents"));
		instance.setTenantId(context.stringValue("GetInstanceResponse.Instance.TenantId"));
		instance.setDirectoryId(context.stringValue("GetInstanceResponse.Instance.DirectoryId"));
		instance.setStatus(context.stringValue("GetInstanceResponse.Instance.Status"));
		instance.setCreatedTime(context.longValue("GetInstanceResponse.Instance.CreatedTime"));
		instance.setOwner(context.stringValue("GetInstanceResponse.Instance.Owner"));

		List<User> admin = new ArrayList<User>();
		for (int i = 0; i < context.lengthValue("GetInstanceResponse.Instance.Admin.Length"); i++) {
			User user = new User();
			user.setUserId(context.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].UserId"));
			user.setRamId(context.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].RamId"));
			user.setInstanceId(context.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].InstanceId"));

			Detail detail = new Detail();
			detail.setLoginName(context.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.LoginName"));
			detail.setDisplayName(context.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.DisplayName"));
			detail.setPhone(context.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.Phone"));
			detail.setEmail(context.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.Email"));
			detail.setDepartment(context.stringValue("GetInstanceResponse.Instance.Admin["+ i +"].Detail.Department"));
			user.setDetail(detail);

			admin.add(user);
		}
		instance.setAdmin(admin);

		List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("GetInstanceResponse.Instance.PhoneNumbers.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("GetInstanceResponse.Instance.PhoneNumbers["+ i +"].Trunks"));

			phoneNumbers.add(phoneNumber);
		}
		instance.setPhoneNumbers(phoneNumbers);
		getInstanceResponse.setInstance(instance);
	 
	 	return getInstanceResponse;
	}
}