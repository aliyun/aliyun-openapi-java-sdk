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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListCustomerNumbersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomerNumbersResponseUnmarshaller {

	public static ListCustomerNumbersResponse unmarshall(ListCustomerNumbersResponse listCustomerNumbersResponse, UnmarshallerContext context) {
		
		listCustomerNumbersResponse.setRequestId(context.stringValue("ListCustomerNumbersResponse.RequestId"));
		listCustomerNumbersResponse.setSuccess(context.booleanValue("ListCustomerNumbersResponse.Success"));
		listCustomerNumbersResponse.setCode(context.stringValue("ListCustomerNumbersResponse.Code"));
		listCustomerNumbersResponse.setMessage(context.stringValue("ListCustomerNumbersResponse.Message"));
		listCustomerNumbersResponse.setHttpStatusCode(context.integerValue("ListCustomerNumbersResponse.HttpStatusCode"));

		List<String> phoneNumbers = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListCustomerNumbersResponse.PhoneNumbers.Length"); i++) {
			phoneNumbers.add(context.stringValue("ListCustomerNumbersResponse.PhoneNumbers["+ i +"]"));
		}
		listCustomerNumbersResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return listCustomerNumbersResponse;
	}
}