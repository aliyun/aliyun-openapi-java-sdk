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

package com.aliyuncs.sddp.transform.v20190103;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sddp.model.v20190103.DescribeDepartsResponse;
import com.aliyuncs.sddp.model.v20190103.DescribeDepartsResponse.Depart;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDepartsResponseUnmarshaller {

	public static DescribeDepartsResponse unmarshall(DescribeDepartsResponse describeDepartsResponse, UnmarshallerContext _ctx) {
		
		describeDepartsResponse.setRequestId(_ctx.stringValue("DescribeDepartsResponse.RequestId"));
		describeDepartsResponse.setPageSize(_ctx.integerValue("DescribeDepartsResponse.PageSize"));
		describeDepartsResponse.setCurrentPage(_ctx.integerValue("DescribeDepartsResponse.CurrentPage"));
		describeDepartsResponse.setTotalCount(_ctx.integerValue("DescribeDepartsResponse.TotalCount"));

		List<Depart> items = new ArrayList<Depart>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDepartsResponse.Items.Length"); i++) {
			Depart depart = new Depart();
			depart.setId(_ctx.longValue("DescribeDepartsResponse.Items["+ i +"].Id"));
			depart.setDepartId(_ctx.longValue("DescribeDepartsResponse.Items["+ i +"].DepartId"));
			depart.setDepartName(_ctx.stringValue("DescribeDepartsResponse.Items["+ i +"].DepartName"));
			depart.setComment(_ctx.stringValue("DescribeDepartsResponse.Items["+ i +"].Comment"));
			depart.setParentDepartId(_ctx.longValue("DescribeDepartsResponse.Items["+ i +"].ParentDepartId"));
			depart.setParentDepartName(_ctx.stringValue("DescribeDepartsResponse.Items["+ i +"].ParentDepartName"));
			depart.setLevel(_ctx.integerValue("DescribeDepartsResponse.Items["+ i +"].Level"));

			items.add(depart);
		}
		describeDepartsResponse.setItems(items);
	 
	 	return describeDepartsResponse;
	}
}