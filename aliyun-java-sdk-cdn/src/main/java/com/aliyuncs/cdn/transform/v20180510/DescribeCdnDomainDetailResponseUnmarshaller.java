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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDomainDetailResponseUnmarshaller {

	public static DescribeCdnDomainDetailResponse unmarshall(DescribeCdnDomainDetailResponse describeCdnDomainDetailResponse, UnmarshallerContext context) {
		
		describeCdnDomainDetailResponse.setRequestId(context.stringValue("DescribeCdnDomainDetailResponse.RequestId"));

		GetDomainDetailModel getDomainDetailModel = new GetDomainDetailModel();
		getDomainDetailModel.setDomainName(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.DomainName"));
		getDomainDetailModel.setCname(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Cname"));
		getDomainDetailModel.setHttpsCname(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.HttpsCname"));
		getDomainDetailModel.setDomainStatus(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.DomainStatus"));
		getDomainDetailModel.setCdnType(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.CdnType"));
		getDomainDetailModel.setServerCertificateStatus(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.ServerCertificateStatus"));
		getDomainDetailModel.setGmtCreated(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.GmtCreated"));
		getDomainDetailModel.setGmtModified(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.GmtModified"));
		getDomainDetailModel.setResourceGroupId(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.ResourceGroupId"));
		getDomainDetailModel.setDescription(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Description"));
		getDomainDetailModel.setScope(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Scope"));

		List<SourceModel> sourceModels = new ArrayList<SourceModel>();
		for (int i = 0; i < context.lengthValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels.Length"); i++) {
			SourceModel sourceModel = new SourceModel();
			sourceModel.setContent(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Content"));
			sourceModel.setType(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Type"));
			sourceModel.setPort(context.integerValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Port"));
			sourceModel.setEnabled(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Enabled"));
			sourceModel.setPriority(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Priority"));
			sourceModel.setWeight(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Weight"));

			sourceModels.add(sourceModel);
		}
		getDomainDetailModel.setSourceModels(sourceModels);
		describeCdnDomainDetailResponse.setGetDomainDetailModel(getDomainDetailModel);
	 
	 	return describeCdnDomainDetailResponse;
	}
}