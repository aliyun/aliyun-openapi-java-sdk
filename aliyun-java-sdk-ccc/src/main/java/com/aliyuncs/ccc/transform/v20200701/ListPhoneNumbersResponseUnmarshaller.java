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

import com.aliyuncs.ccc.model.v20200701.ListPhoneNumbersResponse;
import com.aliyuncs.ccc.model.v20200701.ListPhoneNumbersResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListPhoneNumbersResponse.Data.PhoneNumber;
import com.aliyuncs.ccc.model.v20200701.ListPhoneNumbersResponse.Data.PhoneNumber.SkillGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPhoneNumbersResponseUnmarshaller {

	public static ListPhoneNumbersResponse unmarshall(ListPhoneNumbersResponse listPhoneNumbersResponse, UnmarshallerContext _ctx) {
		
		listPhoneNumbersResponse.setRequestId(_ctx.stringValue("ListPhoneNumbersResponse.RequestId"));
		listPhoneNumbersResponse.setCode(_ctx.stringValue("ListPhoneNumbersResponse.Code"));
		listPhoneNumbersResponse.setHttpStatusCode(_ctx.integerValue("ListPhoneNumbersResponse.HttpStatusCode"));
		listPhoneNumbersResponse.setMessage(_ctx.stringValue("ListPhoneNumbersResponse.Message"));
		listPhoneNumbersResponse.setPageNumber(_ctx.integerValue("ListPhoneNumbersResponse.PageNumber"));
		listPhoneNumbersResponse.setPageSize(_ctx.integerValue("ListPhoneNumbersResponse.PageSize"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListPhoneNumbersResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListPhoneNumbersResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListPhoneNumbersResponse.Data.TotalCount"));

		List<PhoneNumber> list = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListPhoneNumbersResponse.Data.List.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setActive(_ctx.booleanValue("ListPhoneNumbersResponse.Data.List["+ i +"].Active"));
			phoneNumber.setCity(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].City"));
			phoneNumber.setContactFlowId(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].ContactFlowId"));
			phoneNumber.setContactFlowName(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].ContactFlowName"));
			phoneNumber.setInstanceId(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].InstanceId"));
			phoneNumber.setNumber(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].Number"));
			phoneNumber.setProvince(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].Province"));
			phoneNumber.setUsage(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].Usage"));
			phoneNumber.setUserId(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].UserId"));
			phoneNumber.setProvider(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].Provider"));
			phoneNumber.setTags(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].Tags"));
			phoneNumber.setCreateTime(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].CreateTime"));

			List<SkillGroup> skillGroups = new ArrayList<SkillGroup>();
			for (int j = 0; j < _ctx.lengthValue("ListPhoneNumbersResponse.Data.List["+ i +"].SkillGroups.Length"); j++) {
				SkillGroup skillGroup = new SkillGroup();
				skillGroup.setDisplayName(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].SkillGroups["+ j +"].DisplayName"));
				skillGroup.setInstanceId(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].SkillGroups["+ j +"].InstanceId"));
				skillGroup.setName(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].SkillGroups["+ j +"].Name"));
				skillGroup.setSkillGroupId(_ctx.stringValue("ListPhoneNumbersResponse.Data.List["+ i +"].SkillGroups["+ j +"].SkillGroupId"));

				skillGroups.add(skillGroup);
			}
			phoneNumber.setSkillGroups(skillGroups);

			list.add(phoneNumber);
		}
		data.setList(list);
		listPhoneNumbersResponse.setData(data);
	 
	 	return listPhoneNumbersResponse;
	}
}