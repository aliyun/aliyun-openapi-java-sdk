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

package com.aliyuncs.ccc.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20170705.GetSmsConfigResponse;
import com.aliyuncs.ccc.model.v20170705.GetSmsConfigResponse.SmsConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSmsConfigResponseUnmarshaller {

	public static GetSmsConfigResponse unmarshall(GetSmsConfigResponse getSmsConfigResponse, UnmarshallerContext _ctx) {
		
		getSmsConfigResponse.setRequestId(_ctx.stringValue("GetSmsConfigResponse.RequestId"));
		getSmsConfigResponse.setSuccess(_ctx.booleanValue("GetSmsConfigResponse.Success"));
		getSmsConfigResponse.setCode(_ctx.stringValue("GetSmsConfigResponse.Code"));
		getSmsConfigResponse.setMessage(_ctx.stringValue("GetSmsConfigResponse.Message"));
		getSmsConfigResponse.setHttpStatusCode(_ctx.integerValue("GetSmsConfigResponse.HttpStatusCode"));

		List<SmsConfig> smsConfigs = new ArrayList<SmsConfig>();
		for (int i = 0; i < _ctx.lengthValue("GetSmsConfigResponse.SmsConfigs.Length"); i++) {
			SmsConfig smsConfig = new SmsConfig();
			smsConfig.setId(_ctx.longValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Id"));
			smsConfig.setInstance(_ctx.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Instance"));
			smsConfig.setSignName(_ctx.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].SignName"));
			smsConfig.setTemplateCode(_ctx.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].TemplateCode"));
			smsConfig.setScenario(_ctx.integerValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Scenario"));
			smsConfig.setName(_ctx.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Name"));
			smsConfig.setDescription(_ctx.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Description"));
			smsConfig.setExtra(_ctx.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Extra"));
			smsConfig.setGmtCreate(_ctx.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].GmtCreate"));
			smsConfig.setGmtModified(_ctx.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].GmtModified"));

			smsConfigs.add(smsConfig);
		}
		getSmsConfigResponse.setSmsConfigs(smsConfigs);
	 
	 	return getSmsConfigResponse;
	}
}