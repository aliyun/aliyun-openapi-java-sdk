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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListRemindsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListRemindsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListRemindsResponse.Data.RemindsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListRemindsResponseUnmarshaller {

	public static ListRemindsResponse unmarshall(ListRemindsResponse listRemindsResponse, UnmarshallerContext _ctx) {
		
		listRemindsResponse.setRequestId(_ctx.stringValue("ListRemindsResponse.RequestId"));
		listRemindsResponse.setSuccess(_ctx.booleanValue("ListRemindsResponse.Success"));
		listRemindsResponse.setErrorCode(_ctx.stringValue("ListRemindsResponse.ErrorCode"));
		listRemindsResponse.setErrorMessage(_ctx.stringValue("ListRemindsResponse.ErrorMessage"));
		listRemindsResponse.setHttpStatusCode(_ctx.integerValue("ListRemindsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListRemindsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListRemindsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListRemindsResponse.Data.TotalCount"));

		List<RemindsItem> reminds = new ArrayList<RemindsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListRemindsResponse.Data.Reminds.Length"); i++) {
			RemindsItem remindsItem = new RemindsItem();
			remindsItem.setRemindId(_ctx.longValue("ListRemindsResponse.Data.Reminds["+ i +"].RemindId"));
			remindsItem.setRemindName(_ctx.stringValue("ListRemindsResponse.Data.Reminds["+ i +"].RemindName"));
			remindsItem.setDndStart(_ctx.stringValue("ListRemindsResponse.Data.Reminds["+ i +"].DndStart"));
			remindsItem.setDndEnd(_ctx.stringValue("ListRemindsResponse.Data.Reminds["+ i +"].DndEnd"));
			remindsItem.setRemindUnit(_ctx.stringValue("ListRemindsResponse.Data.Reminds["+ i +"].RemindUnit"));
			remindsItem.setRemindType(_ctx.stringValue("ListRemindsResponse.Data.Reminds["+ i +"].RemindType"));
			remindsItem.setAlertUnit(_ctx.stringValue("ListRemindsResponse.Data.Reminds["+ i +"].AlertUnit"));
			remindsItem.setUseflag(_ctx.booleanValue("ListRemindsResponse.Data.Reminds["+ i +"].Useflag"));
			remindsItem.setFounder(_ctx.stringValue("ListRemindsResponse.Data.Reminds["+ i +"].Founder"));

			List<Long> nodeIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListRemindsResponse.Data.Reminds["+ i +"].NodeIds.Length"); j++) {
				nodeIds.add(_ctx.longValue("ListRemindsResponse.Data.Reminds["+ i +"].NodeIds["+ j +"]"));
			}
			remindsItem.setNodeIds(nodeIds);

			List<Long> baselineIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListRemindsResponse.Data.Reminds["+ i +"].BaselineIds.Length"); j++) {
				baselineIds.add(_ctx.longValue("ListRemindsResponse.Data.Reminds["+ i +"].BaselineIds["+ j +"]"));
			}
			remindsItem.setBaselineIds(baselineIds);

			List<Long> projectIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListRemindsResponse.Data.Reminds["+ i +"].ProjectIds.Length"); j++) {
				projectIds.add(_ctx.longValue("ListRemindsResponse.Data.Reminds["+ i +"].ProjectIds["+ j +"]"));
			}
			remindsItem.setProjectIds(projectIds);

			List<Long> bizProcessIds = new ArrayList<Long>();
			for (int j = 0; j < _ctx.lengthValue("ListRemindsResponse.Data.Reminds["+ i +"].BizProcessIds.Length"); j++) {
				bizProcessIds.add(_ctx.longValue("ListRemindsResponse.Data.Reminds["+ i +"].BizProcessIds["+ j +"]"));
			}
			remindsItem.setBizProcessIds(bizProcessIds);

			List<String> alertMethods = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRemindsResponse.Data.Reminds["+ i +"].AlertMethods.Length"); j++) {
				alertMethods.add(_ctx.stringValue("ListRemindsResponse.Data.Reminds["+ i +"].AlertMethods["+ j +"]"));
			}
			remindsItem.setAlertMethods(alertMethods);

			List<String> alertTargets = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListRemindsResponse.Data.Reminds["+ i +"].AlertTargets.Length"); j++) {
				alertTargets.add(_ctx.stringValue("ListRemindsResponse.Data.Reminds["+ i +"].AlertTargets["+ j +"]"));
			}
			remindsItem.setAlertTargets(alertTargets);

			reminds.add(remindsItem);
		}
		data.setReminds(reminds);
		listRemindsResponse.setData(data);
	 
	 	return listRemindsResponse;
	}
}