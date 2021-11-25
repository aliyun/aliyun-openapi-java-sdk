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

import com.aliyuncs.vcs.model.v20200515.DescribeWatchItemsResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeWatchItemsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeWatchItemsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWatchItemsResponseUnmarshaller {

	public static DescribeWatchItemsResponse unmarshall(DescribeWatchItemsResponse describeWatchItemsResponse, UnmarshallerContext _ctx) {
		
		describeWatchItemsResponse.setRequestId(_ctx.stringValue("DescribeWatchItemsResponse.RequestId"));
		describeWatchItemsResponse.setSuccess(_ctx.booleanValue("DescribeWatchItemsResponse.Success"));
		describeWatchItemsResponse.setCode(_ctx.stringValue("DescribeWatchItemsResponse.Code"));
		describeWatchItemsResponse.setMessage(_ctx.stringValue("DescribeWatchItemsResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("DescribeWatchItemsResponse.Data.TotalCount"));
		data.setPageSize(_ctx.longValue("DescribeWatchItemsResponse.Data.PageSize"));
		data.setPageNumber(_ctx.longValue("DescribeWatchItemsResponse.Data.PageNumber"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWatchItemsResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setWatchItemId(_ctx.stringValue("DescribeWatchItemsResponse.Data.Records["+ i +"].WatchItemId"));
			record.setWatchItemName(_ctx.stringValue("DescribeWatchItemsResponse.Data.Records["+ i +"].WatchItemName"));
			record.setItemAttributes(_ctx.stringValue("DescribeWatchItemsResponse.Data.Records["+ i +"].ItemAttributes"));
			record.setItemImageUrl(_ctx.stringValue("DescribeWatchItemsResponse.Data.Records["+ i +"].ItemImageUrl"));

			records.add(record);
		}
		data.setRecords(records);
		describeWatchItemsResponse.setData(data);
	 
	 	return describeWatchItemsResponse;
	}
}