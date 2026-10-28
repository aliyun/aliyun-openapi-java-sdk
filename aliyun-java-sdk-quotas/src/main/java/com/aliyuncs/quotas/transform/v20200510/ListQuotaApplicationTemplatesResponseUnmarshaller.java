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

import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationTemplatesResponse;
import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplatesItem;
import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplatesItem.Period;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQuotaApplicationTemplatesResponseUnmarshaller {

	public static ListQuotaApplicationTemplatesResponse unmarshall(ListQuotaApplicationTemplatesResponse listQuotaApplicationTemplatesResponse, UnmarshallerContext _ctx) {
		
		listQuotaApplicationTemplatesResponse.setRequestId(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.RequestId"));
		listQuotaApplicationTemplatesResponse.setTotalCount(_ctx.integerValue("ListQuotaApplicationTemplatesResponse.TotalCount"));
		listQuotaApplicationTemplatesResponse.setNextToken(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.NextToken"));
		listQuotaApplicationTemplatesResponse.setMaxResults(_ctx.integerValue("ListQuotaApplicationTemplatesResponse.MaxResults"));

		List<QuotaApplicationTemplatesItem> quotaApplicationTemplates = new ArrayList<QuotaApplicationTemplatesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates.Length"); i++) {
			QuotaApplicationTemplatesItem quotaApplicationTemplatesItem = new QuotaApplicationTemplatesItem();
			quotaApplicationTemplatesItem.setQuotaDescription(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].QuotaDescription"));
			quotaApplicationTemplatesItem.setEffectiveTime(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].EffectiveTime"));
			quotaApplicationTemplatesItem.setProductCode(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].ProductCode"));
			quotaApplicationTemplatesItem.setDimensions(_ctx.mapValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].Dimensions"));
			quotaApplicationTemplatesItem.setEnvLanguage(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].EnvLanguage"));
			quotaApplicationTemplatesItem.setQuotaActionCode(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].QuotaActionCode"));
			quotaApplicationTemplatesItem.setQuotaName(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].QuotaName"));
			quotaApplicationTemplatesItem.setQuotaCategory(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].QuotaCategory"));
			quotaApplicationTemplatesItem.setNoticeType(_ctx.integerValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].NoticeType"));
			quotaApplicationTemplatesItem.setId(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].Id"));
			quotaApplicationTemplatesItem.setDesireValue(_ctx.floatValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].DesireValue"));
			quotaApplicationTemplatesItem.setExpireTime(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].ExpireTime"));
			quotaApplicationTemplatesItem.setApplicableType(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].ApplicableType"));

			List<Float> applicableRange = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].ApplicableRange.Length"); j++) {
				applicableRange.add(_ctx.floatValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].ApplicableRange["+ j +"]"));
			}
			quotaApplicationTemplatesItem.setApplicableRange(applicableRange);

			Period period = new Period();
			period.setPeriodValue(_ctx.integerValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].Period.PeriodValue"));
			period.setPeriodUnit(_ctx.stringValue("ListQuotaApplicationTemplatesResponse.QuotaApplicationTemplates["+ i +"].Period.PeriodUnit"));
			quotaApplicationTemplatesItem.setPeriod(period);

			quotaApplicationTemplates.add(quotaApplicationTemplatesItem);
		}
		listQuotaApplicationTemplatesResponse.setQuotaApplicationTemplates(quotaApplicationTemplates);
	 
	 	return listQuotaApplicationTemplatesResponse;
	}
}