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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainTopReferVisitResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnDomainTopReferVisitResponse.ReferList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnDomainTopReferVisitResponseUnmarshaller {

	public static DescribeDcdnDomainTopReferVisitResponse unmarshall(DescribeDcdnDomainTopReferVisitResponse describeDcdnDomainTopReferVisitResponse, UnmarshallerContext _ctx) {
		
		describeDcdnDomainTopReferVisitResponse.setRequestId(_ctx.stringValue("DescribeDcdnDomainTopReferVisitResponse.RequestId"));
		describeDcdnDomainTopReferVisitResponse.setDomainName(_ctx.stringValue("DescribeDcdnDomainTopReferVisitResponse.DomainName"));
		describeDcdnDomainTopReferVisitResponse.setStartTime(_ctx.stringValue("DescribeDcdnDomainTopReferVisitResponse.StartTime"));

		List<ReferList> topReferList = new ArrayList<ReferList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnDomainTopReferVisitResponse.TopReferList.Length"); i++) {
			ReferList referList = new ReferList();
			referList.setReferDetail(_ctx.stringValue("DescribeDcdnDomainTopReferVisitResponse.TopReferList["+ i +"].ReferDetail"));
			referList.setVisitData(_ctx.stringValue("DescribeDcdnDomainTopReferVisitResponse.TopReferList["+ i +"].VisitData"));
			referList.setVisitProportion(_ctx.floatValue("DescribeDcdnDomainTopReferVisitResponse.TopReferList["+ i +"].VisitProportion"));
			referList.setFlow(_ctx.stringValue("DescribeDcdnDomainTopReferVisitResponse.TopReferList["+ i +"].Flow"));
			referList.setFlowProportion(_ctx.floatValue("DescribeDcdnDomainTopReferVisitResponse.TopReferList["+ i +"].FlowProportion"));

			topReferList.add(referList);
		}
		describeDcdnDomainTopReferVisitResponse.setTopReferList(topReferList);
	 
	 	return describeDcdnDomainTopReferVisitResponse;
	}
}