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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeMaterialsResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeMaterialsResponse.Material;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMaterialsResponseUnmarshaller {

	public static DescribeMaterialsResponse unmarshall(DescribeMaterialsResponse describeMaterialsResponse, UnmarshallerContext _ctx) {
		
		describeMaterialsResponse.setRequestId(_ctx.stringValue("DescribeMaterialsResponse.RequestId"));
		describeMaterialsResponse.setTotalCount(_ctx.integerValue("DescribeMaterialsResponse.TotalCount"));
		describeMaterialsResponse.setPageNumber(_ctx.integerValue("DescribeMaterialsResponse.PageNumber"));
		describeMaterialsResponse.setPageSize(_ctx.integerValue("DescribeMaterialsResponse.PageSize"));
		describeMaterialsResponse.setSuccess(_ctx.booleanValue("DescribeMaterialsResponse.Success"));
		describeMaterialsResponse.setMessage(_ctx.stringValue("DescribeMaterialsResponse.Message"));
		describeMaterialsResponse.setErrorCode(_ctx.stringValue("DescribeMaterialsResponse.ErrorCode"));
		describeMaterialsResponse.setErrorMessage(_ctx.stringValue("DescribeMaterialsResponse.ErrorMessage"));
		describeMaterialsResponse.setCode(_ctx.stringValue("DescribeMaterialsResponse.Code"));
		describeMaterialsResponse.setDynamicCode(_ctx.stringValue("DescribeMaterialsResponse.DynamicCode"));
		describeMaterialsResponse.setDynamicMessage(_ctx.stringValue("DescribeMaterialsResponse.DynamicMessage"));

		List<Material> materials = new ArrayList<Material>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMaterialsResponse.Materials.Length"); i++) {
			Material material = new Material();
			material.setMaterialId(_ctx.stringValue("DescribeMaterialsResponse.Materials["+ i +"].MaterialId"));
			material.setSize(_ctx.stringValue("DescribeMaterialsResponse.Materials["+ i +"].Size"));
			material.setPeriod(_ctx.integerValue("DescribeMaterialsResponse.Materials["+ i +"].Period"));
			material.setContent(_ctx.stringValue("DescribeMaterialsResponse.Materials["+ i +"].Content"));
			material.setThumbnail(_ctx.stringValue("DescribeMaterialsResponse.Materials["+ i +"].Thumbnail"));
			material.setType(_ctx.integerValue("DescribeMaterialsResponse.Materials["+ i +"].Type"));
			material.setSource(_ctx.stringValue("DescribeMaterialsResponse.Materials["+ i +"].Source"));
			material.setName(_ctx.stringValue("DescribeMaterialsResponse.Materials["+ i +"].Name"));

			materials.add(material);
		}
		describeMaterialsResponse.setMaterials(materials);
	 
	 	return describeMaterialsResponse;
	}
}