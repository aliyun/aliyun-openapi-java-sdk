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

import com.aliyuncs.live.model.v20161101.DescribeLiveSnapshotDetectPornConfigResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveSnapshotDetectPornConfigResponseUnmarshaller {

	public static DescribeLiveSnapshotDetectPornConfigResponse unmarshall(DescribeLiveSnapshotDetectPornConfigResponse describeLiveSnapshotDetectPornConfigResponse, UnmarshallerContext _ctx) {
		
		describeLiveSnapshotDetectPornConfigResponse.setRequestId(_ctx.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.RequestId"));
		describeLiveSnapshotDetectPornConfigResponse.setPageNum(_ctx.integerValue("DescribeLiveSnapshotDetectPornConfigResponse.PageNum"));
		describeLiveSnapshotDetectPornConfigResponse.setPageSize(_ctx.integerValue("DescribeLiveSnapshotDetectPornConfigResponse.PageSize"));
		describeLiveSnapshotDetectPornConfigResponse.setOrder(_ctx.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.Order"));
		describeLiveSnapshotDetectPornConfigResponse.setTotalNum(_ctx.integerValue("DescribeLiveSnapshotDetectPornConfigResponse.TotalNum"));
		describeLiveSnapshotDetectPornConfigResponse.setTotalPage(_ctx.integerValue("DescribeLiveSnapshotDetectPornConfigResponse.TotalPage"));

		List<LiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfigList = new ArrayList<LiveSnapshotDetectPornConfig>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList.Length"); i++) {
			LiveSnapshotDetectPornConfig liveSnapshotDetectPornConfig = new LiveSnapshotDetectPornConfig();
			liveSnapshotDetectPornConfig.setDomainName(_ctx.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].DomainName"));
			liveSnapshotDetectPornConfig.setAppName(_ctx.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].AppName"));
			liveSnapshotDetectPornConfig.setOssEndpoint(_ctx.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].OssEndpoint"));
			liveSnapshotDetectPornConfig.setOssBucket(_ctx.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].OssBucket"));
			liveSnapshotDetectPornConfig.setOssObject(_ctx.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].OssObject"));
			liveSnapshotDetectPornConfig.setInterval(_ctx.integerValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].Interval"));

			List<String> scenes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].Scenes.Length"); j++) {
				scenes.add(_ctx.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].Scenes["+ j +"]"));
			}
			liveSnapshotDetectPornConfig.setScenes(scenes);

			liveSnapshotDetectPornConfigList.add(liveSnapshotDetectPornConfig);
		}
		describeLiveSnapshotDetectPornConfigResponse.setLiveSnapshotDetectPornConfigList(liveSnapshotDetectPornConfigList);
	 
	 	return describeLiveSnapshotDetectPornConfigResponse;
	}
}