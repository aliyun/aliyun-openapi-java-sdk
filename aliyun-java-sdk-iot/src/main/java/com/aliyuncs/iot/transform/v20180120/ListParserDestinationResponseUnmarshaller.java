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

import com.aliyuncs.iot.model.v20180120.ListParserDestinationResponse;
import com.aliyuncs.iot.model.v20180120.ListParserDestinationResponse.Destinations;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListParserDestinationResponseUnmarshaller {

	public static ListParserDestinationResponse unmarshall(ListParserDestinationResponse listParserDestinationResponse, UnmarshallerContext _ctx) {
		
		listParserDestinationResponse.setRequestId(_ctx.stringValue("ListParserDestinationResponse.RequestId"));
		listParserDestinationResponse.setSuccess(_ctx.booleanValue("ListParserDestinationResponse.Success"));
		listParserDestinationResponse.setCode(_ctx.stringValue("ListParserDestinationResponse.Code"));
		listParserDestinationResponse.setErrorMessage(_ctx.stringValue("ListParserDestinationResponse.ErrorMessage"));

		List<Destinations> data = new ArrayList<Destinations>();
		for (int i = 0; i < _ctx.lengthValue("ListParserDestinationResponse.Data.Length"); i++) {
			Destinations destinations = new Destinations();
			destinations.setDestinationId(_ctx.longValue("ListParserDestinationResponse.Data["+ i +"].DestinationId"));
			destinations.setName(_ctx.stringValue("ListParserDestinationResponse.Data["+ i +"].Name"));
			destinations.setType(_ctx.stringValue("ListParserDestinationResponse.Data["+ i +"].Type"));
			destinations.setConfiguration(_ctx.stringValue("ListParserDestinationResponse.Data["+ i +"].Configuration"));
			destinations.setIsFailover(_ctx.booleanValue("ListParserDestinationResponse.Data["+ i +"].IsFailover"));
			destinations.setUtcCreated(_ctx.stringValue("ListParserDestinationResponse.Data["+ i +"].UtcCreated"));
			destinations.setUtcModified(_ctx.stringValue("ListParserDestinationResponse.Data["+ i +"].UtcModified"));

			data.add(destinations);
		}
		listParserDestinationResponse.setData(data);
	 
	 	return listParserDestinationResponse;
	}
}