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

package com.aliyuncs.lrg.transform.v20191010;

import com.aliyuncs.lrg.model.v20191010.GetClusterYamlResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterYamlResponseUnmarshaller {

	public static GetClusterYamlResponse unmarshall(GetClusterYamlResponse getClusterYamlResponse, UnmarshallerContext _ctx) {
		
		getClusterYamlResponse.setCode(_ctx.integerValue("GetClusterYamlResponse.code"));
		getClusterYamlResponse.setData(_ctx.mapValue("GetClusterYamlResponse.data"));
		getClusterYamlResponse.setMessage(_ctx.stringValue("GetClusterYamlResponse.message"));
		getClusterYamlResponse.setSuccess(_ctx.booleanValue("GetClusterYamlResponse.success"));
	 
	 	return getClusterYamlResponse;
	}
}