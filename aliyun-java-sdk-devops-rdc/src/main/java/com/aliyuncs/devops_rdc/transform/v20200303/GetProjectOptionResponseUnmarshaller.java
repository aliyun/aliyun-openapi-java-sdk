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

package com.aliyuncs.devops_rdc.transform.v20200303;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops_rdc.model.v20200303.GetProjectOptionResponse;
import com.aliyuncs.devops_rdc.model.v20200303.GetProjectOptionResponse.Option;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProjectOptionResponseUnmarshaller {

	public static GetProjectOptionResponse unmarshall(GetProjectOptionResponse getProjectOptionResponse, UnmarshallerContext _ctx) {
		
		getProjectOptionResponse.setRequestId(_ctx.stringValue("GetProjectOptionResponse.RequestId"));
		getProjectOptionResponse.setSuccessful(_ctx.booleanValue("GetProjectOptionResponse.Successful"));
		getProjectOptionResponse.setErrorCode(_ctx.stringValue("GetProjectOptionResponse.ErrorCode"));
		getProjectOptionResponse.setErrorMsg(_ctx.stringValue("GetProjectOptionResponse.ErrorMsg"));

		List<Option> object = new ArrayList<Option>();
		for (int i = 0; i < _ctx.lengthValue("GetProjectOptionResponse.Object.Length"); i++) {
			Option option = new Option();
			option.setName(_ctx.stringValue("GetProjectOptionResponse.Object["+ i +"].Name"));
			option.setValue(_ctx.stringValue("GetProjectOptionResponse.Object["+ i +"].Value"));
			option.setKind(_ctx.stringValue("GetProjectOptionResponse.Object["+ i +"].Kind"));
			option.setScopeName(_ctx.stringValue("GetProjectOptionResponse.Object["+ i +"].ScopeName"));

			object.add(option);
		}
		getProjectOptionResponse.setObject(object);
	 
	 	return getProjectOptionResponse;
	}
}