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

package com.aliyuncs.bss.transform.v20140714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bss.model.v20140714.DescribeCouponListResponse;
import com.aliyuncs.bss.model.v20140714.DescribeCouponListResponse.Coupon;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCouponListResponseUnmarshaller {

	public static DescribeCouponListResponse unmarshall(DescribeCouponListResponse describeCouponListResponse, UnmarshallerContext context) {
		
		describeCouponListResponse.setRequestId(context.stringValue("DescribeCouponListResponse.RequestId"));

		List<Coupon> coupons = new ArrayList<Coupon>();
		for (int i = 0; i < context.lengthValue("DescribeCouponListResponse.Coupons.Length"); i++) {
			Coupon coupon = new Coupon();
			coupon.setCouponTemplateId(context.longValue("DescribeCouponListResponse.Coupons["+ i +"].CouponTemplateId"));
			coupon.setTotalAmount(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].TotalAmount"));
			coupon.setBalanceAmount(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].BalanceAmount"));
			coupon.setFrozenAmount(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].FrozenAmount"));
			coupon.setExpiredAmount(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].ExpiredAmount"));
			coupon.setDeliveryTime(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].DeliveryTime"));
			coupon.setExpiredTime(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].ExpiredTime"));
			coupon.setCouponNumber(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].CouponNumber"));
			coupon.setStatus(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].Status"));
			coupon.setDescription(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].Description"));
			coupon.setCreationTime(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].CreationTime"));
			coupon.setModificationTime(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].ModificationTime"));
			coupon.setPriceLimit(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].PriceLimit"));
			coupon.setApplication(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].Application"));

			List<String> productCodes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCouponListResponse.Coupons["+ i +"].ProductCodes.Length"); j++) {
				productCodes.add(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].ProductCodes["+ j +"]"));
			}
			coupon.setProductCodes(productCodes);

			List<String> tradeTypes = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCouponListResponse.Coupons["+ i +"].TradeTypes.Length"); j++) {
				tradeTypes.add(context.stringValue("DescribeCouponListResponse.Coupons["+ i +"].TradeTypes["+ j +"]"));
			}
			coupon.setTradeTypes(tradeTypes);

			coupons.add(coupon);
		}
		describeCouponListResponse.setCoupons(coupons);
	 
	 	return describeCouponListResponse;
	}
}