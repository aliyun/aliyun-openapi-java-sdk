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

import com.aliyuncs.oos.model.v20190601.CreateSecretParameterResponse;
import com.aliyuncs.oos.model.v20190601.CreateSecretParameterResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSecretParameterResponseUnmarshaller {

	public static CreateSecretParameterResponse unmarshall(CreateSecretParameterResponse createSecretParameterResponse, UnmarshallerContext _ctx) {
		
		createSecretParameterResponse.setRequestId(_ctx.stringValue("CreateSecretParameterResponse.RequestId"));

		Parameter parameter = new Parameter();
		parameter.setId(_ctx.stringValue("CreateSecretParameterResponse.Parameter.Id"));
		parameter.setName(_ctx.stringValue("CreateSecretParameterResponse.Parameter.Name"));
		parameter.setCreatedDate(_ctx.stringValue("CreateSecretParameterResponse.Parameter.CreatedDate"));
		parameter.setCreatedBy(_ctx.stringValue("CreateSecretParameterResponse.Parameter.CreatedBy"));
		parameter.setUpdatedDate(_ctx.stringValue("CreateSecretParameterResponse.Parameter.UpdatedDate"));
		parameter.setUpdatedBy(_ctx.stringValue("CreateSecretParameterResponse.Parameter.UpdatedBy"));
		parameter.setDescription(_ctx.stringValue("CreateSecretParameterResponse.Parameter.Description"));
		parameter.setShareType(_ctx.stringValue("CreateSecretParameterResponse.Parameter.ShareType"));
		parameter.setParameterVersion(_ctx.integerValue("CreateSecretParameterResponse.Parameter.ParameterVersion"));
		parameter.setType(_ctx.stringValue("CreateSecretParameterResponse.Parameter.Type"));
		createSecretParameterResponse.setParameter(parameter);
	 
	 	return createSecretParameterResponse;
	}
}