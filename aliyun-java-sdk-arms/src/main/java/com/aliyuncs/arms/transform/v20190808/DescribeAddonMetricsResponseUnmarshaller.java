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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.DescribeAddonMetricsResponse;
import com.aliyuncs.arms.model.v20190808.DescribeAddonMetricsResponse.DataItem;
import com.aliyuncs.arms.model.v20190808.DescribeAddonMetricsResponse.DataItem.Labels;
import com.aliyuncs.arms.model.v20190808.DescribeAddonMetricsResponse.DataItem.Labels.LabelsItem2;
import com.aliyuncs.arms.model.v20190808.DescribeAddonMetricsResponse.DataItem.LabelsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAddonMetricsResponseUnmarshaller {

	public static DescribeAddonMetricsResponse unmarshall(DescribeAddonMetricsResponse describeAddonMetricsResponse, UnmarshallerContext _ctx) {
		
		describeAddonMetricsResponse.setRequestId(_ctx.stringValue("DescribeAddonMetricsResponse.RequestId"));
		describeAddonMetricsResponse.setCode(_ctx.integerValue("DescribeAddonMetricsResponse.Code"));
		describeAddonMetricsResponse.setMessage(_ctx.stringValue("DescribeAddonMetricsResponse.Message"));
		describeAddonMetricsResponse.setSuccess(_ctx.booleanValue("DescribeAddonMetricsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAddonMetricsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setGroup(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Group"));

			List<LabelsItem> labels = new ArrayList<LabelsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAddonMetricsResponse.Data["+ i +"].Labels.Length"); j++) {
				LabelsItem labelsItem = new LabelsItem();
				labelsItem.setDescription(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Labels["+ j +"].Description"));
				labelsItem.setKey(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Labels["+ j +"].Key"));
				labelsItem.setSource(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Labels["+ j +"].Source"));

				labels.add(labelsItem);
			}
			dataItem.setLabels(labels);

			List<Labels> metrics = new ArrayList<Labels>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAddonMetricsResponse.Data["+ i +"].Metrics.Length"); j++) {
				Labels labels2 = new Labels();
				labels2.setDescription(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Metrics["+ j +"].Description"));
				labels2.setType(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Metrics["+ j +"].Type"));
				labels2.setUnit(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Metrics["+ j +"].Unit"));
				labels2.setMetric(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Metrics["+ j +"].Metric"));

				List<LabelsItem2> labels1 = new ArrayList<LabelsItem2>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAddonMetricsResponse.Data["+ i +"].Metrics["+ j +"].Labels.Length"); k++) {
					LabelsItem2 labelsItem2 = new LabelsItem2();
					labelsItem2.setDescription(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Metrics["+ j +"].Labels["+ k +"].Description"));
					labelsItem2.setKey(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Metrics["+ j +"].Labels["+ k +"].Key"));
					labelsItem2.setSource(_ctx.stringValue("DescribeAddonMetricsResponse.Data["+ i +"].Metrics["+ j +"].Labels["+ k +"].Source"));

					labels1.add(labelsItem2);
				}
				labels2.setLabels1(labels1);

				metrics.add(labels2);
			}
			dataItem.setMetrics(metrics);

			data.add(dataItem);
		}
		describeAddonMetricsResponse.setData(data);
	 
	 	return describeAddonMetricsResponse;
	}
}