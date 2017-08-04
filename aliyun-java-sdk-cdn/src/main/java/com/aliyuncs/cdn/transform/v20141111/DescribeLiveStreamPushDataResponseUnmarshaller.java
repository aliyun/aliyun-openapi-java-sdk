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

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamPushDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamPushDataResponse.PushStreamModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamPushDataResponseUnmarshaller {

	public static DescribeLiveStreamPushDataResponse unmarshall(DescribeLiveStreamPushDataResponse describeLiveStreamPushDataResponse, UnmarshallerContext context) {
		
		describeLiveStreamPushDataResponse.setRequestId(context.stringValue("DescribeLiveStreamPushDataResponse.RequestId"));

		List<PushStreamModel> pushStreamModelList = new ArrayList<PushStreamModel>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamPushDataResponse.PushStreamModelList.Length"); i++) {
			PushStreamModel pushStreamModel = new PushStreamModel();
			pushStreamModel.setTime(context.stringValue("DescribeLiveStreamPushDataResponse.PushStreamModelList["+ i +"].Time"));
			pushStreamModel.setStream(context.stringValue("DescribeLiveStreamPushDataResponse.PushStreamModelList["+ i +"].Stream"));
			pushStreamModel.setFrameRate(context.floatValue("DescribeLiveStreamPushDataResponse.PushStreamModelList["+ i +"].FrameRate"));
			pushStreamModel.setBitRate(context.floatValue("DescribeLiveStreamPushDataResponse.PushStreamModelList["+ i +"].BitRate"));
			pushStreamModel.setFrameLossRate(context.floatValue("DescribeLiveStreamPushDataResponse.PushStreamModelList["+ i +"].FrameLossRate"));
			pushStreamModel.setServerAddr(context.stringValue("DescribeLiveStreamPushDataResponse.PushStreamModelList["+ i +"].ServerAddr"));
			pushStreamModel.setClientAddr(context.stringValue("DescribeLiveStreamPushDataResponse.PushStreamModelList["+ i +"].ClientAddr"));

			pushStreamModelList.add(pushStreamModel);
		}
		describeLiveStreamPushDataResponse.setPushStreamModelList(pushStreamModelList);
	 
	 	return describeLiveStreamPushDataResponse;
	}
}