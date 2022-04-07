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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableListByCategoryResponse;
import com.aliyuncs.dataworks_public.model.v20200518.GetMetaTableListByCategoryResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMetaTableListByCategoryResponseUnmarshaller {

	public static GetMetaTableListByCategoryResponse unmarshall(GetMetaTableListByCategoryResponse getMetaTableListByCategoryResponse, UnmarshallerContext _ctx) {
		
		getMetaTableListByCategoryResponse.setRequestId(_ctx.stringValue("GetMetaTableListByCategoryResponse.RequestId"));
		getMetaTableListByCategoryResponse.setHttpStatusCode(_ctx.integerValue("GetMetaTableListByCategoryResponse.HttpStatusCode"));
		getMetaTableListByCategoryResponse.setErrorMessage(_ctx.stringValue("GetMetaTableListByCategoryResponse.ErrorMessage"));
		getMetaTableListByCategoryResponse.setSuccess(_ctx.booleanValue("GetMetaTableListByCategoryResponse.Success"));
		getMetaTableListByCategoryResponse.setErrorCode(_ctx.stringValue("GetMetaTableListByCategoryResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("GetMetaTableListByCategoryResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("GetMetaTableListByCategoryResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("GetMetaTableListByCategoryResponse.Data.TotalCount"));

		List<String> tableGuidList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetMetaTableListByCategoryResponse.Data.TableGuidList.Length"); i++) {
			tableGuidList.add(_ctx.stringValue("GetMetaTableListByCategoryResponse.Data.TableGuidList["+ i +"]"));
		}
		data.setTableGuidList(tableGuidList);
		getMetaTableListByCategoryResponse.setData(data);
	 
	 	return getMetaTableListByCategoryResponse;
	}
}