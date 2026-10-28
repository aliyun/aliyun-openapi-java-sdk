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

import com.aliyuncs.quotas.model.v20200510.StartQuotaUtilizationReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartQuotaUtilizationReportResponseUnmarshaller {

	public static StartQuotaUtilizationReportResponse unmarshall(StartQuotaUtilizationReportResponse startQuotaUtilizationReportResponse, UnmarshallerContext _ctx) {
		
		startQuotaUtilizationReportResponse.setRequestId(_ctx.stringValue("StartQuotaUtilizationReportResponse.RequestId"));
		startQuotaUtilizationReportResponse.setRefreshSuccess(_ctx.booleanValue("StartQuotaUtilizationReportResponse.RefreshSuccess"));
		startQuotaUtilizationReportResponse.setMessage(_ctx.stringValue("StartQuotaUtilizationReportResponse.Message"));
		startQuotaUtilizationReportResponse.setErrorMsg(_ctx.stringValue("StartQuotaUtilizationReportResponse.ErrorMsg"));
		startQuotaUtilizationReportResponse.setErrorCode(_ctx.stringValue("StartQuotaUtilizationReportResponse.ErrorCode"));
		startQuotaUtilizationReportResponse.setNextRefreshTime(_ctx.stringValue("StartQuotaUtilizationReportResponse.NextRefreshTime"));
		startQuotaUtilizationReportResponse.setSuccess(_ctx.booleanValue("StartQuotaUtilizationReportResponse.Success"));
	 
	 	return startQuotaUtilizationReportResponse;
	}
}