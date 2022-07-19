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

import com.aliyuncs.dataworks_public.model.v20200518.ListShiftPersonnelsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListShiftPersonnelsResponse.Paging;
import com.aliyuncs.dataworks_public.model.v20200518.ListShiftPersonnelsResponse.Paging.ShiftPersonsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListShiftPersonnelsResponseUnmarshaller {

	public static ListShiftPersonnelsResponse unmarshall(ListShiftPersonnelsResponse listShiftPersonnelsResponse, UnmarshallerContext _ctx) {
		
		listShiftPersonnelsResponse.setRequestId(_ctx.stringValue("ListShiftPersonnelsResponse.RequestId"));

		Paging paging = new Paging();
		paging.setPageNumber(_ctx.integerValue("ListShiftPersonnelsResponse.Paging.PageNumber"));
		paging.setPageSize(_ctx.integerValue("ListShiftPersonnelsResponse.Paging.PageSize"));
		paging.setTotalCount(_ctx.integerValue("ListShiftPersonnelsResponse.Paging.TotalCount"));

		List<ShiftPersonsItem> shiftPersons = new ArrayList<ShiftPersonsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListShiftPersonnelsResponse.Paging.ShiftPersons.Length"); i++) {
			ShiftPersonsItem shiftPersonsItem = new ShiftPersonsItem();
			shiftPersonsItem.setShiftPersonUID(_ctx.stringValue("ListShiftPersonnelsResponse.Paging.ShiftPersons["+ i +"].ShiftPersonUID"));
			shiftPersonsItem.setShiftPersonName(_ctx.stringValue("ListShiftPersonnelsResponse.Paging.ShiftPersons["+ i +"].ShiftPersonName"));
			shiftPersonsItem.setBeginTime(_ctx.longValue("ListShiftPersonnelsResponse.Paging.ShiftPersons["+ i +"].BeginTime"));
			shiftPersonsItem.setEndTime(_ctx.longValue("ListShiftPersonnelsResponse.Paging.ShiftPersons["+ i +"].EndTime"));

			shiftPersons.add(shiftPersonsItem);
		}
		paging.setShiftPersons(shiftPersons);
		listShiftPersonnelsResponse.setPaging(paging);
	 
	 	return listShiftPersonnelsResponse;
	}
}