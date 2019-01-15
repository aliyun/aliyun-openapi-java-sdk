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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.DescribeVodUserDomainsResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodUserDomainsResponse.PageData;
import com.aliyuncs.vod.model.v20170321.DescribeVodUserDomainsResponse.PageData.Source;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodUserDomainsResponseUnmarshaller {

	public static DescribeVodUserDomainsResponse unmarshall(DescribeVodUserDomainsResponse describeVodUserDomainsResponse, UnmarshallerContext context) {
		
		describeVodUserDomainsResponse.setRequestId(context.stringValue("DescribeVodUserDomainsResponse.RequestId"));
		describeVodUserDomainsResponse.setPageNumber(context.longValue("DescribeVodUserDomainsResponse.PageNumber"));
		describeVodUserDomainsResponse.setPageSize(context.longValue("DescribeVodUserDomainsResponse.PageSize"));
		describeVodUserDomainsResponse.setTotalCount(context.longValue("DescribeVodUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < context.lengthValue("DescribeVodUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setCdnType(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].CdnType"));
			pageData.setDomainStatus(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].DomainStatus"));
			pageData.setGmtCreated(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Description"));
			pageData.setSslProtocol(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].SslProtocol"));
			pageData.setWeight(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Weight"));
			pageData.setResourceGroupId(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].ResourceGroupId"));
			pageData.setSandbox(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sandbox"));

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < context.lengthValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sources.Length"); j++) {
				Source source = new Source();
				source.setType(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Type"));
				source.setContent(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Content"));
				source.setPort(context.integerValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Port"));
				source.setPriority(context.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Priority"));

				sources.add(source);
			}
			pageData.setSources(sources);

			domains.add(pageData);
		}
		describeVodUserDomainsResponse.setDomains(domains);
	 
	 	return describeVodUserDomainsResponse;
	}
}