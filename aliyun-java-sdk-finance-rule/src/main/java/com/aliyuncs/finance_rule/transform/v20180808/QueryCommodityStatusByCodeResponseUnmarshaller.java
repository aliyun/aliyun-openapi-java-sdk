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

import com.aliyuncs.finance_rule.model.v20180808.QueryCommodityStatusByCodeResponse;
import com.aliyuncs.finance_rule.model.v20180808.QueryCommodityStatusByCodeResponse.ExtendInfo;
import com.aliyuncs.finance_rule.model.v20180808.QueryCommodityStatusByCodeResponse.ResultObj;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCommodityStatusByCodeResponseUnmarshaller {

	public static QueryCommodityStatusByCodeResponse unmarshall(QueryCommodityStatusByCodeResponse queryCommodityStatusByCodeResponse, UnmarshallerContext _ctx) {
		
		queryCommodityStatusByCodeResponse.setResultMessage(_ctx.stringValue("QueryCommodityStatusByCodeResponse.ResultMessage"));
		queryCommodityStatusByCodeResponse.setResultCode(_ctx.stringValue("QueryCommodityStatusByCodeResponse.ResultCode"));
		queryCommodityStatusByCodeResponse.setRemark(_ctx.stringValue("QueryCommodityStatusByCodeResponse.Remark"));
		queryCommodityStatusByCodeResponse.setSuccess(_ctx.booleanValue("QueryCommodityStatusByCodeResponse.Success"));

		ResultObj resultObj = new ResultObj();
		resultObj.setStatus(_ctx.stringValue("QueryCommodityStatusByCodeResponse.ResultObj.Status"));
		resultObj.setUrl(_ctx.stringValue("QueryCommodityStatusByCodeResponse.ResultObj.Url"));
		resultObj.setHasFinanceRule(_ctx.booleanValue("QueryCommodityStatusByCodeResponse.ResultObj.HasFinanceRule"));
		queryCommodityStatusByCodeResponse.setResultObj(resultObj);

		ExtendInfo extendInfo = new ExtendInfo();
		extendInfo.setPlaceHolder1(_ctx.stringValue("QueryCommodityStatusByCodeResponse.ExtendInfo.PlaceHolder1"));
		queryCommodityStatusByCodeResponse.setExtendInfo(extendInfo);
	 
	 	return queryCommodityStatusByCodeResponse;
	}
}