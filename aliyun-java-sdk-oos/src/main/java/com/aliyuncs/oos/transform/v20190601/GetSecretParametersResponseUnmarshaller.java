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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oos.model.v20190601.GetSecretParametersResponse;
import com.aliyuncs.oos.model.v20190601.GetSecretParametersResponse.Parameter;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecretParametersResponseUnmarshaller {

	public static GetSecretParametersResponse unmarshall(GetSecretParametersResponse getSecretParametersResponse, UnmarshallerContext _ctx) {
		
		getSecretParametersResponse.setRequestId(_ctx.stringValue("GetSecretParametersResponse.RequestId"));

		List<String> invalidParameters = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSecretParametersResponse.InvalidParameters.Length"); i++) {
			invalidParameters.add(_ctx.stringValue("GetSecretParametersResponse.InvalidParameters["+ i +"]"));
		}
		getSecretParametersResponse.setInvalidParameters(invalidParameters);

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("GetSecretParametersResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setId(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].Id"));
			parameter.setName(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].Name"));
			parameter.setCreatedDate(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].CreatedDate"));
			parameter.setCreatedBy(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].CreatedBy"));
			parameter.setUpdatedDate(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].UpdatedDate"));
			parameter.setUpdatedBy(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].UpdatedBy"));
			parameter.setDescription(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].Description"));
			parameter.setShareType(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].ShareType"));
			parameter.setParameterVersion(_ctx.integerValue("GetSecretParametersResponse.Parameters["+ i +"].ParameterVersion"));
			parameter.setType(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].Type"));
			parameter.setValue(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].Value"));
			parameter.setConstraints(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].Constraints"));
			parameter.setKeyId(_ctx.stringValue("GetSecretParametersResponse.Parameters["+ i +"].KeyId"));
			parameter.setTags(_ctx.mapValue("GetSecretParametersResponse.Parameters["+ i +"].Tags"));

			parameters.add(parameter);
		}
		getSecretParametersResponse.setParameters(parameters);
	 
	 	return getSecretParametersResponse;
	}
}