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

import com.aliyuncs.retailcloud.model.v20180313.ListPersistentVolumeResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListPersistentVolumeResponse.PersistentVolumeDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPersistentVolumeResponseUnmarshaller {

	public static ListPersistentVolumeResponse unmarshall(ListPersistentVolumeResponse listPersistentVolumeResponse, UnmarshallerContext _ctx) {
		
		listPersistentVolumeResponse.setRequestId(_ctx.stringValue("ListPersistentVolumeResponse.RequestId"));
		listPersistentVolumeResponse.setCode(_ctx.integerValue("ListPersistentVolumeResponse.Code"));
		listPersistentVolumeResponse.setPageSize(_ctx.integerValue("ListPersistentVolumeResponse.PageSize"));
		listPersistentVolumeResponse.setPageNumber(_ctx.integerValue("ListPersistentVolumeResponse.PageNumber"));
		listPersistentVolumeResponse.setTotalCount(_ctx.longValue("ListPersistentVolumeResponse.TotalCount"));
		listPersistentVolumeResponse.setErrMsg(_ctx.stringValue("ListPersistentVolumeResponse.ErrMsg"));

		List<PersistentVolumeDetail> data = new ArrayList<PersistentVolumeDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListPersistentVolumeResponse.Data.Length"); i++) {
			PersistentVolumeDetail persistentVolumeDetail = new PersistentVolumeDetail();
			persistentVolumeDetail.setName(_ctx.stringValue("ListPersistentVolumeResponse.Data["+ i +"].Name"));
			persistentVolumeDetail.setCapacity(_ctx.stringValue("ListPersistentVolumeResponse.Data["+ i +"].Capacity"));
			persistentVolumeDetail.setAccessModes(_ctx.stringValue("ListPersistentVolumeResponse.Data["+ i +"].AccessModes"));
			persistentVolumeDetail.setReclaimPolicy(_ctx.stringValue("ListPersistentVolumeResponse.Data["+ i +"].ReclaimPolicy"));
			persistentVolumeDetail.setStatus(_ctx.stringValue("ListPersistentVolumeResponse.Data["+ i +"].Status"));
			persistentVolumeDetail.setPvcName(_ctx.stringValue("ListPersistentVolumeResponse.Data["+ i +"].PvcName"));
			persistentVolumeDetail.setMountDir(_ctx.stringValue("ListPersistentVolumeResponse.Data["+ i +"].MountDir"));
			persistentVolumeDetail.setStorageClass(_ctx.stringValue("ListPersistentVolumeResponse.Data["+ i +"].StorageClass"));
			persistentVolumeDetail.setReason(_ctx.stringValue("ListPersistentVolumeResponse.Data["+ i +"].Reason"));
			persistentVolumeDetail.setCreateTime(_ctx.stringValue("ListPersistentVolumeResponse.Data["+ i +"].CreateTime"));

			data.add(persistentVolumeDetail);
		}
		listPersistentVolumeResponse.setData(data);
	 
	 	return listPersistentVolumeResponse;
	}
}