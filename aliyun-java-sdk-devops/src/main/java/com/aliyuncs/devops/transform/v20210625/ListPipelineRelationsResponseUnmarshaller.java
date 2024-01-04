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

package com.aliyuncs.devops.transform.v20210625;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.devops.model.v20210625.ListPipelineRelationsResponse;
import com.aliyuncs.devops.model.v20210625.ListPipelineRelationsResponse.PipelineRelation;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPipelineRelationsResponseUnmarshaller {

	public static ListPipelineRelationsResponse unmarshall(ListPipelineRelationsResponse listPipelineRelationsResponse, UnmarshallerContext _ctx) {
		
		listPipelineRelationsResponse.setRequestId(_ctx.stringValue("ListPipelineRelationsResponse.requestId"));
		listPipelineRelationsResponse.setErrorMessage(_ctx.stringValue("ListPipelineRelationsResponse.errorMessage"));
		listPipelineRelationsResponse.setErrorCode(_ctx.stringValue("ListPipelineRelationsResponse.errorCode"));
		listPipelineRelationsResponse.setSuccess(_ctx.booleanValue("ListPipelineRelationsResponse.success"));

		List<PipelineRelation> pipelineRelations = new ArrayList<PipelineRelation>();
		for (int i = 0; i < _ctx.lengthValue("ListPipelineRelationsResponse.pipelineRelations.Length"); i++) {
			PipelineRelation pipelineRelation = new PipelineRelation();
			pipelineRelation.setRefObjectId(_ctx.longValue("ListPipelineRelationsResponse.pipelineRelations["+ i +"].refObjectId"));

			pipelineRelations.add(pipelineRelation);
		}
		listPipelineRelationsResponse.setPipelineRelations(pipelineRelations);
	 
	 	return listPipelineRelationsResponse;
	}
}