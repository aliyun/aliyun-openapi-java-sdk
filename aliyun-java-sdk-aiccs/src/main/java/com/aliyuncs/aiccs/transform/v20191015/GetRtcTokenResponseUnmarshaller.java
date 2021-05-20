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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetRtcTokenResponse;
import com.aliyuncs.aiccs.model.v20191015.GetRtcTokenResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRtcTokenResponseUnmarshaller {

	public static GetRtcTokenResponse unmarshall(GetRtcTokenResponse getRtcTokenResponse, UnmarshallerContext _ctx) {
		
		getRtcTokenResponse.setRequestId(_ctx.stringValue("GetRtcTokenResponse.RequestId"));
		getRtcTokenResponse.setMessage(_ctx.stringValue("GetRtcTokenResponse.Message"));
		getRtcTokenResponse.setCode(_ctx.stringValue("GetRtcTokenResponse.Code"));
		getRtcTokenResponse.setSuccess(_ctx.booleanValue("GetRtcTokenResponse.Success"));

		Data data = new Data();
		data.setRtcId(_ctx.stringValue("GetRtcTokenResponse.Data.RtcId"));
		data.setToken(_ctx.stringValue("GetRtcTokenResponse.Data.Token"));
		data.setAccountName(_ctx.stringValue("GetRtcTokenResponse.Data.AccountName"));
		getRtcTokenResponse.setData(data);
	 
	 	return getRtcTokenResponse;
	}
}