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

import com.aliyuncs.linkcard.model.v20210520.ListDirectionalAddressResponse;
import com.aliyuncs.linkcard.model.v20210520.ListDirectionalAddressResponse.Data;
import com.aliyuncs.linkcard.model.v20210520.ListDirectionalAddressResponse.Data.UnityPayPool;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDirectionalAddressResponseUnmarshaller {

	public static ListDirectionalAddressResponse unmarshall(ListDirectionalAddressResponse listDirectionalAddressResponse, UnmarshallerContext _ctx) {
		
		listDirectionalAddressResponse.setRequestId(_ctx.stringValue("ListDirectionalAddressResponse.RequestId"));
		listDirectionalAddressResponse.setCode(_ctx.stringValue("ListDirectionalAddressResponse.Code"));
		listDirectionalAddressResponse.setErrorMessage(_ctx.stringValue("ListDirectionalAddressResponse.ErrorMessage"));
		listDirectionalAddressResponse.setSuccess(_ctx.booleanValue("ListDirectionalAddressResponse.Success"));
		listDirectionalAddressResponse.setLocalizedMessage(_ctx.stringValue("ListDirectionalAddressResponse.LocalizedMessage"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListDirectionalAddressResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListDirectionalAddressResponse.Data.PageSize"));
		data.setPageCount(_ctx.integerValue("ListDirectionalAddressResponse.Data.PageCount"));
		data.setTotal(_ctx.integerValue("ListDirectionalAddressResponse.Data.Total"));

		List<UnityPayPool> list = new ArrayList<UnityPayPool>();
		for (int i = 0; i < _ctx.lengthValue("ListDirectionalAddressResponse.Data.List.Length"); i++) {
			UnityPayPool unityPayPool = new UnityPayPool();
			unityPayPool.setAddress(_ctx.stringValue("ListDirectionalAddressResponse.Data.List["+ i +"].Address"));
			unityPayPool.setAddressType(_ctx.stringValue("ListDirectionalAddressResponse.Data.List["+ i +"].AddressType"));
			unityPayPool.setSource(_ctx.stringValue("ListDirectionalAddressResponse.Data.List["+ i +"].Source"));
			unityPayPool.setGroupId(_ctx.stringValue("ListDirectionalAddressResponse.Data.List["+ i +"].GroupId"));
			unityPayPool.setState(_ctx.integerValue("ListDirectionalAddressResponse.Data.List["+ i +"].State"));

			list.add(unityPayPool);
		}
		data.setList(list);
		listDirectionalAddressResponse.setData(data);
	 
	 	return listDirectionalAddressResponse;
	}
}