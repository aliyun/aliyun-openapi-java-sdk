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

import com.aliyuncs.quotas.model.v20200510.CreateQuotaApplicationResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateQuotaApplicationResponseUnmarshaller {

	public static CreateQuotaApplicationResponse unmarshall(CreateQuotaApplicationResponse createQuotaApplicationResponse, UnmarshallerContext _ctx) {
		
		createQuotaApplicationResponse.setRequestId(_ctx.stringValue("CreateQuotaApplicationResponse.RequestId"));
		createQuotaApplicationResponse.setStatus(_ctx.stringValue("CreateQuotaApplicationResponse.Status"));
		createQuotaApplicationResponse.setApplyTime(_ctx.stringValue("CreateQuotaApplicationResponse.ApplyTime"));
		createQuotaApplicationResponse.setQuotaDescription(_ctx.stringValue("CreateQuotaApplicationResponse.QuotaDescription"));
		createQuotaApplicationResponse.setEffectiveTime(_ctx.stringValue("CreateQuotaApplicationResponse.EffectiveTime"));
		createQuotaApplicationResponse.setProductCode(_ctx.stringValue("CreateQuotaApplicationResponse.ProductCode"));
		createQuotaApplicationResponse.setQuotaUnit(_ctx.stringValue("CreateQuotaApplicationResponse.QuotaUnit"));
		createQuotaApplicationResponse.setAuditReason(_ctx.stringValue("CreateQuotaApplicationResponse.AuditReason"));
		createQuotaApplicationResponse.setDimension(_ctx.mapValue("CreateQuotaApplicationResponse.Dimension"));
		createQuotaApplicationResponse.setApproveValue(_ctx.floatValue("CreateQuotaApplicationResponse.ApproveValue"));
		createQuotaApplicationResponse.setReason(_ctx.stringValue("CreateQuotaApplicationResponse.Reason"));
		createQuotaApplicationResponse.setQuotaActionCode(_ctx.stringValue("CreateQuotaApplicationResponse.QuotaActionCode"));
		createQuotaApplicationResponse.setQuotaName(_ctx.stringValue("CreateQuotaApplicationResponse.QuotaName"));
		createQuotaApplicationResponse.setQuotaArn(_ctx.stringValue("CreateQuotaApplicationResponse.QuotaArn"));
		createQuotaApplicationResponse.setNoticeType(_ctx.longValue("CreateQuotaApplicationResponse.NoticeType"));
		createQuotaApplicationResponse.setExpireTime(_ctx.stringValue("CreateQuotaApplicationResponse.ExpireTime"));
		createQuotaApplicationResponse.setApplicationId(_ctx.stringValue("CreateQuotaApplicationResponse.ApplicationId"));
		createQuotaApplicationResponse.setDesireValue(_ctx.integerValue("CreateQuotaApplicationResponse.DesireValue"));
	 
	 	return createQuotaApplicationResponse;
	}
}