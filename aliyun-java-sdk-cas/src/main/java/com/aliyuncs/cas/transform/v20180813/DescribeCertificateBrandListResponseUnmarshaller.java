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

package com.aliyuncs.cas.transform.v20180813;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cas.model.v20180813.DescribeCertificateBrandListResponse;
import com.aliyuncs.cas.model.v20180813.DescribeCertificateBrandListResponse.Brand;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCertificateBrandListResponseUnmarshaller {

	public static DescribeCertificateBrandListResponse unmarshall(DescribeCertificateBrandListResponse describeCertificateBrandListResponse, UnmarshallerContext context) {
		
		describeCertificateBrandListResponse.setRequestId(context.stringValue("DescribeCertificateBrandListResponse.RequestId"));

		List<Brand> brandList = new ArrayList<Brand>();
		for (int i = 0; i < context.lengthValue("DescribeCertificateBrandListResponse.BrandList.Length"); i++) {
			Brand brand = new Brand();
			brand.setId(context.longValue("DescribeCertificateBrandListResponse.BrandList["+ i +"].Id"));
			brand.setName(context.stringValue("DescribeCertificateBrandListResponse.BrandList["+ i +"].Name"));

			brandList.add(brand);
		}
		describeCertificateBrandListResponse.setBrandList(brandList);
	 
	 	return describeCertificateBrandListResponse;
	}
}