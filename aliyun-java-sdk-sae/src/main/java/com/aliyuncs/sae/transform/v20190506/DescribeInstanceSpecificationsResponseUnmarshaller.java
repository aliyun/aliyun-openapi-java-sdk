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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.DescribeInstanceSpecificationsResponse;
import com.aliyuncs.sae.model.v20190506.DescribeInstanceSpecificationsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSpecificationsResponseUnmarshaller {

	public static DescribeInstanceSpecificationsResponse unmarshall(DescribeInstanceSpecificationsResponse describeInstanceSpecificationsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSpecificationsResponse.setRequestId(_ctx.stringValue("DescribeInstanceSpecificationsResponse.RequestId"));
		describeInstanceSpecificationsResponse.setCode(_ctx.stringValue("DescribeInstanceSpecificationsResponse.Code"));
		describeInstanceSpecificationsResponse.setMessage(_ctx.stringValue("DescribeInstanceSpecificationsResponse.Message"));
		describeInstanceSpecificationsResponse.setSuccess(_ctx.booleanValue("DescribeInstanceSpecificationsResponse.Success"));
		describeInstanceSpecificationsResponse.setErrorCode(_ctx.stringValue("DescribeInstanceSpecificationsResponse.ErrorCode"));
		describeInstanceSpecificationsResponse.setTraceId(_ctx.stringValue("DescribeInstanceSpecificationsResponse.TraceId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceSpecificationsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCpu(_ctx.integerValue("DescribeInstanceSpecificationsResponse.Data["+ i +"].Cpu"));
			dataItem.setEnable(_ctx.booleanValue("DescribeInstanceSpecificationsResponse.Data["+ i +"].Enable"));
			dataItem.setId(_ctx.integerValue("DescribeInstanceSpecificationsResponse.Data["+ i +"].Id"));
			dataItem.setMemory(_ctx.integerValue("DescribeInstanceSpecificationsResponse.Data["+ i +"].Memory"));
			dataItem.setSpecInfo(_ctx.stringValue("DescribeInstanceSpecificationsResponse.Data["+ i +"].SpecInfo"));
			dataItem.setVersion(_ctx.integerValue("DescribeInstanceSpecificationsResponse.Data["+ i +"].Version"));

			data.add(dataItem);
		}
		describeInstanceSpecificationsResponse.setData(data);
	 
	 	return describeInstanceSpecificationsResponse;
	}
}