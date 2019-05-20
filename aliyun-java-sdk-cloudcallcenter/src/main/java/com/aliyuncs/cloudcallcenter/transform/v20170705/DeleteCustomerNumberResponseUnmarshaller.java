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

import com.aliyuncs.cloudcallcenter.model.v20170705.DeleteCustomerNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCustomerNumberResponseUnmarshaller {

	public static DeleteCustomerNumberResponse unmarshall(DeleteCustomerNumberResponse deleteCustomerNumberResponse, UnmarshallerContext context) {
		
		deleteCustomerNumberResponse.setRequestId(context.stringValue("DeleteCustomerNumberResponse.RequestId"));
		deleteCustomerNumberResponse.setSuccess(context.booleanValue("DeleteCustomerNumberResponse.Success"));
		deleteCustomerNumberResponse.setCode(context.stringValue("DeleteCustomerNumberResponse.Code"));
		deleteCustomerNumberResponse.setMessage(context.stringValue("DeleteCustomerNumberResponse.Message"));
		deleteCustomerNumberResponse.setHttpStatusCode(context.integerValue("DeleteCustomerNumberResponse.HttpStatusCode"));

		List<String> phoneNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DeleteCustomerNumberResponse.PhoneNumbers.Length"); i++) {
			phoneNumbers.add(context.stringValue("DeleteCustomerNumberResponse.PhoneNumbers["+ i +"]"));
		}
		deleteCustomerNumberResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return deleteCustomerNumberResponse;
	}
}