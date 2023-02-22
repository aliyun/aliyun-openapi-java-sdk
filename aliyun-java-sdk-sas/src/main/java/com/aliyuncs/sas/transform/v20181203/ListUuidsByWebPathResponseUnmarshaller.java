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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListUuidsByWebPathResponse;
import com.aliyuncs.sas.model.v20181203.ListUuidsByWebPathResponse.PageInfo;
import com.aliyuncs.sas.model.v20181203.ListUuidsByWebPathResponse.UuidInfoList;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUuidsByWebPathResponseUnmarshaller {

	public static ListUuidsByWebPathResponse unmarshall(ListUuidsByWebPathResponse listUuidsByWebPathResponse, UnmarshallerContext _ctx) {
		
		listUuidsByWebPathResponse.setRequestId(_ctx.stringValue("ListUuidsByWebPathResponse.RequestId"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setCurrentPage(_ctx.integerValue("ListUuidsByWebPathResponse.PageInfo.CurrentPage"));
		pageInfo.setPageSize(_ctx.integerValue("ListUuidsByWebPathResponse.PageInfo.PageSize"));
		pageInfo.setTotalCount(_ctx.integerValue("ListUuidsByWebPathResponse.PageInfo.TotalCount"));
		pageInfo.setCount(_ctx.integerValue("ListUuidsByWebPathResponse.PageInfo.Count"));
		listUuidsByWebPathResponse.setPageInfo(pageInfo);

		List<UuidInfoList> list = new ArrayList<UuidInfoList>();
		for (int i = 0; i < _ctx.lengthValue("ListUuidsByWebPathResponse.List.Length"); i++) {
			UuidInfoList uuidInfoList = new UuidInfoList();
			uuidInfoList.setUuid(_ctx.stringValue("ListUuidsByWebPathResponse.List["+ i +"].Uuid"));
			uuidInfoList.setInternetIp(_ctx.stringValue("ListUuidsByWebPathResponse.List["+ i +"].InternetIp"));
			uuidInfoList.setIntranetIp(_ctx.stringValue("ListUuidsByWebPathResponse.List["+ i +"].IntranetIp"));
			uuidInfoList.setMachineName(_ctx.stringValue("ListUuidsByWebPathResponse.List["+ i +"].MachineName"));

			list.add(uuidInfoList);
		}
		listUuidsByWebPathResponse.setList(list);
	 
	 	return listUuidsByWebPathResponse;
	}
}