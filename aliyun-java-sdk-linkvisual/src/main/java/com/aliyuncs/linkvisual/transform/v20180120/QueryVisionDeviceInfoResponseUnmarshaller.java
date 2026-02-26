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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.QueryVisionDeviceInfoResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryVisionDeviceInfoResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryVisionDeviceInfoResponse.Data.GbDeviceInfo;
import com.aliyuncs.linkvisual.model.v20180120.QueryVisionDeviceInfoResponse.Data.RtmpDeviceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryVisionDeviceInfoResponseUnmarshaller {

	public static QueryVisionDeviceInfoResponse unmarshall(QueryVisionDeviceInfoResponse queryVisionDeviceInfoResponse, UnmarshallerContext _ctx) {
		
		queryVisionDeviceInfoResponse.setRequestId(_ctx.stringValue("QueryVisionDeviceInfoResponse.RequestId"));
		queryVisionDeviceInfoResponse.setCode(_ctx.stringValue("QueryVisionDeviceInfoResponse.Code"));
		queryVisionDeviceInfoResponse.setErrorMessage(_ctx.stringValue("QueryVisionDeviceInfoResponse.ErrorMessage"));
		queryVisionDeviceInfoResponse.setSuccess(_ctx.booleanValue("QueryVisionDeviceInfoResponse.Success"));

		Data data = new Data();
		data.setDescription(_ctx.stringValue("QueryVisionDeviceInfoResponse.Data.Description"));
		data.setDeviceType(_ctx.integerValue("QueryVisionDeviceInfoResponse.Data.DeviceType"));

		GbDeviceInfo gbDeviceInfo = new GbDeviceInfo();
		gbDeviceInfo.setGbId(_ctx.stringValue("QueryVisionDeviceInfoResponse.Data.GbDeviceInfo.GbId"));
		gbDeviceInfo.setPassword(_ctx.stringValue("QueryVisionDeviceInfoResponse.Data.GbDeviceInfo.Password"));
		gbDeviceInfo.setNickName(_ctx.stringValue("QueryVisionDeviceInfoResponse.Data.GbDeviceInfo.NickName"));
		gbDeviceInfo.setSubProductKey(_ctx.stringValue("QueryVisionDeviceInfoResponse.Data.GbDeviceInfo.SubProductKey"));
		gbDeviceInfo.setDeviceProtocol(_ctx.integerValue("QueryVisionDeviceInfoResponse.Data.GbDeviceInfo.DeviceProtocol"));
		gbDeviceInfo.setNetProtocol(_ctx.integerValue("QueryVisionDeviceInfoResponse.Data.GbDeviceInfo.NetProtocol"));
		data.setGbDeviceInfo(gbDeviceInfo);

		RtmpDeviceInfo rtmpDeviceInfo = new RtmpDeviceInfo();
		rtmpDeviceInfo.setStreamStatus(_ctx.integerValue("QueryVisionDeviceInfoResponse.Data.RtmpDeviceInfo.StreamStatus"));
		rtmpDeviceInfo.setPushKeyExpireTime(_ctx.integerValue("QueryVisionDeviceInfoResponse.Data.RtmpDeviceInfo.PushKeyExpireTime"));
		rtmpDeviceInfo.setStreamName(_ctx.stringValue("QueryVisionDeviceInfoResponse.Data.RtmpDeviceInfo.StreamName"));
		rtmpDeviceInfo.setPushAuthKey(_ctx.stringValue("QueryVisionDeviceInfoResponse.Data.RtmpDeviceInfo.PushAuthKey"));
		rtmpDeviceInfo.setPullAuthKey(_ctx.stringValue("QueryVisionDeviceInfoResponse.Data.RtmpDeviceInfo.PullAuthKey"));
		rtmpDeviceInfo.setPullKeyExpireTime(_ctx.integerValue("QueryVisionDeviceInfoResponse.Data.RtmpDeviceInfo.PullKeyExpireTime"));
		rtmpDeviceInfo.setPushUrlSample(_ctx.stringValue("QueryVisionDeviceInfoResponse.Data.RtmpDeviceInfo.PushUrlSample"));
		data.setRtmpDeviceInfo(rtmpDeviceInfo);
		queryVisionDeviceInfoResponse.setData(data);
	 
	 	return queryVisionDeviceInfoResponse;
	}
}