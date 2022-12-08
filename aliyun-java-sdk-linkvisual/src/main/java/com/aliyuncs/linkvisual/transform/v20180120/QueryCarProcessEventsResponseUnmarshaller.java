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

import com.aliyuncs.linkvisual.model.v20180120.QueryCarProcessEventsResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryCarProcessEventsResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryCarProcessEventsResponse.Data.PageDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCarProcessEventsResponseUnmarshaller {

	public static QueryCarProcessEventsResponse unmarshall(QueryCarProcessEventsResponse queryCarProcessEventsResponse, UnmarshallerContext _ctx) {
		
		queryCarProcessEventsResponse.setRequestId(_ctx.stringValue("QueryCarProcessEventsResponse.RequestId"));
		queryCarProcessEventsResponse.setCode(_ctx.stringValue("QueryCarProcessEventsResponse.Code"));
		queryCarProcessEventsResponse.setErrorMessage(_ctx.stringValue("QueryCarProcessEventsResponse.ErrorMessage"));
		queryCarProcessEventsResponse.setSuccess(_ctx.booleanValue("QueryCarProcessEventsResponse.Success"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("QueryCarProcessEventsResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.integerValue("QueryCarProcessEventsResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("QueryCarProcessEventsResponse.Data.Total"));
		data.setPageCount(_ctx.integerValue("QueryCarProcessEventsResponse.Data.PageCount"));

		List<PageDataItem> pageData = new ArrayList<PageDataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCarProcessEventsResponse.Data.PageData.Length"); i++) {
			PageDataItem pageDataItem = new PageDataItem();
			pageDataItem.setEventPicUrl(_ctx.stringValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].EventPicUrl"));
			pageDataItem.setEventTime(_ctx.longValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].EventTime"));
			pageDataItem.setActionType(_ctx.integerValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].ActionType"));
			pageDataItem.setConfidence(_ctx.integerValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].Confidence"));
			pageDataItem.setSubProductKey(_ctx.stringValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].SubProductKey"));
			pageDataItem.setEventId(_ctx.stringValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].EventId"));
			pageDataItem.setSubIotId(_ctx.stringValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].SubIotId"));
			pageDataItem.setAreaIndex(_ctx.integerValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].AreaIndex"));
			pageDataItem.setEventType(_ctx.integerValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].EventType"));
			pageDataItem.setEventPicId(_ctx.stringValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].EventPicId"));
			pageDataItem.setTaskId(_ctx.stringValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].TaskId"));
			pageDataItem.setSubDeviceName(_ctx.stringValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].SubDeviceName"));
			pageDataItem.setIotId(_ctx.stringValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].IotId"));
			pageDataItem.setSubDeviceNickName(_ctx.stringValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].SubDeviceNickName"));
			pageDataItem.setPlateNo(_ctx.stringValue("QueryCarProcessEventsResponse.Data.PageData["+ i +"].PlateNo"));

			pageData.add(pageDataItem);
		}
		data.setPageData(pageData);
		queryCarProcessEventsResponse.setData(data);
	 
	 	return queryCarProcessEventsResponse;
	}
}