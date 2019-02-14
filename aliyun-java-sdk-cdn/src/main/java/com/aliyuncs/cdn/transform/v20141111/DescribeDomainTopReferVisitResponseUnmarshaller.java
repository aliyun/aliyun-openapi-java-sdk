/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeDomainTopReferVisitResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainTopReferVisitResponse.ReferList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainTopReferVisitResponseUnmarshaller {

	public static DescribeDomainTopReferVisitResponse unmarshall(DescribeDomainTopReferVisitResponse describeDomainTopReferVisitResponse, UnmarshallerContext context) {
		
		describeDomainTopReferVisitResponse.setRequestId(context.stringValue("DescribeDomainTopReferVisitResponse.RequestId"));
		describeDomainTopReferVisitResponse.setDomainName(context.stringValue("DescribeDomainTopReferVisitResponse.DomainName"));
		describeDomainTopReferVisitResponse.setStartTime(context.stringValue("DescribeDomainTopReferVisitResponse.StartTime"));

		List<ReferList> topReferList = new ArrayList<ReferList>();
		for (int i = 0; i < context.lengthValue("DescribeDomainTopReferVisitResponse.TopReferList.Length"); i++) {
			ReferList referList = new ReferList();
			referList.setReferDetail(context.stringValue("DescribeDomainTopReferVisitResponse.TopReferList["+ i +"].ReferDetail"));
			referList.setVisitData(context.stringValue("DescribeDomainTopReferVisitResponse.TopReferList["+ i +"].VisitData"));
			referList.setVisitProportion(context.floatValue("DescribeDomainTopReferVisitResponse.TopReferList["+ i +"].VisitProportion"));
			referList.setFlow(context.stringValue("DescribeDomainTopReferVisitResponse.TopReferList["+ i +"].Flow"));
			referList.setFlowProportion(context.floatValue("DescribeDomainTopReferVisitResponse.TopReferList["+ i +"].FlowProportion"));

			topReferList.add(referList);
		}
		describeDomainTopReferVisitResponse.setTopReferList(topReferList);
	 
	 	return describeDomainTopReferVisitResponse;
	}
}