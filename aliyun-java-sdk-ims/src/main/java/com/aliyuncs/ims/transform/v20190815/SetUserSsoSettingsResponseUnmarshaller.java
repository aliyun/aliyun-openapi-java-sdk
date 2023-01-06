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

package com.aliyuncs.ims.transform.v20190815;

import com.aliyuncs.ims.model.v20190815.SetUserSsoSettingsResponse;
import com.aliyuncs.ims.model.v20190815.SetUserSsoSettingsResponse.UserSsoSettings;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetUserSsoSettingsResponseUnmarshaller {

	public static SetUserSsoSettingsResponse unmarshall(SetUserSsoSettingsResponse setUserSsoSettingsResponse, UnmarshallerContext _ctx) {
		
		setUserSsoSettingsResponse.setRequestId(_ctx.stringValue("SetUserSsoSettingsResponse.RequestId"));

		UserSsoSettings userSsoSettings = new UserSsoSettings();
		userSsoSettings.setAuxiliaryDomain(_ctx.stringValue("SetUserSsoSettingsResponse.UserSsoSettings.AuxiliaryDomain"));
		userSsoSettings.setMetadataDocument(_ctx.stringValue("SetUserSsoSettingsResponse.UserSsoSettings.MetadataDocument"));
		userSsoSettings.setSsoEnabled(_ctx.booleanValue("SetUserSsoSettingsResponse.UserSsoSettings.SsoEnabled"));
		userSsoSettings.setName(_ctx.stringValue("SetUserSsoSettingsResponse.UserSsoSettings.Name"));
		setUserSsoSettingsResponse.setUserSsoSettings(userSsoSettings);
	 
	 	return setUserSsoSettingsResponse;
	}
}