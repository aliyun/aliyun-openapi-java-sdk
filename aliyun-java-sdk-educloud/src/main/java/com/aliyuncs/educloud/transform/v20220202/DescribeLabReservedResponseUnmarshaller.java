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

package com.aliyuncs.educloud.transform.v20220202;

import com.aliyuncs.educloud.model.v20220202.DescribeLabReservedResponse;
import com.aliyuncs.educloud.model.v20220202.DescribeLabReservedResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLabReservedResponseUnmarshaller {

	public static DescribeLabReservedResponse unmarshall(DescribeLabReservedResponse describeLabReservedResponse, UnmarshallerContext _ctx) {
		
		describeLabReservedResponse.setRequestId(_ctx.stringValue("DescribeLabReservedResponse.RequestId"));
		describeLabReservedResponse.setSuccess(_ctx.booleanValue("DescribeLabReservedResponse.Success"));
		describeLabReservedResponse.setCode(_ctx.longValue("DescribeLabReservedResponse.Code"));
		describeLabReservedResponse.setMessage(_ctx.stringValue("DescribeLabReservedResponse.Message"));

		Data data = new Data();
		data.setReservedId(_ctx.stringValue("DescribeLabReservedResponse.Data.ReservedId"));
		data.setLabId(_ctx.stringValue("DescribeLabReservedResponse.Data.LabId"));
		data.setLabTitle(_ctx.stringValue("DescribeLabReservedResponse.Data.LabTitle"));
		data.setStartTime(_ctx.longValue("DescribeLabReservedResponse.Data.StartTime"));
		data.setEndTime(_ctx.longValue("DescribeLabReservedResponse.Data.EndTime"));
		data.setNumber(_ctx.longValue("DescribeLabReservedResponse.Data.Number"));
		data.setStatus(_ctx.longValue("DescribeLabReservedResponse.Data.Status"));
		describeLabReservedResponse.setData(data);
	 
	 	return describeLabReservedResponse;
	}
}