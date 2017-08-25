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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainUvDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainUvDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainUvDataResponseUnmarshaller {

	public static DescribeDomainUvDataResponse unmarshall(DescribeDomainUvDataResponse describeDomainUvDataResponse, UnmarshallerContext context) {
		
		describeDomainUvDataResponse.setRequestId(context.stringValue("DescribeDomainUvDataResponse.RequestId"));
		describeDomainUvDataResponse.setDomainName(context.stringValue("DescribeDomainUvDataResponse.DomainName"));
		describeDomainUvDataResponse.setDataInterval(context.stringValue("DescribeDomainUvDataResponse.DataInterval"));
		describeDomainUvDataResponse.setStartTime(context.stringValue("DescribeDomainUvDataResponse.StartTime"));
		describeDomainUvDataResponse.setEndTime(context.stringValue("DescribeDomainUvDataResponse.EndTime"));

		List<UsageData> uvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < context.lengthValue("DescribeDomainUvDataResponse.UvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setTimeStamp(context.stringValue("DescribeDomainUvDataResponse.UvDataInterval["+ i +"].TimeStamp"));
			usageData.setValue(context.stringValue("DescribeDomainUvDataResponse.UvDataInterval["+ i +"].Value"));

			uvDataInterval.add(usageData);
		}
		describeDomainUvDataResponse.setUvDataInterval(uvDataInterval);
	 
	 	return describeDomainUvDataResponse;
	}
}