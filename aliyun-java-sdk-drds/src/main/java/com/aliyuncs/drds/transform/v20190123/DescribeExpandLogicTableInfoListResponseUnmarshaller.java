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

import com.aliyuncs.drds.model.v20190123.DescribeExpandLogicTableInfoListResponse;
import com.aliyuncs.drds.model.v20190123.DescribeExpandLogicTableInfoListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExpandLogicTableInfoListResponseUnmarshaller {

	public static DescribeExpandLogicTableInfoListResponse unmarshall(DescribeExpandLogicTableInfoListResponse describeExpandLogicTableInfoListResponse, UnmarshallerContext _ctx) {
		
		describeExpandLogicTableInfoListResponse.setRequestId(_ctx.stringValue("DescribeExpandLogicTableInfoListResponse.RequestId"));
		describeExpandLogicTableInfoListResponse.setSuccess(_ctx.booleanValue("DescribeExpandLogicTableInfoListResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExpandLogicTableInfoListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTableName(_ctx.stringValue("DescribeExpandLogicTableInfoListResponse.Data["+ i +"].TableName"));
			dataItem.setShardDbKey(_ctx.stringValue("DescribeExpandLogicTableInfoListResponse.Data["+ i +"].ShardDbKey"));
			dataItem.setShardTbKey(_ctx.stringValue("DescribeExpandLogicTableInfoListResponse.Data["+ i +"].ShardTbKey"));

			data.add(dataItem);
		}
		describeExpandLogicTableInfoListResponse.setData(data);
	 
	 	return describeExpandLogicTableInfoListResponse;
	}
}