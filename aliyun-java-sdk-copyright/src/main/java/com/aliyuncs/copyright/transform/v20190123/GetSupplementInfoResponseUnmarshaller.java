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

package com.aliyuncs.copyright.transform.v20190123;

import com.aliyuncs.copyright.model.v20190123.GetSupplementInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSupplementInfoResponseUnmarshaller {

	public static GetSupplementInfoResponse unmarshall(GetSupplementInfoResponse getSupplementInfoResponse, UnmarshallerContext _ctx) {
		
		getSupplementInfoResponse.setRequestId(_ctx.stringValue("GetSupplementInfoResponse.RequestId"));
		getSupplementInfoResponse.setSuccess(_ctx.booleanValue("GetSupplementInfoResponse.Success"));
		getSupplementInfoResponse.setMessage(_ctx.stringValue("GetSupplementInfoResponse.Message"));
		getSupplementInfoResponse.setBizId(_ctx.stringValue("GetSupplementInfoResponse.BizId"));
		getSupplementInfoResponse.setSupplementId(_ctx.stringValue("GetSupplementInfoResponse.SupplementId"));
		getSupplementInfoResponse.setSupplementType(_ctx.stringValue("GetSupplementInfoResponse.SupplementType"));
		getSupplementInfoResponse.setSupplementReason(_ctx.stringValue("GetSupplementInfoResponse.SupplementReason"));
		getSupplementInfoResponse.setReceiveTimestamp(_ctx.stringValue("GetSupplementInfoResponse.ReceiveTimestamp"));
		getSupplementInfoResponse.setAdditionalReason(_ctx.stringValue("GetSupplementInfoResponse.AdditionalReason"));
		getSupplementInfoResponse.setSupplementFields(_ctx.stringValue("GetSupplementInfoResponse.SupplementFields"));
	 
	 	return getSupplementInfoResponse;
	}
}