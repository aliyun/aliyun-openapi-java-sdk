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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.GetApplicationEmpIdRelationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetApplicationEmpIdRelationResponseUnmarshaller {

	public static GetApplicationEmpIdRelationResponse unmarshall(GetApplicationEmpIdRelationResponse getApplicationEmpIdRelationResponse, UnmarshallerContext _ctx) {
		
		getApplicationEmpIdRelationResponse.setRequestId(_ctx.stringValue("GetApplicationEmpIdRelationResponse.RequestId"));
		getApplicationEmpIdRelationResponse.setMessage(_ctx.stringValue("GetApplicationEmpIdRelationResponse.Message"));
		getApplicationEmpIdRelationResponse.setHttpStatusCode(_ctx.integerValue("GetApplicationEmpIdRelationResponse.HttpStatusCode"));
		getApplicationEmpIdRelationResponse.setSuccess(_ctx.booleanValue("GetApplicationEmpIdRelationResponse.Success"));
		getApplicationEmpIdRelationResponse.setCode(_ctx.stringValue("GetApplicationEmpIdRelationResponse.Code"));

		List<String> empIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetApplicationEmpIdRelationResponse.EmpIds.Length"); i++) {
			empIds.add(_ctx.stringValue("GetApplicationEmpIdRelationResponse.EmpIds["+ i +"]"));
		}
		getApplicationEmpIdRelationResponse.setEmpIds(empIds);
	 
	 	return getApplicationEmpIdRelationResponse;
	}
}