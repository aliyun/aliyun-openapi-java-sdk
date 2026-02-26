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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetPasswordInitializationConfigurationResponse;
import com.aliyuncs.eiam.model.v20211201.GetPasswordInitializationConfigurationResponse.PasswordInitializationConfiguration;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPasswordInitializationConfigurationResponseUnmarshaller {

	public static GetPasswordInitializationConfigurationResponse unmarshall(GetPasswordInitializationConfigurationResponse getPasswordInitializationConfigurationResponse, UnmarshallerContext _ctx) {
		
		getPasswordInitializationConfigurationResponse.setRequestId(_ctx.stringValue("GetPasswordInitializationConfigurationResponse.RequestId"));

		PasswordInitializationConfiguration passwordInitializationConfiguration = new PasswordInitializationConfiguration();
		passwordInitializationConfiguration.setPasswordInitializationStatus(_ctx.stringValue("GetPasswordInitializationConfigurationResponse.PasswordInitializationConfiguration.PasswordInitializationStatus"));
		passwordInitializationConfiguration.setPasswordInitializationType(_ctx.stringValue("GetPasswordInitializationConfigurationResponse.PasswordInitializationConfiguration.PasswordInitializationType"));
		passwordInitializationConfiguration.setPasswordForcedUpdateStatus(_ctx.stringValue("GetPasswordInitializationConfigurationResponse.PasswordInitializationConfiguration.PasswordForcedUpdateStatus"));

		List<String> passwordInitializationNotificationChannels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetPasswordInitializationConfigurationResponse.PasswordInitializationConfiguration.PasswordInitializationNotificationChannels.Length"); i++) {
			passwordInitializationNotificationChannels.add(_ctx.stringValue("GetPasswordInitializationConfigurationResponse.PasswordInitializationConfiguration.PasswordInitializationNotificationChannels["+ i +"]"));
		}
		passwordInitializationConfiguration.setPasswordInitializationNotificationChannels(passwordInitializationNotificationChannels);
		getPasswordInitializationConfigurationResponse.setPasswordInitializationConfiguration(passwordInitializationConfiguration);
	 
	 	return getPasswordInitializationConfigurationResponse;
	}
}