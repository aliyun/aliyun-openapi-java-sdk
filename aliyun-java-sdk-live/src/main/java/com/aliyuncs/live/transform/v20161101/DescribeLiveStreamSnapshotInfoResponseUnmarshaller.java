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

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamSnapshotInfoResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamSnapshotInfoResponse.LiveStreamSnapshotInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamSnapshotInfoResponseUnmarshaller {

	public static DescribeLiveStreamSnapshotInfoResponse unmarshall(DescribeLiveStreamSnapshotInfoResponse describeLiveStreamSnapshotInfoResponse, UnmarshallerContext context) {
		
		describeLiveStreamSnapshotInfoResponse.setRequestId(context.stringValue("DescribeLiveStreamSnapshotInfoResponse.RequestId"));
		describeLiveStreamSnapshotInfoResponse.setNextStartTime(context.stringValue("DescribeLiveStreamSnapshotInfoResponse.NextStartTime"));

		List<LiveStreamSnapshotInfo> liveStreamSnapshotInfoList = new ArrayList<LiveStreamSnapshotInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamSnapshotInfoResponse.LiveStreamSnapshotInfoList.Length"); i++) {
			LiveStreamSnapshotInfo liveStreamSnapshotInfo = new LiveStreamSnapshotInfo();
			liveStreamSnapshotInfo.setOssEndpoint(context.stringValue("DescribeLiveStreamSnapshotInfoResponse.LiveStreamSnapshotInfoList["+ i +"].OssEndpoint"));
			liveStreamSnapshotInfo.setOssBucket(context.stringValue("DescribeLiveStreamSnapshotInfoResponse.LiveStreamSnapshotInfoList["+ i +"].OssBucket"));
			liveStreamSnapshotInfo.setOssObject(context.stringValue("DescribeLiveStreamSnapshotInfoResponse.LiveStreamSnapshotInfoList["+ i +"].OssObject"));
			liveStreamSnapshotInfo.setCreateTime(context.stringValue("DescribeLiveStreamSnapshotInfoResponse.LiveStreamSnapshotInfoList["+ i +"].CreateTime"));

			liveStreamSnapshotInfoList.add(liveStreamSnapshotInfo);
		}
		describeLiveStreamSnapshotInfoResponse.setLiveStreamSnapshotInfoList(liveStreamSnapshotInfoList);
	 
	 	return describeLiveStreamSnapshotInfoResponse;
	}
}