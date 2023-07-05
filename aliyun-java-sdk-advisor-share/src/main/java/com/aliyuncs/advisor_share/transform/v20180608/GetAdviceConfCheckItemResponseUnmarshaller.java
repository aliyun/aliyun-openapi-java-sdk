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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.GetAdviceConfCheckItemResponse;
import com.aliyuncs.advisor_share.model.v20180608.GetAdviceConfCheckItemResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAdviceConfCheckItemResponseUnmarshaller {

	public static GetAdviceConfCheckItemResponse unmarshall(GetAdviceConfCheckItemResponse getAdviceConfCheckItemResponse, UnmarshallerContext _ctx) {
		
		getAdviceConfCheckItemResponse.setRequestId(_ctx.stringValue("GetAdviceConfCheckItemResponse.RequestId"));
		getAdviceConfCheckItemResponse.setMessage(_ctx.stringValue("GetAdviceConfCheckItemResponse.Message"));
		getAdviceConfCheckItemResponse.setSuccess(_ctx.stringValue("GetAdviceConfCheckItemResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAdviceConfCheckItemResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setProduct(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].Product"));
			dataItem.setOperateColumn(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].OperateColumn"));
			dataItem.setGmtModified(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].GmtModified"));
			dataItem.setViewCondition(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].ViewCondition"));
			dataItem.setValid(_ctx.booleanValue("GetAdviceConfCheckItemResponse.Data["+ i +"].Valid"));
			dataItem.setViewColumn(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].ViewColumn"));
			dataItem.setGmtCreated(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].GmtCreated"));
			dataItem.setTtl(_ctx.integerValue("GetAdviceConfCheckItemResponse.Data["+ i +"].Ttl"));
			dataItem.setDescription(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].Description"));
			dataItem.setTips(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].Tips"));
			dataItem.setConfStatus(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].ConfStatus"));
			dataItem.setCode(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].Code"));
			dataItem.setCategory(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].Category"));
			dataItem.setName(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].Name"));
			dataItem.setId(_ctx.longValue("GetAdviceConfCheckItemResponse.Data["+ i +"].Id"));
			dataItem.setType(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].Type"));
			dataItem.setIsNew(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].IsNew"));
			dataItem.setThresholdParam(_ctx.stringValue("GetAdviceConfCheckItemResponse.Data["+ i +"].ThresholdParam"));

			data.add(dataItem);
		}
		getAdviceConfCheckItemResponse.setData(data);
	 
	 	return getAdviceConfCheckItemResponse;
	}
}