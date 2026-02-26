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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.ListVccFlowInfosResponse;
import com.aliyuncs.eflo.model.v20220530.ListVccFlowInfosResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListVccFlowInfosResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVccFlowInfosResponseUnmarshaller {

	public static ListVccFlowInfosResponse unmarshall(ListVccFlowInfosResponse listVccFlowInfosResponse, UnmarshallerContext _ctx) {
		
		listVccFlowInfosResponse.setRequestId(_ctx.stringValue("ListVccFlowInfosResponse.RequestId"));
		listVccFlowInfosResponse.setCode(_ctx.integerValue("ListVccFlowInfosResponse.Code"));
		listVccFlowInfosResponse.setMessage(_ctx.stringValue("ListVccFlowInfosResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListVccFlowInfosResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVccFlowInfosResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setRegionId(_ctx.stringValue("ListVccFlowInfosResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setVccId(_ctx.stringValue("ListVccFlowInfosResponse.Content.Data["+ i +"].VccId"));
			dataItem.setMetricName(_ctx.stringValue("ListVccFlowInfosResponse.Content.Data["+ i +"].MetricName"));
			dataItem.setDirection(_ctx.stringValue("ListVccFlowInfosResponse.Content.Data["+ i +"].Direction"));
			dataItem.setTimestamp(_ctx.longValue("ListVccFlowInfosResponse.Content.Data["+ i +"].Timestamp"));
			dataItem.setValue(_ctx.doubleValue("ListVccFlowInfosResponse.Content.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		content.setData(data);
		listVccFlowInfosResponse.setContent(content);
	 
	 	return listVccFlowInfosResponse;
	}
}