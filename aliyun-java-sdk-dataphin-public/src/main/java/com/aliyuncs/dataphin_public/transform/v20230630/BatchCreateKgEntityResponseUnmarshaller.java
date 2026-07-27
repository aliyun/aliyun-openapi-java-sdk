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

import com.aliyuncs.dataphin_public.model.v20230630.BatchCreateKgEntityResponse;
import com.aliyuncs.dataphin_public.model.v20230630.BatchCreateKgEntityResponse.CreateResult;
import com.aliyuncs.dataphin_public.model.v20230630.BatchCreateKgEntityResponse.CreateResult.SuccessEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCreateKgEntityResponseUnmarshaller {

	public static BatchCreateKgEntityResponse unmarshall(BatchCreateKgEntityResponse batchCreateKgEntityResponse, UnmarshallerContext _ctx) {
		
		batchCreateKgEntityResponse.setRequestId(_ctx.stringValue("BatchCreateKgEntityResponse.RequestId"));
		batchCreateKgEntityResponse.setMessage(_ctx.stringValue("BatchCreateKgEntityResponse.Message"));
		batchCreateKgEntityResponse.setHttpStatusCode(_ctx.integerValue("BatchCreateKgEntityResponse.HttpStatusCode"));
		batchCreateKgEntityResponse.setCode(_ctx.stringValue("BatchCreateKgEntityResponse.Code"));
		batchCreateKgEntityResponse.setSuccess(_ctx.booleanValue("BatchCreateKgEntityResponse.Success"));

		CreateResult createResult = new CreateResult();
		createResult.setFailCount(_ctx.integerValue("BatchCreateKgEntityResponse.CreateResult.FailCount"));
		createResult.setSuccessCount(_ctx.integerValue("BatchCreateKgEntityResponse.CreateResult.SuccessCount"));

		List<SuccessEntity> successEntityList = new ArrayList<SuccessEntity>();
		for (int i = 0; i < _ctx.lengthValue("BatchCreateKgEntityResponse.CreateResult.SuccessEntityList.Length"); i++) {
			SuccessEntity successEntity = new SuccessEntity();
			successEntity.setEntityType(_ctx.stringValue("BatchCreateKgEntityResponse.CreateResult.SuccessEntityList["+ i +"].EntityType"));
			successEntity.setEntityId(_ctx.stringValue("BatchCreateKgEntityResponse.CreateResult.SuccessEntityList["+ i +"].EntityId"));

			successEntityList.add(successEntity);
		}
		createResult.setSuccessEntityList(successEntityList);
		batchCreateKgEntityResponse.setCreateResult(createResult);
	 
	 	return batchCreateKgEntityResponse;
	}
}