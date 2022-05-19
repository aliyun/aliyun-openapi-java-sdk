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

package com.aliyuncs.cr.transform.v20181201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cr.model.v20181201.ListRepoSyncTaskResponse;
import com.aliyuncs.cr.model.v20181201.ListRepoSyncTaskResponse.SyncTasksItem;
import com.aliyuncs.cr.model.v20181201.ListRepoSyncTaskResponse.SyncTasksItem.ImageFrom;
import com.aliyuncs.cr.model.v20181201.ListRepoSyncTaskResponse.SyncTasksItem.ImageTo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRepoSyncTaskResponseUnmarshaller {

	public static ListRepoSyncTaskResponse unmarshall(ListRepoSyncTaskResponse listRepoSyncTaskResponse, UnmarshallerContext _ctx) {
		
		listRepoSyncTaskResponse.setRequestId(_ctx.stringValue("ListRepoSyncTaskResponse.RequestId"));
		listRepoSyncTaskResponse.setCode(_ctx.stringValue("ListRepoSyncTaskResponse.Code"));
		listRepoSyncTaskResponse.setPageNo(_ctx.integerValue("ListRepoSyncTaskResponse.PageNo"));
		listRepoSyncTaskResponse.setIsSuccess(_ctx.booleanValue("ListRepoSyncTaskResponse.IsSuccess"));
		listRepoSyncTaskResponse.setPageSize(_ctx.integerValue("ListRepoSyncTaskResponse.PageSize"));
		listRepoSyncTaskResponse.setTotalCount(_ctx.stringValue("ListRepoSyncTaskResponse.TotalCount"));

		List<SyncTasksItem> syncTasks = new ArrayList<SyncTasksItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRepoSyncTaskResponse.SyncTasks.Length"); i++) {
			SyncTasksItem syncTasksItem = new SyncTasksItem();
			syncTasksItem.setModifedTime(_ctx.longValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ModifedTime"));
			syncTasksItem.setSyncRuleId(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].SyncRuleId"));
			syncTasksItem.setSyncTaskId(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].SyncTaskId"));
			syncTasksItem.setTaskStatus(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].TaskStatus"));
			syncTasksItem.setCreateTime(_ctx.longValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].CreateTime"));
			syncTasksItem.setSyncBatchTaskId(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].SyncBatchTaskId"));
			syncTasksItem.setCrossUser(_ctx.booleanValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].CrossUser"));
			syncTasksItem.setSyncTransAccelerate(_ctx.booleanValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].SyncTransAccelerate"));
			syncTasksItem.setTaskTrigger(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].TaskTrigger"));
			syncTasksItem.setCustomLink(_ctx.booleanValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].CustomLink"));

			ImageFrom imageFrom = new ImageFrom();
			imageFrom.setRepoNamespaceName(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ImageFrom.RepoNamespaceName"));
			imageFrom.setInstanceId(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ImageFrom.InstanceId"));
			imageFrom.setImageTag(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ImageFrom.ImageTag"));
			imageFrom.setRepoName(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ImageFrom.RepoName"));
			imageFrom.setRegionId(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ImageFrom.RegionId"));
			syncTasksItem.setImageFrom(imageFrom);

			ImageTo imageTo = new ImageTo();
			imageTo.setRepoNamespaceName(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ImageTo.RepoNamespaceName"));
			imageTo.setInstanceId(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ImageTo.InstanceId"));
			imageTo.setImageTag(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ImageTo.ImageTag"));
			imageTo.setRepoName(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ImageTo.RepoName"));
			imageTo.setRegionId(_ctx.stringValue("ListRepoSyncTaskResponse.SyncTasks["+ i +"].ImageTo.RegionId"));
			syncTasksItem.setImageTo(imageTo);

			syncTasks.add(syncTasksItem);
		}
		listRepoSyncTaskResponse.setSyncTasks(syncTasks);
	 
	 	return listRepoSyncTaskResponse;
	}
}