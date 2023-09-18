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

import com.aliyuncs.quotas.model.v20200510.ListProductQuotasResponse;
import com.aliyuncs.quotas.model.v20200510.ListProductQuotasResponse.QuotasItem;
import com.aliyuncs.quotas.model.v20200510.ListProductQuotasResponse.QuotasItem.Period;
import com.aliyuncs.quotas.model.v20200510.ListProductQuotasResponse.QuotasItem.QuotaItemsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListProductQuotasResponseUnmarshaller {

	public static ListProductQuotasResponse unmarshall(ListProductQuotasResponse listProductQuotasResponse, UnmarshallerContext _ctx) {
		
		listProductQuotasResponse.setRequestId(_ctx.stringValue("ListProductQuotasResponse.RequestId"));
		listProductQuotasResponse.setTotalCount(_ctx.integerValue("ListProductQuotasResponse.TotalCount"));
		listProductQuotasResponse.setNextToken(_ctx.stringValue("ListProductQuotasResponse.NextToken"));
		listProductQuotasResponse.setMaxResults(_ctx.integerValue("ListProductQuotasResponse.MaxResults"));

		List<QuotasItem> quotas = new ArrayList<QuotasItem>();
		for (int i = 0; i < _ctx.lengthValue("ListProductQuotasResponse.Quotas.Length"); i++) {
			QuotasItem quotasItem = new QuotasItem();
			quotasItem.setQuotaUnit(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaUnit"));
			quotasItem.setQuotaActionCode(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaActionCode"));
			quotasItem.setTotalUsage(_ctx.floatValue("ListProductQuotasResponse.Quotas["+ i +"].TotalUsage"));
			quotasItem.setQuotaType(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaType"));
			quotasItem.setQuotaDescription(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaDescription"));
			quotasItem.setQuotaArn(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaArn"));
			quotasItem.setApplicableType(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].ApplicableType"));
			quotasItem.setDimensions(_ctx.mapValue("ListProductQuotasResponse.Quotas["+ i +"].Dimensions"));
			quotasItem.setAdjustable(_ctx.booleanValue("ListProductQuotasResponse.Quotas["+ i +"].Adjustable"));
			quotasItem.setQuotaName(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaName"));
			quotasItem.setUnadjustableDetail(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].UnadjustableDetail"));
			quotasItem.setConsumable(_ctx.booleanValue("ListProductQuotasResponse.Quotas["+ i +"].Consumable"));
			quotasItem.setTotalQuota(_ctx.floatValue("ListProductQuotasResponse.Quotas["+ i +"].TotalQuota"));
			quotasItem.setProductCode(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].ProductCode"));
			quotasItem.setEffectiveTime(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].EffectiveTime"));
			quotasItem.setExpireTime(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].ExpireTime"));
			quotasItem.setQuotaCategory(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaCategory"));
			quotasItem.setApplyReasonTips(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].ApplyReasonTips"));

			List<Float> applicableRange = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("ListProductQuotasResponse.Quotas["+ i +"].ApplicableRange.Length"); j++) {
				applicableRange.add(_ctx.floatValue("ListProductQuotasResponse.Quotas["+ i +"].ApplicableRange["+ j +"]"));
			}
			quotasItem.setApplicableRange(applicableRange);

			List<Float> supportedRange = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("ListProductQuotasResponse.Quotas["+ i +"].SupportedRange.Length"); j++) {
				supportedRange.add(_ctx.floatValue("ListProductQuotasResponse.Quotas["+ i +"].SupportedRange["+ j +"]"));
			}
			quotasItem.setSupportedRange(supportedRange);

			Period period = new Period();
			period.setPeriodValue(_ctx.integerValue("ListProductQuotasResponse.Quotas["+ i +"].Period.PeriodValue"));
			period.setPeriodUnit(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].Period.PeriodUnit"));
			quotasItem.setPeriod(period);

			List<QuotaItemsItem> quotaItems = new ArrayList<QuotaItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaItems.Length"); j++) {
				QuotaItemsItem quotaItemsItem = new QuotaItemsItem();
				quotaItemsItem.setType(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaItems["+ j +"].Type"));
				quotaItemsItem.setQuota(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaItems["+ j +"].Quota"));
				quotaItemsItem.setQuotaUnit(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaItems["+ j +"].QuotaUnit"));
				quotaItemsItem.setUsage(_ctx.stringValue("ListProductQuotasResponse.Quotas["+ i +"].QuotaItems["+ j +"].Usage"));

				quotaItems.add(quotaItemsItem);
			}
			quotasItem.setQuotaItems(quotaItems);

			quotas.add(quotasItem);
		}
		listProductQuotasResponse.setQuotas(quotas);
	 
	 	return listProductQuotasResponse;
	}
}