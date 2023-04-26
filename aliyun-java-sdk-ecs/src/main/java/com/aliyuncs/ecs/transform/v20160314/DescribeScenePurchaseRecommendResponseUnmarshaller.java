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

package com.aliyuncs.ecs.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20160314.DescribeScenePurchaseRecommendResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeScenePurchaseRecommendResponse.RecommendProduct;
import com.aliyuncs.ecs.model.v20160314.DescribeScenePurchaseRecommendResponse.RecommendProduct.RecommendSpSpec;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeScenePurchaseRecommendResponseUnmarshaller {

	public static DescribeScenePurchaseRecommendResponse unmarshall(DescribeScenePurchaseRecommendResponse describeScenePurchaseRecommendResponse, UnmarshallerContext _ctx) {
		
		describeScenePurchaseRecommendResponse.setRequestId(_ctx.stringValue("DescribeScenePurchaseRecommendResponse.RequestId"));

		List<RecommendProduct> recommendProducts = new ArrayList<RecommendProduct>();
		for (int i = 0; i < _ctx.lengthValue("DescribeScenePurchaseRecommendResponse.RecommendProducts.Length"); i++) {
			RecommendProduct recommendProduct = new RecommendProduct();
			recommendProduct.setRegionId(_ctx.stringValue("DescribeScenePurchaseRecommendResponse.RecommendProducts["+ i +"].RegionId"));

			List<RecommendSpSpec> recommendSpSpecs = new ArrayList<RecommendSpSpec>();
			for (int j = 0; j < _ctx.lengthValue("DescribeScenePurchaseRecommendResponse.RecommendProducts["+ i +"].RecommendSpSpecs.Length"); j++) {
				RecommendSpSpec recommendSpSpec = new RecommendSpSpec();
				recommendSpSpec.setDuration(_ctx.integerValue("DescribeScenePurchaseRecommendResponse.RecommendProducts["+ i +"].RecommendSpSpecs["+ j +"].Duration"));
				recommendSpSpec.setPricingCycle(_ctx.stringValue("DescribeScenePurchaseRecommendResponse.RecommendProducts["+ i +"].RecommendSpSpecs["+ j +"].PricingCycle"));
				recommendSpSpec.setType(_ctx.stringValue("DescribeScenePurchaseRecommendResponse.RecommendProducts["+ i +"].RecommendSpSpecs["+ j +"].Type"));
				recommendSpSpec.setPayMode(_ctx.stringValue("DescribeScenePurchaseRecommendResponse.RecommendProducts["+ i +"].RecommendSpSpecs["+ j +"].PayMode"));
				recommendSpSpec.setEffectiveDate(_ctx.stringValue("DescribeScenePurchaseRecommendResponse.RecommendProducts["+ i +"].RecommendSpSpecs["+ j +"].EffectiveDate"));
				recommendSpSpec.setRecommendReason(_ctx.stringValue("DescribeScenePurchaseRecommendResponse.RecommendProducts["+ i +"].RecommendSpSpecs["+ j +"].RecommendReason"));

				recommendSpSpecs.add(recommendSpSpec);
			}
			recommendProduct.setRecommendSpSpecs(recommendSpSpecs);

			recommendProducts.add(recommendProduct);
		}
		describeScenePurchaseRecommendResponse.setRecommendProducts(recommendProducts);
	 
	 	return describeScenePurchaseRecommendResponse;
	}
}