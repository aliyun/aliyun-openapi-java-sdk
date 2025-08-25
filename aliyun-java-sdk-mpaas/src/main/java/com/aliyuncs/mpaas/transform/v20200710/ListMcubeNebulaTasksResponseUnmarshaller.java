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

package com.aliyuncs.mpaas.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpaas.model.v20200710.ListMcubeNebulaTasksResponse;
import com.aliyuncs.mpaas.model.v20200710.ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult;
import com.aliyuncs.mpaas.model.v20200710.ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeNebulaTasksResponseUnmarshaller {

	public static ListMcubeNebulaTasksResponse unmarshall(ListMcubeNebulaTasksResponse listMcubeNebulaTasksResponse, UnmarshallerContext _ctx) {
		
		listMcubeNebulaTasksResponse.setRequestId(_ctx.stringValue("ListMcubeNebulaTasksResponse.RequestId"));
		listMcubeNebulaTasksResponse.setResultMessage(_ctx.stringValue("ListMcubeNebulaTasksResponse.ResultMessage"));
		listMcubeNebulaTasksResponse.setResultCode(_ctx.stringValue("ListMcubeNebulaTasksResponse.ResultCode"));

		ListMcubeNebulaTaskResult listMcubeNebulaTaskResult = new ListMcubeNebulaTaskResult();
		listMcubeNebulaTaskResult.setRequestId(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.RequestId"));
		listMcubeNebulaTaskResult.setErrorCode(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.ErrorCode"));
		listMcubeNebulaTaskResult.setSuccess(_ctx.booleanValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.Success"));
		listMcubeNebulaTaskResult.setResultMsg(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.ResultMsg"));

		List<NebulaTaskInfoItem> nebulaTaskInfo = new ArrayList<NebulaTaskInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo.Length"); i++) {
			NebulaTaskInfoItem nebulaTaskInfoItem = new NebulaTaskInfoItem();
			nebulaTaskInfoItem.setStatus(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Status"));
			nebulaTaskInfoItem.setPercent(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Percent"));
			nebulaTaskInfoItem.setPublishMode(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].PublishMode"));
			nebulaTaskInfoItem.setTaskName(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].TaskName"));
			nebulaTaskInfoItem.setGreyEndtime(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyEndtime"));
			nebulaTaskInfoItem.setGmtModified(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GmtModified"));
			nebulaTaskInfoItem.setGreyEndtimeStr(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyEndtimeStr"));
			nebulaTaskInfoItem.setCreator(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Creator"));
			nebulaTaskInfoItem.setBizType(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].BizType"));
			nebulaTaskInfoItem.setTaskType(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].TaskType"));
			nebulaTaskInfoItem.setModifier(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Modifier"));
			nebulaTaskInfoItem.setPlatform(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Platform"));
			nebulaTaskInfoItem.setProductId(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].ProductId"));
			nebulaTaskInfoItem.setReleaseVersion(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].ReleaseVersion"));
			nebulaTaskInfoItem.setGmtModifiedStr(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GmtModifiedStr"));
			nebulaTaskInfoItem.setTaskVersion(_ctx.longValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].TaskVersion"));
			nebulaTaskInfoItem.setUpgradeNoticeNum(_ctx.longValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].UpgradeNoticeNum"));
			nebulaTaskInfoItem.setAppCode(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].AppCode"));
			nebulaTaskInfoItem.setMemo(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Memo"));
			nebulaTaskInfoItem.setGreyConfigInfo(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyConfigInfo"));
			nebulaTaskInfoItem.setGreyNum(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyNum"));
			nebulaTaskInfoItem.setProductVersion(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].ProductVersion"));
			nebulaTaskInfoItem.setGreyEndtimeData(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyEndtimeData"));
			nebulaTaskInfoItem.setPublishType(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].PublishType"));
			nebulaTaskInfoItem.setGreyUrl(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GreyUrl"));
			nebulaTaskInfoItem.setTaskStatus(_ctx.integerValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].TaskStatus"));
			nebulaTaskInfoItem.setSyncResult(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].SyncResult"));
			nebulaTaskInfoItem.setWhitelistIds(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].WhitelistIds"));
			nebulaTaskInfoItem.setGmtCreate(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].GmtCreate"));
			nebulaTaskInfoItem.setPackageId(_ctx.longValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].PackageId"));
			nebulaTaskInfoItem.setUpgradeProgress(_ctx.stringValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].UpgradeProgress"));
			nebulaTaskInfoItem.setId(_ctx.longValue("ListMcubeNebulaTasksResponse.ListMcubeNebulaTaskResult.NebulaTaskInfo["+ i +"].Id"));

			nebulaTaskInfo.add(nebulaTaskInfoItem);
		}
		listMcubeNebulaTaskResult.setNebulaTaskInfo(nebulaTaskInfo);
		listMcubeNebulaTasksResponse.setListMcubeNebulaTaskResult(listMcubeNebulaTaskResult);
	 
	 	return listMcubeNebulaTasksResponse;
	}
}