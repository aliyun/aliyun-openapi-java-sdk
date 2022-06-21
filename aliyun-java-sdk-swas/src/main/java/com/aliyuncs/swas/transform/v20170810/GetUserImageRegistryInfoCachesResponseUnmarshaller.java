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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetUserImageRegistryInfoCachesResponse;
import com.aliyuncs.swas.model.v20170810.GetUserImageRegistryInfoCachesResponse.ImageRegistryInfoCache;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserImageRegistryInfoCachesResponseUnmarshaller {

	public static GetUserImageRegistryInfoCachesResponse unmarshall(GetUserImageRegistryInfoCachesResponse getUserImageRegistryInfoCachesResponse, UnmarshallerContext _ctx) {
		
		getUserImageRegistryInfoCachesResponse.setRequestId(_ctx.stringValue("GetUserImageRegistryInfoCachesResponse.RequestId"));
		getUserImageRegistryInfoCachesResponse.setIsSuccess(_ctx.booleanValue("GetUserImageRegistryInfoCachesResponse.IsSuccess"));
		getUserImageRegistryInfoCachesResponse.setCode(_ctx.stringValue("GetUserImageRegistryInfoCachesResponse.Code"));

		List<ImageRegistryInfoCache> imageRegistryInfoCaches = new ArrayList<ImageRegistryInfoCache>();
		for (int i = 0; i < _ctx.lengthValue("GetUserImageRegistryInfoCachesResponse.ImageRegistryInfoCaches.Length"); i++) {
			ImageRegistryInfoCache imageRegistryInfoCache = new ImageRegistryInfoCache();
			imageRegistryInfoCache.setCacheName(_ctx.stringValue("GetUserImageRegistryInfoCachesResponse.ImageRegistryInfoCaches["+ i +"].CacheName"));
			imageRegistryInfoCache.setRegistry(_ctx.stringValue("GetUserImageRegistryInfoCachesResponse.ImageRegistryInfoCaches["+ i +"].Registry"));

			imageRegistryInfoCaches.add(imageRegistryInfoCache);
		}
		getUserImageRegistryInfoCachesResponse.setImageRegistryInfoCaches(imageRegistryInfoCaches);
	 
	 	return getUserImageRegistryInfoCachesResponse;
	}
}