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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamOptimizedFeatureConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamOptimizedFeatureConfigResponse.LiveStreamOptimizedFeatureConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamOptimizedFeatureConfigResponseUnmarshaller {

	public static DescribeLiveStreamOptimizedFeatureConfigResponse unmarshall(DescribeLiveStreamOptimizedFeatureConfigResponse describeLiveStreamOptimizedFeatureConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamOptimizedFeatureConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamOptimizedFeatureConfigResponse.RequestId"));

		List<LiveStreamOptimizedFeatureConfig> liveStreamOptimizedFeatureConfigList = new ArrayList<LiveStreamOptimizedFeatureConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamOptimizedFeatureConfigResponse.LiveStreamOptimizedFeatureConfigList.Length"); i++) {
			LiveStreamOptimizedFeatureConfig liveStreamOptimizedFeatureConfig = new LiveStreamOptimizedFeatureConfig();
			liveStreamOptimizedFeatureConfig.setDomainName(_ctx.stringValue("DescribeLiveStreamOptimizedFeatureConfigResponse.LiveStreamOptimizedFeatureConfigList["+ i +"].DomainName"));
			liveStreamOptimizedFeatureConfig.setConfigName(_ctx.stringValue("DescribeLiveStreamOptimizedFeatureConfigResponse.LiveStreamOptimizedFeatureConfigList["+ i +"].ConfigName"));
			liveStreamOptimizedFeatureConfig.setConfigStatus(_ctx.stringValue("DescribeLiveStreamOptimizedFeatureConfigResponse.LiveStreamOptimizedFeatureConfigList["+ i +"].ConfigStatus"));
			liveStreamOptimizedFeatureConfig.setConfigValue(_ctx.stringValue("DescribeLiveStreamOptimizedFeatureConfigResponse.LiveStreamOptimizedFeatureConfigList["+ i +"].ConfigValue"));

			liveStreamOptimizedFeatureConfigList.add(liveStreamOptimizedFeatureConfig);
		}
		describeLiveStreamOptimizedFeatureConfigResponse.setLiveStreamOptimizedFeatureConfigList(liveStreamOptimizedFeatureConfigList);
	 
	 	return describeLiveStreamOptimizedFeatureConfigResponse;
	}
}