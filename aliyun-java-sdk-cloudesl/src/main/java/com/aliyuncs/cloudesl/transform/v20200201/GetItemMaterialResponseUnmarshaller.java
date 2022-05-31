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

import com.aliyuncs.cloudesl.model.v20200201.GetItemMaterialResponse;
import com.aliyuncs.cloudesl.model.v20200201.GetItemMaterialResponse.MaterialInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetItemMaterialResponseUnmarshaller {

	public static GetItemMaterialResponse unmarshall(GetItemMaterialResponse getItemMaterialResponse, UnmarshallerContext _ctx) {
		
		getItemMaterialResponse.setRequestId(_ctx.stringValue("GetItemMaterialResponse.RequestId"));
		getItemMaterialResponse.setSuccess(_ctx.booleanValue("GetItemMaterialResponse.Success"));
		getItemMaterialResponse.setMessage(_ctx.stringValue("GetItemMaterialResponse.Message"));
		getItemMaterialResponse.setErrorCode(_ctx.stringValue("GetItemMaterialResponse.ErrorCode"));
		getItemMaterialResponse.setErrorMessage(_ctx.stringValue("GetItemMaterialResponse.ErrorMessage"));
		getItemMaterialResponse.setCode(_ctx.stringValue("GetItemMaterialResponse.Code"));
		getItemMaterialResponse.setDynamicCode(_ctx.stringValue("GetItemMaterialResponse.DynamicCode"));
		getItemMaterialResponse.setDynamicMessage(_ctx.stringValue("GetItemMaterialResponse.DynamicMessage"));

		MaterialInfo materialInfo = new MaterialInfo();
		materialInfo.setItemName(_ctx.stringValue("GetItemMaterialResponse.MaterialInfo.ItemName"));
		materialInfo.setBarCode(_ctx.stringValue("GetItemMaterialResponse.MaterialInfo.BarCode"));
		materialInfo.setGmtCreate(_ctx.stringValue("GetItemMaterialResponse.MaterialInfo.GmtCreate"));
		materialInfo.setMaterialName(_ctx.stringValue("GetItemMaterialResponse.MaterialInfo.MaterialName"));
		materialInfo.setMaterialId(_ctx.stringValue("GetItemMaterialResponse.MaterialInfo.MaterialId"));
		materialInfo.setMaterialFeatureA(_ctx.stringValue("GetItemMaterialResponse.MaterialInfo.MaterialFeatureA"));
		materialInfo.setMaterialFeatureB(_ctx.stringValue("GetItemMaterialResponse.MaterialInfo.MaterialFeatureB"));
		materialInfo.setMaterialFeatureC(_ctx.stringValue("GetItemMaterialResponse.MaterialInfo.MaterialFeatureC"));
		materialInfo.setMaterialFeatureD(_ctx.stringValue("GetItemMaterialResponse.MaterialInfo.MaterialFeatureD"));
		getItemMaterialResponse.setMaterialInfo(materialInfo);
	 
	 	return getItemMaterialResponse;
	}
}