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

import com.aliyuncs.oos.model.v20190601.UpdateSecretParameterResponse;
import com.aliyuncs.oos.model.v20190601.UpdateSecretParameterResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSecretParameterResponseUnmarshaller {

	public static UpdateSecretParameterResponse unmarshall(UpdateSecretParameterResponse updateSecretParameterResponse, UnmarshallerContext _ctx) {
		
		updateSecretParameterResponse.setRequestId(_ctx.stringValue("UpdateSecretParameterResponse.RequestId"));

		Parameter parameter = new Parameter();
		parameter.setId(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.Id"));
		parameter.setName(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.Name"));
		parameter.setCreatedDate(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.CreatedDate"));
		parameter.setCreatedBy(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.CreatedBy"));
		parameter.setUpdatedDate(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.UpdatedDate"));
		parameter.setUpdatedBy(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.UpdatedBy"));
		parameter.setDescription(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.Description"));
		parameter.setShareType(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.ShareType"));
		parameter.setParameterVersion(_ctx.integerValue("UpdateSecretParameterResponse.Parameter.ParameterVersion"));
		parameter.setType(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.Type"));
		parameter.setConstraints(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.Constraints"));
		parameter.setKeyId(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.KeyId"));
		parameter.setTags(_ctx.stringValue("UpdateSecretParameterResponse.Parameter.Tags"));
		updateSecretParameterResponse.setParameter(parameter);
	 
	 	return updateSecretParameterResponse;
	}
}