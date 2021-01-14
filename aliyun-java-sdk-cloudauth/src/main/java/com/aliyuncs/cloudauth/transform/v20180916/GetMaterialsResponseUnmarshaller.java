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

package com.aliyuncs.cloudauth.transform.v20180916;

import com.aliyuncs.cloudauth.model.v20180916.GetMaterialsResponse;
import com.aliyuncs.cloudauth.model.v20180916.GetMaterialsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMaterialsResponseUnmarshaller {

	public static GetMaterialsResponse unmarshall(GetMaterialsResponse getMaterialsResponse, UnmarshallerContext _ctx) {
		
		getMaterialsResponse.setRequestId(_ctx.stringValue("GetMaterialsResponse.RequestId"));
		getMaterialsResponse.setSuccess(_ctx.booleanValue("GetMaterialsResponse.Success"));
		getMaterialsResponse.setCode(_ctx.stringValue("GetMaterialsResponse.Code"));
		getMaterialsResponse.setMessage(_ctx.stringValue("GetMaterialsResponse.Message"));

		Data data = new Data();
		data.setName(_ctx.stringValue("GetMaterialsResponse.Data.Name"));
		data.setIdentificationNumber(_ctx.stringValue("GetMaterialsResponse.Data.IdentificationNumber"));
		data.setIdCardType(_ctx.stringValue("GetMaterialsResponse.Data.IdCardType"));
		data.setIdCardStartDate(_ctx.stringValue("GetMaterialsResponse.Data.IdCardStartDate"));
		data.setIdCardExpiry(_ctx.stringValue("GetMaterialsResponse.Data.IdCardExpiry"));
		data.setAddress(_ctx.stringValue("GetMaterialsResponse.Data.Address"));
		data.setSex(_ctx.stringValue("GetMaterialsResponse.Data.Sex"));
		data.setIdCardFrontPic(_ctx.stringValue("GetMaterialsResponse.Data.IdCardFrontPic"));
		data.setIdCardBackPic(_ctx.stringValue("GetMaterialsResponse.Data.IdCardBackPic"));
		data.setFacePic(_ctx.stringValue("GetMaterialsResponse.Data.FacePic"));
		data.setEthnicGroup(_ctx.stringValue("GetMaterialsResponse.Data.EthnicGroup"));
		data.setAuthority(_ctx.stringValue("GetMaterialsResponse.Data.Authority"));
		getMaterialsResponse.setData(data);
	 
	 	return getMaterialsResponse;
	}
}