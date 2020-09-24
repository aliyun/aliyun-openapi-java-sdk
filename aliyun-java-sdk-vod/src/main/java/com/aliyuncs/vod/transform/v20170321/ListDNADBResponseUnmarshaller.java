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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListDNADBResponse;
import com.aliyuncs.vod.model.v20170321.ListDNADBResponse.DNADB;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDNADBResponseUnmarshaller {

	public static ListDNADBResponse unmarshall(ListDNADBResponse listDNADBResponse, UnmarshallerContext _ctx) {
		
		listDNADBResponse.setRequestId(_ctx.stringValue("ListDNADBResponse.RequestId"));

		List<DNADB> dNADBList = new ArrayList<DNADB>();
		for (int i = 0; i < _ctx.lengthValue("ListDNADBResponse.DNADBList.Length"); i++) {
			DNADB dNADB = new DNADB();
			dNADB.setDBId(_ctx.stringValue("ListDNADBResponse.DNADBList["+ i +"].DBId"));
			dNADB.setStatus(_ctx.stringValue("ListDNADBResponse.DNADBList["+ i +"].Status"));
			dNADB.setDBDescription(_ctx.stringValue("ListDNADBResponse.DNADBList["+ i +"].DBDescription"));
			dNADB.setDBType(_ctx.stringValue("ListDNADBResponse.DNADBList["+ i +"].DBType"));
			dNADB.setDBName(_ctx.stringValue("ListDNADBResponse.DNADBList["+ i +"].DBName"));
			dNADB.setDBRegion(_ctx.stringValue("ListDNADBResponse.DNADBList["+ i +"].DBRegion"));

			dNADBList.add(dNADB);
		}
		listDNADBResponse.setDNADBList(dNADBList);
	 
	 	return listDNADBResponse;
	}
}