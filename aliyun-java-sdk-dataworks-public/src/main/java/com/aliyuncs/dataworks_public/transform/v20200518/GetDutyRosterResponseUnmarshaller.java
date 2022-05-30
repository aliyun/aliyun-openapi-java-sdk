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

import com.aliyuncs.dataworks_public.model.v20200518.GetDutyRosterResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetDutyRosterResponse.Paging;
import com.aliyuncs.dataworks_public.model.v20200518.GetDutyRosterResponse.Paging.DutyRosterItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDutyRosterResponseUnmarshaller {

	public static GetDutyRosterResponse unmarshall(GetDutyRosterResponse getDutyRosterResponse, UnmarshallerContext _ctx) {
		
		getDutyRosterResponse.setRequestId(_ctx.stringValue("GetDutyRosterResponse.RequestId"));

		Paging paging = new Paging();
		paging.setPageNumber(_ctx.integerValue("GetDutyRosterResponse.Paging.PageNumber"));
		paging.setPageSize(_ctx.integerValue("GetDutyRosterResponse.Paging.PageSize"));
		paging.setTotalCount(_ctx.integerValue("GetDutyRosterResponse.Paging.TotalCount"));

		List<DutyRosterItem> dutyRoster = new ArrayList<DutyRosterItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDutyRosterResponse.Paging.DutyRoster.Length"); i++) {
			DutyRosterItem dutyRosterItem = new DutyRosterItem();
			dutyRosterItem.setWatchkeeper(_ctx.stringValue("GetDutyRosterResponse.Paging.DutyRoster["+ i +"].Watchkeeper"));
			dutyRosterItem.setWatchkeeperName(_ctx.stringValue("GetDutyRosterResponse.Paging.DutyRoster["+ i +"].WatchkeeperName"));
			dutyRosterItem.setStartLong(_ctx.longValue("GetDutyRosterResponse.Paging.DutyRoster["+ i +"].StartLong"));
			dutyRosterItem.setEndLong(_ctx.longValue("GetDutyRosterResponse.Paging.DutyRoster["+ i +"].EndLong"));

			dutyRoster.add(dutyRosterItem);
		}
		paging.setDutyRoster(dutyRoster);
		getDutyRosterResponse.setPaging(paging);
	 
	 	return getDutyRosterResponse;
	}
}