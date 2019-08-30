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

package com.aliyuncs.drds.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.drds.model.v20190123.DescribeRecycleBinTablesResponse;
import com.aliyuncs.drds.model.v20190123.DescribeRecycleBinTablesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecycleBinTablesResponseUnmarshaller {

	public static DescribeRecycleBinTablesResponse unmarshall(DescribeRecycleBinTablesResponse describeRecycleBinTablesResponse, UnmarshallerContext _ctx) {
		
		describeRecycleBinTablesResponse.setRequestId(_ctx.stringValue("DescribeRecycleBinTablesResponse.RequestId"));
		describeRecycleBinTablesResponse.setSuccess(_ctx.booleanValue("DescribeRecycleBinTablesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecycleBinTablesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTableName(_ctx.stringValue("DescribeRecycleBinTablesResponse.Data["+ i +"].TableName"));
			dataItem.setOriginalTableName(_ctx.stringValue("DescribeRecycleBinTablesResponse.Data["+ i +"].OriginalTableName"));
			dataItem.setCreateTime(_ctx.stringValue("DescribeRecycleBinTablesResponse.Data["+ i +"].CreateTime"));

			data.add(dataItem);
		}
		describeRecycleBinTablesResponse.setData(data);
	 
	 	return describeRecycleBinTablesResponse;
	}
}