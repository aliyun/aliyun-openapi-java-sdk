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

package com.aliyuncs.agency.transform.v20180701;

import com.aliyuncs.agency.model.v20180701.GetCreditInfoResponse;
import com.aliyuncs.agency.model.v20180701.GetCreditInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCreditInfoResponseUnmarshaller {

	public static GetCreditInfoResponse unmarshall(GetCreditInfoResponse getCreditInfoResponse, UnmarshallerContext _ctx) {
		
		getCreditInfoResponse.setCode(_ctx.stringValue("GetCreditInfoResponse.Code"));
		getCreditInfoResponse.setMessage(_ctx.stringValue("GetCreditInfoResponse.Message"));
		getCreditInfoResponse.setSuccess(_ctx.booleanValue("GetCreditInfoResponse.Success"));

		Data data = new Data();
		data.setOutstandingBalance(_ctx.stringValue("GetCreditInfoResponse.Data.OutstandingBalance"));
		data.setCreditLine(_ctx.stringValue("GetCreditInfoResponse.Data.CreditLine"));
		data.setAccountStatus(_ctx.stringValue("GetCreditInfoResponse.Data.AccountStatus"));
		data.setAvailableCredit(_ctx.stringValue("GetCreditInfoResponse.Data.AvailableCredit"));
		data.setAlarmThreshold(_ctx.stringValue("GetCreditInfoResponse.Data.AlarmThreshold"));
		data.setZeroCreditShutdownPolicy(_ctx.stringValue("GetCreditInfoResponse.Data.ZeroCreditShutdownPolicy"));
		getCreditInfoResponse.setData(data);
	 
	 	return getCreditInfoResponse;
	}
}