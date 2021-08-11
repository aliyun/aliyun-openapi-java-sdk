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

package com.aliyuncs.alb.transform.v20200616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alb.model.v20200616.GetHealthCheckTemplateAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHealthCheckTemplateAttributeResponseUnmarshaller {

	public static GetHealthCheckTemplateAttributeResponse unmarshall(GetHealthCheckTemplateAttributeResponse getHealthCheckTemplateAttributeResponse, UnmarshallerContext _ctx) {
		
		getHealthCheckTemplateAttributeResponse.setRequestId(_ctx.stringValue("GetHealthCheckTemplateAttributeResponse.RequestId"));
		getHealthCheckTemplateAttributeResponse.setHealthCheckConnectPort(_ctx.integerValue("GetHealthCheckTemplateAttributeResponse.HealthCheckConnectPort"));
		getHealthCheckTemplateAttributeResponse.setHealthCheckHost(_ctx.stringValue("GetHealthCheckTemplateAttributeResponse.HealthCheckHost"));
		getHealthCheckTemplateAttributeResponse.setHealthCheckHttpVersion(_ctx.stringValue("GetHealthCheckTemplateAttributeResponse.HealthCheckHttpVersion"));
		getHealthCheckTemplateAttributeResponse.setHealthCheckTemplateId(_ctx.stringValue("GetHealthCheckTemplateAttributeResponse.HealthCheckTemplateId"));
		getHealthCheckTemplateAttributeResponse.setHealthCheckInterval(_ctx.integerValue("GetHealthCheckTemplateAttributeResponse.HealthCheckInterval"));
		getHealthCheckTemplateAttributeResponse.setHealthCheckMethod(_ctx.stringValue("GetHealthCheckTemplateAttributeResponse.HealthCheckMethod"));
		getHealthCheckTemplateAttributeResponse.setHealthCheckPath(_ctx.stringValue("GetHealthCheckTemplateAttributeResponse.HealthCheckPath"));
		getHealthCheckTemplateAttributeResponse.setHealthCheckProtocol(_ctx.stringValue("GetHealthCheckTemplateAttributeResponse.HealthCheckProtocol"));
		getHealthCheckTemplateAttributeResponse.setHealthCheckTemplateName(_ctx.stringValue("GetHealthCheckTemplateAttributeResponse.HealthCheckTemplateName"));
		getHealthCheckTemplateAttributeResponse.setHealthCheckTimeout(_ctx.integerValue("GetHealthCheckTemplateAttributeResponse.HealthCheckTimeout"));
		getHealthCheckTemplateAttributeResponse.setHealthyThreshold(_ctx.integerValue("GetHealthCheckTemplateAttributeResponse.HealthyThreshold"));
		getHealthCheckTemplateAttributeResponse.setUnhealthyThreshold(_ctx.integerValue("GetHealthCheckTemplateAttributeResponse.UnhealthyThreshold"));

		List<String> healthCheckCodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetHealthCheckTemplateAttributeResponse.HealthCheckCodes.Length"); i++) {
			healthCheckCodes.add(_ctx.stringValue("GetHealthCheckTemplateAttributeResponse.HealthCheckCodes["+ i +"]"));
		}
		getHealthCheckTemplateAttributeResponse.setHealthCheckCodes(healthCheckCodes);
	 
	 	return getHealthCheckTemplateAttributeResponse;
	}
}