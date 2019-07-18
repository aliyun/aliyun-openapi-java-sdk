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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodUserDomainsResponseUnmarshaller {

	public static DescribeVodUserDomainsResponse unmarshall(DescribeVodUserDomainsResponse describeVodUserDomainsResponse, UnmarshallerContext _ctx) {
		
		describeVodUserDomainsResponse.setRequestId(_ctx.stringValue("DescribeVodUserDomainsResponse.RequestId"));
		describeVodUserDomainsResponse.setPageNumber(_ctx.longValue("DescribeVodUserDomainsResponse.PageNumber"));
		describeVodUserDomainsResponse.setPageSize(_ctx.longValue("DescribeVodUserDomainsResponse.PageSize"));
		describeVodUserDomainsResponse.setTotalCount(_ctx.longValue("DescribeVodUserDomainsResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodUserDomainsResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Cname"));
			pageData.setCdnType(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].CdnType"));
			pageData.setDomainStatus(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].DomainStatus"));
			pageData.setGmtCreated(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Description"));
			pageData.setSslProtocol(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].SslProtocol"));
			pageData.setWeight(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Weight"));
			pageData.setSandbox(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sandbox"));

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sources.Length"); j++) {
				Source source = new Source();
				source.setType(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Type"));
				source.setContent(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Content"));
				source.setPort(_ctx.integerValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Port"));
				source.setPriority(_ctx.stringValue("DescribeVodUserDomainsResponse.Domains["+ i +"].Sources["+ j +"].Priority"));

				sources.add(source);
			}
			pageData.setSources(sources);

			domains.add(pageData);
		}
		describeVodUserDomainsResponse.setDomains(domains);
	 
	 	return describeVodUserDomainsResponse;
	}
}