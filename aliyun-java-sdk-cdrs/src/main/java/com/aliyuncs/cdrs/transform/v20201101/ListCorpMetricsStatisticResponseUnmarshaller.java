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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.ListCorpMetricsStatisticResponse;
import com.aliyuncs.cdrs.model.v20201101.ListCorpMetricsStatisticResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCorpMetricsStatisticResponseUnmarshaller {

	public static ListCorpMetricsStatisticResponse unmarshall(ListCorpMetricsStatisticResponse listCorpMetricsStatisticResponse, UnmarshallerContext _ctx) {
		
		listCorpMetricsStatisticResponse.setRequestId(_ctx.stringValue("ListCorpMetricsStatisticResponse.RequestId"));
		listCorpMetricsStatisticResponse.setTotalCount(_ctx.integerValue("ListCorpMetricsStatisticResponse.TotalCount"));
		listCorpMetricsStatisticResponse.setPageSize(_ctx.integerValue("ListCorpMetricsStatisticResponse.PageSize"));
		listCorpMetricsStatisticResponse.setMessage(_ctx.stringValue("ListCorpMetricsStatisticResponse.Message"));
		listCorpMetricsStatisticResponse.setPageNumber(_ctx.integerValue("ListCorpMetricsStatisticResponse.PageNumber"));
		listCorpMetricsStatisticResponse.setCode(_ctx.stringValue("ListCorpMetricsStatisticResponse.Code"));
		listCorpMetricsStatisticResponse.setSuccess(_ctx.stringValue("ListCorpMetricsStatisticResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCorpMetricsStatisticResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCorpId(_ctx.stringValue("ListCorpMetricsStatisticResponse.Data["+ i +"].CorpId"));
			dataItem.setPersonId(_ctx.stringValue("ListCorpMetricsStatisticResponse.Data["+ i +"].PersonId"));
			dataItem.setDeviceGroupId(_ctx.stringValue("ListCorpMetricsStatisticResponse.Data["+ i +"].DeviceGroupId"));
			dataItem.setDeviceId(_ctx.stringValue("ListCorpMetricsStatisticResponse.Data["+ i +"].DeviceId"));
			dataItem.setUserGroupId(_ctx.stringValue("ListCorpMetricsStatisticResponse.Data["+ i +"].UserGroupId"));
			dataItem.setTagMetrics(_ctx.stringValue("ListCorpMetricsStatisticResponse.Data["+ i +"].TagMetrics"));
			dataItem.setTagCode(_ctx.stringValue("ListCorpMetricsStatisticResponse.Data["+ i +"].TagCode"));
			dataItem.setTagValue(_ctx.stringValue("ListCorpMetricsStatisticResponse.Data["+ i +"].TagValue"));
			dataItem.setDateId(_ctx.stringValue("ListCorpMetricsStatisticResponse.Data["+ i +"].DateId"));

			data.add(dataItem);
		}
		listCorpMetricsStatisticResponse.setData(data);
	 
	 	return listCorpMetricsStatisticResponse;
	}
}