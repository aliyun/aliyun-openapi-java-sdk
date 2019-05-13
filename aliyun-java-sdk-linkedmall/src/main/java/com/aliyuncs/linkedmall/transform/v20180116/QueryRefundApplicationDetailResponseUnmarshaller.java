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

	public static QueryRefundApplicationDetailResponse unmarshall(QueryRefundApplicationDetailResponse queryRefundApplicationDetailResponse, UnmarshallerContext context) {
		
		queryRefundApplicationDetailResponse.setRequestId(context.stringValue("QueryRefundApplicationDetailResponse.RequestId"));
		queryRefundApplicationDetailResponse.setCode(context.stringValue("QueryRefundApplicationDetailResponse.Code"));
		queryRefundApplicationDetailResponse.setMessage(context.stringValue("QueryRefundApplicationDetailResponse.Message"));

		RefundApplicationDetail refundApplicationDetail = new RefundApplicationDetail();
		refundApplicationDetail.setBizClaimType(context.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.BizClaimType"));
		refundApplicationDetail.setOrderLogisticsStatus(context.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.OrderLogisticsStatus"));
		refundApplicationDetail.setDisputeStatus(context.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeStatus"));
		refundApplicationDetail.setReturnGoodLogisticsStatus(context.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.ReturnGoodLogisticsStatus"));
		refundApplicationDetail.setLmOrderId(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.LmOrderId"));
		refundApplicationDetail.setSubLmOrderId(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.SubLmOrderId"));
		refundApplicationDetail.setDisputeType(context.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeType"));
		refundApplicationDetail.setRefundFee(context.longValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RefundFee"));
		refundApplicationDetail.setRealRefundFee(context.longValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RealRefundFee"));
		refundApplicationDetail.setReturnGoodCount(context.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.ReturnGoodCount"));
		refundApplicationDetail.setDisputeDesc(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeDesc"));
		refundApplicationDetail.setSellerAgreeMsg(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.SellerAgreeMsg"));
		refundApplicationDetail.setSellerRefuseAgreementMessage(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.SellerRefuseAgreementMessage"));
		refundApplicationDetail.setApplyDisputeDesc(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.ApplyDisputeDesc"));
		refundApplicationDetail.setDisputeCreateTime(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeCreateTime"));
		refundApplicationDetail.setDisputeEndTime(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeEndTime"));
		refundApplicationDetail.setDisputeId(context.longValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.DisputeId"));
		refundApplicationDetail.setRefunderAddress(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RefunderAddress"));
		refundApplicationDetail.setRefunderName(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RefunderName"));
		refundApplicationDetail.setRefunderTel(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RefunderTel"));
		refundApplicationDetail.setRefunderZipCode(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.RefunderZipCode"));

		MaxRefundFeeData maxRefundFeeData = new MaxRefundFeeData();
		maxRefundFeeData.setMaxRefundFee(context.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.MaxRefundFeeData.MaxRefundFee"));
		maxRefundFeeData.setMinRefundFee(context.integerValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.MaxRefundFeeData.MinRefundFee"));
		refundApplicationDetail.setMaxRefundFeeData(maxRefundFeeData);

		ApplyReasonText applyReasonText = new ApplyReasonText();
		applyReasonText.setReasonTextId(context.longValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.ApplyReasonText.ReasonTextId"));
		applyReasonText.setReasonTips(context.stringValue("QueryRefundApplicationDetailResponse.RefundApplicationDetail.ApplyReasonText.ReasonTips"));
		refundApplicationDetail.setApplyReasonText(applyReasonText);
		queryRefundApplicationDetailResponse.setRefundApplicationDetail(refundApplicationDetail);
	 
	 	return queryRefundApplicationDetailResponse;
	}
}