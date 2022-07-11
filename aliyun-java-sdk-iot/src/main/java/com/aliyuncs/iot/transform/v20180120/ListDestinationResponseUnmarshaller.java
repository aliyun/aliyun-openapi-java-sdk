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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListDestinationResponse;
import com.aliyuncs.iot.model.v20180120.ListDestinationResponse.DestinationsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDestinationResponseUnmarshaller {

	public static ListDestinationResponse unmarshall(ListDestinationResponse listDestinationResponse, UnmarshallerContext _ctx) {
		
		listDestinationResponse.setRequestId(_ctx.stringValue("ListDestinationResponse.RequestId"));
		listDestinationResponse.setSuccess(_ctx.booleanValue("ListDestinationResponse.Success"));
		listDestinationResponse.setCode(_ctx.stringValue("ListDestinationResponse.Code"));
		listDestinationResponse.setErrorMessage(_ctx.stringValue("ListDestinationResponse.ErrorMessage"));
		listDestinationResponse.setPage(_ctx.integerValue("ListDestinationResponse.Page"));
		listDestinationResponse.setPageSize(_ctx.integerValue("ListDestinationResponse.PageSize"));
		listDestinationResponse.setTotal(_ctx.integerValue("ListDestinationResponse.Total"));

		List<DestinationsItem> destinations = new ArrayList<DestinationsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDestinationResponse.Destinations.Length"); i++) {
			DestinationsItem destinationsItem = new DestinationsItem();
			destinationsItem.setDestinationId(_ctx.longValue("ListDestinationResponse.Destinations["+ i +"].DestinationId"));
			destinationsItem.setName(_ctx.stringValue("ListDestinationResponse.Destinations["+ i +"].Name"));
			destinationsItem.setType(_ctx.stringValue("ListDestinationResponse.Destinations["+ i +"].Type"));
			destinationsItem.setConfiguration(_ctx.stringValue("ListDestinationResponse.Destinations["+ i +"].Configuration"));
			destinationsItem.setIsFailover(_ctx.booleanValue("ListDestinationResponse.Destinations["+ i +"].IsFailover"));
			destinationsItem.setUtcCreated(_ctx.stringValue("ListDestinationResponse.Destinations["+ i +"].UtcCreated"));
			destinationsItem.setDescription(_ctx.stringValue("ListDestinationResponse.Destinations["+ i +"].Description"));

			destinations.add(destinationsItem);
		}
		listDestinationResponse.setDestinations(destinations);
	 
	 	return listDestinationResponse;
	}
}