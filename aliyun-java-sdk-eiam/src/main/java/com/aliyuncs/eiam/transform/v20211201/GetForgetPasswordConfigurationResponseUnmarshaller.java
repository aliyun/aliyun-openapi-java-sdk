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

import com.aliyuncs.eiam.model.v20211201.GetForgetPasswordConfigurationResponse;
import com.aliyuncs.eiam.model.v20211201.GetForgetPasswordConfigurationResponse.OpenForgetPasswordConfiguration;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetForgetPasswordConfigurationResponseUnmarshaller {

	public static GetForgetPasswordConfigurationResponse unmarshall(GetForgetPasswordConfigurationResponse getForgetPasswordConfigurationResponse, UnmarshallerContext _ctx) {
		
		getForgetPasswordConfigurationResponse.setRequestId(_ctx.stringValue("GetForgetPasswordConfigurationResponse.RequestId"));

		OpenForgetPasswordConfiguration openForgetPasswordConfiguration = new OpenForgetPasswordConfiguration();
		openForgetPasswordConfiguration.setEnable(_ctx.booleanValue("GetForgetPasswordConfigurationResponse.OpenForgetPasswordConfiguration.Enable"));
		openForgetPasswordConfiguration.setEnableSms(_ctx.booleanValue("GetForgetPasswordConfigurationResponse.OpenForgetPasswordConfiguration.EnableSms"));
		openForgetPasswordConfiguration.setEnableEmail(_ctx.booleanValue("GetForgetPasswordConfigurationResponse.OpenForgetPasswordConfiguration.EnableEmail"));
		openForgetPasswordConfiguration.setForgetPasswordStatus(_ctx.stringValue("GetForgetPasswordConfigurationResponse.OpenForgetPasswordConfiguration.ForgetPasswordStatus"));

		List<String> authenticationChannels = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetForgetPasswordConfigurationResponse.OpenForgetPasswordConfiguration.AuthenticationChannels.Length"); i++) {
			authenticationChannels.add(_ctx.stringValue("GetForgetPasswordConfigurationResponse.OpenForgetPasswordConfiguration.AuthenticationChannels["+ i +"]"));
		}
		openForgetPasswordConfiguration.setAuthenticationChannels(authenticationChannels);
		getForgetPasswordConfigurationResponse.setOpenForgetPasswordConfiguration(openForgetPasswordConfiguration);
	 
	 	return getForgetPasswordConfigurationResponse;
	}
}