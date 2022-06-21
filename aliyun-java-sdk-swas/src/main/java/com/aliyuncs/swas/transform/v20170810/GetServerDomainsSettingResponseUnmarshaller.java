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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.GetServerDomainsSettingResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServerDomainsSettingResponseUnmarshaller {

	public static GetServerDomainsSettingResponse unmarshall(GetServerDomainsSettingResponse getServerDomainsSettingResponse, UnmarshallerContext _ctx) {
		
		getServerDomainsSettingResponse.setRequestId(_ctx.stringValue("GetServerDomainsSettingResponse.RequestId"));
		getServerDomainsSettingResponse.setIsSuccess(_ctx.booleanValue("GetServerDomainsSettingResponse.IsSuccess"));
		getServerDomainsSettingResponse.setAddSettingStatus(_ctx.booleanValue("GetServerDomainsSettingResponse.AddSettingStatus"));
		getServerDomainsSettingResponse.setAddSettingNum(_ctx.integerValue("GetServerDomainsSettingResponse.AddSettingNum"));
		getServerDomainsSettingResponse.setHttpsSettingOff(_ctx.integerValue("GetServerDomainsSettingResponse.HttpsSettingOff"));
		getServerDomainsSettingResponse.setHttpsSettingOn(_ctx.integerValue("GetServerDomainsSettingResponse.HttpsSettingOn"));
		getServerDomainsSettingResponse.setHttpsSettingNoSetting(_ctx.integerValue("GetServerDomainsSettingResponse.HttpsSettingNoSetting"));
		getServerDomainsSettingResponse.setBeianSettingDomain(_ctx.stringValue("GetServerDomainsSettingResponse.BeianSettingDomain"));
		getServerDomainsSettingResponse.setBeianSettingStatus(_ctx.booleanValue("GetServerDomainsSettingResponse.BeianSettingStatus"));
		getServerDomainsSettingResponse.setAddSettingDomain(_ctx.stringValue("GetServerDomainsSettingResponse.AddSettingDomain"));
		getServerDomainsSettingResponse.setCode(_ctx.stringValue("GetServerDomainsSettingResponse.Code"));
	 
	 	return getServerDomainsSettingResponse;
	}
}