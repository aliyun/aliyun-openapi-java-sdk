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

package com.aliyuncs.ros.transform.v20190910;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListStacksResponse;
import com.aliyuncs.ros.model.v20190910.ListStacksResponse.Stack;
import com.aliyuncs.ros.model.v20190910.ListStacksResponse.Stack.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStacksResponseUnmarshaller {

	public static ListStacksResponse unmarshall(ListStacksResponse listStacksResponse, UnmarshallerContext _ctx) {
		
		listStacksResponse.setRequestId(_ctx.stringValue("ListStacksResponse.RequestId"));
		listStacksResponse.setTotalCount(_ctx.integerValue("ListStacksResponse.TotalCount"));
		listStacksResponse.setPageSize(_ctx.integerValue("ListStacksResponse.PageSize"));
		listStacksResponse.setPageNumber(_ctx.integerValue("ListStacksResponse.PageNumber"));

		List<Stack> stacks = new ArrayList<Stack>();
		for (int i = 0; i < _ctx.lengthValue("ListStacksResponse.Stacks.Length"); i++) {
			Stack stack = new Stack();
			stack.setStatus(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].Status"));
			stack.setResourceGroupId(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].ResourceGroupId"));
			stack.setParentStackId(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].ParentStackId"));
			stack.setStatusReason(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].StatusReason"));
			stack.setCreateTime(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].CreateTime"));
			stack.setStackType(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].StackType"));
			stack.setUpdateTime(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].UpdateTime"));
			stack.setDriftDetectionTime(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].DriftDetectionTime"));
			stack.setRegionId(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].RegionId"));
			stack.setStackDriftStatus(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].StackDriftStatus"));
			stack.setStackName(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].StackName"));
			stack.setDisableRollback(_ctx.booleanValue("ListStacksResponse.Stacks["+ i +"].DisableRollback"));
			stack.setStackId(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].StackId"));
			stack.setTimeoutInMinutes(_ctx.integerValue("ListStacksResponse.Stacks["+ i +"].TimeoutInMinutes"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListStacksResponse.Stacks["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("ListStacksResponse.Stacks["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			stack.setTags(tags);

			stacks.add(stack);
		}
		listStacksResponse.setStacks(stacks);
	 
	 	return listStacksResponse;
	}
}