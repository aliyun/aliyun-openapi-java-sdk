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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeLorneLogResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeLorneLogResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLorneLogResponseUnmarshaller {

	public static DescribeLorneLogResponse unmarshall(DescribeLorneLogResponse describeLorneLogResponse, UnmarshallerContext _ctx) {
		
		describeLorneLogResponse.setRequestId(_ctx.stringValue("DescribeLorneLogResponse.RequestId"));
		describeLorneLogResponse.setPageNumber(_ctx.integerValue("DescribeLorneLogResponse.PageNumber"));
		describeLorneLogResponse.setTotalCount(_ctx.integerValue("DescribeLorneLogResponse.TotalCount"));
		describeLorneLogResponse.setPageSize(_ctx.integerValue("DescribeLorneLogResponse.PageSize"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLorneLogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCode(_ctx.stringValue("DescribeLorneLogResponse.Data["+ i +"].Code"));
			dataItem.setMessage(_ctx.stringValue("DescribeLorneLogResponse.Data["+ i +"].Message"));
			dataItem.setCount(_ctx.stringValue("DescribeLorneLogResponse.Data["+ i +"].Count"));
			dataItem.setStartTime(_ctx.stringValue("DescribeLorneLogResponse.Data["+ i +"].StartTime"));
			dataItem.setEndTime(_ctx.stringValue("DescribeLorneLogResponse.Data["+ i +"].EndTime"));

			data.add(dataItem);
		}
		describeLorneLogResponse.setData(data);
	 
	 	return describeLorneLogResponse;
	}
}