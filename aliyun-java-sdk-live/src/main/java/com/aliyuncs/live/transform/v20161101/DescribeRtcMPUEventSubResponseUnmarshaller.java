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

import com.aliyuncs.live.model.v20161101.DescribeRtcMPUEventSubResponse;
import com.aliyuncs.live.model.v20161101.DescribeRtcMPUEventSubResponse.SubInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRtcMPUEventSubResponseUnmarshaller {

	public static DescribeRtcMPUEventSubResponse unmarshall(DescribeRtcMPUEventSubResponse describeRtcMPUEventSubResponse, UnmarshallerContext _ctx) {
		
		describeRtcMPUEventSubResponse.setRequestId(_ctx.stringValue("DescribeRtcMPUEventSubResponse.RequestId"));

		SubInfo subInfo = new SubInfo();
		subInfo.setSubId(_ctx.stringValue("DescribeRtcMPUEventSubResponse.SubInfo.SubId"));
		subInfo.setAppId(_ctx.stringValue("DescribeRtcMPUEventSubResponse.SubInfo.AppId"));
		subInfo.setChannelIds(_ctx.stringValue("DescribeRtcMPUEventSubResponse.SubInfo.ChannelIds"));
		subInfo.setCreateTime(_ctx.stringValue("DescribeRtcMPUEventSubResponse.SubInfo.CreateTime"));
		subInfo.setCallbackUrl(_ctx.stringValue("DescribeRtcMPUEventSubResponse.SubInfo.CallbackUrl"));
		describeRtcMPUEventSubResponse.setSubInfo(subInfo);
	 
	 	return describeRtcMPUEventSubResponse;
	}
}