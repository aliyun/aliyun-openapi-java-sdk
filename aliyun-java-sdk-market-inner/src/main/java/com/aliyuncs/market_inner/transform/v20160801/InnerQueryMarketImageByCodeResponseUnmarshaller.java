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

package com.aliyuncs.market_inner.transform.v20160801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.market_inner.model.v20160801.InnerQueryMarketImageByCodeResponse;
import com.aliyuncs.market_inner.model.v20160801.InnerQueryMarketImageByCodeResponse.MarketImageProduct;
import com.aliyuncs.market_inner.model.v20160801.InnerQueryMarketImageByCodeResponse.MarketImageProduct.ImageRegionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerQueryMarketImageByCodeResponseUnmarshaller {

	public static InnerQueryMarketImageByCodeResponse unmarshall(InnerQueryMarketImageByCodeResponse innerQueryMarketImageByCodeResponse, UnmarshallerContext context) {
		
		innerQueryMarketImageByCodeResponse.setRequestId(context.stringValue("InnerQueryMarketImageByCodeResponse.RequestId"));
		innerQueryMarketImageByCodeResponse.setSuccess(context.booleanValue("InnerQueryMarketImageByCodeResponse.Success"));

		MarketImageProduct marketImageProduct = new MarketImageProduct();
		marketImageProduct.setImagePc(context.stringValue("InnerQueryMarketImageByCodeResponse.MarketImageProduct.ImagePc"));
		marketImageProduct.setExtendInfo(context.stringValue("InnerQueryMarketImageByCodeResponse.MarketImageProduct.ExtendInfo"));

		List<String> supportChargeTypes = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("InnerQueryMarketImageByCodeResponse.MarketImageProduct.SupportChargeTypes.Length"); i++) {
			supportChargeTypes.add(context.stringValue("InnerQueryMarketImageByCodeResponse.MarketImageProduct.SupportChargeTypes["+ i +"]"));
		}
		marketImageProduct.setSupportChargeTypes(supportChargeTypes);

		List<ImageRegionInfo> imageRegionInfoList = new ArrayList<ImageRegionInfo>();
		for (int i = 0; i < context.lengthValue("InnerQueryMarketImageByCodeResponse.MarketImageProduct.ImageRegionInfoList.Length"); i++) {
			ImageRegionInfo imageRegionInfo = new ImageRegionInfo();
			imageRegionInfo.setRegionNo(context.stringValue("InnerQueryMarketImageByCodeResponse.MarketImageProduct.ImageRegionInfoList["+ i +"].RegionNo"));
			imageRegionInfo.setImageId(context.stringValue("InnerQueryMarketImageByCodeResponse.MarketImageProduct.ImageRegionInfoList["+ i +"].ImageId"));
			imageRegionInfo.setImageVersion(context.stringValue("InnerQueryMarketImageByCodeResponse.MarketImageProduct.ImageRegionInfoList["+ i +"].ImageVersion"));

			imageRegionInfoList.add(imageRegionInfo);
		}
		marketImageProduct.setImageRegionInfoList(imageRegionInfoList);
		innerQueryMarketImageByCodeResponse.setMarketImageProduct(marketImageProduct);
	 
	 	return innerQueryMarketImageByCodeResponse;
	}
}