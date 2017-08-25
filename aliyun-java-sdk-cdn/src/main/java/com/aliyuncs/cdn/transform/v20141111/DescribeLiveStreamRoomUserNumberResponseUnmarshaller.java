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

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRoomUserNumberResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRoomUserNumberResponse.LiveStreamOnlineUserNumInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamRoomUserNumberResponseUnmarshaller {

	public static DescribeLiveStreamRoomUserNumberResponse unmarshall(DescribeLiveStreamRoomUserNumberResponse describeLiveStreamRoomUserNumberResponse, UnmarshallerContext context) {
		
		describeLiveStreamRoomUserNumberResponse.setRequestId(context.stringValue("DescribeLiveStreamRoomUserNumberResponse.RequestId"));
		describeLiveStreamRoomUserNumberResponse.setTotalUserNumber(context.longValue("DescribeLiveStreamRoomUserNumberResponse.TotalUserNumber"));

		List<LiveStreamOnlineUserNumInfo> onlineUserInfo = new ArrayList<LiveStreamOnlineUserNumInfo>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamRoomUserNumberResponse.OnlineUserInfo.Length"); i++) {
			LiveStreamOnlineUserNumInfo liveStreamOnlineUserNumInfo = new LiveStreamOnlineUserNumInfo();
			liveStreamOnlineUserNumInfo.setStreamUrl(context.stringValue("DescribeLiveStreamRoomUserNumberResponse.OnlineUserInfo["+ i +"].StreamUrl"));
			liveStreamOnlineUserNumInfo.setUserNumber(context.longValue("DescribeLiveStreamRoomUserNumberResponse.OnlineUserInfo["+ i +"].UserNumber"));
			liveStreamOnlineUserNumInfo.setTime(context.stringValue("DescribeLiveStreamRoomUserNumberResponse.OnlineUserInfo["+ i +"].Time"));

			onlineUserInfo.add(liveStreamOnlineUserNumInfo);
		}
		describeLiveStreamRoomUserNumberResponse.setOnlineUserInfo(onlineUserInfo);
	 
	 	return describeLiveStreamRoomUserNumberResponse;
	}
}