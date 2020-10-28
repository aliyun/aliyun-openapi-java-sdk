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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeTableDetailResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeTableDetailResponse.Data;
import com.aliyuncs.polardbx.model.v20200202.DescribeTableDetailResponse.Data.Field;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTableDetailResponseUnmarshaller {

	public static DescribeTableDetailResponse unmarshall(DescribeTableDetailResponse describeTableDetailResponse, UnmarshallerContext _ctx) {
		
		describeTableDetailResponse.setRequestId(_ctx.stringValue("DescribeTableDetailResponse.RequestId"));
		describeTableDetailResponse.setSuccess(_ctx.booleanValue("DescribeTableDetailResponse.Success"));
		describeTableDetailResponse.setMessage(_ctx.stringValue("DescribeTableDetailResponse.Message"));

		Data data = new Data();

		List<Field> fields = new ArrayList<Field>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTableDetailResponse.Data.Fields.Length"); i++) {
			Field field = new Field();
			field.setColumn(_ctx.stringValue("DescribeTableDetailResponse.Data.Fields["+ i +"].Column"));
			field.setDataType(_ctx.stringValue("DescribeTableDetailResponse.Data.Fields["+ i +"].DataType"));
			field.setKey(_ctx.stringValue("DescribeTableDetailResponse.Data.Fields["+ i +"].Key"));
			field.setExtra(_ctx.stringValue("DescribeTableDetailResponse.Data.Fields["+ i +"].Extra"));

			fields.add(field);
		}
		data.setFields(fields);
		describeTableDetailResponse.setData(data);
	 
	 	return describeTableDetailResponse;
	}
}