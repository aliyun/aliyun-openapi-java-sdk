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

import com.aliyuncs.dataworks_public.model.v20200518.ListDutyRostersResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDutyRostersResponse.Paging;
import com.aliyuncs.dataworks_public.model.v20200518.ListDutyRostersResponse.Paging.DutyRostersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDutyRostersResponseUnmarshaller {

	public static ListDutyRostersResponse unmarshall(ListDutyRostersResponse listDutyRostersResponse, UnmarshallerContext _ctx) {
		
		listDutyRostersResponse.setRequestId(_ctx.stringValue("ListDutyRostersResponse.RequestId"));

		Paging paging = new Paging();
		paging.setPageNumber(_ctx.integerValue("ListDutyRostersResponse.Paging.PageNumber"));
		paging.setPageSize(_ctx.integerValue("ListDutyRostersResponse.Paging.PageSize"));
		paging.setTotalCount(_ctx.integerValue("ListDutyRostersResponse.Paging.TotalCount"));

		List<DutyRostersItem> dutyRosters = new ArrayList<DutyRostersItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDutyRostersResponse.Paging.DutyRosters.Length"); i++) {
			DutyRostersItem dutyRostersItem = new DutyRostersItem();
			dutyRostersItem.setDutyRosterIdentifier(_ctx.stringValue("ListDutyRostersResponse.Paging.DutyRosters["+ i +"].DutyRosterIdentifier"));
			dutyRostersItem.setDutyRosterName(_ctx.stringValue("ListDutyRostersResponse.Paging.DutyRosters["+ i +"].DutyRosterName"));

			dutyRosters.add(dutyRostersItem);
		}
		paging.setDutyRosters(dutyRosters);
		listDutyRostersResponse.setPaging(paging);
	 
	 	return listDutyRostersResponse;
	}
}