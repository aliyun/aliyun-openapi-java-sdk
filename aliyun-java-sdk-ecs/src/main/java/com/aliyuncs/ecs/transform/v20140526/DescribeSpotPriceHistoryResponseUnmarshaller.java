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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeSpotPriceHistoryResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeSpotPriceHistoryResponse.SpotPriceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSpotPriceHistoryResponseUnmarshaller {

	public static DescribeSpotPriceHistoryResponse unmarshall(DescribeSpotPriceHistoryResponse describeSpotPriceHistoryResponse, UnmarshallerContext context) {
		
		describeSpotPriceHistoryResponse.setRequestId(context.stringValue("DescribeSpotPriceHistoryResponse.RequestId"));
		describeSpotPriceHistoryResponse.setNextOffset(context.integerValue("DescribeSpotPriceHistoryResponse.NextOffset"));
		describeSpotPriceHistoryResponse.setCurrency(context.stringValue("DescribeSpotPriceHistoryResponse.Currency"));

		List<SpotPriceType> spotPrices = new ArrayList<SpotPriceType>();
		for (int i = 0; i < context.lengthValue("DescribeSpotPriceHistoryResponse.SpotPrices.Length"); i++) {
			SpotPriceType spotPriceType = new SpotPriceType();
			spotPriceType.setZoneId(context.stringValue("DescribeSpotPriceHistoryResponse.SpotPrices["+ i +"].ZoneId"));
			spotPriceType.setInstanceType(context.stringValue("DescribeSpotPriceHistoryResponse.SpotPrices["+ i +"].InstanceType"));
			spotPriceType.setIoOptimized(context.stringValue("DescribeSpotPriceHistoryResponse.SpotPrices["+ i +"].IoOptimized"));
			spotPriceType.setTimestamp(context.stringValue("DescribeSpotPriceHistoryResponse.SpotPrices["+ i +"].Timestamp"));
			spotPriceType.setNetworkType(context.stringValue("DescribeSpotPriceHistoryResponse.SpotPrices["+ i +"].NetworkType"));
			spotPriceType.setSpotPrice(context.floatValue("DescribeSpotPriceHistoryResponse.SpotPrices["+ i +"].SpotPrice"));
			spotPriceType.setOriginPrice(context.floatValue("DescribeSpotPriceHistoryResponse.SpotPrices["+ i +"].OriginPrice"));

			spotPrices.add(spotPriceType);
		}
		describeSpotPriceHistoryResponse.setSpotPrices(spotPrices);
	 
	 	return describeSpotPriceHistoryResponse;
	}
}