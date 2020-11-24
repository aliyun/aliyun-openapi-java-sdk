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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeCertsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeCertsResponse.CertItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertsResponseUnmarshaller {

	public static DescribeCertsResponse unmarshall(DescribeCertsResponse describeCertsResponse, UnmarshallerContext _ctx) {
		
		describeCertsResponse.setRequestId(_ctx.stringValue("DescribeCertsResponse.RequestId"));

		List<CertItem> certs = new ArrayList<CertItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCertsResponse.Certs.Length"); i++) {
			CertItem certItem = new CertItem();
			certItem.setId(_ctx.integerValue("DescribeCertsResponse.Certs["+ i +"].Id"));
			certItem.setName(_ctx.stringValue("DescribeCertsResponse.Certs["+ i +"].Name"));
			certItem.setCommon(_ctx.stringValue("DescribeCertsResponse.Certs["+ i +"].Common"));
			certItem.setIssuer(_ctx.stringValue("DescribeCertsResponse.Certs["+ i +"].Issuer"));
			certItem.setStartDate(_ctx.stringValue("DescribeCertsResponse.Certs["+ i +"].StartDate"));
			certItem.setEndDate(_ctx.stringValue("DescribeCertsResponse.Certs["+ i +"].EndDate"));
			certItem.setDomainRelated(_ctx.booleanValue("DescribeCertsResponse.Certs["+ i +"].DomainRelated"));

			certs.add(certItem);
		}
		describeCertsResponse.setCerts(certs);
	 
	 	return describeCertsResponse;
	}
}