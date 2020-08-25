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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryCASSlsLogResponse;
import com.aliyuncs.sofa.model.v20190815.QueryCASSlsLogResponse.DataItem;
import com.aliyuncs.sofa.model.v20190815.QueryCASSlsLogResponse.DataItem.ContentsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCASSlsLogResponseUnmarshaller {

	public static QueryCASSlsLogResponse unmarshall(QueryCASSlsLogResponse queryCASSlsLogResponse, UnmarshallerContext _ctx) {
		
		queryCASSlsLogResponse.setRequestId(_ctx.stringValue("QueryCASSlsLogResponse.RequestId"));
		queryCASSlsLogResponse.setResultCode(_ctx.stringValue("QueryCASSlsLogResponse.ResultCode"));
		queryCASSlsLogResponse.setResultMessage(_ctx.stringValue("QueryCASSlsLogResponse.ResultMessage"));
		queryCASSlsLogResponse.setPageNum(_ctx.longValue("QueryCASSlsLogResponse.PageNum"));
		queryCASSlsLogResponse.setPageSize(_ctx.longValue("QueryCASSlsLogResponse.PageSize"));
		queryCASSlsLogResponse.setTotal(_ctx.longValue("QueryCASSlsLogResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryCASSlsLogResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setLogTime(_ctx.longValue("QueryCASSlsLogResponse.Data["+ i +"].LogTime"));
			dataItem.setSource(_ctx.stringValue("QueryCASSlsLogResponse.Data["+ i +"].Source"));

			List<ContentsItem> contents = new ArrayList<ContentsItem>();
			for (int j = 0; j < _ctx.lengthValue("QueryCASSlsLogResponse.Data["+ i +"].Contents.Length"); j++) {
				ContentsItem contentsItem = new ContentsItem();
				contentsItem.setKey(_ctx.stringValue("QueryCASSlsLogResponse.Data["+ i +"].Contents["+ j +"].Key"));
				contentsItem.setValue(_ctx.stringValue("QueryCASSlsLogResponse.Data["+ i +"].Contents["+ j +"].Value"));

				contents.add(contentsItem);
			}
			dataItem.setContents(contents);

			data.add(dataItem);
		}
		queryCASSlsLogResponse.setData(data);
	 
	 	return queryCASSlsLogResponse;
	}
}