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

import com.aliyuncs.cdrs.model.v20201101.ListPersonTopResponse;
import com.aliyuncs.cdrs.model.v20201101.ListPersonTopResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonTopResponseUnmarshaller {

	public static ListPersonTopResponse unmarshall(ListPersonTopResponse listPersonTopResponse, UnmarshallerContext _ctx) {
		
		listPersonTopResponse.setRequestId(_ctx.stringValue("ListPersonTopResponse.RequestId"));
		listPersonTopResponse.setCode(_ctx.stringValue("ListPersonTopResponse.Code"));
		listPersonTopResponse.setMessage(_ctx.stringValue("ListPersonTopResponse.Message"));
		listPersonTopResponse.setPageNumber(_ctx.longValue("ListPersonTopResponse.PageNumber"));
		listPersonTopResponse.setPageSize(_ctx.longValue("ListPersonTopResponse.PageSize"));
		listPersonTopResponse.setTotalCount(_ctx.longValue("ListPersonTopResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonTopResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setCorpId(_ctx.stringValue("ListPersonTopResponse.Data["+ i +"].CorpId"));
			datas.setPersonId(_ctx.stringValue("ListPersonTopResponse.Data["+ i +"].PersonId"));
			datas.setPoiId(_ctx.stringValue("ListPersonTopResponse.Data["+ i +"].PoiId"));
			datas.setPoiName(_ctx.stringValue("ListPersonTopResponse.Data["+ i +"].PoiName"));
			datas.setPassHour(_ctx.stringValue("ListPersonTopResponse.Data["+ i +"].PassHour"));
			datas.setFrequency(_ctx.stringValue("ListPersonTopResponse.Data["+ i +"].Frequency"));

			data.add(datas);
		}
		listPersonTopResponse.setData(data);
	 
	 	return listPersonTopResponse;
	}
}