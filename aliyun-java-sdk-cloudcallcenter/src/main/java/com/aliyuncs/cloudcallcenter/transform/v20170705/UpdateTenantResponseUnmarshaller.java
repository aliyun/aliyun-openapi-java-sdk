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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.UpdateTenantResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.UpdateTenantResponse.UpdateTenantResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTenantResponseUnmarshaller {

	public static UpdateTenantResponse unmarshall(UpdateTenantResponse updateTenantResponse, UnmarshallerContext context) {
		
		updateTenantResponse.setRequestId(context.stringValue("UpdateTenantResponse.RequestId"));
		updateTenantResponse.setSuccess(context.booleanValue("UpdateTenantResponse.Success"));
		updateTenantResponse.setCode(context.stringValue("UpdateTenantResponse.Code"));
		updateTenantResponse.setMessage(context.stringValue("UpdateTenantResponse.Message"));
		updateTenantResponse.setHttpStatusCode(context.integerValue("UpdateTenantResponse.HttpStatusCode"));

		List<UpdateTenantResult> updateTenantResultList = new ArrayList<UpdateTenantResult>();
		for (int i = 0; i < context.lengthValue("UpdateTenantResponse.updateTenantResultList.Length"); i++) {
			UpdateTenantResult updateTenantResult = new UpdateTenantResult();
			updateTenantResult.setTenantName(context.stringValue("UpdateTenantResponse.updateTenantResultList["+ i +"].tenantName"));
			updateTenantResult.setTenantId(context.stringValue("UpdateTenantResponse.updateTenantResultList["+ i +"].tenantId"));
			updateTenantResult.setTenantStatus(context.integerValue("UpdateTenantResponse.updateTenantResultList["+ i +"].tenantStatus"));
			updateTenantResult.setResult(context.integerValue("UpdateTenantResponse.updateTenantResultList["+ i +"].result"));
			updateTenantResult.setResultMsg(context.stringValue("UpdateTenantResponse.updateTenantResultList["+ i +"].resultMsg"));

			updateTenantResultList.add(updateTenantResult);
		}
		updateTenantResponse.setUpdateTenantResultList(updateTenantResultList);
	 
	 	return updateTenantResponse;
	}
}