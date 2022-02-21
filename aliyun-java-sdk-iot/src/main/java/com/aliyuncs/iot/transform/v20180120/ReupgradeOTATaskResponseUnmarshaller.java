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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.ReupgradeOTATaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReupgradeOTATaskResponseUnmarshaller {

	public static ReupgradeOTATaskResponse unmarshall(ReupgradeOTATaskResponse reupgradeOTATaskResponse, UnmarshallerContext _ctx) {
		
		reupgradeOTATaskResponse.setRequestId(_ctx.stringValue("ReupgradeOTATaskResponse.RequestId"));
		reupgradeOTATaskResponse.setSuccess(_ctx.booleanValue("ReupgradeOTATaskResponse.Success"));
		reupgradeOTATaskResponse.setCode(_ctx.stringValue("ReupgradeOTATaskResponse.Code"));
		reupgradeOTATaskResponse.setErrorMessage(_ctx.stringValue("ReupgradeOTATaskResponse.ErrorMessage"));
	 
	 	return reupgradeOTATaskResponse;
	}
}