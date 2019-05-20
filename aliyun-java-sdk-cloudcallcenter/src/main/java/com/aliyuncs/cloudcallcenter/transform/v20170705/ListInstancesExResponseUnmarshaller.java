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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesExResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesExResponse.CallCenterInstance;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesExResponse.CallCenterInstance.PhoneNumber;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesExResponse.CallCenterInstance.User;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesExResponse.CallCenterInstance.User.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesExResponseUnmarshaller {

	public static ListInstancesExResponse unmarshall(ListInstancesExResponse listInstancesExResponse, UnmarshallerContext context) {
		
		listInstancesExResponse.setRequestId(context.stringValue("ListInstancesExResponse.RequestId"));
		listInstancesExResponse.setSuccess(context.booleanValue("ListInstancesExResponse.Success"));
		listInstancesExResponse.setCode(context.stringValue("ListInstancesExResponse.Code"));
		listInstancesExResponse.setMessage(context.stringValue("ListInstancesExResponse.Message"));
		listInstancesExResponse.setHttpStatusCode(context.integerValue("ListInstancesExResponse.HttpStatusCode"));

		List<CallCenterInstance> instances = new ArrayList<CallCenterInstance>();
		for (int i = 0; i < context.lengthValue("ListInstancesExResponse.Instances.Length"); i++) {
			CallCenterInstance callCenterInstance = new CallCenterInstance();
			callCenterInstance.setInstanceId(context.stringValue("ListInstancesExResponse.Instances["+ i +"].InstanceId"));
			callCenterInstance.setInstanceName(context.stringValue("ListInstancesExResponse.Instances["+ i +"].InstanceName"));
			callCenterInstance.setInstanceDescription(context.stringValue("ListInstancesExResponse.Instances["+ i +"].InstanceDescription"));
			callCenterInstance.setDomainName(context.stringValue("ListInstancesExResponse.Instances["+ i +"].DomainName"));
			callCenterInstance.setConsoleUrl(context.stringValue("ListInstancesExResponse.Instances["+ i +"].ConsoleUrl"));
			callCenterInstance.setStorageBucket(context.stringValue("ListInstancesExResponse.Instances["+ i +"].StorageBucket"));
			callCenterInstance.setStorageMaxDays(context.integerValue("ListInstancesExResponse.Instances["+ i +"].StorageMaxDays"));
			callCenterInstance.setStorageMaxSize(context.integerValue("ListInstancesExResponse.Instances["+ i +"].StorageMaxSize"));
			callCenterInstance.setMaxOnlineAgents(context.integerValue("ListInstancesExResponse.Instances["+ i +"].MaxOnlineAgents"));
			callCenterInstance.setTenantId(context.stringValue("ListInstancesExResponse.Instances["+ i +"].TenantId"));
			callCenterInstance.setDirectoryId(context.stringValue("ListInstancesExResponse.Instances["+ i +"].DirectoryId"));
			callCenterInstance.setStatus(context.stringValue("ListInstancesExResponse.Instances["+ i +"].Status"));
			callCenterInstance.setCreatedTime(context.longValue("ListInstancesExResponse.Instances["+ i +"].CreatedTime"));
			callCenterInstance.setOwner(context.stringValue("ListInstancesExResponse.Instances["+ i +"].Owner"));

			List<User> admin = new ArrayList<User>();
			for (int j = 0; j < context.lengthValue("ListInstancesExResponse.Instances["+ i +"].Admin.Length"); j++) {
				User user = new User();
				user.setUserId(context.stringValue("ListInstancesExResponse.Instances["+ i +"].Admin["+ j +"].UserId"));
				user.setRamId(context.stringValue("ListInstancesExResponse.Instances["+ i +"].Admin["+ j +"].RamId"));
				user.setInstanceId(context.stringValue("ListInstancesExResponse.Instances["+ i +"].Admin["+ j +"].InstanceId"));

				Detail detail = new Detail();
				detail.setLoginName(context.stringValue("ListInstancesExResponse.Instances["+ i +"].Admin["+ j +"].Detail.LoginName"));
				detail.setDisplayName(context.stringValue("ListInstancesExResponse.Instances["+ i +"].Admin["+ j +"].Detail.DisplayName"));
				detail.setPhone(context.stringValue("ListInstancesExResponse.Instances["+ i +"].Admin["+ j +"].Detail.Phone"));
				detail.setEmail(context.stringValue("ListInstancesExResponse.Instances["+ i +"].Admin["+ j +"].Detail.Email"));
				detail.setDepartment(context.stringValue("ListInstancesExResponse.Instances["+ i +"].Admin["+ j +"].Detail.Department"));
				user.setDetail(detail);

				admin.add(user);
			}
			callCenterInstance.setAdmin(admin);

			List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < context.lengthValue("ListInstancesExResponse.Instances["+ i +"].PhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setPhoneNumberId(context.stringValue("ListInstancesExResponse.Instances["+ i +"].PhoneNumbers["+ j +"].PhoneNumberId"));
				phoneNumber.setInstanceId(context.stringValue("ListInstancesExResponse.Instances["+ i +"].PhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setNumber(context.stringValue("ListInstancesExResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Number"));
				phoneNumber.setPhoneNumberDescription(context.stringValue("ListInstancesExResponse.Instances["+ i +"].PhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setTestOnly(context.booleanValue("ListInstancesExResponse.Instances["+ i +"].PhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setRemainingTime(context.integerValue("ListInstancesExResponse.Instances["+ i +"].PhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setAllowOutbound(context.booleanValue("ListInstancesExResponse.Instances["+ i +"].PhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setUsage(context.stringValue("ListInstancesExResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Usage"));
				phoneNumber.setTrunks(context.integerValue("ListInstancesExResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Trunks"));

				phoneNumbers.add(phoneNumber);
			}
			callCenterInstance.setPhoneNumbers(phoneNumbers);

			instances.add(callCenterInstance);
		}
		listInstancesExResponse.setInstances(instances);
	 
	 	return listInstancesExResponse;
	}
}