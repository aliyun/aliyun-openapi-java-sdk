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
package com.aliyuncs.bss.transform.v20140714;

import java.util.ArrayList;
import java.util.List;
import com.aliyuncs.bss.model.v20140714.DescribeCouponDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCouponDetailResponseUnmarshaller {

	public static DescribeCouponDetailResponse unmarshall(DescribeCouponDetailResponse describeCouponDetailResponse, UnmarshallerContext context) {
		
		describeCouponDetailResponse.setRequestId(context.stringValue("DescribeCouponDetailResponse.RequestId"));
		describeCouponDetailResponse.setCouponTemplateId(context.longValue("DescribeCouponDetailResponse.CouponTemplateId"));
		describeCouponDetailResponse.setTotalAmount(context.stringValue("DescribeCouponDetailResponse.TotalAmount"));
		describeCouponDetailResponse.setBalanceAmount(context.stringValue("DescribeCouponDetailResponse.BalanceAmount"));
		describeCouponDetailResponse.setFrozenAmount(context.stringValue("DescribeCouponDetailResponse.FrozenAmount"));
		describeCouponDetailResponse.setExpiredAmount(context.stringValue("DescribeCouponDetailResponse.ExpiredAmount"));
		describeCouponDetailResponse.setDeliveryTime(context.stringValue("DescribeCouponDetailResponse.DeliveryTime"));
		describeCouponDetailResponse.setExpiredTime(context.stringValue("DescribeCouponDetailResponse.ExpiredTime"));
		describeCouponDetailResponse.setCouponNumber(context.stringValue("DescribeCouponDetailResponse.CouponNumber"));
		describeCouponDetailResponse.setStatus(context.stringValue("DescribeCouponDetailResponse.Status"));
		describeCouponDetailResponse.setDescription(context.stringValue("DescribeCouponDetailResponse.Description"));
		describeCouponDetailResponse.setCreationTime(context.stringValue("DescribeCouponDetailResponse.CreationTime"));
		describeCouponDetailResponse.setModificationTime(context.stringValue("DescribeCouponDetailResponse.ModificationTime"));
		describeCouponDetailResponse.setPriceLimit(context.stringValue("DescribeCouponDetailResponse.PriceLimit"));
		describeCouponDetailResponse.setApplication(context.stringValue("DescribeCouponDetailResponse.Application"));

		List<String> productCodes = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeCouponDetailResponse.ProductCodes.Length"); i++) {
			productCodes.add(context.stringValue("DescribeCouponDetailResponse.ProductCodes["+ i +"]"));
		}
		describeCouponDetailResponse.setProductCodes(productCodes);

		List<String> tradeTypes = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeCouponDetailResponse.TradeTypes.Length"); i++) {
			tradeTypes.add(context.stringValue("DescribeCouponDetailResponse.TradeTypes["+ i +"]"));
		}
		describeCouponDetailResponse.setTradeTypes(tradeTypes);
	 
	 	return describeCouponDetailResponse;
	}
}