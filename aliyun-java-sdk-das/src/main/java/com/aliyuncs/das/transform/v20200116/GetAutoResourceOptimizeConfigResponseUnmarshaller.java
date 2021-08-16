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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.GetAutoResourceOptimizeConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAutoResourceOptimizeConfigResponseUnmarshaller {

	public static GetAutoResourceOptimizeConfigResponse unmarshall(GetAutoResourceOptimizeConfigResponse getAutoResourceOptimizeConfigResponse, UnmarshallerContext _ctx) {
		
		getAutoResourceOptimizeConfigResponse.setRequestId(_ctx.stringValue("GetAutoResourceOptimizeConfigResponse.RequestId"));
		getAutoResourceOptimizeConfigResponse.setMessage(_ctx.stringValue("GetAutoResourceOptimizeConfigResponse.Message"));
		getAutoResourceOptimizeConfigResponse.setSynchro(_ctx.stringValue("GetAutoResourceOptimizeConfigResponse.Synchro"));
		getAutoResourceOptimizeConfigResponse.setData(_ctx.stringValue("GetAutoResourceOptimizeConfigResponse.Data"));
		getAutoResourceOptimizeConfigResponse.setCode(_ctx.stringValue("GetAutoResourceOptimizeConfigResponse.Code"));
		getAutoResourceOptimizeConfigResponse.setSuccess(_ctx.stringValue("GetAutoResourceOptimizeConfigResponse.Success"));
	 
	 	return getAutoResourceOptimizeConfigResponse;
	}
}