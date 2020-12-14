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

import com.aliyuncs.cdrs.model.v20201101.ListCityMapPersonFlowResponse;
import com.aliyuncs.cdrs.model.v20201101.ListCityMapPersonFlowResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCityMapPersonFlowResponseUnmarshaller {

	public static ListCityMapPersonFlowResponse unmarshall(ListCityMapPersonFlowResponse listCityMapPersonFlowResponse, UnmarshallerContext _ctx) {
		
		listCityMapPersonFlowResponse.setRequestId(_ctx.stringValue("ListCityMapPersonFlowResponse.RequestId"));
		listCityMapPersonFlowResponse.setCode(_ctx.stringValue("ListCityMapPersonFlowResponse.Code"));
		listCityMapPersonFlowResponse.setMessage(_ctx.stringValue("ListCityMapPersonFlowResponse.Message"));
		listCityMapPersonFlowResponse.setPageNumber(_ctx.longValue("ListCityMapPersonFlowResponse.PageNumber"));
		listCityMapPersonFlowResponse.setPageSize(_ctx.longValue("ListCityMapPersonFlowResponse.PageSize"));
		listCityMapPersonFlowResponse.setTotalCount(_ctx.longValue("ListCityMapPersonFlowResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListCityMapPersonFlowResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setOriginDataSourceId(_ctx.stringValue("ListCityMapPersonFlowResponse.Data["+ i +"].OriginDataSourceId"));
			datas.setTargetDataSourceId(_ctx.stringValue("ListCityMapPersonFlowResponse.Data["+ i +"].TargetDataSourceId"));
			datas.setFlowNumber(_ctx.stringValue("ListCityMapPersonFlowResponse.Data["+ i +"].FlowNumber"));
			datas.setFlowDirection(_ctx.stringValue("ListCityMapPersonFlowResponse.Data["+ i +"].FlowDirection"));

			data.add(datas);
		}
		listCityMapPersonFlowResponse.setData(data);
	 
	 	return listCityMapPersonFlowResponse;
	}
}