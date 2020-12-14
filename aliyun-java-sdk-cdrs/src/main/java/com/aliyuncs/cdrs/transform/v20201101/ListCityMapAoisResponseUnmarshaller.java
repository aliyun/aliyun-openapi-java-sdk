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

import com.aliyuncs.cdrs.model.v20201101.ListCityMapAoisResponse;
import com.aliyuncs.cdrs.model.v20201101.ListCityMapAoisResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCityMapAoisResponseUnmarshaller {

	public static ListCityMapAoisResponse unmarshall(ListCityMapAoisResponse listCityMapAoisResponse, UnmarshallerContext _ctx) {
		
		listCityMapAoisResponse.setRequestId(_ctx.stringValue("ListCityMapAoisResponse.RequestId"));
		listCityMapAoisResponse.setCode(_ctx.stringValue("ListCityMapAoisResponse.Code"));
		listCityMapAoisResponse.setMessage(_ctx.stringValue("ListCityMapAoisResponse.Message"));
		listCityMapAoisResponse.setTotalCount(_ctx.longValue("ListCityMapAoisResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListCityMapAoisResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setId(_ctx.stringValue("ListCityMapAoisResponse.Data["+ i +"].Id"));
			datas.setValue(_ctx.stringValue("ListCityMapAoisResponse.Data["+ i +"].Value"));

			data.add(datas);
		}
		listCityMapAoisResponse.setData(data);
	 
	 	return listCityMapAoisResponse;
	}
}