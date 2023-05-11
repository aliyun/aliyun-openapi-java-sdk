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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListOTAModuleByProductResponse;
import com.aliyuncs.iot.model.v20180120.ListOTAModuleByProductResponse.OtaModuleDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOTAModuleByProductResponseUnmarshaller {

	public static ListOTAModuleByProductResponse unmarshall(ListOTAModuleByProductResponse listOTAModuleByProductResponse, UnmarshallerContext _ctx) {
		
		listOTAModuleByProductResponse.setRequestId(_ctx.stringValue("ListOTAModuleByProductResponse.RequestId"));
		listOTAModuleByProductResponse.setSuccess(_ctx.booleanValue("ListOTAModuleByProductResponse.Success"));
		listOTAModuleByProductResponse.setCode(_ctx.stringValue("ListOTAModuleByProductResponse.Code"));
		listOTAModuleByProductResponse.setErrorMessage(_ctx.stringValue("ListOTAModuleByProductResponse.ErrorMessage"));

		List<OtaModuleDTO> data = new ArrayList<OtaModuleDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListOTAModuleByProductResponse.Data.Length"); i++) {
			OtaModuleDTO otaModuleDTO = new OtaModuleDTO();
			otaModuleDTO.setProductKey(_ctx.stringValue("ListOTAModuleByProductResponse.Data["+ i +"].ProductKey"));
			otaModuleDTO.setModuleName(_ctx.stringValue("ListOTAModuleByProductResponse.Data["+ i +"].ModuleName"));
			otaModuleDTO.setAliasName(_ctx.stringValue("ListOTAModuleByProductResponse.Data["+ i +"].AliasName"));
			otaModuleDTO.setDesc(_ctx.stringValue("ListOTAModuleByProductResponse.Data["+ i +"].Desc"));
			otaModuleDTO.setGmtCreate(_ctx.stringValue("ListOTAModuleByProductResponse.Data["+ i +"].GmtCreate"));
			otaModuleDTO.setGmtModified(_ctx.stringValue("ListOTAModuleByProductResponse.Data["+ i +"].GmtModified"));

			data.add(otaModuleDTO);
		}
		listOTAModuleByProductResponse.setData(data);
	 
	 	return listOTAModuleByProductResponse;
	}
}