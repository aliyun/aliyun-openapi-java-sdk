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

package com.aliyuncs.config.transform.v20200907;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.config.model.v20200907.DeleteCompliancePacksResponse;
import com.aliyuncs.config.model.v20200907.DeleteCompliancePacksResponse.OperateCompliancePacksResult;
import com.aliyuncs.config.model.v20200907.DeleteCompliancePacksResponse.OperateCompliancePacksResult.OperateCompliancePacksItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteCompliancePacksResponseUnmarshaller {

	public static DeleteCompliancePacksResponse unmarshall(DeleteCompliancePacksResponse deleteCompliancePacksResponse, UnmarshallerContext _ctx) {
		
		deleteCompliancePacksResponse.setRequestId(_ctx.stringValue("DeleteCompliancePacksResponse.RequestId"));

		OperateCompliancePacksResult operateCompliancePacksResult = new OperateCompliancePacksResult();

		List<OperateCompliancePacksItem> operateCompliancePacks = new ArrayList<OperateCompliancePacksItem>();
		for (int i = 0; i < _ctx.lengthValue("DeleteCompliancePacksResponse.OperateCompliancePacksResult.OperateCompliancePacks.Length"); i++) {
			OperateCompliancePacksItem operateCompliancePacksItem = new OperateCompliancePacksItem();
			operateCompliancePacksItem.setCompliancePackId(_ctx.stringValue("DeleteCompliancePacksResponse.OperateCompliancePacksResult.OperateCompliancePacks["+ i +"].CompliancePackId"));
			operateCompliancePacksItem.setErrorCode(_ctx.stringValue("DeleteCompliancePacksResponse.OperateCompliancePacksResult.OperateCompliancePacks["+ i +"].ErrorCode"));
			operateCompliancePacksItem.setSuccess(_ctx.booleanValue("DeleteCompliancePacksResponse.OperateCompliancePacksResult.OperateCompliancePacks["+ i +"].Success"));

			operateCompliancePacks.add(operateCompliancePacksItem);
		}
		operateCompliancePacksResult.setOperateCompliancePacks(operateCompliancePacks);
		deleteCompliancePacksResponse.setOperateCompliancePacksResult(operateCompliancePacksResult);
	 
	 	return deleteCompliancePacksResponse;
	}
}