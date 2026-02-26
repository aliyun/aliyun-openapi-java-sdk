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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.ListBrandsResponse;
import com.aliyuncs.eiam.model.v20211201.ListBrandsResponse.Brand;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBrandsResponseUnmarshaller {

	public static ListBrandsResponse unmarshall(ListBrandsResponse listBrandsResponse, UnmarshallerContext _ctx) {
		
		listBrandsResponse.setRequestId(_ctx.stringValue("ListBrandsResponse.RequestId"));
		listBrandsResponse.setTotalCount(_ctx.longValue("ListBrandsResponse.TotalCount"));
		listBrandsResponse.setNextToken(_ctx.stringValue("ListBrandsResponse.NextToken"));
		listBrandsResponse.setPreviousToken(_ctx.stringValue("ListBrandsResponse.PreviousToken"));
		listBrandsResponse.setMaxResults(_ctx.longValue("ListBrandsResponse.MaxResults"));

		List<Brand> brands = new ArrayList<Brand>();
		for (int i = 0; i < _ctx.lengthValue("ListBrandsResponse.Brands.Length"); i++) {
			Brand brand = new Brand();
			brand.setInstanceId(_ctx.stringValue("ListBrandsResponse.Brands["+ i +"].InstanceId"));
			brand.setBrandId(_ctx.stringValue("ListBrandsResponse.Brands["+ i +"].BrandId"));
			brand.setBrandName(_ctx.stringValue("ListBrandsResponse.Brands["+ i +"].BrandName"));
			brand.setBrandType(_ctx.stringValue("ListBrandsResponse.Brands["+ i +"].BrandType"));
			brand.setStatus(_ctx.stringValue("ListBrandsResponse.Brands["+ i +"].Status"));

			brands.add(brand);
		}
		listBrandsResponse.setBrands(brands);
	 
	 	return listBrandsResponse;
	}
}