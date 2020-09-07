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

import com.aliyuncs.oos.model.v20190601.ListSecretParameterVersionsResponse;
import com.aliyuncs.oos.model.v20190601.ListSecretParameterVersionsResponse.ParameterVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSecretParameterVersionsResponseUnmarshaller {

	public static ListSecretParameterVersionsResponse unmarshall(ListSecretParameterVersionsResponse listSecretParameterVersionsResponse, UnmarshallerContext _ctx) {
		
		listSecretParameterVersionsResponse.setRequestId(_ctx.stringValue("ListSecretParameterVersionsResponse.RequestId"));
		listSecretParameterVersionsResponse.setMaxResults(_ctx.integerValue("ListSecretParameterVersionsResponse.MaxResults"));
		listSecretParameterVersionsResponse.setNextToken(_ctx.stringValue("ListSecretParameterVersionsResponse.NextToken"));
		listSecretParameterVersionsResponse.setTotalCount(_ctx.integerValue("ListSecretParameterVersionsResponse.TotalCount"));
		listSecretParameterVersionsResponse.setName(_ctx.stringValue("ListSecretParameterVersionsResponse.Name"));
		listSecretParameterVersionsResponse.setId(_ctx.stringValue("ListSecretParameterVersionsResponse.Id"));
		listSecretParameterVersionsResponse.setType(_ctx.stringValue("ListSecretParameterVersionsResponse.Type"));
		listSecretParameterVersionsResponse.setDescription(_ctx.stringValue("ListSecretParameterVersionsResponse.Description"));
		listSecretParameterVersionsResponse.setCreatedDate(_ctx.stringValue("ListSecretParameterVersionsResponse.CreatedDate"));
		listSecretParameterVersionsResponse.setCreatedBy(_ctx.stringValue("ListSecretParameterVersionsResponse.CreatedBy"));

		List<ParameterVersion> parameterVersions = new ArrayList<ParameterVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListSecretParameterVersionsResponse.ParameterVersions.Length"); i++) {
			ParameterVersion parameterVersion = new ParameterVersion();
			parameterVersion.setUpdatedDate(_ctx.stringValue("ListSecretParameterVersionsResponse.ParameterVersions["+ i +"].UpdatedDate"));
			parameterVersion.setUpdatedBy(_ctx.stringValue("ListSecretParameterVersionsResponse.ParameterVersions["+ i +"].UpdatedBy"));
			parameterVersion.setParameterVersion(_ctx.integerValue("ListSecretParameterVersionsResponse.ParameterVersions["+ i +"].ParameterVersion"));
			parameterVersion.setValue(_ctx.stringValue("ListSecretParameterVersionsResponse.ParameterVersions["+ i +"].Value"));

			parameterVersions.add(parameterVersion);
		}
		listSecretParameterVersionsResponse.setParameterVersions(parameterVersions);
	 
	 	return listSecretParameterVersionsResponse;
	}
}