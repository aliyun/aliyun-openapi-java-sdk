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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListPersistentVolumeClaimResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListPersistentVolumeClaimResponse.ListPersistentVolumeClaimResponse1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersistentVolumeClaimResponseUnmarshaller {

	public static ListPersistentVolumeClaimResponse unmarshall(ListPersistentVolumeClaimResponse listPersistentVolumeClaimResponse, UnmarshallerContext _ctx) {
		
		listPersistentVolumeClaimResponse.setRequestId(_ctx.stringValue("ListPersistentVolumeClaimResponse.RequestId"));
		listPersistentVolumeClaimResponse.setCode(_ctx.integerValue("ListPersistentVolumeClaimResponse.Code"));
		listPersistentVolumeClaimResponse.setPageNumber(_ctx.integerValue("ListPersistentVolumeClaimResponse.PageNumber"));
		listPersistentVolumeClaimResponse.setPageSize(_ctx.integerValue("ListPersistentVolumeClaimResponse.PageSize"));
		listPersistentVolumeClaimResponse.setTotalCount(_ctx.longValue("ListPersistentVolumeClaimResponse.TotalCount"));
		listPersistentVolumeClaimResponse.setErrorMsg(_ctx.stringValue("ListPersistentVolumeClaimResponse.ErrorMsg"));

		List<ListPersistentVolumeClaimResponse1> data = new ArrayList<ListPersistentVolumeClaimResponse1>();
		for (int i = 0; i < _ctx.lengthValue("ListPersistentVolumeClaimResponse.Data.Length"); i++) {
			ListPersistentVolumeClaimResponse1 listPersistentVolumeClaimResponse1 = new ListPersistentVolumeClaimResponse1();
			listPersistentVolumeClaimResponse1.setName(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].Name"));
			listPersistentVolumeClaimResponse1.setCapacity(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].Capacity"));
			listPersistentVolumeClaimResponse1.setAccessModes(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].AccessModes"));
			listPersistentVolumeClaimResponse1.setStatus(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].Status"));
			listPersistentVolumeClaimResponse1.setStorageClass(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].StorageClass"));
			listPersistentVolumeClaimResponse1.setVolumeName(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].VolumeName"));
			listPersistentVolumeClaimResponse1.setCreateTime(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].CreateTime"));

			data.add(listPersistentVolumeClaimResponse1);
		}
		listPersistentVolumeClaimResponse.setData(data);
	 
	 	return listPersistentVolumeClaimResponse;
	}
}