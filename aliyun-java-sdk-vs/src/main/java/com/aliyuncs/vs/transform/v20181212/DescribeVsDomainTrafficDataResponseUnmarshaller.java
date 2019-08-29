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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainTrafficDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainTrafficDataResponseUnmarshaller {

	public static DescribeVsDomainTrafficDataResponse unmarshall(DescribeVsDomainTrafficDataResponse describeVsDomainTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeVsDomainTrafficDataResponse.RequestId"));
		describeVsDomainTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeVsDomainTrafficDataResponse.DomainName"));
		describeVsDomainTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeVsDomainTrafficDataResponse.StartTime"));
		describeVsDomainTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeVsDomainTrafficDataResponse.EndTime"));
		describeVsDomainTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeVsDomainTrafficDataResponse.DataInterval"));

		List<DataModule> trafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainTrafficDataResponse.TrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVsDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setTrafficValue(_ctx.stringValue("DescribeVsDomainTrafficDataResponse.TrafficDataPerInterval["+ i +"].TrafficValue"));

			trafficDataPerInterval.add(dataModule);
		}
		describeVsDomainTrafficDataResponse.setTrafficDataPerInterval(trafficDataPerInterval);
	 
	 	return describeVsDomainTrafficDataResponse;
	}
}