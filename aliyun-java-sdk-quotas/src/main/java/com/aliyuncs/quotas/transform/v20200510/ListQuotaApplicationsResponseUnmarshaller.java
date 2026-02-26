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

import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationsResponse;
import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationsResponse.QuotaApplicationsItem;
import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationsResponse.QuotaApplicationsItem.Period;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQuotaApplicationsResponseUnmarshaller {

	public static ListQuotaApplicationsResponse unmarshall(ListQuotaApplicationsResponse listQuotaApplicationsResponse, UnmarshallerContext _ctx) {
		
		listQuotaApplicationsResponse.setRequestId(_ctx.stringValue("ListQuotaApplicationsResponse.RequestId"));
		listQuotaApplicationsResponse.setMaxResults(_ctx.integerValue("ListQuotaApplicationsResponse.MaxResults"));
		listQuotaApplicationsResponse.setNextToken(_ctx.stringValue("ListQuotaApplicationsResponse.NextToken"));
		listQuotaApplicationsResponse.setTotalCount(_ctx.integerValue("ListQuotaApplicationsResponse.TotalCount"));

		List<QuotaApplicationsItem> quotaApplications = new ArrayList<QuotaApplicationsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQuotaApplicationsResponse.QuotaApplications.Length"); i++) {
			QuotaApplicationsItem quotaApplicationsItem = new QuotaApplicationsItem();
			quotaApplicationsItem.setApplicationId(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].ApplicationId"));
			quotaApplicationsItem.setApplyTime(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].ApplyTime"));
			quotaApplicationsItem.setApproveValue(_ctx.floatValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].ApproveValue"));
			quotaApplicationsItem.setAuditReason(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].AuditReason"));
			quotaApplicationsItem.setComment(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Comment"));
			quotaApplicationsItem.setDesireValue(_ctx.floatValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].DesireValue"));
			quotaApplicationsItem.setDimension(_ctx.mapValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Dimension"));
			quotaApplicationsItem.setEffectiveTime(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].EffectiveTime"));
			quotaApplicationsItem.setExpireTime(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].ExpireTime"));
			quotaApplicationsItem.setNoticeType(_ctx.integerValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].NoticeType"));
			quotaApplicationsItem.setProductCode(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].ProductCode"));
			quotaApplicationsItem.setQuotaActionCode(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaActionCode"));
			quotaApplicationsItem.setQuotaArn(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaArn"));
			quotaApplicationsItem.setQuotaCategory(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaCategory"));
			quotaApplicationsItem.setQuotaDescription(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaDescription"));
			quotaApplicationsItem.setQuotaName(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaName"));
			quotaApplicationsItem.setQuotaUnit(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaUnit"));
			quotaApplicationsItem.setReason(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Reason"));
			quotaApplicationsItem.setStatus(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Status"));

			Period period = new Period();
			period.setPeriodUnit(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Period.PeriodUnit"));
			period.setPeriodValue(_ctx.longValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Period.PeriodValue"));
			quotaApplicationsItem.setPeriod(period);

			quotaApplications.add(quotaApplicationsItem);
		}
		listQuotaApplicationsResponse.setQuotaApplications(quotaApplications);
	 
	 	return listQuotaApplicationsResponse;
	}
}