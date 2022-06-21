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

import com.aliyuncs.swas.model.v20170810.GetLoadBalancersResponse;
import com.aliyuncs.swas.model.v20170810.GetLoadBalancersResponse.LoadBalancersItem;
import com.aliyuncs.swas.model.v20170810.GetLoadBalancersResponse.LoadBalancersItem.ConfigurationOptions;
import com.aliyuncs.swas.model.v20170810.GetLoadBalancersResponse.LoadBalancersItem.InstanceHealthSummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLoadBalancersResponseUnmarshaller {

	public static GetLoadBalancersResponse unmarshall(GetLoadBalancersResponse getLoadBalancersResponse, UnmarshallerContext _ctx) {
		
		getLoadBalancersResponse.setRequestId(_ctx.stringValue("GetLoadBalancersResponse.RequestId"));
		getLoadBalancersResponse.setSuccess(_ctx.booleanValue("GetLoadBalancersResponse.Success"));
		getLoadBalancersResponse.setCode(_ctx.stringValue("GetLoadBalancersResponse.Code"));
		getLoadBalancersResponse.setPageNumber(_ctx.integerValue("GetLoadBalancersResponse.PageNumber"));
		getLoadBalancersResponse.setMessage(_ctx.stringValue("GetLoadBalancersResponse.Message"));
		getLoadBalancersResponse.setPageSize(_ctx.integerValue("GetLoadBalancersResponse.PageSize"));
		getLoadBalancersResponse.setTotalCount(_ctx.integerValue("GetLoadBalancersResponse.TotalCount"));

		List<LoadBalancersItem> loadBalancers = new ArrayList<LoadBalancersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancersResponse.LoadBalancers.Length"); i++) {
			LoadBalancersItem loadBalancersItem = new LoadBalancersItem();
			loadBalancersItem.setCreationTime(_ctx.longValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].CreationTime"));
			loadBalancersItem.setDNSName(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].DNSName"));
			loadBalancersItem.setLoadBalancerId(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerId"));
			loadBalancersItem.setUserId(_ctx.longValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].UserId"));
			loadBalancersItem.setChargeType(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].ChargeType"));
			loadBalancersItem.setHealthCheckPath(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].HealthCheckPath"));
			loadBalancersItem.setBussinessStatus(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].BussinessStatus"));
			loadBalancersItem.setRegionId(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].RegionId"));
			loadBalancersItem.setLoadBalancerStatus(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerStatus"));
			loadBalancersItem.setLoadBalancerName(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerName"));
			loadBalancersItem.setExpiredTime(_ctx.longValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].ExpiredTime"));
			loadBalancersItem.setAllocationId(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].AllocationId"));
			loadBalancersItem.setInstancePort(_ctx.integerValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].InstancePort"));
			loadBalancersItem.setId(_ctx.longValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].Id"));
			loadBalancersItem.setLoadBalancerEdition(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerEdition"));
			loadBalancersItem.setBandwidth(_ctx.longValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].Bandwidth"));

			ConfigurationOptions configurationOptions = new ConfigurationOptions();
			configurationOptions.setSessionStickinessEnabled(_ctx.booleanValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].ConfigurationOptions.SessionStickinessEnabled"));
			configurationOptions.setSessionStickinessDurationSeconds(_ctx.longValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].ConfigurationOptions.SessionStickinessDurationSeconds"));
			loadBalancersItem.setConfigurationOptions(configurationOptions);

			List<InstanceHealthSummaryItem> instanceHealthSummary = new ArrayList<InstanceHealthSummaryItem>();
			for (int j = 0; j < _ctx.lengthValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].InstanceHealthSummary.Length"); j++) {
				InstanceHealthSummaryItem instanceHealthSummaryItem = new InstanceHealthSummaryItem();
				instanceHealthSummaryItem.setInstanceHealth(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].InstanceHealthSummary["+ j +"].InstanceHealth"));
				instanceHealthSummaryItem.setInstanceId(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].InstanceHealthSummary["+ j +"].InstanceId"));
				instanceHealthSummaryItem.setInstanceHealthReason(_ctx.stringValue("GetLoadBalancersResponse.LoadBalancers["+ i +"].InstanceHealthSummary["+ j +"].InstanceHealthReason"));

				instanceHealthSummary.add(instanceHealthSummaryItem);
			}
			loadBalancersItem.setInstanceHealthSummary(instanceHealthSummary);

			loadBalancers.add(loadBalancersItem);
		}
		getLoadBalancersResponse.setLoadBalancers(loadBalancers);
	 
	 	return getLoadBalancersResponse;
	}
}