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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryCustomerAddressListResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCustomerAddressListResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCustomerAddressListResponse.Data.CustomerInvoiceAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCustomerAddressListResponseUnmarshaller {

	public static QueryCustomerAddressListResponse unmarshall(QueryCustomerAddressListResponse queryCustomerAddressListResponse, UnmarshallerContext _ctx) {
		
		queryCustomerAddressListResponse.setRequestId(_ctx.stringValue("QueryCustomerAddressListResponse.RequestId"));
		queryCustomerAddressListResponse.setSuccess(_ctx.booleanValue("QueryCustomerAddressListResponse.Success"));
		queryCustomerAddressListResponse.setCode(_ctx.stringValue("QueryCustomerAddressListResponse.Code"));
		queryCustomerAddressListResponse.setMessage(_ctx.stringValue("QueryCustomerAddressListResponse.Message"));

		Data data = new Data();

		List<CustomerInvoiceAddress> customerInvoiceAddressList = new ArrayList<CustomerInvoiceAddress>();
		for (int i = 0; i < _ctx.lengthValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList.Length"); i++) {
			CustomerInvoiceAddress customerInvoiceAddress = new CustomerInvoiceAddress();
			customerInvoiceAddress.setId(_ctx.longValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].Id"));
			customerInvoiceAddress.setUserId(_ctx.longValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].UserId"));
			customerInvoiceAddress.setUserNick(_ctx.stringValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].UserNick"));
			customerInvoiceAddress.setAddressee(_ctx.stringValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].Addressee"));
			customerInvoiceAddress.setProvince(_ctx.stringValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].Province"));
			customerInvoiceAddress.setCity(_ctx.stringValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].City"));
			customerInvoiceAddress.setCounty(_ctx.stringValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].County"));
			customerInvoiceAddress.setStreet(_ctx.stringValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].Street"));
			customerInvoiceAddress.setPostalCode(_ctx.stringValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].PostalCode"));
			customerInvoiceAddress.setPhone(_ctx.stringValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].Phone"));
			customerInvoiceAddress.setBizType(_ctx.stringValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].BizType"));
			customerInvoiceAddress.setDeliveryAddress(_ctx.stringValue("QueryCustomerAddressListResponse.Data.CustomerInvoiceAddressList["+ i +"].DeliveryAddress"));

			customerInvoiceAddressList.add(customerInvoiceAddress);
		}
		data.setCustomerInvoiceAddressList(customerInvoiceAddressList);
		queryCustomerAddressListResponse.setData(data);
	 
	 	return queryCustomerAddressListResponse;
	}
}