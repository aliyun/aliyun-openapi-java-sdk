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

import com.aliyuncs.ccc.model.v20200701.ListOutboundNumbersOfUserResponse;
import com.aliyuncs.ccc.model.v20200701.ListOutboundNumbersOfUserResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListOutboundNumbersOfUserResponse.Data.PhoneNumber;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOutboundNumbersOfUserResponseUnmarshaller {

	public static ListOutboundNumbersOfUserResponse unmarshall(ListOutboundNumbersOfUserResponse listOutboundNumbersOfUserResponse, UnmarshallerContext _ctx) {
		
		listOutboundNumbersOfUserResponse.setRequestId(_ctx.stringValue("ListOutboundNumbersOfUserResponse.RequestId"));
		listOutboundNumbersOfUserResponse.setCode(_ctx.stringValue("ListOutboundNumbersOfUserResponse.Code"));
		listOutboundNumbersOfUserResponse.setHttpStatusCode(_ctx.integerValue("ListOutboundNumbersOfUserResponse.HttpStatusCode"));
		listOutboundNumbersOfUserResponse.setMessage(_ctx.stringValue("ListOutboundNumbersOfUserResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListOutboundNumbersOfUserResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListOutboundNumbersOfUserResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListOutboundNumbersOfUserResponse.Data.TotalCount"));

		List<PhoneNumber> list = new ArrayList<PhoneNumber>();
		for (int i = 0; i < _ctx.lengthValue("ListOutboundNumbersOfUserResponse.Data.List.Length"); i++) {
			PhoneNumber phoneNumber = new PhoneNumber();
			phoneNumber.setCity(_ctx.stringValue("ListOutboundNumbersOfUserResponse.Data.List["+ i +"].City"));
			phoneNumber.setNumber(_ctx.stringValue("ListOutboundNumbersOfUserResponse.Data.List["+ i +"].Number"));
			phoneNumber.setProvince(_ctx.stringValue("ListOutboundNumbersOfUserResponse.Data.List["+ i +"].Province"));

			list.add(phoneNumber);
		}
		data.setList(list);
		listOutboundNumbersOfUserResponse.setData(data);
	 
	 	return listOutboundNumbersOfUserResponse;
	}
}