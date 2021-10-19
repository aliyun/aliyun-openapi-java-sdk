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
import com.aliyuncs.vcs.model.v20200515.SearchTargetResponse.Data;
import com.aliyuncs.vcs.model.v20200515.SearchTargetResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchTargetResponseUnmarshaller {

	public static SearchTargetResponse unmarshall(SearchTargetResponse searchTargetResponse, UnmarshallerContext _ctx) {
		
		searchTargetResponse.setRequestId(_ctx.stringValue("SearchTargetResponse.RequestId"));
		searchTargetResponse.setSuccess(_ctx.booleanValue("SearchTargetResponse.Success"));
		searchTargetResponse.setCode(_ctx.stringValue("SearchTargetResponse.Code"));
		searchTargetResponse.setMessage(_ctx.stringValue("SearchTargetResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("SearchTargetResponse.Data.TotalCount"));
		data.setPageSize(_ctx.longValue("SearchTargetResponse.Data.PageSize"));
		data.setPageNumber(_ctx.longValue("SearchTargetResponse.Data.PageNumber"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("SearchTargetResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setTargetType(_ctx.stringValue("SearchTargetResponse.Data.Records["+ i +"].TargetType"));
			record.setTimestamp(_ctx.stringValue("SearchTargetResponse.Data.Records["+ i +"].Timestamp"));
			record.setDeviceId(_ctx.stringValue("SearchTargetResponse.Data.Records["+ i +"].DeviceId"));
			record.setTargetAttributes(_ctx.stringValue("SearchTargetResponse.Data.Records["+ i +"].TargetAttributes"));
			record.setTargetImageUrl(_ctx.stringValue("SearchTargetResponse.Data.Records["+ i +"].TargetImageUrl"));
			record.setSourceImageUrl(_ctx.stringValue("SearchTargetResponse.Data.Records["+ i +"].SourceImageUrl"));
			record.setLeftTopX(_ctx.longValue("SearchTargetResponse.Data.Records["+ i +"].LeftTopX"));
			record.setLeftTopY(_ctx.longValue("SearchTargetResponse.Data.Records["+ i +"].LeftTopY"));
			record.setRightBottomX(_ctx.longValue("SearchTargetResponse.Data.Records["+ i +"].RightBottomX"));
			record.setRightBottomY(_ctx.longValue("SearchTargetResponse.Data.Records["+ i +"].RightBottomY"));
			record.setTargetImageSimilarity(_ctx.doubleValue("SearchTargetResponse.Data.Records["+ i +"].TargetImageSimilarity"));

			records.add(record);
		}
		data.setRecords(records);
		searchTargetResponse.setData(data);
	 
	 	return searchTargetResponse;
	}
}