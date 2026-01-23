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

package com.aliyuncs.dataphin_public.transform.v20230630;

import com.aliyuncs.dataphin_public.model.v20230630.GetSecurityClassifyResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetSecurityClassifyResponse.SecurityClassifyInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecurityClassifyResponseUnmarshaller {

	public static GetSecurityClassifyResponse unmarshall(GetSecurityClassifyResponse getSecurityClassifyResponse, UnmarshallerContext _ctx) {
		
		getSecurityClassifyResponse.setRequestId(_ctx.stringValue("GetSecurityClassifyResponse.RequestId"));
		getSecurityClassifyResponse.setSuccess(_ctx.booleanValue("GetSecurityClassifyResponse.Success"));
		getSecurityClassifyResponse.setHttpStatusCode(_ctx.integerValue("GetSecurityClassifyResponse.HttpStatusCode"));
		getSecurityClassifyResponse.setCode(_ctx.stringValue("GetSecurityClassifyResponse.Code"));
		getSecurityClassifyResponse.setMessage(_ctx.stringValue("GetSecurityClassifyResponse.Message"));

		SecurityClassifyInfo securityClassifyInfo = new SecurityClassifyInfo();
		securityClassifyInfo.setId(_ctx.longValue("GetSecurityClassifyResponse.SecurityClassifyInfo.Id"));
		securityClassifyInfo.setName(_ctx.stringValue("GetSecurityClassifyResponse.SecurityClassifyInfo.Name"));
		securityClassifyInfo.setAbbreviation(_ctx.stringValue("GetSecurityClassifyResponse.SecurityClassifyInfo.Abbreviation"));
		securityClassifyInfo.setPath(_ctx.stringValue("GetSecurityClassifyResponse.SecurityClassifyInfo.Path"));
		securityClassifyInfo.setLevelIndex(_ctx.longValue("GetSecurityClassifyResponse.SecurityClassifyInfo.LevelIndex"));
		securityClassifyInfo.setLevelName(_ctx.stringValue("GetSecurityClassifyResponse.SecurityClassifyInfo.LevelName"));
		securityClassifyInfo.setLevelAbbreviation(_ctx.stringValue("GetSecurityClassifyResponse.SecurityClassifyInfo.LevelAbbreviation"));
		getSecurityClassifyResponse.setSecurityClassifyInfo(securityClassifyInfo);
	 
	 	return getSecurityClassifyResponse;
	}
}