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

package com.aliyuncs.premiumpics.transform.v20200505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20200505.ListUserProduceOperateLogsResponse;
import com.aliyuncs.premiumpics.model.v20200505.ListUserProduceOperateLogsResponse.OpateLogs;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserProduceOperateLogsResponseUnmarshaller {

	public static ListUserProduceOperateLogsResponse unmarshall(ListUserProduceOperateLogsResponse listUserProduceOperateLogsResponse, UnmarshallerContext _ctx) {
		
		listUserProduceOperateLogsResponse.setRequestId(_ctx.stringValue("ListUserProduceOperateLogsResponse.RequestId"));
		listUserProduceOperateLogsResponse.setPageNum(_ctx.integerValue("ListUserProduceOperateLogsResponse.PageNum"));
		listUserProduceOperateLogsResponse.setPageSize(_ctx.integerValue("ListUserProduceOperateLogsResponse.PageSize"));
		listUserProduceOperateLogsResponse.setSuccess(_ctx.booleanValue("ListUserProduceOperateLogsResponse.Success"));
		listUserProduceOperateLogsResponse.setTotalItemNum(_ctx.integerValue("ListUserProduceOperateLogsResponse.TotalItemNum"));
		listUserProduceOperateLogsResponse.setTotalPageNum(_ctx.integerValue("ListUserProduceOperateLogsResponse.TotalPageNum"));

		List<OpateLogs> data = new ArrayList<OpateLogs>();
		for (int i = 0; i < _ctx.lengthValue("ListUserProduceOperateLogsResponse.Data.Length"); i++) {
			OpateLogs opateLogs = new OpateLogs();
			opateLogs.setBizId(_ctx.stringValue("ListUserProduceOperateLogsResponse.Data["+ i +"].BizId"));
			opateLogs.setBizType(_ctx.stringValue("ListUserProduceOperateLogsResponse.Data["+ i +"].BizType"));
			opateLogs.setOperateName(_ctx.stringValue("ListUserProduceOperateLogsResponse.Data["+ i +"].OperateName"));
			opateLogs.setOperateTime(_ctx.longValue("ListUserProduceOperateLogsResponse.Data["+ i +"].OperateTime"));
			opateLogs.setOperateUserType(_ctx.stringValue("ListUserProduceOperateLogsResponse.Data["+ i +"].OperateUserType"));

			data.add(opateLogs);
		}
		listUserProduceOperateLogsResponse.setData(data);
	 
	 	return listUserProduceOperateLogsResponse;
	}
}