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

package com.aliyuncs.itag.transform.v20210517;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.itag.model.v20210517.PageViewDataMetaResponse;
import com.aliyuncs.itag.model.v20210517.PageViewDataMetaResponse.Result;
import com.aliyuncs.itag.model.v20210517.PageViewDataMetaResponse.Result.ListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class PageViewDataMetaResponseUnmarshaller {

	public static PageViewDataMetaResponse unmarshall(PageViewDataMetaResponse pageViewDataMetaResponse, UnmarshallerContext _ctx) {
		
		pageViewDataMetaResponse.setRequestId(_ctx.stringValue("PageViewDataMetaResponse.RequestId"));
		pageViewDataMetaResponse.setCode(_ctx.stringValue("PageViewDataMetaResponse.Code"));
		pageViewDataMetaResponse.setErrInfo(_ctx.stringValue("PageViewDataMetaResponse.ErrInfo"));
		pageViewDataMetaResponse.setMsg(_ctx.stringValue("PageViewDataMetaResponse.Msg"));
		pageViewDataMetaResponse.setSucc(_ctx.booleanValue("PageViewDataMetaResponse.Succ"));
		pageViewDataMetaResponse.setErrorCode(_ctx.stringValue("PageViewDataMetaResponse.ErrorCode"));

		Result result = new Result();
		result.setPageNum(_ctx.longValue("PageViewDataMetaResponse.Result.PageNum"));
		result.setPageSize(_ctx.longValue("PageViewDataMetaResponse.Result.PageSize"));
		result.setTotal(_ctx.longValue("PageViewDataMetaResponse.Result.Total"));
		result.setTotalPage(_ctx.longValue("PageViewDataMetaResponse.Result.TotalPage"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("PageViewDataMetaResponse.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setDatasetId(_ctx.stringValue("PageViewDataMetaResponse.Result.List["+ i +"].DatasetId"));
			listItem.setId(_ctx.stringValue("PageViewDataMetaResponse.Result.List["+ i +"].Id"));
			listItem.setOutDataId(_ctx.stringValue("PageViewDataMetaResponse.Result.List["+ i +"].OutDataId"));
			listItem.setOutGroupKey(_ctx.stringValue("PageViewDataMetaResponse.Result.List["+ i +"].OutGroupKey"));
			listItem.setBatchNo(_ctx.stringValue("PageViewDataMetaResponse.Result.List["+ i +"].BatchNo"));
			listItem.setMetaInfos(_ctx.mapValue("PageViewDataMetaResponse.Result.List["+ i +"].MetaInfos"));

			list.add(listItem);
		}
		result.setList(list);
		pageViewDataMetaResponse.setResult(result);
	 
	 	return pageViewDataMetaResponse;
	}
}