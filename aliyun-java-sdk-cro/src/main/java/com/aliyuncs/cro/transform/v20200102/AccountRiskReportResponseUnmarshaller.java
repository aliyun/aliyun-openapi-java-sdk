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

package com.aliyuncs.cro.transform.v20200102;

import com.aliyuncs.cro.model.v20200102.AccountRiskReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AccountRiskReportResponseUnmarshaller {

	public static AccountRiskReportResponse unmarshall(AccountRiskReportResponse accountRiskReportResponse, UnmarshallerContext _ctx) {
		
		accountRiskReportResponse.setRequestId(_ctx.stringValue("AccountRiskReportResponse.RequestId"));
		accountRiskReportResponse.setCode(_ctx.integerValue("AccountRiskReportResponse.Code"));
		accountRiskReportResponse.setMessage(_ctx.stringValue("AccountRiskReportResponse.Message"));
		accountRiskReportResponse.setSuccess(_ctx.booleanValue("AccountRiskReportResponse.Success"));
	 
	 	return accountRiskReportResponse;
	}
}