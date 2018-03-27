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

	public static DescribeLiveSnapshotDetectPornConfigResponse unmarshall(DescribeLiveSnapshotDetectPornConfigResponse describeLiveSnapshotDetectPornConfigResponse, UnmarshallerContext context) {
		
		describeLiveSnapshotDetectPornConfigResponse.setRequestId(context.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.RequestId"));
		describeLiveSnapshotDetectPornConfigResponse.setPageNum(context.integerValue("DescribeLiveSnapshotDetectPornConfigResponse.PageNum"));
		describeLiveSnapshotDetectPornConfigResponse.setPageSize(context.integerValue("DescribeLiveSnapshotDetectPornConfigResponse.PageSize"));
		describeLiveSnapshotDetectPornConfigResponse.setOrder(context.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.Order"));
		describeLiveSnapshotDetectPornConfigResponse.setTotalNum(context.integerValue("DescribeLiveSnapshotDetectPornConfigResponse.TotalNum"));
		describeLiveSnapshotDetectPornConfigResponse.setTotalPage(context.integerValue("DescribeLiveSnapshotDetectPornConfigResponse.TotalPage"));

		List<LiveSnapshotDetectPornConfig> liveSnapshotDetectPornConfigList = new ArrayList<LiveSnapshotDetectPornConfig>();
		for (int i = 0; i < context.lengthValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList.Length"); i++) {
			LiveSnapshotDetectPornConfig liveSnapshotDetectPornConfig = new LiveSnapshotDetectPornConfig();
			liveSnapshotDetectPornConfig.setDomainName(context.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].DomainName"));
			liveSnapshotDetectPornConfig.setAppName(context.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].AppName"));
			liveSnapshotDetectPornConfig.setOssEndpoint(context.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].OssEndpoint"));
			liveSnapshotDetectPornConfig.setOssBucket(context.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].OssBucket"));
			liveSnapshotDetectPornConfig.setOssObject(context.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].OssObject"));
			liveSnapshotDetectPornConfig.setInterval(context.integerValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].Interval"));

			List<String> scenes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].Scenes.Length"); j++) {
				scenes.add(context.stringValue("DescribeLiveSnapshotDetectPornConfigResponse.LiveSnapshotDetectPornConfigList["+ i +"].Scenes["+ j +"]"));
			}
			liveSnapshotDetectPornConfig.setScenes(scenes);

			liveSnapshotDetectPornConfigList.add(liveSnapshotDetectPornConfig);
		}
		describeLiveSnapshotDetectPornConfigResponse.setLiveSnapshotDetectPornConfigList(liveSnapshotDetectPornConfigList);
	 
	 	return describeLiveSnapshotDetectPornConfigResponse;
	}
}