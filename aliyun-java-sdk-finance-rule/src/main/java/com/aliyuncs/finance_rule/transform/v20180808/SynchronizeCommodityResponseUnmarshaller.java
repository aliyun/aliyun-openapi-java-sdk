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

import com.aliyuncs.finance_rule.model.v20180808.SynchronizeCommodityResponse;
import com.aliyuncs.finance_rule.model.v20180808.SynchronizeCommodityResponse.ExtendInfo;
import com.aliyuncs.finance_rule.model.v20180808.SynchronizeCommodityResponse.ResultObj;
import com.aliyuncs.transform.UnmarshallerContext;


public class SynchronizeCommodityResponseUnmarshaller {

	public static SynchronizeCommodityResponse unmarshall(SynchronizeCommodityResponse synchronizeCommodityResponse, UnmarshallerContext _ctx) {
		
		synchronizeCommodityResponse.setResultMessage(_ctx.stringValue("SynchronizeCommodityResponse.ResultMessage"));
		synchronizeCommodityResponse.setResultCode(_ctx.stringValue("SynchronizeCommodityResponse.ResultCode"));
		synchronizeCommodityResponse.setRemark(_ctx.stringValue("SynchronizeCommodityResponse.Remark"));
		synchronizeCommodityResponse.setSuccess(_ctx.booleanValue("SynchronizeCommodityResponse.Success"));

		ResultObj resultObj = new ResultObj();
		resultObj.setStatus(_ctx.stringValue("SynchronizeCommodityResponse.ResultObj.Status"));
		resultObj.setUrl(_ctx.stringValue("SynchronizeCommodityResponse.ResultObj.Url"));
		resultObj.setHasFinanceRule(_ctx.booleanValue("SynchronizeCommodityResponse.ResultObj.HasFinanceRule"));
		synchronizeCommodityResponse.setResultObj(resultObj);

		ExtendInfo extendInfo = new ExtendInfo();
		extendInfo.setPlaceHolder1(_ctx.stringValue("SynchronizeCommodityResponse.ExtendInfo.PlaceHolder1"));
		synchronizeCommodityResponse.setExtendInfo(extendInfo);
	 
	 	return synchronizeCommodityResponse;
	}
}