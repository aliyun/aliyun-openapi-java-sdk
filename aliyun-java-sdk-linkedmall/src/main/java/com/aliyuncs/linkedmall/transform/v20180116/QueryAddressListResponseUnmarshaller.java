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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.QueryAddressListResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryAddressListResponse.Address;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAddressListResponseUnmarshaller {

	public static QueryAddressListResponse unmarshall(QueryAddressListResponse queryAddressListResponse, UnmarshallerContext _ctx) {
		
		queryAddressListResponse.setRequestId(_ctx.stringValue("QueryAddressListResponse.RequestId"));
		queryAddressListResponse.setCode(_ctx.stringValue("QueryAddressListResponse.Code"));
		queryAddressListResponse.setMessage(_ctx.stringValue("QueryAddressListResponse.Message"));

		List<Address> addressList = new ArrayList<Address>();
		for (int i = 0; i < _ctx.lengthValue("QueryAddressListResponse.AddressList.Length"); i++) {
			Address address = new Address();
			address.setAddressId(_ctx.longValue("QueryAddressListResponse.AddressList["+ i +"].AddressId"));
			address.setFullName(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].FullName"));
			address.setMobile(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].Mobile"));
			address.setCountry(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].Country"));
			address.setProvince(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].Province"));
			address.setCity(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].City"));
			address.setTown(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].Town"));
			address.setTownDivisionCode(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].TownDivisionCode"));
			address.setAddressDetail(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].AddressDetail"));
			address.setPostCode(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].PostCode"));
			address.setStatus(_ctx.integerValue("QueryAddressListResponse.AddressList["+ i +"].Status"));
			address.setDivisionCode(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].DivisionCode"));
			address.setArea(_ctx.stringValue("QueryAddressListResponse.AddressList["+ i +"].Area"));

			addressList.add(address);
		}
		queryAddressListResponse.setAddressList(addressList);
	 
	 	return queryAddressListResponse;
	}
}