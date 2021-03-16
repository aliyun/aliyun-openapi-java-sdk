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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsSgSwitchDbModeResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsSgSwitchDbModeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsSgSwitchDbModeResponseUnmarshaller {

	public static OpsSgSwitchDbModeResponse unmarshall(OpsSgSwitchDbModeResponse opsSgSwitchDbModeResponse, UnmarshallerContext _ctx) {
		
		opsSgSwitchDbModeResponse.setRequestId(_ctx.stringValue("OpsSgSwitchDbModeResponse.RequestId"));
		opsSgSwitchDbModeResponse.setCode(_ctx.stringValue("OpsSgSwitchDbModeResponse.Code"));
		opsSgSwitchDbModeResponse.setMessage(_ctx.stringValue("OpsSgSwitchDbModeResponse.Message"));
		opsSgSwitchDbModeResponse.setSuccess(_ctx.booleanValue("OpsSgSwitchDbModeResponse.Success"));

		Data data = new Data();
		data.setResultInfoStr(_ctx.stringValue("OpsSgSwitchDbModeResponse.Data.ResultInfoStr"));
		opsSgSwitchDbModeResponse.setData(data);
	 
	 	return opsSgSwitchDbModeResponse;
	}
}