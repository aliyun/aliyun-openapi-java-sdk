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

package com.aliyuncs.opensearch.transform.v20171225;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.opensearch.model.v20171225.ValidateDataSourcesResponse;
import com.aliyuncs.opensearch.model.v20171225.ValidateDataSourcesResponse.ResultItem;
import com.aliyuncs.opensearch.model.v20171225.ValidateDataSourcesResponse.ResultItem.DataSource;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ValidateDataSourcesResponseUnmarshaller {

	public static ValidateDataSourcesResponse unmarshall(ValidateDataSourcesResponse validateDataSourcesResponse, UnmarshallerContext _ctx) {
		
		validateDataSourcesResponse.setRequestId(_ctx.stringValue("ValidateDataSourcesResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ValidateDataSourcesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCode(_ctx.stringValue("ValidateDataSourcesResponse.result["+ i +"].code"));
			resultItem.setMessage(_ctx.stringValue("ValidateDataSourcesResponse.result["+ i +"].message"));

			DataSource dataSource = new DataSource();
			dataSource.setTableName(_ctx.stringValue("ValidateDataSourcesResponse.result["+ i +"].dataSource.tableName"));
			dataSource.setType(_ctx.stringValue("ValidateDataSourcesResponse.result["+ i +"].dataSource.type"));
			dataSource.setParameters(_ctx.mapValue("ValidateDataSourcesResponse.result["+ i +"].dataSource.parameters"));
			resultItem.setDataSource(dataSource);

			result.add(resultItem);
		}
		validateDataSourcesResponse.setResult(result);
	 
	 	return validateDataSourcesResponse;
	}
}