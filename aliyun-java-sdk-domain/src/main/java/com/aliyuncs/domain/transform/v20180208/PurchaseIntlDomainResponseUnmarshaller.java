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

import com.aliyuncs.domain.model.v20180208.PurchaseIntlDomainResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class PurchaseIntlDomainResponseUnmarshaller {

	public static PurchaseIntlDomainResponse unmarshall(PurchaseIntlDomainResponse purchaseIntlDomainResponse, UnmarshallerContext _ctx) {
		
		purchaseIntlDomainResponse.setRequestId(_ctx.stringValue("PurchaseIntlDomainResponse.RequestId"));
		purchaseIntlDomainResponse.setHttpStatusCode(_ctx.integerValue("PurchaseIntlDomainResponse.HttpStatusCode"));
		purchaseIntlDomainResponse.setDynamicCode(_ctx.stringValue("PurchaseIntlDomainResponse.DynamicCode"));
		purchaseIntlDomainResponse.setDynamicMessage(_ctx.stringValue("PurchaseIntlDomainResponse.DynamicMessage"));
		purchaseIntlDomainResponse.setErrorMsg(_ctx.stringValue("PurchaseIntlDomainResponse.ErrorMsg"));
		purchaseIntlDomainResponse.setErrorCode(_ctx.stringValue("PurchaseIntlDomainResponse.ErrorCode"));
		purchaseIntlDomainResponse.setSuccess(_ctx.booleanValue("PurchaseIntlDomainResponse.Success"));
		purchaseIntlDomainResponse.setAllowRetry(_ctx.booleanValue("PurchaseIntlDomainResponse.AllowRetry"));
		purchaseIntlDomainResponse.setAppName(_ctx.stringValue("PurchaseIntlDomainResponse.AppName"));
		purchaseIntlDomainResponse.setAuctionId(_ctx.stringValue("PurchaseIntlDomainResponse.AuctionId"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("PurchaseIntlDomainResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("PurchaseIntlDomainResponse.ErrorArgs["+ i +"]"));
		}
		purchaseIntlDomainResponse.setErrorArgs(errorArgs);
	 
	 	return purchaseIntlDomainResponse;
	}
}