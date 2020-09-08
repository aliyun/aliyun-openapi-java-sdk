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

package com.aliyuncs.ahas_openapi.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ahas_openapi.model.v20190901.QueryExperimentsByEmpIdResponse;
import com.aliyuncs.ahas_openapi.model.v20190901.QueryExperimentsByEmpIdResponse.ExperimentMetaForMk;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryExperimentsByEmpIdResponseUnmarshaller {

	public static QueryExperimentsByEmpIdResponse unmarshall(QueryExperimentsByEmpIdResponse queryExperimentsByEmpIdResponse, UnmarshallerContext _ctx) {
		
		queryExperimentsByEmpIdResponse.setRequestId(_ctx.stringValue("QueryExperimentsByEmpIdResponse.RequestId"));
		queryExperimentsByEmpIdResponse.setMessage(_ctx.stringValue("QueryExperimentsByEmpIdResponse.Message"));
		queryExperimentsByEmpIdResponse.setHttpStatusCode(_ctx.integerValue("QueryExperimentsByEmpIdResponse.HttpStatusCode"));
		queryExperimentsByEmpIdResponse.setSuccess(_ctx.booleanValue("QueryExperimentsByEmpIdResponse.Success"));
		queryExperimentsByEmpIdResponse.setCode(_ctx.stringValue("QueryExperimentsByEmpIdResponse.Code"));

		List<ExperimentMetaForMk> content = new ArrayList<ExperimentMetaForMk>();
		for (int i = 0; i < _ctx.lengthValue("QueryExperimentsByEmpIdResponse.Content.Length"); i++) {
			ExperimentMetaForMk experimentMetaForMk = new ExperimentMetaForMk();
			experimentMetaForMk.setExperimentId(_ctx.stringValue("QueryExperimentsByEmpIdResponse.Content["+ i +"].ExperimentId"));
			experimentMetaForMk.setName(_ctx.stringValue("QueryExperimentsByEmpIdResponse.Content["+ i +"].Name"));
			experimentMetaForMk.setNamespace(_ctx.stringValue("QueryExperimentsByEmpIdResponse.Content["+ i +"].Namespace"));
			experimentMetaForMk.setRegionId(_ctx.stringValue("QueryExperimentsByEmpIdResponse.Content["+ i +"].RegionId"));

			content.add(experimentMetaForMk);
		}
		queryExperimentsByEmpIdResponse.setContent(content);
	 
	 	return queryExperimentsByEmpIdResponse;
	}
}