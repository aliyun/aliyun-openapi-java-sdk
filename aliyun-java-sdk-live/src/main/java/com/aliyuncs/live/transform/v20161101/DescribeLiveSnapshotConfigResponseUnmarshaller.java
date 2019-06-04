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

import com.aliyuncs.live.model.v20161101.DescribeLiveSnapshotConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveSnapshotConfigResponseUnmarshaller {

	public static DescribeLiveSnapshotConfigResponse unmarshall(DescribeLiveSnapshotConfigResponse describeLiveSnapshotConfigResponse, UnmarshallerContext context) {
		
		describeLiveSnapshotConfigResponse.setRequestId(context.stringValue("DescribeLiveSnapshotConfigResponse.RequestId"));
		describeLiveSnapshotConfigResponse.setPageNum(context.integerValue("DescribeLiveSnapshotConfigResponse.PageNum"));
		describeLiveSnapshotConfigResponse.setPageSize(context.integerValue("DescribeLiveSnapshotConfigResponse.PageSize"));
		describeLiveSnapshotConfigResponse.setOrder(context.stringValue("DescribeLiveSnapshotConfigResponse.Order"));
		describeLiveSnapshotConfigResponse.setTotalNum(context.integerValue("DescribeLiveSnapshotConfigResponse.TotalNum"));
		describeLiveSnapshotConfigResponse.setTotalPage(context.integerValue("DescribeLiveSnapshotConfigResponse.TotalPage"));

		List<LiveStreamSnapshotConfig> liveStreamSnapshotConfigList = new ArrayList<LiveStreamSnapshotConfig>();
		for (int i = 0; i < context.lengthValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList.Length"); i++) {
			LiveStreamSnapshotConfig liveStreamSnapshotConfig = new LiveStreamSnapshotConfig();
			liveStreamSnapshotConfig.setDomainName(context.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].DomainName"));
			liveStreamSnapshotConfig.setAppName(context.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].AppName"));
			liveStreamSnapshotConfig.setTimeInterval(context.integerValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].TimeInterval"));
			liveStreamSnapshotConfig.setOssEndpoint(context.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].OssEndpoint"));
			liveStreamSnapshotConfig.setOssBucket(context.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].OssBucket"));
			liveStreamSnapshotConfig.setOverwriteOssObject(context.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].OverwriteOssObject"));
			liveStreamSnapshotConfig.setSequenceOssObject(context.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].SequenceOssObject"));
			liveStreamSnapshotConfig.setCreateTime(context.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].CreateTime"));

			liveStreamSnapshotConfigList.add(liveStreamSnapshotConfig);
		}
		describeLiveSnapshotConfigResponse.setLiveStreamSnapshotConfigList(liveStreamSnapshotConfigList);
	 
	 	return describeLiveSnapshotConfigResponse;
	}
}