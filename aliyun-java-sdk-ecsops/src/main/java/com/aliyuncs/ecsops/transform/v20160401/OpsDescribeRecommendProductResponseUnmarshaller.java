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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRecommendProductResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRecommendProductResponse.RecommendProduct;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRecommendProductResponse.RecommendProduct.RecommendInstanceType;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeRecommendProductResponse.RecommendProduct.RecommendInstanceType.InstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeRecommendProductResponseUnmarshaller {

	public static OpsDescribeRecommendProductResponse unmarshall(OpsDescribeRecommendProductResponse opsDescribeRecommendProductResponse, UnmarshallerContext _ctx) {
		
		opsDescribeRecommendProductResponse.setRequestId(_ctx.stringValue("OpsDescribeRecommendProductResponse.RequestId"));
		opsDescribeRecommendProductResponse.setMessage(_ctx.stringValue("OpsDescribeRecommendProductResponse.Message"));
		opsDescribeRecommendProductResponse.setCode(_ctx.stringValue("OpsDescribeRecommendProductResponse.Code"));
		opsDescribeRecommendProductResponse.setSuccess(_ctx.booleanValue("OpsDescribeRecommendProductResponse.Success"));

		List<RecommendProduct> recommendProducts = new ArrayList<RecommendProduct>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeRecommendProductResponse.RecommendProducts.Length"); i++) {
			RecommendProduct recommendProduct = new RecommendProduct();
			recommendProduct.setZoneId(_ctx.stringValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].ZoneId"));

			List<RecommendInstanceType> recommendInstanceTypes = new ArrayList<RecommendInstanceType>();
			for (int j = 0; j < _ctx.lengthValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes.Length"); j++) {
				RecommendInstanceType recommendInstanceType = new RecommendInstanceType();
				recommendInstanceType.setPrice(_ctx.floatValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].Price"));
				recommendInstanceType.setCapacitySpecification(_ctx.stringValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].CapacitySpecification"));
				recommendInstanceType.setPriority(_ctx.integerValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].Priority"));
				recommendInstanceType.setInventoryAmount(_ctx.integerValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InventoryAmount"));
				recommendInstanceType.setNetworkType(_ctx.stringValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].NetworkType"));
				recommendInstanceType.setQuotaAmount(_ctx.integerValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].QuotaAmount"));
				recommendInstanceType.setSpotStrategy(_ctx.stringValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].SpotStrategy"));
				recommendInstanceType.setInstanceChargeType(_ctx.stringValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceChargeType"));

				InstanceType instanceType = new InstanceType();
				instanceType.setSupportIoOptimized(_ctx.stringValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.SupportIoOptimized"));
				instanceType.setCores(_ctx.integerValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.Cores"));
				instanceType.setInstanceFamilyLevel(_ctx.stringValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.InstanceFamilyLevel"));
				instanceType.setMemory(_ctx.integerValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.Memory"));
				instanceType.setInstanceType(_ctx.stringValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.InstanceType"));
				instanceType.setInstanceTypeFamily(_ctx.stringValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.InstanceTypeFamily"));
				instanceType.setGeneration(_ctx.stringValue("OpsDescribeRecommendProductResponse.RecommendProducts["+ i +"].RecommendInstanceTypes["+ j +"].InstanceType.Generation"));
				recommendInstanceType.setInstanceType(instanceType);

				recommendInstanceTypes.add(recommendInstanceType);
			}
			recommendProduct.setRecommendInstanceTypes(recommendInstanceTypes);

			recommendProducts.add(recommendProduct);
		}
		opsDescribeRecommendProductResponse.setRecommendProducts(recommendProducts);
	 
	 	return opsDescribeRecommendProductResponse;
	}
}