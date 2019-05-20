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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesOfUserResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesOfUserResponse.CallCenterInstance;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesOfUserResponse.CallCenterInstance.PhoneNumber;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesOfUserResponse.CallCenterInstance.User;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesOfUserResponse.CallCenterInstance.User.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesOfUserResponseUnmarshaller {

	public static ListInstancesOfUserResponse unmarshall(ListInstancesOfUserResponse listInstancesOfUserResponse, UnmarshallerContext context) {
		
		listInstancesOfUserResponse.setRequestId(context.stringValue("ListInstancesOfUserResponse.RequestId"));
		listInstancesOfUserResponse.setSuccess(context.booleanValue("ListInstancesOfUserResponse.Success"));
		listInstancesOfUserResponse.setCode(context.stringValue("ListInstancesOfUserResponse.Code"));
		listInstancesOfUserResponse.setMessage(context.stringValue("ListInstancesOfUserResponse.Message"));
		listInstancesOfUserResponse.setHttpStatusCode(context.integerValue("ListInstancesOfUserResponse.HttpStatusCode"));

		List<CallCenterInstance> instances = new ArrayList<CallCenterInstance>();
		for (int i = 0; i < context.lengthValue("ListInstancesOfUserResponse.Instances.Length"); i++) {
			CallCenterInstance callCenterInstance = new CallCenterInstance();
			callCenterInstance.setInstanceId(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].InstanceId"));
			callCenterInstance.setInstanceName(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].InstanceName"));
			callCenterInstance.setInstanceDescription(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].InstanceDescription"));
			callCenterInstance.setDomainName(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].DomainName"));
			callCenterInstance.setConsoleUrl(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].ConsoleUrl"));
			callCenterInstance.setStorageBucket(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].StorageBucket"));
			callCenterInstance.setStorageMaxDays(context.integerValue("ListInstancesOfUserResponse.Instances["+ i +"].StorageMaxDays"));
			callCenterInstance.setStorageMaxSize(context.integerValue("ListInstancesOfUserResponse.Instances["+ i +"].StorageMaxSize"));
			callCenterInstance.setMaxOnlineAgents(context.integerValue("ListInstancesOfUserResponse.Instances["+ i +"].MaxOnlineAgents"));
			callCenterInstance.setTenantId(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].TenantId"));
			callCenterInstance.setDirectoryId(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].DirectoryId"));
			callCenterInstance.setStatus(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Status"));
			callCenterInstance.setCreatedTime(context.longValue("ListInstancesOfUserResponse.Instances["+ i +"].CreatedTime"));
			callCenterInstance.setOwner(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Owner"));

			List<User> admin = new ArrayList<User>();
			for (int j = 0; j < context.lengthValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin.Length"); j++) {
				User user = new User();
				user.setUserId(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].UserId"));
				user.setRamId(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].RamId"));
				user.setInstanceId(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].InstanceId"));

				Detail detail = new Detail();
				detail.setLoginName(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].Detail.LoginName"));
				detail.setDisplayName(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].Detail.DisplayName"));
				detail.setPhone(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].Detail.Phone"));
				detail.setEmail(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].Detail.Email"));
				detail.setDepartment(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].Admin["+ j +"].Detail.Department"));
				user.setDetail(detail);

				admin.add(user);
			}
			callCenterInstance.setAdmin(admin);

			List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < context.lengthValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setPhoneNumberId(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].PhoneNumberId"));
				phoneNumber.setInstanceId(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setNumber(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Number"));
				phoneNumber.setPhoneNumberDescription(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setTestOnly(context.booleanValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setRemainingTime(context.integerValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setAllowOutbound(context.booleanValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setUsage(context.stringValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Usage"));
				phoneNumber.setTrunks(context.integerValue("ListInstancesOfUserResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Trunks"));

				phoneNumbers.add(phoneNumber);
			}
			callCenterInstance.setPhoneNumbers(phoneNumbers);

			instances.add(callCenterInstance);
		}
		listInstancesOfUserResponse.setInstances(instances);
	 
	 	return listInstancesOfUserResponse;
	}
}