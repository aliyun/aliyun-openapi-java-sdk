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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import com.aliyuncs.dms_enterprise.model.v20181101.GetProxyAccessResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetProxyAccessResponse.ProxyAccess;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProxyAccessResponseUnmarshaller {

	public static GetProxyAccessResponse unmarshall(GetProxyAccessResponse getProxyAccessResponse, UnmarshallerContext _ctx) {
		
		getProxyAccessResponse.setRequestId(_ctx.stringValue("GetProxyAccessResponse.RequestId"));
		getProxyAccessResponse.setSuccess(_ctx.booleanValue("GetProxyAccessResponse.Success"));
		getProxyAccessResponse.setErrorMessage(_ctx.stringValue("GetProxyAccessResponse.ErrorMessage"));
		getProxyAccessResponse.setErrorCode(_ctx.stringValue("GetProxyAccessResponse.ErrorCode"));

		ProxyAccess proxyAccess = new ProxyAccess();
		proxyAccess.setProxyAccessId(_ctx.longValue("GetProxyAccessResponse.ProxyAccess.ProxyAccessId"));
		proxyAccess.setGmtCreate(_ctx.stringValue("GetProxyAccessResponse.ProxyAccess.GmtCreate"));
		proxyAccess.setAccessId(_ctx.stringValue("GetProxyAccessResponse.ProxyAccess.AccessId"));
		proxyAccess.setOriginInfo(_ctx.stringValue("GetProxyAccessResponse.ProxyAccess.OriginInfo"));
		proxyAccess.setIndepAccount(_ctx.stringValue("GetProxyAccessResponse.ProxyAccess.IndepAccount"));
		proxyAccess.setUserId(_ctx.longValue("GetProxyAccessResponse.ProxyAccess.UserId"));
		proxyAccess.setUserUid(_ctx.stringValue("GetProxyAccessResponse.ProxyAccess.UserUid"));
		proxyAccess.setUserName(_ctx.stringValue("GetProxyAccessResponse.ProxyAccess.UserName"));
		proxyAccess.setProxyId(_ctx.longValue("GetProxyAccessResponse.ProxyAccess.ProxyId"));
		proxyAccess.setInstanceId(_ctx.longValue("GetProxyAccessResponse.ProxyAccess.InstanceId"));
		getProxyAccessResponse.setProxyAccess(proxyAccess);
	 
	 	return getProxyAccessResponse;
	}
}