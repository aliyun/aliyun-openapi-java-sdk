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

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainBpsDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainBpsDataResponseUnmarshaller {

	public static DescribeVsDomainBpsDataResponse unmarshall(DescribeVsDomainBpsDataResponse describeVsDomainBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainBpsDataResponse.setRequestId(_ctx.stringValue("DescribeVsDomainBpsDataResponse.RequestId"));
		describeVsDomainBpsDataResponse.setDomainName(_ctx.stringValue("DescribeVsDomainBpsDataResponse.DomainName"));
		describeVsDomainBpsDataResponse.setStartTime(_ctx.stringValue("DescribeVsDomainBpsDataResponse.StartTime"));
		describeVsDomainBpsDataResponse.setEndTime(_ctx.stringValue("DescribeVsDomainBpsDataResponse.EndTime"));
		describeVsDomainBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeVsDomainBpsDataResponse.DataInterval"));

		List<DataModule> bpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainBpsDataResponse.BpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVsDomainBpsDataResponse.BpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setBpsValue(_ctx.stringValue("DescribeVsDomainBpsDataResponse.BpsDataPerInterval["+ i +"].BpsValue"));

			bpsDataPerInterval.add(dataModule);
		}
		describeVsDomainBpsDataResponse.setBpsDataPerInterval(bpsDataPerInterval);
	 
	 	return describeVsDomainBpsDataResponse;
	}
}