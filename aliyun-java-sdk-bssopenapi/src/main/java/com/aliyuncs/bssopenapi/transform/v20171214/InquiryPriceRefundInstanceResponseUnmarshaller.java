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

import com.aliyuncs.bssopenapi.model.v20171214.InquiryPriceRefundInstanceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.InquiryPriceRefundInstanceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class InquiryPriceRefundInstanceResponseUnmarshaller {

	public static InquiryPriceRefundInstanceResponse unmarshall(InquiryPriceRefundInstanceResponse inquiryPriceRefundInstanceResponse, UnmarshallerContext _ctx) {
		
		inquiryPriceRefundInstanceResponse.setRequestId(_ctx.stringValue("InquiryPriceRefundInstanceResponse.RequestId"));
		inquiryPriceRefundInstanceResponse.setMessage(_ctx.stringValue("InquiryPriceRefundInstanceResponse.Message"));
		inquiryPriceRefundInstanceResponse.setCode(_ctx.stringValue("InquiryPriceRefundInstanceResponse.Code"));
		inquiryPriceRefundInstanceResponse.setSuccess(_ctx.booleanValue("InquiryPriceRefundInstanceResponse.Success"));

		Data data = new Data();
		data.setHostId(_ctx.stringValue("InquiryPriceRefundInstanceResponse.Data.HostId"));
		data.setInstanceId(_ctx.stringValue("InquiryPriceRefundInstanceResponse.Data.InstanceId"));
		data.setCurrency(_ctx.stringValue("InquiryPriceRefundInstanceResponse.Data.Currency"));
		data.setRefundAmount(_ctx.doubleValue("InquiryPriceRefundInstanceResponse.Data.RefundAmount"));
		inquiryPriceRefundInstanceResponse.setData(data);
	 
	 	return inquiryPriceRefundInstanceResponse;
	}
}