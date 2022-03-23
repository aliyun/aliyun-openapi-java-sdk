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

package com.aliyuncs.clickhouse.transform.v20191111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.clickhouse.model.v20191111.DescribeSynDbsResponse;
import com.aliyuncs.clickhouse.model.v20191111.DescribeSynDbsResponse.SynDb;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSynDbsResponseUnmarshaller {

	public static DescribeSynDbsResponse unmarshall(DescribeSynDbsResponse describeSynDbsResponse, UnmarshallerContext _ctx) {
		
		describeSynDbsResponse.setRequestId(_ctx.stringValue("DescribeSynDbsResponse.RequestId"));

		List<SynDb> synDbs = new ArrayList<SynDb>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSynDbsResponse.SynDbs.Length"); i++) {
			SynDb synDb = new SynDb();
			synDb.setRdsId(_ctx.stringValue("DescribeSynDbsResponse.SynDbs["+ i +"].RdsId"));
			synDb.setSynDb(_ctx.stringValue("DescribeSynDbsResponse.SynDbs["+ i +"].SynDb"));
			synDb.setSynStatus(_ctx.booleanValue("DescribeSynDbsResponse.SynDbs["+ i +"].SynStatus"));
			synDb.setErrorMsg(_ctx.stringValue("DescribeSynDbsResponse.SynDbs["+ i +"].ErrorMsg"));
			synDb.setRdsUserName(_ctx.stringValue("DescribeSynDbsResponse.SynDbs["+ i +"].RdsUserName"));
			synDb.setRdsPassword(_ctx.stringValue("DescribeSynDbsResponse.SynDbs["+ i +"].RdsPassword"));
			synDb.setRdsVpcUrl(_ctx.stringValue("DescribeSynDbsResponse.SynDbs["+ i +"].RdsVpcUrl"));

			synDbs.add(synDb);
		}
		describeSynDbsResponse.setSynDbs(synDbs);
	 
	 	return describeSynDbsResponse;
	}
}