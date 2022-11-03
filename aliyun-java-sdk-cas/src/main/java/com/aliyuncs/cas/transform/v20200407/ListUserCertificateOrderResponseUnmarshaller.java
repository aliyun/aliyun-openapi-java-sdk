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

package com.aliyuncs.cas.transform.v20200407;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20200407.ListUserCertificateOrderResponse;
import com.aliyuncs.cas.model.v20200407.ListUserCertificateOrderResponse.CertificateOrderListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserCertificateOrderResponseUnmarshaller {

	public static ListUserCertificateOrderResponse unmarshall(ListUserCertificateOrderResponse listUserCertificateOrderResponse, UnmarshallerContext _ctx) {
		
		listUserCertificateOrderResponse.setRequestId(_ctx.stringValue("ListUserCertificateOrderResponse.RequestId"));
		listUserCertificateOrderResponse.setShowSize(_ctx.longValue("ListUserCertificateOrderResponse.ShowSize"));
		listUserCertificateOrderResponse.setCurrentPage(_ctx.longValue("ListUserCertificateOrderResponse.CurrentPage"));
		listUserCertificateOrderResponse.setTotalCount(_ctx.longValue("ListUserCertificateOrderResponse.TotalCount"));

		List<CertificateOrderListItem> certificateOrderList = new ArrayList<CertificateOrderListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListUserCertificateOrderResponse.CertificateOrderList.Length"); i++) {
			CertificateOrderListItem certificateOrderListItem = new CertificateOrderListItem();
			certificateOrderListItem.setAlgorithm(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].Algorithm"));
			certificateOrderListItem.setAliyunOrderId(_ctx.longValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].AliyunOrderId"));
			certificateOrderListItem.setBuyDate(_ctx.longValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].BuyDate"));
			certificateOrderListItem.setCertEndTime(_ctx.longValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].CertEndTime"));
			certificateOrderListItem.setCertStartTime(_ctx.longValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].CertStartTime"));
			certificateOrderListItem.setCertType(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].CertType"));
			certificateOrderListItem.setDomain(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].Domain"));
			certificateOrderListItem.setDomainCount(_ctx.longValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].DomainCount"));
			certificateOrderListItem.setDomainType(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].DomainType"));
			certificateOrderListItem.setInstanceId(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].InstanceId"));
			certificateOrderListItem.setOrderId(_ctx.longValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].OrderId"));
			certificateOrderListItem.setPartnerOrderId(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].PartnerOrderId"));
			certificateOrderListItem.setProductCode(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].ProductCode"));
			certificateOrderListItem.setProductName(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].ProductName"));
			certificateOrderListItem.setRootBrand(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].RootBrand"));
			certificateOrderListItem.setSourceType(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].SourceType"));
			certificateOrderListItem.setStatus(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].Status"));
			certificateOrderListItem.setTrusteeStatus(_ctx.stringValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].TrusteeStatus"));
			certificateOrderListItem.setWildDomainCount(_ctx.longValue("ListUserCertificateOrderResponse.CertificateOrderList["+ i +"].WildDomainCount"));

			certificateOrderList.add(certificateOrderListItem);
		}
		listUserCertificateOrderResponse.setCertificateOrderList(certificateOrderList);
	 
	 	return listUserCertificateOrderResponse;
	}
}