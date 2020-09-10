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

import com.aliyuncs.scsp.model.v20200702.GetHotlineWaitingNumberResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHotlineWaitingNumberResponseUnmarshaller {

	public static GetHotlineWaitingNumberResponse unmarshall(GetHotlineWaitingNumberResponse getHotlineWaitingNumberResponse, UnmarshallerContext _ctx) {
		
		getHotlineWaitingNumberResponse.setRequestId(_ctx.stringValue("GetHotlineWaitingNumberResponse.RequestId"));
		getHotlineWaitingNumberResponse.setSuccess(_ctx.booleanValue("GetHotlineWaitingNumberResponse.Success"));
		getHotlineWaitingNumberResponse.setCode(_ctx.stringValue("GetHotlineWaitingNumberResponse.Code"));
		getHotlineWaitingNumberResponse.setMessage(_ctx.stringValue("GetHotlineWaitingNumberResponse.Message"));
		getHotlineWaitingNumberResponse.setData(_ctx.longValue("GetHotlineWaitingNumberResponse.Data"));
	 
	 	return getHotlineWaitingNumberResponse;
	}
}