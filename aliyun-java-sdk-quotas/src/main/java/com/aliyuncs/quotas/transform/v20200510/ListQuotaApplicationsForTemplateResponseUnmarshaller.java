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

import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationsForTemplateResponse;
import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationsForTemplateResponse.QuotaBatchApplicationsItem;
import com.aliyuncs.quotas.model.v20200510.ListQuotaApplicationsForTemplateResponse.QuotaBatchApplicationsItem.AuditStatusVo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQuotaApplicationsForTemplateResponseUnmarshaller {

	public static ListQuotaApplicationsForTemplateResponse unmarshall(ListQuotaApplicationsForTemplateResponse listQuotaApplicationsForTemplateResponse, UnmarshallerContext _ctx) {
		
		listQuotaApplicationsForTemplateResponse.setRequestId(_ctx.stringValue("ListQuotaApplicationsForTemplateResponse.RequestId"));
		listQuotaApplicationsForTemplateResponse.setNextToken(_ctx.stringValue("ListQuotaApplicationsForTemplateResponse.NextToken"));
		listQuotaApplicationsForTemplateResponse.setTotalCount(_ctx.integerValue("ListQuotaApplicationsForTemplateResponse.TotalCount"));
		listQuotaApplicationsForTemplateResponse.setMaxResults(_ctx.integerValue("ListQuotaApplicationsForTemplateResponse.MaxResults"));

		List<QuotaBatchApplicationsItem> quotaBatchApplications = new ArrayList<QuotaBatchApplicationsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications.Length"); i++) {
			QuotaBatchApplicationsItem quotaBatchApplicationsItem = new QuotaBatchApplicationsItem();
			quotaBatchApplicationsItem.setProductCode(_ctx.stringValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].ProductCode"));
			quotaBatchApplicationsItem.setQuotaActionCode(_ctx.stringValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].QuotaActionCode"));
			quotaBatchApplicationsItem.setBatchQuotaApplicationId(_ctx.stringValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].BatchQuotaApplicationId"));
			quotaBatchApplicationsItem.setEffectiveTime(_ctx.stringValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].EffectiveTime"));
			quotaBatchApplicationsItem.setExpireTime(_ctx.stringValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].ExpireTime"));
			quotaBatchApplicationsItem.setApplyTime(_ctx.stringValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].ApplyTime"));
			quotaBatchApplicationsItem.setDesireValue(_ctx.doubleValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].DesireValue"));
			quotaBatchApplicationsItem.setQuotaCategory(_ctx.stringValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].QuotaCategory"));
			quotaBatchApplicationsItem.setDimensions(_ctx.mapValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].Dimensions"));

			List<AuditStatusVo> auditStatusVos = new ArrayList<AuditStatusVo>();
			for (int j = 0; j < _ctx.lengthValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].AuditStatusVos.Length"); j++) {
				AuditStatusVo auditStatusVo = new AuditStatusVo();
				auditStatusVo.setStatus(_ctx.stringValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].AuditStatusVos["+ j +"].Status"));
				auditStatusVo.setCount(_ctx.integerValue("ListQuotaApplicationsForTemplateResponse.QuotaBatchApplications["+ i +"].AuditStatusVos["+ j +"].Count"));

				auditStatusVos.add(auditStatusVo);
			}
			quotaBatchApplicationsItem.setAuditStatusVos(auditStatusVos);

			quotaBatchApplications.add(quotaBatchApplicationsItem);
		}
		listQuotaApplicationsForTemplateResponse.setQuotaBatchApplications(quotaBatchApplications);
	 
	 	return listQuotaApplicationsForTemplateResponse;
	}
}