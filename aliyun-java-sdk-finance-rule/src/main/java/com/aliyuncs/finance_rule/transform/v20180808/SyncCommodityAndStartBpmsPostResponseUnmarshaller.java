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

package com.aliyuncs.finance_rule.transform.v20180808;

import com.aliyuncs.finance_rule.model.v20180808.SyncCommodityAndStartBpmsPostResponse;
import com.aliyuncs.finance_rule.model.v20180808.SyncCommodityAndStartBpmsPostResponse.ExtendInfo;
import com.aliyuncs.finance_rule.model.v20180808.SyncCommodityAndStartBpmsPostResponse.ResultObj;
import com.aliyuncs.transform.UnmarshallerContext;


public class SyncCommodityAndStartBpmsPostResponseUnmarshaller {

	public static SyncCommodityAndStartBpmsPostResponse unmarshall(SyncCommodityAndStartBpmsPostResponse syncCommodityAndStartBpmsPostResponse, UnmarshallerContext _ctx) {
		
		syncCommodityAndStartBpmsPostResponse.setResultMessage(_ctx.stringValue("SyncCommodityAndStartBpmsPostResponse.ResultMessage"));
		syncCommodityAndStartBpmsPostResponse.setResultCode(_ctx.stringValue("SyncCommodityAndStartBpmsPostResponse.ResultCode"));
		syncCommodityAndStartBpmsPostResponse.setRemark(_ctx.stringValue("SyncCommodityAndStartBpmsPostResponse.Remark"));
		syncCommodityAndStartBpmsPostResponse.setSuccess(_ctx.booleanValue("SyncCommodityAndStartBpmsPostResponse.Success"));

		ResultObj resultObj = new ResultObj();
		resultObj.setStatus(_ctx.integerValue("SyncCommodityAndStartBpmsPostResponse.ResultObj.Status"));
		resultObj.setUrl(_ctx.stringValue("SyncCommodityAndStartBpmsPostResponse.ResultObj.Url"));
		resultObj.setHasFinanceRule(_ctx.booleanValue("SyncCommodityAndStartBpmsPostResponse.ResultObj.HasFinanceRule"));
		resultObj.setFinRuleUrl(_ctx.stringValue("SyncCommodityAndStartBpmsPostResponse.ResultObj.FinRuleUrl"));
		syncCommodityAndStartBpmsPostResponse.setResultObj(resultObj);

		ExtendInfo extendInfo = new ExtendInfo();
		extendInfo.setPlaceHolder1(_ctx.stringValue("SyncCommodityAndStartBpmsPostResponse.ExtendInfo.PlaceHolder1"));
		syncCommodityAndStartBpmsPostResponse.setExtendInfo(extendInfo);
	 
	 	return syncCommodityAndStartBpmsPostResponse;
	}
}