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

import com.aliyuncs.educloud.model.v20220202.ListLabsResponse;
import com.aliyuncs.educloud.model.v20220202.ListLabsResponse.Data;
import com.aliyuncs.educloud.model.v20220202.ListLabsResponse.Data.Lab;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLabsResponseUnmarshaller {

	public static ListLabsResponse unmarshall(ListLabsResponse listLabsResponse, UnmarshallerContext _ctx) {
		
		listLabsResponse.setRequestId(_ctx.stringValue("ListLabsResponse.RequestId"));
		listLabsResponse.setSuccess(_ctx.booleanValue("ListLabsResponse.Success"));
		listLabsResponse.setCode(_ctx.longValue("ListLabsResponse.Code"));
		listLabsResponse.setMessage(_ctx.stringValue("ListLabsResponse.Message"));

		Data data = new Data();
		data.setPage(_ctx.longValue("ListLabsResponse.Data.Page"));
		data.setPageSize(_ctx.longValue("ListLabsResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListLabsResponse.Data.Total"));

		List<Lab> list = new ArrayList<Lab>();
		for (int i = 0; i < _ctx.lengthValue("ListLabsResponse.Data.List.Length"); i++) {
			Lab lab = new Lab();
			lab.setLabId(_ctx.stringValue("ListLabsResponse.Data.List["+ i +"].LabId"));
			lab.setTitle(_ctx.stringValue("ListLabsResponse.Data.List["+ i +"].Title"));
			lab.setDescription(_ctx.stringValue("ListLabsResponse.Data.List["+ i +"].Description"));
			lab.setCategory(_ctx.stringValue("ListLabsResponse.Data.List["+ i +"].Category"));
			lab.setTime(_ctx.stringValue("ListLabsResponse.Data.List["+ i +"].Time"));
			lab.setTag(_ctx.stringValue("ListLabsResponse.Data.List["+ i +"].Tag"));

			list.add(lab);
		}
		data.setList(list);
		listLabsResponse.setData(data);
	 
	 	return listLabsResponse;
	}
}