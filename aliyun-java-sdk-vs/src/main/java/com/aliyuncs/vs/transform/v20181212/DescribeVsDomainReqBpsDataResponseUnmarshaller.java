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

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainReqBpsDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainReqBpsDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainReqBpsDataResponseUnmarshaller {

	public static DescribeVsDomainReqBpsDataResponse unmarshall(DescribeVsDomainReqBpsDataResponse describeVsDomainReqBpsDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainReqBpsDataResponse.setRequestId(_ctx.stringValue("DescribeVsDomainReqBpsDataResponse.RequestId"));
		describeVsDomainReqBpsDataResponse.setDomainName(_ctx.stringValue("DescribeVsDomainReqBpsDataResponse.DomainName"));
		describeVsDomainReqBpsDataResponse.setStartTime(_ctx.stringValue("DescribeVsDomainReqBpsDataResponse.StartTime"));
		describeVsDomainReqBpsDataResponse.setEndTime(_ctx.stringValue("DescribeVsDomainReqBpsDataResponse.EndTime"));
		describeVsDomainReqBpsDataResponse.setDataInterval(_ctx.stringValue("DescribeVsDomainReqBpsDataResponse.DataInterval"));

		List<DataModule> reqBpsDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainReqBpsDataResponse.ReqBpsDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVsDomainReqBpsDataResponse.ReqBpsDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setReqBpsValue(_ctx.stringValue("DescribeVsDomainReqBpsDataResponse.ReqBpsDataPerInterval["+ i +"].ReqBpsValue"));

			reqBpsDataPerInterval.add(dataModule);
		}
		describeVsDomainReqBpsDataResponse.setReqBpsDataPerInterval(reqBpsDataPerInterval);
	 
	 	return describeVsDomainReqBpsDataResponse;
	}
}