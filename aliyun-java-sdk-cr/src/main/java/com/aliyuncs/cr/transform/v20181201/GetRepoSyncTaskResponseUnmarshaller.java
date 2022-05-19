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
		getRepoSyncTaskResponse.setSyncRuleId(_ctx.stringValue("GetRepoSyncTaskResponse.SyncRuleId"));
		getRepoSyncTaskResponse.setProgress(_ctx.longValue("GetRepoSyncTaskResponse.Progress"));
		getRepoSyncTaskResponse.setSyncedSize(_ctx.longValue("GetRepoSyncTaskResponse.SyncedSize"));
		getRepoSyncTaskResponse.setTaskStatus(_ctx.stringValue("GetRepoSyncTaskResponse.TaskStatus"));
		getRepoSyncTaskResponse.setSyncTransAccelerate(_ctx.booleanValue("GetRepoSyncTaskResponse.SyncTransAccelerate"));
		getRepoSyncTaskResponse.setCrossUser(_ctx.booleanValue("GetRepoSyncTaskResponse.CrossUser"));
		getRepoSyncTaskResponse.setSyncTaskId(_ctx.stringValue("GetRepoSyncTaskResponse.SyncTaskId"));
		getRepoSyncTaskResponse.setSyncBatchTaskId(_ctx.stringValue("GetRepoSyncTaskResponse.SyncBatchTaskId"));
		getRepoSyncTaskResponse.setCode(_ctx.stringValue("GetRepoSyncTaskResponse.Code"));
		getRepoSyncTaskResponse.setIsSuccess(_ctx.booleanValue("GetRepoSyncTaskResponse.IsSuccess"));
		getRepoSyncTaskResponse.setTaskTrigger(_ctx.stringValue("GetRepoSyncTaskResponse.TaskTrigger"));

		ImageFrom imageFrom = new ImageFrom();
		imageFrom.setRepoNamespaceName(_ctx.stringValue("GetRepoSyncTaskResponse.ImageFrom.RepoNamespaceName"));
		imageFrom.setInstanceId(_ctx.stringValue("GetRepoSyncTaskResponse.ImageFrom.InstanceId"));
		imageFrom.setImageTag(_ctx.stringValue("GetRepoSyncTaskResponse.ImageFrom.ImageTag"));
		imageFrom.setRepoName(_ctx.stringValue("GetRepoSyncTaskResponse.ImageFrom.RepoName"));
		imageFrom.setRegionId(_ctx.stringValue("GetRepoSyncTaskResponse.ImageFrom.RegionId"));
		getRepoSyncTaskResponse.setImageFrom(imageFrom);

		ImageTo imageTo = new ImageTo();
		imageTo.setRepoNamespaceName(_ctx.stringValue("GetRepoSyncTaskResponse.ImageTo.RepoNamespaceName"));
		imageTo.setInstanceId(_ctx.stringValue("GetRepoSyncTaskResponse.ImageTo.InstanceId"));
		imageTo.setImageTag(_ctx.stringValue("GetRepoSyncTaskResponse.ImageTo.ImageTag"));
		imageTo.setRepoName(_ctx.stringValue("GetRepoSyncTaskResponse.ImageTo.RepoName"));
		imageTo.setRegionId(_ctx.stringValue("GetRepoSyncTaskResponse.ImageTo.RegionId"));
		getRepoSyncTaskResponse.setImageTo(imageTo);

		List<LayerTasksItem> layerTasks = new ArrayList<LayerTasksItem>();
		for (int i = 0; i < _ctx.lengthValue("GetRepoSyncTaskResponse.LayerTasks.Length"); i++) {
			LayerTasksItem layerTasksItem = new LayerTasksItem();
			layerTasksItem.setTaskStatus(_ctx.stringValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].TaskStatus"));
			layerTasksItem.setDigest(_ctx.stringValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].Digest"));
			layerTasksItem.setSyncedSize(_ctx.longValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].SyncedSize"));
			layerTasksItem.setSize(_ctx.longValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].Size"));
			layerTasksItem.setSyncLayerTaskId(_ctx.stringValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].SyncLayerTaskId"));
			layerTasksItem.setArtifactDigest(_ctx.stringValue("GetRepoSyncTaskResponse.LayerTasks["+ i +"].ArtifactDigest"));

			layerTasks.add(layerTasksItem);
		}
		getRepoSyncTaskResponse.setLayerTasks(layerTasks);
	 
	 	return getRepoSyncTaskResponse;
	}
}