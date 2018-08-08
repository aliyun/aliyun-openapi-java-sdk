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

import com.aliyuncs.cdn.model.v20141111.DescribeDomainSrcFlowDataResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeDomainSrcFlowDataResponse.DataModule;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDomainSrcFlowDataResponseUnmarshaller {

	public static DescribeDomainSrcFlowDataResponse unmarshall(DescribeDomainSrcFlowDataResponse describeDomainSrcFlowDataResponse, UnmarshallerContext context) {
		
		describeDomainSrcFlowDataResponse.setRequestId(context.stringValue("DescribeDomainSrcFlowDataResponse.RequestId"));
		describeDomainSrcFlowDataResponse.setDomainName(context.stringValue("DescribeDomainSrcFlowDataResponse.DomainName"));
		describeDomainSrcFlowDataResponse.setStartTime(context.stringValue("DescribeDomainSrcFlowDataResponse.StartTime"));
		describeDomainSrcFlowDataResponse.setEndTime(context.stringValue("DescribeDomainSrcFlowDataResponse.EndTime"));
		describeDomainSrcFlowDataResponse.setDataInterval(context.stringValue("DescribeDomainSrcFlowDataResponse.DataInterval"));

		List<DataModule> srcFlowDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < context.lengthValue("DescribeDomainSrcFlowDataResponse.SrcFlowDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(context.stringValue("DescribeDomainSrcFlowDataResponse.SrcFlowDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setValue(context.stringValue("DescribeDomainSrcFlowDataResponse.SrcFlowDataPerInterval["+ i +"].Value"));

			srcFlowDataPerInterval.add(dataModule);
		}
		describeDomainSrcFlowDataResponse.setSrcFlowDataPerInterval(srcFlowDataPerInterval);
	 
	 	return describeDomainSrcFlowDataResponse;
	}
}