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

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.ApplyInvoiceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.ApplyInvoiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyInvoiceResponseUnmarshaller {

	public static ApplyInvoiceResponse unmarshall(ApplyInvoiceResponse applyInvoiceResponse, UnmarshallerContext _ctx) {
		
		applyInvoiceResponse.setRequestId(_ctx.stringValue("ApplyInvoiceResponse.RequestId"));
		applyInvoiceResponse.setSuccess(_ctx.booleanValue("ApplyInvoiceResponse.Success"));
		applyInvoiceResponse.setCode(_ctx.stringValue("ApplyInvoiceResponse.Code"));
		applyInvoiceResponse.setMessage(_ctx.stringValue("ApplyInvoiceResponse.Message"));

		Data data = new Data();
		data.setInvoiceApplyId(_ctx.longValue("ApplyInvoiceResponse.Data.InvoiceApplyId"));
		applyInvoiceResponse.setData(data);
	 
	 	return applyInvoiceResponse;
	}
}