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

package com.aliyuncs.emap.transform.v20200608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emap.model.v20200608.QueryMapVersionsResponse;
import com.aliyuncs.emap.model.v20200608.QueryMapVersionsResponse.EmapVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMapVersionsResponseUnmarshaller {

	public static QueryMapVersionsResponse unmarshall(QueryMapVersionsResponse queryMapVersionsResponse, UnmarshallerContext _ctx) {
		
		queryMapVersionsResponse.setRequestId(_ctx.stringValue("QueryMapVersionsResponse.RequestId"));
		queryMapVersionsResponse.setMessage(_ctx.stringValue("QueryMapVersionsResponse.Message"));
		queryMapVersionsResponse.setErrorCode(_ctx.stringValue("QueryMapVersionsResponse.ErrorCode"));
		queryMapVersionsResponse.setErrorMessage(_ctx.stringValue("QueryMapVersionsResponse.ErrorMessage"));
		queryMapVersionsResponse.setDynamicMessage(_ctx.stringValue("QueryMapVersionsResponse.DynamicMessage"));
		queryMapVersionsResponse.setSuccess(_ctx.booleanValue("QueryMapVersionsResponse.Success"));
		queryMapVersionsResponse.setDynamicCode(_ctx.stringValue("QueryMapVersionsResponse.DynamicCode"));
		queryMapVersionsResponse.setCode(_ctx.stringValue("QueryMapVersionsResponse.Code"));

		List<EmapVersion> versions = new ArrayList<EmapVersion>();
		for (int i = 0; i < _ctx.lengthValue("QueryMapVersionsResponse.Versions.Length"); i++) {
			EmapVersion emapVersion = new EmapVersion();
			emapVersion.setVersion(_ctx.stringValue("QueryMapVersionsResponse.Versions["+ i +"].Version"));

			versions.add(emapVersion);
		}
		queryMapVersionsResponse.setVersions(versions);
	 
	 	return queryMapVersionsResponse;
	}
}