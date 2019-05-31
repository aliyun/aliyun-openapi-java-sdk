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

	public static GetMaterialsResponse unmarshall(GetMaterialsResponse getMaterialsResponse, UnmarshallerContext context) {
		
		getMaterialsResponse.setRequestId(context.stringValue("GetMaterialsResponse.RequestId"));
		getMaterialsResponse.setSuccess(context.booleanValue("GetMaterialsResponse.Success"));
		getMaterialsResponse.setCode(context.stringValue("GetMaterialsResponse.Code"));
		getMaterialsResponse.setMessage(context.stringValue("GetMaterialsResponse.Message"));

		Data data = new Data();
		data.setName(context.stringValue("GetMaterialsResponse.Data.Name"));
		data.setIdentificationNumber(context.stringValue("GetMaterialsResponse.Data.IdentificationNumber"));
		data.setIdCardType(context.stringValue("GetMaterialsResponse.Data.IdCardType"));
		data.setIdCardStartDate(context.stringValue("GetMaterialsResponse.Data.IdCardStartDate"));
		data.setIdCardExpiry(context.stringValue("GetMaterialsResponse.Data.IdCardExpiry"));
		data.setAddress(context.stringValue("GetMaterialsResponse.Data.Address"));
		data.setSex(context.stringValue("GetMaterialsResponse.Data.Sex"));
		data.setIdCardFrontPic(context.stringValue("GetMaterialsResponse.Data.IdCardFrontPic"));
		data.setIdCardBackPic(context.stringValue("GetMaterialsResponse.Data.IdCardBackPic"));
		data.setFacePic(context.stringValue("GetMaterialsResponse.Data.FacePic"));
		data.setEthnicGroup(context.stringValue("GetMaterialsResponse.Data.EthnicGroup"));
		data.setAuthority(context.stringValue("GetMaterialsResponse.Data.Authority"));
		getMaterialsResponse.setData(data);
	 
	 	return getMaterialsResponse;
	}
}