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

	public static QueryTradeProduceDetailResponse unmarshall(QueryTradeProduceDetailResponse queryTradeProduceDetailResponse, UnmarshallerContext context) {
		
		queryTradeProduceDetailResponse.setRequestId(context.stringValue("QueryTradeProduceDetailResponse.RequestId"));

		Data data = new Data();
		data.setBizId(context.stringValue("QueryTradeProduceDetailResponse.Data.BizId"));
		data.setPreOrderId(context.stringValue("QueryTradeProduceDetailResponse.Data.PreOrderId"));
		data.setPreAmount(context.floatValue("QueryTradeProduceDetailResponse.Data.PreAmount"));
		data.setFinalAmount(context.floatValue("QueryTradeProduceDetailResponse.Data.FinalAmount"));
		data.setRegisterNumber(context.stringValue("QueryTradeProduceDetailResponse.Data.RegisterNumber"));
		data.setClassification(context.stringValue("QueryTradeProduceDetailResponse.Data.Classification"));
		data.setIcon(context.stringValue("QueryTradeProduceDetailResponse.Data.Icon"));
		data.setOperateNote(context.stringValue("QueryTradeProduceDetailResponse.Data.OperateNote"));
		data.setBuyerStatus(context.integerValue("QueryTradeProduceDetailResponse.Data.BuyerStatus"));
		data.setUserId(context.stringValue("QueryTradeProduceDetailResponse.Data.UserId"));
		data.setCreateTime(context.longValue("QueryTradeProduceDetailResponse.Data.CreateTime"));
		data.setUpdateTime(context.longValue("QueryTradeProduceDetailResponse.Data.UpdateTime"));
		data.setExtend(context.mapValue("QueryTradeProduceDetailResponse.Data.Extend"));
		data.setThirdCode(context.stringValue("QueryTradeProduceDetailResponse.Data.ThirdCode"));
		data.setShare(context.stringValue("QueryTradeProduceDetailResponse.Data.Share"));
		data.setExclusiveDateLimit(context.stringValue("QueryTradeProduceDetailResponse.Data.ExclusiveDateLimit"));
		data.setAllowCancel(context.booleanValue("QueryTradeProduceDetailResponse.Data.AllowCancel"));
		data.setTmName(context.stringValue("QueryTradeProduceDetailResponse.Data.TmName"));
		data.setPaidAmount(context.floatValue("QueryTradeProduceDetailResponse.Data.PaidAmount"));
		data.setConfiscateAmount(context.floatValue("QueryTradeProduceDetailResponse.Data.ConfiscateAmount"));
		data.setRefundAmount(context.floatValue("QueryTradeProduceDetailResponse.Data.RefundAmount"));
		queryTradeProduceDetailResponse.setData(data);
	 
	 	return queryTradeProduceDetailResponse;
	}
}