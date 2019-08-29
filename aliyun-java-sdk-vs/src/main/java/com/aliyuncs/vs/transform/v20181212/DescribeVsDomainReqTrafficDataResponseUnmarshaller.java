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

import com.aliyuncs.vs.model.v20181212.DescribeVsDomainReqTrafficDataResponse;
import com.aliyuncs.vs.model.v20181212.DescribeVsDomainReqTrafficDataResponse.DataModule;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVsDomainReqTrafficDataResponseUnmarshaller {

	public static DescribeVsDomainReqTrafficDataResponse unmarshall(DescribeVsDomainReqTrafficDataResponse describeVsDomainReqTrafficDataResponse, UnmarshallerContext _ctx) {
		
		describeVsDomainReqTrafficDataResponse.setRequestId(_ctx.stringValue("DescribeVsDomainReqTrafficDataResponse.RequestId"));
		describeVsDomainReqTrafficDataResponse.setDomainName(_ctx.stringValue("DescribeVsDomainReqTrafficDataResponse.DomainName"));
		describeVsDomainReqTrafficDataResponse.setStartTime(_ctx.stringValue("DescribeVsDomainReqTrafficDataResponse.StartTime"));
		describeVsDomainReqTrafficDataResponse.setEndTime(_ctx.stringValue("DescribeVsDomainReqTrafficDataResponse.EndTime"));
		describeVsDomainReqTrafficDataResponse.setDataInterval(_ctx.stringValue("DescribeVsDomainReqTrafficDataResponse.DataInterval"));

		List<DataModule> reqTrafficDataPerInterval = new ArrayList<DataModule>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVsDomainReqTrafficDataResponse.ReqTrafficDataPerInterval.Length"); i++) {
			DataModule dataModule = new DataModule();
			dataModule.setTimeStamp(_ctx.stringValue("DescribeVsDomainReqTrafficDataResponse.ReqTrafficDataPerInterval["+ i +"].TimeStamp"));
			dataModule.setReqTrafficValue(_ctx.stringValue("DescribeVsDomainReqTrafficDataResponse.ReqTrafficDataPerInterval["+ i +"].ReqTrafficValue"));

			reqTrafficDataPerInterval.add(dataModule);
		}
		describeVsDomainReqTrafficDataResponse.setReqTrafficDataPerInterval(reqTrafficDataPerInterval);
	 
	 	return describeVsDomainReqTrafficDataResponse;
	}
}