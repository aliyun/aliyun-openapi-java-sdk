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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.UpdateRingStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateRingStatusResponseUnmarshaller {

	public static UpdateRingStatusResponse unmarshall(UpdateRingStatusResponse updateRingStatusResponse, UnmarshallerContext _ctx) {
		
		updateRingStatusResponse.setRequestId(_ctx.stringValue("UpdateRingStatusResponse.RequestId"));
		updateRingStatusResponse.setMessage(_ctx.stringValue("UpdateRingStatusResponse.Message"));
		updateRingStatusResponse.setData(_ctx.stringValue("UpdateRingStatusResponse.Data"));
		updateRingStatusResponse.setCode(_ctx.stringValue("UpdateRingStatusResponse.Code"));
		updateRingStatusResponse.setSuccess(_ctx.booleanValue("UpdateRingStatusResponse.Success"));
		updateRingStatusResponse.setHttpStatusCode(_ctx.longValue("UpdateRingStatusResponse.HttpStatusCode"));
	 
	 	return updateRingStatusResponse;
	}
}