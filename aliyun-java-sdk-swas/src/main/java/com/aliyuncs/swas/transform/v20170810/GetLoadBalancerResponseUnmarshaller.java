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

import com.aliyuncs.swas.model.v20170810.GetLoadBalancerResponse;
import com.aliyuncs.swas.model.v20170810.GetLoadBalancerResponse.ConfigurationOptions;
import com.aliyuncs.swas.model.v20170810.GetLoadBalancerResponse.InstanceHealthSummaryItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLoadBalancerResponseUnmarshaller {

	public static GetLoadBalancerResponse unmarshall(GetLoadBalancerResponse getLoadBalancerResponse, UnmarshallerContext _ctx) {
		
		getLoadBalancerResponse.setRequestId(_ctx.stringValue("GetLoadBalancerResponse.RequestId"));
		getLoadBalancerResponse.setCreationTime(_ctx.longValue("GetLoadBalancerResponse.CreationTime"));
		getLoadBalancerResponse.setDNSName(_ctx.stringValue("GetLoadBalancerResponse.DNSName"));
		getLoadBalancerResponse.setSuccess(_ctx.booleanValue("GetLoadBalancerResponse.Success"));
		getLoadBalancerResponse.setLoadBalancerId(_ctx.stringValue("GetLoadBalancerResponse.LoadBalancerId"));
		getLoadBalancerResponse.setChargeType(_ctx.stringValue("GetLoadBalancerResponse.ChargeType"));
		getLoadBalancerResponse.setUserId(_ctx.longValue("GetLoadBalancerResponse.UserId"));
		getLoadBalancerResponse.setMessage(_ctx.stringValue("GetLoadBalancerResponse.Message"));
		getLoadBalancerResponse.setHealthCheckPath(_ctx.stringValue("GetLoadBalancerResponse.HealthCheckPath"));
		getLoadBalancerResponse.setBussinessStatus(_ctx.stringValue("GetLoadBalancerResponse.BussinessStatus"));
		getLoadBalancerResponse.setRegionId(_ctx.stringValue("GetLoadBalancerResponse.RegionId"));
		getLoadBalancerResponse.setLoadBalancerStatus(_ctx.stringValue("GetLoadBalancerResponse.LoadBalancerStatus"));
		getLoadBalancerResponse.setLoadBalancerName(_ctx.stringValue("GetLoadBalancerResponse.LoadBalancerName"));
		getLoadBalancerResponse.setExpiredTime(_ctx.longValue("GetLoadBalancerResponse.ExpiredTime"));
		getLoadBalancerResponse.setAllocationId(_ctx.stringValue("GetLoadBalancerResponse.AllocationId"));
		getLoadBalancerResponse.setCode(_ctx.stringValue("GetLoadBalancerResponse.Code"));
		getLoadBalancerResponse.setInstancePort(_ctx.integerValue("GetLoadBalancerResponse.InstancePort"));
		getLoadBalancerResponse.setId(_ctx.longValue("GetLoadBalancerResponse.Id"));
		getLoadBalancerResponse.setLoadBalancerEdition(_ctx.stringValue("GetLoadBalancerResponse.LoadBalancerEdition"));

		ConfigurationOptions configurationOptions = new ConfigurationOptions();
		configurationOptions.setSessionStickinessEnabled(_ctx.booleanValue("GetLoadBalancerResponse.ConfigurationOptions.SessionStickinessEnabled"));
		configurationOptions.setSessionStickinessDurationSeconds(_ctx.longValue("GetLoadBalancerResponse.ConfigurationOptions.SessionStickinessDurationSeconds"));
		getLoadBalancerResponse.setConfigurationOptions(configurationOptions);

		List<InstanceHealthSummaryItem> instanceHealthSummary = new ArrayList<InstanceHealthSummaryItem>();
		for (int i = 0; i < _ctx.lengthValue("GetLoadBalancerResponse.InstanceHealthSummary.Length"); i++) {
			InstanceHealthSummaryItem instanceHealthSummaryItem = new InstanceHealthSummaryItem();
			instanceHealthSummaryItem.setInstanceHealth(_ctx.stringValue("GetLoadBalancerResponse.InstanceHealthSummary["+ i +"].InstanceHealth"));
			instanceHealthSummaryItem.setInstanceId(_ctx.stringValue("GetLoadBalancerResponse.InstanceHealthSummary["+ i +"].InstanceId"));
			instanceHealthSummaryItem.setInstanceHealthReason(_ctx.stringValue("GetLoadBalancerResponse.InstanceHealthSummary["+ i +"].InstanceHealthReason"));

			instanceHealthSummary.add(instanceHealthSummaryItem);
		}
		getLoadBalancerResponse.setInstanceHealthSummary(instanceHealthSummary);
	 
	 	return getLoadBalancerResponse;
	}
}