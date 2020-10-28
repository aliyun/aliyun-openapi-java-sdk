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

import com.aliyuncs.oos.model.v20190601.GetSecretParametersByPathResponse;
import com.aliyuncs.oos.model.v20190601.GetSecretParametersByPathResponse.Parameter;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSecretParametersByPathResponseUnmarshaller {

	public static GetSecretParametersByPathResponse unmarshall(GetSecretParametersByPathResponse getSecretParametersByPathResponse, UnmarshallerContext _ctx) {
		
		getSecretParametersByPathResponse.setRequestId(_ctx.stringValue("GetSecretParametersByPathResponse.RequestId"));
		getSecretParametersByPathResponse.setNextToken(_ctx.stringValue("GetSecretParametersByPathResponse.NextToken"));
		getSecretParametersByPathResponse.setMaxResults(_ctx.integerValue("GetSecretParametersByPathResponse.MaxResults"));
		getSecretParametersByPathResponse.setTotalCount(_ctx.integerValue("GetSecretParametersByPathResponse.TotalCount"));

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("GetSecretParametersByPathResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setId(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].Id"));
			parameter.setName(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].Name"));
			parameter.setCreatedDate(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].CreatedDate"));
			parameter.setCreatedBy(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].CreatedBy"));
			parameter.setUpdatedDate(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].UpdatedDate"));
			parameter.setUpdatedBy(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].UpdatedBy"));
			parameter.setDescription(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].Description"));
			parameter.setShareType(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].ShareType"));
			parameter.setParameterVersion(_ctx.integerValue("GetSecretParametersByPathResponse.Parameters["+ i +"].ParameterVersion"));
			parameter.setType(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].Type"));
			parameter.setValue(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].Value"));
			parameter.setConstraints(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].Constraints"));
			parameter.setKeyId(_ctx.stringValue("GetSecretParametersByPathResponse.Parameters["+ i +"].KeyId"));

			parameters.add(parameter);
		}
		getSecretParametersByPathResponse.setParameters(parameters);
	 
	 	return getSecretParametersByPathResponse;
	}
}