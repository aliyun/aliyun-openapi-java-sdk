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

package com.aliyuncs.live.transform.v20161101;

import com.aliyuncs.live.model.v20161101.MiguLivePullToPushStatusResponse;
import com.aliyuncs.live.model.v20161101.MiguLivePullToPushStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class MiguLivePullToPushStatusResponseUnmarshaller {

	public static MiguLivePullToPushStatusResponse unmarshall(MiguLivePullToPushStatusResponse miguLivePullToPushStatusResponse, UnmarshallerContext _ctx) {
		
		miguLivePullToPushStatusResponse.setCode(_ctx.stringValue("MiguLivePullToPushStatusResponse.code"));
		miguLivePullToPushStatusResponse.setMessage(_ctx.stringValue("MiguLivePullToPushStatusResponse.message"));
		miguLivePullToPushStatusResponse.setRequestId(_ctx.stringValue("MiguLivePullToPushStatusResponse.requestId"));
		miguLivePullToPushStatusResponse.setTimestamp(_ctx.stringValue("MiguLivePullToPushStatusResponse.timestamp"));

		Data data = new Data();
		data.setMessage(_ctx.stringValue("MiguLivePullToPushStatusResponse.data.message"));
		data.setStatus(_ctx.stringValue("MiguLivePullToPushStatusResponse.data.status"));
		miguLivePullToPushStatusResponse.setData(data);
	 
	 	return miguLivePullToPushStatusResponse;
	}
}