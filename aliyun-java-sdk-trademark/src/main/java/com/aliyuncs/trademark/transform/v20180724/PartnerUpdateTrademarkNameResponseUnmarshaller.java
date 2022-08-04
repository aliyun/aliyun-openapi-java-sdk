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

package com.aliyuncs.trademark.transform.v20180724;

import com.aliyuncs.trademark.model.v20180724.PartnerUpdateTrademarkNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PartnerUpdateTrademarkNameResponseUnmarshaller {

	public static PartnerUpdateTrademarkNameResponse unmarshall(PartnerUpdateTrademarkNameResponse partnerUpdateTrademarkNameResponse, UnmarshallerContext _ctx) {
		
		partnerUpdateTrademarkNameResponse.setRequestId(_ctx.stringValue("PartnerUpdateTrademarkNameResponse.RequestId"));
		partnerUpdateTrademarkNameResponse.setAllowRetry(_ctx.booleanValue("PartnerUpdateTrademarkNameResponse.AllowRetry"));
		partnerUpdateTrademarkNameResponse.setErrorMsg(_ctx.stringValue("PartnerUpdateTrademarkNameResponse.ErrorMsg"));
		partnerUpdateTrademarkNameResponse.setHttpStatusCode(_ctx.integerValue("PartnerUpdateTrademarkNameResponse.HttpStatusCode"));
		partnerUpdateTrademarkNameResponse.setDynamicCode(_ctx.stringValue("PartnerUpdateTrademarkNameResponse.DynamicCode"));
		partnerUpdateTrademarkNameResponse.setErrorCode(_ctx.stringValue("PartnerUpdateTrademarkNameResponse.ErrorCode"));
		partnerUpdateTrademarkNameResponse.setDynamicMessage(_ctx.stringValue("PartnerUpdateTrademarkNameResponse.DynamicMessage"));
		partnerUpdateTrademarkNameResponse.setSuccess(_ctx.booleanValue("PartnerUpdateTrademarkNameResponse.Success"));
		partnerUpdateTrademarkNameResponse.setAppName(_ctx.stringValue("PartnerUpdateTrademarkNameResponse.AppName"));
	 
	 	return partnerUpdateTrademarkNameResponse;
	}
}