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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesResponse.CallCenterInstance;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesResponse.CallCenterInstance.PhoneNumber;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesResponse.CallCenterInstance.User;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListInstancesResponse.CallCenterInstance.User.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext context) {
		
		listInstancesResponse.setRequestId(context.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setSuccess(context.booleanValue("ListInstancesResponse.Success"));
		listInstancesResponse.setCode(context.stringValue("ListInstancesResponse.Code"));
		listInstancesResponse.setMessage(context.stringValue("ListInstancesResponse.Message"));
		listInstancesResponse.setHttpStatusCode(context.integerValue("ListInstancesResponse.HttpStatusCode"));

		List<CallCenterInstance> instances = new ArrayList<CallCenterInstance>();
		for (int i = 0; i < context.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			CallCenterInstance callCenterInstance = new CallCenterInstance();
			callCenterInstance.setInstanceId(context.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			callCenterInstance.setInstanceName(context.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceName"));
			callCenterInstance.setInstanceDescription(context.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceDescription"));
			callCenterInstance.setDomainName(context.stringValue("ListInstancesResponse.Instances["+ i +"].DomainName"));
			callCenterInstance.setConsoleUrl(context.stringValue("ListInstancesResponse.Instances["+ i +"].ConsoleUrl"));
			callCenterInstance.setStorageBucket(context.stringValue("ListInstancesResponse.Instances["+ i +"].StorageBucket"));
			callCenterInstance.setStorageMaxDays(context.integerValue("ListInstancesResponse.Instances["+ i +"].StorageMaxDays"));
			callCenterInstance.setStorageMaxSize(context.integerValue("ListInstancesResponse.Instances["+ i +"].StorageMaxSize"));
			callCenterInstance.setMaxOnlineAgents(context.integerValue("ListInstancesResponse.Instances["+ i +"].MaxOnlineAgents"));
			callCenterInstance.setTenantId(context.stringValue("ListInstancesResponse.Instances["+ i +"].TenantId"));
			callCenterInstance.setDirectoryId(context.stringValue("ListInstancesResponse.Instances["+ i +"].DirectoryId"));
			callCenterInstance.setStatus(context.stringValue("ListInstancesResponse.Instances["+ i +"].Status"));
			callCenterInstance.setCreatedTime(context.longValue("ListInstancesResponse.Instances["+ i +"].CreatedTime"));
			callCenterInstance.setOwner(context.stringValue("ListInstancesResponse.Instances["+ i +"].Owner"));

			List<User> admin = new ArrayList<User>();
			for (int j = 0; j < context.lengthValue("ListInstancesResponse.Instances["+ i +"].Admin.Length"); j++) {
				User user = new User();
				user.setUserId(context.stringValue("ListInstancesResponse.Instances["+ i +"].Admin["+ j +"].UserId"));
				user.setRamId(context.stringValue("ListInstancesResponse.Instances["+ i +"].Admin["+ j +"].RamId"));
				user.setInstanceId(context.stringValue("ListInstancesResponse.Instances["+ i +"].Admin["+ j +"].InstanceId"));

				Detail detail = new Detail();
				detail.setLoginName(context.stringValue("ListInstancesResponse.Instances["+ i +"].Admin["+ j +"].Detail.LoginName"));
				detail.setDisplayName(context.stringValue("ListInstancesResponse.Instances["+ i +"].Admin["+ j +"].Detail.DisplayName"));
				detail.setPhone(context.stringValue("ListInstancesResponse.Instances["+ i +"].Admin["+ j +"].Detail.Phone"));
				detail.setEmail(context.stringValue("ListInstancesResponse.Instances["+ i +"].Admin["+ j +"].Detail.Email"));
				detail.setDepartment(context.stringValue("ListInstancesResponse.Instances["+ i +"].Admin["+ j +"].Detail.Department"));
				user.setDetail(detail);

				admin.add(user);
			}
			callCenterInstance.setAdmin(admin);

			List<PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
			for (int j = 0; j < context.lengthValue("ListInstancesResponse.Instances["+ i +"].PhoneNumbers.Length"); j++) {
				PhoneNumber phoneNumber = new PhoneNumber();
				phoneNumber.setPhoneNumberId(context.stringValue("ListInstancesResponse.Instances["+ i +"].PhoneNumbers["+ j +"].PhoneNumberId"));
				phoneNumber.setInstanceId(context.stringValue("ListInstancesResponse.Instances["+ i +"].PhoneNumbers["+ j +"].InstanceId"));
				phoneNumber.setNumber(context.stringValue("ListInstancesResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Number"));
				phoneNumber.setPhoneNumberDescription(context.stringValue("ListInstancesResponse.Instances["+ i +"].PhoneNumbers["+ j +"].PhoneNumberDescription"));
				phoneNumber.setTestOnly(context.booleanValue("ListInstancesResponse.Instances["+ i +"].PhoneNumbers["+ j +"].TestOnly"));
				phoneNumber.setRemainingTime(context.integerValue("ListInstancesResponse.Instances["+ i +"].PhoneNumbers["+ j +"].RemainingTime"));
				phoneNumber.setAllowOutbound(context.booleanValue("ListInstancesResponse.Instances["+ i +"].PhoneNumbers["+ j +"].AllowOutbound"));
				phoneNumber.setUsage(context.stringValue("ListInstancesResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Usage"));
				phoneNumber.setTrunks(context.integerValue("ListInstancesResponse.Instances["+ i +"].PhoneNumbers["+ j +"].Trunks"));

				phoneNumbers.add(phoneNumber);
			}
			callCenterInstance.setPhoneNumbers(phoneNumbers);

			instances.add(callCenterInstance);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}