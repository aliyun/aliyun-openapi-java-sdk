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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.GetNacosHistoryConfigResponse;
import com.aliyuncs.mse.model.v20190531.GetNacosHistoryConfigResponse.Configuration;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNacosHistoryConfigResponseUnmarshaller {

	public static GetNacosHistoryConfigResponse unmarshall(GetNacosHistoryConfigResponse getNacosHistoryConfigResponse, UnmarshallerContext _ctx) {
		
		getNacosHistoryConfigResponse.setRequestId(_ctx.stringValue("GetNacosHistoryConfigResponse.RequestId"));
		getNacosHistoryConfigResponse.setSuccess(_ctx.booleanValue("GetNacosHistoryConfigResponse.Success"));
		getNacosHistoryConfigResponse.setMessage(_ctx.stringValue("GetNacosHistoryConfigResponse.Message"));
		getNacosHistoryConfigResponse.setErrorCode(_ctx.stringValue("GetNacosHistoryConfigResponse.ErrorCode"));

		Configuration configuration = new Configuration();
		configuration.setDataId(_ctx.stringValue("GetNacosHistoryConfigResponse.Configuration.DataId"));
		configuration.setGroup(_ctx.stringValue("GetNacosHistoryConfigResponse.Configuration.Group"));
		configuration.setAppName(_ctx.stringValue("GetNacosHistoryConfigResponse.Configuration.AppName"));
		configuration.setMd5(_ctx.stringValue("GetNacosHistoryConfigResponse.Configuration.Md5"));
		configuration.setContent(_ctx.stringValue("GetNacosHistoryConfigResponse.Configuration.Content"));
		configuration.setOpType(_ctx.stringValue("GetNacosHistoryConfigResponse.Configuration.OpType"));
		getNacosHistoryConfigResponse.setConfiguration(configuration);
	 
	 	return getNacosHistoryConfigResponse;
	}
}