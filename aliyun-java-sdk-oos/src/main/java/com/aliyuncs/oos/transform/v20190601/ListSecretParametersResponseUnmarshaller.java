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

import com.aliyuncs.oos.model.v20190601.ListSecretParametersResponse;
import com.aliyuncs.oos.model.v20190601.ListSecretParametersResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecretParametersResponseUnmarshaller {

	public static ListSecretParametersResponse unmarshall(ListSecretParametersResponse listSecretParametersResponse, UnmarshallerContext _ctx) {
		
		listSecretParametersResponse.setRequestId(_ctx.stringValue("ListSecretParametersResponse.RequestId"));
		listSecretParametersResponse.setMaxResults(_ctx.integerValue("ListSecretParametersResponse.MaxResults"));
		listSecretParametersResponse.setNextToken(_ctx.stringValue("ListSecretParametersResponse.NextToken"));

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("ListSecretParametersResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setName(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].Name"));
			parameter.setId(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].Id"));
			parameter.setCreatedDate(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].CreatedDate"));
			parameter.setCreatedBy(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].CreatedBy"));
			parameter.setUpdatedDate(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].UpdatedDate"));
			parameter.setUpdatedBy(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].UpdatedBy"));
			parameter.setDescription(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].Description"));
			parameter.setShareType(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].ShareType"));
			parameter.setParameterVersion(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].ParameterVersion"));
			parameter.setType(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].Type"));
			parameter.setKeyId(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].KeyId"));

			parameters.add(parameter);
		}
		listSecretParametersResponse.setParameters(parameters);
	 
	 	return listSecretParametersResponse;
	}
}