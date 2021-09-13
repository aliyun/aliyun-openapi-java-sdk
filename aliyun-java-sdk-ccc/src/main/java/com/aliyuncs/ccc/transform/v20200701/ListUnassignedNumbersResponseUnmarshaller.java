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

import com.aliyuncs.ccc.model.v20200701.ListUnassignedNumbersResponse;
import com.aliyuncs.ccc.model.v20200701.ListUnassignedNumbersResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListUnassignedNumbersResponse.Data.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUnassignedNumbersResponseUnmarshaller {

	public static ListUnassignedNumbersResponse unmarshall(ListUnassignedNumbersResponse listUnassignedNumbersResponse, UnmarshallerContext _ctx) {
		
		listUnassignedNumbersResponse.setRequestId(_ctx.stringValue("ListUnassignedNumbersResponse.RequestId"));
		listUnassignedNumbersResponse.setCode(_ctx.stringValue("ListUnassignedNumbersResponse.Code"));
		listUnassignedNumbersResponse.setHttpStatusCode(_ctx.integerValue("ListUnassignedNumbersResponse.HttpStatusCode"));
		listUnassignedNumbersResponse.setMessage(_ctx.stringValue("ListUnassignedNumbersResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListUnassignedNumbersResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListUnassignedNumbersResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListUnassignedNumbersResponse.Data.TotalCount"));

		List<PhoneNumber> list = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListUnassignedNumbersResponse.Data.List.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setActive(_ctx.booleanValue("ListUnassignedNumbersResponse.Data.List["+ i +"].Active"));
			phoneNumber.setCity(_ctx.stringValue("ListUnassignedNumbersResponse.Data.List["+ i +"].City"));
			phoneNumber.setNumber(_ctx.stringValue("ListUnassignedNumbersResponse.Data.List["+ i +"].Number"));
			phoneNumber.setProvince(_ctx.stringValue("ListUnassignedNumbersResponse.Data.List["+ i +"].Province"));
			phoneNumber.setUsage(_ctx.booleanValue("ListUnassignedNumbersResponse.Data.List["+ i +"].Usage"));

			list.add(phoneNumber);
		}
		data.setList(list);
		listUnassignedNumbersResponse.setData(data);
	 
	 	return listUnassignedNumbersResponse;
	}
}