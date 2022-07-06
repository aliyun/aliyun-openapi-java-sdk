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

import com.aliyuncs.airec.model.v20201126.ListExtraDataSourcesResponse;
import com.aliyuncs.airec.model.v20201126.ListExtraDataSourcesResponse.ResultItem;
import com.aliyuncs.airec.model.v20201126.ListExtraDataSourcesResponse.ResultItem.Meta;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExtraDataSourcesResponseUnmarshaller {

	public static ListExtraDataSourcesResponse unmarshall(ListExtraDataSourcesResponse listExtraDataSourcesResponse, UnmarshallerContext _ctx) {
		
		listExtraDataSourcesResponse.setRequestId(_ctx.stringValue("ListExtraDataSourcesResponse.requestId"));

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExtraDataSourcesResponse.result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setStatus(_ctx.stringValue("ListExtraDataSourcesResponse.result["+ i +"].Status"));
			resultItem.setType(_ctx.stringValue("ListExtraDataSourcesResponse.result["+ i +"].Type"));
			resultItem.setGmtCreate(_ctx.stringValue("ListExtraDataSourcesResponse.result["+ i +"].GmtCreate"));
			resultItem.setGmtModified(_ctx.stringValue("ListExtraDataSourcesResponse.result["+ i +"].GmtModified"));
			resultItem.setDataSourceId(_ctx.stringValue("ListExtraDataSourcesResponse.result["+ i +"].DataSourceId"));

			Meta meta = new Meta();
			meta.setInternal(_ctx.booleanValue("ListExtraDataSourcesResponse.result["+ i +"].Meta.Internal"));
			meta.setMetaType(_ctx.stringValue("ListExtraDataSourcesResponse.result["+ i +"].Meta.MetaType"));
			meta.setProjectName(_ctx.stringValue("ListExtraDataSourcesResponse.result["+ i +"].Meta.ProjectName"));
			meta.setTableName(_ctx.stringValue("ListExtraDataSourcesResponse.result["+ i +"].Meta.TableName"));
			meta.setType(_ctx.stringValue("ListExtraDataSourcesResponse.result["+ i +"].Meta.Type"));
			meta.setUpdateFrequency(_ctx.longValue("ListExtraDataSourcesResponse.result["+ i +"].Meta.UpdateFrequency"));
			resultItem.setMeta(meta);

			result.add(resultItem);
		}
		listExtraDataSourcesResponse.setResult(result);
	 
	 	return listExtraDataSourcesResponse;
	}
}