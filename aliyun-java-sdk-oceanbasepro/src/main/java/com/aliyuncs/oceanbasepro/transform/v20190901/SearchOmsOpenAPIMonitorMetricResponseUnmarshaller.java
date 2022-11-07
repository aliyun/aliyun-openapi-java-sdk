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

import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIMonitorMetricResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIMonitorMetricResponse.DataItem;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIMonitorMetricResponse.DataItem.DataPoint;
import com.aliyuncs.oceanbasepro.model.v20190901.SearchOmsOpenAPIMonitorMetricResponse.ErrorDetail;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchOmsOpenAPIMonitorMetricResponseUnmarshaller {

	public static SearchOmsOpenAPIMonitorMetricResponse unmarshall(SearchOmsOpenAPIMonitorMetricResponse searchOmsOpenAPIMonitorMetricResponse, UnmarshallerContext _ctx) {
		
		searchOmsOpenAPIMonitorMetricResponse.setRequestId(_ctx.stringValue("SearchOmsOpenAPIMonitorMetricResponse.RequestId"));
		searchOmsOpenAPIMonitorMetricResponse.setSuccess(_ctx.booleanValue("SearchOmsOpenAPIMonitorMetricResponse.Success"));
		searchOmsOpenAPIMonitorMetricResponse.setCode(_ctx.stringValue("SearchOmsOpenAPIMonitorMetricResponse.Code"));
		searchOmsOpenAPIMonitorMetricResponse.setMessage(_ctx.stringValue("SearchOmsOpenAPIMonitorMetricResponse.Message"));
		searchOmsOpenAPIMonitorMetricResponse.setAdvice(_ctx.stringValue("SearchOmsOpenAPIMonitorMetricResponse.Advice"));
		searchOmsOpenAPIMonitorMetricResponse.setPageNumber(_ctx.integerValue("SearchOmsOpenAPIMonitorMetricResponse.PageNumber"));
		searchOmsOpenAPIMonitorMetricResponse.setPageSize(_ctx.integerValue("SearchOmsOpenAPIMonitorMetricResponse.PageSize"));
		searchOmsOpenAPIMonitorMetricResponse.setTotalCount(_ctx.longValue("SearchOmsOpenAPIMonitorMetricResponse.TotalCount"));
		searchOmsOpenAPIMonitorMetricResponse.setCost(_ctx.stringValue("SearchOmsOpenAPIMonitorMetricResponse.Cost"));

		ErrorDetail errorDetail = new ErrorDetail();
		errorDetail.setCode(_ctx.stringValue("SearchOmsOpenAPIMonitorMetricResponse.ErrorDetail.Code"));
		errorDetail.setLevel(_ctx.stringValue("SearchOmsOpenAPIMonitorMetricResponse.ErrorDetail.Level"));
		errorDetail.setMessage(_ctx.stringValue("SearchOmsOpenAPIMonitorMetricResponse.ErrorDetail.Message"));
		errorDetail.setProposal(_ctx.stringValue("SearchOmsOpenAPIMonitorMetricResponse.ErrorDetail.Proposal"));
		searchOmsOpenAPIMonitorMetricResponse.setErrorDetail(errorDetail);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchOmsOpenAPIMonitorMetricResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setMetric(_ctx.stringValue("SearchOmsOpenAPIMonitorMetricResponse.Data["+ i +"].Metric"));
			dataItem.setTags(_ctx.mapValue("SearchOmsOpenAPIMonitorMetricResponse.Data["+ i +"].Tags"));

			List<DataPoint> dataPoints = new ArrayList<DataPoint>();
			for (int j = 0; j < _ctx.lengthValue("SearchOmsOpenAPIMonitorMetricResponse.Data["+ i +"].DataPoints.Length"); j++) {
				DataPoint dataPoint = new DataPoint();
				dataPoint.setTimestamp(_ctx.longValue("SearchOmsOpenAPIMonitorMetricResponse.Data["+ i +"].DataPoints["+ j +"].Timestamp"));
				dataPoint.setValue(_ctx.doubleValue("SearchOmsOpenAPIMonitorMetricResponse.Data["+ i +"].DataPoints["+ j +"].Value"));

				dataPoints.add(dataPoint);
			}
			dataItem.setDataPoints(dataPoints);

			data.add(dataItem);
		}
		searchOmsOpenAPIMonitorMetricResponse.setData(data);
	 
	 	return searchOmsOpenAPIMonitorMetricResponse;
	}
}