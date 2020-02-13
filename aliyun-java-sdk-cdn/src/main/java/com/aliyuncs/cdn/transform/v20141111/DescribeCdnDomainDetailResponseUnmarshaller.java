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

import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainDetailResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainDetailResponse.GetDomainDetailModel;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDomainDetailResponseUnmarshaller {

	public static DescribeCdnDomainDetailResponse unmarshall(DescribeCdnDomainDetailResponse describeCdnDomainDetailResponse, UnmarshallerContext _ctx) {
		
		describeCdnDomainDetailResponse.setRequestId(_ctx.stringValue("DescribeCdnDomainDetailResponse.RequestId"));

		GetDomainDetailModel getDomainDetailModel = new GetDomainDetailModel();
		getDomainDetailModel.setGmtCreated(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.GmtCreated"));
		getDomainDetailModel.setGmtModified(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.GmtModified"));
		getDomainDetailModel.setSourceType(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceType"));
		getDomainDetailModel.setDomainStatus(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.DomainStatus"));
		getDomainDetailModel.setSourcePort(_ctx.integerValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourcePort"));
		getDomainDetailModel.setCdnType(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.CdnType"));
		getDomainDetailModel.setCname(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Cname"));
		getDomainDetailModel.setHttpsCname(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.HttpsCname"));
		getDomainDetailModel.setDomainName(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.DomainName"));
		getDomainDetailModel.setDescription(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Description"));
		getDomainDetailModel.setServerCertificateStatus(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.ServerCertificateStatus"));
		getDomainDetailModel.setRegion(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Region"));
		getDomainDetailModel.setScope(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Scope"));
		getDomainDetailModel.setResourceGroupId(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.ResourceGroupId"));

		List<String> sources = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Sources.Length"); i++) {
			sources.add(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Sources["+ i +"]"));
		}
		getDomainDetailModel.setSources(sources);

		List<SourceModel> sourceModels = new ArrayList<SourceModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels.Length"); i++) {
			SourceModel sourceModel = new SourceModel();
			sourceModel.setContent(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Content"));
			sourceModel.setType(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Type"));
			sourceModel.setPort(_ctx.integerValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Port"));
			sourceModel.setEnabled(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Enabled"));
			sourceModel.setPriority(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Priority"));

			sourceModels.add(sourceModel);
		}
		getDomainDetailModel.setSourceModels(sourceModels);
		describeCdnDomainDetailResponse.setGetDomainDetailModel(getDomainDetailModel);
	 
	 	return describeCdnDomainDetailResponse;
	}
}