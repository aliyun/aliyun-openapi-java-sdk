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

package com.aliyuncs.computenestsupplier.transform.v20210521;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceRegistrationsResponse;
import com.aliyuncs.computenestsupplier.model.v20210521.ListServiceRegistrationsResponse.ServiceRegistration;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceRegistrationsResponseUnmarshaller {

	public static ListServiceRegistrationsResponse unmarshall(ListServiceRegistrationsResponse listServiceRegistrationsResponse, UnmarshallerContext _ctx) {
		
		listServiceRegistrationsResponse.setRequestId(_ctx.stringValue("ListServiceRegistrationsResponse.RequestId"));
		listServiceRegistrationsResponse.setNextToken(_ctx.stringValue("ListServiceRegistrationsResponse.NextToken"));
		listServiceRegistrationsResponse.setTotalCount(_ctx.stringValue("ListServiceRegistrationsResponse.TotalCount"));
		listServiceRegistrationsResponse.setMaxResults(_ctx.integerValue("ListServiceRegistrationsResponse.MaxResults"));

		List<ServiceRegistration> serviceRegistrations = new ArrayList<ServiceRegistration>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceRegistrationsResponse.ServiceRegistrations.Length"); i++) {
			ServiceRegistration serviceRegistration = new ServiceRegistration();
			serviceRegistration.setStatus(_ctx.stringValue("ListServiceRegistrationsResponse.ServiceRegistrations["+ i +"].Status"));
			serviceRegistration.setRegistrationId(_ctx.stringValue("ListServiceRegistrationsResponse.ServiceRegistrations["+ i +"].RegistrationId"));
			serviceRegistration.setFinishTime(_ctx.stringValue("ListServiceRegistrationsResponse.ServiceRegistrations["+ i +"].FinishTime"));
			serviceRegistration.setComment(_ctx.stringValue("ListServiceRegistrationsResponse.ServiceRegistrations["+ i +"].Comment"));
			serviceRegistration.setServiceId(_ctx.stringValue("ListServiceRegistrationsResponse.ServiceRegistrations["+ i +"].ServiceId"));
			serviceRegistration.setSubmitTime(_ctx.stringValue("ListServiceRegistrationsResponse.ServiceRegistrations["+ i +"].SubmitTime"));

			serviceRegistrations.add(serviceRegistration);
		}
		listServiceRegistrationsResponse.setServiceRegistrations(serviceRegistrations);
	 
	 	return listServiceRegistrationsResponse;
	}
}