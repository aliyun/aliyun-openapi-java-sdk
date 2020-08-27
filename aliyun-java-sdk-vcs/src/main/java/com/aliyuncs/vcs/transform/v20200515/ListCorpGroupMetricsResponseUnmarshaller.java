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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListCorpGroupMetricsResponse;
import com.aliyuncs.vcs.model.v20200515.ListCorpGroupMetricsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCorpGroupMetricsResponseUnmarshaller {

	public static ListCorpGroupMetricsResponse unmarshall(ListCorpGroupMetricsResponse listCorpGroupMetricsResponse, UnmarshallerContext _ctx) {
		
		listCorpGroupMetricsResponse.setRequestId(_ctx.stringValue("ListCorpGroupMetricsResponse.RequestId"));
		listCorpGroupMetricsResponse.setCode(_ctx.stringValue("ListCorpGroupMetricsResponse.Code"));
		listCorpGroupMetricsResponse.setMessage(_ctx.stringValue("ListCorpGroupMetricsResponse.Message"));
		listCorpGroupMetricsResponse.setPageNumber(_ctx.integerValue("ListCorpGroupMetricsResponse.PageNumber"));
		listCorpGroupMetricsResponse.setPageSize(_ctx.integerValue("ListCorpGroupMetricsResponse.PageSize"));
		listCorpGroupMetricsResponse.setTotalCount(_ctx.integerValue("ListCorpGroupMetricsResponse.TotalCount"));
		listCorpGroupMetricsResponse.setSuccess(_ctx.stringValue("ListCorpGroupMetricsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCorpGroupMetricsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDateId(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].DateId"));
			dataItem.setTagMetrics(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].TagMetrics"));
			dataItem.setTagCode(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].TagCode"));
			dataItem.setTagValue(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].TagValue"));
			dataItem.setCorpGroupId(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].CorpGroupId"));
			dataItem.setCorpId(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].CorpId"));
			dataItem.setDeviceGroupId(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].DeviceGroupId"));
			dataItem.setDeviceId(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].DeviceId"));
			dataItem.setUserGroupId(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].UserGroupId"));
			dataItem.setPersonID(_ctx.stringValue("ListCorpGroupMetricsResponse.Data["+ i +"].PersonID"));

			data.add(dataItem);
		}
		listCorpGroupMetricsResponse.setData(data);
	 
	 	return listCorpGroupMetricsResponse;
	}
}