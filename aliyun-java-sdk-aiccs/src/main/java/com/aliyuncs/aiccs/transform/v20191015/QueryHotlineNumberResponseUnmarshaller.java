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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.QueryHotlineNumberResponse;
import com.aliyuncs.aiccs.model.v20191015.QueryHotlineNumberResponse.Data;
import com.aliyuncs.aiccs.model.v20191015.QueryHotlineNumberResponse.Data.HotlineNumberList;
import com.aliyuncs.aiccs.model.v20191015.QueryHotlineNumberResponse.Data.HotlineNumberList.CalloutRangeListItem;
import com.aliyuncs.aiccs.model.v20191015.QueryHotlineNumberResponse.Data.HotlineNumberList.CalloutRangeListItem.GroupDOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryHotlineNumberResponseUnmarshaller {

	public static QueryHotlineNumberResponse unmarshall(QueryHotlineNumberResponse queryHotlineNumberResponse, UnmarshallerContext _ctx) {
		
		queryHotlineNumberResponse.setRequestId(_ctx.stringValue("QueryHotlineNumberResponse.RequestId"));
		queryHotlineNumberResponse.setSuccess(_ctx.booleanValue("QueryHotlineNumberResponse.Success"));
		queryHotlineNumberResponse.setCode(_ctx.stringValue("QueryHotlineNumberResponse.Code"));
		queryHotlineNumberResponse.setMessage(_ctx.stringValue("QueryHotlineNumberResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("QueryHotlineNumberResponse.Data.TotalCount"));
		data.setCurrentPage(_ctx.longValue("QueryHotlineNumberResponse.Data.CurrentPage"));
		data.setPageSize(_ctx.longValue("QueryHotlineNumberResponse.Data.PageSize"));

		List<HotlineNumberList> hotlineNumList = new ArrayList<HotlineNumberList>();
		for (int i = 0; i < _ctx.lengthValue("QueryHotlineNumberResponse.Data.HotlineNumList.Length"); i++) {
			HotlineNumberList hotlineNumberList = new HotlineNumberList();
			hotlineNumberList.setHotlineNumber(_ctx.stringValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].HotlineNumber"));
			hotlineNumberList.setDescription(_ctx.stringValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].Description"));
			hotlineNumberList.setLocation(_ctx.stringValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].Location"));
			hotlineNumberList.setSp(_ctx.stringValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].Sp"));
			hotlineNumberList.setInBoundEnabled(_ctx.booleanValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].InBoundEnabled"));
			hotlineNumberList.setFlowId(_ctx.longValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].FlowId"));
			hotlineNumberList.setFlowName(_ctx.stringValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].FlowName"));
			hotlineNumberList.setOutboundEnabled(_ctx.booleanValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].OutboundEnabled"));
			hotlineNumberList.setCalloutAllDepartment(_ctx.booleanValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].CalloutAllDepartment"));
			hotlineNumberList.setEvaluationStatus(_ctx.integerValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].EvaluationStatus"));

			List<CalloutRangeListItem> calloutRangeList = new ArrayList<CalloutRangeListItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].CalloutRangeList.Length"); j++) {
				CalloutRangeListItem calloutRangeListItem = new CalloutRangeListItem();
				calloutRangeListItem.setDepartmentId(_ctx.longValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].CalloutRangeList["+ j +"].DepartmentId"));
				calloutRangeListItem.setDepartmentName(_ctx.stringValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].CalloutRangeList["+ j +"].DepartmentName"));

				List<GroupDOListItem> groupDOList = new ArrayList<GroupDOListItem>();
				for (int k = 0; k < _ctx.lengthValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].CalloutRangeList["+ j +"].GroupDOList.Length"); k++) {
					GroupDOListItem groupDOListItem = new GroupDOListItem();
					groupDOListItem.setGroupId(_ctx.longValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].CalloutRangeList["+ j +"].GroupDOList["+ k +"].GroupId"));
					groupDOListItem.setGroupName(_ctx.stringValue("QueryHotlineNumberResponse.Data.HotlineNumList["+ i +"].CalloutRangeList["+ j +"].GroupDOList["+ k +"].GroupName"));

					groupDOList.add(groupDOListItem);
				}
				calloutRangeListItem.setGroupDOList(groupDOList);

				calloutRangeList.add(calloutRangeListItem);
			}
			hotlineNumberList.setCalloutRangeList(calloutRangeList);

			hotlineNumList.add(hotlineNumberList);
		}
		data.setHotlineNumList(hotlineNumList);
		queryHotlineNumberResponse.setData(data);
	 
	 	return queryHotlineNumberResponse;
	}
}