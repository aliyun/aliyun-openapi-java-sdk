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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.SyncDWSVpcIpResponse;
import com.aliyuncs.sofa.model.v20190815.SyncDWSVpcIpResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncDWSVpcIpResponseUnmarshaller {

	public static SyncDWSVpcIpResponse unmarshall(SyncDWSVpcIpResponse syncDWSVpcIpResponse, UnmarshallerContext _ctx) {
		
		syncDWSVpcIpResponse.setRequestId(_ctx.stringValue("SyncDWSVpcIpResponse.RequestId"));
		syncDWSVpcIpResponse.setResultCode(_ctx.stringValue("SyncDWSVpcIpResponse.ResultCode"));
		syncDWSVpcIpResponse.setResultMessage(_ctx.stringValue("SyncDWSVpcIpResponse.ResultMessage"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("SyncDWSVpcIpResponse.Data.AppId"));
		data.setMappingIp(_ctx.stringValue("SyncDWSVpcIpResponse.Data.MappingIp"));
		data.setVSwitchId(_ctx.stringValue("SyncDWSVpcIpResponse.Data.VSwitchId"));
		syncDWSVpcIpResponse.setData(data);
	 
	 	return syncDWSVpcIpResponse;
	}
}