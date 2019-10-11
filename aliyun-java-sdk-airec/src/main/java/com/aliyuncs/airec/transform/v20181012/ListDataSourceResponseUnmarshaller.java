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

package com.aliyuncs.airec.transform.v20181012;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.airec.model.v20181012.ListDataSourceResponse;
import com.aliyuncs.airec.model.v20181012.ListDataSourceResponse.ResultItem;
import com.aliyuncs.airec.model.v20181012.ListDataSourceResponse.ResultItem.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourceResponseUnmarshaller {

	public static ListDataSourceResponse unmarshall(ListDataSourceResponse listDataSourceResponse, UnmarshallerContext _ctx) {
		
		listDataSourceResponse.setRequestId(_ctx.stringValue("ListDataSourceResponse.RequestId"));
		listDataSourceResponse.setCode(_ctx.stringValue("ListDataSourceResponse.Code"));
		listDataSourceResponse.setMessage(_ctx.stringValue("ListDataSourceResponse.Message"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourceResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setTableName(_ctx.stringValue("ListDataSourceResponse.Result["+ i +"].TableName"));
			resultItem.setGmtCreate(_ctx.stringValue("ListDataSourceResponse.Result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListDataSourceResponse.Result["+ i +"].GmtModified"));

			Meta meta = new Meta();
			meta.setAccessKeyId(_ctx.stringValue("ListDataSourceResponse.Result["+ i +"].Meta.AccessKeyId"));
			meta.setProjectName(_ctx.stringValue("ListDataSourceResponse.Result["+ i +"].Meta.ProjectName"));
			meta.setTableName(_ctx.stringValue("ListDataSourceResponse.Result["+ i +"].Meta.TableName"));
			meta.setPartition(_ctx.stringValue("ListDataSourceResponse.Result["+ i +"].Meta.Partition"));
			meta.setTimestamp(_ctx.longValue("ListDataSourceResponse.Result["+ i +"].Meta.Timestamp"));
			meta.setBucketName(_ctx.stringValue("ListDataSourceResponse.Result["+ i +"].Meta.BucketName"));
			meta.setPath(_ctx.stringValue("ListDataSourceResponse.Result["+ i +"].Meta.Path"));
			meta.setType(_ctx.stringValue("ListDataSourceResponse.Result["+ i +"].Meta.Type"));
			resultItem.setMeta(meta);

			result.add(resultItem);
		}
		listDataSourceResponse.setResult(result);
	 
	 	return listDataSourceResponse;
	}
}