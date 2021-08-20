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

import com.aliyuncs.mpaas.model.v20201028.ListMcubeUpgradeTasksResponse;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeUpgradeTasksResponse.ListTaskResult;
import com.aliyuncs.mpaas.model.v20201028.ListMcubeUpgradeTasksResponse.ListTaskResult.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMcubeUpgradeTasksResponseUnmarshaller {

	public static ListMcubeUpgradeTasksResponse unmarshall(ListMcubeUpgradeTasksResponse listMcubeUpgradeTasksResponse, UnmarshallerContext _ctx) {
		
		listMcubeUpgradeTasksResponse.setRequestId(_ctx.stringValue("ListMcubeUpgradeTasksResponse.RequestId"));
		listMcubeUpgradeTasksResponse.setResultCode(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ResultCode"));
		listMcubeUpgradeTasksResponse.setResultMessage(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ResultMessage"));

		ListTaskResult listTaskResult = new ListTaskResult();
		listTaskResult.setErrorCode(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.ErrorCode"));
		listTaskResult.setResultMsg(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.ResultMsg"));
		listTaskResult.setSuccess(_ctx.booleanValue("ListMcubeUpgradeTasksResponse.ListTaskResult.Success"));
		listTaskResult.setRequestId(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.RequestId"));

		List<Data> taskInfo = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo.Length"); i++) {
			Data data = new Data();
			data.setProductId(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].ProductId"));
			data.setCreator(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].Creator"));
			data.setHuobanNoticeId(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].HuobanNoticeId"));
			data.setGreyConfigInfo(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyConfigInfo"));
			data.setIsOfficial(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].IsOfficial"));
			data.setRealGreyEndtype(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].RealGreyEndtype"));
			data.setExecutionOrder(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].ExecutionOrder"));
			data.setHuobanUrl(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].HuobanUrl"));
			data.setGmtCreate(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GmtCreate"));
			data.setUpgradeContent(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].UpgradeContent"));
			data.setGreyEndtime(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyEndtime"));
			data.setPublishType(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].PublishType"));
			data.setPackageInfoId(_ctx.longValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].PackageInfoId"));
			data.setWhitelistIds(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].WhitelistIds"));
			data.setPushContent(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].PushContent"));
			data.setIsEnterprise(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].IsEnterprise"));
			data.setMaxVersion(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].MaxVersion"));
			data.setUpgradeType(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].UpgradeType"));
			data.setModifier(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].Modifier"));
			data.setIsPush(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].IsPush"));
			data.setGmtModified(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GmtModified"));
			data.setInnerVersion(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].InnerVersion"));
			data.setRealGreyNum(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].RealGreyNum"));
			data.setIsRelease(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].IsRelease"));
			data.setPlatform(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].Platform"));
			data.setUpgradeValidTime(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].UpgradeValidTime"));
			data.setGreyNotice(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyNotice"));
			data.setSilentType(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].SilentType"));
			data.setAppCode(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].AppCode"));
			data.setSyncResult(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].SyncResult"));
			data.setMemo(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].Memo"));
			data.setGreyPausePoint(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyPausePoint"));
			data.setPublishMode(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].PublishMode"));
			data.setGreyPauseType(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyPauseType"));
			data.setGreyNum(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyNum"));
			data.setRealGreyEndtimeStr(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].RealGreyEndtimeStr"));
			data.setProductVersion(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].ProductVersion"));
			data.setDevicePercent(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].DevicePercent"));
			data.setTaskStatus(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].TaskStatus"));
			data.setHistoryForce(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].HistoryForce"));
			data.setRealGreyEndtime(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].RealGreyEndtime"));
			data.setId(_ctx.longValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].Id"));
			data.setRealGreyUv(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].RealGreyUv"));
			data.setGmtCreateStr(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GmtCreateStr"));
			data.setGmtModifiedStr(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GmtModifiedStr"));
			data.setGreyUv(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyUv"));

			taskInfo.add(data);
		}
		listTaskResult.setTaskInfo(taskInfo);
		listMcubeUpgradeTasksResponse.setListTaskResult(listTaskResult);
	 
	 	return listMcubeUpgradeTasksResponse;
	}
}