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

package com.aliyuncs.linkedmall.transform.v20180116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkedmall.model.v20180116.InitApplyRefundResponse;
import com.aliyuncs.linkedmall.model.v20180116.InitApplyRefundResponse.InitApplyRefundData;
import com.aliyuncs.linkedmall.model.v20180116.InitApplyRefundResponse.InitApplyRefundData.MaxRefundFeeData;
import com.aliyuncs.linkedmall.model.v20180116.InitApplyRefundResponse.InitApplyRefundData.RefundReasonListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class InitApplyRefundResponseUnmarshaller {

	public static InitApplyRefundResponse unmarshall(InitApplyRefundResponse initApplyRefundResponse, UnmarshallerContext _ctx) {
		
		initApplyRefundResponse.setRequestId(_ctx.stringValue("InitApplyRefundResponse.RequestId"));
		initApplyRefundResponse.setCode(_ctx.stringValue("InitApplyRefundResponse.Code"));
		initApplyRefundResponse.setMessage(_ctx.stringValue("InitApplyRefundResponse.Message"));
		initApplyRefundResponse.setSubLmOrderId(_ctx.stringValue("InitApplyRefundResponse.SubLmOrderId"));

		InitApplyRefundData initApplyRefundData = new InitApplyRefundData();
		initApplyRefundData.setBizClaimType(_ctx.integerValue("InitApplyRefundResponse.InitApplyRefundData.BizClaimType"));
		initApplyRefundData.setMainOrderRefund(_ctx.booleanValue("InitApplyRefundResponse.InitApplyRefundData.MainOrderRefund"));

		MaxRefundFeeData maxRefundFeeData = new MaxRefundFeeData();
		maxRefundFeeData.setMaxRefundFee(_ctx.integerValue("InitApplyRefundResponse.InitApplyRefundData.MaxRefundFeeData.MaxRefundFee"));
		maxRefundFeeData.setMinRefundFee(_ctx.integerValue("InitApplyRefundResponse.InitApplyRefundData.MaxRefundFeeData.MinRefundFee"));
		initApplyRefundData.setMaxRefundFeeData(maxRefundFeeData);

		List<RefundReasonListItem> refundReasonList = new ArrayList<RefundReasonListItem>();
		for (int i = 0; i < _ctx.lengthValue("InitApplyRefundResponse.InitApplyRefundData.RefundReasonList.Length"); i++) {
			RefundReasonListItem refundReasonListItem = new RefundReasonListItem();
			refundReasonListItem.setReasonTextId(_ctx.longValue("InitApplyRefundResponse.InitApplyRefundData.RefundReasonList["+ i +"].ReasonTextId"));
			refundReasonListItem.setReasonTips(_ctx.stringValue("InitApplyRefundResponse.InitApplyRefundData.RefundReasonList["+ i +"].ReasonTips"));
			refundReasonListItem.setProofRequired(_ctx.booleanValue("InitApplyRefundResponse.InitApplyRefundData.RefundReasonList["+ i +"].ProofRequired"));
			refundReasonListItem.setRefundDescRequired(_ctx.booleanValue("InitApplyRefundResponse.InitApplyRefundData.RefundReasonList["+ i +"].RefundDescRequired"));

			refundReasonList.add(refundReasonListItem);
		}
		initApplyRefundData.setRefundReasonList(refundReasonList);
		initApplyRefundResponse.setInitApplyRefundData(initApplyRefundData);
	 
	 	return initApplyRefundResponse;
	}
}