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

import com.aliyuncs.mse.model.v20190531.GetNacosConfigResponse;
import com.aliyuncs.mse.model.v20190531.GetNacosConfigResponse.Configuration;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetNacosConfigResponseUnmarshaller {

	public static GetNacosConfigResponse unmarshall(GetNacosConfigResponse getNacosConfigResponse, UnmarshallerContext _ctx) {
		
		getNacosConfigResponse.setRequestId(_ctx.stringValue("GetNacosConfigResponse.RequestId"));
		getNacosConfigResponse.setMessage(_ctx.stringValue("GetNacosConfigResponse.Message"));
		getNacosConfigResponse.setErrorCode(_ctx.stringValue("GetNacosConfigResponse.ErrorCode"));
		getNacosConfigResponse.setSuccess(_ctx.booleanValue("GetNacosConfigResponse.Success"));

		Configuration configuration = new Configuration();
		configuration.setType(_ctx.stringValue("GetNacosConfigResponse.Configuration.Type"));
		configuration.setAppName(_ctx.stringValue("GetNacosConfigResponse.Configuration.AppName"));
		configuration.setTags(_ctx.stringValue("GetNacosConfigResponse.Configuration.Tags"));
		configuration.setMd5(_ctx.stringValue("GetNacosConfigResponse.Configuration.Md5"));
		configuration.setDataId(_ctx.stringValue("GetNacosConfigResponse.Configuration.DataId"));
		configuration.setContent(_ctx.stringValue("GetNacosConfigResponse.Configuration.Content"));
		configuration.setGroup(_ctx.stringValue("GetNacosConfigResponse.Configuration.Group"));
		configuration.setDesc(_ctx.stringValue("GetNacosConfigResponse.Configuration.Desc"));
		configuration.setEncryptedDataKey(_ctx.stringValue("GetNacosConfigResponse.Configuration.EncryptedDataKey"));
		configuration.setBetaIps(_ctx.stringValue("GetNacosConfigResponse.Configuration.BetaIps"));
		getNacosConfigResponse.setConfiguration(configuration);
	 
	 	return getNacosConfigResponse;
	}
}