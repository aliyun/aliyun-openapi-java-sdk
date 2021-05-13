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

import com.aliyuncs.quotas.model.v20200510.GetProductQuotaResponse;
import com.aliyuncs.quotas.model.v20200510.GetProductQuotaResponse.Quota;
import com.aliyuncs.quotas.model.v20200510.GetProductQuotaResponse.Quota.Period;
import com.aliyuncs.quotas.model.v20200510.GetProductQuotaResponse.Quota.QuotaItemsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductQuotaResponseUnmarshaller {

	public static GetProductQuotaResponse unmarshall(GetProductQuotaResponse getProductQuotaResponse, UnmarshallerContext _ctx) {
		
		getProductQuotaResponse.setRequestId(_ctx.stringValue("GetProductQuotaResponse.RequestId"));

		Quota quota = new Quota();
		quota.setQuotaDescription(_ctx.stringValue("GetProductQuotaResponse.Quota.QuotaDescription"));
		quota.setConsumable(_ctx.booleanValue("GetProductQuotaResponse.Quota.Consumable"));
		quota.setUnadjustableDetail(_ctx.stringValue("GetProductQuotaResponse.Quota.UnadjustableDetail"));
		quota.setProductCode(_ctx.stringValue("GetProductQuotaResponse.Quota.ProductCode"));
		quota.setTotalUsage(_ctx.floatValue("GetProductQuotaResponse.Quota.TotalUsage"));
		quota.setQuotaType(_ctx.stringValue("GetProductQuotaResponse.Quota.QuotaType"));
		quota.setDimensions(_ctx.mapValue("GetProductQuotaResponse.Quota.Dimensions"));
		quota.setQuotaUnit(_ctx.stringValue("GetProductQuotaResponse.Quota.QuotaUnit"));
		quota.setAdjustable(_ctx.booleanValue("GetProductQuotaResponse.Quota.Adjustable"));
		quota.setQuotaActionCode(_ctx.stringValue("GetProductQuotaResponse.Quota.QuotaActionCode"));
		quota.setQuotaName(_ctx.stringValue("GetProductQuotaResponse.Quota.QuotaName"));
		quota.setQuotaArn(_ctx.stringValue("GetProductQuotaResponse.Quota.QuotaArn"));
		quota.setTotalQuota(_ctx.floatValue("GetProductQuotaResponse.Quota.TotalQuota"));
		quota.setApplicableType(_ctx.stringValue("GetProductQuotaResponse.Quota.ApplicableType"));

		List<Float> applicableRange = new ArrayList<Float>();
		for (int i = 0; i < _ctx.lengthValue("GetProductQuotaResponse.Quota.ApplicableRange.Length"); i++) {
			applicableRange.add(_ctx.floatValue("GetProductQuotaResponse.Quota.ApplicableRange["+ i +"]"));
		}
		quota.setApplicableRange(applicableRange);

		Period period = new Period();
		period.setPeriodValue(_ctx.integerValue("GetProductQuotaResponse.Quota.Period.PeriodValue"));
		period.setPeriodUnit(_ctx.stringValue("GetProductQuotaResponse.Quota.Period.PeriodUnit"));
		quota.setPeriod(period);

		List<QuotaItemsItem> quotaItems = new ArrayList<QuotaItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetProductQuotaResponse.Quota.QuotaItems.Length"); i++) {
			QuotaItemsItem quotaItemsItem = new QuotaItemsItem();
			quotaItemsItem.setUsage(_ctx.stringValue("GetProductQuotaResponse.Quota.QuotaItems["+ i +"].Usage"));
			quotaItemsItem.setType(_ctx.stringValue("GetProductQuotaResponse.Quota.QuotaItems["+ i +"].Type"));
			quotaItemsItem.setQuota(_ctx.stringValue("GetProductQuotaResponse.Quota.QuotaItems["+ i +"].Quota"));
			quotaItemsItem.setQuotaUnit(_ctx.stringValue("GetProductQuotaResponse.Quota.QuotaItems["+ i +"].QuotaUnit"));

			quotaItems.add(quotaItemsItem);
		}
		quota.setQuotaItems(quotaItems);
		getProductQuotaResponse.setQuota(quota);
	 
	 	return getProductQuotaResponse;
	}
}