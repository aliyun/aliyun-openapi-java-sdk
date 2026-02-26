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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeMetricsDataV2Response;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeMetricsDataV2Response.DataItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeMetricsDataV2Response.DataItem.DataItem2;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricsDataV2ResponseUnmarshaller {

	public static DescribeMetricsDataV2Response unmarshall(DescribeMetricsDataV2Response describeMetricsDataV2Response, UnmarshallerContext _ctx) {
		
		describeMetricsDataV2Response.setRequestId(_ctx.stringValue("DescribeMetricsDataV2Response.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetricsDataV2Response.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setLabels(_ctx.mapValue("DescribeMetricsDataV2Response.Data["+ i +"].Labels"));

			List<DataItem2> data1 = new ArrayList<DataItem2>();
			for (int j = 0; j < _ctx.lengthValue("DescribeMetricsDataV2Response.Data["+ i +"].Data.Length"); j++) {
				DataItem2 dataItem2 = new DataItem2();
				dataItem2.setMetricValue(_ctx.mapValue("DescribeMetricsDataV2Response.Data["+ i +"].Data["+ j +"].MetricValue"));
				dataItem2.setTimestamp(_ctx.longValue("DescribeMetricsDataV2Response.Data["+ i +"].Data["+ j +"].Timestamp"));

				data1.add(dataItem2);
			}
			dataItem.setData1(data1);

			data.add(dataItem);
		}
		describeMetricsDataV2Response.setData(data);
	 
	 	return describeMetricsDataV2Response;
	}
}