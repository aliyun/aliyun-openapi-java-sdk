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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryUserGrayBusinessResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryUserGrayBusinessResponse.UserGrayBusinessDO;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryUserGrayBusinessResponseUnmarshaller {

	public static OpsQueryUserGrayBusinessResponse unmarshall(OpsQueryUserGrayBusinessResponse opsQueryUserGrayBusinessResponse, UnmarshallerContext _ctx) {
		
		opsQueryUserGrayBusinessResponse.setRequestId(_ctx.stringValue("OpsQueryUserGrayBusinessResponse.RequestId"));
		opsQueryUserGrayBusinessResponse.setMessage(_ctx.stringValue("OpsQueryUserGrayBusinessResponse.Message"));
		opsQueryUserGrayBusinessResponse.setCode(_ctx.stringValue("OpsQueryUserGrayBusinessResponse.Code"));
		opsQueryUserGrayBusinessResponse.setSuccess(_ctx.stringValue("OpsQueryUserGrayBusinessResponse.Success"));

		List<UserGrayBusinessDO> userGrayBusinessDOs = new ArrayList<UserGrayBusinessDO>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs.Length"); i++) {
			UserGrayBusinessDO userGrayBusinessDO = new UserGrayBusinessDO();
			userGrayBusinessDO.setStatus(_ctx.integerValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs["+ i +"].Status"));
			userGrayBusinessDO.setMaxVms(_ctx.integerValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs["+ i +"].MaxVms"));
			userGrayBusinessDO.setGrayStrictMode(_ctx.integerValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs["+ i +"].GrayStrictMode"));
			userGrayBusinessDO.setGrayBizType(_ctx.stringValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs["+ i +"].GrayBizType"));
			userGrayBusinessDO.setRegionNo(_ctx.stringValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs["+ i +"].RegionNo"));
			userGrayBusinessDO.setUserLevels(_ctx.stringValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs["+ i +"].UserLevels"));
			userGrayBusinessDO.setGmtCreate(_ctx.stringValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs["+ i +"].GmtCreate"));
			userGrayBusinessDO.setAliUid(_ctx.longValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs["+ i +"].AliUid"));
			userGrayBusinessDO.setGmtModified(_ctx.stringValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs["+ i +"].GmtModified"));
			userGrayBusinessDO.setId(_ctx.longValue("OpsQueryUserGrayBusinessResponse.UserGrayBusinessDOs["+ i +"].Id"));

			userGrayBusinessDOs.add(userGrayBusinessDO);
		}
		opsQueryUserGrayBusinessResponse.setUserGrayBusinessDOs(userGrayBusinessDOs);
	 
	 	return opsQueryUserGrayBusinessResponse;
	}
}