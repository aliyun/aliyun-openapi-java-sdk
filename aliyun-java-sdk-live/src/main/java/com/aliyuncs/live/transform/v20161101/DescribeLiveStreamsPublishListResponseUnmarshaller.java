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
package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsPublishListResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamsPublishListResponse.LiveStreamPublishInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamsPublishListResponseUnmarshaller {

	public static DescribeLiveStreamsPublishListResponse unmarshall(DescribeLiveStreamsPublishListResponse describeLiveStreamsPublishListResponse, UnmarshallerContext context) {
		
		describeLiveStreamsPublishListResponse.setRequestId(context.stringValue("DescribeLiveStreamsPublishListResponse.RequestId"));

		List<LiveStreamPublishInfo> publishInfo = new ArrayList<LiveStreamPublishInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamsPublishListResponse.PublishInfo.Length"); i++) {
			LiveStreamPublishInfo liveStreamPublishInfo = new LiveStreamPublishInfo();
			liveStreamPublishInfo.setDomainName(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].DomainName"));
			liveStreamPublishInfo.setAppName(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].AppName"));
			liveStreamPublishInfo.setStreamName(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].StreamName"));
			liveStreamPublishInfo.setStreamUrl(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].StreamUrl"));
			liveStreamPublishInfo.setPublishTime(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].PublishTime"));
			liveStreamPublishInfo.setStopTime(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].StopTime"));
			liveStreamPublishInfo.setPublishUrl(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].PublishUrl"));
			liveStreamPublishInfo.setClientAddr(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].ClientAddr"));
			liveStreamPublishInfo.setEdgeNodeAddr(context.stringValue("DescribeLiveStreamsPublishListResponse.PublishInfo["+ i +"].EdgeNodeAddr"));

			publishInfo.add(liveStreamPublishInfo);
		}
		describeLiveStreamsPublishListResponse.setPublishInfo(publishInfo);
	 
	 	return describeLiveStreamsPublishListResponse;
	}
}