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

package com.aliyuncs.schedulerx3.transform.v20240624;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.schedulerx3.model.v20240624.ListAppNamesResponse;
import com.aliyuncs.schedulerx3.model.v20240624.ListAppNamesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppNamesResponseUnmarshaller {

	public static ListAppNamesResponse unmarshall(ListAppNamesResponse listAppNamesResponse, UnmarshallerContext _ctx) {
		
		listAppNamesResponse.setRequestId(_ctx.stringValue("ListAppNamesResponse.RequestId"));
		listAppNamesResponse.setCode(_ctx.integerValue("ListAppNamesResponse.Code"));
		listAppNamesResponse.setMessage(_ctx.stringValue("ListAppNamesResponse.Message"));
		listAppNamesResponse.setSuccess(_ctx.booleanValue("ListAppNamesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAppNamesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListAppNamesResponse.Data["+ i +"].Id"));
			dataItem.setAppName(_ctx.stringValue("ListAppNamesResponse.Data["+ i +"].AppName"));
			dataItem.setTitle(_ctx.stringValue("ListAppNamesResponse.Data["+ i +"].Title"));
			dataItem.setAppGroupId(_ctx.stringValue("ListAppNamesResponse.Data["+ i +"].AppGroupId"));

			data.add(dataItem);
		}
		listAppNamesResponse.setData(data);
	 
	 	return listAppNamesResponse;
	}
}