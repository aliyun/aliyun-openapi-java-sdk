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

import com.aliyuncs.ccc.model.v20200701.ListPrivilegesOfUserResponse;
import com.aliyuncs.ccc.model.v20200701.ListPrivilegesOfUserResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPrivilegesOfUserResponseUnmarshaller {

	public static ListPrivilegesOfUserResponse unmarshall(ListPrivilegesOfUserResponse listPrivilegesOfUserResponse, UnmarshallerContext _ctx) {
		
		listPrivilegesOfUserResponse.setRequestId(_ctx.stringValue("ListPrivilegesOfUserResponse.RequestId"));
		listPrivilegesOfUserResponse.setCode(_ctx.stringValue("ListPrivilegesOfUserResponse.Code"));
		listPrivilegesOfUserResponse.setHttpStatusCode(_ctx.integerValue("ListPrivilegesOfUserResponse.HttpStatusCode"));
		listPrivilegesOfUserResponse.setMessage(_ctx.stringValue("ListPrivilegesOfUserResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPrivilegesOfUserResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setInstanceId(_ctx.stringValue("ListPrivilegesOfUserResponse.Data["+ i +"].InstanceId"));
			dataItem.setName(_ctx.stringValue("ListPrivilegesOfUserResponse.Data["+ i +"].Name"));
			dataItem.setScope(_ctx.stringValue("ListPrivilegesOfUserResponse.Data["+ i +"].Scope"));

			data.add(dataItem);
		}
		listPrivilegesOfUserResponse.setData(data);
	 
	 	return listPrivilegesOfUserResponse;
	}
}