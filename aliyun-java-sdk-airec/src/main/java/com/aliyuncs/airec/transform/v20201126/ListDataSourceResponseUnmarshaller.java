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

package com.aliyuncs.airec.transform.v20201126;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20201126.ListDataSourceResponse;
import com.aliyuncs.airec.model.v20201126.ListDataSourceResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListDataSourceResponse.ResultItem.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourceResponseUnmarshaller {

	public static ListDataSourceResponse unmarshall(ListDataSourceResponse listDataSourceResponse, UnmarshallerContext _ctx) {
		
		listDataSourceResponse.setCode(_ctx.stringValue("ListDataSourceResponse.code"));
		listDataSourceResponse.setMessage(_ctx.stringValue("ListDataSourceResponse.message"));
		listDataSourceResponse.setRequestId(_ctx.stringValue("ListDataSourceResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourceResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setGmtCreate(_ctx.stringValue("ListDataSourceResponse.result["+ i +"].gmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListDataSourceResponse.result["+ i +"].gmtModified"));
			resultItem.setTableName(_ctx.stringValue("ListDataSourceResponse.result["+ i +"].tableName"));

			Meta meta = new Meta();
			meta.setAccessKeyId(_ctx.stringValue("ListDataSourceResponse.result["+ i +"].meta.accessKeyId"));
			meta.setBucketName(_ctx.stringValue("ListDataSourceResponse.result["+ i +"].meta.bucketName"));
			meta.setPartition(_ctx.stringValue("ListDataSourceResponse.result["+ i +"].meta.partition"));
			meta.setPath(_ctx.stringValue("ListDataSourceResponse.result["+ i +"].meta.path"));
			meta.setProjectName(_ctx.stringValue("ListDataSourceResponse.result["+ i +"].meta.projectName"));
			meta.setTableName(_ctx.stringValue("ListDataSourceResponse.result["+ i +"].meta.tableName"));
			meta.setTimestamp(_ctx.longValue("ListDataSourceResponse.result["+ i +"].meta.timestamp"));
			meta.setType(_ctx.stringValue("ListDataSourceResponse.result["+ i +"].meta.type"));
			resultItem.setMeta(meta);

			result.add(resultItem);
		}
		listDataSourceResponse.setResult(result);
	 
	 	return listDataSourceResponse;
	}
}