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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.ListPhoneTagsResponse;
import com.aliyuncs.ccc.model.v20170705.ListPhoneTagsResponse.PhoneNumbers;
import com.aliyuncs.ccc.model.v20170705.ListPhoneTagsResponse.PhoneNumbers.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhoneTagsResponseUnmarshaller {

	public static ListPhoneTagsResponse unmarshall(ListPhoneTagsResponse listPhoneTagsResponse, UnmarshallerContext _ctx) {
		
		listPhoneTagsResponse.setRequestId(_ctx.stringValue("ListPhoneTagsResponse.RequestId"));
		listPhoneTagsResponse.setSuccess(_ctx.booleanValue("ListPhoneTagsResponse.Success"));
		listPhoneTagsResponse.setCode(_ctx.stringValue("ListPhoneTagsResponse.Code"));
		listPhoneTagsResponse.setMessage(_ctx.stringValue("ListPhoneTagsResponse.Message"));
		listPhoneTagsResponse.setHttpStatusCode(_ctx.integerValue("ListPhoneTagsResponse.HttpStatusCode"));

		PhoneNumbers phoneNumbers = new PhoneNumbers();
		phoneNumbers.setTotalCount(_ctx.integerValue("ListPhoneTagsResponse.PhoneNumbers.TotalCount"));
		phoneNumbers.setPageNumber(_ctx.integerValue("ListPhoneTagsResponse.PhoneNumbers.PageNumber"));
		phoneNumbers.setPageSize(_ctx.integerValue("ListPhoneTagsResponse.PhoneNumbers.PageSize"));

		List<PhoneNumber> list = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListPhoneTagsResponse.PhoneNumbers.List.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setPhoneNumberId(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].PhoneNumberId"));
			phoneNumber.setInstanceId(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].InstanceId"));
			phoneNumber.setNumber(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].Number"));
			phoneNumber.setPhoneNumberDescription(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].PhoneNumberDescription"));
			phoneNumber.setUsage(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].Usage"));
			phoneNumber.setProvince(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].Province"));
			phoneNumber.setCity(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].City"));
			phoneNumber.setType(_ctx.integerValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].Type"));
			phoneNumber.setConcurrency(_ctx.integerValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].Concurrency"));
			phoneNumber.setServiceTag(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].ServiceTag"));
			phoneNumber.setProvider(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].Provider"));
			phoneNumber.setCreateTime(_ctx.longValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].CreateTime"));
			phoneNumber.setContactFlowId(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].ContactFlowId"));

			List<String> skillGroupIdList = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].SkillGroupIdList.Length"); j++) {
				skillGroupIdList.add(_ctx.stringValue("ListPhoneTagsResponse.PhoneNumbers.List["+ i +"].SkillGroupIdList["+ j +"]"));
			}
			phoneNumber.setSkillGroupIdList(skillGroupIdList);

			list.add(phoneNumber);
		}
		phoneNumbers.setList(list);
		listPhoneTagsResponse.setPhoneNumbers(phoneNumbers);
	 
	 	return listPhoneTagsResponse;
	}
}