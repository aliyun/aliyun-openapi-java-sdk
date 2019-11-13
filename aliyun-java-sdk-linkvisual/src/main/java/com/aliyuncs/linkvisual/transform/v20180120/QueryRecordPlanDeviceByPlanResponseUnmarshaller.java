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

import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDeviceByPlanResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDeviceByPlanResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryRecordPlanDeviceByPlanResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRecordPlanDeviceByPlanResponseUnmarshaller {

	public static QueryRecordPlanDeviceByPlanResponse unmarshall(QueryRecordPlanDeviceByPlanResponse queryRecordPlanDeviceByPlanResponse, UnmarshallerContext _ctx) {
		
		queryRecordPlanDeviceByPlanResponse.setRequestId(_ctx.stringValue("QueryRecordPlanDeviceByPlanResponse.RequestId"));
		queryRecordPlanDeviceByPlanResponse.setSuccess(_ctx.booleanValue("QueryRecordPlanDeviceByPlanResponse.Success"));
		queryRecordPlanDeviceByPlanResponse.setErrorMessage(_ctx.stringValue("QueryRecordPlanDeviceByPlanResponse.ErrorMessage"));
		queryRecordPlanDeviceByPlanResponse.setCode(_ctx.stringValue("QueryRecordPlanDeviceByPlanResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QueryRecordPlanDeviceByPlanResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryRecordPlanDeviceByPlanResponse.Data.PageCount"));
		data.setPage(_ctx.integerValue("QueryRecordPlanDeviceByPlanResponse.Data.Page"));
		data.setPageSize(_ctx.integerValue("QueryRecordPlanDeviceByPlanResponse.Data.PageSize"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRecordPlanDeviceByPlanResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setIotId(_ctx.stringValue("QueryRecordPlanDeviceByPlanResponse.Data.List["+ i +"].IotId"));
			listItem.setStreamType(_ctx.integerValue("QueryRecordPlanDeviceByPlanResponse.Data.List["+ i +"].StreamType"));

			list.add(listItem);
		}
		data.setList(list);
		queryRecordPlanDeviceByPlanResponse.setData(data);
	 
	 	return queryRecordPlanDeviceByPlanResponse;
	}
}