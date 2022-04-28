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

import com.aliyuncs.vcs.model.v20200515.DescribeSearchItemsResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeSearchItemsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.DescribeSearchItemsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSearchItemsResponseUnmarshaller {

	public static DescribeSearchItemsResponse unmarshall(DescribeSearchItemsResponse describeSearchItemsResponse, UnmarshallerContext _ctx) {
		
		describeSearchItemsResponse.setRequestId(_ctx.stringValue("DescribeSearchItemsResponse.RequestId"));
		describeSearchItemsResponse.setSuccess(_ctx.stringValue("DescribeSearchItemsResponse.Success"));
		describeSearchItemsResponse.setCode(_ctx.stringValue("DescribeSearchItemsResponse.Code"));
		describeSearchItemsResponse.setMessage(_ctx.stringValue("DescribeSearchItemsResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.stringValue("DescribeSearchItemsResponse.Data.TotalCount"));
		data.setPageSize(_ctx.stringValue("DescribeSearchItemsResponse.Data.PageSize"));
		data.setPageNumber(_ctx.stringValue("DescribeSearchItemsResponse.Data.PageNumber"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSearchItemsResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setSearchItemId(_ctx.stringValue("DescribeSearchItemsResponse.Data.Records["+ i +"].SearchItemId"));
			record.setSearchItemName(_ctx.stringValue("DescribeSearchItemsResponse.Data.Records["+ i +"].SearchItemName"));
			record.setItemImageUrl(_ctx.stringValue("DescribeSearchItemsResponse.Data.Records["+ i +"].ItemImageUrl"));

			records.add(record);
		}
		data.setRecords(records);
		describeSearchItemsResponse.setData(data);
	 
	 	return describeSearchItemsResponse;
	}
}