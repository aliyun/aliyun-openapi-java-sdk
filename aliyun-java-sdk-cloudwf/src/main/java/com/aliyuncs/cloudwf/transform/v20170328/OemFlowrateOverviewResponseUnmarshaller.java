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

package com.aliyuncs.cloudwf.transform.v20170328;

import com.aliyuncs.cloudwf.model.v20170328.OemFlowrateOverviewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OemFlowrateOverviewResponseUnmarshaller {

	public static OemFlowrateOverviewResponse unmarshall(OemFlowrateOverviewResponse oemFlowrateOverviewResponse, UnmarshallerContext context) {
		
		oemFlowrateOverviewResponse.setRequestId(context.stringValue("OemFlowrateOverviewResponse.RequestId"));
		oemFlowrateOverviewResponse.setSuccess(context.booleanValue("OemFlowrateOverviewResponse.Success"));
		oemFlowrateOverviewResponse.setData(context.stringValue("OemFlowrateOverviewResponse.Data"));
		oemFlowrateOverviewResponse.setMessage(context.stringValue("OemFlowrateOverviewResponse.Message"));
		oemFlowrateOverviewResponse.setErrorCode(context.integerValue("OemFlowrateOverviewResponse.ErrorCode"));
		oemFlowrateOverviewResponse.setErrorMsg(context.stringValue("OemFlowrateOverviewResponse.ErrorMsg"));
	 
	 	return oemFlowrateOverviewResponse;
	}
}