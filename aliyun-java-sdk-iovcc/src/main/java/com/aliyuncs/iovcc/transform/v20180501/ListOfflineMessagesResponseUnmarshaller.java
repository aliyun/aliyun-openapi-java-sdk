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

import com.aliyuncs.iovcc.model.v20180501.ListOfflineMessagesResponse;
import com.aliyuncs.iovcc.model.v20180501.ListOfflineMessagesResponse.OfflineMessages;
import com.aliyuncs.iovcc.model.v20180501.ListOfflineMessagesResponse.OfflineMessages.Pagination;
import com.aliyuncs.iovcc.model.v20180501.ListOfflineMessagesResponse.OfflineMessages.分页查询列表数据;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOfflineMessagesResponseUnmarshaller {

	public static ListOfflineMessagesResponse unmarshall(ListOfflineMessagesResponse listOfflineMessagesResponse, UnmarshallerContext _ctx) {
		
		listOfflineMessagesResponse.setRequestId(_ctx.stringValue("ListOfflineMessagesResponse.RequestId"));

		OfflineMessages offlineMessages = new OfflineMessages();

		Pagination pagination = new Pagination();
		pagination.setTotalCount(_ctx.integerValue("ListOfflineMessagesResponse.OfflineMessages.Pagination.TotalCount"));
		pagination.setTotalPageCount(_ctx.integerValue("ListOfflineMessagesResponse.OfflineMessages.Pagination.TotalPageCount"));
		pagination.setPageIndex(_ctx.integerValue("ListOfflineMessagesResponse.OfflineMessages.Pagination.PageIndex"));
		pagination.setPageSize(_ctx.integerValue("ListOfflineMessagesResponse.OfflineMessages.Pagination.PageSize"));
		offlineMessages.setPagination(pagination);

		List<分页查询列表数据> list = new ArrayList<分页查询列表数据>();
		for (int i = 0; i < _ctx.lengthValue("ListOfflineMessagesResponse.OfflineMessages.List.Length"); i++) {
			分页查询列表数据 分页查询列表数据 = new 分页查询列表数据();
			分页查询列表数据.setMid(_ctx.longValue("ListOfflineMessagesResponse.OfflineMessages.List["+ i +"].Mid"));
			分页查询列表数据.setGmtCreate(_ctx.longValue("ListOfflineMessagesResponse.OfflineMessages.List["+ i +"].GmtCreate"));
			分页查询列表数据.setExpiredTime(_ctx.longValue("ListOfflineMessagesResponse.OfflineMessages.List["+ i +"].ExpiredTime"));

			list.add(分页查询列表数据);
		}
		offlineMessages.setList(list);
		listOfflineMessagesResponse.setOfflineMessages(offlineMessages);
	 
	 	return listOfflineMessagesResponse;
	}
}