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

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainUvDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainUvDataResponse.UsageData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainUvDataResponseUnmarshaller {

	public static DescribeVsDomainUvDataResponse unmarshall(DescribeVsDomainUvDataResponse describeVsDomainUvDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainUvDataResponse.setRequestId(_ctx.stringValue("DescribeVsDomainUvDataResponse.RequestId"));
		describeVsDomainUvDataResponse.setDomainName(_ctx.stringValue("DescribeVsDomainUvDataResponse.DomainName"));
		describeVsDomainUvDataResponse.setStartTime(_ctx.stringValue("DescribeVsDomainUvDataResponse.StartTime"));
		describeVsDomainUvDataResponse.setEndTime(_ctx.stringValue("DescribeVsDomainUvDataResponse.EndTime"));
		describeVsDomainUvDataResponse.setDataInterval(_ctx.stringValue("DescribeVsDomainUvDataResponse.DataInterval"));

		List<UsageData> uvDataInterval = new ArrayList<UsageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainUvDataResponse.UvDataInterval.Length"); i++) {
			UsageData usageData = new UsageData();
			usageData.setValue(_ctx.stringValue("DescribeVsDomainUvDataResponse.UvDataInterval["+ i +"].Value"));
			usageData.setTimeStamp(_ctx.stringValue("DescribeVsDomainUvDataResponse.UvDataInterval["+ i +"].TimeStamp"));

			uvDataInterval.add(usageData);
		}
		describeVsDomainUvDataResponse.setUvDataInterval(uvDataInterval);
	 
	 	return describeVsDomainUvDataResponse;
	}
}