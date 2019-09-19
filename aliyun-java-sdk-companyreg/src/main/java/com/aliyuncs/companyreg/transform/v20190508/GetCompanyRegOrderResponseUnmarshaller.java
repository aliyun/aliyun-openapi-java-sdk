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
		getCompanyRegOrderResponse.setBizId(_ctx.stringValue("GetCompanyRegOrderResponse.BizId"));
		getCompanyRegOrderResponse.setCompanyName(_ctx.stringValue("GetCompanyRegOrderResponse.CompanyName"));
		getCompanyRegOrderResponse.setBizStatus(_ctx.stringValue("GetCompanyRegOrderResponse.BizStatus"));
		getCompanyRegOrderResponse.setBizInfo(_ctx.stringValue("GetCompanyRegOrderResponse.BizInfo"));
		getCompanyRegOrderResponse.setSupplementBizInfo(_ctx.stringValue("GetCompanyRegOrderResponse.SupplementBizInfo"));
		getCompanyRegOrderResponse.setAliyunOrderId(_ctx.stringValue("GetCompanyRegOrderResponse.AliyunOrderId"));
		getCompanyRegOrderResponse.setGmtModified(_ctx.longValue("GetCompanyRegOrderResponse.GmtModified"));
		getCompanyRegOrderResponse.setOrderAmount(_ctx.floatValue("GetCompanyRegOrderResponse.OrderAmount"));
		getCompanyRegOrderResponse.setYunMarketOrderAmount(_ctx.floatValue("GetCompanyRegOrderResponse.YunMarketOrderAmount"));
		getCompanyRegOrderResponse.setGmtPaid(_ctx.longValue("GetCompanyRegOrderResponse.GmtPaid"));
		getCompanyRegOrderResponse.setExtend(_ctx.stringValue("GetCompanyRegOrderResponse.Extend"));
		getCompanyRegOrderResponse.setBizStatusStage(_ctx.stringValue("GetCompanyRegOrderResponse.BizStatusStage"));
		getCompanyRegOrderResponse.setPlatformName(_ctx.stringValue("GetCompanyRegOrderResponse.PlatformName"));
		getCompanyRegOrderResponse.setInboundPhone(_ctx.stringValue("GetCompanyRegOrderResponse.InboundPhone"));
		getCompanyRegOrderResponse.setOutboundPhone(_ctx.stringValue("GetCompanyRegOrderResponse.OutboundPhone"));
		getCompanyRegOrderResponse.setBizSubCode(_ctx.stringValue("GetCompanyRegOrderResponse.BizSubCode"));

		List<BizOperation> operations = new ArrayList<BizOperation>();
		for (int i = 0; i < _ctx.lengthValue("GetCompanyRegOrderResponse.Operations.Length"); i++) {
			BizOperation bizOperation = new BizOperation();
			bizOperation.setGmtAction(_ctx.longValue("GetCompanyRegOrderResponse.Operations["+ i +"].GmtAction"));
			bizOperation.setActionType(_ctx.stringValue("GetCompanyRegOrderResponse.Operations["+ i +"].ActionType"));
			bizOperation.setActionInfo(_ctx.stringValue("GetCompanyRegOrderResponse.Operations["+ i +"].ActionInfo"));

			operations.add(bizOperation);
		}
		getCompanyRegOrderResponse.setOperations(operations);
	 
	 	return getCompanyRegOrderResponse;
	}
}