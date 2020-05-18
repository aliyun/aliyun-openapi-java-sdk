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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveAudioAuditConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveAudioAuditConfigResponse.LiveAudioAuditConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveAudioAuditConfigResponseUnmarshaller {

	public static DescribeLiveAudioAuditConfigResponse unmarshall(DescribeLiveAudioAuditConfigResponse describeLiveAudioAuditConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveAudioAuditConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveAudioAuditConfigResponse.RequestId"));

		List<LiveAudioAuditConfig> liveAudioAuditConfigList = new ArrayList<LiveAudioAuditConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveAudioAuditConfigResponse.LiveAudioAuditConfigList.Length"); i++) {
			LiveAudioAuditConfig liveAudioAuditConfig = new LiveAudioAuditConfig();
			liveAudioAuditConfig.setDomainName(_ctx.stringValue("DescribeLiveAudioAuditConfigResponse.LiveAudioAuditConfigList["+ i +"].DomainName"));
			liveAudioAuditConfig.setAppName(_ctx.stringValue("DescribeLiveAudioAuditConfigResponse.LiveAudioAuditConfigList["+ i +"].AppName"));
			liveAudioAuditConfig.setStreamName(_ctx.stringValue("DescribeLiveAudioAuditConfigResponse.LiveAudioAuditConfigList["+ i +"].StreamName"));
			liveAudioAuditConfig.setBizType(_ctx.stringValue("DescribeLiveAudioAuditConfigResponse.LiveAudioAuditConfigList["+ i +"].BizType"));

			List<String> scenes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveAudioAuditConfigResponse.LiveAudioAuditConfigList["+ i +"].Scenes.Length"); j++) {
				scenes.add(_ctx.stringValue("DescribeLiveAudioAuditConfigResponse.LiveAudioAuditConfigList["+ i +"].Scenes["+ j +"]"));
			}
			liveAudioAuditConfig.setScenes(scenes);

			liveAudioAuditConfigList.add(liveAudioAuditConfig);
		}
		describeLiveAudioAuditConfigResponse.setLiveAudioAuditConfigList(liveAudioAuditConfigList);
	 
	 	return describeLiveAudioAuditConfigResponse;
	}
}