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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeActiveOperationTaskTypeResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeActiveOperationTaskTypeResponse.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActiveOperationTaskTypeResponseUnmarshaller {

	public static DescribeActiveOperationTaskTypeResponse unmarshall(DescribeActiveOperationTaskTypeResponse describeActiveOperationTaskTypeResponse, UnmarshallerContext _ctx) {
		
		describeActiveOperationTaskTypeResponse.setRequestId(_ctx.stringValue("DescribeActiveOperationTaskTypeResponse.RequestId"));

		List<Items> typeList = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActiveOperationTaskTypeResponse.TypeList.Length"); i++) {
			Items items = new Items();
			items.setTaskType(_ctx.stringValue("DescribeActiveOperationTaskTypeResponse.TypeList["+ i +"].TaskType"));
			items.setCount(_ctx.integerValue("DescribeActiveOperationTaskTypeResponse.TypeList["+ i +"].Count"));

			typeList.add(items);
		}
		describeActiveOperationTaskTypeResponse.setTypeList(typeList);
	 
	 	return describeActiveOperationTaskTypeResponse;
	}
}