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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.ListEmrHiveDatabasesResponse;
import com.aliyuncs.dataworks_public.model.v20180601.ListEmrHiveDatabasesResponse.HiveDatabase;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEmrHiveDatabasesResponseUnmarshaller {

	public static ListEmrHiveDatabasesResponse unmarshall(ListEmrHiveDatabasesResponse listEmrHiveDatabasesResponse, UnmarshallerContext _ctx) {
		
		listEmrHiveDatabasesResponse.setRequestId(_ctx.stringValue("ListEmrHiveDatabasesResponse.RequestId"));
		listEmrHiveDatabasesResponse.setErrorCode(_ctx.stringValue("ListEmrHiveDatabasesResponse.ErrorCode"));
		listEmrHiveDatabasesResponse.setErrorMessage(_ctx.stringValue("ListEmrHiveDatabasesResponse.ErrorMessage"));

		List<HiveDatabase> data = new ArrayList<HiveDatabase>();
		for (int i = 0; i < _ctx.lengthValue("ListEmrHiveDatabasesResponse.Data.Length"); i++) {
			HiveDatabase hiveDatabase = new HiveDatabase();
			hiveDatabase.setName(_ctx.stringValue("ListEmrHiveDatabasesResponse.Data["+ i +"].Name"));
			hiveDatabase.setType(_ctx.stringValue("ListEmrHiveDatabasesResponse.Data["+ i +"].Type"));
			hiveDatabase.setOwner(_ctx.stringValue("ListEmrHiveDatabasesResponse.Data["+ i +"].Owner"));
			hiveDatabase.setOwnerId(_ctx.stringValue("ListEmrHiveDatabasesResponse.Data["+ i +"].OwnerId"));
			hiveDatabase.setComment(_ctx.stringValue("ListEmrHiveDatabasesResponse.Data["+ i +"].Comment"));
			hiveDatabase.setLocation(_ctx.stringValue("ListEmrHiveDatabasesResponse.Data["+ i +"].Location"));
			hiveDatabase.setStatus(_ctx.stringValue("ListEmrHiveDatabasesResponse.Data["+ i +"].Status"));
			hiveDatabase.setParameters(_ctx.stringValue("ListEmrHiveDatabasesResponse.Data["+ i +"].Parameters"));
			hiveDatabase.setGmtCreate(_ctx.longValue("ListEmrHiveDatabasesResponse.Data["+ i +"].GmtCreate"));
			hiveDatabase.setGmtModified(_ctx.longValue("ListEmrHiveDatabasesResponse.Data["+ i +"].GmtModified"));
			hiveDatabase.setOwnerType(_ctx.stringValue("ListEmrHiveDatabasesResponse.Data["+ i +"].OwnerType"));
			hiveDatabase.setRegion(_ctx.stringValue("ListEmrHiveDatabasesResponse.Data["+ i +"].Region"));

			data.add(hiveDatabase);
		}
		listEmrHiveDatabasesResponse.setData(data);
	 
	 	return listEmrHiveDatabasesResponse;
	}
}