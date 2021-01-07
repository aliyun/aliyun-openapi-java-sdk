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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListIndexVersionsResponse;
import com.aliyuncs.airec.model.v20201126.ListIndexVersionsResponse.IndeVersion;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListIndexVersionsResponseUnmarshaller {

	public static ListIndexVersionsResponse unmarshall(ListIndexVersionsResponse listIndexVersionsResponse, UnmarshallerContext _ctx) {
		
		listIndexVersionsResponse.setRequestId(_ctx.stringValue("ListIndexVersionsResponse.requestId"));

		List<IndeVersion> result = new ArrayList<IndeVersion>();
		for (int i = 0; i < _ctx.lengthValue("ListIndexVersionsResponse.result.Length"); i++) {
			IndeVersion indeVersion = new IndeVersion();
			indeVersion.setVersionId(_ctx.stringValue("ListIndexVersionsResponse.result["+ i +"].versionId"));
			indeVersion.setStatus(_ctx.stringValue("ListIndexVersionsResponse.result["+ i +"].status"));
			indeVersion.setBuiltTime(_ctx.stringValue("ListIndexVersionsResponse.result["+ i +"].builtTime"));
			indeVersion.setSwitchedTime(_ctx.stringValue("ListIndexVersionsResponse.result["+ i +"].switchedTime"));
			indeVersion.setRollbackEnabled(_ctx.booleanValue("ListIndexVersionsResponse.result["+ i +"].rollbackEnabled"));
			indeVersion.setCostSeconds(_ctx.integerValue("ListIndexVersionsResponse.result["+ i +"].costSeconds"));
			indeVersion.setSize(_ctx.longValue("ListIndexVersionsResponse.result["+ i +"].size"));
			indeVersion.setProgress(_ctx.integerValue("ListIndexVersionsResponse.result["+ i +"].progress"));
			indeVersion.setFlowType(_ctx.stringValue("ListIndexVersionsResponse.result["+ i +"].flowType"));
			indeVersion.setCode(_ctx.stringValue("ListIndexVersionsResponse.result["+ i +"].code"));
			indeVersion.setMessage(_ctx.stringValue("ListIndexVersionsResponse.result["+ i +"].message"));

			result.add(indeVersion);
		}
		listIndexVersionsResponse.setResult(result);
	 
	 	return listIndexVersionsResponse;
	}
}