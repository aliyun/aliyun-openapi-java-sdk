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

package com.aliyuncs.vs.transform.v20181212;

import com.aliyuncs.vs.model.v20181212.DescribeVsStreamsNotifyUrlConfigResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsStreamsNotifyUrlConfigResponseUnmarshaller {

	public static DescribeVsStreamsNotifyUrlConfigResponse unmarshall(DescribeVsStreamsNotifyUrlConfigResponse describeVsStreamsNotifyUrlConfigResponse, UnmarshallerContext _ctx) {
		
		describeVsStreamsNotifyUrlConfigResponse.setRequestId(_ctx.stringValue("DescribeVsStreamsNotifyUrlConfigResponse.RequestId"));

		LiveStreamsNotifyConfig liveStreamsNotifyConfig = new LiveStreamsNotifyConfig();
		liveStreamsNotifyConfig.setDomainName(_ctx.stringValue("DescribeVsStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig.DomainName"));
		liveStreamsNotifyConfig.setNotifyUrl(_ctx.stringValue("DescribeVsStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig.NotifyUrl"));
		liveStreamsNotifyConfig.setAuthType(_ctx.stringValue("DescribeVsStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig.AuthType"));
		liveStreamsNotifyConfig.setAuthKey(_ctx.stringValue("DescribeVsStreamsNotifyUrlConfigResponse.LiveStreamsNotifyConfig.AuthKey"));
		describeVsStreamsNotifyUrlConfigResponse.setLiveStreamsNotifyConfig(liveStreamsNotifyConfig);
	 
	 	return describeVsStreamsNotifyUrlConfigResponse;
	}
}