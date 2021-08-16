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

import com.aliyuncs.das.model.v20200116.UpdateAutoResourceOptimizeConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAutoResourceOptimizeConfigResponseUnmarshaller {

	public static UpdateAutoResourceOptimizeConfigResponse unmarshall(UpdateAutoResourceOptimizeConfigResponse updateAutoResourceOptimizeConfigResponse, UnmarshallerContext _ctx) {
		
		updateAutoResourceOptimizeConfigResponse.setRequestId(_ctx.stringValue("UpdateAutoResourceOptimizeConfigResponse.RequestId"));
		updateAutoResourceOptimizeConfigResponse.setMessage(_ctx.stringValue("UpdateAutoResourceOptimizeConfigResponse.Message"));
		updateAutoResourceOptimizeConfigResponse.setSynchro(_ctx.stringValue("UpdateAutoResourceOptimizeConfigResponse.Synchro"));
		updateAutoResourceOptimizeConfigResponse.setData(_ctx.stringValue("UpdateAutoResourceOptimizeConfigResponse.Data"));
		updateAutoResourceOptimizeConfigResponse.setCode(_ctx.stringValue("UpdateAutoResourceOptimizeConfigResponse.Code"));
		updateAutoResourceOptimizeConfigResponse.setSuccess(_ctx.stringValue("UpdateAutoResourceOptimizeConfigResponse.Success"));
	 
	 	return updateAutoResourceOptimizeConfigResponse;
	}
}