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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskReportsResponse;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskReportsResponse.Result;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskReportsResponse.Result.MetricsItem;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskReportsResponse.Result.MetricsItem.DetailsItem;
import com.aliyuncs.airec.model.v20201126.ListFlowControlTaskReportsResponse.Result.Total;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFlowControlTaskReportsResponseUnmarshaller {

	public static ListFlowControlTaskReportsResponse unmarshall(ListFlowControlTaskReportsResponse listFlowControlTaskReportsResponse, UnmarshallerContext _ctx) {
		
		listFlowControlTaskReportsResponse.setRequestId(_ctx.stringValue("ListFlowControlTaskReportsResponse.requestId"));

		Result result = new Result();

		Total total = new Total();
		total.setAccTaskCtr(_ctx.doubleValue("ListFlowControlTaskReportsResponse.result.total.accTaskCtr"));
		total.setAccTaskPv(_ctx.longValue("ListFlowControlTaskReportsResponse.result.total.accTaskPv"));
		total.setAccTotalCtr(_ctx.doubleValue("ListFlowControlTaskReportsResponse.result.total.accTotalCtr"));
		total.setInvalidPercent(_ctx.doubleValue("ListFlowControlTaskReportsResponse.result.total.InvalidPercent"));
		result.setTotal(total);

		List<MetricsItem> metrics = new ArrayList<MetricsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFlowControlTaskReportsResponse.result.metrics.Length"); i++) {
			MetricsItem metricsItem = new MetricsItem();
			metricsItem.setType(_ctx.stringValue("ListFlowControlTaskReportsResponse.result.metrics["+ i +"].type"));

			List<DetailsItem> details = new ArrayList<DetailsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListFlowControlTaskReportsResponse.result.metrics["+ i +"].details.Length"); j++) {
				DetailsItem detailsItem = new DetailsItem();
				detailsItem.setVal(_ctx.longValue("ListFlowControlTaskReportsResponse.result.metrics["+ i +"].details["+ j +"].val"));
				detailsItem.setEndTime(_ctx.longValue("ListFlowControlTaskReportsResponse.result.metrics["+ i +"].details["+ j +"].endTime"));
				detailsItem.setStartTime(_ctx.longValue("ListFlowControlTaskReportsResponse.result.metrics["+ i +"].details["+ j +"].startTime"));

				details.add(detailsItem);
			}
			metricsItem.setDetails(details);

			metrics.add(metricsItem);
		}
		result.setMetrics(metrics);
		listFlowControlTaskReportsResponse.setResult(result);
	 
	 	return listFlowControlTaskReportsResponse;
	}
}