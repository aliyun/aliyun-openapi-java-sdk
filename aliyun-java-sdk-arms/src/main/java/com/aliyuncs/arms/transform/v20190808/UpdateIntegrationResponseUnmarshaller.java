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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.UpdateIntegrationResponse;
import com.aliyuncs.arms.model.v20190808.UpdateIntegrationResponse.Integration;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateIntegrationResponseUnmarshaller {

	public static UpdateIntegrationResponse unmarshall(UpdateIntegrationResponse updateIntegrationResponse, UnmarshallerContext _ctx) {
		
		updateIntegrationResponse.setRequestId(_ctx.stringValue("UpdateIntegrationResponse.RequestId"));

		Integration integration = new Integration();
		integration.setIntegrationId(_ctx.longValue("UpdateIntegrationResponse.Integration.IntegrationId"));
		integration.setIntegrationName(_ctx.stringValue("UpdateIntegrationResponse.Integration.IntegrationName"));
		integration.setIntegrationProductType(_ctx.stringValue("UpdateIntegrationResponse.Integration.IntegrationProductType"));
		integration.setDescription(_ctx.stringValue("UpdateIntegrationResponse.Integration.Description"));
		integration.setApiEndpoint(_ctx.stringValue("UpdateIntegrationResponse.Integration.ApiEndpoint"));
		integration.setShortToken(_ctx.stringValue("UpdateIntegrationResponse.Integration.ShortToken"));
		integration.setAutoRecover(_ctx.booleanValue("UpdateIntegrationResponse.Integration.AutoRecover"));
		integration.setRecoverTime(_ctx.longValue("UpdateIntegrationResponse.Integration.RecoverTime"));
		integration.setDuplicateKey(_ctx.stringValue("UpdateIntegrationResponse.Integration.DuplicateKey"));
		integration.setState(_ctx.booleanValue("UpdateIntegrationResponse.Integration.State"));
		integration.setLiveness(_ctx.stringValue("UpdateIntegrationResponse.Integration.Liveness"));

		List<Long> stat = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("UpdateIntegrationResponse.Integration.Stat.Length"); i++) {
			stat.add(_ctx.longValue("UpdateIntegrationResponse.Integration.Stat["+ i +"]"));
		}
		integration.setStat(stat);

		List<Map<Object, Object>> fieldRedefineRules = _ctx.listMapValue("UpdateIntegrationResponse.Integration.FieldRedefineRules");
		integration.setFieldRedefineRules(fieldRedefineRules);

		List<Map<Object, Object>> extendedFieldRedefineRules = _ctx.listMapValue("UpdateIntegrationResponse.Integration.ExtendedFieldRedefineRules");
		integration.setExtendedFieldRedefineRules(extendedFieldRedefineRules);
		updateIntegrationResponse.setIntegration(integration);
	 
	 	return updateIntegrationResponse;
	}
}