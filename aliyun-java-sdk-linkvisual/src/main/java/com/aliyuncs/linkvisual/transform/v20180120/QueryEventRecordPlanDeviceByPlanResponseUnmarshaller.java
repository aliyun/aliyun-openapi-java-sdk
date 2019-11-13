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

import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDeviceByPlanResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDeviceByPlanResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryEventRecordPlanDeviceByPlanResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEventRecordPlanDeviceByPlanResponseUnmarshaller {

	public static QueryEventRecordPlanDeviceByPlanResponse unmarshall(QueryEventRecordPlanDeviceByPlanResponse queryEventRecordPlanDeviceByPlanResponse, UnmarshallerContext _ctx) {
		
		queryEventRecordPlanDeviceByPlanResponse.setRequestId(_ctx.stringValue("QueryEventRecordPlanDeviceByPlanResponse.RequestId"));
		queryEventRecordPlanDeviceByPlanResponse.setSuccess(_ctx.booleanValue("QueryEventRecordPlanDeviceByPlanResponse.Success"));
		queryEventRecordPlanDeviceByPlanResponse.setErrorMessage(_ctx.stringValue("QueryEventRecordPlanDeviceByPlanResponse.ErrorMessage"));
		queryEventRecordPlanDeviceByPlanResponse.setCode(_ctx.stringValue("QueryEventRecordPlanDeviceByPlanResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryEventRecordPlanDeviceByPlanResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryEventRecordPlanDeviceByPlanResponse.Data.PageCount"));
		data.setPage(_ctx.integerValue("QueryEventRecordPlanDeviceByPlanResponse.Data.Page"));
		data.setPageSize(_ctx.integerValue("QueryEventRecordPlanDeviceByPlanResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryEventRecordPlanDeviceByPlanResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setIotId(_ctx.stringValue("QueryEventRecordPlanDeviceByPlanResponse.Data.List["+ i +"].IotId"));
			listItem.setStreamType(_ctx.integerValue("QueryEventRecordPlanDeviceByPlanResponse.Data.List["+ i +"].StreamType"));

			list.add(listItem);
		}
		data.setList(list);
		queryEventRecordPlanDeviceByPlanResponse.setData(data);
	 
	 	return queryEventRecordPlanDeviceByPlanResponse;
	}
}