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

import com.aliyuncs.cdrs.model.v20201101.ListDataStatisticsByDayResponse;
import com.aliyuncs.cdrs.model.v20201101.ListDataStatisticsByDayResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataStatisticsByDayResponseUnmarshaller {

	public static ListDataStatisticsByDayResponse unmarshall(ListDataStatisticsByDayResponse listDataStatisticsByDayResponse, UnmarshallerContext _ctx) {
		
		listDataStatisticsByDayResponse.setRequestId(_ctx.stringValue("ListDataStatisticsByDayResponse.RequestId"));
		listDataStatisticsByDayResponse.setCode(_ctx.stringValue("ListDataStatisticsByDayResponse.Code"));
		listDataStatisticsByDayResponse.setMessage(_ctx.stringValue("ListDataStatisticsByDayResponse.Message"));
		listDataStatisticsByDayResponse.setPageNumber(_ctx.longValue("ListDataStatisticsByDayResponse.PageNumber"));
		listDataStatisticsByDayResponse.setPageSize(_ctx.longValue("ListDataStatisticsByDayResponse.PageSize"));
		listDataStatisticsByDayResponse.setTotalCount(_ctx.longValue("ListDataStatisticsByDayResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListDataStatisticsByDayResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setDate(_ctx.stringValue("ListDataStatisticsByDayResponse.Data["+ i +"].Date"));
			datas.setCorpId(_ctx.stringValue("ListDataStatisticsByDayResponse.Data["+ i +"].CorpId"));
			datas.setFaceNumber(_ctx.integerValue("ListDataStatisticsByDayResponse.Data["+ i +"].FaceNumber"));
			datas.setBodyNumber(_ctx.integerValue("ListDataStatisticsByDayResponse.Data["+ i +"].BodyNumber"));
			datas.setMotorNumber(_ctx.integerValue("ListDataStatisticsByDayResponse.Data["+ i +"].MotorNumber"));
			datas.setNonMotorNumber(_ctx.integerValue("ListDataStatisticsByDayResponse.Data["+ i +"].NonMotorNumber"));
			datas.setTotalNumber(_ctx.integerValue("ListDataStatisticsByDayResponse.Data["+ i +"].TotalNumber"));

			data.add(datas);
		}
		listDataStatisticsByDayResponse.setData(data);
	 
	 	return listDataStatisticsByDayResponse;
	}
}