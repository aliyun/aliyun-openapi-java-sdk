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

package com.aliyuncs.mpaas.transform.v20201028;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20201028.ListMcubeNebulaTasksResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeNebulaTasksResponseUnmarshaller {

	public static ListMcubeNebulaTasksResponse unmarshall(ListMcubeNebulaTasksResponse listMcubeNebulaTasksResponse, UnmarshallerContext _ctx) {
		
		listMcubeNebulaTasksResponse.setRequestId(_ctx.stringValue("ListMcubeNebulaTasksResponse.RequestId"));
		listMcubeNebulaTasksResponse.setResultCode(_ctx.stringValue("ListMcubeNebulaTasksResponse.ResultCode"));
		listMcubeNebulaTasksResponse.setResultMessage(_ctx.stringValue("ListMcubeNebulaTasksResponse.ResultMessage"));

		ListMcubeNebulaTaskResult listMcubeNebulaTaskResult = new ListMcubeNebulaTaskResult();
		listMcubeNebulaTaskResult.setErrorCode(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.ErrorCode"));
		listMcubeNebulaTaskResult.setResultMsg(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.ResultMsg"));
		listMcubeNebulaTaskResult.setSuccess(_ctx.booleanValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.Success"));
		listMcubeNebulaTaskResult.setRequestId(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.RequestId"));

		List<NebulaTaskInfoItem> nebulaTaskInfo = new ArrayList<NebulaTaskInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo.Length"); i++) {
			NebulaTaskInfoItem nebulaTaskInfoItem = new NebulaTaskInfoItem();
			nebulaTaskInfoItem.setId(_ctx.longValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Id"));
			nebulaTaskInfoItem.setGreyEndtimeData(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyEndtimeData"));
			nebulaTaskInfoItem.setGmtModifiedStr(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GmtModifiedStr"));
			nebulaTaskInfoItem.setTaskStatus(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].TaskStatus"));
			nebulaTaskInfoItem.setProductVersion(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].ProductVersion"));
			nebulaTaskInfoItem.setTaskType(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].TaskType"));
			nebulaTaskInfoItem.setGreyNum(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyNum"));
			nebulaTaskInfoItem.setAppCode(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].AppCode"));
			nebulaTaskInfoItem.setSyncResult(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].SyncResult"));
			nebulaTaskInfoItem.setPublishMode(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].PublishMode"));
			nebulaTaskInfoItem.setMemo(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Memo"));
			nebulaTaskInfoItem.setPlatform(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Platform"));
			nebulaTaskInfoItem.setPercent(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Percent"));
			nebulaTaskInfoItem.setGmtModified(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GmtModified"));
			nebulaTaskInfoItem.setBizType(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].BizType"));
			nebulaTaskInfoItem.setUpgradeProgress(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].UpgradeProgress"));
			nebulaTaskInfoItem.setModifier(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Modifier"));
			nebulaTaskInfoItem.setTaskName(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].TaskName"));
			nebulaTaskInfoItem.setStatus(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Status"));
			nebulaTaskInfoItem.setWhitelistIds(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].WhitelistIds"));
			nebulaTaskInfoItem.setGreyEndtimeStr(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyEndtimeStr"));
			nebulaTaskInfoItem.setPublishType(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].PublishType"));
			nebulaTaskInfoItem.setPackageId(_ctx.longValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].PackageId"));
			nebulaTaskInfoItem.setGreyEndtime(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyEndtime"));
			nebulaTaskInfoItem.setUpgradeNoticeNum(_ctx.longValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].UpgradeNoticeNum"));
			nebulaTaskInfoItem.setGreyConfigInfo(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyConfigInfo"));
			nebulaTaskInfoItem.setGmtCreate(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GmtCreate"));
			nebulaTaskInfoItem.setTaskVersion(_ctx.longValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].TaskVersion"));
			nebulaTaskInfoItem.setCreator(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Creator"));
			nebulaTaskInfoItem.setGreyUrl(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyUrl"));
			nebulaTaskInfoItem.setReleaseVersion(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].ReleaseVersion"));
			nebulaTaskInfoItem.setProductId(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].ProductId"));

			nebulaTaskInfo.add(nebulaTaskInfoItem);
		}
		listMcubeNebulaTaskResult.setNebulaTaskInfo(nebulaTaskInfo);
		listMcubeNebulaTasksResponse.setListMcubeNebulaTaskResult(listMcubeNebulaTaskResult);
	 
	 	return listMcubeNebulaTasksResponse;
	}
}