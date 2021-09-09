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

package com.aliyuncs.companyreg.transform.v20201022;

import com.aliyuncs.companyreg.model.v20201022.GetServiceInfoResponse;
import com.aliyuncs.companyreg.model.v20201022.GetServiceInfoResponse.InvoiceCheckControlledInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceInfoResponseUnmarshaller {

	public static GetServiceInfoResponse unmarshall(GetServiceInfoResponse getServiceInfoResponse, UnmarshallerContext _ctx) {
		
		getServiceInfoResponse.setRequestId(_ctx.stringValue("GetServiceInfoResponse.RequestId"));
		getServiceInfoResponse.setOpeningPeriod(_ctx.stringValue("GetServiceInfoResponse.OpeningPeriod"));
		getServiceInfoResponse.setCurrentPeriod(_ctx.stringValue("GetServiceInfoResponse.CurrentPeriod"));
		getServiceInfoResponse.setSystemTime(_ctx.longValue("GetServiceInfoResponse.SystemTime"));
		getServiceInfoResponse.setIsClearedTrialData(_ctx.booleanValue("GetServiceInfoResponse.IsClearedTrialData"));
		getServiceInfoResponse.setName(_ctx.stringValue("GetServiceInfoResponse.Name"));
		getServiceInfoResponse.setOpeningBalanceStatus(_ctx.stringValue("GetServiceInfoResponse.OpeningBalanceStatus"));

		InvoiceCheckControlledInfo invoiceCheckControlledInfo = new InvoiceCheckControlledInfo();
		invoiceCheckControlledInfo.setMonthCheckCount(_ctx.integerValue("GetServiceInfoResponse.InvoiceCheckControlledInfo.MonthCheckCount"));
		invoiceCheckControlledInfo.setMonthLimitCount(_ctx.integerValue("GetServiceInfoResponse.InvoiceCheckControlledInfo.MonthLimitCount"));
		invoiceCheckControlledInfo.setTrialLimitCount(_ctx.integerValue("GetServiceInfoResponse.InvoiceCheckControlledInfo.TrialLimitCount"));
		invoiceCheckControlledInfo.setIsControlledByLimit(_ctx.booleanValue("GetServiceInfoResponse.InvoiceCheckControlledInfo.IsControlledByLimit"));
		getServiceInfoResponse.setInvoiceCheckControlledInfo(invoiceCheckControlledInfo);
	 
	 	return getServiceInfoResponse;
	}
}