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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.ListTrafficMirrorFiltersResponse;
import com.aliyuncs.vpc.model.v20160428.ListTrafficMirrorFiltersResponse.TrafficMirrorFilter;
import com.aliyuncs.vpc.model.v20160428.ListTrafficMirrorFiltersResponse.TrafficMirrorFilter.Tag;
import com.aliyuncs.vpc.model.v20160428.ListTrafficMirrorFiltersResponse.TrafficMirrorFilter.TrafficMirrorRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrafficMirrorFiltersResponseUnmarshaller {

	public static ListTrafficMirrorFiltersResponse unmarshall(ListTrafficMirrorFiltersResponse listTrafficMirrorFiltersResponse, UnmarshallerContext _ctx) {
		
		listTrafficMirrorFiltersResponse.setRequestId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.RequestId"));
		listTrafficMirrorFiltersResponse.setNextToken(_ctx.stringValue("ListTrafficMirrorFiltersResponse.NextToken"));
		listTrafficMirrorFiltersResponse.setTotalCount(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TotalCount"));
		listTrafficMirrorFiltersResponse.setMaxResults(_ctx.integerValue("ListTrafficMirrorFiltersResponse.MaxResults"));
		listTrafficMirrorFiltersResponse.setCount(_ctx.integerValue("ListTrafficMirrorFiltersResponse.Count"));

		List<TrafficMirrorFilter> trafficMirrorFilters = new ArrayList<TrafficMirrorFilter>();
		for (int i = 0; i < _ctx.lengthValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters.Length"); i++) {
			TrafficMirrorFilter trafficMirrorFilter = new TrafficMirrorFilter();
			trafficMirrorFilter.setTrafficMirrorFilterStatus(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].TrafficMirrorFilterStatus"));
			trafficMirrorFilter.setTrafficMirrorFilterDescription(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].TrafficMirrorFilterDescription"));
			trafficMirrorFilter.setTrafficMirrorFilterId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].TrafficMirrorFilterId"));
			trafficMirrorFilter.setTrafficMirrorFilterName(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].TrafficMirrorFilterName"));
			trafficMirrorFilter.setResourceGroupId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].ResourceGroupId"));
			trafficMirrorFilter.setCreationTime(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].CreationTime"));

			List<TrafficMirrorRule> ingressRules = new ArrayList<TrafficMirrorRule>();
			for (int j = 0; j < _ctx.lengthValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules.Length"); j++) {
				TrafficMirrorRule trafficMirrorRule = new TrafficMirrorRule();
				trafficMirrorRule.setTrafficMirrorFilterRuleStatus(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].TrafficMirrorFilterRuleStatus"));
				trafficMirrorRule.setAction(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].Action"));
				trafficMirrorRule.setSourceCidrBlock(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].SourceCidrBlock"));
				trafficMirrorRule.setTrafficDirection(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].TrafficDirection"));
				trafficMirrorRule.setBizProtocol(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].Protocol"));
				trafficMirrorRule.setIpVersion(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].IpVersion"));
				trafficMirrorRule.setDestinationPortRange(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].DestinationPortRange"));
				trafficMirrorRule.setTrafficMirrorFilterRuleId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].TrafficMirrorFilterRuleId"));
				trafficMirrorRule.setDestinationCidrBlock(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].DestinationCidrBlock"));
				trafficMirrorRule.setPriority(_ctx.integerValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].Priority"));
				trafficMirrorRule.setTrafficMirrorFilterId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].TrafficMirrorFilterId"));
				trafficMirrorRule.setSourcePortRange(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].SourcePortRange"));

				ingressRules.add(trafficMirrorRule);
			}
			trafficMirrorFilter.setIngressRules(ingressRules);

			List<TrafficMirrorRule> egressRules = new ArrayList<TrafficMirrorRule>();
			for (int j = 0; j < _ctx.lengthValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules.Length"); j++) {
				TrafficMirrorRule trafficMirrorRule1 = new TrafficMirrorRule();
				trafficMirrorRule1.setTrafficMirrorFilterRuleStatus(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].TrafficMirrorFilterRuleStatus"));
				trafficMirrorRule1.setAction(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].Action"));
				trafficMirrorRule1.setSourceCidrBlock(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].SourceCidrBlock"));
				trafficMirrorRule1.setTrafficDirection(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].TrafficDirection"));
				trafficMirrorRule1.setBizProtocol(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].Protocol"));
				trafficMirrorRule1.setIpVersion(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].IpVersion"));
				trafficMirrorRule1.setDestinationPortRange(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].DestinationPortRange"));
				trafficMirrorRule1.setTrafficMirrorFilterRuleId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].TrafficMirrorFilterRuleId"));
				trafficMirrorRule1.setDestinationCidrBlock(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].DestinationCidrBlock"));
				trafficMirrorRule1.setPriority(_ctx.integerValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].Priority"));
				trafficMirrorRule1.setTrafficMirrorFilterId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].TrafficMirrorFilterId"));
				trafficMirrorRule1.setSourcePortRange(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].SourcePortRange"));

				egressRules.add(trafficMirrorRule1);
			}
			trafficMirrorFilter.setEgressRules(egressRules);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			trafficMirrorFilter.setTags(tags);

			trafficMirrorFilters.add(trafficMirrorFilter);
		}
		listTrafficMirrorFiltersResponse.setTrafficMirrorFilters(trafficMirrorFilters);
	 
	 	return listTrafficMirrorFiltersResponse;
	}
}