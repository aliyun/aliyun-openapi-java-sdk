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

package com.aliyuncs.cusanalytic_sc_online.transform.v20190524;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.ListVisitorsResponse;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.ListVisitorsResponse.VisitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVisitorsResponseUnmarshaller {

	public static ListVisitorsResponse unmarshall(ListVisitorsResponse listVisitorsResponse, UnmarshallerContext _ctx) {
		
		listVisitorsResponse.setTotal(_ctx.longValue("ListVisitorsResponse.Total"));
		listVisitorsResponse.setPageIndex(_ctx.integerValue("ListVisitorsResponse.PageIndex"));
		listVisitorsResponse.setPageSize(_ctx.integerValue("ListVisitorsResponse.PageSize"));

		List<VisitorItem> visitorItems = new ArrayList<VisitorItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVisitorsResponse.VisitorItems.Length"); i++) {
			VisitorItem visitorItem = new VisitorItem();
			visitorItem.setImg(_ctx.stringValue("ListVisitorsResponse.VisitorItems["+ i +"].Img"));
			visitorItem.setPkId(_ctx.stringValue("ListVisitorsResponse.VisitorItems["+ i +"].PkId"));
			visitorItem.setLatelyTime(_ctx.longValue("ListVisitorsResponse.VisitorItems["+ i +"].LatelyTime"));
			visitorItem.setEarliestPlace(_ctx.stringValue("ListVisitorsResponse.VisitorItems["+ i +"].EarliestPlace"));
			visitorItem.setUkId(_ctx.stringValue("ListVisitorsResponse.VisitorItems["+ i +"].UkId"));
			visitorItem.setGender(_ctx.stringValue("ListVisitorsResponse.VisitorItems["+ i +"].Gender"));
			visitorItem.setEarliestTime(_ctx.longValue("ListVisitorsResponse.VisitorItems["+ i +"].EarliestTime"));
			visitorItem.setLatelyPlace(_ctx.stringValue("ListVisitorsResponse.VisitorItems["+ i +"].LatelyPlace"));
			visitorItem.setAge(_ctx.longValue("ListVisitorsResponse.VisitorItems["+ i +"].Age"));
			visitorItem.setStoreId(_ctx.longValue("ListVisitorsResponse.VisitorItems["+ i +"].StoreId"));
			visitorItem.setEnterCount(_ctx.longValue("ListVisitorsResponse.VisitorItems["+ i +"].EnterCount"));

			visitorItems.add(visitorItem);
		}
		listVisitorsResponse.setVisitorItems(visitorItems);
	 
	 	return listVisitorsResponse;
	}
}