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

package com.aliyuncs.cloudauth_console.transform.v20190219;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth_console.model.v20190219.DescribeAllEndPointResponse;
import com.aliyuncs.cloudauth_console.model.v20190219.DescribeAllEndPointResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAllEndPointResponseUnmarshaller {

	public static DescribeAllEndPointResponse unmarshall(DescribeAllEndPointResponse describeAllEndPointResponse, UnmarshallerContext _ctx) {
		
		describeAllEndPointResponse.setRequestId(_ctx.stringValue("DescribeAllEndPointResponse.RequestId"));
		describeAllEndPointResponse.setSuccess(_ctx.booleanValue("DescribeAllEndPointResponse.Success"));
		describeAllEndPointResponse.setHttpStatusCode(_ctx.integerValue("DescribeAllEndPointResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAllEndPointResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEndPoint(_ctx.stringValue("DescribeAllEndPointResponse.Data["+ i +"].EndPoint"));
			dataItem.setCityName(_ctx.stringValue("DescribeAllEndPointResponse.Data["+ i +"].CityName"));

			data.add(dataItem);
		}
		describeAllEndPointResponse.setData(data);
	 
	 	return describeAllEndPointResponse;
	}
}