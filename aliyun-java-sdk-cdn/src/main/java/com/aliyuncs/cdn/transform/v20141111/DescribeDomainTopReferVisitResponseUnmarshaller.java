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

	public static DescribeDomainTopReferVisitResponse unmarshall(DescribeDomainTopReferVisitResponse describeDomainTopReferVisitResponse, UnmarshallerContext _ctx) {
		
		describeDomainTopReferVisitResponse.setRequestId(_ctx.stringValue("DescribeDomainTopReferVisitResponse.RequestId"));
		describeDomainTopReferVisitResponse.setDomainName(_ctx.stringValue("DescribeDomainTopReferVisitResponse.DomainName"));
		describeDomainTopReferVisitResponse.setStartTime(_ctx.stringValue("DescribeDomainTopReferVisitResponse.StartTime"));

		List<ReferList> topReferList = new ArrayList<ReferList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDomainTopReferVisitResponse.TopReferList.Length"); i++) {
			ReferList referList = new ReferList();
			referList.setReferDetail(_ctx.stringValue("DescribeDomainTopReferVisitResponse.TopReferList["+ i +"].ReferDetail"));
			referList.setVisitData(_ctx.stringValue("DescribeDomainTopReferVisitResponse.TopReferList["+ i +"].VisitData"));
			referList.setVisitProportion(_ctx.floatValue("DescribeDomainTopReferVisitResponse.TopReferList["+ i +"].VisitProportion"));
			referList.setFlow(_ctx.stringValue("DescribeDomainTopReferVisitResponse.TopReferList["+ i +"].Flow"));
			referList.setFlowProportion(_ctx.floatValue("DescribeDomainTopReferVisitResponse.TopReferList["+ i +"].FlowProportion"));

			topReferList.add(referList);
		}
		describeDomainTopReferVisitResponse.setTopReferList(topReferList);
	 
	 	return describeDomainTopReferVisitResponse;
	}
}