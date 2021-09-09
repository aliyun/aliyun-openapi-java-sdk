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

import com.aliyuncs.companyreg.model.v20201022.ConvertInvoiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConvertInvoiceResponseUnmarshaller {

	public static ConvertInvoiceResponse unmarshall(ConvertInvoiceResponse convertInvoiceResponse, UnmarshallerContext _ctx) {
		
		convertInvoiceResponse.setRequestId(_ctx.stringValue("ConvertInvoiceResponse.RequestId"));
		convertInvoiceResponse.setData(_ctx.booleanValue("ConvertInvoiceResponse.Data"));
	 
	 	return convertInvoiceResponse;
	}
}