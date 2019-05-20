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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListAvailableTestPhoneNumbersResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAvailableTestPhoneNumbersResponse.PhoneNumbers;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListAvailableTestPhoneNumbersResponse.PhoneNumbers.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAvailableTestPhoneNumbersResponseUnmarshaller {

	public static ListAvailableTestPhoneNumbersResponse unmarshall(ListAvailableTestPhoneNumbersResponse listAvailableTestPhoneNumbersResponse, UnmarshallerContext context) {
		
		listAvailableTestPhoneNumbersResponse.setRequestId(context.stringValue("ListAvailableTestPhoneNumbersResponse.RequestId"));
		listAvailableTestPhoneNumbersResponse.setSuccess(context.booleanValue("ListAvailableTestPhoneNumbersResponse.Success"));
		listAvailableTestPhoneNumbersResponse.setCode(context.stringValue("ListAvailableTestPhoneNumbersResponse.Code"));
		listAvailableTestPhoneNumbersResponse.setMessage(context.stringValue("ListAvailableTestPhoneNumbersResponse.Message"));
		listAvailableTestPhoneNumbersResponse.setHttpStatusCode(context.integerValue("ListAvailableTestPhoneNumbersResponse.HttpStatusCode"));

		PhoneNumbers phoneNumbers = new PhoneNumbers();
		phoneNumbers.setTotalCount(context.integerValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.TotalCount"));
		phoneNumbers.setPageNumber(context.integerValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.PageNumber"));
		phoneNumbers.setPageSize(context.integerValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.PageSize"));

		List<PhoneNumber> list = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.List.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("ListAvailableTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].Trunks"));

			list.add(phoneNumber);
		}
		phoneNumbers.setList(list);
		listAvailableTestPhoneNumbersResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return listAvailableTestPhoneNumbersResponse;
	}
}