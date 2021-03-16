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

package com.aliyuncs.ecsops.transform.v20160401;

import com.aliyuncs.ecsops.model.v20160401.OpsUpdateUserGrayBusinessResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsUpdateUserGrayBusinessResponseUnmarshaller {

	public static OpsUpdateUserGrayBusinessResponse unmarshall(OpsUpdateUserGrayBusinessResponse opsUpdateUserGrayBusinessResponse, UnmarshallerContext _ctx) {
		
		opsUpdateUserGrayBusinessResponse.setRequestId(_ctx.stringValue("OpsUpdateUserGrayBusinessResponse.RequestId"));
		opsUpdateUserGrayBusinessResponse.setCode(_ctx.stringValue("OpsUpdateUserGrayBusinessResponse.Code"));
		opsUpdateUserGrayBusinessResponse.setMessage(_ctx.stringValue("OpsUpdateUserGrayBusinessResponse.Message"));
		opsUpdateUserGrayBusinessResponse.setSuccess(_ctx.stringValue("OpsUpdateUserGrayBusinessResponse.Success"));

		UserGrayBusinessDO userGrayBusinessDO = new UserGrayBusinessDO();
		userGrayBusinessDO.setId(_ctx.longValue("OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO.Id"));
		userGrayBusinessDO.setGrayBizType(_ctx.stringValue("OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO.GrayBizType"));
		userGrayBusinessDO.setGrayStrictMode(_ctx.integerValue("OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO.GrayStrictMode"));
		userGrayBusinessDO.setUserLevels(_ctx.stringValue("OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO.UserLevels"));
		userGrayBusinessDO.setMaxVms(_ctx.integerValue("OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO.MaxVms"));
		userGrayBusinessDO.setStatus(_ctx.integerValue("OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO.Status"));
		userGrayBusinessDO.setGmtCreate(_ctx.stringValue("OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO.GmtCreate"));
		userGrayBusinessDO.setGmtModified(_ctx.stringValue("OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO.GmtModified"));
		userGrayBusinessDO.setAliUid(_ctx.longValue("OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO.AliUid"));
		userGrayBusinessDO.setRegionNo(_ctx.stringValue("OpsUpdateUserGrayBusinessResponse.UserGrayBusinessDO.RegionNo"));
		opsUpdateUserGrayBusinessResponse.setUserGrayBusinessDO(userGrayBusinessDO);
	 
	 	return opsUpdateUserGrayBusinessResponse;
	}
}