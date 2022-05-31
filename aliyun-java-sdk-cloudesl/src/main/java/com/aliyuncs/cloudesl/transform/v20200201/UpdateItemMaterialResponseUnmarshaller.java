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

import com.aliyuncs.cloudesl.model.v20200201.UpdateItemMaterialResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateItemMaterialResponseUnmarshaller {

	public static UpdateItemMaterialResponse unmarshall(UpdateItemMaterialResponse updateItemMaterialResponse, UnmarshallerContext _ctx) {
		
		updateItemMaterialResponse.setRequestId(_ctx.stringValue("UpdateItemMaterialResponse.RequestId"));
		updateItemMaterialResponse.setSuccess(_ctx.booleanValue("UpdateItemMaterialResponse.Success"));
		updateItemMaterialResponse.setMessage(_ctx.stringValue("UpdateItemMaterialResponse.Message"));
		updateItemMaterialResponse.setErrorCode(_ctx.stringValue("UpdateItemMaterialResponse.ErrorCode"));
		updateItemMaterialResponse.setErrorMessage(_ctx.stringValue("UpdateItemMaterialResponse.ErrorMessage"));
		updateItemMaterialResponse.setCode(_ctx.stringValue("UpdateItemMaterialResponse.Code"));
		updateItemMaterialResponse.setDynamicCode(_ctx.stringValue("UpdateItemMaterialResponse.DynamicCode"));
		updateItemMaterialResponse.setDynamicMessage(_ctx.stringValue("UpdateItemMaterialResponse.DynamicMessage"));
	 
	 	return updateItemMaterialResponse;
	}
}