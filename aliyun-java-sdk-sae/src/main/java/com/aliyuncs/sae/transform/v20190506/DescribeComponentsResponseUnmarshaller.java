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

import com.aliyuncs.sae.model.v20190506.DescribeComponentsResponse;
import com.aliyuncs.sae.model.v20190506.DescribeComponentsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeComponentsResponseUnmarshaller {

	public static DescribeComponentsResponse unmarshall(DescribeComponentsResponse describeComponentsResponse, UnmarshallerContext _ctx) {
		
		describeComponentsResponse.setRequestId(_ctx.stringValue("DescribeComponentsResponse.RequestId"));
		describeComponentsResponse.setCode(_ctx.stringValue("DescribeComponentsResponse.Code"));
		describeComponentsResponse.setErrorCode(_ctx.stringValue("DescribeComponentsResponse.ErrorCode"));
		describeComponentsResponse.setMessage(_ctx.stringValue("DescribeComponentsResponse.Message"));
		describeComponentsResponse.setSuccess(_ctx.booleanValue("DescribeComponentsResponse.Success"));
		describeComponentsResponse.setTraceId(_ctx.stringValue("DescribeComponentsResponse.TraceId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeComponentsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setComponentKey(_ctx.stringValue("DescribeComponentsResponse.Data["+ i +"].ComponentKey"));
			dataItem.setComponentDescription(_ctx.stringValue("DescribeComponentsResponse.Data["+ i +"].ComponentDescription"));
			dataItem.setExpired(_ctx.booleanValue("DescribeComponentsResponse.Data["+ i +"].Expired"));
			dataItem.setType(_ctx.stringValue("DescribeComponentsResponse.Data["+ i +"].Type"));

			data.add(dataItem);
		}
		describeComponentsResponse.setData(data);
	 
	 	return describeComponentsResponse;
	}
}