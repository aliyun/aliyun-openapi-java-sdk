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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeAggregateFunctionResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeAggregateFunctionResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAggregateFunctionResponseUnmarshaller {

	public static DescribeAggregateFunctionResponse unmarshall(DescribeAggregateFunctionResponse describeAggregateFunctionResponse, UnmarshallerContext _ctx) {
		
		describeAggregateFunctionResponse.setRequestId(_ctx.stringValue("DescribeAggregateFunctionResponse.RequestId"));
		describeAggregateFunctionResponse.setSuccess(_ctx.booleanValue("DescribeAggregateFunctionResponse.Success"));
		describeAggregateFunctionResponse.setCode(_ctx.integerValue("DescribeAggregateFunctionResponse.Code"));
		describeAggregateFunctionResponse.setMessage(_ctx.stringValue("DescribeAggregateFunctionResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAggregateFunctionResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFunction(_ctx.stringValue("DescribeAggregateFunctionResponse.Data["+ i +"].Function"));
			dataItem.setFunctionName(_ctx.stringValue("DescribeAggregateFunctionResponse.Data["+ i +"].FunctionName"));

			data.add(dataItem);
		}
		describeAggregateFunctionResponse.setData(data);
	 
	 	return describeAggregateFunctionResponse;
	}
}