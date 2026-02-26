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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeTrafficDataResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainRealTimeTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainRealTimeTrafficDataResponseUnmarshaller {

	public static DescribeVodDomainRealTimeTrafficDataResponse unmarshall(DescribeVodDomainRealTimeTrafficDataResponse describeVodDomainRealTimeTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainRealTimeTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.RequestId"));
		describeVodDomainRealTimeTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.EndTime"));
		describeVodDomainRealTimeTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.StartTime"));
		describeVodDomainRealTimeTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.DomainName"));
		describeVodDomainRealTimeTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.DataInterval"));

		List<DataModule> realTimeTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setValue(_ctx.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].Value"));
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVodDomainRealTimeTrafficDataResponse.RealTimeTrafficDataPerInterval["+ i +"].TimeStamp"));

			realTimeTrafficDataPerInterval.add(dataModule);
		}
		describeVodDomainRealTimeTrafficDataResponse.setRealTimeTrafficDataPerInterval(realTimeTrafficDataPerInterval);
	 
	 	return describeVodDomainRealTimeTrafficDataResponse;
	}
}