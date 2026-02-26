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

package com.aliyuncs.eiam.transform.v20211201;

import com.aliyuncs.eiam.model.v20211201.GetBrandResponse;
import com.aliyuncs.eiam.model.v20211201.GetBrandResponse.Brand;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBrandResponseUnmarshaller {

	public static GetBrandResponse unmarshall(GetBrandResponse getBrandResponse, UnmarshallerContext _ctx) {
		
		getBrandResponse.setRequestId(_ctx.stringValue("GetBrandResponse.RequestId"));

		Brand brand = new Brand();
		brand.setInstanceId(_ctx.stringValue("GetBrandResponse.Brand.InstanceId"));
		brand.setBrandId(_ctx.stringValue("GetBrandResponse.Brand.BrandId"));
		brand.setBrandName(_ctx.stringValue("GetBrandResponse.Brand.BrandName"));
		brand.setBrandType(_ctx.stringValue("GetBrandResponse.Brand.BrandType"));
		brand.setStatus(_ctx.stringValue("GetBrandResponse.Brand.Status"));
		getBrandResponse.setBrand(brand);
	 
	 	return getBrandResponse;
	}
}