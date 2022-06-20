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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QuerySoundCodeScheduleListResponse;
import com.aliyuncs.iot.model.v20180120.QuerySoundCodeScheduleListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QuerySoundCodeScheduleListResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySoundCodeScheduleListResponseUnmarshaller {

	public static QuerySoundCodeScheduleListResponse unmarshall(QuerySoundCodeScheduleListResponse querySoundCodeScheduleListResponse, UnmarshallerContext _ctx) {
		
		querySoundCodeScheduleListResponse.setRequestId(_ctx.stringValue("QuerySoundCodeScheduleListResponse.RequestId"));
		querySoundCodeScheduleListResponse.setSuccess(_ctx.booleanValue("QuerySoundCodeScheduleListResponse.Success"));
		querySoundCodeScheduleListResponse.setCode(_ctx.stringValue("QuerySoundCodeScheduleListResponse.Code"));
		querySoundCodeScheduleListResponse.setErrorMessage(_ctx.stringValue("QuerySoundCodeScheduleListResponse.ErrorMessage"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("QuerySoundCodeScheduleListResponse.Data.Total"));
		data.setPageId(_ctx.integerValue("QuerySoundCodeScheduleListResponse.Data.PageId"));
		data.setPageSize(_ctx.integerValue("QuerySoundCodeScheduleListResponse.Data.PageSize"));

		List<Items> list = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("QuerySoundCodeScheduleListResponse.Data.List.Length"); i++) {
			Items items = new Items();
			items.setScheduleCode(_ctx.stringValue("QuerySoundCodeScheduleListResponse.Data.List["+ i +"].ScheduleCode"));
			items.setName(_ctx.stringValue("QuerySoundCodeScheduleListResponse.Data.List["+ i +"].Name"));
			items.setDescription(_ctx.stringValue("QuerySoundCodeScheduleListResponse.Data.List["+ i +"].Description"));
			items.setGmtCreate(_ctx.longValue("QuerySoundCodeScheduleListResponse.Data.List["+ i +"].GmtCreate"));
			items.setStatus(_ctx.stringValue("QuerySoundCodeScheduleListResponse.Data.List["+ i +"].Status"));
			items.setStartTime(_ctx.stringValue("QuerySoundCodeScheduleListResponse.Data.List["+ i +"].StartTime"));
			items.setEndTime(_ctx.stringValue("QuerySoundCodeScheduleListResponse.Data.List["+ i +"].EndTime"));
			items.setStartDate(_ctx.stringValue("QuerySoundCodeScheduleListResponse.Data.List["+ i +"].StartDate"));
			items.setEndDate(_ctx.stringValue("QuerySoundCodeScheduleListResponse.Data.List["+ i +"].EndDate"));
			items.setOpenType(_ctx.stringValue("QuerySoundCodeScheduleListResponse.Data.List["+ i +"].OpenType"));

			list.add(items);
		}
		data.setList(list);
		querySoundCodeScheduleListResponse.setData(data);
	 
	 	return querySoundCodeScheduleListResponse;
	}
}