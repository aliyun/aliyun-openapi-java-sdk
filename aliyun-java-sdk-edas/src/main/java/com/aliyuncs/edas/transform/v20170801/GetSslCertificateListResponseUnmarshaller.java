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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetSslCertificateListResponse;
import com.aliyuncs.edas.model.v20170801.GetSslCertificateListResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetSslCertificateListResponse.Data.CertificateListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSslCertificateListResponseUnmarshaller {

	public static GetSslCertificateListResponse unmarshall(GetSslCertificateListResponse getSslCertificateListResponse, UnmarshallerContext _ctx) {
		
		getSslCertificateListResponse.setRequestId(_ctx.stringValue("GetSslCertificateListResponse.RequestId"));
		getSslCertificateListResponse.setCode(_ctx.stringValue("GetSslCertificateListResponse.Code"));
		getSslCertificateListResponse.setMessage(_ctx.stringValue("GetSslCertificateListResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("GetSslCertificateListResponse.Data.Total"));

		List<CertificateListItem> certificateList = new ArrayList<CertificateListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetSslCertificateListResponse.Data.CertificateList.Length"); i++) {
			CertificateListItem certificateListItem = new CertificateListItem();
			certificateListItem.setId(_ctx.stringValue("GetSslCertificateListResponse.Data.CertificateList["+ i +"].Id"));
			certificateListItem.setName(_ctx.stringValue("GetSslCertificateListResponse.Data.CertificateList["+ i +"].Name"));
			certificateListItem.setIssuer(_ctx.stringValue("GetSslCertificateListResponse.Data.CertificateList["+ i +"].Issuer"));
			certificateListItem.setStartDate(_ctx.stringValue("GetSslCertificateListResponse.Data.CertificateList["+ i +"].StartDate"));
			certificateListItem.setEndDate(_ctx.stringValue("GetSslCertificateListResponse.Data.CertificateList["+ i +"].EndDate"));
			certificateListItem.setExpired(_ctx.stringValue("GetSslCertificateListResponse.Data.CertificateList["+ i +"].Expired"));
			certificateListItem.setDomainNames(_ctx.stringValue("GetSslCertificateListResponse.Data.CertificateList["+ i +"].DomainNames"));
			certificateListItem.setRegionId(_ctx.stringValue("GetSslCertificateListResponse.Data.CertificateList["+ i +"].RegionId"));

			certificateList.add(certificateListItem);
		}
		data.setCertificateList(certificateList);
		getSslCertificateListResponse.setData(data);
	 
	 	return getSslCertificateListResponse;
	}
}