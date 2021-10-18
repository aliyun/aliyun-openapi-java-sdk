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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.SearchTargetResponse;
import com.aliyuncs.vcs.model.v20200515.SearchTargetResponse.DataItem;
import com.aliyuncs.vcs.model.v20200515.SearchTargetResponse.DataItem.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTargetResponseUnmarshaller {

	public static SearchTargetResponse unmarshall(SearchTargetResponse searchTargetResponse, UnmarshallerContext _ctx) {
		
		searchTargetResponse.setRequestId(_ctx.stringValue("SearchTargetResponse.RequestId"));
		searchTargetResponse.setSuccess(_ctx.booleanValue("SearchTargetResponse.Success"));
		searchTargetResponse.setCode(_ctx.stringValue("SearchTargetResponse.Code"));
		searchTargetResponse.setMessage(_ctx.stringValue("SearchTargetResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchTargetResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTotalCount(_ctx.longValue("SearchTargetResponse.Data["+ i +"].TotalCount"));
			dataItem.setPageSize(_ctx.longValue("SearchTargetResponse.Data["+ i +"].PageSize"));
			dataItem.setPageNumber(_ctx.longValue("SearchTargetResponse.Data["+ i +"].PageNumber"));

			List<Record> records = new ArrayList<Record>();
			for (int j = 0; j < _ctx.lengthValue("SearchTargetResponse.Data["+ i +"].Records.Length"); j++) {
				Record record = new Record();
				record.setTargetType(_ctx.stringValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].TargetType"));
				record.setTimestamp(_ctx.stringValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].Timestamp"));
				record.setDeviceId(_ctx.stringValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].DeviceId"));
				record.setTargetAttributes(_ctx.stringValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].TargetAttributes"));
				record.setTargetImageUrl(_ctx.stringValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].TargetImageUrl"));
				record.setSourceImageUrl(_ctx.stringValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].SourceImageUrl"));
				record.setLeftTopX(_ctx.longValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].LeftTopX"));
				record.setLeftTopY(_ctx.longValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].LeftTopY"));
				record.setRightBottomX(_ctx.longValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].RightBottomX"));
				record.setRightBottomY(_ctx.longValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].RightBottomY"));
				record.setTargetImageSimilarity(_ctx.doubleValue("SearchTargetResponse.Data["+ i +"].Records["+ j +"].TargetImageSimilarity"));

				records.add(record);
			}
			dataItem.setRecords(records);

			data.add(dataItem);
		}
		searchTargetResponse.setData(data);
	 
	 	return searchTargetResponse;
	}
}