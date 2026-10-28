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

import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationsDetailForTemplateResponse;
import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationsDetailForTemplateResponse.QuotaBatchApplicationDetailVos;
import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationsDetailForTemplateResponse.QuotaBatchApplicationDetailVos.Period;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQuotaApplicationsDetailForTemplateResponseUnmarshaller {

	public static ListQuotaApplicationsDetailForTemplateResponse unmarshall(ListQuotaApplicationsDetailForTemplateResponse listQuotaApplicationsDetailForTemplateResponse, UnmarshallerContext _ctx) {
		
		listQuotaApplicationsDetailForTemplateResponse.setRequestId(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.RequestId"));
		listQuotaApplicationsDetailForTemplateResponse.setTotalCount(_ctx.integerValue("ListQuotaApplicationsDetailForTemplateResponse.TotalCount"));
		listQuotaApplicationsDetailForTemplateResponse.setNextToken(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.NextToken"));
		listQuotaApplicationsDetailForTemplateResponse.setMaxResults(_ctx.integerValue("ListQuotaApplicationsDetailForTemplateResponse.MaxResults"));

		List<QuotaBatchApplicationDetailVos> quotaApplications = new ArrayList<QuotaBatchApplicationDetailVos>();
		for (int i = 0; i < _ctx.lengthValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications.Length"); i++) {
			QuotaBatchApplicationDetailVos quotaBatchApplicationDetailVos = new QuotaBatchApplicationDetailVos();
			quotaBatchApplicationDetailVos.setStatus(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].Status"));
			quotaBatchApplicationDetailVos.setApplyTime(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].ApplyTime"));
			quotaBatchApplicationDetailVos.setQuotaDescription(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].QuotaDescription"));
			quotaBatchApplicationDetailVos.setBatchQuotaApplicationId(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].BatchQuotaApplicationId"));
			quotaBatchApplicationDetailVos.setEffectiveTime(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].EffectiveTime"));
			quotaBatchApplicationDetailVos.setProductCode(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].ProductCode"));
			quotaBatchApplicationDetailVos.setAuditReason(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].AuditReason"));
			quotaBatchApplicationDetailVos.setQuotaUnit(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].QuotaUnit"));
			quotaBatchApplicationDetailVos.setApproveValue(_ctx.doubleValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].ApproveValue"));
			quotaBatchApplicationDetailVos.setReason(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].Reason"));
			quotaBatchApplicationDetailVos.setEnvLanguage(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].EnvLanguage"));
			quotaBatchApplicationDetailVos.setQuotaActionCode(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].QuotaActionCode"));
			quotaBatchApplicationDetailVos.setQuotaName(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].QuotaName"));
			quotaBatchApplicationDetailVos.setQuotaArn(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].QuotaArn"));
			quotaBatchApplicationDetailVos.setAliyunUid(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].AliyunUid"));
			quotaBatchApplicationDetailVos.setQuotaCategory(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].QuotaCategory"));
			quotaBatchApplicationDetailVos.setNoticeType(_ctx.integerValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].NoticeType"));
			quotaBatchApplicationDetailVos.setQuotaDimension(_ctx.mapValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].QuotaDimension"));
			quotaBatchApplicationDetailVos.setApplicationId(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].ApplicationId"));
			quotaBatchApplicationDetailVos.setDesireValue(_ctx.doubleValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].DesireValue"));
			quotaBatchApplicationDetailVos.setExpireTime(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].ExpireTime"));

			Period period = new Period();
			period.setPeriodValue(_ctx.integerValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].Period.PeriodValue"));
			period.setPeriodUnit(_ctx.stringValue("ListQuotaApplicationsDetailForTemplateResponse.QuotaApplications["+ i +"].Period.PeriodUnit"));
			quotaBatchApplicationDetailVos.setPeriod(period);

			quotaApplications.add(quotaBatchApplicationDetailVos);
		}
		listQuotaApplicationsDetailForTemplateResponse.setQuotaApplications(quotaApplications);
	 
	 	return listQuotaApplicationsDetailForTemplateResponse;
	}
}