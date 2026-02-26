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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeLogTypeResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeLogTypeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogTypeResponseUnmarshaller {

	public static DescribeLogTypeResponse unmarshall(DescribeLogTypeResponse describeLogTypeResponse, UnmarshallerContext _ctx) {
		
		describeLogTypeResponse.setRequestId(_ctx.stringValue("DescribeLogTypeResponse.RequestId"));
		describeLogTypeResponse.setSuccess(_ctx.booleanValue("DescribeLogTypeResponse.Success"));
		describeLogTypeResponse.setCode(_ctx.integerValue("DescribeLogTypeResponse.Code"));
		describeLogTypeResponse.setMessage(_ctx.stringValue("DescribeLogTypeResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogTypeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setLogType(_ctx.stringValue("DescribeLogTypeResponse.Data["+ i +"].LogType"));
			dataItem.setLogTypeName(_ctx.stringValue("DescribeLogTypeResponse.Data["+ i +"].LogTypeName"));

			data.add(dataItem);
		}
		describeLogTypeResponse.setData(data);
	 
	 	return describeLogTypeResponse;
	}
}