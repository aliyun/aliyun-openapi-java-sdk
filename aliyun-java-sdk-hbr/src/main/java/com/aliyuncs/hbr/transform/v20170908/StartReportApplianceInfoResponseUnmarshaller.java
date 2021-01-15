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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.StartReportApplianceInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartReportApplianceInfoResponseUnmarshaller {

	public static StartReportApplianceInfoResponse unmarshall(StartReportApplianceInfoResponse startReportApplianceInfoResponse, UnmarshallerContext _ctx) {
		
		startReportApplianceInfoResponse.setRequestId(_ctx.stringValue("StartReportApplianceInfoResponse.RequestId"));
		startReportApplianceInfoResponse.setSuccess(_ctx.booleanValue("StartReportApplianceInfoResponse.Success"));
		startReportApplianceInfoResponse.setCode(_ctx.stringValue("StartReportApplianceInfoResponse.Code"));
		startReportApplianceInfoResponse.setMessage(_ctx.stringValue("StartReportApplianceInfoResponse.Message"));
	 
	 	return startReportApplianceInfoResponse;
	}
}