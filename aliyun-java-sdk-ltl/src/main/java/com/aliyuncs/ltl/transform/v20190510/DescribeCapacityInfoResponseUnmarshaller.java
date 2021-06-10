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

package com.aliyuncs.ltl.transform.v20190510;

import com.aliyuncs.ltl.model.v20190510.DescribeCapacityInfoResponse;
import com.aliyuncs.ltl.model.v20190510.DescribeCapacityInfoResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCapacityInfoResponseUnmarshaller {

	public static DescribeCapacityInfoResponse unmarshall(DescribeCapacityInfoResponse describeCapacityInfoResponse, UnmarshallerContext _ctx) {
		
		describeCapacityInfoResponse.setRequestId(_ctx.stringValue("DescribeCapacityInfoResponse.RequestId"));
		describeCapacityInfoResponse.setCode(_ctx.integerValue("DescribeCapacityInfoResponse.Code"));
		describeCapacityInfoResponse.setSuccess(_ctx.booleanValue("DescribeCapacityInfoResponse.Success"));
		describeCapacityInfoResponse.setMessage(_ctx.stringValue("DescribeCapacityInfoResponse.Message"));

		Data data = new Data();
		data.setCapacityQuota(_ctx.longValue("DescribeCapacityInfoResponse.Data.CapacityQuota"));
		data.setUsedCapacity(_ctx.longValue("DescribeCapacityInfoResponse.Data.UsedCapacity"));
		data.setMemberUsedCapacity(_ctx.longValue("DescribeCapacityInfoResponse.Data.MemberUsedCapacity"));
		data.setCountQuota(_ctx.longValue("DescribeCapacityInfoResponse.Data.CountQuota"));
		data.setUsedCount(_ctx.longValue("DescribeCapacityInfoResponse.Data.UsedCount"));
		data.setMemberUsedCount(_ctx.longValue("DescribeCapacityInfoResponse.Data.MemberUsedCount"));
		describeCapacityInfoResponse.setData(data);
	 
	 	return describeCapacityInfoResponse;
	}
}