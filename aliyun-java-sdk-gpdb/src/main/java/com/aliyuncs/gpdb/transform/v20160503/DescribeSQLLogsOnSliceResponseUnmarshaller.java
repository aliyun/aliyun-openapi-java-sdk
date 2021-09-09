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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogsOnSliceResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeSQLLogsOnSliceResponse.SQLLogsSliceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLLogsOnSliceResponseUnmarshaller {

	public static DescribeSQLLogsOnSliceResponse unmarshall(DescribeSQLLogsOnSliceResponse describeSQLLogsOnSliceResponse, UnmarshallerContext _ctx) {
		
		describeSQLLogsOnSliceResponse.setRequestId(_ctx.stringValue("DescribeSQLLogsOnSliceResponse.RequestId"));
		describeSQLLogsOnSliceResponse.setPageRecordCount(_ctx.integerValue("DescribeSQLLogsOnSliceResponse.PageRecordCount"));
		describeSQLLogsOnSliceResponse.setPageNumber(_ctx.integerValue("DescribeSQLLogsOnSliceResponse.PageNumber"));

		List<SQLLogsSliceItem> sliceLogItems = new ArrayList<SQLLogsSliceItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLLogsOnSliceResponse.SliceLogItems.Length"); i++) {
			SQLLogsSliceItem sQLLogsSliceItem = new SQLLogsSliceItem();
			sQLLogsSliceItem.setExecuteStatus(_ctx.stringValue("DescribeSQLLogsOnSliceResponse.SliceLogItems["+ i +"].ExecuteStatus"));
			sQLLogsSliceItem.setExecuteCost(_ctx.floatValue("DescribeSQLLogsOnSliceResponse.SliceLogItems["+ i +"].ExecuteCost"));
			sQLLogsSliceItem.setReturnRowCounts(_ctx.longValue("DescribeSQLLogsOnSliceResponse.SliceLogItems["+ i +"].ReturnRowCounts"));
			sQLLogsSliceItem.setOperationExecuteTime(_ctx.stringValue("DescribeSQLLogsOnSliceResponse.SliceLogItems["+ i +"].OperationExecuteTime"));
			sQLLogsSliceItem.setSegmentId(_ctx.stringValue("DescribeSQLLogsOnSliceResponse.SliceLogItems["+ i +"].SegmentId"));
			sQLLogsSliceItem.setPeakMemory(_ctx.floatValue("DescribeSQLLogsOnSliceResponse.SliceLogItems["+ i +"].PeakMemory"));
			sQLLogsSliceItem.setOperationExecuteEndTime(_ctx.stringValue("DescribeSQLLogsOnSliceResponse.SliceLogItems["+ i +"].OperationExecuteEndTime"));
			sQLLogsSliceItem.setSegmentName(_ctx.stringValue("DescribeSQLLogsOnSliceResponse.SliceLogItems["+ i +"].SegmentName"));

			sliceLogItems.add(sQLLogsSliceItem);
		}
		describeSQLLogsOnSliceResponse.setSliceLogItems(sliceLogItems);
	 
	 	return describeSQLLogsOnSliceResponse;
	}
}