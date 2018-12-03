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

package com.aliyuncs.scdn.transform.v20171115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainTopReferVisitResponse;
import com.aliyuncs.scdn.model.v20171115.DescribeScdnDomainTopReferVisitResponse.ReferList;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScdnDomainTopReferVisitResponseUnmarshaller {

	public static DescribeScdnDomainTopReferVisitResponse unmarshall(DescribeScdnDomainTopReferVisitResponse describeScdnDomainTopReferVisitResponse, UnmarshallerContext context) {
		
		describeScdnDomainTopReferVisitResponse.setRequestId(context.stringValue("DescribeScdnDomainTopReferVisitResponse.RequestId"));
		describeScdnDomainTopReferVisitResponse.setDomainName(context.stringValue("DescribeScdnDomainTopReferVisitResponse.DomainName"));
		describeScdnDomainTopReferVisitResponse.setStartTime(context.stringValue("DescribeScdnDomainTopReferVisitResponse.StartTime"));

		List<ReferList> topReferList = new ArrayList<ReferList>();
		for (int i = 0; i < context.lengthValue("DescribeScdnDomainTopReferVisitResponse.TopReferList.Length"); i++) {
			ReferList referList = new ReferList();
			referList.setReferDetail(context.stringValue("DescribeScdnDomainTopReferVisitResponse.TopReferList["+ i +"].ReferDetail"));
			referList.setVisitData(context.stringValue("DescribeScdnDomainTopReferVisitResponse.TopReferList["+ i +"].VisitData"));
			referList.setVisitProportion(context.floatValue("DescribeScdnDomainTopReferVisitResponse.TopReferList["+ i +"].VisitProportion"));
			referList.setFlow(context.stringValue("DescribeScdnDomainTopReferVisitResponse.TopReferList["+ i +"].Flow"));
			referList.setFlowProportion(context.floatValue("DescribeScdnDomainTopReferVisitResponse.TopReferList["+ i +"].FlowProportion"));

			topReferList.add(referList);
		}
		describeScdnDomainTopReferVisitResponse.setTopReferList(topReferList);
	 
	 	return describeScdnDomainTopReferVisitResponse;
	}
}