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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cccxspaceinner.model.v20191227.QueryRolesByBuIdResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.QueryRolesByBuIdResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRolesByBuIdResponseUnmarshaller {

	public static QueryRolesByBuIdResponse unmarshall(QueryRolesByBuIdResponse queryRolesByBuIdResponse, UnmarshallerContext _ctx) {
		
		queryRolesByBuIdResponse.setSuccess(_ctx.booleanValue("QueryRolesByBuIdResponse.Success"));
		queryRolesByBuIdResponse.setCode(_ctx.stringValue("QueryRolesByBuIdResponse.Code"));
		queryRolesByBuIdResponse.setMessage(_ctx.stringValue("QueryRolesByBuIdResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRolesByBuIdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBuId(_ctx.longValue("QueryRolesByBuIdResponse.Data["+ i +"].BuId"));
			dataItem.setRoleId(_ctx.longValue("QueryRolesByBuIdResponse.Data["+ i +"].RoleId"));
			dataItem.setRoleCode(_ctx.stringValue("QueryRolesByBuIdResponse.Data["+ i +"].RoleCode"));
			dataItem.setRoleName(_ctx.stringValue("QueryRolesByBuIdResponse.Data["+ i +"].RoleName"));

			data.add(dataItem);
		}
		queryRolesByBuIdResponse.setData(data);
	 
	 	return queryRolesByBuIdResponse;
	}
}