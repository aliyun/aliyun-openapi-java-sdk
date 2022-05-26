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

package com.aliyuncs.account_crm.transform.v20160606;

import com.aliyuncs.account_crm.model.v20160606.CancelAsyncModifyLoginEmailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelAsyncModifyLoginEmailResponseUnmarshaller {

	public static CancelAsyncModifyLoginEmailResponse unmarshall(CancelAsyncModifyLoginEmailResponse cancelAsyncModifyLoginEmailResponse, UnmarshallerContext _ctx) {
		
		cancelAsyncModifyLoginEmailResponse.setRequestId(_ctx.stringValue("CancelAsyncModifyLoginEmailResponse.RequestId"));
		cancelAsyncModifyLoginEmailResponse.setCode(_ctx.stringValue("CancelAsyncModifyLoginEmailResponse.Code"));
		cancelAsyncModifyLoginEmailResponse.setMessage(_ctx.stringValue("CancelAsyncModifyLoginEmailResponse.Message"));
		cancelAsyncModifyLoginEmailResponse.setSuccess(_ctx.stringValue("CancelAsyncModifyLoginEmailResponse.Success"));
	 
	 	return cancelAsyncModifyLoginEmailResponse;
	}
}