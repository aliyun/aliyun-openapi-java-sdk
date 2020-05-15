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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListRpcServicesResponse;
import com.aliyuncs.iovcc.model.v20180501.ListRpcServicesResponse.RpcServices;
import com.aliyuncs.iovcc.model.v20180501.ListRpcServicesResponse.RpcServices.ListItem;
import com.aliyuncs.iovcc.model.v20180501.ListRpcServicesResponse.RpcServices.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRpcServicesResponseUnmarshaller {

	public static ListRpcServicesResponse unmarshall(ListRpcServicesResponse listRpcServicesResponse, UnmarshallerContext _ctx) {
		
		listRpcServicesResponse.setRequestId(_ctx.stringValue("ListRpcServicesResponse.RequestId"));

		RpcServices rpcServices = new RpcServices();

		Pagination pagination = new Pagination();
		pagination.setTotalCount(_ctx.integerValue("ListRpcServicesResponse.RpcServices.Pagination.TotalCount"));
		pagination.setTotalPageCount(_ctx.integerValue("ListRpcServicesResponse.RpcServices.Pagination.TotalPageCount"));
		pagination.setPageIndex(_ctx.integerValue("ListRpcServicesResponse.RpcServices.Pagination.PageIndex"));
		pagination.setPageSize(_ctx.integerValue("ListRpcServicesResponse.RpcServices.Pagination.PageSize"));
		rpcServices.setPagination(pagination);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRpcServicesResponse.RpcServices.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.longValue("ListRpcServicesResponse.RpcServices.List["+ i +"].Id"));
			listItem.setAppKey(_ctx.stringValue("ListRpcServicesResponse.RpcServices.List["+ i +"].AppKey"));
			listItem.setInterfaceName(_ctx.stringValue("ListRpcServicesResponse.RpcServices.List["+ i +"].InterfaceName"));
			listItem.setGroupName(_ctx.stringValue("ListRpcServicesResponse.RpcServices.List["+ i +"].GroupName"));
			listItem.setType(_ctx.stringValue("ListRpcServicesResponse.RpcServices.List["+ i +"].Type"));
			listItem.setParams(_ctx.stringValue("ListRpcServicesResponse.RpcServices.List["+ i +"].Params"));
			listItem.setIsDelete(_ctx.stringValue("ListRpcServicesResponse.RpcServices.List["+ i +"].IsDelete"));
			listItem.setGmtCreate(_ctx.longValue("ListRpcServicesResponse.RpcServices.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.longValue("ListRpcServicesResponse.RpcServices.List["+ i +"].GmtModified"));
			listItem.setMethodName(_ctx.stringValue("ListRpcServicesResponse.RpcServices.List["+ i +"].MethodName"));
			listItem.setVersionCode(_ctx.stringValue("ListRpcServicesResponse.RpcServices.List["+ i +"].VersionCode"));

			list.add(listItem);
		}
		rpcServices.setList(list);
		listRpcServicesResponse.setRpcServices(rpcServices);
	 
	 	return listRpcServicesResponse;
	}
}