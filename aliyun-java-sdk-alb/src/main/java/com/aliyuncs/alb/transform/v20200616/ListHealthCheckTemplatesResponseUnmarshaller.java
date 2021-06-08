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

import com.aliyuncs.alb.model.v20200616.ListHealthCheckTemplatesResponse;
import com.aliyuncs.alb.model.v20200616.ListHealthCheckTemplatesResponse.HealthCheckTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListHealthCheckTemplatesResponseUnmarshaller {

	public static ListHealthCheckTemplatesResponse unmarshall(ListHealthCheckTemplatesResponse listHealthCheckTemplatesResponse, UnmarshallerContext _ctx) {
		
		listHealthCheckTemplatesResponse.setRequestId(_ctx.stringValue("ListHealthCheckTemplatesResponse.RequestId"));
		listHealthCheckTemplatesResponse.setMaxResults(_ctx.integerValue("ListHealthCheckTemplatesResponse.MaxResults"));
		listHealthCheckTemplatesResponse.setNextToken(_ctx.stringValue("ListHealthCheckTemplatesResponse.NextToken"));
		listHealthCheckTemplatesResponse.setTotalCount(_ctx.integerValue("ListHealthCheckTemplatesResponse.TotalCount"));

		List<HealthCheckTemplate> healthCheckTemplates = new ArrayList<HealthCheckTemplate>();
		for (int i = 0; i < _ctx.lengthValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates.Length"); i++) {
			HealthCheckTemplate healthCheckTemplate = new HealthCheckTemplate();
			healthCheckTemplate.setHealthCheckConnectPort(_ctx.integerValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckConnectPort"));
			healthCheckTemplate.setHealthCheckHost(_ctx.stringValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckHost"));
			healthCheckTemplate.setHealthCheckHttpVersion(_ctx.stringValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckHttpVersion"));
			healthCheckTemplate.setHealthCheckInterval(_ctx.integerValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckInterval"));
			healthCheckTemplate.setHealthCheckMethod(_ctx.stringValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckMethod"));
			healthCheckTemplate.setHealthCheckPath(_ctx.stringValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckPath"));
			healthCheckTemplate.setHealthCheckProtocol(_ctx.stringValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckProtocol"));
			healthCheckTemplate.setHealthCheckTemplateId(_ctx.stringValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckTemplateId"));
			healthCheckTemplate.setHealthCheckTemplateName(_ctx.stringValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckTemplateName"));
			healthCheckTemplate.setHealthCheckTimeout(_ctx.integerValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckTimeout"));
			healthCheckTemplate.setHealthyThreshold(_ctx.integerValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthyThreshold"));
			healthCheckTemplate.setUnhealthyThreshold(_ctx.integerValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].UnhealthyThreshold"));

			List<String> healthCheckCodes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckCodes.Length"); j++) {
				healthCheckCodes.add(_ctx.stringValue("ListHealthCheckTemplatesResponse.HealthCheckTemplates["+ i +"].HealthCheckCodes["+ j +"]"));
			}
			healthCheckTemplate.setHealthCheckCodes(healthCheckCodes);

			healthCheckTemplates.add(healthCheckTemplate);
		}
		listHealthCheckTemplatesResponse.setHealthCheckTemplates(healthCheckTemplates);
	 
	 	return listHealthCheckTemplatesResponse;
	}
}