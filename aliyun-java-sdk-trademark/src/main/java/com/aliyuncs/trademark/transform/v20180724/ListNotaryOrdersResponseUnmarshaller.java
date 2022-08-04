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
		listNotaryOrdersResponse.setNextPage(_ctx.booleanValue("ListNotaryOrdersResponse.NextPage"));
		listNotaryOrdersResponse.setSuccess(_ctx.booleanValue("ListNotaryOrdersResponse.Success"));
		listNotaryOrdersResponse.setErrorCode(_ctx.stringValue("ListNotaryOrdersResponse.ErrorCode"));
		listNotaryOrdersResponse.setTotalItemNum(_ctx.integerValue("ListNotaryOrdersResponse.TotalItemNum"));
		listNotaryOrdersResponse.setPrePage(_ctx.booleanValue("ListNotaryOrdersResponse.PrePage"));
		listNotaryOrdersResponse.setCurrentPageNum(_ctx.integerValue("ListNotaryOrdersResponse.CurrentPageNum"));
		listNotaryOrdersResponse.setErrorMsg(_ctx.stringValue("ListNotaryOrdersResponse.ErrorMsg"));
		listNotaryOrdersResponse.setTotalPageNum(_ctx.integerValue("ListNotaryOrdersResponse.TotalPageNum"));
		listNotaryOrdersResponse.setPageSize(_ctx.integerValue("ListNotaryOrdersResponse.PageSize"));

		List<NotaryOrder> data = new ArrayList<NotaryOrder>();
		for (int i = 0; i < _ctx.lengthValue("ListNotaryOrdersResponse.Data.Length"); i++) {
			NotaryOrder notaryOrder = new NotaryOrder();
			notaryOrder.setOrderDate(_ctx.longValue("ListNotaryOrdersResponse.Data["+ i +"].OrderDate"));
			notaryOrder.setOrderPrice(_ctx.floatValue("ListNotaryOrdersResponse.Data["+ i +"].OrderPrice"));
			notaryOrder.setNotaryType(_ctx.integerValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryType"));
			notaryOrder.setTmClassification(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmClassification"));
			notaryOrder.setBizId(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].BizId"));
			notaryOrder.setGmtModified(_ctx.longValue("ListNotaryOrdersResponse.Data["+ i +"].GmtModified"));
			notaryOrder.setNotaryStatus(_ctx.integerValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryStatus"));
			notaryOrder.setNotaryOrderId(_ctx.longValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryOrderId"));
			notaryOrder.setTmName(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmName"));
			notaryOrder.setTmRegisterNo(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmRegisterNo"));
			notaryOrder.setTmImage(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].TmImage"));
			notaryOrder.setAliyunOrderId(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].AliyunOrderId"));
			notaryOrder.setApplyPostStatus(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].ApplyPostStatus"));
			notaryOrder.setNotaryCertificate(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryCertificate"));
			notaryOrder.setNotaryPlatformName(_ctx.stringValue("ListNotaryOrdersResponse.Data["+ i +"].NotaryPlatformName"));

			data.add(notaryOrder);
		}
		listNotaryOrdersResponse.setData(data);
	 
	 	return listNotaryOrdersResponse;
	}
}