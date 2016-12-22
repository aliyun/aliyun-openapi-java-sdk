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

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRelayPushDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRelayPushDataResponse.RelayPushDetailModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamRelayPushDataResponseUnmarshaller {

	public static DescribeLiveStreamRelayPushDataResponse unmarshall(DescribeLiveStreamRelayPushDataResponse describeLiveStreamRelayPushDataResponse, UnmarshallerContext context) {
		
		describeLiveStreamRelayPushDataResponse.setRequestId(context.stringValue("DescribeLiveStreamRelayPushDataResponse.RequestId"));

		List<RelayPushDetailModel> relayPushDetailModelList = new ArrayList<RelayPushDetailModel>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamRelayPushDataResponse.RelayPushDetailModelList.Length"); i++) {
			RelayPushDetailModel relayPushDetailModel = new RelayPushDetailModel();
			relayPushDetailModel.setTime(context.stringValue("DescribeLiveStreamRelayPushDataResponse.RelayPushDetailModelList["+ i +"].Time"));
			relayPushDetailModel.setFrameRate(context.floatValue("DescribeLiveStreamRelayPushDataResponse.RelayPushDetailModelList["+ i +"].FrameRate"));
			relayPushDetailModel.setBitRate(context.floatValue("DescribeLiveStreamRelayPushDataResponse.RelayPushDetailModelList["+ i +"].BitRate"));
			relayPushDetailModel.setFrameLossRate(context.floatValue("DescribeLiveStreamRelayPushDataResponse.RelayPushDetailModelList["+ i +"].FrameLossRate"));
			relayPushDetailModel.setServerAddr(context.stringValue("DescribeLiveStreamRelayPushDataResponse.RelayPushDetailModelList["+ i +"].ServerAddr"));
			relayPushDetailModel.setClientAddr(context.stringValue("DescribeLiveStreamRelayPushDataResponse.RelayPushDetailModelList["+ i +"].ClientAddr"));

			relayPushDetailModelList.add(relayPushDetailModel);
		}
		describeLiveStreamRelayPushDataResponse.setRelayPushDetailModelList(relayPushDetailModelList);
	 
	 	return describeLiveStreamRelayPushDataResponse;
	}
}