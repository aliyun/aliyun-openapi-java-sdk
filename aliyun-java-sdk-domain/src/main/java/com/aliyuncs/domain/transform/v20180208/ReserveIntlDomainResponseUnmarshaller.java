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

package com.aliyuncs.domain.transform.v20180208;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180208.ReserveIntlDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReserveIntlDomainResponseUnmarshaller {

	public static ReserveIntlDomainResponse unmarshall(ReserveIntlDomainResponse reserveIntlDomainResponse, UnmarshallerContext _ctx) {
		
		reserveIntlDomainResponse.setRequestId(_ctx.stringValue("ReserveIntlDomainResponse.RequestId"));
		reserveIntlDomainResponse.setHttpStatusCode(_ctx.integerValue("ReserveIntlDomainResponse.HttpStatusCode"));
		reserveIntlDomainResponse.setDynamicCode(_ctx.stringValue("ReserveIntlDomainResponse.DynamicCode"));
		reserveIntlDomainResponse.setDynamicMessage(_ctx.stringValue("ReserveIntlDomainResponse.DynamicMessage"));
		reserveIntlDomainResponse.setErrorMsg(_ctx.stringValue("ReserveIntlDomainResponse.ErrorMsg"));
		reserveIntlDomainResponse.setErrorCode(_ctx.stringValue("ReserveIntlDomainResponse.ErrorCode"));
		reserveIntlDomainResponse.setSuccess(_ctx.booleanValue("ReserveIntlDomainResponse.Success"));
		reserveIntlDomainResponse.setAllowRetry(_ctx.booleanValue("ReserveIntlDomainResponse.AllowRetry"));
		reserveIntlDomainResponse.setAppName(_ctx.stringValue("ReserveIntlDomainResponse.AppName"));
		reserveIntlDomainResponse.setAuctionId(_ctx.stringValue("ReserveIntlDomainResponse.AuctionId"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ReserveIntlDomainResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("ReserveIntlDomainResponse.ErrorArgs["+ i +"]"));
		}
		reserveIntlDomainResponse.setErrorArgs(errorArgs);
	 
	 	return reserveIntlDomainResponse;
	}
}