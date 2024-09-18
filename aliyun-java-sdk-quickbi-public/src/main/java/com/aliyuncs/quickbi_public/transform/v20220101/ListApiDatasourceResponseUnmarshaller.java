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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.ListApiDatasourceResponse;
import com.aliyuncs.quickbi_public.model.v20220101.ListApiDatasourceResponse.Result;
import com.aliyuncs.quickbi_public.model.v20220101.ListApiDatasourceResponse.Result.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApiDatasourceResponseUnmarshaller {

	public static ListApiDatasourceResponse unmarshall(ListApiDatasourceResponse listApiDatasourceResponse, UnmarshallerContext _ctx) {
		
		listApiDatasourceResponse.setRequestId(_ctx.stringValue("ListApiDatasourceResponse.RequestId"));
		listApiDatasourceResponse.setSuccess(_ctx.booleanValue("ListApiDatasourceResponse.Success"));

		Result result = new Result();
		result.setPageNum(_ctx.integerValue("ListApiDatasourceResponse.Result.PageNum"));
		result.setPageSize(_ctx.integerValue("ListApiDatasourceResponse.Result.PageSize"));
		result.setTotalNum(_ctx.integerValue("ListApiDatasourceResponse.Result.TotalNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListApiDatasourceResponse.Result.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setApiId(_ctx.stringValue("ListApiDatasourceResponse.Result.Data["+ i +"].ApiId"));
			dataItem.setBody(_ctx.stringValue("ListApiDatasourceResponse.Result.Data["+ i +"].Body"));
			dataItem.setDataSize(_ctx.floatValue("ListApiDatasourceResponse.Result.Data["+ i +"].DataSize"));
			dataItem.setDateUpdateTime(_ctx.stringValue("ListApiDatasourceResponse.Result.Data["+ i +"].DateUpdateTime"));
			dataItem.setGmtCreate(_ctx.stringValue("ListApiDatasourceResponse.Result.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListApiDatasourceResponse.Result.Data["+ i +"].GmtModified"));
			dataItem.setJobId(_ctx.stringValue("ListApiDatasourceResponse.Result.Data["+ i +"].JobId"));
			dataItem.setParameters(_ctx.stringValue("ListApiDatasourceResponse.Result.Data["+ i +"].Parameters"));
			dataItem.setShowName(_ctx.stringValue("ListApiDatasourceResponse.Result.Data["+ i +"].ShowName"));
			dataItem.setStatusType(_ctx.integerValue("ListApiDatasourceResponse.Result.Data["+ i +"].StatusType"));

			data.add(dataItem);
		}
		result.setData(data);
		listApiDatasourceResponse.setResult(result);
	 
	 	return listApiDatasourceResponse;
	}
}