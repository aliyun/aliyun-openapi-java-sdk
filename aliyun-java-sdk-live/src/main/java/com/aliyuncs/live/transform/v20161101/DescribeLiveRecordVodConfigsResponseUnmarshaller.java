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

import com.aliyuncs.live.model.v20161101.DescribeLiveRecordVodConfigsResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveRecordVodConfigsResponseUnmarshaller {

	public static DescribeLiveRecordVodConfigsResponse unmarshall(DescribeLiveRecordVodConfigsResponse describeLiveRecordVodConfigsResponse, UnmarshallerContext _ctx) {
		
		describeLiveRecordVodConfigsResponse.setRequestId(_ctx.stringValue("DescribeLiveRecordVodConfigsResponse.RequestId"));
		describeLiveRecordVodConfigsResponse.setPageNum(_ctx.integerValue("DescribeLiveRecordVodConfigsResponse.PageNum"));
		describeLiveRecordVodConfigsResponse.setPageSize(_ctx.integerValue("DescribeLiveRecordVodConfigsResponse.PageSize"));
		describeLiveRecordVodConfigsResponse.setTotal(_ctx.stringValue("DescribeLiveRecordVodConfigsResponse.Total"));

		List<LiveRecordVodConfig> liveRecordVodConfigs = new ArrayList<LiveRecordVodConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs.Length"); i++) {
			LiveRecordVodConfig liveRecordVodConfig = new LiveRecordVodConfig();
			liveRecordVodConfig.setCreateTime(_ctx.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].CreateTime"));
			liveRecordVodConfig.setDomainName(_ctx.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].DomainName"));
			liveRecordVodConfig.setAppName(_ctx.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].AppName"));
			liveRecordVodConfig.setStreamName(_ctx.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].StreamName"));
			liveRecordVodConfig.setVodTranscodeGroupId(_ctx.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].VodTranscodeGroupId"));
			liveRecordVodConfig.setCycleDuration(_ctx.integerValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].CycleDuration"));
			liveRecordVodConfig.setAutoCompose(_ctx.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].AutoCompose"));
			liveRecordVodConfig.setComposeVodTranscodeGroupId(_ctx.stringValue("DescribeLiveRecordVodConfigsResponse.LiveRecordVodConfigs["+ i +"].ComposeVodTranscodeGroupId"));

			liveRecordVodConfigs.add(liveRecordVodConfig);
		}
		describeLiveRecordVodConfigsResponse.setLiveRecordVodConfigs(liveRecordVodConfigs);
	 
	 	return describeLiveRecordVodConfigsResponse;
	}
}