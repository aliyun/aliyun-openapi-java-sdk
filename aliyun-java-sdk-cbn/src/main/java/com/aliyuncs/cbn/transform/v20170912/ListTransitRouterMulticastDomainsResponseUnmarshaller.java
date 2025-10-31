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

package com.aliyuncs.cbn.transform.v20170912;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cbn.model.v20170912.ListTransitRouterMulticastDomainsResponse;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomain;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomain.Options;
import com.aliyuncs.cbn.model.v20170912.ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomain.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTransitRouterMulticastDomainsResponseUnmarshaller {

	public static ListTransitRouterMulticastDomainsResponse unmarshall(ListTransitRouterMulticastDomainsResponse listTransitRouterMulticastDomainsResponse, UnmarshallerContext _ctx) {
		
		listTransitRouterMulticastDomainsResponse.setRequestId(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.RequestId"));
		listTransitRouterMulticastDomainsResponse.setTotalCount(_ctx.integerValue("ListTransitRouterMulticastDomainsResponse.TotalCount"));
		listTransitRouterMulticastDomainsResponse.setMaxResults(_ctx.integerValue("ListTransitRouterMulticastDomainsResponse.MaxResults"));
		listTransitRouterMulticastDomainsResponse.setNextToken(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.NextToken"));

		List<TransitRouterMulticastDomain> transitRouterMulticastDomains = new ArrayList<TransitRouterMulticastDomain>();
		for (int i = 0; i < _ctx.lengthValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains.Length"); i++) {
			TransitRouterMulticastDomain transitRouterMulticastDomain = new TransitRouterMulticastDomain();
			transitRouterMulticastDomain.setTransitRouterMulticastDomainId(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].TransitRouterMulticastDomainId"));
			transitRouterMulticastDomain.setTransitRouterMulticastDomainName(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].TransitRouterMulticastDomainName"));
			transitRouterMulticastDomain.setTransitRouterMulticastDomainDescription(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].TransitRouterMulticastDomainDescription"));
			transitRouterMulticastDomain.setStatus(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].Status"));
			transitRouterMulticastDomain.setTransitRouterId(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].TransitRouterId"));
			transitRouterMulticastDomain.setRegionId(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].RegionId"));
			transitRouterMulticastDomain.setCenId(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].CenId"));

			Options options = new Options();
			options.setIgmpv2Support(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].Options.Igmpv2Support"));
			options.setStrictSourceControl(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].Options.StrictSourceControl"));
			transitRouterMulticastDomain.setOptions(options);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("ListTransitRouterMulticastDomainsResponse.TransitRouterMulticastDomains["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			transitRouterMulticastDomain.setTags(tags);

			transitRouterMulticastDomains.add(transitRouterMulticastDomain);
		}
		listTransitRouterMulticastDomainsResponse.setTransitRouterMulticastDomains(transitRouterMulticastDomains);
	 
	 	return listTransitRouterMulticastDomainsResponse;
	}
}