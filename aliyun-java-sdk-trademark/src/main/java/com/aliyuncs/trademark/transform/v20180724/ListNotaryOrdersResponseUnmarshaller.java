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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.ListNotaryOrdersResponse;
import com.aliyuncs.trademark.model.v20180724.ListNotaryOrdersResponse.NotaryOrder;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListNotaryOrdersResponseUnmarshaller {

	public static ListNotaryOrdersResponse unmarshall(ListNotaryOrdersResponse listNotaryOrdersResponse, UnmarshallerContext context) {
		
		listNotaryOrdersResponse.setRequestId(context.stringValue("ListNotaryOrdersResponse.RequestId"));
		listNotaryOrdersResponse.setTotalItemNum(context.integerValue("ListNotaryOrdersResponse.TotalItemNum"));
		listNotaryOrdersResponse.setCurrentPageNum(context.integerValue("ListNotaryOrdersResponse.CurrentPageNum"));
		listNotaryOrdersResponse.setPageSize(context.integerValue("ListNotaryOrdersResponse.PageSize"));
		listNotaryOrdersResponse.setTotalPageNum(context.integerValue("ListNotaryOrdersResponse.TotalPageNum"));
		listNotaryOrdersResponse.setPrePage(context.booleanValue("ListNotaryOrdersResponse.PrePage"));
		listNotaryOrdersResponse.setNextPage(context.booleanValue("ListNotaryOrdersResponse.NextPage"));
		listNotaryOrdersResponse.setSuccess(context.booleanValue("ListNotaryOrdersResponse.Success"));
		listNotaryOrdersResponse.setErrorMsg(context.stringValue("ListNotaryOrdersResponse.ErrorMsg"));
		listNotaryOrdersResponse.setErrorCode(context.stringValue("ListNotaryOrdersResponse.ErrorCode"));

		List<NotaryOrder> data = new ArrayList<NotaryOrder>();
		for (int i = 0; i < context.lengthValue("ListNotaryOrdersResponse.Data.Length"); i++) {
			NotaryOrder notaryOrder = new NotaryOrder();
			notaryOrder.setNotaryOrderId(context.longValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryOrderId"));
			notaryOrder.setAliyunOrderId(context.stringValue("ListNotaryOrdersResponse.Data["+ i +"].AliyunOrderId"));
			notaryOrder.setTmRegisterNo(context.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmRegisterNo"));
			notaryOrder.setTmName(context.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmName"));
			notaryOrder.setTmImage(context.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmImage"));
			notaryOrder.setTmClassification(context.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmClassification"));
			notaryOrder.setOrderPrice(context.floatValue("ListNotaryOrdersResponse.Data["+ i +"].OrderPrice"));
			notaryOrder.setNotaryStatus(context.integerValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryStatus"));
			notaryOrder.setOrderDate(context.longValue("ListNotaryOrdersResponse.Data["+ i +"].OrderDate"));
			notaryOrder.setGmtModified(context.longValue("ListNotaryOrdersResponse.Data["+ i +"].GmtModified"));
			notaryOrder.setNotaryCertificate(context.stringValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryCertificate"));
			notaryOrder.setBizId(context.stringValue("ListNotaryOrdersResponse.Data["+ i +"].BizId"));
			notaryOrder.setNotaryType(context.integerValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryType"));
			notaryOrder.setNotaryPlatformName(context.stringValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryPlatformName"));
			notaryOrder.setApplyPostStatus(context.stringValue("ListNotaryOrdersResponse.Data["+ i +"].ApplyPostStatus"));

			data.add(notaryOrder);
		}
		listNotaryOrdersResponse.setData(data);
	 
	 	return listNotaryOrdersResponse;
	}
}