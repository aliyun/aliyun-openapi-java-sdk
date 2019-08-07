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

package com.aliyuncs.webplus.transform.v20190320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.webplus.model.v20190320.DescribeStacksResponse;
import com.aliyuncs.webplus.model.v20190320.DescribeStacksResponse.Stack;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStacksResponseUnmarshaller {

	public static DescribeStacksResponse unmarshall(DescribeStacksResponse describeStacksResponse, UnmarshallerContext _ctx) {
		
		describeStacksResponse.setRequestId(_ctx.stringValue("DescribeStacksResponse.RequestId"));
		describeStacksResponse.setCode(_ctx.stringValue("DescribeStacksResponse.Code"));
		describeStacksResponse.setMessage(_ctx.stringValue("DescribeStacksResponse.Message"));
		describeStacksResponse.setPageNumber(_ctx.integerValue("DescribeStacksResponse.PageNumber"));
		describeStacksResponse.setPageSize(_ctx.integerValue("DescribeStacksResponse.PageSize"));
		describeStacksResponse.setTotalCount(_ctx.integerValue("DescribeStacksResponse.TotalCount"));

		List<Stack> stacks = new ArrayList<Stack>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStacksResponse.Stacks.Length"); i++) {
			Stack stack = new Stack();
			stack.setStackId(_ctx.stringValue("DescribeStacksResponse.Stacks["+ i +"].StackId"));
			stack.setStackName(_ctx.stringValue("DescribeStacksResponse.Stacks["+ i +"].StackName"));
			stack.setCategoryName(_ctx.stringValue("DescribeStacksResponse.Stacks["+ i +"].CategoryName"));
			stack.setRecommendedStack(_ctx.booleanValue("DescribeStacksResponse.Stacks["+ i +"].RecommendedStack"));
			stack.setLatestStack(_ctx.booleanValue("DescribeStacksResponse.Stacks["+ i +"].LatestStack"));
			stack.setVersionCode(_ctx.integerValue("DescribeStacksResponse.Stacks["+ i +"].VersionCode"));
			stack.setCreateTime(_ctx.longValue("DescribeStacksResponse.Stacks["+ i +"].CreateTime"));
			stack.setUpdateTime(_ctx.longValue("DescribeStacksResponse.Stacks["+ i +"].UpdateTime"));

			stacks.add(stack);
		}
		describeStacksResponse.setStacks(stacks);
	 
	 	return describeStacksResponse;
	}
}