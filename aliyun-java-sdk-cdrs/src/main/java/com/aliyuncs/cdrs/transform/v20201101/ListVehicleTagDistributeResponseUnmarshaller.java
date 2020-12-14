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

import com.aliyuncs.cdrs.model.v20201101.ListVehicleTagDistributeResponse;
import com.aliyuncs.cdrs.model.v20201101.ListVehicleTagDistributeResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVehicleTagDistributeResponseUnmarshaller {

	public static ListVehicleTagDistributeResponse unmarshall(ListVehicleTagDistributeResponse listVehicleTagDistributeResponse, UnmarshallerContext _ctx) {
		
		listVehicleTagDistributeResponse.setRequestId(_ctx.stringValue("ListVehicleTagDistributeResponse.RequestId"));
		listVehicleTagDistributeResponse.setCode(_ctx.stringValue("ListVehicleTagDistributeResponse.Code"));
		listVehicleTagDistributeResponse.setMessage(_ctx.stringValue("ListVehicleTagDistributeResponse.Message"));
		listVehicleTagDistributeResponse.setPageNumber(_ctx.longValue("ListVehicleTagDistributeResponse.PageNumber"));
		listVehicleTagDistributeResponse.setPageSize(_ctx.longValue("ListVehicleTagDistributeResponse.PageSize"));
		listVehicleTagDistributeResponse.setTotalCount(_ctx.longValue("ListVehicleTagDistributeResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListVehicleTagDistributeResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setCorpId(_ctx.stringValue("ListVehicleTagDistributeResponse.Data["+ i +"].CorpId"));
			datas.setTagValue(_ctx.stringValue("ListVehicleTagDistributeResponse.Data["+ i +"].TagValue"));
			datas.setValue(_ctx.stringValue("ListVehicleTagDistributeResponse.Data["+ i +"].Value"));

			data.add(datas);
		}
		listVehicleTagDistributeResponse.setData(data);
	 
	 	return listVehicleTagDistributeResponse;
	}
}