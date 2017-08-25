/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamOnlineBpsResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamOnlineBpsResponse.LiveStreamOnlineBpsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamOnlineBpsResponseUnmarshaller {

	public static DescribeLiveStreamOnlineBpsResponse unmarshall(DescribeLiveStreamOnlineBpsResponse describeLiveStreamOnlineBpsResponse, UnmarshallerContext context) {
		
		describeLiveStreamOnlineBpsResponse.setRequestId(context.stringValue("DescribeLiveStreamOnlineBpsResponse.RequestId"));
		describeLiveStreamOnlineBpsResponse.setTotalUserNumber(context.longValue("DescribeLiveStreamOnlineBpsResponse.TotalUserNumber"));
		describeLiveStreamOnlineBpsResponse.setFlvBps(context.floatValue("DescribeLiveStreamOnlineBpsResponse.FlvBps"));
		describeLiveStreamOnlineBpsResponse.setHlsBps(context.floatValue("DescribeLiveStreamOnlineBpsResponse.HlsBps"));

		List<LiveStreamOnlineBpsInfo> liveStreamOnlineBpsInfos = new ArrayList<LiveStreamOnlineBpsInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamOnlineBpsResponse.LiveStreamOnlineBpsInfos.Length"); i++) {
			LiveStreamOnlineBpsInfo liveStreamOnlineBpsInfo = new LiveStreamOnlineBpsInfo();
			liveStreamOnlineBpsInfo.setStreamUrl(context.stringValue("DescribeLiveStreamOnlineBpsResponse.LiveStreamOnlineBpsInfos["+ i +"].StreamUrl"));
			liveStreamOnlineBpsInfo.setUpBps(context.floatValue("DescribeLiveStreamOnlineBpsResponse.LiveStreamOnlineBpsInfos["+ i +"].UpBps"));
			liveStreamOnlineBpsInfo.setDownBps(context.floatValue("DescribeLiveStreamOnlineBpsResponse.LiveStreamOnlineBpsInfos["+ i +"].DownBps"));
			liveStreamOnlineBpsInfo.setTime(context.stringValue("DescribeLiveStreamOnlineBpsResponse.LiveStreamOnlineBpsInfos["+ i +"].Time"));

			liveStreamOnlineBpsInfos.add(liveStreamOnlineBpsInfo);
		}
		describeLiveStreamOnlineBpsResponse.setLiveStreamOnlineBpsInfos(liveStreamOnlineBpsInfos);
	 
	 	return describeLiveStreamOnlineBpsResponse;
	}
}