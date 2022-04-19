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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeImageFixTaskResponse;
import com.aliyuncs.sas.model.v20181203.DescribeImageFixTaskResponse.BuildTask;
import com.aliyuncs.sas.model.v20181203.DescribeImageFixTaskResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageFixTaskResponseUnmarshaller {

	public static DescribeImageFixTaskResponse unmarshall(DescribeImageFixTaskResponse describeImageFixTaskResponse, UnmarshallerContext _ctx) {
		
		describeImageFixTaskResponse.setRequestId(_ctx.stringValue("DescribeImageFixTaskResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeImageFixTaskResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeImageFixTaskResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeImageFixTaskResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeImageFixTaskResponse.PageInfo.Count"));
		describeImageFixTaskResponse.setPageInfo(pageInfo);

		List<BuildTask> buildTasks = new ArrayList<BuildTask>();
		for (int i = 0; i < _ctx.lengthValue("DescribeImageFixTaskResponse.BuildTasks.Length"); i++) {
			BuildTask buildTask = new BuildTask();
			buildTask.setBuildTaskId(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].BuildTaskId"));
			buildTask.setTaskType(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].TaskType"));
			buildTask.setRepoNamespace(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].RepoNamespace"));
			buildTask.setRepoName(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].RepoName"));
			buildTask.setRegionId(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].RegionId"));
			buildTask.setOldTag(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].OldTag"));
			buildTask.setOldUuid(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].OldUuid"));
			buildTask.setNewTag(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].NewTag"));
			buildTask.setNewUuid(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].NewUuid"));
			buildTask.setFixTime(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].FixTime"));
			buildTask.setFinishTime(_ctx.stringValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].FinishTime"));
			buildTask.setStatus(_ctx.integerValue("DescribeImageFixTaskResponse.BuildTasks["+ i +"].Status"));

			buildTasks.add(buildTask);
		}
		describeImageFixTaskResponse.setBuildTasks(buildTasks);
	 
	 	return describeImageFixTaskResponse;
	}
}