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

package com.aliyuncs.dcdn.transform.v20180115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserDomainsByFuncResponse;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserDomainsByFuncResponse.PageData;
import com.aliyuncs.dcdn.model.v20180115.DescribeDcdnUserDomainsByFuncResponse.PageData.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDcdnUserDomainsByFuncResponseUnmarshaller {

	public static DescribeDcdnUserDomainsByFuncResponse unmarshall(DescribeDcdnUserDomainsByFuncResponse describeDcdnUserDomainsByFuncResponse, UnmarshallerContext _ctx) {
		
		describeDcdnUserDomainsByFuncResponse.setRequestId(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.RequestId"));
		describeDcdnUserDomainsByFuncResponse.setPageNumber(_ctx.longValue("DescribeDcdnUserDomainsByFuncResponse.PageNumber"));
		describeDcdnUserDomainsByFuncResponse.setPageSize(_ctx.longValue("DescribeDcdnUserDomainsByFuncResponse.PageSize"));
		describeDcdnUserDomainsByFuncResponse.setTotalCount(_ctx.longValue("DescribeDcdnUserDomainsByFuncResponse.TotalCount"));

		List<PageData> domains = new ArrayList<PageData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDcdnUserDomainsByFuncResponse.Domains.Length"); i++) {
			PageData pageData = new PageData();
			pageData.setDomainName(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].DomainName"));
			pageData.setCname(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].Cname"));
			pageData.setCdnType(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].CdnType"));
			pageData.setDomainStatus(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].DomainStatus"));
			pageData.setGmtCreated(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].GmtCreated"));
			pageData.setGmtModified(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].GmtModified"));
			pageData.setDescription(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].Description"));
			pageData.setSslProtocol(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].SslProtocol"));
			pageData.setResourceGroupId(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].ResourceGroupId"));
			pageData.setSandbox(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].Sandbox"));

			List<Source> sources = new ArrayList<Source>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].Sources.Length"); j++) {
				Source source = new Source();
				source.setType(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].Sources["+ j +"].Type"));
				source.setContent(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].Sources["+ j +"].Content"));
				source.setPort(_ctx.integerValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].Sources["+ j +"].Port"));
				source.setPriority(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].Sources["+ j +"].Priority"));
				source.setWeight(_ctx.stringValue("DescribeDcdnUserDomainsByFuncResponse.Domains["+ i +"].Sources["+ j +"].Weight"));

				sources.add(source);
			}
			pageData.setSources(sources);

			domains.add(pageData);
		}
		describeDcdnUserDomainsByFuncResponse.setDomains(domains);
	 
	 	return describeDcdnUserDomainsByFuncResponse;
	}
}