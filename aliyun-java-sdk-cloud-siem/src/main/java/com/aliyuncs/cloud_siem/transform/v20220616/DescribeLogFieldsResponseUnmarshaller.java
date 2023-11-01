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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeLogFieldsResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeLogFieldsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLogFieldsResponseUnmarshaller {

	public static DescribeLogFieldsResponse unmarshall(DescribeLogFieldsResponse describeLogFieldsResponse, UnmarshallerContext _ctx) {
		
		describeLogFieldsResponse.setRequestId(_ctx.stringValue("DescribeLogFieldsResponse.RequestId"));
		describeLogFieldsResponse.setSuccess(_ctx.booleanValue("DescribeLogFieldsResponse.Success"));
		describeLogFieldsResponse.setCode(_ctx.integerValue("DescribeLogFieldsResponse.Code"));
		describeLogFieldsResponse.setMessage(_ctx.stringValue("DescribeLogFieldsResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLogFieldsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFieldName(_ctx.stringValue("DescribeLogFieldsResponse.Data["+ i +"].FieldName"));
			dataItem.setFieldDesc(_ctx.stringValue("DescribeLogFieldsResponse.Data["+ i +"].FieldDesc"));
			dataItem.setLogCode(_ctx.stringValue("DescribeLogFieldsResponse.Data["+ i +"].LogCode"));
			dataItem.setActivityName(_ctx.stringValue("DescribeLogFieldsResponse.Data["+ i +"].ActivityName"));
			dataItem.setFieldType(_ctx.stringValue("DescribeLogFieldsResponse.Data["+ i +"].FieldType"));

			data.add(dataItem);
		}
		describeLogFieldsResponse.setData(data);
	 
	 	return describeLogFieldsResponse;
	}
}