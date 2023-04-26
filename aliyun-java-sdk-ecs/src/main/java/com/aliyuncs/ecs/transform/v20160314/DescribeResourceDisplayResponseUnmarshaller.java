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

import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategory;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategory.InstanceTopCategory;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategory.InstanceTopCategory.InstanceSecondCategory;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategory.InstanceTopCategory.InstanceSecondCategory.InstanceType;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategory.InstanceTopCategory.InstanceSecondCategory.InstanceTypeFamily;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay.InstanceChargeType;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay.ProductCategory;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay.ProductCategory.InstanceFamilyGroup;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay.ProductCategory.InstanceFamilyGroup.InstanceTypeFamily5;
import com.aliyuncs.ecs.model.v20160314.DescribeResourceDisplayResponse.ResourceDisplay.Zone;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeResourceDisplayResponseUnmarshaller {

	public static DescribeResourceDisplayResponse unmarshall(DescribeResourceDisplayResponse describeResourceDisplayResponse, UnmarshallerContext _ctx) {
		
		describeResourceDisplayResponse.setRequestId(_ctx.stringValue("DescribeResourceDisplayResponse.RequestId"));

		ResourceDisplay resourceDisplay = new ResourceDisplay();

		List<InstanceChargeType> instanceChargeTypes = new ArrayList<InstanceChargeType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceChargeTypes.Length"); i++) {
			InstanceChargeType instanceChargeType = new InstanceChargeType();
			instanceChargeType.setSpotStrategy(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceChargeTypes["+ i +"].SpotStrategy"));
			instanceChargeType.setChargeType(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceChargeTypes["+ i +"].ChargeType"));

			List<String> tags = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceChargeTypes["+ i +"].Tags.Length"); j++) {
				tags.add(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceChargeTypes["+ i +"].Tags["+ j +"]"));
			}
			instanceChargeType.setTags(tags);

			instanceChargeTypes.add(instanceChargeType);
		}
		resourceDisplay.setInstanceChargeTypes(instanceChargeTypes);

		List<Zone> zones = new ArrayList<Zone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.Zones.Length"); i++) {
			Zone zone = new Zone();
			zone.setZoneId(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.Zones["+ i +"].ZoneId"));

			List<String> tags1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.Zones["+ i +"].Tags.Length"); j++) {
				tags1.add(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.Zones["+ i +"].Tags["+ j +"]"));
			}
			zone.setTags1(tags1);

			zones.add(zone);
		}
		resourceDisplay.setZones(zones);

		List<InstanceCategory> instanceCategories = new ArrayList<InstanceCategory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories.Length"); i++) {
			InstanceCategory instanceCategory = new InstanceCategory();
			instanceCategory.setCategoryType(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].CategoryType"));

			List<String> zoneIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].ZoneIds.Length"); j++) {
				zoneIds.add(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].ZoneIds["+ j +"]"));
			}
			instanceCategory.setZoneIds(zoneIds);

			List<InstanceTopCategory> instanceTopCategories = new ArrayList<InstanceTopCategory>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories.Length"); j++) {
				InstanceTopCategory instanceTopCategory = new InstanceTopCategory();
				instanceTopCategory.setTopCategoryLevel(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].TopCategoryLevel"));

				List<InstanceSecondCategory> instanceSecondCategories = new ArrayList<InstanceSecondCategory>();
				for (int k = 0; k < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].InstanceSecondCategories.Length"); k++) {
					InstanceSecondCategory instanceSecondCategory = new InstanceSecondCategory();
					instanceSecondCategory.setSecondCategoryLevel(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].InstanceSecondCategories["+ k +"].SecondCategoryLevel"));

					List<InstanceTypeFamily> instanceTypeFamilies = new ArrayList<InstanceTypeFamily>();
					for (int l = 0; l < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].InstanceSecondCategories["+ k +"].InstanceTypeFamilies.Length"); l++) {
						InstanceTypeFamily instanceTypeFamily = new InstanceTypeFamily();
						instanceTypeFamily.setInstanceTypeFamilyId(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].InstanceSecondCategories["+ k +"].InstanceTypeFamilies["+ l +"].InstanceTypeFamilyId"));

						List<String> tags2 = new ArrayList<String>();
						for (int m = 0; m < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].InstanceSecondCategories["+ k +"].InstanceTypeFamilies["+ l +"].Tags.Length"); m++) {
							tags2.add(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].InstanceSecondCategories["+ k +"].InstanceTypeFamilies["+ l +"].Tags["+ m +"]"));
						}
						instanceTypeFamily.setTags2(tags2);

						instanceTypeFamilies.add(instanceTypeFamily);
					}
					instanceSecondCategory.setInstanceTypeFamilies(instanceTypeFamilies);

					List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
					for (int l = 0; l < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].InstanceSecondCategories["+ k +"].InstanceTypes.Length"); l++) {
						InstanceType instanceType = new InstanceType();
						instanceType.setInstanceTypeId(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].InstanceSecondCategories["+ k +"].InstanceTypes["+ l +"].InstanceTypeId"));

						List<String> tags3 = new ArrayList<String>();
						for (int m = 0; m < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].InstanceSecondCategories["+ k +"].InstanceTypes["+ l +"].Tags.Length"); m++) {
							tags3.add(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.InstanceCategories["+ i +"].InstanceTopCategories["+ j +"].InstanceSecondCategories["+ k +"].InstanceTypes["+ l +"].Tags["+ m +"]"));
						}
						instanceType.setTags3(tags3);

						instanceTypes.add(instanceType);
					}
					instanceSecondCategory.setInstanceTypes(instanceTypes);

					instanceSecondCategories.add(instanceSecondCategory);
				}
				instanceTopCategory.setInstanceSecondCategories(instanceSecondCategories);

				instanceTopCategories.add(instanceTopCategory);
			}
			instanceCategory.setInstanceTopCategories(instanceTopCategories);

			instanceCategories.add(instanceCategory);
		}
		resourceDisplay.setInstanceCategories(instanceCategories);

		List<ProductCategory> productCategories = new ArrayList<ProductCategory>();
		for (int i = 0; i < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.ProductCategories.Length"); i++) {
			ProductCategory productCategory = new ProductCategory();
			productCategory.setProductName(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.ProductCategories["+ i +"].ProductName"));

			List<InstanceFamilyGroup> instanceFamilyGroups = new ArrayList<InstanceFamilyGroup>();
			for (int j = 0; j < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.ProductCategories["+ i +"].InstanceFamilyGroups.Length"); j++) {
				InstanceFamilyGroup instanceFamilyGroup = new InstanceFamilyGroup();
				instanceFamilyGroup.setInstanceFamilyGroupName(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.ProductCategories["+ i +"].InstanceFamilyGroups["+ j +"].InstanceFamilyGroupName"));

				List<InstanceTypeFamily5> instanceTypeFamilies4 = new ArrayList<InstanceTypeFamily5>();
				for (int k = 0; k < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.ProductCategories["+ i +"].InstanceFamilyGroups["+ j +"].InstanceTypeFamilies.Length"); k++) {
					InstanceTypeFamily5 instanceTypeFamily5 = new InstanceTypeFamily5();
					instanceTypeFamily5.setInstanceTypeFamilyId(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.ProductCategories["+ i +"].InstanceFamilyGroups["+ j +"].InstanceTypeFamilies["+ k +"].InstanceTypeFamilyId"));

					List<String> tags6 = new ArrayList<String>();
					for (int l = 0; l < _ctx.lengthValue("DescribeResourceDisplayResponse.ResourceDisplay.ProductCategories["+ i +"].InstanceFamilyGroups["+ j +"].InstanceTypeFamilies["+ k +"].Tags.Length"); l++) {
						tags6.add(_ctx.stringValue("DescribeResourceDisplayResponse.ResourceDisplay.ProductCategories["+ i +"].InstanceFamilyGroups["+ j +"].InstanceTypeFamilies["+ k +"].Tags["+ l +"]"));
					}
					instanceTypeFamily5.setTags6(tags6);

					instanceTypeFamilies4.add(instanceTypeFamily5);
				}
				instanceFamilyGroup.setInstanceTypeFamilies4(instanceTypeFamilies4);

				instanceFamilyGroups.add(instanceFamilyGroup);
			}
			productCategory.setInstanceFamilyGroups(instanceFamilyGroups);

			productCategories.add(productCategory);
		}
		resourceDisplay.setProductCategories(productCategories);
		describeResourceDisplayResponse.setResourceDisplay(resourceDisplay);
	 
	 	return describeResourceDisplayResponse;
	}
}