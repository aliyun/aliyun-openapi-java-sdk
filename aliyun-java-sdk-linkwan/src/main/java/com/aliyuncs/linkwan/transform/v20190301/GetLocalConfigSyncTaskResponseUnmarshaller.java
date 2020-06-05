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

package com.aliyuncs.linkwan.transform.v20190301;

import com.aliyuncs.linkwan.model.v20190301.GetLocalConfigSyncTaskResponse;
import com.aliyuncs.linkwan.model.v20190301.GetLocalConfigSyncTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLocalConfigSyncTaskResponseUnmarshaller {

	public static GetLocalConfigSyncTaskResponse unmarshall(GetLocalConfigSyncTaskResponse getLocalConfigSyncTaskResponse, UnmarshallerContext _ctx) {
		
		getLocalConfigSyncTaskResponse.setRequestId(_ctx.stringValue("GetLocalConfigSyncTaskResponse.RequestId"));
		getLocalConfigSyncTaskResponse.setSuccess(_ctx.booleanValue("GetLocalConfigSyncTaskResponse.Success"));
		getLocalConfigSyncTaskResponse.setCode(_ctx.stringValue("GetLocalConfigSyncTaskResponse.Code"));
		getLocalConfigSyncTaskResponse.setErrorMessage(_ctx.stringValue("GetLocalConfigSyncTaskResponse.ErrorMessage"));

		Data data = new Data();
		data.setId(_ctx.longValue("GetLocalConfigSyncTaskResponse.Data.Id"));
		data.setCreateMillis(_ctx.longValue("GetLocalConfigSyncTaskResponse.Data.CreateMillis"));
		data.setModifiedMillis(_ctx.longValue("GetLocalConfigSyncTaskResponse.Data.ModifiedMillis"));
		data.setDevType(_ctx.stringValue("GetLocalConfigSyncTaskResponse.Data.DevType"));
		data.setTaskTYpe(_ctx.stringValue("GetLocalConfigSyncTaskResponse.Data.TaskTYpe"));
		data.setEui(_ctx.stringValue("GetLocalConfigSyncTaskResponse.Data.Eui"));
		data.setState(_ctx.stringValue("GetLocalConfigSyncTaskResponse.Data.State"));
		data.setD2dAddr(_ctx.stringValue("GetLocalConfigSyncTaskResponse.Data.D2dAddr"));
		data.setD2dKey(_ctx.stringValue("GetLocalConfigSyncTaskResponse.Data.D2dKey"));
		data.setFreq(_ctx.integerValue("GetLocalConfigSyncTaskResponse.Data.Freq"));
		data.setDatr(_ctx.integerValue("GetLocalConfigSyncTaskResponse.Data.Datr"));
		data.setProcessingMillis(_ctx.longValue("GetLocalConfigSyncTaskResponse.Data.ProcessingMillis"));
		getLocalConfigSyncTaskResponse.setData(data);
	 
	 	return getLocalConfigSyncTaskResponse;
	}
}