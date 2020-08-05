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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListAppVersionsResponse;
import com.aliyuncs.sae.model.v20190506.ListAppVersionsResponse.PackageVersionEntity;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppVersionsResponseUnmarshaller {

	public static ListAppVersionsResponse unmarshall(ListAppVersionsResponse listAppVersionsResponse, UnmarshallerContext _ctx) {
		
		listAppVersionsResponse.setRequestId(_ctx.stringValue("ListAppVersionsResponse.RequestId"));
		listAppVersionsResponse.setCode(_ctx.stringValue("ListAppVersionsResponse.Code"));
		listAppVersionsResponse.setMessage(_ctx.stringValue("ListAppVersionsResponse.Message"));
		listAppVersionsResponse.setSuccess(_ctx.booleanValue("ListAppVersionsResponse.Success"));
		listAppVersionsResponse.setErrorCode(_ctx.stringValue("ListAppVersionsResponse.ErrorCode"));

		List<PackageVersionEntity> data = new ArrayList<PackageVersionEntity>();
		for (int i = 0; i < _ctx.lengthValue("ListAppVersionsResponse.Data.Length"); i++) {
			PackageVersionEntity packageVersionEntity = new PackageVersionEntity();
			packageVersionEntity.setId(_ctx.stringValue("ListAppVersionsResponse.Data["+ i +"].Id"));
			packageVersionEntity.setCreateTime(_ctx.stringValue("ListAppVersionsResponse.Data["+ i +"].CreateTime"));
			packageVersionEntity.setWarUrl(_ctx.stringValue("ListAppVersionsResponse.Data["+ i +"].WarUrl"));
			packageVersionEntity.setType(_ctx.stringValue("ListAppVersionsResponse.Data["+ i +"].Type"));
			packageVersionEntity.setBuildPackageUrl(_ctx.stringValue("ListAppVersionsResponse.Data["+ i +"].BuildPackageUrl"));

			data.add(packageVersionEntity);
		}
		listAppVersionsResponse.setData(data);
	 
	 	return listAppVersionsResponse;
	}
}