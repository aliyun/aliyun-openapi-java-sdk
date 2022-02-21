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

import com.aliyuncs.finance_rule.model.v20180808.SynchronizeCommodityPostResponse;
import com.aliyuncs.finance_rule.model.v20180808.SynchronizeCommodityPostResponse.ExtendInfo;
import com.aliyuncs.finance_rule.model.v20180808.SynchronizeCommodityPostResponse.ResultObj;
import com.aliyuncs.transform.UnmarshallerContext;


public class SynchronizeCommodityPostResponseUnmarshaller {

	public static SynchronizeCommodityPostResponse unmarshall(SynchronizeCommodityPostResponse synchronizeCommodityPostResponse, UnmarshallerContext _ctx) {
		
		synchronizeCommodityPostResponse.setResultMessage(_ctx.stringValue("SynchronizeCommodityPostResponse.ResultMessage"));
		synchronizeCommodityPostResponse.setResultCode(_ctx.stringValue("SynchronizeCommodityPostResponse.ResultCode"));
		synchronizeCommodityPostResponse.setRemark(_ctx.stringValue("SynchronizeCommodityPostResponse.Remark"));
		synchronizeCommodityPostResponse.setSuccess(_ctx.booleanValue("SynchronizeCommodityPostResponse.Success"));

		ResultObj resultObj = new ResultObj();
		resultObj.setStatus(_ctx.stringValue("SynchronizeCommodityPostResponse.ResultObj.Status"));
		resultObj.setUrl(_ctx.stringValue("SynchronizeCommodityPostResponse.ResultObj.Url"));
		resultObj.setHasFinanceRule(_ctx.booleanValue("SynchronizeCommodityPostResponse.ResultObj.HasFinanceRule"));
		synchronizeCommodityPostResponse.setResultObj(resultObj);

		ExtendInfo extendInfo = new ExtendInfo();
		extendInfo.setPlaceHolder1(_ctx.stringValue("SynchronizeCommodityPostResponse.ExtendInfo.PlaceHolder1"));
		synchronizeCommodityPostResponse.setExtendInfo(extendInfo);
	 
	 	return synchronizeCommodityPostResponse;
	}
}