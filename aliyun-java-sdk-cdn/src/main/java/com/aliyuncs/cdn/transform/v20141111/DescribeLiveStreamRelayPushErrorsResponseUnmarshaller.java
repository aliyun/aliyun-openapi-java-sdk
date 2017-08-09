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

import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRelayPushErrorsResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeLiveStreamRelayPushErrorsResponse.RelayPushErrorsModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamRelayPushErrorsResponseUnmarshaller {

	public static DescribeLiveStreamRelayPushErrorsResponse unmarshall(DescribeLiveStreamRelayPushErrorsResponse describeLiveStreamRelayPushErrorsResponse, UnmarshallerContext context) {
		
		describeLiveStreamRelayPushErrorsResponse.setRequestId(context.stringValue("DescribeLiveStreamRelayPushErrorsResponse.RequestId"));

		List<RelayPushErrorsModel> relayPushErrorsModelList = new ArrayList<RelayPushErrorsModel>();
		for (int i = 0; i < context.lengthValue("DescribeLiveStreamRelayPushErrorsResponse.RelayPushErrorsModelList.Length"); i++) {
			RelayPushErrorsModel relayPushErrorsModel = new RelayPushErrorsModel();
			relayPushErrorsModel.setErrorCode(context.stringValue("DescribeLiveStreamRelayPushErrorsResponse.RelayPushErrorsModelList["+ i +"].ErrorCode"));

			relayPushErrorsModelList.add(relayPushErrorsModel);
		}
		describeLiveStreamRelayPushErrorsResponse.setRelayPushErrorsModelList(relayPushErrorsModelList);
	 
	 	return describeLiveStreamRelayPushErrorsResponse;
	}
}