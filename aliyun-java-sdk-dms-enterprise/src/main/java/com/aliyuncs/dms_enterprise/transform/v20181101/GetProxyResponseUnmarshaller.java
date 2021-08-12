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

import com.aliyuncs.dms_enterprise.model.v20181101.GetProxyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProxyResponseUnmarshaller {

	public static GetProxyResponse unmarshall(GetProxyResponse getProxyResponse, UnmarshallerContext _ctx) {
		
		getProxyResponse.setRequestId(_ctx.stringValue("GetProxyResponse.RequestId"));
		getProxyResponse.setSuccess(_ctx.booleanValue("GetProxyResponse.Success"));
		getProxyResponse.setErrorMessage(_ctx.stringValue("GetProxyResponse.ErrorMessage"));
		getProxyResponse.setErrorCode(_ctx.stringValue("GetProxyResponse.ErrorCode"));
		getProxyResponse.setProxyId(_ctx.longValue("GetProxyResponse.ProxyId"));
		getProxyResponse.setCreatorId(_ctx.longValue("GetProxyResponse.CreatorId"));
		getProxyResponse.setCreatorName(_ctx.stringValue("GetProxyResponse.CreatorName"));
		getProxyResponse.setInstanceId(_ctx.longValue("GetProxyResponse.InstanceId"));
		getProxyResponse.setPrivateEnable(_ctx.booleanValue("GetProxyResponse.PrivateEnable"));
		getProxyResponse.setPrivateHost(_ctx.stringValue("GetProxyResponse.PrivateHost"));
		getProxyResponse.setPublicEnable(_ctx.booleanValue("GetProxyResponse.PublicEnable"));
		getProxyResponse.setPublicHost(_ctx.stringValue("GetProxyResponse.PublicHost"));
		getProxyResponse.setMysqlPort(_ctx.integerValue("GetProxyResponse.MysqlPort"));
		getProxyResponse.setHttpsPort(_ctx.integerValue("GetProxyResponse.HttpsPort"));
	 
	 	return getProxyResponse;
	}
}