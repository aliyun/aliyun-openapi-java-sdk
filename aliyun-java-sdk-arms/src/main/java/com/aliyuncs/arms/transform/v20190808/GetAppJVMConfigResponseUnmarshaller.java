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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.GetAppJVMConfigResponse;
import com.aliyuncs.arms.model.v20190808.GetAppJVMConfigResponse.JvmInfoListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppJVMConfigResponseUnmarshaller {

	public static GetAppJVMConfigResponse unmarshall(GetAppJVMConfigResponse getAppJVMConfigResponse, UnmarshallerContext _ctx) {
		
		getAppJVMConfigResponse.setRequestId(_ctx.stringValue("GetAppJVMConfigResponse.RequestId"));
		getAppJVMConfigResponse.setCode(_ctx.integerValue("GetAppJVMConfigResponse.Code"));
		getAppJVMConfigResponse.setMessage(_ctx.stringValue("GetAppJVMConfigResponse.Message"));
		getAppJVMConfigResponse.setSuccess(_ctx.booleanValue("GetAppJVMConfigResponse.Success"));

		List<JvmInfoListItem> jvmInfoList = new ArrayList<JvmInfoListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAppJVMConfigResponse.JvmInfoList.Length"); i++) {
			JvmInfoListItem jvmInfoListItem = new JvmInfoListItem();
			jvmInfoListItem.setPid(_ctx.stringValue("GetAppJVMConfigResponse.JvmInfoList["+ i +"].Pid"));
			jvmInfoListItem.setVmArgs(_ctx.stringValue("GetAppJVMConfigResponse.JvmInfoList["+ i +"].VmArgs"));
			jvmInfoListItem.setHostName(_ctx.stringValue("GetAppJVMConfigResponse.JvmInfoList["+ i +"].HostName"));
			jvmInfoListItem.setIp(_ctx.stringValue("GetAppJVMConfigResponse.JvmInfoList["+ i +"].Ip"));
			jvmInfoListItem.setAgentVersion(_ctx.stringValue("GetAppJVMConfigResponse.JvmInfoList["+ i +"].AgentVersion"));
			jvmInfoListItem.setProcId(_ctx.stringValue("GetAppJVMConfigResponse.JvmInfoList["+ i +"].ProcId"));

			jvmInfoList.add(jvmInfoListItem);
		}
		getAppJVMConfigResponse.setJvmInfoList(jvmInfoList);
	 
	 	return getAppJVMConfigResponse;
	}
}