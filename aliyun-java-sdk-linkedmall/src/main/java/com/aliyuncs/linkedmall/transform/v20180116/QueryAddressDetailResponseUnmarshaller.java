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

import com.aliyuncs.linkedmall.model.v20180116.QueryAddressDetailResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryAddressDetailResponse.DeliveryAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAddressDetailResponseUnmarshaller {

	public static QueryAddressDetailResponse unmarshall(QueryAddressDetailResponse queryAddressDetailResponse, UnmarshallerContext _ctx) {
		
		queryAddressDetailResponse.setRequestId(_ctx.stringValue("QueryAddressDetailResponse.RequestId"));
		queryAddressDetailResponse.setCode(_ctx.stringValue("QueryAddressDetailResponse.Code"));
		queryAddressDetailResponse.setMessage(_ctx.stringValue("QueryAddressDetailResponse.Message"));

		DeliveryAddress deliveryAddress = new DeliveryAddress();
		deliveryAddress.setAddressId(_ctx.longValue("QueryAddressDetailResponse.DeliveryAddress.AddressId"));
		deliveryAddress.setFullName(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.FullName"));
		deliveryAddress.setMobile(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.Mobile"));
		deliveryAddress.setCountry(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.Country"));
		deliveryAddress.setProvince(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.Province"));
		deliveryAddress.setCity(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.City"));
		deliveryAddress.setArea(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.Area"));
		deliveryAddress.setDivisionCode(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.DivisionCode"));
		deliveryAddress.setTown(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.Town"));
		deliveryAddress.setTownDivisionCode(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.TownDivisionCode"));
		deliveryAddress.setAddressDetail(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.AddressDetail"));
		deliveryAddress.setPostCode(_ctx.stringValue("QueryAddressDetailResponse.DeliveryAddress.PostCode"));
		deliveryAddress.setStatus(_ctx.integerValue("QueryAddressDetailResponse.DeliveryAddress.Status"));
		queryAddressDetailResponse.setDeliveryAddress(deliveryAddress);
	 
	 	return queryAddressDetailResponse;
	}
}