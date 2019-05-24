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

import com.aliyuncs.linkedmall.model.v20180116.CancelRefundResponse;
import com.aliyuncs.linkedmall.model.v20180116.CancelRefundResponse.RefundApplicationData;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelRefundResponseUnmarshaller {

	public static CancelRefundResponse unmarshall(CancelRefundResponse cancelRefundResponse, UnmarshallerContext context) {
		
		cancelRefundResponse.setRequestId(context.stringValue("CancelRefundResponse.RequestId"));
		cancelRefundResponse.setCode(context.stringValue("CancelRefundResponse.Code"));
		cancelRefundResponse.setMessage(context.stringValue("CancelRefundResponse.Message"));

		RefundApplicationData refundApplicationData = new RefundApplicationData();
		refundApplicationData.setSubLmOrderId(context.stringValue("CancelRefundResponse.RefundApplicationData.SubLmOrderId"));
		refundApplicationData.setDisputeStatus(context.integerValue("CancelRefundResponse.RefundApplicationData.DisputeStatus"));
		refundApplicationData.setDisputeType(context.integerValue("CancelRefundResponse.RefundApplicationData.DisputeType"));
		cancelRefundResponse.setRefundApplicationData(refundApplicationData);
	 
	 	return cancelRefundResponse;
	}
}