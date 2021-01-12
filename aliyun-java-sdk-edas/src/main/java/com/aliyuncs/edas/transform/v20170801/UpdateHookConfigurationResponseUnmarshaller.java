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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.UpdateHookConfigurationResponse;
import com.aliyuncs.edas.model.v20170801.UpdateHookConfigurationResponse.Configuration;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateHookConfigurationResponseUnmarshaller {

	public static UpdateHookConfigurationResponse unmarshall(UpdateHookConfigurationResponse updateHookConfigurationResponse, UnmarshallerContext _ctx) {
		
		updateHookConfigurationResponse.setRequestId(_ctx.stringValue("UpdateHookConfigurationResponse.RequestId"));
		updateHookConfigurationResponse.setCode(_ctx.integerValue("UpdateHookConfigurationResponse.Code"));
		updateHookConfigurationResponse.setMessage(_ctx.stringValue("UpdateHookConfigurationResponse.Message"));

		List<Configuration> hooksConfiguration = new ArrayList<Configuration>();
		for (int i = 0; i < _ctx.lengthValue("UpdateHookConfigurationResponse.HooksConfiguration.Length"); i++) {
			Configuration configuration = new Configuration();
			configuration.setName(_ctx.stringValue("UpdateHookConfigurationResponse.HooksConfiguration["+ i +"].Name"));
			configuration.setScript(_ctx.stringValue("UpdateHookConfigurationResponse.HooksConfiguration["+ i +"].Script"));
			configuration.setIgnoreFail(_ctx.booleanValue("UpdateHookConfigurationResponse.HooksConfiguration["+ i +"].IgnoreFail"));

			hooksConfiguration.add(configuration);
		}
		updateHookConfigurationResponse.setHooksConfiguration(hooksConfiguration);
	 
	 	return updateHookConfigurationResponse;
	}
}