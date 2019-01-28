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

import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourcePackageProductResponse;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourcePackageProductResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourcePackageProductResponse.Data.ResourcePackage;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourcePackageProductResponse.Data.ResourcePackage.PackageType;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourcePackageProductResponse.Data.ResourcePackage.PackageType.Property;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourcePackageProductResponse.Data.ResourcePackage.PackageType.Specification;
import com.aliyuncs.bssopenapi.model.v20171214.DescribeResourcePackageProductResponse.Data.ResourcePackage.PackageType.Specification.AvailableDuration;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourcePackageProductResponseUnmarshaller {

	public static DescribeResourcePackageProductResponse unmarshall(DescribeResourcePackageProductResponse describeResourcePackageProductResponse, UnmarshallerContext context) {
		
		describeResourcePackageProductResponse.setRequestId(context.stringValue("DescribeResourcePackageProductResponse.RequestId"));
		describeResourcePackageProductResponse.setOrderId(context.longValue("DescribeResourcePackageProductResponse.OrderId"));
		describeResourcePackageProductResponse.setSuccess(context.booleanValue("DescribeResourcePackageProductResponse.Success"));
		describeResourcePackageProductResponse.setCode(context.stringValue("DescribeResourcePackageProductResponse.Code"));
		describeResourcePackageProductResponse.setMessage(context.stringValue("DescribeResourcePackageProductResponse.Message"));

		Data data = new Data();

		List<ResourcePackage> resourcePackages = new ArrayList<ResourcePackage>();
		for (int i = 0; i < context.lengthValue("DescribeResourcePackageProductResponse.Data.ResourcePackages.Length"); i++) {
			ResourcePackage resourcePackage = new ResourcePackage();
			resourcePackage.setProductCode(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].ProductCode"));
			resourcePackage.setProductType(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].ProductType"));
			resourcePackage.setName(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].Name"));

			List<PackageType> packageTypes = new ArrayList<PackageType>();
			for (int j = 0; j < context.lengthValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes.Length"); j++) {
				PackageType packageType = new PackageType();
				packageType.setName(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Name"));
				packageType.setCode(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Code"));

				List<Property> properties = new ArrayList<Property>();
				for (int k = 0; k < context.lengthValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Properties.Length"); k++) {
					Property property = new Property();
					property.setName(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Properties["+ k +"].Name"));
					property.setValue(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Properties["+ k +"].Value"));

					properties.add(property);
				}
				packageType.setProperties(properties);

				List<Specification> specifications = new ArrayList<Specification>();
				for (int k = 0; k < context.lengthValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Specifications.Length"); k++) {
					Specification specification = new Specification();
					specification.setName(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Specifications["+ k +"].Name"));
					specification.setValue(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Specifications["+ k +"].Value"));

					List<AvailableDuration> availableDurations = new ArrayList<AvailableDuration>();
					for (int l = 0; l < context.lengthValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Specifications["+ k +"].AvailableDurations.Length"); l++) {
						AvailableDuration availableDuration = new AvailableDuration();
						availableDuration.setName(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Specifications["+ k +"].AvailableDurations["+ l +"].Name"));
						availableDuration.setValue(context.integerValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Specifications["+ k +"].AvailableDurations["+ l +"].Value"));
						availableDuration.setUnit(context.stringValue("DescribeResourcePackageProductResponse.Data.ResourcePackages["+ i +"].PackageTypes["+ j +"].Specifications["+ k +"].AvailableDurations["+ l +"].Unit"));

						availableDurations.add(availableDuration);
					}
					specification.setAvailableDurations(availableDurations);

					specifications.add(specification);
				}
				packageType.setSpecifications(specifications);

				packageTypes.add(packageType);
			}
			resourcePackage.setPackageTypes(packageTypes);

			resourcePackages.add(resourcePackage);
		}
		data.setResourcePackages(resourcePackages);
		describeResourcePackageProductResponse.setData(data);
	 
	 	return describeResourcePackageProductResponse;
	}
}