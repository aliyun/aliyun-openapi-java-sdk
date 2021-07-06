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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListDataCorrectPreCheckDBResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDataCorrectPreCheckDBResponse.PreCheckDB;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataCorrectPreCheckDBResponseUnmarshaller {

	public static ListDataCorrectPreCheckDBResponse unmarshall(ListDataCorrectPreCheckDBResponse listDataCorrectPreCheckDBResponse, UnmarshallerContext _ctx) {
		
		listDataCorrectPreCheckDBResponse.setRequestId(_ctx.stringValue("ListDataCorrectPreCheckDBResponse.RequestId"));
		listDataCorrectPreCheckDBResponse.setSuccess(_ctx.booleanValue("ListDataCorrectPreCheckDBResponse.Success"));
		listDataCorrectPreCheckDBResponse.setErrorMessage(_ctx.stringValue("ListDataCorrectPreCheckDBResponse.ErrorMessage"));
		listDataCorrectPreCheckDBResponse.setErrorCode(_ctx.stringValue("ListDataCorrectPreCheckDBResponse.ErrorCode"));

		List<PreCheckDB> preCheckDBList = new ArrayList<PreCheckDB>();
		for (int i = 0; i < _ctx.lengthValue("ListDataCorrectPreCheckDBResponse.PreCheckDBList.Length"); i++) {
			PreCheckDB preCheckDB = new PreCheckDB();
			preCheckDB.setDbId(_ctx.longValue("ListDataCorrectPreCheckDBResponse.PreCheckDBList["+ i +"].DbId"));
			preCheckDB.setSearchName(_ctx.stringValue("ListDataCorrectPreCheckDBResponse.PreCheckDBList["+ i +"].SearchName"));
			preCheckDB.setSqlNum(_ctx.longValue("ListDataCorrectPreCheckDBResponse.PreCheckDBList["+ i +"].SqlNum"));

			preCheckDBList.add(preCheckDB);
		}
		listDataCorrectPreCheckDBResponse.setPreCheckDBList(preCheckDBList);
	 
	 	return listDataCorrectPreCheckDBResponse;
	}
}