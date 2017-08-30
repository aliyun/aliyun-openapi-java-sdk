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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainPnoDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainPnoDataResponse.PnoDataModel;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainPnoDataResponse.PnoDataModel.Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainPnoDataResponseUnmarshaller {

	public static DescribeDomainPnoDataResponse unmarshall(DescribeDomainPnoDataResponse describeDomainPnoDataResponse, UnmarshallerContext context) {
		
		describeDomainPnoDataResponse.setRequestId(context.stringValue("DescribeDomainPnoDataResponse.RequestId"));
		describeDomainPnoDataResponse.setStartTime(context.stringValue("DescribeDomainPnoDataResponse.StartTime"));
		describeDomainPnoDataResponse.setEndTime(context.stringValue("DescribeDomainPnoDataResponse.EndTime"));
		describeDomainPnoDataResponse.setPageSize(context.integerValue("DescribeDomainPnoDataResponse.PageSize"));
		describeDomainPnoDataResponse.setPageNumber(context.integerValue("DescribeDomainPnoDataResponse.PageNumber"));
		describeDomainPnoDataResponse.setDomainName(context.stringValue("DescribeDomainPnoDataResponse.DomainName"));

		List<PnoDataModel> pnoDataModels = new ArrayList<PnoDataModel>();
		for (int i = 0; i < context.lengthValue("DescribeDomainPnoDataResponse.PnoDataModels.Length"); i++) {
			PnoDataModel pnoDataModel = new PnoDataModel();
			pnoDataModel.setPno(context.stringValue("DescribeDomainPnoDataResponse.PnoDataModels["+ i +"].Pno"));

			List<Detail> details = new ArrayList<Detail>();
			for (int j = 0; j < context.lengthValue("DescribeDomainPnoDataResponse.PnoDataModels["+ i +"].Details.Length"); j++) {
				Detail detail = new Detail();
				detail.setTimeStamp(context.stringValue("DescribeDomainPnoDataResponse.PnoDataModels["+ i +"].Details["+ j +"].TimeStamp"));
				detail.setBandWidth(context.floatValue("DescribeDomainPnoDataResponse.PnoDataModels["+ i +"].Details["+ j +"].BandWidth"));

				details.add(detail);
			}
			pnoDataModel.setDetails(details);

			pnoDataModels.add(pnoDataModel);
		}
		describeDomainPnoDataResponse.setPnoDataModels(pnoDataModels);
	 
	 	return describeDomainPnoDataResponse;
	}
}