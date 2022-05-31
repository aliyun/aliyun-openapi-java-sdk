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

import com.aliyuncs.cloudesl.model.v20200201.DescribeItemMaterialsResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeItemMaterialsResponse.ItemMaterialInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeItemMaterialsResponseUnmarshaller {

	public static DescribeItemMaterialsResponse unmarshall(DescribeItemMaterialsResponse describeItemMaterialsResponse, UnmarshallerContext _ctx) {
		
		describeItemMaterialsResponse.setRequestId(_ctx.stringValue("DescribeItemMaterialsResponse.RequestId"));
		describeItemMaterialsResponse.setTotalCount(_ctx.integerValue("DescribeItemMaterialsResponse.TotalCount"));
		describeItemMaterialsResponse.setPageNumber(_ctx.integerValue("DescribeItemMaterialsResponse.PageNumber"));
		describeItemMaterialsResponse.setPageSize(_ctx.integerValue("DescribeItemMaterialsResponse.PageSize"));
		describeItemMaterialsResponse.setSuccess(_ctx.booleanValue("DescribeItemMaterialsResponse.Success"));
		describeItemMaterialsResponse.setMessage(_ctx.stringValue("DescribeItemMaterialsResponse.Message"));
		describeItemMaterialsResponse.setErrorCode(_ctx.stringValue("DescribeItemMaterialsResponse.ErrorCode"));
		describeItemMaterialsResponse.setErrorMessage(_ctx.stringValue("DescribeItemMaterialsResponse.ErrorMessage"));
		describeItemMaterialsResponse.setCode(_ctx.stringValue("DescribeItemMaterialsResponse.Code"));
		describeItemMaterialsResponse.setDynamicCode(_ctx.stringValue("DescribeItemMaterialsResponse.DynamicCode"));
		describeItemMaterialsResponse.setDynamicMessage(_ctx.stringValue("DescribeItemMaterialsResponse.DynamicMessage"));

		List<ItemMaterialInfo> materials = new ArrayList<ItemMaterialInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeItemMaterialsResponse.Materials.Length"); i++) {
			ItemMaterialInfo itemMaterialInfo = new ItemMaterialInfo();
			itemMaterialInfo.setBarCode(_ctx.stringValue("DescribeItemMaterialsResponse.Materials["+ i +"].BarCode"));
			itemMaterialInfo.setItemName(_ctx.stringValue("DescribeItemMaterialsResponse.Materials["+ i +"].ItemName"));
			itemMaterialInfo.setGmtCreate(_ctx.stringValue("DescribeItemMaterialsResponse.Materials["+ i +"].GmtCreate"));

			materials.add(itemMaterialInfo);
		}
		describeItemMaterialsResponse.setMaterials(materials);
	 
	 	return describeItemMaterialsResponse;
	}
}