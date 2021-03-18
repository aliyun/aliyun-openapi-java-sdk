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
import com.aliyuncs.vpc.model.v20160428.ListTrafficMirrorFiltersResponse.TrafficMirrorFilter.TrafficMirrorRule;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrafficMirrorFiltersResponseUnmarshaller {

	public static ListTrafficMirrorFiltersResponse unmarshall(ListTrafficMirrorFiltersResponse listTrafficMirrorFiltersResponse, UnmarshallerContext _ctx) {
		
		listTrafficMirrorFiltersResponse.setRequestId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.RequestId"));
		listTrafficMirrorFiltersResponse.setNextToken(_ctx.stringValue("ListTrafficMirrorFiltersResponse.NextToken"));
		listTrafficMirrorFiltersResponse.setTotalCount(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TotalCount"));

		List<TrafficMirrorFilter> trafficMirrorFilters = new ArrayList<TrafficMirrorFilter>();
		for (int i = 0; i < _ctx.lengthValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters.Length"); i++) {
			TrafficMirrorFilter trafficMirrorFilter = new TrafficMirrorFilter();
			trafficMirrorFilter.setTrafficMirrorFilterName(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].TrafficMirrorFilterName"));
			trafficMirrorFilter.setTrafficMirrorFilterDescription(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].TrafficMirrorFilterDescription"));
			trafficMirrorFilter.setTrafficMirrorFilterId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].TrafficMirrorFilterId"));
			trafficMirrorFilter.setTrafficMirrorFilterStatus(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].TrafficMirrorFilterStatus"));

			List<TrafficMirrorRule> ingressRules = new ArrayList<TrafficMirrorRule>();
			for (int j = 0; j < _ctx.lengthValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules.Length"); j++) {
				TrafficMirrorRule trafficMirrorRule = new TrafficMirrorRule();
				trafficMirrorRule.setTrafficMirrorFilterRuleId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].TrafficMirrorFilterRuleId"));
				trafficMirrorRule.setTrafficMirrorFilterId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].TrafficMirrorFilterId"));
				trafficMirrorRule.setTrafficDirection(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].TrafficDirection"));
				trafficMirrorRule.setPriority(_ctx.integerValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].Priority"));
				trafficMirrorRule.setBizProtocol(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].Protocol"));
				trafficMirrorRule.setAction(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].Action"));
				trafficMirrorRule.setDestinationCidrBlock(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].DestinationCidrBlock"));
				trafficMirrorRule.setDestinationPortRange(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].DestinationPortRange"));
				trafficMirrorRule.setSourceCidrBlock(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].SourceCidrBlock"));
				trafficMirrorRule.setSourcePortRange(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].SourcePortRange"));
				trafficMirrorRule.setTrafficMirrorFilterRuleStatus(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].IngressRules["+ j +"].TrafficMirrorFilterRuleStatus"));

				ingressRules.add(trafficMirrorRule);
			}
			trafficMirrorFilter.setIngressRules(ingressRules);

			List<TrafficMirrorRule> egressRules = new ArrayList<TrafficMirrorRule>();
			for (int j = 0; j < _ctx.lengthValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules.Length"); j++) {
				TrafficMirrorRule trafficMirrorRule_ = new TrafficMirrorRule();
				trafficMirrorRule_.setTrafficMirrorFilterRuleId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].TrafficMirrorFilterRuleId"));
				trafficMirrorRule_.setTrafficMirrorFilterId(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].TrafficMirrorFilterId"));
				trafficMirrorRule_.setTrafficDirection(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].TrafficDirection"));
				trafficMirrorRule_.setPriority(_ctx.integerValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].Priority"));
				trafficMirrorRule_.setBizProtocol(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].Protocol"));
				trafficMirrorRule_.setAction(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].Action"));
				trafficMirrorRule_.setDestinationCidrBlock(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].DestinationCidrBlock"));
				trafficMirrorRule_.setDestinationPortRange(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].DestinationPortRange"));
				trafficMirrorRule_.setSourceCidrBlock(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].SourceCidrBlock"));
				trafficMirrorRule_.setSourcePortRange(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].SourcePortRange"));
				trafficMirrorRule_.setTrafficMirrorFilterRuleStatus(_ctx.stringValue("ListTrafficMirrorFiltersResponse.TrafficMirrorFilters["+ i +"].EgressRules["+ j +"].TrafficMirrorFilterRuleStatus"));

				egressRules.add(trafficMirrorRule_);
			}
			trafficMirrorFilter.setEgressRules(egressRules);

			trafficMirrorFilters.add(trafficMirrorFilter);
		}
		listTrafficMirrorFiltersResponse.setTrafficMirrorFilters(trafficMirrorFilters);
	 
	 	return listTrafficMirrorFiltersResponse;
	}
}