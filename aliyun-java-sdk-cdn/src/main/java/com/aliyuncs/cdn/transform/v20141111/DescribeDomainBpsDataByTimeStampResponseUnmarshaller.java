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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainBpsDataByTimeStampResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainBpsDataByTimeStampResponse.BpsDataModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainBpsDataByTimeStampResponseUnmarshaller {

	public static DescribeDomainBpsDataByTimeStampResponse unmarshall(DescribeDomainBpsDataByTimeStampResponse describeDomainBpsDataByTimeStampResponse, UnmarshallerContext context) {
		
		describeDomainBpsDataByTimeStampResponse.setRequestId(context.stringValue("DescribeDomainBpsDataByTimeStampResponse.RequestId"));
		describeDomainBpsDataByTimeStampResponse.setDomainName(context.stringValue("DescribeDomainBpsDataByTimeStampResponse.DomainName"));
		describeDomainBpsDataByTimeStampResponse.setTimeStamp(context.stringValue("DescribeDomainBpsDataByTimeStampResponse.TimeStamp"));

		List<BpsDataModel> bpsDataListList = new ArrayList<BpsDataModel>();
		for (int i = 0; i < context.lengthValue("DescribeDomainBpsDataByTimeStampResponse.BpsDataList.Length"); i++) {
			BpsDataModel bpsDataModel = new BpsDataModel();
			bpsDataModel.setLocationName(context.stringValue("DescribeDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].LocationName"));
			bpsDataModel.setIspName(context.stringValue("DescribeDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].IspName"));
			bpsDataModel.setBps(context.longValue("DescribeDomainBpsDataByTimeStampResponse.BpsDataList["+ i +"].Bps"));

			bpsDataListList.add(bpsDataModel);
		}
		describeDomainBpsDataByTimeStampResponse.setBpsDataList(bpsDataListList);
	 
	 	return describeDomainBpsDataByTimeStampResponse;
	}
}