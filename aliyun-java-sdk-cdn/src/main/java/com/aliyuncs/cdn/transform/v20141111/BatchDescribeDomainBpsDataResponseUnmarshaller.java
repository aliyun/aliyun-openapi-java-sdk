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

import com.aliyuncs.cdn.model.v20141111.BatchDescribeDomainBpsDataResponse;
import com.aliyuncs.cdn.model.v20141111.BatchDescribeDomainBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchDescribeDomainBpsDataResponseUnmarshaller {

	public static BatchDescribeDomainBpsDataResponse unmarshall(BatchDescribeDomainBpsDataResponse batchDescribeDomainBpsDataResponse, UnmarshallerContext context) {
		
		batchDescribeDomainBpsDataResponse.setRequestId(context.stringValue("BatchDescribeDomainBpsDataResponse.RequestId"));
		batchDescribeDomainBpsDataResponse.setPageNumber(context.integerValue("BatchDescribeDomainBpsDataResponse.PageNumber"));
		batchDescribeDomainBpsDataResponse.setPageSize(context.integerValue("BatchDescribeDomainBpsDataResponse.PageSize"));
		batchDescribeDomainBpsDataResponse.setTotalCount(context.integerValue("BatchDescribeDomainBpsDataResponse.TotalCount"));

		List<DataModule> bpsDatas = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("BatchDescribeDomainBpsDataResponse.BpsDatas.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimestamp(context.stringValue("BatchDescribeDomainBpsDataResponse.BpsDatas["+ i +"].Timestamp"));
			dataModule.setL1Bps(context.floatValue("BatchDescribeDomainBpsDataResponse.BpsDatas["+ i +"].L1Bps"));
			dataModule.setDomainName(context.stringValue("BatchDescribeDomainBpsDataResponse.BpsDatas["+ i +"].DomainName"));

			bpsDatas.add(dataModule);
		}
		batchDescribeDomainBpsDataResponse.setBpsDatas(bpsDatas);
	 
	 	return batchDescribeDomainBpsDataResponse;
	}
}