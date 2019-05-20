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

import com.aliyuncs.cloudcallcenter.model.v20170705.ListTestPhoneNumbersResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListTestPhoneNumbersResponse.PhoneNumbers;
import com.aliyuncs.cloudcallcenter.model.v20170705.ListTestPhoneNumbersResponse.PhoneNumbers.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTestPhoneNumbersResponseUnmarshaller {

	public static ListTestPhoneNumbersResponse unmarshall(ListTestPhoneNumbersResponse listTestPhoneNumbersResponse, UnmarshallerContext context) {
		
		listTestPhoneNumbersResponse.setRequestId(context.stringValue("ListTestPhoneNumbersResponse.RequestId"));
		listTestPhoneNumbersResponse.setSuccess(context.booleanValue("ListTestPhoneNumbersResponse.Success"));
		listTestPhoneNumbersResponse.setCode(context.stringValue("ListTestPhoneNumbersResponse.Code"));
		listTestPhoneNumbersResponse.setMessage(context.stringValue("ListTestPhoneNumbersResponse.Message"));
		listTestPhoneNumbersResponse.setHttpStatusCode(context.integerValue("ListTestPhoneNumbersResponse.HttpStatusCode"));

		PhoneNumbers phoneNumbers = new PhoneNumbers();
		phoneNumbers.setTotalCount(context.integerValue("ListTestPhoneNumbersResponse.PhoneNumbers.TotalCount"));
		phoneNumbers.setPageNumber(context.integerValue("ListTestPhoneNumbersResponse.PhoneNumbers.PageNumber"));
		phoneNumbers.setPageSize(context.integerValue("ListTestPhoneNumbersResponse.PhoneNumbers.PageSize"));

		List<PhoneNumber> list = new ArrayList<PhoneNumber>();
		for (int i = 0; i < context.lengthValue("ListTestPhoneNumbersResponse.PhoneNumbers.List.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(context.stringValue("ListTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(context.stringValue("ListTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].InstanceId"));
			phoneNumber.setNumber(context.stringValue("ListTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(context.stringValue("ListTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].PhoneNumberDescription"));
			phoneNumber.setTestOnly(context.booleanValue("ListTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].TestOnly"));
			phoneNumber.setRemainingTime(context.integerValue("ListTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].RemainingTime"));
			phoneNumber.setAllowOutbound(context.booleanValue("ListTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].AllowOutbound"));
			phoneNumber.setUsage(context.stringValue("ListTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].Usage"));
			phoneNumber.setTrunks(context.integerValue("ListTestPhoneNumbersResponse.PhoneNumbers.List["+ i +"].Trunks"));

			list.add(phoneNumber);
		}
		phoneNumbers.setList(list);
		listTestPhoneNumbersResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return listTestPhoneNumbersResponse;
	}
}