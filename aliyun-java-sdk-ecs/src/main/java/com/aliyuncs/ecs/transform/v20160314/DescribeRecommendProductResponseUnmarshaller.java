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

import com.aliyuncs.ecs.model.v20160314.DescribeRecommendProductResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeRecommendProductResponse.RecommendProduct;
import com.aliyuncs.ecs.model.v20160314.DescribeRecommendProductResponse.RecommendProduct.RecommendInstanceType;
import com.aliyuncs.ecs.model.v20160314.DescribeRecommendProductResponse.RecommendProduct.RecommendInstanceType.InstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRecommendProductResponseUnmarshaller {

	public static DescribeRecommendProductResponse unmarshall(DescribeRecommendProductResponse describeRecommendProductResponse, UnmarshallerContext _ctx) {
		
		describeRecommendProductResponse.setRequestId(_ctx.stringValue("DescribeRecommendProductResponse.RequestId"));

		List<RecommendProduct> recommendProducts = new ArrayList<RecommendProduct>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRecommendProductResponse.RecommendProducts.Length"); i++) {
			RecommendProduct recommendProduct = new RecommendProduct();
			recommendProduct.setZoneId(_ctx.stringValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].ZoneId"));

			List<RecommendInstanceType> recommendInstanceTypes = new ArrayList<RecommendInstanceType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes.Length"); j++) {
				RecommendInstanceType recommendInstanceType = new RecommendInstanceType();
				recommendInstanceType.setPrice(_ctx.floatValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].Price"));
				recommendInstanceType.setCapacitySpecification(_ctx.stringValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].CapacitySpecification"));
				recommendInstanceType.setPriority(_ctx.integerValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].Priority"));
				recommendInstanceType.setNetworkType(_ctx.stringValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].NetworkType"));
				recommendInstanceType.setSpotStrategy(_ctx.stringValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].SpotStrategy"));
				recommendInstanceType.setInstanceChargeType(_ctx.stringValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceChargeType"));

				InstanceType instanceType = new InstanceType();
				instanceType.setSupportIoOptimized(_ctx.stringValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.SupportIoOptimized"));
				instanceType.setCores(_ctx.integerValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.Cores"));
				instanceType.setInstanceFamilyLevel(_ctx.stringValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.InstanceFamilyLevel"));
				instanceType.setMemory(_ctx.integerValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.Memory"));
				instanceType.setInstanceType(_ctx.stringValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.InstanceType"));
				instanceType.setInstanceTypeFamily(_ctx.stringValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.InstanceTypeFamily"));
				instanceType.setGeneration(_ctx.stringValue("DescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.Generation"));
				recommendInstanceType.setInstanceType(instanceType);

				recommendInstanceTypes.add(recommendInstanceType);
			}
			recommendProduct.setRecommendInstanceTypes(recommendInstanceTypes);

			recommendProducts.add(recommendProduct);
		}
		describeRecommendProductResponse.setRecommendProducts(recommendProducts);
	 
	 	return describeRecommendProductResponse;
	}
}