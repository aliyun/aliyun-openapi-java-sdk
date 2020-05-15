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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePurifyPlansResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePurifyPlansResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePurifyPlansResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePurifyPlansResponseUnmarshaller {

	public static QueryDevicePurifyPlansResponse unmarshall(QueryDevicePurifyPlansResponse queryDevicePurifyPlansResponse, UnmarshallerContext _ctx) {
		
		queryDevicePurifyPlansResponse.setRequestId(_ctx.stringValue("QueryDevicePurifyPlansResponse.RequestId"));
		queryDevicePurifyPlansResponse.setSuccess(_ctx.booleanValue("QueryDevicePurifyPlansResponse.Success"));
		queryDevicePurifyPlansResponse.setErrorMessage(_ctx.stringValue("QueryDevicePurifyPlansResponse.ErrorMessage"));
		queryDevicePurifyPlansResponse.setCode(_ctx.stringValue("QueryDevicePurifyPlansResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryDevicePurifyPlansResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryDevicePurifyPlansResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("QueryDevicePurifyPlansResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryDevicePurifyPlansResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDevicePurifyPlansResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setPlanId(_ctx.stringValue("QueryDevicePurifyPlansResponse.Data.List["+ i +"].PlanId"));
			listItem.setTenantId(_ctx.stringValue("QueryDevicePurifyPlansResponse.Data.List["+ i +"].TenantId"));
			listItem.setUserId(_ctx.stringValue("QueryDevicePurifyPlansResponse.Data.List["+ i +"].UserId"));
			listItem.setProductKey(_ctx.stringValue("QueryDevicePurifyPlansResponse.Data.List["+ i +"].ProductKey"));
			listItem.setDeviceName(_ctx.stringValue("QueryDevicePurifyPlansResponse.Data.List["+ i +"].DeviceName"));
			listItem.setIotId(_ctx.stringValue("QueryDevicePurifyPlansResponse.Data.List["+ i +"].IotId"));
			listItem.setStartTime(_ctx.integerValue("QueryDevicePurifyPlansResponse.Data.List["+ i +"].StartTime"));
			listItem.setEndTime(_ctx.integerValue("QueryDevicePurifyPlansResponse.Data.List["+ i +"].EndTime"));

			list.add(listItem);
		}
		data.setList(list);
		queryDevicePurifyPlansResponse.setData(data);
	 
	 	return queryDevicePurifyPlansResponse;
	}
}