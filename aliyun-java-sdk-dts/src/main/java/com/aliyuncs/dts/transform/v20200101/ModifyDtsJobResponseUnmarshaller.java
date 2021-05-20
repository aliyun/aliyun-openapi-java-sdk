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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.ModifyDtsJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyDtsJobResponseUnmarshaller {

	public static ModifyDtsJobResponse unmarshall(ModifyDtsJobResponse modifyDtsJobResponse, UnmarshallerContext _ctx) {
		
		modifyDtsJobResponse.setRequestId(_ctx.stringValue("ModifyDtsJobResponse.RequestId"));
		modifyDtsJobResponse.setDtsJobId(_ctx.stringValue("ModifyDtsJobResponse.DtsJobId"));
		modifyDtsJobResponse.setErrCode(_ctx.stringValue("ModifyDtsJobResponse.ErrCode"));
		modifyDtsJobResponse.setErrMessage(_ctx.booleanValue("ModifyDtsJobResponse.ErrMessage"));
		modifyDtsJobResponse.setStatus(_ctx.stringValue("ModifyDtsJobResponse.Status"));
		modifyDtsJobResponse.setSuccess(_ctx.booleanValue("ModifyDtsJobResponse.Success"));
	 
	 	return modifyDtsJobResponse;
	}
}