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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.ListTagMetricsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListTagMetricsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagMetricsResponseUnmarshaller {

	public static ListTagMetricsResponse unmarshall(ListTagMetricsResponse listTagMetricsResponse, UnmarshallerContext _ctx) {
		
		listTagMetricsResponse.setRequestId(_ctx.stringValue("ListTagMetricsResponse.RequestId"));
		listTagMetricsResponse.setCode(_ctx.stringValue("ListTagMetricsResponse.Code"));
		listTagMetricsResponse.setMessage(_ctx.stringValue("ListTagMetricsResponse.Message"));
		listTagMetricsResponse.setPageNumber(_ctx.stringValue("ListTagMetricsResponse.PageNumber"));
		listTagMetricsResponse.setPageSize(_ctx.stringValue("ListTagMetricsResponse.PageSize"));
		listTagMetricsResponse.setTotalCount(_ctx.stringValue("ListTagMetricsResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTagMetricsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDateTime(_ctx.stringValue("ListTagMetricsResponse.Data["+ i +"].DateTime"));
			dataItem.setTagCode(_ctx.stringValue("ListTagMetricsResponse.Data["+ i +"].TagCode"));
			dataItem.setTagValue(_ctx.stringValue("ListTagMetricsResponse.Data["+ i +"].TagValue"));
			dataItem.setTagMetric(_ctx.stringValue("ListTagMetricsResponse.Data["+ i +"].TagMetric"));
			dataItem.setCorpId(_ctx.stringValue("ListTagMetricsResponse.Data["+ i +"].CorpId"));

			data.add(dataItem);
		}
		listTagMetricsResponse.setData(data);
	 
	 	return listTagMetricsResponse;
	}
}