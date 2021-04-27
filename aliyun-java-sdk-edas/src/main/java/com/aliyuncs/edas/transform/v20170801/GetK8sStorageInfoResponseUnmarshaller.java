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

package com.aliyuncs.edas.transform.v20170801;

import com.aliyuncs.edas.model.v20170801.GetK8sStorageInfoResponse;
import com.aliyuncs.edas.model.v20170801.GetK8sStorageInfoResponse.StorageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetK8sStorageInfoResponseUnmarshaller {

	public static GetK8sStorageInfoResponse unmarshall(GetK8sStorageInfoResponse getK8sStorageInfoResponse, UnmarshallerContext _ctx) {
		
		getK8sStorageInfoResponse.setRequestId(_ctx.stringValue("GetK8sStorageInfoResponse.RequestId"));
		getK8sStorageInfoResponse.setCode(_ctx.integerValue("GetK8sStorageInfoResponse.Code"));
		getK8sStorageInfoResponse.setMessage(_ctx.stringValue("GetK8sStorageInfoResponse.Message"));

		StorageInfo storageInfo = new StorageInfo();
		storageInfo.setVolumePlugin(_ctx.stringValue("GetK8sStorageInfoResponse.StorageInfo.VolumePlugin"));
		getK8sStorageInfoResponse.setStorageInfo(storageInfo);
	 
	 	return getK8sStorageInfoResponse;
	}
}