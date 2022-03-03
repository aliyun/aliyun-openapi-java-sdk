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

	public static GetCompanyRegOrderResponse unmarshall(GetCompanyRegOrderResponse getCompanyRegOrderResponse, UnmarshallerContext _ctx) {
		
		getCompanyRegOrderResponse.setRequestId(_ctx.stringValue("GetCompanyRegOrderResponse.RequestId"));
		getCompanyRegOrderResponse.setPlatformName(_ctx.stringValue("GetCompanyRegOrderResponse.PlatformName"));
		getCompanyRegOrderResponse.setGmtPaid(_ctx.longValue("GetCompanyRegOrderResponse.GmtPaid"));
		getCompanyRegOrderResponse.setBizStatusStage(_ctx.stringValue("GetCompanyRegOrderResponse.BizStatusStage"));
		getCompanyRegOrderResponse.setSupplementBizInfo(_ctx.stringValue("GetCompanyRegOrderResponse.SupplementBizInfo"));
		getCompanyRegOrderResponse.setOrderAmount(_ctx.floatValue("GetCompanyRegOrderResponse.OrderAmount"));
		getCompanyRegOrderResponse.setBizId(_ctx.stringValue("GetCompanyRegOrderResponse.BizId"));
		getCompanyRegOrderResponse.setBizSubCode(_ctx.stringValue("GetCompanyRegOrderResponse.BizSubCode"));
		getCompanyRegOrderResponse.setInboundPhone(_ctx.stringValue("GetCompanyRegOrderResponse.InboundPhone"));
		getCompanyRegOrderResponse.setYunMarketOrderAmount(_ctx.floatValue("GetCompanyRegOrderResponse.YunMarketOrderAmount"));
		getCompanyRegOrderResponse.setGmtModified(_ctx.longValue("GetCompanyRegOrderResponse.GmtModified"));
		getCompanyRegOrderResponse.setBizStatus(_ctx.stringValue("GetCompanyRegOrderResponse.BizStatus"));
		getCompanyRegOrderResponse.setExtend(_ctx.stringValue("GetCompanyRegOrderResponse.Extend"));
		getCompanyRegOrderResponse.setBizInfo(_ctx.stringValue("GetCompanyRegOrderResponse.BizInfo"));
		getCompanyRegOrderResponse.setAliyunOrderId(_ctx.stringValue("GetCompanyRegOrderResponse.AliyunOrderId"));
		getCompanyRegOrderResponse.setOutboundPhone(_ctx.stringValue("GetCompanyRegOrderResponse.OutboundPhone"));
		getCompanyRegOrderResponse.setCompanyName(_ctx.stringValue("GetCompanyRegOrderResponse.CompanyName"));

		List<BizOperation> operations = new ArrayList<BizOperation>();
		for (int i = 0; i < _ctx.lengthValue("GetCompanyRegOrderResponse.Operations.Length"); i++) {
			BizOperation bizOperation = new BizOperation();
			bizOperation.setActionType(_ctx.stringValue("GetCompanyRegOrderResponse.Operations["+ i +"].ActionType"));
			bizOperation.setGmtAction(_ctx.longValue("GetCompanyRegOrderResponse.Operations["+ i +"].GmtAction"));
			bizOperation.setActionInfo(_ctx.stringValue("GetCompanyRegOrderResponse.Operations["+ i +"].ActionInfo"));

			operations.add(bizOperation);
		}
		getCompanyRegOrderResponse.setOperations(operations);
	 
	 	return getCompanyRegOrderResponse;
	}
}