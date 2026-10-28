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

import com.aliyuncs.quotas.model.v20200510.GetQuotaUtilizationOverviewResponse;
import com.aliyuncs.quotas.model.v20200510.GetQuotaUtilizationOverviewResponse.QuotaOverview;
import com.aliyuncs.quotas.model.v20200510.GetQuotaUtilizationOverviewResponse.QuotaOverview.InUse;
import com.aliyuncs.quotas.model.v20200510.GetQuotaUtilizationOverviewResponse.QuotaOverview.Over80Percent;
import com.aliyuncs.quotas.model.v20200510.GetQuotaUtilizationOverviewResponse.QuotaOverview.Over95Percent;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQuotaUtilizationOverviewResponseUnmarshaller {

	public static GetQuotaUtilizationOverviewResponse unmarshall(GetQuotaUtilizationOverviewResponse getQuotaUtilizationOverviewResponse, UnmarshallerContext _ctx) {
		
		getQuotaUtilizationOverviewResponse.setRequestId(_ctx.stringValue("GetQuotaUtilizationOverviewResponse.RequestId"));
		getQuotaUtilizationOverviewResponse.setStatus(_ctx.stringValue("GetQuotaUtilizationOverviewResponse.Status"));
		getQuotaUtilizationOverviewResponse.setMessage(_ctx.stringValue("GetQuotaUtilizationOverviewResponse.Message"));
		getQuotaUtilizationOverviewResponse.setGeneratedAt(_ctx.stringValue("GetQuotaUtilizationOverviewResponse.GeneratedAt"));
		getQuotaUtilizationOverviewResponse.setErrorMsg(_ctx.stringValue("GetQuotaUtilizationOverviewResponse.ErrorMsg"));
		getQuotaUtilizationOverviewResponse.setErrorCode(_ctx.stringValue("GetQuotaUtilizationOverviewResponse.ErrorCode"));
		getQuotaUtilizationOverviewResponse.setSuccess(_ctx.booleanValue("GetQuotaUtilizationOverviewResponse.Success"));

		QuotaOverview quotaOverview = new QuotaOverview();

		Over80Percent over80Percent = new Over80Percent();
		over80Percent.setTotal(_ctx.longValue("GetQuotaUtilizationOverviewResponse.QuotaOverview.Over80Percent.Total"));
		over80Percent.setAdjustableRatio(_ctx.doubleValue("GetQuotaUtilizationOverviewResponse.QuotaOverview.Over80Percent.AdjustableRatio"));
		over80Percent.setAdjustable(_ctx.longValue("GetQuotaUtilizationOverviewResponse.QuotaOverview.Over80Percent.Adjustable"));
		quotaOverview.setOver80Percent(over80Percent);

		Over95Percent over95Percent = new Over95Percent();
		over95Percent.setTotal(_ctx.longValue("GetQuotaUtilizationOverviewResponse.QuotaOverview.Over95Percent.Total"));
		over95Percent.setAdjustableRatio(_ctx.doubleValue("GetQuotaUtilizationOverviewResponse.QuotaOverview.Over95Percent.AdjustableRatio"));
		over95Percent.setAdjustable(_ctx.longValue("GetQuotaUtilizationOverviewResponse.QuotaOverview.Over95Percent.Adjustable"));
		quotaOverview.setOver95Percent(over95Percent);

		InUse inUse = new InUse();
		inUse.setTotal(_ctx.longValue("GetQuotaUtilizationOverviewResponse.QuotaOverview.InUse.Total"));
		inUse.setAdjustableRatio(_ctx.doubleValue("GetQuotaUtilizationOverviewResponse.QuotaOverview.InUse.AdjustableRatio"));
		inUse.setAdjustable(_ctx.longValue("GetQuotaUtilizationOverviewResponse.QuotaOverview.InUse.Adjustable"));
		quotaOverview.setInUse(inUse);
		getQuotaUtilizationOverviewResponse.setQuotaOverview(quotaOverview);
	 
	 	return getQuotaUtilizationOverviewResponse;
	}
}