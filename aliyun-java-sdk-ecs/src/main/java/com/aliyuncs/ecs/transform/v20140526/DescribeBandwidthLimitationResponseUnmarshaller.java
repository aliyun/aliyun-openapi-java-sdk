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

import com.aliyuncs.ecs.model.v20140526.DescribeBandwidthLimitationResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeBandwidthLimitationResponse.Bandwidth;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBandwidthLimitationResponseUnmarshaller {

	public static DescribeBandwidthLimitationResponse unmarshall(DescribeBandwidthLimitationResponse describeBandwidthLimitationResponse, UnmarshallerContext context) {
		
		describeBandwidthLimitationResponse.setRequestId(context.stringValue("DescribeBandwidthLimitationResponse.RequestId"));

		List<Bandwidth> bandwidths = new ArrayList<Bandwidth>();
		for (int i = 0; i < context.lengthValue("DescribeBandwidthLimitationResponse.Bandwidths.Length"); i++) {
			Bandwidth bandwidth = new Bandwidth();
			bandwidth.setInternetChargeType(context.stringValue("DescribeBandwidthLimitationResponse.Bandwidths["+ i +"].InternetChargeType"));
			bandwidth.setMin(context.integerValue("DescribeBandwidthLimitationResponse.Bandwidths["+ i +"].Min"));
			bandwidth.setMax(context.integerValue("DescribeBandwidthLimitationResponse.Bandwidths["+ i +"].Max"));
			bandwidth.setUnit(context.stringValue("DescribeBandwidthLimitationResponse.Bandwidths["+ i +"].Unit"));

			bandwidths.add(bandwidth);
		}
		describeBandwidthLimitationResponse.setBandwidths(bandwidths);
	 
	 	return describeBandwidthLimitationResponse;
	}
}