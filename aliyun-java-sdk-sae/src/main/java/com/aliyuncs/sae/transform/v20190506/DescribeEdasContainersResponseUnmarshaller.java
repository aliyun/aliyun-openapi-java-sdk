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

import com.aliyuncs.sae.model.v20190506.DescribeEdasContainersResponse;
import com.aliyuncs.sae.model.v20190506.DescribeEdasContainersResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEdasContainersResponseUnmarshaller {

	public static DescribeEdasContainersResponse unmarshall(DescribeEdasContainersResponse describeEdasContainersResponse, UnmarshallerContext _ctx) {
		
		describeEdasContainersResponse.setRequestId(_ctx.stringValue("DescribeEdasContainersResponse.RequestId"));
		describeEdasContainersResponse.setCode(_ctx.stringValue("DescribeEdasContainersResponse.Code"));
		describeEdasContainersResponse.setMessage(_ctx.stringValue("DescribeEdasContainersResponse.Message"));
		describeEdasContainersResponse.setSuccess(_ctx.booleanValue("DescribeEdasContainersResponse.Success"));
		describeEdasContainersResponse.setErrorCode(_ctx.stringValue("DescribeEdasContainersResponse.ErrorCode"));
		describeEdasContainersResponse.setTraceId(_ctx.stringValue("DescribeEdasContainersResponse.TraceId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEdasContainersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDisabled(_ctx.booleanValue("DescribeEdasContainersResponse.Data["+ i +"].Disabled"));
			dataItem.setEdasContainerVersion(_ctx.stringValue("DescribeEdasContainersResponse.Data["+ i +"].EdasContainerVersion"));

			data.add(dataItem);
		}
		describeEdasContainersResponse.setData(data);
	 
	 	return describeEdasContainersResponse;
	}
}