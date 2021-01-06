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

import com.aliyuncs.cdrs.model.v20201101.ListMetricsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListMetricsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMetricsResponseUnmarshaller {

	public static ListMetricsResponse unmarshall(ListMetricsResponse listMetricsResponse, UnmarshallerContext _ctx) {
		
		listMetricsResponse.setRequestId(_ctx.stringValue("ListMetricsResponse.RequestId"));
		listMetricsResponse.setCode(_ctx.stringValue("ListMetricsResponse.Code"));
		listMetricsResponse.setMessage(_ctx.stringValue("ListMetricsResponse.Message"));
		listMetricsResponse.setPageNumber(_ctx.stringValue("ListMetricsResponse.PageNumber"));
		listMetricsResponse.setPageSize(_ctx.stringValue("ListMetricsResponse.PageSize"));
		listMetricsResponse.setTotalCount(_ctx.stringValue("ListMetricsResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMetricsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDateTime(_ctx.stringValue("ListMetricsResponse.Data["+ i +"].DateTime"));
			dataItem.setTagCode(_ctx.stringValue("ListMetricsResponse.Data["+ i +"].TagCode"));
			dataItem.setTagValue(_ctx.stringValue("ListMetricsResponse.Data["+ i +"].TagValue"));
			dataItem.setDateTime1(_ctx.stringValue("ListMetricsResponse.Data["+ i +"].DateTime"));

			data.add(dataItem);
		}
		listMetricsResponse.setData(data);
	 
	 	return listMetricsResponse;
	}
}