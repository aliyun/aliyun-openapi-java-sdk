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

import com.aliyuncs.ccc.model.v20200701.ListPersonalNumbersOfUserResponse;
import com.aliyuncs.ccc.model.v20200701.ListPersonalNumbersOfUserResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListPersonalNumbersOfUserResponse.Data.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonalNumbersOfUserResponseUnmarshaller {

	public static ListPersonalNumbersOfUserResponse unmarshall(ListPersonalNumbersOfUserResponse listPersonalNumbersOfUserResponse, UnmarshallerContext _ctx) {
		
		listPersonalNumbersOfUserResponse.setRequestId(_ctx.stringValue("ListPersonalNumbersOfUserResponse.RequestId"));
		listPersonalNumbersOfUserResponse.setCode(_ctx.stringValue("ListPersonalNumbersOfUserResponse.Code"));
		listPersonalNumbersOfUserResponse.setHttpStatusCode(_ctx.integerValue("ListPersonalNumbersOfUserResponse.HttpStatusCode"));
		listPersonalNumbersOfUserResponse.setMessage(_ctx.stringValue("ListPersonalNumbersOfUserResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListPersonalNumbersOfUserResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListPersonalNumbersOfUserResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListPersonalNumbersOfUserResponse.Data.TotalCount"));

		List<PhoneNumber> list = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonalNumbersOfUserResponse.Data.List.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setActive(_ctx.booleanValue("ListPersonalNumbersOfUserResponse.Data.List["+ i +"].Active"));
			phoneNumber.setCity(_ctx.stringValue("ListPersonalNumbersOfUserResponse.Data.List["+ i +"].City"));
			phoneNumber.setContactFlowId(_ctx.stringValue("ListPersonalNumbersOfUserResponse.Data.List["+ i +"].ContactFlowId"));
			phoneNumber.setNumber(_ctx.stringValue("ListPersonalNumbersOfUserResponse.Data.List["+ i +"].Number"));
			phoneNumber.setProvince(_ctx.stringValue("ListPersonalNumbersOfUserResponse.Data.List["+ i +"].Province"));
			phoneNumber.setInstanceId(_ctx.stringValue("ListPersonalNumbersOfUserResponse.Data.List["+ i +"].InstanceId"));

			list.add(phoneNumber);
		}
		data.setList(list);
		listPersonalNumbersOfUserResponse.setData(data);
	 
	 	return listPersonalNumbersOfUserResponse;
	}
}