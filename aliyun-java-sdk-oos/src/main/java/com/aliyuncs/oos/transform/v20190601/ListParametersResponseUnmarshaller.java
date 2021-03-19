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

import com.aliyuncs.oos.model.v20190601.ListParametersResponse;
import com.aliyuncs.oos.model.v20190601.ListParametersResponse.Parameter;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListParametersResponseUnmarshaller {

	public static ListParametersResponse unmarshall(ListParametersResponse listParametersResponse, UnmarshallerContext _ctx) {
		
		listParametersResponse.setRequestId(_ctx.stringValue("ListParametersResponse.RequestId"));
		listParametersResponse.setMaxResults(_ctx.integerValue("ListParametersResponse.MaxResults"));
		listParametersResponse.setNextToken(_ctx.stringValue("ListParametersResponse.NextToken"));
		listParametersResponse.setTotalCount(_ctx.integerValue("ListParametersResponse.TotalCount"));

		List<Parameter> parameters = new ArrayList<Parameter>();
		for (int i = 0; i < _ctx.lengthValue("ListParametersResponse.Parameters.Length"); i++) {
			Parameter parameter = new Parameter();
			parameter.setName(_ctx.stringValue("ListParametersResponse.Parameters["+ i +"].Name"));
			parameter.setId(_ctx.stringValue("ListParametersResponse.Parameters["+ i +"].Id"));
			parameter.setCreatedDate(_ctx.stringValue("ListParametersResponse.Parameters["+ i +"].CreatedDate"));
			parameter.setCreatedBy(_ctx.stringValue("ListParametersResponse.Parameters["+ i +"].CreatedBy"));
			parameter.setUpdatedDate(_ctx.stringValue("ListParametersResponse.Parameters["+ i +"].UpdatedDate"));
			parameter.setUpdatedBy(_ctx.stringValue("ListParametersResponse.Parameters["+ i +"].UpdatedBy"));
			parameter.setDescription(_ctx.stringValue("ListParametersResponse.Parameters["+ i +"].Description"));
			parameter.setShareType(_ctx.stringValue("ListParametersResponse.Parameters["+ i +"].ShareType"));
			parameter.setParameterVersion(_ctx.stringValue("ListParametersResponse.Parameters["+ i +"].ParameterVersion"));
			parameter.setType(_ctx.stringValue("ListParametersResponse.Parameters["+ i +"].Type"));
			parameter.setTags(_ctx.mapValue("ListParametersResponse.Parameters["+ i +"].Tags"));

			parameters.add(parameter);
		}
		listParametersResponse.setParameters(parameters);
	 
	 	return listParametersResponse;
	}
}