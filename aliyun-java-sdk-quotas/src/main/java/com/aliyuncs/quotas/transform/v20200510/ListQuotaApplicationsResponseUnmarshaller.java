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
		listQuotaApplicationsResponse.setTotalCount(_ctx.integerValue("ListQuotaApplicationsResponse.TotalCount"));
		listQuotaApplicationsResponse.setNextToken(_ctx.stringValue("ListQuotaApplicationsResponse.NextToken"));
		listQuotaApplicationsResponse.setMaxResults(_ctx.integerValue("ListQuotaApplicationsResponse.MaxResults"));

		List<QuotaApplicationsItem> quotaApplications = new ArrayList<QuotaApplicationsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQuotaApplicationsResponse.QuotaApplications.Length"); i++) {
			QuotaApplicationsItem quotaApplicationsItem = new QuotaApplicationsItem();
			quotaApplicationsItem.setStatus(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Status"));
			quotaApplicationsItem.setApplyTime(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].ApplyTime"));
			quotaApplicationsItem.setComment(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Comment"));
			quotaApplicationsItem.setQuotaDescription(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaDescription"));
			quotaApplicationsItem.setProductCode(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].ProductCode"));
			quotaApplicationsItem.setEffectiveTime(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].EffectiveTime"));
			quotaApplicationsItem.setAuditReason(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].AuditReason"));
			quotaApplicationsItem.setQuotaUnit(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaUnit"));
			quotaApplicationsItem.setDimension(_ctx.mapValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Dimension"));
			quotaApplicationsItem.setApproveValue(_ctx.floatValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].ApproveValue"));
			quotaApplicationsItem.setReason(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Reason"));
			quotaApplicationsItem.setQuotaActionCode(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaActionCode"));
			quotaApplicationsItem.setQuotaName(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaName"));
			quotaApplicationsItem.setQuotaArn(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].QuotaArn"));
			quotaApplicationsItem.setNoticeType(_ctx.integerValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].NoticeType"));
			quotaApplicationsItem.setApplicationId(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].ApplicationId"));
			quotaApplicationsItem.setDesireValue(_ctx.floatValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].DesireValue"));
			quotaApplicationsItem.setExpireTime(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].ExpireTime"));

			Period period = new Period();
			period.setPeriodValue(_ctx.longValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Period.PeriodValue"));
			period.setPeriodUnit(_ctx.stringValue("ListQuotaApplicationsResponse.QuotaApplications["+ i +"].Period.PeriodUnit"));
			quotaApplicationsItem.setPeriod(period);

			quotaApplications.add(quotaApplicationsItem);
		}
		listQuotaApplicationsResponse.setQuotaApplications(quotaApplications);
	 
	 	return listQuotaApplicationsResponse;
	}
}