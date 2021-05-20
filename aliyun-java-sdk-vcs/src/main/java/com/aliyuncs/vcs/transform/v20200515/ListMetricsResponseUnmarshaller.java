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

import com.aliyuncs.vcs.model.v20200515.ListMetricsResponse;
import com.aliyuncs.vcs.model.v20200515.ListMetricsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListMetricsResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMetricsResponseUnmarshaller {

	public static ListMetricsResponse unmarshall(ListMetricsResponse listMetricsResponse, UnmarshallerContext _ctx) {
		
		listMetricsResponse.setRequestId(_ctx.stringValue("ListMetricsResponse.RequestId"));
		listMetricsResponse.setMessage(_ctx.stringValue("ListMetricsResponse.Message"));
		listMetricsResponse.setCode(_ctx.stringValue("ListMetricsResponse.Code"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListMetricsResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("ListMetricsResponse.Data.PageSize"));
		data.setTotalPage(_ctx.integerValue("ListMetricsResponse.Data.TotalPage"));
		data.setPageNumber(_ctx.integerValue("ListMetricsResponse.Data.PageNumber"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMetricsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setTagMetric(_ctx.stringValue("ListMetricsResponse.Data.Records["+ i +"].TagMetric"));
			recordsItem.setTagCode(_ctx.stringValue("ListMetricsResponse.Data.Records["+ i +"].TagCode"));
			recordsItem.setTagValue(_ctx.stringValue("ListMetricsResponse.Data.Records["+ i +"].TagValue"));
			recordsItem.setDateTime(_ctx.stringValue("ListMetricsResponse.Data.Records["+ i +"].DateTime"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		listMetricsResponse.setData(data);
	 
	 	return listMetricsResponse;
	}
}