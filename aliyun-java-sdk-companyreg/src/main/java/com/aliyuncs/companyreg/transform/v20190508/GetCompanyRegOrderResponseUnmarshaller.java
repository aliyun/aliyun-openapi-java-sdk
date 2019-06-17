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

package com.aliyuncs.companyreg.transform.v20190508;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20190508.GetCompanyRegOrderResponse;
import com.aliyuncs.companyreg.model.v20190508.GetCompanyRegOrderResponse.BizOperation;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCompanyRegOrderResponseUnmarshaller {

	public static GetCompanyRegOrderResponse unmarshall(GetCompanyRegOrderResponse getCompanyRegOrderResponse, UnmarshallerContext context) {
		
		getCompanyRegOrderResponse.setRequestId(context.stringValue("GetCompanyRegOrderResponse.RequestId"));
		getCompanyRegOrderResponse.setBizId(context.stringValue("GetCompanyRegOrderResponse.BizId"));
		getCompanyRegOrderResponse.setCompanyName(context.stringValue("GetCompanyRegOrderResponse.CompanyName"));
		getCompanyRegOrderResponse.setBizStatus(context.stringValue("GetCompanyRegOrderResponse.BizStatus"));
		getCompanyRegOrderResponse.setBizInfo(context.stringValue("GetCompanyRegOrderResponse.BizInfo"));
		getCompanyRegOrderResponse.setSupplementBizInfo(context.stringValue("GetCompanyRegOrderResponse.SupplementBizInfo"));
		getCompanyRegOrderResponse.setAliyunOrderId(context.stringValue("GetCompanyRegOrderResponse.AliyunOrderId"));
		getCompanyRegOrderResponse.setGmtModified(context.longValue("GetCompanyRegOrderResponse.GmtModified"));
		getCompanyRegOrderResponse.setOrderAmount(context.floatValue("GetCompanyRegOrderResponse.OrderAmount"));
		getCompanyRegOrderResponse.setYunMarketOrderAmount(context.floatValue("GetCompanyRegOrderResponse.YunMarketOrderAmount"));
		getCompanyRegOrderResponse.setGmtPaid(context.longValue("GetCompanyRegOrderResponse.GmtPaid"));
		getCompanyRegOrderResponse.setExtend(context.stringValue("GetCompanyRegOrderResponse.Extend"));
		getCompanyRegOrderResponse.setBizStatusStage(context.stringValue("GetCompanyRegOrderResponse.BizStatusStage"));

		List<BizOperation> operations = new ArrayList<BizOperation>();
		for (int i = 0; i < context.lengthValue("GetCompanyRegOrderResponse.Operations.Length"); i++) {
			BizOperation bizOperation = new BizOperation();
			bizOperation.setGmtAction(context.longValue("GetCompanyRegOrderResponse.Operations["+ i +"].GmtAction"));
			bizOperation.setActionType(context.stringValue("GetCompanyRegOrderResponse.Operations["+ i +"].ActionType"));
			bizOperation.setActionInfo(context.stringValue("GetCompanyRegOrderResponse.Operations["+ i +"].ActionInfo"));

			operations.add(bizOperation);
		}
		getCompanyRegOrderResponse.setOperations(operations);
	 
	 	return getCompanyRegOrderResponse;
	}
}