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

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSampleSqlRawTextsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeSampleSqlRawTextsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSampleSqlRawTextsResponseUnmarshaller {

	public static DescribeSampleSqlRawTextsResponse unmarshall(DescribeSampleSqlRawTextsResponse describeSampleSqlRawTextsResponse, UnmarshallerContext _ctx) {
		
		describeSampleSqlRawTextsResponse.setRequestId(_ctx.stringValue("DescribeSampleSqlRawTextsResponse.RequestId"));

		Data data = new Data();

		List<String> sqlText = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSampleSqlRawTextsResponse.Data.SqlText.Length"); i++) {
			sqlText.add(_ctx.stringValue("DescribeSampleSqlRawTextsResponse.Data.SqlText["+ i +"]"));
		}
		data.setSqlText(sqlText);
		describeSampleSqlRawTextsResponse.setData(data);
	 
	 	return describeSampleSqlRawTextsResponse;
	}
}