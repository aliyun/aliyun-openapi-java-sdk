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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListPhoneNumbersOfSkillGroupResponse;
import com.aliyuncs.ccc.model.v20200701.ListPhoneNumbersOfSkillGroupResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListPhoneNumbersOfSkillGroupResponse.Data.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhoneNumbersOfSkillGroupResponseUnmarshaller {

	public static ListPhoneNumbersOfSkillGroupResponse unmarshall(ListPhoneNumbersOfSkillGroupResponse listPhoneNumbersOfSkillGroupResponse, UnmarshallerContext _ctx) {
		
		listPhoneNumbersOfSkillGroupResponse.setRequestId(_ctx.stringValue("ListPhoneNumbersOfSkillGroupResponse.RequestId"));
		listPhoneNumbersOfSkillGroupResponse.setCode(_ctx.stringValue("ListPhoneNumbersOfSkillGroupResponse.Code"));
		listPhoneNumbersOfSkillGroupResponse.setHttpStatusCode(_ctx.integerValue("ListPhoneNumbersOfSkillGroupResponse.HttpStatusCode"));
		listPhoneNumbersOfSkillGroupResponse.setMessage(_ctx.stringValue("ListPhoneNumbersOfSkillGroupResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListPhoneNumbersOfSkillGroupResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListPhoneNumbersOfSkillGroupResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListPhoneNumbersOfSkillGroupResponse.Data.TotalCount"));

		List<PhoneNumber> list = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListPhoneNumbersOfSkillGroupResponse.Data.List.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setActive(_ctx.booleanValue("ListPhoneNumbersOfSkillGroupResponse.Data.List["+ i +"].Active"));
			phoneNumber.setCity(_ctx.stringValue("ListPhoneNumbersOfSkillGroupResponse.Data.List["+ i +"].City"));
			phoneNumber.setContactFlowId(_ctx.stringValue("ListPhoneNumbersOfSkillGroupResponse.Data.List["+ i +"].ContactFlowId"));
			phoneNumber.setInstanceId(_ctx.stringValue("ListPhoneNumbersOfSkillGroupResponse.Data.List["+ i +"].InstanceId"));
			phoneNumber.setNumber(_ctx.stringValue("ListPhoneNumbersOfSkillGroupResponse.Data.List["+ i +"].Number"));
			phoneNumber.setProvince(_ctx.stringValue("ListPhoneNumbersOfSkillGroupResponse.Data.List["+ i +"].Province"));
			phoneNumber.setUsage(_ctx.stringValue("ListPhoneNumbersOfSkillGroupResponse.Data.List["+ i +"].Usage"));

			list.add(phoneNumber);
		}
		data.setList(list);
		listPhoneNumbersOfSkillGroupResponse.setData(data);
	 
	 	return listPhoneNumbersOfSkillGroupResponse;
	}
}