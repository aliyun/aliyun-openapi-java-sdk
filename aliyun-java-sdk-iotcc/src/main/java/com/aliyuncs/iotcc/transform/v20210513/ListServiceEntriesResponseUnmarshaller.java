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

package com.aliyuncs.iotcc.transform.v20210513;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iotcc.model.v20210513.ListServiceEntriesResponse;
import com.aliyuncs.iotcc.model.v20210513.ListServiceEntriesResponse.ServiceEntryModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListServiceEntriesResponseUnmarshaller {

	public static ListServiceEntriesResponse unmarshall(ListServiceEntriesResponse listServiceEntriesResponse, UnmarshallerContext _ctx) {
		
		listServiceEntriesResponse.setRequestId(_ctx.stringValue("ListServiceEntriesResponse.RequestId"));
		listServiceEntriesResponse.setTotalCount(_ctx.integerValue("ListServiceEntriesResponse.TotalCount"));
		listServiceEntriesResponse.setNextToken(_ctx.stringValue("ListServiceEntriesResponse.NextToken"));
		listServiceEntriesResponse.setMaxResults(_ctx.integerValue("ListServiceEntriesResponse.MaxResults"));

		List<ServiceEntryModel> serviceEntries = new ArrayList<ServiceEntryModel>();
		for (int i = 0; i < _ctx.lengthValue("ListServiceEntriesResponse.ServiceEntries.Length"); i++) {
			ServiceEntryModel serviceEntryModel = new ServiceEntryModel();
			serviceEntryModel.setServiceId(_ctx.stringValue("ListServiceEntriesResponse.ServiceEntries["+ i +"].ServiceId"));
			serviceEntryModel.setServiceEntryStatus(_ctx.stringValue("ListServiceEntriesResponse.ServiceEntries["+ i +"].ServiceEntryStatus"));
			serviceEntryModel.setTarget(_ctx.stringValue("ListServiceEntriesResponse.ServiceEntries["+ i +"].Target"));
			serviceEntryModel.setTargetType(_ctx.stringValue("ListServiceEntriesResponse.ServiceEntries["+ i +"].TargetType"));
			serviceEntryModel.setServiceEntryName(_ctx.stringValue("ListServiceEntriesResponse.ServiceEntries["+ i +"].ServiceEntryName"));
			serviceEntryModel.setServiceEntryDescription(_ctx.stringValue("ListServiceEntriesResponse.ServiceEntries["+ i +"].ServiceEntryDescription"));
			serviceEntryModel.setServiceEntryId(_ctx.stringValue("ListServiceEntriesResponse.ServiceEntries["+ i +"].ServiceEntryId"));

			serviceEntries.add(serviceEntryModel);
		}
		listServiceEntriesResponse.setServiceEntries(serviceEntries);
	 
	 	return listServiceEntriesResponse;
	}
}