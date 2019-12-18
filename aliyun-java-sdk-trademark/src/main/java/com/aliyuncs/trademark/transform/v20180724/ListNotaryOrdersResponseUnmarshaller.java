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

	public static ListNotaryOrdersResponse unmarshall(ListNotaryOrdersResponse listNotaryOrdersResponse, UnmarshallerContext _ctx) {
		
		listNotaryOrdersResponse.setRequestId(_ctx.stringValue("ListNotaryOrdersResponse.RequestId"));
		listNotaryOrdersResponse.setTotalItemNum(_ctx.integerValue("ListNotaryOrdersResponse.TotalItemNum"));
		listNotaryOrdersResponse.setCurrentPageNum(_ctx.integerValue("ListNotaryOrdersResponse.CurrentPageNum"));
		listNotaryOrdersResponse.setPageSize(_ctx.integerValue("ListNotaryOrdersResponse.PageSize"));
		listNotaryOrdersResponse.setTotalPageNum(_ctx.integerValue("ListNotaryOrdersResponse.TotalPageNum"));
		listNotaryOrdersResponse.setPrePage(_ctx.booleanValue("ListNotaryOrdersResponse.PrePage"));
		listNotaryOrdersResponse.setNextPage(_ctx.booleanValue("ListNotaryOrdersResponse.NextPage"));
		listNotaryOrdersResponse.setSuccess(_ctx.booleanValue("ListNotaryOrdersResponse.Success"));
		listNotaryOrdersResponse.setErrorMsg(_ctx.stringValue("ListNotaryOrdersResponse.ErrorMsg"));
		listNotaryOrdersResponse.setErrorCode(_ctx.stringValue("ListNotaryOrdersResponse.ErrorCode"));

		List<NotaryOrder> data = new ArrayList<NotaryOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListNotaryOrdersResponse.Data.Length"); i++) {
			NotaryOrder notaryOrder = new NotaryOrder();
			notaryOrder.setNotaryOrderId(_ctx.longValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryOrderId"));
			notaryOrder.setAliyunOrderId(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].AliyunOrderId"));
			notaryOrder.setTmRegisterNo(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmRegisterNo"));
			notaryOrder.setTmName(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmName"));
			notaryOrder.setTmImage(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmImage"));
			notaryOrder.setTmClassification(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmClassification"));
			notaryOrder.setOrderPrice(_ctx.floatValue("ListNotaryOrdersResponse.Data["+ i +"].OrderPrice"));
			notaryOrder.setNotaryStatus(_ctx.integerValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryStatus"));
			notaryOrder.setOrderDate(_ctx.longValue("ListNotaryOrdersResponse.Data["+ i +"].OrderDate"));
			notaryOrder.setGmtModified(_ctx.longValue("ListNotaryOrdersResponse.Data["+ i +"].GmtModified"));
			notaryOrder.setNotaryCertificate(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryCertificate"));
			notaryOrder.setBizId(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].BizId"));
			notaryOrder.setNotaryType(_ctx.integerValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryType"));
			notaryOrder.setNotaryPlatformName(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryPlatformName"));
			notaryOrder.setApplyPostStatus(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].ApplyPostStatus"));

			data.add(notaryOrder);
		}
		listNotaryOrdersResponse.setData(data);
	 
	 	return listNotaryOrdersResponse;
	}
}