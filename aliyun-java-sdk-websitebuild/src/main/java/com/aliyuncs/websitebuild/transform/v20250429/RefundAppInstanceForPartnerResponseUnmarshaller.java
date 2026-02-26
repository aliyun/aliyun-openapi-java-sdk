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

package com.aliyuncs.websitebuild.transform.v20250429;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.websitebuild.model.v20250429.RefundAppInstanceForPartnerResponse;
import com.aliyuncs.websitebuild.model.v20250429.RefundAppInstanceForPartnerResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefundAppInstanceForPartnerResponseUnmarshaller {

	public static RefundAppInstanceForPartnerResponse unmarshall(RefundAppInstanceForPartnerResponse refundAppInstanceForPartnerResponse, UnmarshallerContext _ctx) {
		
		refundAppInstanceForPartnerResponse.setRequestId(_ctx.stringValue("RefundAppInstanceForPartnerResponse.RequestId"));
		refundAppInstanceForPartnerResponse.setDynamicCode(_ctx.stringValue("RefundAppInstanceForPartnerResponse.DynamicCode"));
		refundAppInstanceForPartnerResponse.setDynamicMessage(_ctx.stringValue("RefundAppInstanceForPartnerResponse.DynamicMessage"));
		refundAppInstanceForPartnerResponse.setSynchro(_ctx.booleanValue("RefundAppInstanceForPartnerResponse.Synchro"));
		refundAppInstanceForPartnerResponse.setAccessDeniedDetail(_ctx.stringValue("RefundAppInstanceForPartnerResponse.AccessDeniedDetail"));
		refundAppInstanceForPartnerResponse.setRootErrorMsg(_ctx.stringValue("RefundAppInstanceForPartnerResponse.RootErrorMsg"));
		refundAppInstanceForPartnerResponse.setRootErrorCode(_ctx.stringValue("RefundAppInstanceForPartnerResponse.RootErrorCode"));
		refundAppInstanceForPartnerResponse.setAllowRetry(_ctx.booleanValue("RefundAppInstanceForPartnerResponse.AllowRetry"));
		refundAppInstanceForPartnerResponse.setAppName(_ctx.stringValue("RefundAppInstanceForPartnerResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RefundAppInstanceForPartnerResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("RefundAppInstanceForPartnerResponse.ErrorArgs["+ i +"]"));
		}
		refundAppInstanceForPartnerResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setOrderId(_ctx.stringValue("RefundAppInstanceForPartnerResponse.Module.OrderId"));
		refundAppInstanceForPartnerResponse.setModule(module);
	 
	 	return refundAppInstanceForPartnerResponse;
	}
}