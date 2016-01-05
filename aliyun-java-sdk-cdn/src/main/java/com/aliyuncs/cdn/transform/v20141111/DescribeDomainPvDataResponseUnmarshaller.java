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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainPvDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainPvDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainPvDataResponseUnmarshaller {

	public static DescribeDomainPvDataResponse unmarshall(DescribeDomainPvDataResponse describeDomainPvDataResponse, UnmarshallerContext context) {
		
		describeDomainPvDataResponse.setRequestId(context.stringValue("DescribeDomainPvDataResponse.RequestId"));
		describeDomainPvDataResponse.setDomainName(context.stringValue("DescribeDomainPvDataResponse.DomainName"));
		describeDomainPvDataResponse.setDataInterval(context.stringValue("DescribeDomainPvDataResponse.DataInterval"));
		describeDomainPvDataResponse.setStartTime(context.stringValue("DescribeDomainPvDataResponse.StartTime"));
		describeDomainPvDataResponse.setEndTime(context.stringValue("DescribeDomainPvDataResponse.EndTime"));

		List<UsageData> pvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeDomainPvDataResponse.PvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeDomainPvDataResponse.PvDataInterval["+ i +"].TimeStamp"));
			usageData.setValue(context.stringValue("DescribeDomainPvDataResponse.PvDataInterval["+ i +"].Value"));

			pvDataInterval.add(usageData);
		}
		describeDomainPvDataResponse.setPvDataInterval(pvDataInterval);
	 
	 	return describeDomainPvDataResponse;
	}
}