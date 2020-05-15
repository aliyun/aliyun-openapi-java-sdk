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

package com.aliyuncs.agency.transform.v20200324;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20200324.QueryBpmsListResponse;
import com.aliyuncs.agency.model.v20200324.QueryBpmsListResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBpmsListResponseUnmarshaller {

	public static QueryBpmsListResponse unmarshall(QueryBpmsListResponse queryBpmsListResponse, UnmarshallerContext _ctx) {
		
		queryBpmsListResponse.setRequestId(_ctx.stringValue("QueryBpmsListResponse.RequestId"));
		queryBpmsListResponse.setCode(_ctx.stringValue("QueryBpmsListResponse.Code"));
		queryBpmsListResponse.setSuccess(_ctx.booleanValue("QueryBpmsListResponse.Success"));
		queryBpmsListResponse.setTotal(_ctx.integerValue("QueryBpmsListResponse.Total"));
		queryBpmsListResponse.setPageNo(_ctx.integerValue("QueryBpmsListResponse.PageNo"));
		queryBpmsListResponse.setPageSize(_ctx.integerValue("QueryBpmsListResponse.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryBpmsListResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setId(_ctx.longValue("QueryBpmsListResponse.List["+ i +"].Id"));
			listItem.setPartnerPk(_ctx.longValue("QueryBpmsListResponse.List["+ i +"].PartnerPk"));
			listItem.setCustomerName(_ctx.stringValue("QueryBpmsListResponse.List["+ i +"].CustomerName"));
			listItem.setAuditStatus(_ctx.integerValue("QueryBpmsListResponse.List["+ i +"].AuditStatus"));
			listItem.setCustomerRptType(_ctx.integerValue("QueryBpmsListResponse.List["+ i +"].CustomerRptType"));
			listItem.setApplyTime(_ctx.stringValue("QueryBpmsListResponse.List["+ i +"].ApplyTime"));
			listItem.setExpireTime(_ctx.stringValue("QueryBpmsListResponse.List["+ i +"].ExpireTime"));
			listItem.setApplyRemarks(_ctx.stringValue("QueryBpmsListResponse.List["+ i +"].ApplyRemarks"));

			list.add(listItem);
		}
		queryBpmsListResponse.setList(list);
	 
	 	return queryBpmsListResponse;
	}
}