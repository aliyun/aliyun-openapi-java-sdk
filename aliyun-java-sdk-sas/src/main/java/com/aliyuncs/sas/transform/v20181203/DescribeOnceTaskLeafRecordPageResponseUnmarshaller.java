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

import com.aliyuncs.sas.model.v20181203.DescribeOnceTaskLeafRecordPageResponse;
import com.aliyuncs.sas.model.v20181203.DescribeOnceTaskLeafRecordPageResponse.OnceTasksItem;
import com.aliyuncs.sas.model.v20181203.DescribeOnceTaskLeafRecordPageResponse.OnceTasksItem.TaskImageInfo;
import com.aliyuncs.sas.model.v20181203.DescribeOnceTaskLeafRecordPageResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeOnceTaskLeafRecordPageResponseUnmarshaller {

	public static DescribeOnceTaskLeafRecordPageResponse unmarshall(DescribeOnceTaskLeafRecordPageResponse describeOnceTaskLeafRecordPageResponse, UnmarshallerContext _ctx) {
		
		describeOnceTaskLeafRecordPageResponse.setRequestId(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("DescribeOnceTaskLeafRecordPageResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("DescribeOnceTaskLeafRecordPageResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("DescribeOnceTaskLeafRecordPageResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("DescribeOnceTaskLeafRecordPageResponse.PageInfo.Count"));
		describeOnceTaskLeafRecordPageResponse.setPageInfo(pageInfo);

		List<OnceTasksItem> onceTasks = new ArrayList<OnceTasksItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks.Length"); i++) {
			OnceTasksItem onceTasksItem = new OnceTasksItem();
			onceTasksItem.setStatus(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].Status"));
			onceTasksItem.setStatusText(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].StatusText"));
			onceTasksItem.setProgress(_ctx.longValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].Progress"));
			onceTasksItem.setRealRunTime(_ctx.longValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].RealRunTime"));
			onceTasksItem.setTaskName(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskName"));
			onceTasksItem.setFinish(_ctx.integerValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].Finish"));
			onceTasksItem.setTotalCount(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TotalCount"));
			onceTasksItem.setEndTime(_ctx.longValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].EndTime"));
			onceTasksItem.setTaskType(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskType"));
			onceTasksItem.setStartTime(_ctx.longValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].StartTime"));
			onceTasksItem.setResultInfo(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].ResultInfo"));
			onceTasksItem.setTarget(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].Target"));
			onceTasksItem.setTaskId(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskId"));
			onceTasksItem.setFinishCount(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].FinishCount"));
			onceTasksItem.setTargetType(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TargetType"));

			TaskImageInfo taskImageInfo = new TaskImageInfo();
			taskImageInfo.setRepoId(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.RepoId"));
			taskImageInfo.setDigest(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.Digest"));
			taskImageInfo.setTag(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.Tag"));
			taskImageInfo.setRepoRegionId(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.RepoRegionId"));
			taskImageInfo.setRepoName(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.RepoName"));
			taskImageInfo.setRepoNamespace(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.RepoNamespace"));
			taskImageInfo.setRegionId(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.RegionId"));
			taskImageInfo.setImage(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.Image"));
			taskImageInfo.setPod(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.Pod"));
			taskImageInfo.setAppName(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.AppName"));
			taskImageInfo.setNodeName(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.NodeName"));
			taskImageInfo.setNodeIp(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.NodeIp"));
			taskImageInfo.setNodeInstanceId(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.NodeInstanceId"));
			taskImageInfo.setClusterId(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.ClusterId"));
			taskImageInfo.setClusterName(_ctx.stringValue("DescribeOnceTaskLeafRecordPageResponse.OnceTasks["+ i +"].TaskImageInfo.ClusterName"));
			onceTasksItem.setTaskImageInfo(taskImageInfo);

			onceTasks.add(onceTasksItem);
		}
		describeOnceTaskLeafRecordPageResponse.setOnceTasks(onceTasks);
	 
	 	return describeOnceTaskLeafRecordPageResponse;
	}
}