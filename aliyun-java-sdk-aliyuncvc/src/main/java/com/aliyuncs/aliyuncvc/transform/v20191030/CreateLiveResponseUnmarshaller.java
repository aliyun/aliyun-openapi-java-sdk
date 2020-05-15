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

package com.aliyuncs.aliyuncvc.transform.v20191030;

import com.aliyuncs.aliyuncvc.model.v20191030.CreateLiveResponse;
import com.aliyuncs.aliyuncvc.model.v20191030.CreateLiveResponse.LiveInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLiveResponseUnmarshaller {

	public static CreateLiveResponse unmarshall(CreateLiveResponse createLiveResponse, UnmarshallerContext _ctx) {
		
		createLiveResponse.setRequestId(_ctx.stringValue("CreateLiveResponse.RequestId"));
		createLiveResponse.setErrorCode(_ctx.integerValue("CreateLiveResponse.ErrorCode"));
		createLiveResponse.setMessage(_ctx.stringValue("CreateLiveResponse.Message"));
		createLiveResponse.setSuccess(_ctx.booleanValue("CreateLiveResponse.Success"));

		LiveInfo liveInfo = new LiveInfo();
		liveInfo.setLiveUUID(_ctx.stringValue("CreateLiveResponse.LiveInfo.LiveUUID"));
		liveInfo.setStreamUUID(_ctx.stringValue("CreateLiveResponse.LiveInfo.StreamUUID"));
		createLiveResponse.setLiveInfo(liveInfo);
	 
	 	return createLiveResponse;
	}
}