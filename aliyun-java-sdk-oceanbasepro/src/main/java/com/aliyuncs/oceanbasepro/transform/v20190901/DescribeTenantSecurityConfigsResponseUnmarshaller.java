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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantSecurityConfigsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantSecurityConfigsResponse.Configs;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigsItem.SecurityConfigsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTenantSecurityConfigsResponseUnmarshaller {

	public static DescribeTenantSecurityConfigsResponse unmarshall(DescribeTenantSecurityConfigsResponse describeTenantSecurityConfigsResponse, UnmarshallerContext _ctx) {
		
		describeTenantSecurityConfigsResponse.setRequestId(_ctx.stringValue("DescribeTenantSecurityConfigsResponse.RequestId"));

		Configs configs = new Configs();
		configs.setTotalCheckCount(_ctx.integerValue("DescribeTenantSecurityConfigsResponse.Configs.TotalCheckCount"));
		configs.setTotalRiskCount(_ctx.integerValue("DescribeTenantSecurityConfigsResponse.Configs.TotalRiskCount"));

		List<TenantSecurityConfigsItem> tenantSecurityConfigs = new ArrayList<TenantSecurityConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigs.Length"); i++) {
			TenantSecurityConfigsItem tenantSecurityConfigsItem = new TenantSecurityConfigsItem();
			tenantSecurityConfigsItem.setTenantId(_ctx.stringValue("DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigs["+ i +"].TenantId"));
			tenantSecurityConfigsItem.setTenantName(_ctx.stringValue("DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigs["+ i +"].TenantName"));
			tenantSecurityConfigsItem.setRiskCount(_ctx.integerValue("DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigs["+ i +"].RiskCount"));

			List<SecurityConfigsItem> securityConfigs = new ArrayList<SecurityConfigsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigs["+ i +"].SecurityConfigs.Length"); j++) {
				SecurityConfigsItem securityConfigsItem = new SecurityConfigsItem();
				securityConfigsItem.setConfigGroup(_ctx.stringValue("DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigs["+ i +"].SecurityConfigs["+ j +"].ConfigGroup"));
				securityConfigsItem.setConfigName(_ctx.stringValue("DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigs["+ i +"].SecurityConfigs["+ j +"].ConfigName"));
				securityConfigsItem.setRisk(_ctx.booleanValue("DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigs["+ i +"].SecurityConfigs["+ j +"].Risk"));
				securityConfigsItem.setRiskDescription(_ctx.stringValue("DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigs["+ i +"].SecurityConfigs["+ j +"].RiskDescription"));
				securityConfigsItem.setConfigDescription(_ctx.stringValue("DescribeTenantSecurityConfigsResponse.Configs.TenantSecurityConfigs["+ i +"].SecurityConfigs["+ j +"].ConfigDescription"));

				securityConfigs.add(securityConfigsItem);
			}
			tenantSecurityConfigsItem.setSecurityConfigs(securityConfigs);

			tenantSecurityConfigs.add(tenantSecurityConfigsItem);
		}
		configs.setTenantSecurityConfigs(tenantSecurityConfigs);
		describeTenantSecurityConfigsResponse.setConfigs(configs);
	 
	 	return describeTenantSecurityConfigsResponse;
	}
}