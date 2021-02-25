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

import com.aliyuncs.cdrs.model.v20201101.ListPersonResultResponse;
import com.aliyuncs.cdrs.model.v20201101.ListPersonResultResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersonResultResponseUnmarshaller {

	public static ListPersonResultResponse unmarshall(ListPersonResultResponse listPersonResultResponse, UnmarshallerContext _ctx) {
		
		listPersonResultResponse.setRequestId(_ctx.stringValue("ListPersonResultResponse.RequestId"));
		listPersonResultResponse.setCode(_ctx.stringValue("ListPersonResultResponse.Code"));
		listPersonResultResponse.setMessage(_ctx.stringValue("ListPersonResultResponse.Message"));
		listPersonResultResponse.setPageNumber(_ctx.longValue("ListPersonResultResponse.PageNumber"));
		listPersonResultResponse.setPageSize(_ctx.longValue("ListPersonResultResponse.PageSize"));
		listPersonResultResponse.setTotalCount(_ctx.longValue("ListPersonResultResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListPersonResultResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setPersonId(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].PersonId"));
			datas.setGender(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].Gender"));
			datas.setAge(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].Age"));
			datas.setProfession(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].Profession"));
			datas.setAddress(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].Address"));
			datas.setTransportation(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].Transportation"));
			datas.setPersonType(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].PersonType"));
			datas.setHotSpotAddress(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].HotSpotAddress"));
			datas.setUpdateTime(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].UpdateTime"));
			datas.setTargetUrl(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].TargetUrl"));
			datas.setSourceUrl(_ctx.stringValue("ListPersonResultResponse.Data["+ i +"].SourceUrl"));

			data.add(datas);
		}
		listPersonResultResponse.setData(data);
	 
	 	return listPersonResultResponse;
	}
}