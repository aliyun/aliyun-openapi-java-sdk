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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.EventCenterQueryEventsResponse;
import com.aliyuncs.eventbridge.model.v20200401.EventCenterQueryEventsResponse.Data;
import com.aliyuncs.eventbridge.model.v20200401.EventCenterQueryEventsResponse.Data.TableItem;
import com.aliyuncs.eventbridge.model.v20200401.EventCenterQueryEventsResponse.Data.TimeSeriesItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class EventCenterQueryEventsResponseUnmarshaller {

	public static EventCenterQueryEventsResponse unmarshall(EventCenterQueryEventsResponse eventCenterQueryEventsResponse, UnmarshallerContext _ctx) {
		
		eventCenterQueryEventsResponse.setRequestId(_ctx.stringValue("EventCenterQueryEventsResponse.RequestId"));
		eventCenterQueryEventsResponse.setMessage(_ctx.stringValue("EventCenterQueryEventsResponse.Message"));
		eventCenterQueryEventsResponse.setCode(_ctx.stringValue("EventCenterQueryEventsResponse.Code"));
		eventCenterQueryEventsResponse.setSuccess(_ctx.booleanValue("EventCenterQueryEventsResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("EventCenterQueryEventsResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("EventCenterQueryEventsResponse.Data.MaxResults"));
		data.setTotalCount(_ctx.integerValue("EventCenterQueryEventsResponse.Data.TotalCount"));

		List<TimeSeriesItem> timeSeries = new ArrayList<TimeSeriesItem>();
		for (int i = 0; i < _ctx.lengthValue("EventCenterQueryEventsResponse.Data.TimeSeries.Length"); i++) {
			TimeSeriesItem timeSeriesItem = new TimeSeriesItem();
			timeSeriesItem.setRowData(_ctx.mapValue("EventCenterQueryEventsResponse.Data.TimeSeries["+ i +"].RowData"));
			timeSeriesItem.setTime(_ctx.stringValue("EventCenterQueryEventsResponse.Data.TimeSeries["+ i +"].Time"));

			timeSeries.add(timeSeriesItem);
		}
		data.setTimeSeries(timeSeries);

		List<TableItem> table = new ArrayList<TableItem>();
		for (int i = 0; i < _ctx.lengthValue("EventCenterQueryEventsResponse.Data.Table.Length"); i++) {
			TableItem tableItem = new TableItem();
			tableItem.setRowData(_ctx.mapValue("EventCenterQueryEventsResponse.Data.Table["+ i +"].RowData"));

			table.add(tableItem);
		}
		data.setTable(table);
		eventCenterQueryEventsResponse.setData(data);
	 
	 	return eventCenterQueryEventsResponse;
	}
}