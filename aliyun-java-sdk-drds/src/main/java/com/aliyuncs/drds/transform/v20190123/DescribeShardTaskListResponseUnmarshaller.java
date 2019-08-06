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

import com.aliyuncs.drds.model.v20190123.DescribeShardTaskListResponse;
import com.aliyuncs.drds.model.v20190123.DescribeShardTaskListResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeShardTaskListResponseUnmarshaller {

	public static DescribeShardTaskListResponse unmarshall(DescribeShardTaskListResponse describeShardTaskListResponse, UnmarshallerContext _ctx) {
		
		describeShardTaskListResponse.setRequestId(_ctx.stringValue("DescribeShardTaskListResponse.RequestId"));
		describeShardTaskListResponse.setSuccess(_ctx.booleanValue("DescribeShardTaskListResponse.Success"));
		describeShardTaskListResponse.setPageNumber(_ctx.integerValue("DescribeShardTaskListResponse.PageNumber"));
		describeShardTaskListResponse.setPageSize(_ctx.integerValue("DescribeShardTaskListResponse.PageSize"));
		describeShardTaskListResponse.setTotal(_ctx.integerValue("DescribeShardTaskListResponse.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeShardTaskListResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setSourceTableName(_ctx.stringValue("DescribeShardTaskListResponse.List["+ i +"].SourceTableName"));
			listItem.setTargetTableName(_ctx.stringValue("DescribeShardTaskListResponse.List["+ i +"].TargetTableName"));
			listItem.setExpired(_ctx.stringValue("DescribeShardTaskListResponse.List["+ i +"].Expired"));
			listItem.setExpired1(_ctx.longValue("DescribeShardTaskListResponse.List["+ i +"].Expired"));
			listItem.setStage(_ctx.integerValue("DescribeShardTaskListResponse.List["+ i +"].Stage"));
			listItem.setProgress(_ctx.integerValue("DescribeShardTaskListResponse.List["+ i +"].Progress"));
			listItem.setDelay(_ctx.integerValue("DescribeShardTaskListResponse.List["+ i +"].Delay"));

			list.add(listItem);
		}
		describeShardTaskListResponse.setList(list);
	 
	 	return describeShardTaskListResponse;
	}
}