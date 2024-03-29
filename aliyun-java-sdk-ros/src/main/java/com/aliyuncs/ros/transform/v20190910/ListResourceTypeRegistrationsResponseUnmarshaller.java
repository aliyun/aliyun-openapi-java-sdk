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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListResourceTypeRegistrationsResponse;
import com.aliyuncs.ros.model.v20190910.ListResourceTypeRegistrationsResponse.Registration;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceTypeRegistrationsResponseUnmarshaller {

	public static ListResourceTypeRegistrationsResponse unmarshall(ListResourceTypeRegistrationsResponse listResourceTypeRegistrationsResponse, UnmarshallerContext _ctx) {
		
		listResourceTypeRegistrationsResponse.setRequestId(_ctx.stringValue("ListResourceTypeRegistrationsResponse.RequestId"));
		listResourceTypeRegistrationsResponse.setPageNumber(_ctx.integerValue("ListResourceTypeRegistrationsResponse.PageNumber"));
		listResourceTypeRegistrationsResponse.setTotalCount(_ctx.integerValue("ListResourceTypeRegistrationsResponse.TotalCount"));

		List<Registration> registrations = new ArrayList<Registration>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceTypeRegistrationsResponse.Registrations.Length"); i++) {
			Registration registration = new Registration();
			registration.setRegistrationId(_ctx.stringValue("ListResourceTypeRegistrationsResponse.Registrations["+ i +"].RegistrationId"));
			registration.setEntityType(_ctx.stringValue("ListResourceTypeRegistrationsResponse.Registrations["+ i +"].EntityType"));
			registration.setResourceType(_ctx.stringValue("ListResourceTypeRegistrationsResponse.Registrations["+ i +"].ResourceType"));
			registration.setVersionId(_ctx.stringValue("ListResourceTypeRegistrationsResponse.Registrations["+ i +"].VersionId"));
			registration.setStatus(_ctx.stringValue("ListResourceTypeRegistrationsResponse.Registrations["+ i +"].Status"));
			registration.setStatusReason(_ctx.stringValue("ListResourceTypeRegistrationsResponse.Registrations["+ i +"].StatusReason"));
			registration.setCreateTime(_ctx.stringValue("ListResourceTypeRegistrationsResponse.Registrations["+ i +"].CreateTime"));
			registration.setIsDeleted(_ctx.booleanValue("ListResourceTypeRegistrationsResponse.Registrations["+ i +"].IsDeleted"));

			registrations.add(registration);
		}
		listResourceTypeRegistrationsResponse.setRegistrations(registrations);
	 
	 	return listResourceTypeRegistrationsResponse;
	}
}