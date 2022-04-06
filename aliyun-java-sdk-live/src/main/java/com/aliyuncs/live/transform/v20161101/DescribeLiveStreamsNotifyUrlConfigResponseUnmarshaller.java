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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsNotifyUrlConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsNotifyUrlConfigResponseUnmarshaller {

	public static DescribeLiveStreamsNotifyUrlConfigResponse unmarshall(DescribeLiveStreamsNotifyUrlConfigResponse describeLiveStreamsNotifyUrlConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamsNotifyUrlConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamsNotifyUrlConfigResponse.RequestId"));

		LiveStreamsNotifyConfig liveStreamsNotifyConfig = new LiveStreamsNotifyConfig();
		liveStreamsNotifyConfig.setNotifyReqAuth(_ctx.stringValue("DescribeLiveStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig.NotifyReqAuth"));
		liveStreamsNotifyConfig.setAuthType(_ctx.stringValue("DescribeLiveStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig.AuthType"));
		liveStreamsNotifyConfig.setNotifyUrl(_ctx.stringValue("DescribeLiveStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig.NotifyUrl"));
		liveStreamsNotifyConfig.setNotifyAuthKey(_ctx.stringValue("DescribeLiveStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig.NotifyAuthKey"));
		liveStreamsNotifyConfig.setAuthKey(_ctx.stringValue("DescribeLiveStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig.AuthKey"));
		liveStreamsNotifyConfig.setDomainName(_ctx.stringValue("DescribeLiveStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig.DomainName"));
		describeLiveStreamsNotifyUrlConfigResponse.setLiveStreamsNotifyConfig(liveStreamsNotifyConfig);
	 
	 	return describeLiveStreamsNotifyUrlConfigResponse;
	}
}