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

import com.aliyuncs.alb.model.v20200616.ListLoadBalancersResponse;
import com.aliyuncs.alb.model.v20200616.ListLoadBalancersResponse.LoadBalancer;
import com.aliyuncs.alb.model.v20200616.ListLoadBalancersResponse.LoadBalancer.AccessLogConfig;
import com.aliyuncs.alb.model.v20200616.ListLoadBalancersResponse.LoadBalancer.DeletionProtectionConfig;
import com.aliyuncs.alb.model.v20200616.ListLoadBalancersResponse.LoadBalancer.LoadBalancerBillingConfig;
import com.aliyuncs.alb.model.v20200616.ListLoadBalancersResponse.LoadBalancer.LoadBalancerOperationLock;
import com.aliyuncs.alb.model.v20200616.ListLoadBalancersResponse.LoadBalancer.ModificationProtectionConfig;
import com.aliyuncs.alb.model.v20200616.ListLoadBalancersResponse.LoadBalancer.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLoadBalancersResponseUnmarshaller {

	public static ListLoadBalancersResponse unmarshall(ListLoadBalancersResponse listLoadBalancersResponse, UnmarshallerContext _ctx) {
		
		listLoadBalancersResponse.setRequestId(_ctx.stringValue("ListLoadBalancersResponse.RequestId"));
		listLoadBalancersResponse.setMaxResults(_ctx.integerValue("ListLoadBalancersResponse.MaxResults"));
		listLoadBalancersResponse.setNextToken(_ctx.stringValue("ListLoadBalancersResponse.NextToken"));
		listLoadBalancersResponse.setTotalCount(_ctx.integerValue("ListLoadBalancersResponse.TotalCount"));

		List<LoadBalancer> loadBalancers = new ArrayList<LoadBalancer>();
		for (int i = 0; i < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers.Length"); i++) {
			LoadBalancer loadBalancer = new LoadBalancer();
			loadBalancer.setAddressAllocatedMode(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].AddressAllocatedMode"));
			loadBalancer.setAddressType(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].AddressType"));
			loadBalancer.setBandwidthPackageId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].BandwidthPackageId"));
			loadBalancer.setCreateTime(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].CreateTime"));
			loadBalancer.setDNSName(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].DNSName"));
			loadBalancer.setLoadBalancerBussinessStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerBussinessStatus"));
			loadBalancer.setLoadBalancerEdition(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerEdition"));
			loadBalancer.setLoadBalancerId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerId"));
			loadBalancer.setLoadBalancerName(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerName"));
			loadBalancer.setLoadBalancerStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerStatus"));
			loadBalancer.setResourceGroupId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ResourceGroupId"));
			loadBalancer.setVpcId(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].VpcId"));

			AccessLogConfig accessLogConfig = new AccessLogConfig();
			accessLogConfig.setLogProject(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].AccessLogConfig.LogProject"));
			accessLogConfig.setLogStore(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].AccessLogConfig.LogStore"));
			loadBalancer.setAccessLogConfig(accessLogConfig);

			DeletionProtectionConfig deletionProtectionConfig = new DeletionProtectionConfig();
			deletionProtectionConfig.setEnabled(_ctx.booleanValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].DeletionProtectionConfig.Enabled"));
			deletionProtectionConfig.setEnabledTime(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].DeletionProtectionConfig.EnabledTime"));
			loadBalancer.setDeletionProtectionConfig(deletionProtectionConfig);

			LoadBalancerBillingConfig loadBalancerBillingConfig = new LoadBalancerBillingConfig();
			loadBalancerBillingConfig.setPayType(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerBillingConfig.PayType"));
			loadBalancer.setLoadBalancerBillingConfig(loadBalancerBillingConfig);

			ModificationProtectionConfig modificationProtectionConfig = new ModificationProtectionConfig();
			modificationProtectionConfig.setReason(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ModificationProtectionConfig.Reason"));
			modificationProtectionConfig.setStatus(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].ModificationProtectionConfig.Status"));
			loadBalancer.setModificationProtectionConfig(modificationProtectionConfig);

			List<LoadBalancerOperationLock> loadBalancerOperationLocks = new ArrayList<LoadBalancerOperationLock>();
			for (int j = 0; j < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerOperationLocks.Length"); j++) {
				LoadBalancerOperationLock loadBalancerOperationLock = new LoadBalancerOperationLock();
				loadBalancerOperationLock.setLockReason(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerOperationLocks["+ j +"].LockReason"));
				loadBalancerOperationLock.setLockType(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerOperationLocks["+ j +"].LockType"));

				loadBalancerOperationLocks.add(loadBalancerOperationLock);
			}
			loadBalancer.setLoadBalancerOperationLocks(loadBalancerOperationLocks);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListLoadBalancersResponse.LoadBalancers["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			loadBalancer.setTags(tags);

			loadBalancers.add(loadBalancer);
		}
		listLoadBalancersResponse.setLoadBalancers(loadBalancers);
	 
	 	return listLoadBalancersResponse;
	}
}