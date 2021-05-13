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

package com.aliyuncs.ens.transform.v20171110;

import com.aliyuncs.ens.model.v20171110.DescribeCreatePrePaidInstanceResultResponse;
import com.aliyuncs.ens.model.v20171110.DescribeCreatePrePaidInstanceResultResponse.InstanceCreateResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCreatePrePaidInstanceResultResponseUnmarshaller {

	public static DescribeCreatePrePaidInstanceResultResponse unmarshall(DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResultResponse, UnmarshallerContext _ctx) {
		
		describeCreatePrePaidInstanceResultResponse.setRequestId(_ctx.stringValue("DescribeCreatePrePaidInstanceResultResponse.RequestId"));

		InstanceCreateResult instanceCreateResult = new InstanceCreateResult();
		instanceCreateResult.setInstanceCreateStatus(_ctx.stringValue("DescribeCreatePrePaidInstanceResultResponse.InstanceCreateResult.InstanceCreateStatus"));
		instanceCreateResult.setInstanceId(_ctx.stringValue("DescribeCreatePrePaidInstanceResultResponse.InstanceCreateResult.InstanceId"));
		describeCreatePrePaidInstanceResultResponse.setInstanceCreateResult(instanceCreateResult);
	 
	 	return describeCreatePrePaidInstanceResultResponse;
	}
}