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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainDownstreamBpsOfEdgeResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainDownstreamBpsOfEdgeResponse.DomainBpsModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainDownstreamBpsOfEdgeResponseUnmarshaller {

	public static DescribeDomainDownstreamBpsOfEdgeResponse unmarshall(DescribeDomainDownstreamBpsOfEdgeResponse describeDomainDownstreamBpsOfEdgeResponse, UnmarshallerContext context) {
		
		describeDomainDownstreamBpsOfEdgeResponse.setRequestId(context.stringValue("DescribeDomainDownstreamBpsOfEdgeResponse.RequestId"));

		List<DomainBpsModel> bpsDatas = new ArrayList<DomainBpsModel>();
		for (int i = 0; i < context.lengthValue("DescribeDomainDownstreamBpsOfEdgeResponse.BpsDatas.Length"); i++) {
			DomainBpsModel domainBpsModel = new DomainBpsModel();
			domainBpsModel.setTime(context.stringValue("DescribeDomainDownstreamBpsOfEdgeResponse.BpsDatas["+ i +"].Time"));
			domainBpsModel.setBps(context.floatValue("DescribeDomainDownstreamBpsOfEdgeResponse.BpsDatas["+ i +"].Bps"));

			bpsDatas.add(domainBpsModel);
		}
		describeDomainDownstreamBpsOfEdgeResponse.setBpsDatas(bpsDatas);
	 
	 	return describeDomainDownstreamBpsOfEdgeResponse;
	}
}