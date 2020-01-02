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

package com.aliyuncs.nas.transform.v20170626;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.nas.model.v20170626.DescribeAutoSnapshotTasksResponse;
import com.aliyuncs.nas.model.v20170626.DescribeAutoSnapshotTasksResponse.AutoSnapshotTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoSnapshotTasksResponseUnmarshaller {

	public static DescribeAutoSnapshotTasksResponse unmarshall(DescribeAutoSnapshotTasksResponse describeAutoSnapshotTasksResponse, UnmarshallerContext _ctx) {
		
		describeAutoSnapshotTasksResponse.setRequestId(_ctx.stringValue("DescribeAutoSnapshotTasksResponse.RequestId"));
		describeAutoSnapshotTasksResponse.setTotalCount(_ctx.integerValue("DescribeAutoSnapshotTasksResponse.TotalCount"));
		describeAutoSnapshotTasksResponse.setPageSize(_ctx.integerValue("DescribeAutoSnapshotTasksResponse.PageSize"));
		describeAutoSnapshotTasksResponse.setPageNumber(_ctx.integerValue("DescribeAutoSnapshotTasksResponse.PageNumber"));

		List<AutoSnapshotTask> autoSnapshotTasks = new ArrayList<AutoSnapshotTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoSnapshotTasksResponse.AutoSnapshotTasks.Length"); i++) {
			AutoSnapshotTask autoSnapshotTask = new AutoSnapshotTask();
			autoSnapshotTask.setSourceFileSystemId(_ctx.stringValue("DescribeAutoSnapshotTasksResponse.AutoSnapshotTasks["+ i +"].SourceFileSystemId"));
			autoSnapshotTask.setAutoSnapshotPolicyId(_ctx.stringValue("DescribeAutoSnapshotTasksResponse.AutoSnapshotTasks["+ i +"].AutoSnapshotPolicyId"));

			autoSnapshotTasks.add(autoSnapshotTask);
		}
		describeAutoSnapshotTasksResponse.setAutoSnapshotTasks(autoSnapshotTasks);
	 
	 	return describeAutoSnapshotTasksResponse;
	}
}