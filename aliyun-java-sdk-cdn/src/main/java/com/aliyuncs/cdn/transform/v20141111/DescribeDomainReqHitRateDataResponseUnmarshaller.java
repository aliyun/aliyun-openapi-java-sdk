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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainReqHitRateDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainReqHitRateDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainReqHitRateDataResponseUnmarshaller {

	public static DescribeDomainReqHitRateDataResponse unmarshall(DescribeDomainReqHitRateDataResponse describeDomainReqHitRateDataResponse, UnmarshallerContext context) {
		
		describeDomainReqHitRateDataResponse.setRequestId(context.stringValue("DescribeDomainReqHitRateDataResponse.RequestId"));
		describeDomainReqHitRateDataResponse.setDomainName(context.stringValue("DescribeDomainReqHitRateDataResponse.DomainName"));
		describeDomainReqHitRateDataResponse.setDataInterval(context.stringValue("DescribeDomainReqHitRateDataResponse.DataInterval"));
		describeDomainReqHitRateDataResponse.setStartTime(context.stringValue("DescribeDomainReqHitRateDataResponse.StartTime"));
		describeDomainReqHitRateDataResponse.setEndTime(context.stringValue("DescribeDomainReqHitRateDataResponse.EndTime"));

		List<DataModule> reqHitRateIntervalList = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainReqHitRateDataResponse.ReqHitRateInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainReqHitRateDataResponse.ReqHitRateInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainReqHitRateDataResponse.ReqHitRateInterval["+ i +"].Value"));

			reqHitRateIntervalList.add(dataModule);
		}
		describeDomainReqHitRateDataResponse.setReqHitRateInterval(reqHitRateIntervalList);
	 
	 	return describeDomainReqHitRateDataResponse;
	}
}