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

package com.aliyuncs.aliyunauth.transform.v20181222;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aliyunauth.model.v20181222.QueryInEffectQuthOrderResponse;
import com.aliyuncs.aliyunauth.model.v20181222.QueryInEffectQuthOrderResponse.Data;
import com.aliyuncs.aliyunauth.model.v20181222.QueryInEffectQuthOrderResponse.Data.ListItem;
import com.aliyuncs.aliyunauth.model.v20181222.QueryInEffectQuthOrderResponse.Data.ListItem.AuthItemRecordGroupItemDTOSItem;
import com.aliyuncs.aliyunauth.model.v20181222.QueryInEffectQuthOrderResponse.Data.ListItem.OperateTimesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryInEffectQuthOrderResponseUnmarshaller {

	public static QueryInEffectQuthOrderResponse unmarshall(QueryInEffectQuthOrderResponse queryInEffectQuthOrderResponse, UnmarshallerContext _ctx) {
		
		queryInEffectQuthOrderResponse.setRequestId(_ctx.stringValue("QueryInEffectQuthOrderResponse.RequestId"));
		queryInEffectQuthOrderResponse.setCode(_ctx.integerValue("QueryInEffectQuthOrderResponse.Code"));
		queryInEffectQuthOrderResponse.setSuccess(_ctx.booleanValue("QueryInEffectQuthOrderResponse.Success"));
		queryInEffectQuthOrderResponse.setMessage(_ctx.stringValue("QueryInEffectQuthOrderResponse.Message"));

		Data data = new Data();
		data.setCount(_ctx.integerValue("QueryInEffectQuthOrderResponse.Data.Count"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryInEffectQuthOrderResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setOrderVid(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].OrderVid"));
			listItem.setLastModifyTime(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].LastModifyTime"));
			listItem.setCreatedTime(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].CreatedTime"));
			listItem.setStatus(_ctx.integerValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].Status"));

			List<OperateTimesItem> operateTimes = new ArrayList<OperateTimesItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].OperateTimes.Length"); j++) {
				OperateTimesItem operateTimesItem = new OperateTimesItem();
				operateTimesItem.setStart(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].OperateTimes["+ j +"].Start"));
				operateTimesItem.setEnd(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].OperateTimes["+ j +"].End"));

				operateTimes.add(operateTimesItem);
			}
			listItem.setOperateTimes(operateTimes);

			List<AuthItemRecordGroupItemDTOSItem> authItemRecordGroupItemDTOS = new ArrayList<AuthItemRecordGroupItemDTOSItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].AuthItemRecordGroupItemDTOS.Length"); j++) {
				AuthItemRecordGroupItemDTOSItem authItemRecordGroupItemDTOSItem = new AuthItemRecordGroupItemDTOSItem();
				authItemRecordGroupItemDTOSItem.setVid(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].AuthItemRecordGroupItemDTOS["+ j +"].Vid"));
				authItemRecordGroupItemDTOSItem.setMsg(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].AuthItemRecordGroupItemDTOS["+ j +"].Msg"));
				authItemRecordGroupItemDTOSItem.setGmtCreated(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].AuthItemRecordGroupItemDTOS["+ j +"].GmtCreated"));
				authItemRecordGroupItemDTOSItem.setRemarkDataJson(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].AuthItemRecordGroupItemDTOS["+ j +"].RemarkDataJson"));
				authItemRecordGroupItemDTOSItem.setName(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].AuthItemRecordGroupItemDTOS["+ j +"].Name"));
				authItemRecordGroupItemDTOSItem.setAuthitemID(_ctx.stringValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].AuthItemRecordGroupItemDTOS["+ j +"].AuthitemID"));
				authItemRecordGroupItemDTOSItem.setStatus(_ctx.integerValue("QueryInEffectQuthOrderResponse.Data.List["+ i +"].AuthItemRecordGroupItemDTOS["+ j +"].Status"));

				authItemRecordGroupItemDTOS.add(authItemRecordGroupItemDTOSItem);
			}
			listItem.setAuthItemRecordGroupItemDTOS(authItemRecordGroupItemDTOS);

			list.add(listItem);
		}
		data.setList(list);
		queryInEffectQuthOrderResponse.setData(data);
	 
	 	return queryInEffectQuthOrderResponse;
	}
}