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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceidMetricsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceidMetricsResponse.Response;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceidMetricsResponse.Response.Entity;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceidMetricsResponse.Response.Entity.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceidMetricsResponse.Response.Entity.DataItem.MetricsItem;
import com.aliyuncs.sofa.model.v20190815.QueryRmsResourceidMetricsResponse.Response.Entity.DataItem.MetricsItem.DatasItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRmsResourceidMetricsResponseUnmarshaller {

	public static QueryRmsResourceidMetricsResponse unmarshall(QueryRmsResourceidMetricsResponse queryRmsResourceidMetricsResponse, UnmarshallerContext _ctx) {
		
		queryRmsResourceidMetricsResponse.setRequestId(_ctx.stringValue("QueryRmsResourceidMetricsResponse.RequestId"));
		queryRmsResourceidMetricsResponse.setResultCode(_ctx.stringValue("QueryRmsResourceidMetricsResponse.ResultCode"));
		queryRmsResourceidMetricsResponse.setResultMessage(_ctx.stringValue("QueryRmsResourceidMetricsResponse.ResultMessage"));

		Response response = new Response();

		Entity entity = new Entity();

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCode(_ctx.stringValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Code"));
			dataItem.setCursor(_ctx.stringValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Cursor"));
			dataItem.setIaasId(_ctx.stringValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].IaasId"));
			dataItem.setMessage(_ctx.stringValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Message"));
			dataItem.setOptionKey(_ctx.stringValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].OptionKey"));
			dataItem.setPaasId(_ctx.stringValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].PaasId"));
			dataItem.setPeriod(_ctx.stringValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Period"));
			dataItem.setPort(_ctx.longValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Port"));
			dataItem.setSize(_ctx.longValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Size"));

			List<MetricsItem> metrics = new ArrayList<MetricsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Metrics.Length"); j++) {
				MetricsItem metricsItem = new MetricsItem();
				metricsItem.setMetric(_ctx.stringValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Metrics["+ j +"].Metric"));
				metricsItem.setUnit(_ctx.stringValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Metrics["+ j +"].Unit"));

				List<DatasItem> datas = new ArrayList<DatasItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Metrics["+ j +"].Datas.Length"); k++) {
					DatasItem datasItem = new DatasItem();
					datasItem.setAverage(_ctx.longValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Metrics["+ j +"].Datas["+ k +"].Average"));
					datasItem.setMaximum(_ctx.longValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Metrics["+ j +"].Datas["+ k +"].Maximum"));
					datasItem.setMinimum(_ctx.longValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Metrics["+ j +"].Datas["+ k +"].Minimum"));
					datasItem.setTimestamp(_ctx.longValue("QueryRmsResourceidMetricsResponse.Response.Entity.Data["+ i +"].Metrics["+ j +"].Datas["+ k +"].Timestamp"));

					datas.add(datasItem);
				}
				metricsItem.setDatas(datas);

				metrics.add(metricsItem);
			}
			dataItem.setMetrics(metrics);

			data.add(dataItem);
		}
		entity.setData(data);
		response.setEntity(entity);
		queryRmsResourceidMetricsResponse.setResponse(response);
	 
	 	return queryRmsResourceidMetricsResponse;
	}
}