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

import com.aliyuncs.linkwan.model.v20190301.GetNodeLocalConfigResponse;
import com.aliyuncs.linkwan.model.v20190301.GetNodeLocalConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNodeLocalConfigResponseUnmarshaller {

	public static GetNodeLocalConfigResponse unmarshall(GetNodeLocalConfigResponse getNodeLocalConfigResponse, UnmarshallerContext _ctx) {
		
		getNodeLocalConfigResponse.setRequestId(_ctx.stringValue("GetNodeLocalConfigResponse.RequestId"));
		getNodeLocalConfigResponse.setSuccess(_ctx.booleanValue("GetNodeLocalConfigResponse.Success"));
		getNodeLocalConfigResponse.setCode(_ctx.stringValue("GetNodeLocalConfigResponse.Code"));
		getNodeLocalConfigResponse.setErrorMessage(_ctx.stringValue("GetNodeLocalConfigResponse.ErrorMessage"));

		Data data = new Data();
		data.setDevType(_ctx.stringValue("GetNodeLocalConfigResponse.Data.DevType"));
		data.setEui(_ctx.stringValue("GetNodeLocalConfigResponse.Data.Eui"));
		data.setD2dAddr(_ctx.stringValue("GetNodeLocalConfigResponse.Data.D2dAddr"));
		data.setD2dKey(_ctx.stringValue("GetNodeLocalConfigResponse.Data.D2dKey"));
		data.setFreq(_ctx.integerValue("GetNodeLocalConfigResponse.Data.Freq"));
		data.setDatr(_ctx.integerValue("GetNodeLocalConfigResponse.Data.Datr"));
		data.setTaskId(_ctx.longValue("GetNodeLocalConfigResponse.Data.TaskId"));
		data.setCreateMillis(_ctx.longValue("GetNodeLocalConfigResponse.Data.CreateMillis"));
		data.setModifiedMillis(_ctx.longValue("GetNodeLocalConfigResponse.Data.ModifiedMillis"));
		getNodeLocalConfigResponse.setData(data);
	 
	 	return getNodeLocalConfigResponse;
	}
}