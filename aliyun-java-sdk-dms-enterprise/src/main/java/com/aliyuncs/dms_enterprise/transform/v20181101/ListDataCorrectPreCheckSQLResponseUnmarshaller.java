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

import com.aliyuncs.dms_enterprise.model.v20181101.ListDataCorrectPreCheckSQLResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDataCorrectPreCheckSQLResponse.PreCheckSQL;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataCorrectPreCheckSQLResponseUnmarshaller {

	public static ListDataCorrectPreCheckSQLResponse unmarshall(ListDataCorrectPreCheckSQLResponse listDataCorrectPreCheckSQLResponse, UnmarshallerContext _ctx) {
		
		listDataCorrectPreCheckSQLResponse.setRequestId(_ctx.stringValue("ListDataCorrectPreCheckSQLResponse.RequestId"));
		listDataCorrectPreCheckSQLResponse.setSuccess(_ctx.booleanValue("ListDataCorrectPreCheckSQLResponse.Success"));
		listDataCorrectPreCheckSQLResponse.setErrorMessage(_ctx.stringValue("ListDataCorrectPreCheckSQLResponse.ErrorMessage"));
		listDataCorrectPreCheckSQLResponse.setErrorCode(_ctx.stringValue("ListDataCorrectPreCheckSQLResponse.ErrorCode"));

		List<PreCheckSQL> preCheckSQLList = new ArrayList<PreCheckSQL>();
		for (int i = 0; i < _ctx.lengthValue("ListDataCorrectPreCheckSQLResponse.PreCheckSQLList.Length"); i++) {
			PreCheckSQL preCheckSQL = new PreCheckSQL();
			preCheckSQL.setCheckSQL(_ctx.stringValue("ListDataCorrectPreCheckSQLResponse.PreCheckSQLList["+ i +"].CheckSQL"));
			preCheckSQL.setAffectRows(_ctx.longValue("ListDataCorrectPreCheckSQLResponse.PreCheckSQLList["+ i +"].AffectRows"));
			preCheckSQL.setDbId(_ctx.longValue("ListDataCorrectPreCheckSQLResponse.PreCheckSQLList["+ i +"].DbId"));
			preCheckSQL.setSQLReviewQueryKey(_ctx.stringValue("ListDataCorrectPreCheckSQLResponse.PreCheckSQLList["+ i +"].SQLReviewQueryKey"));
			preCheckSQL.setSqlReviewStatus(_ctx.stringValue("ListDataCorrectPreCheckSQLResponse.PreCheckSQLList["+ i +"].SqlReviewStatus"));
			preCheckSQL.setSqlType(_ctx.stringValue("ListDataCorrectPreCheckSQLResponse.PreCheckSQLList["+ i +"].SqlType"));

			preCheckSQLList.add(preCheckSQL);
		}
		listDataCorrectPreCheckSQLResponse.setPreCheckSQLList(preCheckSQLList);
	 
	 	return listDataCorrectPreCheckSQLResponse;
	}
}