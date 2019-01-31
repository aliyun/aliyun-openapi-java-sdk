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

package com.aliyuncs.ons.transform.v20180628;

import com.aliyuncs.ons.model.v20180628.OnsInstanceBaseInfoResponse;
import com.aliyuncs.ons.model.v20180628.OnsInstanceBaseInfoResponse.InstanceBaseInfo;
import com.aliyuncs.ons.model.v20180628.OnsInstanceBaseInfoResponse.InstanceBaseInfo.Endpoints;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsInstanceBaseInfoResponseUnmarshaller {

	public static OnsInstanceBaseInfoResponse unmarshall(OnsInstanceBaseInfoResponse onsInstanceBaseInfoResponse, UnmarshallerContext context) {
		
		onsInstanceBaseInfoResponse.setRequestId(context.stringValue("OnsInstanceBaseInfoResponse.RequestId"));
		onsInstanceBaseInfoResponse.setHelpUrl(context.stringValue("OnsInstanceBaseInfoResponse.HelpUrl"));

		InstanceBaseInfo instanceBaseInfo = new InstanceBaseInfo();
		instanceBaseInfo.setInstanceId(context.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.InstanceId"));
		instanceBaseInfo.setInstanceStatus(context.integerValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.InstanceStatus"));
		instanceBaseInfo.setReleaseTime(context.longValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.ReleaseTime"));
		instanceBaseInfo.setInstanceType(context.integerValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.InstanceType"));
		instanceBaseInfo.setInstanceName(context.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.InstanceName"));

		Endpoints endpoints = new Endpoints();
		endpoints.setTcpEndpoint(context.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.Endpoints.TcpEndpoint"));
		endpoints.setHttpInternetEndpoint(context.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.Endpoints.HttpInternetEndpoint"));
		endpoints.setHttpInternetSecureEndpoint(context.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.Endpoints.HttpInternetSecureEndpoint"));
		endpoints.setHttpInternalEndpoint(context.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.Endpoints.HttpInternalEndpoint"));
		instanceBaseInfo.setEndpoints(endpoints);
		onsInstanceBaseInfoResponse.setInstanceBaseInfo(instanceBaseInfo);
	 
	 	return onsInstanceBaseInfoResponse;
	}
}