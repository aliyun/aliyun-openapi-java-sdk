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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryIdempotenceResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryIdempotenceResponse.IdempotenceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryIdempotenceResponseUnmarshaller {

	public static OpsQueryIdempotenceResponse unmarshall(OpsQueryIdempotenceResponse opsQueryIdempotenceResponse, UnmarshallerContext _ctx) {
		
		opsQueryIdempotenceResponse.setRequestId(_ctx.stringValue("OpsQueryIdempotenceResponse.RequestId"));

		List<IdempotenceModel> idempotenceModels = new ArrayList<IdempotenceModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryIdempotenceResponse.IdempotenceModels.Length"); i++) {
			IdempotenceModel idempotenceModel = new IdempotenceModel();
			idempotenceModel.setId(_ctx.longValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].Id"));
			idempotenceModel.setToken(_ctx.stringValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].Token"));
			idempotenceModel.setVersion(_ctx.integerValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].Version"));
			idempotenceModel.setStatus(_ctx.stringValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].Status"));
			idempotenceModel.setGmtCreated(_ctx.stringValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].GmtCreated"));
			idempotenceModel.setGmtModified(_ctx.stringValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].GmtModified"));
			idempotenceModel.setDeleted(_ctx.booleanValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].Deleted"));
			idempotenceModel.setContinueAfterProcessingTimeout(_ctx.booleanValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].ContinueAfterProcessingTimeout"));
			idempotenceModel.setExpireDate(_ctx.stringValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].ExpireDate"));
			idempotenceModel.setProcessingExpireDate(_ctx.stringValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].ProcessingExpireDate"));
			idempotenceModel.setLastResult(_ctx.stringValue("OpsQueryIdempotenceResponse.IdempotenceModels["+ i +"].LastResult"));

			idempotenceModels.add(idempotenceModel);
		}
		opsQueryIdempotenceResponse.setIdempotenceModels(idempotenceModels);
	 
	 	return opsQueryIdempotenceResponse;
	}
}