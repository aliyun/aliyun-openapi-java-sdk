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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLDetailsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSQLDetailsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLDetailsResponseUnmarshaller {

	public static DescribeSQLDetailsResponse unmarshall(DescribeSQLDetailsResponse describeSQLDetailsResponse, UnmarshallerContext _ctx) {
		
		describeSQLDetailsResponse.setRequestId(_ctx.stringValue("DescribeSQLDetailsResponse.RequestId"));

		List<Data> sQLDetails = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSQLDetailsResponse.SQLDetails.Length"); i++) {
			Data data = new Data();
			data.setSQLText(_ctx.stringValue("DescribeSQLDetailsResponse.SQLDetails["+ i +"].SQLText"));
			data.setDbName(_ctx.stringValue("DescribeSQLDetailsResponse.SQLDetails["+ i +"].DbName"));
			data.setUserName(_ctx.stringValue("DescribeSQLDetailsResponse.SQLDetails["+ i +"].UserName"));

			sQLDetails.add(data);
		}
		describeSQLDetailsResponse.setSQLDetails(sQLDetails);
	 
	 	return describeSQLDetailsResponse;
	}
}