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

package com.aliyuncs.mpaas.transform.v20201028;

import com.aliyuncs.mpaas.model.v20201028.CancelMpsSchedulerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelMpsSchedulerResponseUnmarshaller {

	public static CancelMpsSchedulerResponse unmarshall(CancelMpsSchedulerResponse cancelMpsSchedulerResponse, UnmarshallerContext _ctx) {
		
		cancelMpsSchedulerResponse.setRequestId(_ctx.stringValue("CancelMpsSchedulerResponse.RequestId"));
		cancelMpsSchedulerResponse.setResultMessage(_ctx.stringValue("CancelMpsSchedulerResponse.ResultMessage"));
		cancelMpsSchedulerResponse.setResultCode(_ctx.stringValue("CancelMpsSchedulerResponse.ResultCode"));
		cancelMpsSchedulerResponse.setResultContent(_ctx.stringValue("CancelMpsSchedulerResponse.ResultContent"));
	 
	 	return cancelMpsSchedulerResponse;
	}
}