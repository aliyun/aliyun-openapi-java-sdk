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

package com.aliyuncs.qualitycheck.transform.v20190115;

import com.aliyuncs.qualitycheck.model.v20190115.GetUserConfigResponse;
import com.aliyuncs.qualitycheck.model.v20190115.GetUserConfigResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserConfigResponseUnmarshaller {

	public static GetUserConfigResponse unmarshall(GetUserConfigResponse getUserConfigResponse, UnmarshallerContext _ctx) {
		
		getUserConfigResponse.setRequestId(_ctx.stringValue("GetUserConfigResponse.RequestId"));
		getUserConfigResponse.setSuccess(_ctx.booleanValue("GetUserConfigResponse.Success"));
		getUserConfigResponse.setCode(_ctx.stringValue("GetUserConfigResponse.Code"));
		getUserConfigResponse.setMessage(_ctx.stringValue("GetUserConfigResponse.Message"));

		Data data = new Data();
		data.setAliUid(_ctx.stringValue("GetUserConfigResponse.Data.AliUid"));
		data.setBuName(_ctx.stringValue("GetUserConfigResponse.Data.BuName"));
		data.setCreateTime(_ctx.stringValue("GetUserConfigResponse.Data.CreateTime"));
		data.setHideNumber(_ctx.integerValue("GetUserConfigResponse.Data.HideNumber"));
		getUserConfigResponse.setData(data);
	 
	 	return getUserConfigResponse;
	}
}