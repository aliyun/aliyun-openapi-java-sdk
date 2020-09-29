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

package com.aliyuncs.ons.transform.v20190214;

import com.aliyuncs.ons.model.v20190214.OnsInstanceBaseInfoResponse;
import com.aliyuncs.ons.model.v20190214.OnsInstanceBaseInfoResponse.InstanceBaseInfo;
import com.aliyuncs.ons.model.v20190214.OnsInstanceBaseInfoResponse.InstanceBaseInfo.Endpoints;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsInstanceBaseInfoResponseUnmarshaller {

	public static OnsInstanceBaseInfoResponse unmarshall(OnsInstanceBaseInfoResponse onsInstanceBaseInfoResponse, UnmarshallerContext _ctx) {
		
		onsInstanceBaseInfoResponse.setRequestId(_ctx.stringValue("OnsInstanceBaseInfoResponse.RequestId"));
		onsInstanceBaseInfoResponse.setHelpUrl(_ctx.stringValue("OnsInstanceBaseInfoResponse.HelpUrl"));

		InstanceBaseInfo instanceBaseInfo = new InstanceBaseInfo();
		instanceBaseInfo.setInstanceId(_ctx.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.InstanceId"));
		instanceBaseInfo.setInstanceStatus(_ctx.integerValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.InstanceStatus"));
		instanceBaseInfo.setReleaseTime(_ctx.longValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.ReleaseTime"));
		instanceBaseInfo.setInstanceType(_ctx.integerValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.InstanceType"));
		instanceBaseInfo.setInstanceName(_ctx.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.InstanceName"));
		instanceBaseInfo.setIndependentNaming(_ctx.booleanValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.IndependentNaming"));
		instanceBaseInfo.setRemark(_ctx.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.Remark"));
		instanceBaseInfo.setTopicCapacity(_ctx.integerValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.TopicCapacity"));
		instanceBaseInfo.setMaxTps(_ctx.longValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.MaxTps"));

		Endpoints endpoints = new Endpoints();
		endpoints.setTcpEndpoint(_ctx.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.Endpoints.TcpEndpoint"));
		endpoints.setHttpInternetEndpoint(_ctx.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.Endpoints.HttpInternetEndpoint"));
		endpoints.setHttpInternetSecureEndpoint(_ctx.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.Endpoints.HttpInternetSecureEndpoint"));
		endpoints.setHttpInternalEndpoint(_ctx.stringValue("OnsInstanceBaseInfoResponse.InstanceBaseInfo.Endpoints.HttpInternalEndpoint"));
		instanceBaseInfo.setEndpoints(endpoints);
		onsInstanceBaseInfoResponse.setInstanceBaseInfo(instanceBaseInfo);
	 
	 	return onsInstanceBaseInfoResponse;
	}
}