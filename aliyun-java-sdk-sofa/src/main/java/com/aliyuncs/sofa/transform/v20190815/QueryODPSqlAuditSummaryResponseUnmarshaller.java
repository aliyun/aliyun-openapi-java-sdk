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

import com.aliyuncs.sofa.model.v20190815.QueryODPSqlAuditSummaryResponse;
import com.aliyuncs.sofa.model.v20190815.QueryODPSqlAuditSummaryResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryODPSqlAuditSummaryResponse.DataItem.MetricsValuesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryODPSqlAuditSummaryResponseUnmarshaller {

	public static QueryODPSqlAuditSummaryResponse unmarshall(QueryODPSqlAuditSummaryResponse queryODPSqlAuditSummaryResponse, UnmarshallerContext _ctx) {
		
		queryODPSqlAuditSummaryResponse.setRequestId(_ctx.stringValue("QueryODPSqlAuditSummaryResponse.RequestId"));
		queryODPSqlAuditSummaryResponse.setResultCode(_ctx.stringValue("QueryODPSqlAuditSummaryResponse.ResultCode"));
		queryODPSqlAuditSummaryResponse.setResultMessage(_ctx.stringValue("QueryODPSqlAuditSummaryResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryODPSqlAuditSummaryResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSchema(_ctx.stringValue("QueryODPSqlAuditSummaryResponse.Data["+ i +"].Schema"));

			List<MetricsValuesItem> metricsValues = new ArrayList<MetricsValuesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryODPSqlAuditSummaryResponse.Data["+ i +"].MetricsValues.Length"); j++) {
				MetricsValuesItem metricsValuesItem = new MetricsValuesItem();
				metricsValuesItem.setCount(_ctx.longValue("QueryODPSqlAuditSummaryResponse.Data["+ i +"].MetricsValues["+ j +"].Count"));
				metricsValuesItem.setFrom(_ctx.longValue("QueryODPSqlAuditSummaryResponse.Data["+ i +"].MetricsValues["+ j +"].From"));
				metricsValuesItem.setTo(_ctx.longValue("QueryODPSqlAuditSummaryResponse.Data["+ i +"].MetricsValues["+ j +"].To"));

				metricsValues.add(metricsValuesItem);
			}
			dataItem.setMetricsValues(metricsValues);

			data.add(dataItem);
		}
		queryODPSqlAuditSummaryResponse.setData(data);
	 
	 	return queryODPSqlAuditSummaryResponse;
	}
}