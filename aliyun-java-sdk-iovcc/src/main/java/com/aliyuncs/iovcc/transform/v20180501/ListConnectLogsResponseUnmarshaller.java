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

import com.aliyuncs.iovcc.model.v20180501.ListConnectLogsResponse;
import com.aliyuncs.iovcc.model.v20180501.ListConnectLogsResponse.Logs;
import com.aliyuncs.iovcc.model.v20180501.ListConnectLogsResponse.Logs.Pagination;
import com.aliyuncs.iovcc.model.v20180501.ListConnectLogsResponse.Logs.分页查询列表数据;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConnectLogsResponseUnmarshaller {

	public static ListConnectLogsResponse unmarshall(ListConnectLogsResponse listConnectLogsResponse, UnmarshallerContext _ctx) {
		
		listConnectLogsResponse.setRequestId(_ctx.stringValue("ListConnectLogsResponse.RequestId"));

		Logs logs = new Logs();

		Pagination pagination = new Pagination();
		pagination.setTotalCount(_ctx.integerValue("ListConnectLogsResponse.Logs.Pagination.TotalCount"));
		pagination.setTotalPageCount(_ctx.integerValue("ListConnectLogsResponse.Logs.Pagination.TotalPageCount"));
		pagination.setPageIndex(_ctx.integerValue("ListConnectLogsResponse.Logs.Pagination.PageIndex"));
		pagination.setPageSize(_ctx.integerValue("ListConnectLogsResponse.Logs.Pagination.PageSize"));
		logs.setPagination(pagination);

		List<分页查询列表数据> list = new ArrayList<分页查询列表数据>();
		for (int i = 0; i < _ctx.lengthValue("ListConnectLogsResponse.Logs.List.Length"); i++) {
			分页查询列表数据 分页查询列表数据 = new 分页查询列表数据();
			分页查询列表数据.setDeviceId(_ctx.stringValue("ListConnectLogsResponse.Logs.List["+ i +"].DeviceId"));
			分页查询列表数据.setSystemVersion(_ctx.stringValue("ListConnectLogsResponse.Logs.List["+ i +"].SystemVersion"));
			分页查询列表数据.setTerminal(_ctx.stringValue("ListConnectLogsResponse.Logs.List["+ i +"].Terminal"));
			分页查询列表数据.setIp(_ctx.stringValue("ListConnectLogsResponse.Logs.List["+ i +"].Ip"));
			分页查询列表数据.setNetWorking(_ctx.stringValue("ListConnectLogsResponse.Logs.List["+ i +"].NetWorking"));
			分页查询列表数据.setTime(_ctx.longValue("ListConnectLogsResponse.Logs.List["+ i +"].Time"));
			分页查询列表数据.setStatus(_ctx.stringValue("ListConnectLogsResponse.Logs.List["+ i +"].Status"));
			分页查询列表数据.setSid(_ctx.stringValue("ListConnectLogsResponse.Logs.List["+ i +"].Sid"));

			list.add(分页查询列表数据);
		}
		logs.setList(list);
		listConnectLogsResponse.setLogs(logs);
	 
	 	return listConnectLogsResponse;
	}
}