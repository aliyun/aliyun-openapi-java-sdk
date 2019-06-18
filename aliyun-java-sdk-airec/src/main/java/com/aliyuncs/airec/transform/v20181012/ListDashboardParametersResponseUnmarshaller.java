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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.ListDashboardParametersResponse;
import com.aliyuncs.airec.model.v20181012.ListDashboardParametersResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDashboardParametersResponseUnmarshaller {

	public static ListDashboardParametersResponse unmarshall(ListDashboardParametersResponse listDashboardParametersResponse, UnmarshallerContext context) {
		
		listDashboardParametersResponse.setRequestId(context.stringValue("ListDashboardParametersResponse.RequestId"));
		listDashboardParametersResponse.setCode(context.stringValue("ListDashboardParametersResponse.Code"));
		listDashboardParametersResponse.setMessage(context.stringValue("ListDashboardParametersResponse.Message"));

		Result result = new Result();

		List<String> traceId = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListDashboardParametersResponse.Result.TraceId.Length"); i++) {
			traceId.add(context.stringValue("ListDashboardParametersResponse.Result.TraceId["+ i +"]"));
		}
		result.setTraceId(traceId);

		List<String> sceneId = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("ListDashboardParametersResponse.Result.SceneId.Length"); i++) {
			sceneId.add(context.stringValue("ListDashboardParametersResponse.Result.SceneId["+ i +"]"));
		}
		result.setSceneId(sceneId);
		listDashboardParametersResponse.setResult(result);
	 
	 	return listDashboardParametersResponse;
	}
}