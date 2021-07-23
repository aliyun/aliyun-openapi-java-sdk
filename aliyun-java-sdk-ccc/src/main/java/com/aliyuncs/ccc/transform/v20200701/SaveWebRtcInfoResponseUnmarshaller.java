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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.SaveWebRtcInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveWebRtcInfoResponseUnmarshaller {

	public static SaveWebRtcInfoResponse unmarshall(SaveWebRtcInfoResponse saveWebRtcInfoResponse, UnmarshallerContext _ctx) {
		
		saveWebRtcInfoResponse.setRequestId(_ctx.stringValue("SaveWebRtcInfoResponse.RequestId"));
		saveWebRtcInfoResponse.setCode(_ctx.stringValue("SaveWebRtcInfoResponse.Code"));
		saveWebRtcInfoResponse.setHttpStatusCode(_ctx.longValue("SaveWebRtcInfoResponse.HttpStatusCode"));
		saveWebRtcInfoResponse.setMessage(_ctx.stringValue("SaveWebRtcInfoResponse.Message"));
		saveWebRtcInfoResponse.setRowCount(_ctx.longValue("SaveWebRtcInfoResponse.RowCount"));
		saveWebRtcInfoResponse.setSuccess(_ctx.booleanValue("SaveWebRtcInfoResponse.Success"));
		saveWebRtcInfoResponse.setTimeStamp(_ctx.longValue("SaveWebRtcInfoResponse.TimeStamp"));
	 
	 	return saveWebRtcInfoResponse;
	}
}