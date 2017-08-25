/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cdn.transform.v20141111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainDetailResponse;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainDetailResponse.GetDomainDetailModel;
import com.aliyuncs.cdn.model.v20141111.DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnDomainDetailResponseUnmarshaller {

	public static DescribeCdnDomainDetailResponse unmarshall(DescribeCdnDomainDetailResponse describeCdnDomainDetailResponse, UnmarshallerContext context) {
		
		describeCdnDomainDetailResponse.setRequestId(context.stringValue("DescribeCdnDomainDetailResponse.RequestId"));

		GetDomainDetailModel getDomainDetailModel = new GetDomainDetailModel();
		getDomainDetailModel.setGmtCreated(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.GmtCreated"));
		getDomainDetailModel.setGmtModified(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.GmtModified"));
		getDomainDetailModel.setSourceType(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceType"));
		getDomainDetailModel.setDomainStatus(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.DomainStatus"));
		getDomainDetailModel.setSourcePort(context.integerValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourcePort"));
		getDomainDetailModel.setCdnType(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.CdnType"));
		getDomainDetailModel.setCname(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Cname"));
		getDomainDetailModel.setHttpsCname(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.HttpsCname"));
		getDomainDetailModel.setDomainName(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.DomainName"));
		getDomainDetailModel.setDescription(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Description"));
		getDomainDetailModel.setServerCertificateStatus(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.ServerCertificateStatus"));
		getDomainDetailModel.setServerCertificate(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.ServerCertificate"));
		getDomainDetailModel.setRegion(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Region"));
		getDomainDetailModel.setScope(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Scope"));
		getDomainDetailModel.setCertificateName(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.CertificateName"));
		getDomainDetailModel.setResourceGroupId(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.ResourceGroupId"));

		List<String> sources = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Sources.Length"); i++) {
			sources.add(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.Sources["+ i +"]"));
		}
		getDomainDetailModel.setSources(sources);

		List<SourceModel> sourceModels = new ArrayList<SourceModel>();
		for (int i = 0; i < context.lengthValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels.Length"); i++) {
			SourceModel sourceModel = new SourceModel();
			sourceModel.setContent(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Content"));
			sourceModel.setType(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Type"));
			sourceModel.setPort(context.integerValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Port"));
			sourceModel.setEnabled(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Enabled"));
			sourceModel.setPriority(context.stringValue("DescribeCdnDomainDetailResponse.GetDomainDetailModel.SourceModels["+ i +"].Priority"));

			sourceModels.add(sourceModel);
		}
		getDomainDetailModel.setSourceModels(sourceModels);
		describeCdnDomainDetailResponse.setGetDomainDetailModel(getDomainDetailModel);
	 
	 	return describeCdnDomainDetailResponse;
	}
}