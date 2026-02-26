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

package com.aliyuncs.quotas.transform.v20200510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quotas.model.v20200510.RemindQuotaApplicationApprovalResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemindQuotaApplicationApprovalResponseUnmarshaller {

	public static RemindQuotaApplicationApprovalResponse unmarshall(RemindQuotaApplicationApprovalResponse remindQuotaApplicationApprovalResponse, UnmarshallerContext _ctx) {
		
		remindQuotaApplicationApprovalResponse.setRequestId(_ctx.stringValue("RemindQuotaApplicationApprovalResponse.RequestId"));
		remindQuotaApplicationApprovalResponse.setHttpStatusCode(_ctx.integerValue("RemindQuotaApplicationApprovalResponse.HttpStatusCode"));
		remindQuotaApplicationApprovalResponse.setDynamicCode(_ctx.stringValue("RemindQuotaApplicationApprovalResponse.DynamicCode"));
		remindQuotaApplicationApprovalResponse.setDynamicMessage(_ctx.stringValue("RemindQuotaApplicationApprovalResponse.DynamicMessage"));
		remindQuotaApplicationApprovalResponse.setErrorMsg(_ctx.stringValue("RemindQuotaApplicationApprovalResponse.ErrorMsg"));
		remindQuotaApplicationApprovalResponse.setErrorCode(_ctx.stringValue("RemindQuotaApplicationApprovalResponse.ErrorCode"));
		remindQuotaApplicationApprovalResponse.setSuccess(_ctx.booleanValue("RemindQuotaApplicationApprovalResponse.Success"));
		remindQuotaApplicationApprovalResponse.setModule(_ctx.stringValue("RemindQuotaApplicationApprovalResponse.Module"));
		remindQuotaApplicationApprovalResponse.setAllowRetry(_ctx.booleanValue("RemindQuotaApplicationApprovalResponse.AllowRetry"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RemindQuotaApplicationApprovalResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("RemindQuotaApplicationApprovalResponse.ErrorArgs["+ i +"]"));
		}
		remindQuotaApplicationApprovalResponse.setErrorArgs(errorArgs);
	 
	 	return remindQuotaApplicationApprovalResponse;
	}
}