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

	public static DescribeLiveSnapshotConfigResponse unmarshall(DescribeLiveSnapshotConfigResponse describeLiveSnapshotConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveSnapshotConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveSnapshotConfigResponse.RequestId"));
		describeLiveSnapshotConfigResponse.setPageNum(_ctx.integerValue("DescribeLiveSnapshotConfigResponse.PageNum"));
		describeLiveSnapshotConfigResponse.setOrder(_ctx.stringValue("DescribeLiveSnapshotConfigResponse.Order"));
		describeLiveSnapshotConfigResponse.setTotalPage(_ctx.integerValue("DescribeLiveSnapshotConfigResponse.TotalPage"));
		describeLiveSnapshotConfigResponse.setPageSize(_ctx.integerValue("DescribeLiveSnapshotConfigResponse.PageSize"));
		describeLiveSnapshotConfigResponse.setTotalNum(_ctx.integerValue("DescribeLiveSnapshotConfigResponse.TotalNum"));

		List<LiveStreamSnapshotConfig> liveStreamSnapshotConfigList = new ArrayList<LiveStreamSnapshotConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList.Length"); i++) {
			LiveStreamSnapshotConfig liveStreamSnapshotConfig = new LiveStreamSnapshotConfig();
			liveStreamSnapshotConfig.setOverwriteOssObject(_ctx.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].OverwriteOssObject"));
			liveStreamSnapshotConfig.setTimeInterval(_ctx.integerValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].TimeInterval"));
			liveStreamSnapshotConfig.setAppName(_ctx.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].AppName"));
			liveStreamSnapshotConfig.setCreateTime(_ctx.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].CreateTime"));
			liveStreamSnapshotConfig.setOssBucket(_ctx.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].OssBucket"));
			liveStreamSnapshotConfig.setDomainName(_ctx.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].DomainName"));
			liveStreamSnapshotConfig.setCallback(_ctx.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].Callback"));
			liveStreamSnapshotConfig.setSequenceOssObject(_ctx.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].SequenceOssObject"));
			liveStreamSnapshotConfig.setOssEndpoint(_ctx.stringValue("DescribeLiveSnapshotConfigResponse.LiveStreamSnapshotConfigList["+ i +"].OssEndpoint"));

			liveStreamSnapshotConfigList.add(liveStreamSnapshotConfig);
		}
		describeLiveSnapshotConfigResponse.setLiveStreamSnapshotConfigList(liveStreamSnapshotConfigList);
	 
	 	return describeLiveSnapshotConfigResponse;
	}
}