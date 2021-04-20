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

import com.aliyuncs.vcs.model.v20200515.ListPersonVisitCountResponse;
import com.aliyuncs.vcs.model.v20200515.ListPersonVisitCountResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonVisitCountResponseUnmarshaller {

	public static ListPersonVisitCountResponse unmarshall(ListPersonVisitCountResponse listPersonVisitCountResponse, UnmarshallerContext _ctx) {
		
		listPersonVisitCountResponse.setRequestId(_ctx.stringValue("ListPersonVisitCountResponse.RequestId"));
		listPersonVisitCountResponse.setTotalCount(_ctx.stringValue("ListPersonVisitCountResponse.TotalCount"));
		listPersonVisitCountResponse.setPageSize(_ctx.stringValue("ListPersonVisitCountResponse.PageSize"));
		listPersonVisitCountResponse.setMessage(_ctx.stringValue("ListPersonVisitCountResponse.Message"));
		listPersonVisitCountResponse.setPageNo(_ctx.stringValue("ListPersonVisitCountResponse.PageNo"));
		listPersonVisitCountResponse.setCode(_ctx.stringValue("ListPersonVisitCountResponse.Code"));
		listPersonVisitCountResponse.setSuccess(_ctx.stringValue("ListPersonVisitCountResponse.Success"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonVisitCountResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setCorpId(_ctx.stringValue("ListPersonVisitCountResponse.Data["+ i +"].CorpId"));
			datas.setPersonId(_ctx.stringValue("ListPersonVisitCountResponse.Data["+ i +"].PersonId"));
			datas.setDeviceId(_ctx.stringValue("ListPersonVisitCountResponse.Data["+ i +"].DeviceId"));
			datas.setTagMetrics(_ctx.stringValue("ListPersonVisitCountResponse.Data["+ i +"].TagMetrics"));
			datas.setTagCode(_ctx.stringValue("ListPersonVisitCountResponse.Data["+ i +"].TagCode"));
			datas.setDayId(_ctx.stringValue("ListPersonVisitCountResponse.Data["+ i +"].DayId"));
			datas.setHourId(_ctx.stringValue("ListPersonVisitCountResponse.Data["+ i +"].HourId"));
			datas.setGroupId(_ctx.stringValue("ListPersonVisitCountResponse.Data["+ i +"].GroupId"));

			data.add(datas);
		}
		listPersonVisitCountResponse.setData(data);
	 
	 	return listPersonVisitCountResponse;
	}
}