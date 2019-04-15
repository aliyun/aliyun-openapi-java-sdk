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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerIzQueryForVmSaleResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerIzQueryForVmSaleResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerIzQueryForVmSaleResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerIzQueryForVmSaleResponse.Item.IzResourceMode;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerIzQueryForVmSaleResponseUnmarshaller {

	public static InnerIzQueryForVmSaleResponse unmarshall(InnerIzQueryForVmSaleResponse innerIzQueryForVmSaleResponse, UnmarshallerContext context) {
		
		innerIzQueryForVmSaleResponse.setRequestId(context.stringValue("InnerIzQueryForVmSaleResponse.RequestId"));
		innerIzQueryForVmSaleResponse.setCount(context.integerValue("InnerIzQueryForVmSaleResponse.count"));
		innerIzQueryForVmSaleResponse.setPageNo(context.integerValue("InnerIzQueryForVmSaleResponse.pageNo"));
		innerIzQueryForVmSaleResponse.setPageSize(context.integerValue("InnerIzQueryForVmSaleResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerIzQueryForVmSaleResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerIzQueryForVmSaleResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerIzQueryForVmSaleResponse.errorCode.isSuccess"));
		innerIzQueryForVmSaleResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerIzQueryForVmSaleResponse.data.Length"); i++) {
			Item item = new Item();
			item.setRegionNo(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].regionNo"));
			item.setStatus(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].status"));
			item.setNo(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].no"));
			item.setEnName(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].enName"));
			item.setCnName(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].cnName"));

			List<String> supportedDiskCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].supportedDiskCategories.Length"); j++) {
				supportedDiskCategories.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].supportedDiskCategories["+ j +"]"));
			}
			item.setSupportedDiskCategories(supportedDiskCategories);

			List<String> supportedNetworkCategories = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].supportedNetworkCategories.Length"); j++) {
				supportedNetworkCategories.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].supportedNetworkCategories["+ j +"]"));
			}
			item.setSupportedNetworkCategories(supportedNetworkCategories);

			List<String> allowedResourceCreations = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].allowedResourceCreations.Length"); j++) {
				allowedResourceCreations.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].allowedResourceCreations["+ j +"]"));
			}
			item.setAllowedResourceCreations(allowedResourceCreations);

			List<String> supportedInstanceGenerations = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].supportedInstanceGenerations.Length"); j++) {
				supportedInstanceGenerations.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].supportedInstanceGenerations["+ j +"]"));
			}
			item.setSupportedInstanceGenerations(supportedInstanceGenerations);

			List<String> supportedInstanceTypeFamilies = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].supportedInstanceTypeFamilies.Length"); j++) {
				supportedInstanceTypeFamilies.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].supportedInstanceTypeFamilies["+ j +"]"));
			}
			item.setSupportedInstanceTypeFamilies(supportedInstanceTypeFamilies);

			List<String> supportedInstanceTypeNames = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].supportedInstanceTypeNames.Length"); j++) {
				supportedInstanceTypeNames.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].supportedInstanceTypeNames["+ j +"]"));
			}
			item.setSupportedInstanceTypeNames(supportedInstanceTypeNames);

			List<IzResourceMode> izResourceModel = new ArrayList<IzResourceMode>();
			for (int j = 0; j < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel.Length"); j++) {
				IzResourceMode izResourceMode = new IzResourceMode();
				izResourceMode.setSupportIoOptimized(context.booleanValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportIoOptimized"));

				List<String> allowedResourceCreation = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].allowedResourceCreation.Length"); k++) {
					allowedResourceCreation.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].allowedResourceCreation["+ k +"]"));
				}
				izResourceMode.setAllowedResourceCreation(allowedResourceCreation);

				List<String> supportedDataDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedDataDiskCategories.Length"); k++) {
					supportedDataDiskCategories.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedDataDiskCategories["+ k +"]"));
				}
				izResourceMode.setSupportedDataDiskCategories(supportedDataDiskCategories);

				List<String> supportedInstanceGenerations1 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedInstanceGenerations.Length"); k++) {
					supportedInstanceGenerations1.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedInstanceGenerations["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceGenerations1(supportedInstanceGenerations1);

				List<String> supportedNetworkCategories2 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedNetworkCategories.Length"); k++) {
					supportedNetworkCategories2.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedNetworkCategories["+ k +"]"));
				}
				izResourceMode.setSupportedNetworkCategories2(supportedNetworkCategories2);

				List<String> supportedSystemDiskCategories = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedSystemDiskCategories.Length"); k++) {
					supportedSystemDiskCategories.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedSystemDiskCategories["+ k +"]"));
				}
				izResourceMode.setSupportedSystemDiskCategories(supportedSystemDiskCategories);

				List<String> supportedInstanceTypeFamilies3 = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedInstanceTypeFamilies.Length"); k++) {
					supportedInstanceTypeFamilies3.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedInstanceTypeFamilies["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceTypeFamilies3(supportedInstanceTypeFamilies3);

				List<String> supportedInstanceTypes = new ArrayList<String>();
				for (int k = 0; k < context.lengthValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedInstanceTypes.Length"); k++) {
					supportedInstanceTypes.add(context.stringValue("InnerIzQueryForVmSaleResponse.data["+ i +"].izResourceModel["+ j +"].supportedInstanceTypes["+ k +"]"));
				}
				izResourceMode.setSupportedInstanceTypes(supportedInstanceTypes);

				izResourceModel.add(izResourceMode);
			}
			item.setIzResourceModel(izResourceModel);

			data.add(item);
		}
		innerIzQueryForVmSaleResponse.setData(data);
	 
	 	return innerIzQueryForVmSaleResponse;
	}
}