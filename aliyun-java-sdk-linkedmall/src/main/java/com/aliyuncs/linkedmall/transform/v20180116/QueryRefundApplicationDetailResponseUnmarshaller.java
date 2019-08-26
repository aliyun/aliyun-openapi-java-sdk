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

import com.aliyuncs.linkedmall.model.v20180116.QueryRefundApplicationDetailResponse;
import com.aliyuncs.linkedmall.model.v20180116.QueryRefundApplicationDetailResponse.RefundApplicationDetail;
import com.aliyuncs.linkedmall.model.v20180116.QueryRefundApplicationDetailResponse.RefundApplicationDetail.ApplyReasonText;
import com.aliyuncs.linkedmall.model.v20180116.QueryRefundApplicationDetailResponse.RefundApplicationDetail.MaxRefundFeeData;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRefundApplicationDetailResponseUnmarshaller {

	public static QueryRefundApplicationDetailResponse unmarshall(QueryRefundApplicationDetailResponse queryRefundApplicationDetailResponse, UnmarshallerContext _ctx) {
		
		queryRefundApplicationDetailResponse.setRequestId(_ctx.stringValue("QueryRefundApplicationDetailResponse.RequestId"));
		queryRefundApplicationDetailResponse.setCode(_ctx.stringValue("QueryRefundApplicationDetailResponse.Code"));
		queryRefundApplicationDetailResponse.setMessage(_ctx.stringValue("QueryRefundApplicationDetailResponse.Message"));

		RefundApplicationDetail refundApplicationDetail = new RefundApplicationDetail();
		refundApplicationDetail.setBizClaimType(_ctx.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.BizClaimType"));
		refundApplicationDetail.setOrderLogisticsStatus(_ctx.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.OrderLogisticsStatus"));
		refundApplicationDetail.setDisputeStatus(_ctx.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeStatus"));
		refundApplicationDetail.setReturnGoodLogisticsStatus(_ctx.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.ReturnGoodLogisticsStatus"));
		refundApplicationDetail.setLmOrderId(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.LmOrderId"));
		refundApplicationDetail.setSubLmOrderId(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.SubLmOrderId"));
		refundApplicationDetail.setDisputeType(_ctx.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeType"));
		refundApplicationDetail.setRefundFee(_ctx.longValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RefundFee"));
		refundApplicationDetail.setRealRefundFee(_ctx.longValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RealRefundFee"));
		refundApplicationDetail.setReturnGoodCount(_ctx.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.ReturnGoodCount"));
		refundApplicationDetail.setDisputeDesc(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeDesc"));
		refundApplicationDetail.setSellerAgreeMsg(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.SellerAgreeMsg"));
		refundApplicationDetail.setSellerRefuseAgreementMessage(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.SellerRefuseAgreementMessage"));
		refundApplicationDetail.setApplyDisputeDesc(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.ApplyDisputeDesc"));
		refundApplicationDetail.setDisputeCreateTime(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeCreateTime"));
		refundApplicationDetail.setDisputeEndTime(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeEndTime"));
		refundApplicationDetail.setDisputeId(_ctx.longValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeId"));
		refundApplicationDetail.setRefunderAddress(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RefunderAddress"));
		refundApplicationDetail.setRefunderName(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RefunderName"));
		refundApplicationDetail.setRefunderTel(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RefunderTel"));
		refundApplicationDetail.setRefunderZipCode(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RefunderZipCode"));

		MaxRefundFeeData maxRefundFeeData = new MaxRefundFeeData();
		maxRefundFeeData.setMaxRefundFee(_ctx.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.MaxRefundFeeData.MaxRefundFee"));
		maxRefundFeeData.setMinRefundFee(_ctx.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.MaxRefundFeeData.MinRefundFee"));
		refundApplicationDetail.setMaxRefundFeeData(maxRefundFeeData);

		ApplyReasonText applyReasonText = new ApplyReasonText();
		applyReasonText.setReasonTextId(_ctx.longValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.ApplyReasonText.ReasonTextId"));
		applyReasonText.setReasonTips(_ctx.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.ApplyReasonText.ReasonTips"));
		refundApplicationDetail.setApplyReasonText(applyReasonText);
		queryRefundApplicationDetailResponse.setRefundApplicationDetail(refundApplicationDetail);
	 
	 	return queryRefundApplicationDetailResponse;
	}
}