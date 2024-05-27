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
		listMcubeUpgradeTasksResponse.setResultMessage(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ResultMessage"));
		listMcubeUpgradeTasksResponse.setResultCode(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ResultCode"));

		ListTaskResult listTaskResult = new ListTaskResult();
		listTaskResult.setRequestId(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.RequestId"));
		listTaskResult.setErrorCode(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.ErrorCode"));
		listTaskResult.setSuccess(_ctx.booleanValue("ListMcubeUpgradeTasksResponse.ListTaskResult.Success"));
		listTaskResult.setResultMsg(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.ResultMsg"));

		List<Data> taskInfo = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo.Length"); i++) {
			Data data = new Data();
			data.setRealGreyUv(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].RealGreyUv"));
			data.setPublishMode(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].PublishMode"));
			data.setSilentType(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].SilentType"));
			data.setGreyEndtime(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyEndtime"));
			data.setGmtModified(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GmtModified"));
			data.setPushContent(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].PushContent"));
			data.setIsEnterprise(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].IsEnterprise"));
			data.setCreator(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].Creator"));
			data.setGreyUv(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyUv"));
			data.setGreyPauseType(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyPauseType"));
			data.setModifier(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].Modifier"));
			data.setHistoryForce(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].HistoryForce"));
			data.setIsRelease(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].IsRelease"));
			data.setRealGreyEndtype(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].RealGreyEndtype"));
			data.setPlatform(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].Platform"));
			data.setMaxVersion(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].MaxVersion"));
			data.setPackageInfoId(_ctx.longValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].PackageInfoId"));
			data.setProductId(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].ProductId"));
			data.setGreyPausePoint(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyPausePoint"));
			data.setHuobanNoticeId(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].HuobanNoticeId"));
			data.setRealGreyEndtime(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].RealGreyEndtime"));
			data.setHuobanUrl(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].HuobanUrl"));
			data.setGmtCreateStr(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GmtCreateStr"));
			data.setDevicePercent(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].DevicePercent"));
			data.setUpgradeValidTime(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].UpgradeValidTime"));
			data.setGmtModifiedStr(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GmtModifiedStr"));
			data.setAppCode(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].AppCode"));
			data.setInnerVersion(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].InnerVersion"));
			data.setMemo(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].Memo"));
			data.setGreyNum(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyNum"));
			data.setGreyConfigInfo(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyConfigInfo"));
			data.setRealGreyEndtimeStr(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].RealGreyEndtimeStr"));
			data.setExecutionOrder(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].ExecutionOrder"));
			data.setProductVersion(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].ProductVersion"));
			data.setIsOfficial(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].IsOfficial"));
			data.setRealGreyNum(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].RealGreyNum"));
			data.setPublishType(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].PublishType"));
			data.setTaskStatus(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].TaskStatus"));
			data.setSyncResult(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].SyncResult"));
			data.setGreyNotice(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GreyNotice"));
			data.setWhitelistIds(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].WhitelistIds"));
			data.setIsPush(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].IsPush"));
			data.setGmtCreate(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].GmtCreate"));
			data.setUpgradeContent(_ctx.stringValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].UpgradeContent"));
			data.setId(_ctx.longValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].Id"));
			data.setUpgradeType(_ctx.integerValue("ListMcubeUpgradeTasksResponse.ListTaskResult.TaskInfo["+ i +"].UpgradeType"));

			taskInfo.add(data);
		}
		listTaskResult.setTaskInfo(taskInfo);
		listMcubeUpgradeTasksResponse.setListTaskResult(listTaskResult);
	 
	 	return listMcubeUpgradeTasksResponse;
	}
}