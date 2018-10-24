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

package com.aliyuncs.crm.transform.v20150408;

import com.aliyuncs.crm.model.v20150408.FindServiceManagerResponse;
import com.aliyuncs.crm.model.v20150408.FindServiceManagerResponse.ServiceManager;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindServiceManagerResponseUnmarshaller {

	public static FindServiceManagerResponse unmarshall(FindServiceManagerResponse findServiceManagerResponse, UnmarshallerContext context) {
		
		findServiceManagerResponse.setRequestId(context.stringValue("FindServiceManagerResponse.RequestId"));
		findServiceManagerResponse.setSuccess(context.booleanValue("FindServiceManagerResponse.Success"));
		findServiceManagerResponse.setCode(context.stringValue("FindServiceManagerResponse.Code"));
		findServiceManagerResponse.setMessage(context.stringValue("FindServiceManagerResponse.Message"));

		ServiceManager serviceManager = new ServiceManager();
		serviceManager.setServiceManager(context.stringValue("FindServiceManagerResponse.ServiceManager.ServiceManager"));
		serviceManager.setServiceManagerEmpId(context.stringValue("FindServiceManagerResponse.ServiceManager.ServiceManagerEmpId"));
		serviceManager.setBusinessManager(context.stringValue("FindServiceManagerResponse.ServiceManager.BusinessManager"));
		serviceManager.setBusinessManagerEmpId(context.stringValue("FindServiceManagerResponse.ServiceManager.BusinessManagerEmpId"));
		findServiceManagerResponse.setServiceManager(serviceManager);
	 
	 	return findServiceManagerResponse;
	}
}