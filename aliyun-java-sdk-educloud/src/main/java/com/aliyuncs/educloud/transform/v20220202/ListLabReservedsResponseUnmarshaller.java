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

package com.aliyuncs.educloud.transform.v20220202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.educloud.model.v20220202.ListLabReservedsResponse;
import com.aliyuncs.educloud.model.v20220202.ListLabReservedsResponse.Data;
import com.aliyuncs.educloud.model.v20220202.ListLabReservedsResponse.Data.LabReserved;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabReservedsResponseUnmarshaller {

	public static ListLabReservedsResponse unmarshall(ListLabReservedsResponse listLabReservedsResponse, UnmarshallerContext _ctx) {
		
		listLabReservedsResponse.setRequestId(_ctx.stringValue("ListLabReservedsResponse.RequestId"));
		listLabReservedsResponse.setSuccess(_ctx.booleanValue("ListLabReservedsResponse.Success"));
		listLabReservedsResponse.setCode(_ctx.longValue("ListLabReservedsResponse.Code"));
		listLabReservedsResponse.setMessage(_ctx.stringValue("ListLabReservedsResponse.Message"));

		Data data = new Data();
		data.setPage(_ctx.longValue("ListLabReservedsResponse.Data.Page"));
		data.setPageSize(_ctx.longValue("ListLabReservedsResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListLabReservedsResponse.Data.Total"));

		List<LabReserved> list = new ArrayList<LabReserved>();
		for (int i = 0; i < _ctx.lengthValue("ListLabReservedsResponse.Data.List.Length"); i++) {
			LabReserved labReserved = new LabReserved();
			labReserved.setReservedId(_ctx.stringValue("ListLabReservedsResponse.Data.List["+ i +"].ReservedId"));
			labReserved.setLabId(_ctx.stringValue("ListLabReservedsResponse.Data.List["+ i +"].LabId"));
			labReserved.setLabTitle(_ctx.stringValue("ListLabReservedsResponse.Data.List["+ i +"].LabTitle"));
			labReserved.setStartTime(_ctx.longValue("ListLabReservedsResponse.Data.List["+ i +"].StartTime"));
			labReserved.setEndTime(_ctx.longValue("ListLabReservedsResponse.Data.List["+ i +"].EndTime"));
			labReserved.setNumber(_ctx.longValue("ListLabReservedsResponse.Data.List["+ i +"].Number"));
			labReserved.setStatus(_ctx.longValue("ListLabReservedsResponse.Data.List["+ i +"].Status"));

			list.add(labReserved);
		}
		data.setList(list);
		listLabReservedsResponse.setData(data);
	 
	 	return listLabReservedsResponse;
	}
}