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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.SearchDataTrackResultResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.SearchDataTrackResultResponse.TrackResult;
import com.aliyuncs.dms_enterprise.model.v20181101.SearchDataTrackResultResponse.TrackResult.Event;
import com.aliyuncs.dms_enterprise.model.v20181101.SearchDataTrackResultResponse.TrackResult.TableInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.SearchDataTrackResultResponse.TrackResult.TableInfo.Column;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchDataTrackResultResponseUnmarshaller {

	public static SearchDataTrackResultResponse unmarshall(SearchDataTrackResultResponse searchDataTrackResultResponse, UnmarshallerContext _ctx) {
		
		searchDataTrackResultResponse.setRequestId(_ctx.stringValue("SearchDataTrackResultResponse.RequestId"));
		searchDataTrackResultResponse.setSuccess(_ctx.booleanValue("SearchDataTrackResultResponse.Success"));
		searchDataTrackResultResponse.setErrorMessage(_ctx.stringValue("SearchDataTrackResultResponse.ErrorMessage"));
		searchDataTrackResultResponse.setErrorCode(_ctx.stringValue("SearchDataTrackResultResponse.ErrorCode"));

		TrackResult trackResult = new TrackResult();
		trackResult.setTotalCount(_ctx.longValue("SearchDataTrackResultResponse.TrackResult.TotalCount"));

		List<Event> eventList = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("SearchDataTrackResultResponse.TrackResult.EventList.Length"); i++) {
			Event event = new Event();
			event.setEventLength(_ctx.longValue("SearchDataTrackResultResponse.TrackResult.EventList["+ i +"].EventLength"));
			event.setEventTimestamp(_ctx.stringValue("SearchDataTrackResultResponse.TrackResult.EventList["+ i +"].EventTimestamp"));
			event.setEventType(_ctx.stringValue("SearchDataTrackResultResponse.TrackResult.EventList["+ i +"].EventType"));
			event.setEventId(_ctx.longValue("SearchDataTrackResultResponse.TrackResult.EventList["+ i +"].EventId"));
			event.setRollSQL(_ctx.stringValue("SearchDataTrackResultResponse.TrackResult.EventList["+ i +"].RollSQL"));

			List<String> dataAfter = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchDataTrackResultResponse.TrackResult.EventList["+ i +"].DataAfter.Length"); j++) {
				dataAfter.add(_ctx.stringValue("SearchDataTrackResultResponse.TrackResult.EventList["+ i +"].DataAfter["+ j +"]"));
			}
			event.setDataAfter(dataAfter);

			List<String> dataBefore = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("SearchDataTrackResultResponse.TrackResult.EventList["+ i +"].DataBefore.Length"); j++) {
				dataBefore.add(_ctx.stringValue("SearchDataTrackResultResponse.TrackResult.EventList["+ i +"].DataBefore["+ j +"]"));
			}
			event.setDataBefore(dataBefore);

			eventList.add(event);
		}
		trackResult.setEventList(eventList);

		List<TableInfo> tableInfoList = new ArrayList<TableInfo>();
		for (int i = 0; i < _ctx.lengthValue("SearchDataTrackResultResponse.TrackResult.TableInfoList.Length"); i++) {
			TableInfo tableInfo = new TableInfo();
			tableInfo.setSchemaName(_ctx.stringValue("SearchDataTrackResultResponse.TrackResult.TableInfoList["+ i +"].SchemaName"));
			tableInfo.setTableName(_ctx.stringValue("SearchDataTrackResultResponse.TrackResult.TableInfoList["+ i +"].TableName"));
			tableInfo.setDescription(_ctx.stringValue("SearchDataTrackResultResponse.TrackResult.TableInfoList["+ i +"].Description"));

			List<Column> columns = new ArrayList<Column>();
			for (int j = 0; j < _ctx.lengthValue("SearchDataTrackResultResponse.TrackResult.TableInfoList["+ i +"].Columns.Length"); j++) {
				Column column = new Column();
				column.setColumnName(_ctx.stringValue("SearchDataTrackResultResponse.TrackResult.TableInfoList["+ i +"].Columns["+ j +"].ColumnName"));
				column.setColumnPosition(_ctx.integerValue("SearchDataTrackResultResponse.TrackResult.TableInfoList["+ i +"].Columns["+ j +"].ColumnPosition"));
				column.setColumnType(_ctx.stringValue("SearchDataTrackResultResponse.TrackResult.TableInfoList["+ i +"].Columns["+ j +"].ColumnType"));
				column.setFictive(_ctx.booleanValue("SearchDataTrackResultResponse.TrackResult.TableInfoList["+ i +"].Columns["+ j +"].Fictive"));

				columns.add(column);
			}
			tableInfo.setColumns(columns);

			tableInfoList.add(tableInfo);
		}
		trackResult.setTableInfoList(tableInfoList);
		searchDataTrackResultResponse.setTrackResult(trackResult);
	 
	 	return searchDataTrackResultResponse;
	}
}