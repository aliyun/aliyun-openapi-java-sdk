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

	public static DescribeDepartsResponse unmarshall(DescribeDepartsResponse describeDepartsResponse, UnmarshallerContext context) {
		
		describeDepartsResponse.setRequestId(context.stringValue("DescribeDepartsResponse.RequestId"));
		describeDepartsResponse.setPageSize(context.integerValue("DescribeDepartsResponse.PageSize"));
		describeDepartsResponse.setCurrentPage(context.integerValue("DescribeDepartsResponse.CurrentPage"));
		describeDepartsResponse.setTotalCount(context.integerValue("DescribeDepartsResponse.TotalCount"));

		List<Depart> items = new ArrayList<Depart>();
		for (int i = 0; i < context.lengthValue("DescribeDepartsResponse.Items.Length"); i++) {
			Depart depart = new Depart();
			depart.setId(context.longValue("DescribeDepartsResponse.Items["+ i +"].Id"));
			depart.setDepartId(context.longValue("DescribeDepartsResponse.Items["+ i +"].DepartId"));
			depart.setDepartName(context.stringValue("DescribeDepartsResponse.Items["+ i +"].DepartName"));
			depart.setComment(context.stringValue("DescribeDepartsResponse.Items["+ i +"].Comment"));
			depart.setParentDepartId(context.longValue("DescribeDepartsResponse.Items["+ i +"].ParentDepartId"));
			depart.setParentDepartName(context.stringValue("DescribeDepartsResponse.Items["+ i +"].ParentDepartName"));
			depart.setLevel(context.integerValue("DescribeDepartsResponse.Items["+ i +"].Level"));

			items.add(depart);
		}
		describeDepartsResponse.setItems(items);
	 
	 	return describeDepartsResponse;
	}
}