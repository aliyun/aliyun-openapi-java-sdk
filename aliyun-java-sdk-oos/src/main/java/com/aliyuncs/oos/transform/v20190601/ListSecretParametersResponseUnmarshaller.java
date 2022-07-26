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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecretParametersResponseUnmarshaller {

	public static ListSecretParametersResponse unmarshall(ListSecretParametersResponse listSecretParametersResponse, UnmarshallerContext _ctx) {
		
		listSecretParametersResponse.setRequestId(_ctx.stringValue("ListSecretParametersResponse.RequestId"));
		listSecretParametersResponse.setNextToken(_ctx.stringValue("ListSecretParametersResponse.NextToken"));
		listSecretParametersResponse.setMaxResults(_ctx.integerValue("ListSecretParametersResponse.MaxResults"));

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("ListSecretParametersResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setType(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].Type"));
			parameter.setUpdatedDate(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].UpdatedDate"));
			parameter.setUpdatedBy(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].UpdatedBy"));
			parameter.setKeyId(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].KeyId"));
			parameter.setTags(_ctx.mapValue("ListSecretParametersResponse.Parameters["+ i +"].Tags"));
			parameter.setDescription(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].Description"));
			parameter.setResourceGroupId(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].ResourceGroupId"));
			parameter.setCreatedBy(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].CreatedBy"));
			parameter.setCreatedDate(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].CreatedDate"));
			parameter.setParameterVersion(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].ParameterVersion"));
			parameter.setName(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].Name"));
			parameter.setId(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].Id"));
			parameter.setShareType(_ctx.stringValue("ListSecretParametersResponse.Parameters["+ i +"].ShareType"));

			parameters.add(parameter);
		}
		listSecretParametersResponse.setParameters(parameters);
	 
	 	return listSecretParametersResponse;
	}
}