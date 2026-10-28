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

package com.aliyuncs.quotas.transform.v20200510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quotas.model.v20200510.ListQuotaUtilizationReportResponse;
import com.aliyuncs.quotas.model.v20200510.ListQuotaUtilizationReportResponse.QuotasItem;
import com.aliyuncs.quotas.model.v20200510.ListQuotaUtilizationReportResponse.QuotasItem.FlowControlAlgo;
import com.aliyuncs.quotas.model.v20200510.ListQuotaUtilizationReportResponse.QuotasItem.FlowControlAlgo.Period;
import com.aliyuncs.quotas.model.v20200510.ListQuotaUtilizationReportResponse.QuotasItem.UsageMetric;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQuotaUtilizationReportResponseUnmarshaller {

	public static ListQuotaUtilizationReportResponse unmarshall(ListQuotaUtilizationReportResponse listQuotaUtilizationReportResponse, UnmarshallerContext _ctx) {
		
		listQuotaUtilizationReportResponse.setRequestId(_ctx.stringValue("ListQuotaUtilizationReportResponse.RequestId"));
		listQuotaUtilizationReportResponse.setStatus(_ctx.stringValue("ListQuotaUtilizationReportResponse.Status"));
		listQuotaUtilizationReportResponse.setTotalCount(_ctx.integerValue("ListQuotaUtilizationReportResponse.TotalCount"));
		listQuotaUtilizationReportResponse.setMessage(_ctx.stringValue("ListQuotaUtilizationReportResponse.Message"));
		listQuotaUtilizationReportResponse.setNextToken(_ctx.stringValue("ListQuotaUtilizationReportResponse.NextToken"));
		listQuotaUtilizationReportResponse.setGeneratedAt(_ctx.stringValue("ListQuotaUtilizationReportResponse.GeneratedAt"));
		listQuotaUtilizationReportResponse.setErrorMsg(_ctx.stringValue("ListQuotaUtilizationReportResponse.ErrorMsg"));
		listQuotaUtilizationReportResponse.setErrorCode(_ctx.stringValue("ListQuotaUtilizationReportResponse.ErrorCode"));
		listQuotaUtilizationReportResponse.setSuccess(_ctx.booleanValue("ListQuotaUtilizationReportResponse.Success"));

		List<QuotasItem> quotas = new ArrayList<QuotasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQuotaUtilizationReportResponse.Quotas.Length"); i++) {
			QuotasItem quotasItem = new QuotasItem();
			quotasItem.setQuotaDescription(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].QuotaDescription"));
			quotasItem.setConsumable(_ctx.booleanValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].Consumable"));
			quotasItem.setUnadjustableDetail(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].UnadjustableDetail"));
			quotasItem.setProductCode(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].ProductCode"));
			quotasItem.setTotalUsage(_ctx.doubleValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].TotalUsage"));
			quotasItem.setDimensions(_ctx.mapValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].Dimensions"));
			quotasItem.setUtilizationStatus(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].UtilizationStatus"));
			quotasItem.setAdjustable(_ctx.booleanValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].Adjustable"));
			quotasItem.setQuotaActionCode(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].QuotaActionCode"));
			quotasItem.setQuotaName(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].QuotaName"));
			quotasItem.setUtilization(_ctx.doubleValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].Utilization"));
			quotasItem.setQuotaArn(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].QuotaArn"));
			quotasItem.setTotalQuota(_ctx.doubleValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].TotalQuota"));
			quotasItem.setQuotaCategory(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].QuotaCategory"));

			UsageMetric usageMetric = new UsageMetric();
			usageMetric.setMetricName(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].UsageMetric.MetricName"));
			usageMetric.setMetricDimensions(_ctx.mapValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].UsageMetric.MetricDimensions"));
			usageMetric.setMetricNamespace(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].UsageMetric.MetricNamespace"));
			quotasItem.setUsageMetric(usageMetric);

			FlowControlAlgo flowControlAlgo = new FlowControlAlgo();
			flowControlAlgo.setTotalQuota(_ctx.doubleValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].FlowControlAlgo.TotalQuota"));
			flowControlAlgo.setAlgoType(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].FlowControlAlgo.AlgoType"));
			flowControlAlgo.setTokensPerRefill(_ctx.integerValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].FlowControlAlgo.TokensPerRefill"));
			flowControlAlgo.setRefillInterval(_ctx.integerValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].FlowControlAlgo.RefillInterval"));

			Period period = new Period();
			period.setPeriodValue(_ctx.integerValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].FlowControlAlgo.Period.PeriodValue"));
			period.setPeriodUnit(_ctx.stringValue("ListQuotaUtilizationReportResponse.Quotas["+ i +"].FlowControlAlgo.Period.PeriodUnit"));
			flowControlAlgo.setPeriod(period);
			quotasItem.setFlowControlAlgo(flowControlAlgo);

			quotas.add(quotasItem);
		}
		listQuotaUtilizationReportResponse.setQuotas(quotas);
	 
	 	return listQuotaUtilizationReportResponse;
	}
}