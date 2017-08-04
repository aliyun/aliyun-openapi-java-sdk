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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainCCDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainCCDataResponse.CCDatas;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainCCDataResponseUnmarshaller {

	public static DescribeDomainCCDataResponse unmarshall(DescribeDomainCCDataResponse describeDomainCCDataResponse, UnmarshallerContext context) {
		
		describeDomainCCDataResponse.setRequestId(context.stringValue("DescribeDomainCCDataResponse.RequestId"));
		describeDomainCCDataResponse.setDomainName(context.stringValue("DescribeDomainCCDataResponse.DomainName"));
		describeDomainCCDataResponse.setDataInterval(context.stringValue("DescribeDomainCCDataResponse.DataInterval"));
		describeDomainCCDataResponse.setStartTime(context.stringValue("DescribeDomainCCDataResponse.StartTime"));
		describeDomainCCDataResponse.setEndTime(context.stringValue("DescribeDomainCCDataResponse.EndTime"));

		List<CCDatas> cCDataList = new ArrayList<CCDatas>();
		for (int i = 0; i < context.lengthValue("DescribeDomainCCDataResponse.CCDataList.Length"); i++) {
			CCDatas cCDatas = new CCDatas();
			cCDatas.setTimeStamp(context.stringValue("DescribeDomainCCDataResponse.CCDataList["+ i +"].TimeStamp"));
			cCDatas.setCount(context.stringValue("DescribeDomainCCDataResponse.CCDataList["+ i +"].Count"));

			cCDataList.add(cCDatas);
		}
		describeDomainCCDataResponse.setCCDataList(cCDataList);
	 
	 	return describeDomainCCDataResponse;
	}
}