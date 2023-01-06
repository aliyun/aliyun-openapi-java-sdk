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

import com.aliyuncs.quotas.model.v20200510.GetQuotaApplicationResponse;
import com.aliyuncs.quotas.model.v20200510.GetQuotaApplicationResponse.QuotaApplication;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQuotaApplicationResponseUnmarshaller {

	public static GetQuotaApplicationResponse unmarshall(GetQuotaApplicationResponse getQuotaApplicationResponse, UnmarshallerContext _ctx) {
		
		getQuotaApplicationResponse.setRequestId(_ctx.stringValue("GetQuotaApplicationResponse.RequestId"));

		QuotaApplication quotaApplication = new QuotaApplication();
		quotaApplication.setStatus(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.Status"));
		quotaApplication.setDesireValue(_ctx.integerValue("GetQuotaApplicationResponse.QuotaApplication.DesireValue"));
		quotaApplication.setQuotaActionCode(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.QuotaActionCode"));
		quotaApplication.setQuotaName(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.QuotaName"));
		quotaApplication.setApplicationId(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.ApplicationId"));
		quotaApplication.setReason(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.Reason"));
		quotaApplication.setAuditReason(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.AuditReason"));
		quotaApplication.setQuotaDescription(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.QuotaDescription"));
		quotaApplication.setProductCode(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.ProductCode"));
		quotaApplication.setQuotaArn(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.QuotaArn"));
		quotaApplication.setApplyTime(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.ApplyTime"));
		quotaApplication.setApproveValue(_ctx.floatValue("GetQuotaApplicationResponse.QuotaApplication.ApproveValue"));
		quotaApplication.setDimension(_ctx.mapValue("GetQuotaApplicationResponse.QuotaApplication.Dimension"));
		quotaApplication.setNoticeType(_ctx.longValue("GetQuotaApplicationResponse.QuotaApplication.NoticeType"));
		quotaApplication.setEffectiveTime(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.EffectiveTime"));
		quotaApplication.setExpireTime(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.ExpireTime"));
		quotaApplication.setQuotaUnit(_ctx.stringValue("GetQuotaApplicationResponse.QuotaApplication.QuotaUnit"));
		getQuotaApplicationResponse.setQuotaApplication(quotaApplication);
	 
	 	return getQuotaApplicationResponse;
	}
}