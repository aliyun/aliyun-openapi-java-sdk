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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.BatchCreateKgRelationResponse;
import com.aliyuncs.dataphin_public.model.v20230630.BatchCreateKgRelationResponse.CreateResult;
import com.aliyuncs.dataphin_public.model.v20230630.BatchCreateKgRelationResponse.CreateResult.SuccessRelation;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateKgRelationResponseUnmarshaller {

	public static BatchCreateKgRelationResponse unmarshall(BatchCreateKgRelationResponse batchCreateKgRelationResponse, UnmarshallerContext _ctx) {
		
		batchCreateKgRelationResponse.setRequestId(_ctx.stringValue("BatchCreateKgRelationResponse.RequestId"));
		batchCreateKgRelationResponse.setMessage(_ctx.stringValue("BatchCreateKgRelationResponse.Message"));
		batchCreateKgRelationResponse.setHttpStatusCode(_ctx.integerValue("BatchCreateKgRelationResponse.HttpStatusCode"));
		batchCreateKgRelationResponse.setCode(_ctx.stringValue("BatchCreateKgRelationResponse.Code"));
		batchCreateKgRelationResponse.setSuccess(_ctx.booleanValue("BatchCreateKgRelationResponse.Success"));

		CreateResult createResult = new CreateResult();
		createResult.setFailCount(_ctx.integerValue("BatchCreateKgRelationResponse.CreateResult.FailCount"));
		createResult.setSuccessCount(_ctx.integerValue("BatchCreateKgRelationResponse.CreateResult.SuccessCount"));

		List<SuccessRelation> successRelationList = new ArrayList<SuccessRelation>();
		for (int i = 0; i < _ctx.lengthValue("BatchCreateKgRelationResponse.CreateResult.SuccessRelationList.Length"); i++) {
			SuccessRelation successRelation = new SuccessRelation();
			successRelation.setRelationType(_ctx.stringValue("BatchCreateKgRelationResponse.CreateResult.SuccessRelationList["+ i +"].RelationType"));
			successRelation.setRelationId(_ctx.stringValue("BatchCreateKgRelationResponse.CreateResult.SuccessRelationList["+ i +"].RelationId"));

			successRelationList.add(successRelation);
		}
		createResult.setSuccessRelationList(successRelationList);
		batchCreateKgRelationResponse.setCreateResult(createResult);
	 
	 	return batchCreateKgRelationResponse;
	}
}