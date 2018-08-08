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

package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainBaseDetailResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDomainBaseDetailResponseUnmarshaller {

	public static DescribeCdnDomainBaseDetailResponse unmarshall(DescribeCdnDomainBaseDetailResponse describeCdnDomainBaseDetailResponse, UnmarshallerContext context) {
		
		describeCdnDomainBaseDetailResponse.setRequestId(context.stringValue("DescribeCdnDomainBaseDetailResponse.RequestId"));

		DomainBaseDetailModel domainBaseDetailModel = new DomainBaseDetailModel();
		domainBaseDetailModel.setCname(context.stringValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.Cname"));
		domainBaseDetailModel.setCdnType(context.stringValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.CdnType"));
		domainBaseDetailModel.setDomainStatus(context.stringValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.DomainStatus"));
		domainBaseDetailModel.setSourceType(context.stringValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.SourceType"));
		domainBaseDetailModel.setRegion(context.stringValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.Region"));
		domainBaseDetailModel.setDomainName(context.stringValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.DomainName"));
		domainBaseDetailModel.setRemark(context.stringValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.Remark"));
		domainBaseDetailModel.setGmtModified(context.stringValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.GmtModified"));
		domainBaseDetailModel.setGmtCreated(context.stringValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.GmtCreated"));

		List<String> sources = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.Sources.Length"); i++) {
			sources.add(context.stringValue("DescribeCdnDomainBaseDetailResponse.DomainBaseDetailModel.Sources["+ i +"]"));
		}
		domainBaseDetailModel.setSources(sources);
		describeCdnDomainBaseDetailResponse.setDomainBaseDetailModel(domainBaseDetailModel);
	 
	 	return describeCdnDomainBaseDetailResponse;
	}
}