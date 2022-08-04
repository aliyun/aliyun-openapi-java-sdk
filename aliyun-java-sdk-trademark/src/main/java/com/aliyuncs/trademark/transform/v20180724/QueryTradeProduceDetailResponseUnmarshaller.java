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

package com.aliyuncs.trademark.transform.v20180724;

import com.aliyuncs.trademark.model.v20180724.QueryTradeProduceDetailResponse;
import com.aliyuncs.trademark.model.v20180724.QueryTradeProduceDetailResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTradeProduceDetailResponseUnmarshaller {

	public static QueryTradeProduceDetailResponse unmarshall(QueryTradeProduceDetailResponse queryTradeProduceDetailResponse, UnmarshallerContext _ctx) {
		
		queryTradeProduceDetailResponse.setRequestId(_ctx.stringValue("QueryTradeProduceDetailResponse.RequestId"));

		Data data = new Data();
		data.setUpdateTime(_ctx.longValue("QueryTradeProduceDetailResponse.Data.UpdateTime"));
		data.setThirdCode(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.ThirdCode"));
		data.setShare(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.Share"));
		data.setPreAmount(_ctx.floatValue("QueryTradeProduceDetailResponse.Data.PreAmount"));
		data.setCreateTime(_ctx.longValue("QueryTradeProduceDetailResponse.Data.CreateTime"));
		data.setUserId(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.UserId"));
		data.setRefundAmount(_ctx.floatValue("QueryTradeProduceDetailResponse.Data.RefundAmount"));
		data.setIcon(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.Icon"));
		data.setBizId(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.BizId"));
		data.setBuyerStatus(_ctx.integerValue("QueryTradeProduceDetailResponse.Data.BuyerStatus"));
		data.setSource(_ctx.integerValue("QueryTradeProduceDetailResponse.Data.Source"));
		data.setConfiscateAmount(_ctx.floatValue("QueryTradeProduceDetailResponse.Data.ConfiscateAmount"));
		data.setOperateNote(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.OperateNote"));
		data.setPreOrderId(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.PreOrderId"));
		data.setExtend(_ctx.mapValue("QueryTradeProduceDetailResponse.Data.Extend"));
		data.setTmName(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.TmName"));
		data.setExclusiveDateLimit(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.ExclusiveDateLimit"));
		data.setAllowCancel(_ctx.booleanValue("QueryTradeProduceDetailResponse.Data.AllowCancel"));
		data.setRegisterNumber(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.RegisterNumber"));
		data.setFinalAmount(_ctx.floatValue("QueryTradeProduceDetailResponse.Data.FinalAmount"));
		data.setClassification(_ctx.stringValue("QueryTradeProduceDetailResponse.Data.Classification"));
		data.setPaidAmount(_ctx.floatValue("QueryTradeProduceDetailResponse.Data.PaidAmount"));
		queryTradeProduceDetailResponse.setData(data);
	 
	 	return queryTradeProduceDetailResponse;
	}
}