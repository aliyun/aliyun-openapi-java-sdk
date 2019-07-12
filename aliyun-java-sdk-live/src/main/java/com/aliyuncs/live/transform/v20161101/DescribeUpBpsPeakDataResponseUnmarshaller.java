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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeUpBpsPeakDataResponse;
import com.aliyuncs.live.model.v20161101.DescribeUpBpsPeakDataResponse.DescribeUpPeakTraffic;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeUpBpsPeakDataResponseUnmarshaller {

	public static DescribeUpBpsPeakDataResponse unmarshall(DescribeUpBpsPeakDataResponse describeUpBpsPeakDataResponse, UnmarshallerContext _ctx) {
		
		describeUpBpsPeakDataResponse.setRequestId(_ctx.stringValue("DescribeUpBpsPeakDataResponse.RequestId"));

		List<DescribeUpPeakTraffic> describeUpPeakTraffics = new ArrayList<DescribeUpPeakTraffic>();
		for (int i = 0; i < _ctx.lengthValue("DescribeUpBpsPeakDataResponse.DescribeUpPeakTraffics.Length"); i++) {
			DescribeUpPeakTraffic describeUpPeakTraffic = new DescribeUpPeakTraffic();
			describeUpPeakTraffic.setPeakTime(_ctx.stringValue("DescribeUpBpsPeakDataResponse.DescribeUpPeakTraffics["+ i +"].PeakTime"));
			describeUpPeakTraffic.setQueryTime(_ctx.stringValue("DescribeUpBpsPeakDataResponse.DescribeUpPeakTraffics["+ i +"].QueryTime"));
			describeUpPeakTraffic.setStatName(_ctx.stringValue("DescribeUpBpsPeakDataResponse.DescribeUpPeakTraffics["+ i +"].StatName"));
			describeUpPeakTraffic.setBandWidth(_ctx.stringValue("DescribeUpBpsPeakDataResponse.DescribeUpPeakTraffics["+ i +"].BandWidth"));

			describeUpPeakTraffics.add(describeUpPeakTraffic);
		}
		describeUpBpsPeakDataResponse.setDescribeUpPeakTraffics(describeUpPeakTraffics);
	 
	 	return describeUpBpsPeakDataResponse;
	}
}