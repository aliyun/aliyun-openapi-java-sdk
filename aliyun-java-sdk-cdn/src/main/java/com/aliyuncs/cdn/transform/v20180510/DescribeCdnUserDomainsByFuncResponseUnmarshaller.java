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

package com.aliyuncs.cdn.transform.v20180510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserDomainsByFuncResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserDomainsByFuncResponse.PageData;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnUserDomainsByFuncResponse.PageData.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnUserDomainsByFuncResponseUnmarshaller {

	public static DescribeCdnUserDomainsByFuncResponse unmarshall(DescribeCdnUserDomainsByFuncResponse describeCdnUserDomainsByFuncResponse, UnmarshallerContext _ctx) {
		
		describeCdnUserDomainsByFuncResponse.setRequestId(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.RequestId"));
		describeCdnUserDomainsByFuncResponse.setPageNumber(_ctx.longValue("DescribeCdnUserDomainsByFuncResponse.PageNumber"));
		describeCdnUserDomainsByFuncResponse.setPageSize(_ctx.longValue("DescribeCdnUserDomainsByFuncResponse.PageSize"));
		describeCdnUserDomainsByFuncResponse.setTotalCount(_ctx.longValue("DescribeCdnUserDomainsByFuncResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnUserDomainsByFuncResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].Cname"));
			pageData.setCdnType(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].CdnType"));
			pageData.setDomainStatus(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].DomainStatus"));
			pageData.setGmtCreated(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].Description"));
			pageData.setSslProtocol(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].SslProtocol"));
			pageData.setResourceGroupId(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].ResourceGroupId"));
			pageData.setSandbox(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].Sandbox"));

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].Sources.Length"); j++) {
				Source source = new Source();
				source.setType(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].Sources["+ j +"].Type"));
				source.setContent(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].Sources["+ j +"].Content"));
				source.setPort(_ctx.integerValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].Sources["+ j +"].Port"));
				source.setPriority(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].Sources["+ j +"].Priority"));
				source.setWeight(_ctx.stringValue("DescribeCdnUserDomainsByFuncResponse.Domains["+ i +"].Sources["+ j +"].Weight"));

				sources.add(source);
			}
			pageData.setSources(sources);

			domains.add(pageData);
		}
		describeCdnUserDomainsByFuncResponse.setDomains(domains);
	 
	 	return describeCdnUserDomainsByFuncResponse;
	}
}