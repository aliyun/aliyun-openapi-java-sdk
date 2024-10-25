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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.Describe95TrafficResponse;
import com.aliyuncs.vpc.model.v20160428.Describe95TrafficResponse.Traffic95Summary;
import com.aliyuncs.vpc.model.v20160428.Describe95TrafficResponse.Traffic95Summary.Traffic95Detail;
import com.aliyuncs.transform.UnmarshallerContext;


public class Describe95TrafficResponseUnmarshaller {

	public static Describe95TrafficResponse unmarshall(Describe95TrafficResponse describe95TrafficResponse, UnmarshallerContext _ctx) {
		
		describe95TrafficResponse.setRequestId(_ctx.stringValue("Describe95TrafficResponse.RequestId"));

		Traffic95Summary traffic95Summary = new Traffic95Summary();
		traffic95Summary.setInternetChargeType(_ctx.stringValue("Describe95TrafficResponse.Traffic95Summary.InternetChargeType"));
		traffic95Summary.setInstanceId(_ctx.stringValue("Describe95TrafficResponse.Traffic95Summary.InstanceId"));
		traffic95Summary.setBandwidth(_ctx.longValue("Describe95TrafficResponse.Traffic95Summary.Bandwidth"));
		traffic95Summary.setFifthPeakBandwidth(_ctx.stringValue("Describe95TrafficResponse.Traffic95Summary.FifthPeakBandwidth"));
		traffic95Summary.setMinimumConsumeBandwidth(_ctx.stringValue("Describe95TrafficResponse.Traffic95Summary.MinimumConsumeBandwidth"));

		List<Traffic95Detail> traffic95DetailList = new ArrayList<Traffic95Detail>();
		for (int i = 0; i < _ctx.lengthValue("Describe95TrafficResponse.Traffic95Summary.Traffic95DetailList.Length"); i++) {
			Traffic95Detail traffic95Detail = new Traffic95Detail();
			traffic95Detail.setTime(_ctx.stringValue("Describe95TrafficResponse.Traffic95Summary.Traffic95DetailList["+ i +"].Time"));
			traffic95Detail.setBillBandwidth(_ctx.stringValue("Describe95TrafficResponse.Traffic95Summary.Traffic95DetailList["+ i +"].BillBandwidth"));
			traffic95Detail.setOutBandwidth(_ctx.stringValue("Describe95TrafficResponse.Traffic95Summary.Traffic95DetailList["+ i +"].OutBandwidth"));
			traffic95Detail.setInBandwidth(_ctx.stringValue("Describe95TrafficResponse.Traffic95Summary.Traffic95DetailList["+ i +"].InBandwidth"));

			traffic95DetailList.add(traffic95Detail);
		}
		traffic95Summary.setTraffic95DetailList(traffic95DetailList);
		describe95TrafficResponse.setTraffic95Summary(traffic95Summary);
	 
	 	return describe95TrafficResponse;
	}
}