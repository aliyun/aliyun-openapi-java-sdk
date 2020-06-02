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

import com.aliyuncs.cr.model.v20181201.GetRepoSyncTaskResponse;
import com.aliyuncs.cr.model.v20181201.GetRepoSyncTaskResponse.ImageFrom;
import com.aliyuncs.cr.model.v20181201.GetRepoSyncTaskResponse.ImageTo;
import com.aliyuncs.cr.model.v20181201.GetRepoSyncTaskResponse.LayerTasksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRepoSyncTaskResponseUnmarshaller {

	public static GetRepoSyncTaskResponse unmarshall(GetRepoSyncTaskResponse getRepoSyncTaskResponse, UnmarshallerContext _ctx) {
		
		getRepoSyncTaskResponse.setRequestId(_ctx.stringValue("GetRepoSyncTaskResponse.RequestId"));
		getRepoSyncTaskResponse.setIsSuccess(_ctx.booleanValue("GetRepoSyncTaskResponse.IsSuccess"));
		getRepoSyncTaskResponse.setCode(_ctx.stringValue("GetRepoSyncTaskResponse.Code"));
		getRepoSyncTaskResponse.setSyncTaskId(_ctx.stringValue("GetRepoSyncTaskResponse.SyncTaskId"));
		getRepoSyncTaskResponse.setTaskStatus(_ctx.stringValue("GetRepoSyncTaskResponse.TaskStatus"));
		getRepoSyncTaskResponse.setTaskTrigger(_ctx.stringValue("GetRepoSyncTaskResponse.TaskTrigger"));
		getRepoSyncTaskResponse.setSyncRuleId(_ctx.stringValue("GetRepoSyncTaskResponse.SyncRuleId"));
		getRepoSyncTaskResponse.setSyncBatchTaskId(_ctx.stringValue("GetRepoSyncTaskResponse.SyncBatchTaskId"));
		getRepoSyncTaskResponse.setProgress(_ctx.longValue("GetRepoSyncTaskResponse.Progress"));
		getRepoSyncTaskResponse.setSyncedSize(_ctx.longValue("GetRepoSyncTaskResponse.SyncedSize"));

		ImageFrom imageFrom = new ImageFrom();
		imageFrom.setRegionId(_ctx.stringValue("GetRepoSyncTaskResponse.ImageFrom.RegionId"));
		imageFrom.setRepoNamespaceName(_ctx.stringValue("GetRepoSyncTaskResponse.ImageFrom.RepoNamespaceName"));
		imageFrom.setRepoName(_ctx.stringValue("GetRepoSyncTaskResponse.ImageFrom.RepoName"));
		imageFrom.setImageTag(_ctx.stringValue("GetRepoSyncTaskResponse.ImageFrom.ImageTag"));
		imageFrom.setInstanceId(_ctx.stringValue("GetRepoSyncTaskResponse.ImageFrom.InstanceId"));
		getRepoSyncTaskResponse.setImageFrom(imageFrom);

		ImageTo imageTo = new ImageTo();
		imageTo.setRegionId(_ctx.stringValue("GetRepoSyncTaskResponse.ImageTo.RegionId"));
		imageTo.setRepoNamespaceName(_ctx.stringValue("GetRepoSyncTaskResponse.ImageTo.RepoNamespaceName"));
		imageTo.setRepoName(_ctx.stringValue("GetRepoSyncTaskResponse.ImageTo.RepoName"));
		imageTo.setImageTag(_ctx.stringValue("GetRepoSyncTaskResponse.ImageTo.ImageTag"));
		imageTo.setInstanceId(_ctx.stringValue("GetRepoSyncTaskResponse.ImageTo.InstanceId"));
		getRepoSyncTaskResponse.setImageTo(imageTo);

		List<LayerTasksItem> layerTasks = new ArrayList<LayerTasksItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRepoSyncTaskResponse.LayerTasks.Length"); i++) {
			LayerTasksItem layerTasksItem = new LayerTasksItem();
			layerTasksItem.setSyncLayerTaskId(_ctx.stringValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].SyncLayerTaskId"));
			layerTasksItem.setTaskStatus(_ctx.stringValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].TaskStatus"));
			layerTasksItem.setDigest(_ctx.stringValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].Digest"));
			layerTasksItem.setSize(_ctx.longValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].Size"));
			layerTasksItem.setSyncedSize(_ctx.longValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].SyncedSize"));

			layerTasks.add(layerTasksItem);
		}
		getRepoSyncTaskResponse.setLayerTasks(layerTasks);
	 
	 	return getRepoSyncTaskResponse;
	}
}