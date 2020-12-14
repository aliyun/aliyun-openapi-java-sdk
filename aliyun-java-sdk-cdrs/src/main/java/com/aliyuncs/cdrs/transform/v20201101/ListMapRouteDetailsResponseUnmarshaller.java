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

import com.aliyuncs.cdrs.model.v20201101.ListMapRouteDetailsResponse;
import com.aliyuncs.cdrs.model.v20201101.ListMapRouteDetailsResponse.Datas;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMapRouteDetailsResponseUnmarshaller {

	public static ListMapRouteDetailsResponse unmarshall(ListMapRouteDetailsResponse listMapRouteDetailsResponse, UnmarshallerContext _ctx) {
		
		listMapRouteDetailsResponse.setRequestId(_ctx.stringValue("ListMapRouteDetailsResponse.RequestId"));
		listMapRouteDetailsResponse.setCode(_ctx.stringValue("ListMapRouteDetailsResponse.Code"));
		listMapRouteDetailsResponse.setMessage(_ctx.stringValue("ListMapRouteDetailsResponse.Message"));
		listMapRouteDetailsResponse.setPageNumber(_ctx.longValue("ListMapRouteDetailsResponse.PageNumber"));
		listMapRouteDetailsResponse.setPageSize(_ctx.longValue("ListMapRouteDetailsResponse.PageSize"));
		listMapRouteDetailsResponse.setTotalCount(_ctx.longValue("ListMapRouteDetailsResponse.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("ListMapRouteDetailsResponse.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setDestination(_ctx.stringValue("ListMapRouteDetailsResponse.Data["+ i +"].Destination"));
			datas.setOrigin(_ctx.stringValue("ListMapRouteDetailsResponse.Data["+ i +"].Origin"));
			datas.setRoute(_ctx.stringValue("ListMapRouteDetailsResponse.Data["+ i +"].Route"));
			datas.setType(_ctx.stringValue("ListMapRouteDetailsResponse.Data["+ i +"].Type"));

			data.add(datas);
		}
		listMapRouteDetailsResponse.setData(data);
	 
	 	return listMapRouteDetailsResponse;
	}
}