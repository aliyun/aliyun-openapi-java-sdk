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

package com.aliyuncs.linkcard.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkcard.model.v20210520.ListDirectionalDetailResponse;
import com.aliyuncs.linkcard.model.v20210520.ListDirectionalDetailResponse.Data;
import com.aliyuncs.linkcard.model.v20210520.ListDirectionalDetailResponse.Data.PaginationResult;
import com.aliyuncs.linkcard.model.v20210520.ListDirectionalDetailResponse.Data.PaginationResult.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDirectionalDetailResponseUnmarshaller {

	public static ListDirectionalDetailResponse unmarshall(ListDirectionalDetailResponse listDirectionalDetailResponse, UnmarshallerContext _ctx) {
		
		listDirectionalDetailResponse.setRequestId(_ctx.stringValue("ListDirectionalDetailResponse.RequestId"));
		listDirectionalDetailResponse.setSuccess(_ctx.booleanValue("ListDirectionalDetailResponse.Success"));
		listDirectionalDetailResponse.setCode(_ctx.stringValue("ListDirectionalDetailResponse.Code"));
		listDirectionalDetailResponse.setErrorMessage(_ctx.stringValue("ListDirectionalDetailResponse.ErrorMessage"));
		listDirectionalDetailResponse.setLocalizedMessage(_ctx.stringValue("ListDirectionalDetailResponse.LocalizedMessage"));

		Data data = new Data();
		data.setDirectionalGroupId(_ctx.longValue("ListDirectionalDetailResponse.Data.DirectionalGroupId"));
		data.setDirectionalName(_ctx.stringValue("ListDirectionalDetailResponse.Data.DirectionalName"));

		PaginationResult paginationResult = new PaginationResult();
		paginationResult.setPageNo(_ctx.integerValue("ListDirectionalDetailResponse.Data.PaginationResult.PageNo"));
		paginationResult.setPageSize(_ctx.integerValue("ListDirectionalDetailResponse.Data.PaginationResult.PageSize"));
		paginationResult.setTotal(_ctx.integerValue("ListDirectionalDetailResponse.Data.PaginationResult.Total"));
		paginationResult.setPageCount(_ctx.integerValue("ListDirectionalDetailResponse.Data.PaginationResult.PageCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDirectionalDetailResponse.Data.PaginationResult.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setGroupId(_ctx.stringValue("ListDirectionalDetailResponse.Data.PaginationResult.List["+ i +"].GroupId"));
			listItem.setAddress(_ctx.stringValue("ListDirectionalDetailResponse.Data.PaginationResult.List["+ i +"].Address"));
			listItem.setSource(_ctx.stringValue("ListDirectionalDetailResponse.Data.PaginationResult.List["+ i +"].Source"));
			listItem.setAddressType(_ctx.stringValue("ListDirectionalDetailResponse.Data.PaginationResult.List["+ i +"].AddressType"));
			listItem.setState(_ctx.stringValue("ListDirectionalDetailResponse.Data.PaginationResult.List["+ i +"].State"));

			list.add(listItem);
		}
		paginationResult.setList(list);
		data.setPaginationResult(paginationResult);
		listDirectionalDetailResponse.setData(data);
	 
	 	return listDirectionalDetailResponse;
	}
}