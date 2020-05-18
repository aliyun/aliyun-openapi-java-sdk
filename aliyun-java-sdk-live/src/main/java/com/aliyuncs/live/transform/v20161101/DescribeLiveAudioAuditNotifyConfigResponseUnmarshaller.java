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

import com.aliyuncs.live.model.v20161101.DescribeLiveAudioAuditNotifyConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveAudioAuditNotifyConfigResponse.LiveAudioAuditNotifyConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveAudioAuditNotifyConfigResponseUnmarshaller {

	public static DescribeLiveAudioAuditNotifyConfigResponse unmarshall(DescribeLiveAudioAuditNotifyConfigResponse describeLiveAudioAuditNotifyConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveAudioAuditNotifyConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveAudioAuditNotifyConfigResponse.RequestId"));

		List<LiveAudioAuditNotifyConfig> liveAudioAuditNotifyConfigList = new ArrayList<LiveAudioAuditNotifyConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveAudioAuditNotifyConfigResponse.LiveAudioAuditNotifyConfigList.Length"); i++) {
			LiveAudioAuditNotifyConfig liveAudioAuditNotifyConfig = new LiveAudioAuditNotifyConfig();
			liveAudioAuditNotifyConfig.setDomainName(_ctx.stringValue("DescribeLiveAudioAuditNotifyConfigResponse.LiveAudioAuditNotifyConfigList["+ i +"].DomainName"));
			liveAudioAuditNotifyConfig.setCallback(_ctx.stringValue("DescribeLiveAudioAuditNotifyConfigResponse.LiveAudioAuditNotifyConfigList["+ i +"].Callback"));
			liveAudioAuditNotifyConfig.setCallbackTemplate(_ctx.stringValue("DescribeLiveAudioAuditNotifyConfigResponse.LiveAudioAuditNotifyConfigList["+ i +"].CallbackTemplate"));

			liveAudioAuditNotifyConfigList.add(liveAudioAuditNotifyConfig);
		}
		describeLiveAudioAuditNotifyConfigResponse.setLiveAudioAuditNotifyConfigList(liveAudioAuditNotifyConfigList);
	 
	 	return describeLiveAudioAuditNotifyConfigResponse;
	}
}