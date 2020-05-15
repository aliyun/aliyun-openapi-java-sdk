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

import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePurifyJobsResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePurifyJobsResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryDevicePurifyJobsResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDevicePurifyJobsResponseUnmarshaller {

	public static QueryDevicePurifyJobsResponse unmarshall(QueryDevicePurifyJobsResponse queryDevicePurifyJobsResponse, UnmarshallerContext _ctx) {
		
		queryDevicePurifyJobsResponse.setRequestId(_ctx.stringValue("QueryDevicePurifyJobsResponse.RequestId"));
		queryDevicePurifyJobsResponse.setSuccess(_ctx.booleanValue("QueryDevicePurifyJobsResponse.Success"));
		queryDevicePurifyJobsResponse.setErrorMessage(_ctx.stringValue("QueryDevicePurifyJobsResponse.ErrorMessage"));
		queryDevicePurifyJobsResponse.setCode(_ctx.stringValue("QueryDevicePurifyJobsResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryDevicePurifyJobsResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryDevicePurifyJobsResponse.Data.PageCount"));
		data.setCurrentPage(_ctx.integerValue("QueryDevicePurifyJobsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryDevicePurifyJobsResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDevicePurifyJobsResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setPlanId(_ctx.stringValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].PlanId"));
			listItem.setTenantId(_ctx.stringValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].TenantId"));
			listItem.setUserId(_ctx.stringValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].UserId"));
			listItem.setProductKey(_ctx.stringValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].ProductKey"));
			listItem.setDeviceName(_ctx.stringValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].DeviceName"));
			listItem.setIotId(_ctx.stringValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].IotId"));
			listItem.setStartTime(_ctx.longValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].StartTime"));
			listItem.setEndTime(_ctx.longValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].EndTime"));
			listItem.setJobId(_ctx.stringValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].JobId"));
			listItem.setPurifyRecordNameUrl(_ctx.stringValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].PurifyRecordNameUrl"));
			listItem.setPurifyRecordIndexUrl(_ctx.stringValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].PurifyRecordIndexUrl"));
			listItem.setStatus(_ctx.integerValue("QueryDevicePurifyJobsResponse.Data.List["+ i +"].Status"));

			list.add(listItem);
		}
		data.setList(list);
		queryDevicePurifyJobsResponse.setData(data);
	 
	 	return queryDevicePurifyJobsResponse;
	}
}