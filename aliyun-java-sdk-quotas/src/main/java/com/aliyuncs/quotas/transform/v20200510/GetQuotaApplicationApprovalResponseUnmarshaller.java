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

import com.aliyuncs.quotas.model.v20200510.GetQuotaApplicationApprovalResponse;
import com.aliyuncs.quotas.model.v20200510.GetQuotaApplicationApprovalResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQuotaApplicationApprovalResponseUnmarshaller {

	public static GetQuotaApplicationApprovalResponse unmarshall(GetQuotaApplicationApprovalResponse getQuotaApplicationApprovalResponse, UnmarshallerContext _ctx) {
		
		getQuotaApplicationApprovalResponse.setRequestId(_ctx.stringValue("GetQuotaApplicationApprovalResponse.RequestId"));
		getQuotaApplicationApprovalResponse.setHttpStatusCode(_ctx.integerValue("GetQuotaApplicationApprovalResponse.HttpStatusCode"));
		getQuotaApplicationApprovalResponse.setDynamicCode(_ctx.stringValue("GetQuotaApplicationApprovalResponse.DynamicCode"));
		getQuotaApplicationApprovalResponse.setDynamicMessage(_ctx.stringValue("GetQuotaApplicationApprovalResponse.DynamicMessage"));
		getQuotaApplicationApprovalResponse.setErrorMsg(_ctx.stringValue("GetQuotaApplicationApprovalResponse.ErrorMsg"));
		getQuotaApplicationApprovalResponse.setErrorCode(_ctx.stringValue("GetQuotaApplicationApprovalResponse.ErrorCode"));
		getQuotaApplicationApprovalResponse.setSuccess(_ctx.booleanValue("GetQuotaApplicationApprovalResponse.Success"));
		getQuotaApplicationApprovalResponse.setAllowRetry(_ctx.booleanValue("GetQuotaApplicationApprovalResponse.AllowRetry"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetQuotaApplicationApprovalResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetQuotaApplicationApprovalResponse.ErrorArgs["+ i +"]"));
		}
		getQuotaApplicationApprovalResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setApprovalHours(_ctx.integerValue("GetQuotaApplicationApprovalResponse.Module.ApprovalHours"));
		module.setSupportReminder(_ctx.booleanValue("GetQuotaApplicationApprovalResponse.Module.SupportReminder"));
		module.setUnsupportReminderReason(_ctx.stringValue("GetQuotaApplicationApprovalResponse.Module.UnsupportReminderReason"));
		module.setReminderIntervalHours(_ctx.integerValue("GetQuotaApplicationApprovalResponse.Module.ReminderIntervalHours"));
		getQuotaApplicationApprovalResponse.setModule(module);
	 
	 	return getQuotaApplicationApprovalResponse;
	}
}