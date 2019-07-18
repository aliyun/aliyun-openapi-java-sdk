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

import com.aliyuncs.vod.model.v20170321.DescribeVodDomainDetailResponse;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainDetailResponse.DomainDetail;
import com.aliyuncs.vod.model.v20170321.DescribeVodDomainDetailResponse.DomainDetail.Source;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVodDomainDetailResponseUnmarshaller {

	public static DescribeVodDomainDetailResponse unmarshall(DescribeVodDomainDetailResponse describeVodDomainDetailResponse, UnmarshallerContext _ctx) {
		
		describeVodDomainDetailResponse.setRequestId(_ctx.stringValue("DescribeVodDomainDetailResponse.RequestId"));

		DomainDetail domainDetail = new DomainDetail();
		domainDetail.setGmtCreated(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.GmtCreated"));
		domainDetail.setGmtModified(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.GmtModified"));
		domainDetail.setDomainStatus(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.DomainStatus"));
		domainDetail.setCname(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.Cname"));
		domainDetail.setDomainName(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.DomainName"));
		domainDetail.setDescription(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.Description"));
		domainDetail.setSSLProtocol(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.SSLProtocol"));
		domainDetail.setSSLPub(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.SSLPub"));
		domainDetail.setScope(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.Scope"));
		domainDetail.setCertName(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.CertName"));
		domainDetail.setWeight(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.Weight"));

		List<Source> sources = new ArrayList<Source>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVodDomainDetailResponse.DomainDetail.Sources.Length"); i++) {
			Source source = new Source();
			source.setContent(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.Sources["+ i +"].Content"));
			source.setType(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.Sources["+ i +"].Type"));
			source.setPort(_ctx.integerValue("DescribeVodDomainDetailResponse.DomainDetail.Sources["+ i +"].Port"));
			source.setEnabled(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.Sources["+ i +"].Enabled"));
			source.setPriority(_ctx.stringValue("DescribeVodDomainDetailResponse.DomainDetail.Sources["+ i +"].Priority"));

			sources.add(source);
		}
		domainDetail.setSources(sources);
		describeVodDomainDetailResponse.setDomainDetail(domainDetail);
	 
	 	return describeVodDomainDetailResponse;
	}
}