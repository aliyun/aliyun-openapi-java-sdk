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

	public static GetSmsConfigResponse unmarshall(GetSmsConfigResponse getSmsConfigResponse, UnmarshallerContext context) {
		
		getSmsConfigResponse.setRequestId(context.stringValue("GetSmsConfigResponse.RequestId"));
		getSmsConfigResponse.setSuccess(context.booleanValue("GetSmsConfigResponse.Success"));
		getSmsConfigResponse.setCode(context.stringValue("GetSmsConfigResponse.Code"));
		getSmsConfigResponse.setMessage(context.stringValue("GetSmsConfigResponse.Message"));
		getSmsConfigResponse.setHttpStatusCode(context.integerValue("GetSmsConfigResponse.HttpStatusCode"));

		List<SmsConfig> smsConfigs = new ArrayList<SmsConfig>();
		for (int i = 0; i < context.lengthValue("GetSmsConfigResponse.SmsConfigs.Length"); i++) {
			SmsConfig smsConfig = new SmsConfig();
			smsConfig.setId(context.longValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Id"));
			smsConfig.setInstance(context.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Instance"));
			smsConfig.setSignName(context.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].SignName"));
			smsConfig.setTemplateCode(context.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].TemplateCode"));
			smsConfig.setScenario(context.integerValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Scenario"));
			smsConfig.setName(context.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Name"));
			smsConfig.setDescription(context.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Description"));
			smsConfig.setExtra(context.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].Extra"));
			smsConfig.setGmtCreate(context.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].GmtCreate"));
			smsConfig.setGmtModified(context.stringValue("GetSmsConfigResponse.SmsConfigs["+ i +"].GmtModified"));

			smsConfigs.add(smsConfig);
		}
		getSmsConfigResponse.setSmsConfigs(smsConfigs);
	 
	 	return getSmsConfigResponse;
	}
}