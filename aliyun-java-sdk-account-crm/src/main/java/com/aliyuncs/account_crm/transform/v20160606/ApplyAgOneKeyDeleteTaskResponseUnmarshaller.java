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

import com.aliyuncs.account_crm.model.v20160606.ApplyAgOneKeyDeleteTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyAgOneKeyDeleteTaskResponseUnmarshaller {

	public static ApplyAgOneKeyDeleteTaskResponse unmarshall(ApplyAgOneKeyDeleteTaskResponse applyAgOneKeyDeleteTaskResponse, UnmarshallerContext _ctx) {
		
		applyAgOneKeyDeleteTaskResponse.setRequestId(_ctx.stringValue("ApplyAgOneKeyDeleteTaskResponse.RequestId"));
		applyAgOneKeyDeleteTaskResponse.setCode(_ctx.stringValue("ApplyAgOneKeyDeleteTaskResponse.Code"));
		applyAgOneKeyDeleteTaskResponse.setMessage(_ctx.stringValue("ApplyAgOneKeyDeleteTaskResponse.Message"));
		applyAgOneKeyDeleteTaskResponse.setData(_ctx.stringValue("ApplyAgOneKeyDeleteTaskResponse.Data"));
		applyAgOneKeyDeleteTaskResponse.setSuccess(_ctx.booleanValue("ApplyAgOneKeyDeleteTaskResponse.Success"));
		applyAgOneKeyDeleteTaskResponse.setNeedAbandonSpAfterPay(_ctx.booleanValue("ApplyAgOneKeyDeleteTaskResponse.NeedAbandonSpAfterPay"));
	 
	 	return applyAgOneKeyDeleteTaskResponse;
	}
}