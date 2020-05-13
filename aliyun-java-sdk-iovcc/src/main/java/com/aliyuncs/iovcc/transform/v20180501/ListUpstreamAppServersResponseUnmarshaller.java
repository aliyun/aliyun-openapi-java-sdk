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

import com.aliyuncs.iovcc.model.v20180501.ListUpstreamAppServersResponse;
import com.aliyuncs.iovcc.model.v20180501.ListUpstreamAppServersResponse.AppServers;
import com.aliyuncs.iovcc.model.v20180501.ListUpstreamAppServersResponse.AppServers.ListItem;
import com.aliyuncs.iovcc.model.v20180501.ListUpstreamAppServersResponse.AppServers.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUpstreamAppServersResponseUnmarshaller {

	public static ListUpstreamAppServersResponse unmarshall(ListUpstreamAppServersResponse listUpstreamAppServersResponse, UnmarshallerContext _ctx) {
		
		listUpstreamAppServersResponse.setRequestId(_ctx.stringValue("ListUpstreamAppServersResponse.RequestId"));

		AppServers appServers = new AppServers();

		Pagination pagination = new Pagination();
		pagination.setTotalCount(_ctx.integerValue("ListUpstreamAppServersResponse.AppServers.Pagination.TotalCount"));
		pagination.setTotalPageCount(_ctx.integerValue("ListUpstreamAppServersResponse.AppServers.Pagination.TotalPageCount"));
		pagination.setPageIndex(_ctx.integerValue("ListUpstreamAppServersResponse.AppServers.Pagination.PageIndex"));
		pagination.setPageSize(_ctx.integerValue("ListUpstreamAppServersResponse.AppServers.Pagination.PageSize"));
		appServers.setPagination(pagination);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUpstreamAppServersResponse.AppServers.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.longValue("ListUpstreamAppServersResponse.AppServers.List["+ i +"].Id"));
			listItem.setPAppKey(_ctx.stringValue("ListUpstreamAppServersResponse.AppServers.List["+ i +"].PAppKey"));
			listItem.setProjectId(_ctx.stringValue("ListUpstreamAppServersResponse.AppServers.List["+ i +"].ProjectId"));
			listItem.setName(_ctx.stringValue("ListUpstreamAppServersResponse.AppServers.List["+ i +"].Name"));
			listItem.setTags(_ctx.stringValue("ListUpstreamAppServersResponse.AppServers.List["+ i +"].Tags"));
			listItem.setGmtCreate(_ctx.longValue("ListUpstreamAppServersResponse.AppServers.List["+ i +"].GmtCreate"));
			listItem.setGmtModified(_ctx.longValue("ListUpstreamAppServersResponse.AppServers.List["+ i +"].GmtModified"));
			listItem.setQueueNameList(_ctx.stringValue("ListUpstreamAppServersResponse.AppServers.List["+ i +"].QueueNameList"));

			list.add(listItem);
		}
		appServers.setList(list);
		listUpstreamAppServersResponse.setAppServers(appServers);
	 
	 	return listUpstreamAppServersResponse;
	}
}