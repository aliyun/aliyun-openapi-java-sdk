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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetLoadBalancersForAbcResponse;
import com.aliyuncs.swas.model.v20170810.GetLoadBalancersForAbcResponse.LoadBalancersItem;
import com.aliyuncs.swas.model.v20170810.GetLoadBalancersForAbcResponse.LoadBalancersItem.ConfigurationOptions;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLoadBalancersForAbcResponseUnmarshaller {

	public static GetLoadBalancersForAbcResponse unmarshall(GetLoadBalancersForAbcResponse getLoadBalancersForAbcResponse, UnmarshallerContext _ctx) {
		
		getLoadBalancersForAbcResponse.setRequestId(_ctx.stringValue("GetLoadBalancersForAbcResponse.RequestId"));
		getLoadBalancersForAbcResponse.setSuccess(_ctx.booleanValue("GetLoadBalancersForAbcResponse.Success"));
		getLoadBalancersForAbcResponse.setCode(_ctx.stringValue("GetLoadBalancersForAbcResponse.Code"));
		getLoadBalancersForAbcResponse.setPageNo(_ctx.integerValue("GetLoadBalancersForAbcResponse.PageNo"));
		getLoadBalancersForAbcResponse.setMessage(_ctx.stringValue("GetLoadBalancersForAbcResponse.Message"));
		getLoadBalancersForAbcResponse.setPageSize(_ctx.integerValue("GetLoadBalancersForAbcResponse.PageSize"));
		getLoadBalancersForAbcResponse.setTotalCount(_ctx.integerValue("GetLoadBalancersForAbcResponse.TotalCount"));

		List<LoadBalancersItem> loadBalancers = new ArrayList<LoadBalancersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancersForAbcResponse.LoadBalancers.Length"); i++) {
			LoadBalancersItem loadBalancersItem = new LoadBalancersItem();
			loadBalancersItem.setCreationTime(_ctx.longValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].CreationTime"));
			loadBalancersItem.setDnsName(_ctx.stringValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].DnsName"));
			loadBalancersItem.setLoadBalancerId(_ctx.stringValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].LoadBalancerId"));
			loadBalancersItem.setUserId(_ctx.longValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].UserId"));
			loadBalancersItem.setChargeType(_ctx.stringValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].ChargeType"));
			loadBalancersItem.setHealthCheckPath(_ctx.stringValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].HealthCheckPath"));
			loadBalancersItem.setBusinessStatus(_ctx.stringValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].BusinessStatus"));
			loadBalancersItem.setRegionId(_ctx.stringValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].RegionId"));
			loadBalancersItem.setLoadBalancerName(_ctx.stringValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].LoadBalancerName"));
			loadBalancersItem.setLoadBalancerStatus(_ctx.stringValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].LoadBalancerStatus"));
			loadBalancersItem.setExpiredTime(_ctx.longValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].ExpiredTime"));
			loadBalancersItem.setId(_ctx.longValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].Id"));
			loadBalancersItem.setLoadBalancerEdition(_ctx.stringValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].LoadBalancerEdition"));

			ConfigurationOptions configurationOptions = new ConfigurationOptions();
			configurationOptions.setSessionStickinessEnabled(_ctx.booleanValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].ConfigurationOptions.SessionStickinessEnabled"));
			configurationOptions.setSessionStickinessDurationSeconds(_ctx.longValue("GetLoadBalancersForAbcResponse.LoadBalancers["+ i +"].ConfigurationOptions.SessionStickinessDurationSeconds"));
			loadBalancersItem.setConfigurationOptions(configurationOptions);

			loadBalancers.add(loadBalancersItem);
		}
		getLoadBalancersForAbcResponse.setLoadBalancers(loadBalancers);
	 
	 	return getLoadBalancersForAbcResponse;
	}
}