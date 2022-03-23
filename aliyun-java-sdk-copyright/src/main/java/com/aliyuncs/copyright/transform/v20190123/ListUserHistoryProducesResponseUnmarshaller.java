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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.ListUserHistoryProducesResponse;
import com.aliyuncs.copyright.model.v20190123.ListUserHistoryProducesResponse.Produces;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserHistoryProducesResponseUnmarshaller {

	public static ListUserHistoryProducesResponse unmarshall(ListUserHistoryProducesResponse listUserHistoryProducesResponse, UnmarshallerContext _ctx) {
		
		listUserHistoryProducesResponse.setRequestId(_ctx.stringValue("ListUserHistoryProducesResponse.RequestId"));
		listUserHistoryProducesResponse.setPageNum(_ctx.integerValue("ListUserHistoryProducesResponse.PageNum"));
		listUserHistoryProducesResponse.setSuccess(_ctx.booleanValue("ListUserHistoryProducesResponse.Success"));
		listUserHistoryProducesResponse.setTotalItemNum(_ctx.integerValue("ListUserHistoryProducesResponse.TotalItemNum"));
		listUserHistoryProducesResponse.setPageSize(_ctx.integerValue("ListUserHistoryProducesResponse.PageSize"));
		listUserHistoryProducesResponse.setTotalPageNum(_ctx.integerValue("ListUserHistoryProducesResponse.TotalPageNum"));

		List<Produces> data = new ArrayList<Produces>();
		for (int i = 0; i < _ctx.lengthValue("ListUserHistoryProducesResponse.Data.Length"); i++) {
			Produces produces = new Produces();
			produces.setSerialNumber(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].SerialNumber"));
			produces.setStatus(_ctx.integerValue("ListUserHistoryProducesResponse.Data["+ i +"].Status"));
			produces.setOrderPrice(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].OrderPrice"));
			produces.setSolutionBizId(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].SolutionBizId"));
			produces.setUserId(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].UserId"));
			produces.setBizId(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].BizId"));
			produces.setOrderTime(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].OrderTime"));
			produces.setPartnerCode(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].PartnerCode"));
			produces.setExtInfo(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].ExtInfo"));
			produces.setBizType(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].BizType"));
			produces.setIntentionBizId(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].IntentionBizId"));
			produces.setOldOrder(_ctx.booleanValue("ListUserHistoryProducesResponse.Data["+ i +"].OldOrder"));
			produces.setOrderId(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].OrderId"));
			produces.setModifyTime(_ctx.stringValue("ListUserHistoryProducesResponse.Data["+ i +"].ModifyTime"));

			data.add(produces);
		}
		listUserHistoryProducesResponse.setData(data);
	 
	 	return listUserHistoryProducesResponse;
	}
}