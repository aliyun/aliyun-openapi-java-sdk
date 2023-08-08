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

import com.aliyuncs.live.model.v20161101.SetLiveStreamBlockResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetLiveStreamBlockResponseUnmarshaller {

	public static SetLiveStreamBlockResponse unmarshall(SetLiveStreamBlockResponse setLiveStreamBlockResponse, UnmarshallerContext _ctx) {
		
		setLiveStreamBlockResponse.setRequestId(_ctx.stringValue("SetLiveStreamBlockResponse.RequestId"));
		setLiveStreamBlockResponse.setStatus(_ctx.stringValue("SetLiveStreamBlockResponse.Status"));
		setLiveStreamBlockResponse.setDescription(_ctx.stringValue("SetLiveStreamBlockResponse.Description"));
	 
	 	return setLiveStreamBlockResponse;
	}
}