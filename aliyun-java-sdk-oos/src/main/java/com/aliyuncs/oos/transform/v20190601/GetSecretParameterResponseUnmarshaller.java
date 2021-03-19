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

package com.aliyuncs.oos.transform.v20190601;

import com.aliyuncs.oos.model.v20190601.GetSecretParameterResponse;
import com.aliyuncs.oos.model.v20190601.GetSecretParameterResponse.Parameter;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecretParameterResponseUnmarshaller {

	public static GetSecretParameterResponse unmarshall(GetSecretParameterResponse getSecretParameterResponse, UnmarshallerContext _ctx) {
		
		getSecretParameterResponse.setRequestId(_ctx.stringValue("GetSecretParameterResponse.RequestId"));

		Parameter parameter = new Parameter();
		parameter.setId(_ctx.stringValue("GetSecretParameterResponse.Parameter.Id"));
		parameter.setName(_ctx.stringValue("GetSecretParameterResponse.Parameter.Name"));
		parameter.setCreatedDate(_ctx.stringValue("GetSecretParameterResponse.Parameter.CreatedDate"));
		parameter.setCreatedBy(_ctx.stringValue("GetSecretParameterResponse.Parameter.CreatedBy"));
		parameter.setUpdatedDate(_ctx.stringValue("GetSecretParameterResponse.Parameter.UpdatedDate"));
		parameter.setUpdatedBy(_ctx.stringValue("GetSecretParameterResponse.Parameter.UpdatedBy"));
		parameter.setDescription(_ctx.stringValue("GetSecretParameterResponse.Parameter.Description"));
		parameter.setShareType(_ctx.stringValue("GetSecretParameterResponse.Parameter.ShareType"));
		parameter.setParameterVersion(_ctx.integerValue("GetSecretParameterResponse.Parameter.ParameterVersion"));
		parameter.setType(_ctx.stringValue("GetSecretParameterResponse.Parameter.Type"));
		parameter.setValue(_ctx.stringValue("GetSecretParameterResponse.Parameter.Value"));
		parameter.setConstraints(_ctx.stringValue("GetSecretParameterResponse.Parameter.Constraints"));
		parameter.setKeyId(_ctx.stringValue("GetSecretParameterResponse.Parameter.KeyId"));
		parameter.setTags(_ctx.mapValue("GetSecretParameterResponse.Parameter.Tags"));
		getSecretParameterResponse.setParameter(parameter);
	 
	 	return getSecretParameterResponse;
	}
}