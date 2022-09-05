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

import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainDetailResponse;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainDetailResponse.GetDomainDetailModel;
import com.aliyuncs.cdn.model.v20180510.DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDomainDetailResponseUnmarshaller {

	public static DescribeCdnDomainDetailResponse unmarshall(DescribeCdnDomainDetailResponse describeCdnDomainDetailResponse, UnmarshallerContext _ctx) {
		
		describeCdnDomainDetailResponse.setRequestId(_ctx.stringValue("DescribeCdnDomainDetailResponse.RequestId"));

		GetDomainDetailModel getDomainDetailModel = new GetDomainDetailModel();
		getDomainDetailModel.setGmtCreated(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.GmtCreated"));
		getDomainDetailModel.setDescription(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Description"));
		getDomainDetailModel.setHttpsCname(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.HttpsCname"));
		getDomainDetailModel.setResourceGroupId(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.ResourceGroupId"));
		getDomainDetailModel.setServerCertificateStatus(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.ServerCertificateStatus"));
		getDomainDetailModel.setScope(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Scope"));
		getDomainDetailModel.setDomainStatus(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.DomainStatus"));
		getDomainDetailModel.setCname(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Cname"));
		getDomainDetailModel.setGmtModified(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.GmtModified"));
		getDomainDetailModel.setCdnType(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.CdnType"));
		getDomainDetailModel.setDomainName(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.DomainName"));

		List<SourceModel> sourceModels = new ArrayList<SourceModel>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels.Length"); i++) {
			SourceModel sourceModel = new SourceModel();
			sourceModel.setType(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Type"));
			sourceModel.setWeight(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Weight"));
			sourceModel.setEnabled(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Enabled"));
			sourceModel.setPriority(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Priority"));
			sourceModel.setPort(_ctx.integerValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Port"));
			sourceModel.setContent(_ctx.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Content"));

			sourceModels.add(sourceModel);
		}
		getDomainDetailModel.setSourceModels(sourceModels);
		describeCdnDomainDetailResponse.setGetDomainDetailModel(getDomainDetailModel);
	 
	 	return describeCdnDomainDetailResponse;
	}
}