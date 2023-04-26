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

import com.aliyuncs.ecs.model.v20160314.DescribeSceneResourceRecommendResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeSceneResourceRecommendResponse.RecommendProduct;
import com.aliyuncs.ecs.model.v20160314.DescribeSceneResourceRecommendResponse.RecommendProduct.RecommendImage;
import com.aliyuncs.ecs.model.v20160314.DescribeSceneResourceRecommendResponse.RecommendProduct.RecommendInstanceSpec;
import com.aliyuncs.ecs.model.v20160314.DescribeSceneResourceRecommendResponse.RecommendProduct.RecommendInstanceSpec.InstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSceneResourceRecommendResponseUnmarshaller {

	public static DescribeSceneResourceRecommendResponse unmarshall(DescribeSceneResourceRecommendResponse describeSceneResourceRecommendResponse, UnmarshallerContext _ctx) {
		
		describeSceneResourceRecommendResponse.setRequestId(_ctx.stringValue("DescribeSceneResourceRecommendResponse.RequestId"));

		List<RecommendProduct> recommendProducts = new ArrayList<RecommendProduct>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSceneResourceRecommendResponse.RecommendProducts.Length"); i++) {
			RecommendProduct recommendProduct = new RecommendProduct();
			recommendProduct.setRegionId(_ctx.stringValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RegionId"));
			recommendProduct.setZoneId(_ctx.stringValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].ZoneId"));
			recommendProduct.setResourceId(_ctx.stringValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].ResourceId"));
			recommendProduct.setRecommendReason(_ctx.stringValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendReason"));

			List<RecommendInstanceSpec> recommendInstanceSpecs = new ArrayList<RecommendInstanceSpec>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendInstanceSpecs.Length"); j++) {
				RecommendInstanceSpec recommendInstanceSpec = new RecommendInstanceSpec();
				recommendInstanceSpec.setCores(_ctx.integerValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendInstanceSpecs["+ j +"].Cores"));
				recommendInstanceSpec.setMemory(_ctx.floatValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendInstanceSpecs["+ j +"].Memory"));

				List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
				for (int k = 0; k < _ctx.lengthValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendInstanceSpecs["+ j +"].InstanceTypes.Length"); k++) {
					InstanceType instanceType = new InstanceType();
					instanceType.setInstanceTypeName(_ctx.stringValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendInstanceSpecs["+ j +"].InstanceTypes["+ k +"].InstanceTypeName"));
					instanceType.setInstanceTypeFamily(_ctx.stringValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendInstanceSpecs["+ j +"].InstanceTypes["+ k +"].InstanceTypeFamily"));
					instanceType.setPriority(_ctx.integerValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendInstanceSpecs["+ j +"].InstanceTypes["+ k +"].Priority"));
					instanceType.setWarningRisk(_ctx.stringValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendInstanceSpecs["+ j +"].InstanceTypes["+ k +"].WarningRisk"));

					instanceTypes.add(instanceType);
				}
				recommendInstanceSpec.setInstanceTypes(instanceTypes);

				recommendInstanceSpecs.add(recommendInstanceSpec);
			}
			recommendProduct.setRecommendInstanceSpecs(recommendInstanceSpecs);

			List<RecommendImage> recommendImages = new ArrayList<RecommendImage>();
			for (int j = 0; j < _ctx.lengthValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendImages.Length"); j++) {
				RecommendImage recommendImage = new RecommendImage();
				recommendImage.setImageId(_ctx.stringValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendImages["+ j +"].ImageId"));
				recommendImage.setImageOwnerAlias(_ctx.stringValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendImages["+ j +"].ImageOwnerAlias"));
				recommendImage.setIsPublic(_ctx.booleanValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendImages["+ j +"].IsPublic"));
				recommendImage.setPriority(_ctx.integerValue("DescribeSceneResourceRecommendResponse.RecommendProducts["+ i +"].RecommendImages["+ j +"].Priority"));

				recommendImages.add(recommendImage);
			}
			recommendProduct.setRecommendImages(recommendImages);

			recommendProducts.add(recommendProduct);
		}
		describeSceneResourceRecommendResponse.setRecommendProducts(recommendProducts);
	 
	 	return describeSceneResourceRecommendResponse;
	}
}