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

import com.aliyuncs.live.model.v20161101.DescribeLivePackageConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLivePackageConfigResponse.LivePackageConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLivePackageConfigResponseUnmarshaller {

	public static DescribeLivePackageConfigResponse unmarshall(DescribeLivePackageConfigResponse describeLivePackageConfigResponse, UnmarshallerContext _ctx) {
		
		describeLivePackageConfigResponse.setRequestId(_ctx.stringValue("DescribeLivePackageConfigResponse.RequestId"));
		describeLivePackageConfigResponse.setPageNum(_ctx.integerValue("DescribeLivePackageConfigResponse.PageNum"));
		describeLivePackageConfigResponse.setOrder(_ctx.stringValue("DescribeLivePackageConfigResponse.Order"));
		describeLivePackageConfigResponse.setTotalPage(_ctx.integerValue("DescribeLivePackageConfigResponse.TotalPage"));
		describeLivePackageConfigResponse.setPageSize(_ctx.integerValue("DescribeLivePackageConfigResponse.PageSize"));
		describeLivePackageConfigResponse.setTotalNum(_ctx.integerValue("DescribeLivePackageConfigResponse.TotalNum"));

		List<LivePackageConfig> livePackageConfigList = new ArrayList<LivePackageConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLivePackageConfigResponse.LivePackageConfigList.Length"); i++) {
			LivePackageConfig livePackageConfig = new LivePackageConfig();
			livePackageConfig.setAppName(_ctx.stringValue("DescribeLivePackageConfigResponse.LivePackageConfigList["+ i +"].AppName"));
			livePackageConfig.setSegmentNum(_ctx.integerValue("DescribeLivePackageConfigResponse.LivePackageConfigList["+ i +"].SegmentNum"));
			livePackageConfig.setStreamName(_ctx.stringValue("DescribeLivePackageConfigResponse.LivePackageConfigList["+ i +"].StreamName"));
			livePackageConfig.setBizProtocol(_ctx.stringValue("DescribeLivePackageConfigResponse.LivePackageConfigList["+ i +"].Protocol"));
			livePackageConfig.setIgnoreTranscode(_ctx.booleanValue("DescribeLivePackageConfigResponse.LivePackageConfigList["+ i +"].IgnoreTranscode"));
			livePackageConfig.setPartDuration(_ctx.integerValue("DescribeLivePackageConfigResponse.LivePackageConfigList["+ i +"].PartDuration"));
			livePackageConfig.setSegmentDuration(_ctx.integerValue("DescribeLivePackageConfigResponse.LivePackageConfigList["+ i +"].SegmentDuration"));
			livePackageConfig.setDomainName(_ctx.stringValue("DescribeLivePackageConfigResponse.LivePackageConfigList["+ i +"].DomainName"));

			livePackageConfigList.add(livePackageConfig);
		}
		describeLivePackageConfigResponse.setLivePackageConfigList(livePackageConfigList);
	 
	 	return describeLivePackageConfigResponse;
	}
}