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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListAlertDingDingGroupResponse;
import com.aliyuncs.emr.model.v20160408.ListAlertDingDingGroupResponse.AlertDingDingGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlertDingDingGroupResponseUnmarshaller {

	public static ListAlertDingDingGroupResponse unmarshall(ListAlertDingDingGroupResponse listAlertDingDingGroupResponse, UnmarshallerContext _ctx) {
		

		List<AlertDingDingGroup> alertDingDingGroupList = new ArrayList<AlertDingDingGroup>();
		for (int i = 0; i < _ctx.lengthValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList.Length"); i++) {
			AlertDingDingGroup alertDingDingGroup = new AlertDingDingGroup();
			alertDingDingGroup.setId(_ctx.longValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].Id"));
			alertDingDingGroup.setGmtCreate(_ctx.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].GmtCreate"));
			alertDingDingGroup.setGmtModified(_ctx.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].GmtModified"));
			alertDingDingGroup.setBizId(_ctx.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].BizId"));
			alertDingDingGroup.setName(_ctx.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].Name"));
			alertDingDingGroup.setDescription(_ctx.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].Description"));
			alertDingDingGroup.setWebHookUrl(_ctx.stringValue("ListAlertDingDingGroupResponse.AlertDingDingGroupList["+ i +"].WebHookUrl"));

			alertDingDingGroupList.add(alertDingDingGroup);
		}
		listAlertDingDingGroupResponse.setAlertDingDingGroupList(alertDingDingGroupList);
	 
	 	return listAlertDingDingGroupResponse;
	}
}