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
import com.aliyuncs.retailcloud.model.v20180313.ListPersistentVolumeClaimResponse.PersistentVolumeClaimDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersistentVolumeClaimResponseUnmarshaller {

	public static ListPersistentVolumeClaimResponse unmarshall(ListPersistentVolumeClaimResponse listPersistentVolumeClaimResponse, UnmarshallerContext _ctx) {
		
		listPersistentVolumeClaimResponse.setRequestId(_ctx.stringValue("ListPersistentVolumeClaimResponse.RequestId"));
		listPersistentVolumeClaimResponse.setCode(_ctx.integerValue("ListPersistentVolumeClaimResponse.Code"));
		listPersistentVolumeClaimResponse.setPageNumber(_ctx.integerValue("ListPersistentVolumeClaimResponse.PageNumber"));
		listPersistentVolumeClaimResponse.setPageSize(_ctx.integerValue("ListPersistentVolumeClaimResponse.PageSize"));
		listPersistentVolumeClaimResponse.setTotalCount(_ctx.longValue("ListPersistentVolumeClaimResponse.TotalCount"));
		listPersistentVolumeClaimResponse.setErrorMsg(_ctx.stringValue("ListPersistentVolumeClaimResponse.ErrorMsg"));

		List<PersistentVolumeClaimDetail> data = new ArrayList<PersistentVolumeClaimDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListPersistentVolumeClaimResponse.Data.Length"); i++) {
			PersistentVolumeClaimDetail persistentVolumeClaimDetail = new PersistentVolumeClaimDetail();
			persistentVolumeClaimDetail.setName(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].Name"));
			persistentVolumeClaimDetail.setCapacity(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].Capacity"));
			persistentVolumeClaimDetail.setAccessModes(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].AccessModes"));
			persistentVolumeClaimDetail.setStatus(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].Status"));
			persistentVolumeClaimDetail.setStorageClass(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].StorageClass"));
			persistentVolumeClaimDetail.setVolumeName(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].VolumeName"));
			persistentVolumeClaimDetail.setCreateTime(_ctx.stringValue("ListPersistentVolumeClaimResponse.Data["+ i +"].CreateTime"));

			data.add(persistentVolumeClaimDetail);
		}
		listPersistentVolumeClaimResponse.setData(data);
	 
	 	return listPersistentVolumeClaimResponse;
	}
}