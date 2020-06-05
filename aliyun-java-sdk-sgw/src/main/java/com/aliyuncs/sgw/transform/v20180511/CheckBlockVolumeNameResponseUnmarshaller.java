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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.CheckBlockVolumeNameResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckBlockVolumeNameResponseUnmarshaller {

	public static CheckBlockVolumeNameResponse unmarshall(CheckBlockVolumeNameResponse checkBlockVolumeNameResponse, UnmarshallerContext _ctx) {
		
		checkBlockVolumeNameResponse.setRequestId(_ctx.stringValue("CheckBlockVolumeNameResponse.RequestId"));
		checkBlockVolumeNameResponse.setSuccess(_ctx.booleanValue("CheckBlockVolumeNameResponse.Success"));
		checkBlockVolumeNameResponse.setCode(_ctx.stringValue("CheckBlockVolumeNameResponse.Code"));
		checkBlockVolumeNameResponse.setMessage(_ctx.stringValue("CheckBlockVolumeNameResponse.Message"));
		checkBlockVolumeNameResponse.setIsRequireRecovery(_ctx.stringValue("CheckBlockVolumeNameResponse.IsRequireRecovery"));
	 
	 	return checkBlockVolumeNameResponse;
	}
}