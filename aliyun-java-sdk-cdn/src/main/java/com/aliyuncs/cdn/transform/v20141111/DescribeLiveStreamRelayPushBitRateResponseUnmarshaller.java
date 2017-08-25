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

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRelayPushBitRateResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRelayPushBitRateResponse.RelayPushBitRateModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamRelayPushBitRateResponseUnmarshaller {

	public static DescribeLiveStreamRelayPushBitRateResponse unmarshall(DescribeLiveStreamRelayPushBitRateResponse describeLiveStreamRelayPushBitRateResponse, UnmarshallerContext context) {
		
		describeLiveStreamRelayPushBitRateResponse.setRequestId(context.stringValue("DescribeLiveStreamRelayPushBitRateResponse.RequestId"));

		List<RelayPushBitRateModel> relayPushBitRateModelList = new ArrayList<RelayPushBitRateModel>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamRelayPushBitRateResponse.RelayPushBitRateModelList.Length"); i++) {
			RelayPushBitRateModel relayPushBitRateModel = new RelayPushBitRateModel();
			relayPushBitRateModel.setTime(context.stringValue("DescribeLiveStreamRelayPushBitRateResponse.RelayPushBitRateModelList["+ i +"].Time"));
			relayPushBitRateModel.setVedioFrame(context.stringValue("DescribeLiveStreamRelayPushBitRateResponse.RelayPushBitRateModelList["+ i +"].VedioFrame"));
			relayPushBitRateModel.setVedioTimstamp(context.stringValue("DescribeLiveStreamRelayPushBitRateResponse.RelayPushBitRateModelList["+ i +"].VedioTimstamp"));
			relayPushBitRateModel.setAudioFrame(context.stringValue("DescribeLiveStreamRelayPushBitRateResponse.RelayPushBitRateModelList["+ i +"].AudioFrame"));
			relayPushBitRateModel.setAudioTimstamp(context.stringValue("DescribeLiveStreamRelayPushBitRateResponse.RelayPushBitRateModelList["+ i +"].AudioTimstamp"));
			relayPushBitRateModel.setRelayDomain(context.stringValue("DescribeLiveStreamRelayPushBitRateResponse.RelayPushBitRateModelList["+ i +"].RelayDomain"));

			relayPushBitRateModelList.add(relayPushBitRateModel);
		}
		describeLiveStreamRelayPushBitRateResponse.setRelayPushBitRateModelList(relayPushBitRateModelList);
	 
	 	return describeLiveStreamRelayPushBitRateResponse;
	}
}