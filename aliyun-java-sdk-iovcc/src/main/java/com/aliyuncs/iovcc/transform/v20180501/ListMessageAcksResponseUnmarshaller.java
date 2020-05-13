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

import com.aliyuncs.iovcc.model.v20180501.ListMessageAcksResponse;
import com.aliyuncs.iovcc.model.v20180501.ListMessageAcksResponse.MessageAcks;
import com.aliyuncs.iovcc.model.v20180501.ListMessageAcksResponse.MessageAcks.Pagination;
import com.aliyuncs.iovcc.model.v20180501.ListMessageAcksResponse.MessageAcks.分页查询列表数据;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMessageAcksResponseUnmarshaller {

	public static ListMessageAcksResponse unmarshall(ListMessageAcksResponse listMessageAcksResponse, UnmarshallerContext _ctx) {
		
		listMessageAcksResponse.setRequestId(_ctx.stringValue("ListMessageAcksResponse.RequestId"));

		MessageAcks messageAcks = new MessageAcks();

		Pagination pagination = new Pagination();
		pagination.setTotalCount(_ctx.integerValue("ListMessageAcksResponse.MessageAcks.Pagination.TotalCount"));
		pagination.setTotalPageCount(_ctx.integerValue("ListMessageAcksResponse.MessageAcks.Pagination.TotalPageCount"));
		pagination.setPageIndex(_ctx.integerValue("ListMessageAcksResponse.MessageAcks.Pagination.PageIndex"));
		pagination.setPageSize(_ctx.integerValue("ListMessageAcksResponse.MessageAcks.Pagination.PageSize"));
		messageAcks.setPagination(pagination);

		List<分页查询列表数据> list = new ArrayList<分页查询列表数据>();
		for (int i = 0; i < _ctx.lengthValue("ListMessageAcksResponse.MessageAcks.List.Length"); i++) {
			分页查询列表数据 分页查询列表数据 = new 分页查询列表数据();
			分页查询列表数据.setMid(_ctx.longValue("ListMessageAcksResponse.MessageAcks.List["+ i +"].Mid"));
			分页查询列表数据.setDeviceId(_ctx.stringValue("ListMessageAcksResponse.MessageAcks.List["+ i +"].DeviceId"));
			分页查询列表数据.setAckTime(_ctx.longValue("ListMessageAcksResponse.MessageAcks.List["+ i +"].AckTime"));

			list.add(分页查询列表数据);
		}
		messageAcks.setList(list);
		listMessageAcksResponse.setMessageAcks(messageAcks);
	 
	 	return listMessageAcksResponse;
	}
}